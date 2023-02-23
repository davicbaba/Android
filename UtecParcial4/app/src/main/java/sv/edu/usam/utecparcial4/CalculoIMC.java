package sv.edu.usam.utecparcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoIMC extends AppCompatActivity {

    private EditText txtPeso;
    private EditText txtEstatura;
    private TextView lblResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);
        txtPeso=findViewById(R.id.txtPeso);
        txtEstatura=findViewById(R.id.txtAltura);
        lblResult=findViewById(R.id.lblResultadoIMC);

    }

    public void OnClickCalcular(View v) {

        Double peso =Double.parseDouble(txtPeso.getText().toString());
        Double estatura =Double.parseDouble(txtEstatura.getText().toString());

        Double imc =  (peso)/(estatura*estatura);

        String text;

        if(imc < 10.5)
            text = "Críticamente Bajo de Peso";
        else if(imc < 15.9)
            text = "Severamente Bajo de Peso";
        else if(imc < 18.5)
            text = "Bajo de Peso";
        else if(imc < 25)
            text = "Normal (peso saludable)";
        else if(imc < 30)
            text = "Sobrepeso";
        else if (imc < 35)
            text = "Obesidad Clase 1 - Moderadamente Obeso";
        else if (imc < 40)
            text = "Obesidad Clase 2 - Severamente Obeso";

        else if (imc > 50)
            text = "Obesidad Clase 3 - Criticamente Obeso";
        else
            text = "No reconocido";

        lblResult.setText(text);


    }
}