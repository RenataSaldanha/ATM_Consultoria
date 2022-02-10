package curso.androidkotlin.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_contato.setOnClickListener {

            Toast.makeText(this, "Contato foi clicado", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }
        btn_servicos.setOnClickListener {
            val intent = Intent(this, DetalheServicosActivity::class.java)
            startActivity(intent)
        }
        btn_empresa.setOnClickListener {
            val intent = Intent(this, DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }
        btn_clientes.setOnClickListener {
            val intent = Intent(this, DetalheClientesActivity::class.java)
            startActivity(intent)
        }

    }
}