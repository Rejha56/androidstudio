// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewName = findViewById<TextView>(.id.textViewName)
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        val textViewJurusan = findViewById<TextView>(R.id.textViewJurusan)
        val textViewSemester = findViewById<TextView>(R.id.textViewSemester)

        val name = "Rejha Kurniawan"
        val email = "rejakurniawan599@gmai.com"
        val jurusan = "tambang"
        val semester = "Semester 3"

        textViewName.text = name
        textViewEmail.text = email
        textViewJurusan.text = jurusan
        textViewSemester.text = semester
    }
}
