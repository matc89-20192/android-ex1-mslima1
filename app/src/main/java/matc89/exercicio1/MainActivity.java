package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView labelMensagem;
    private Button btnCumprimentar;
    private EditText editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCumprimentar = (Button) findViewById(R.id.btnCumprimentar);
        labelMensagem = (TextView) findViewById(R.id.labelMensagem);
        editNome = (EditText) findViewById(R.id.editNome);
    }

        public void clicou(View v) {
            String textoDigitado = editNome.getText().toString();
            labelMensagem.setText("Alô, "+textoDigitado+"!");
        }
}

