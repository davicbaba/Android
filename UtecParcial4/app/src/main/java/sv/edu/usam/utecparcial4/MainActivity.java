package sv.edu.usam.utecparcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtUser;
    private EditText txtPassword;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser=findViewById(R.id.txtUserName);
        txtPassword=findViewById(R.id.txtPassword);
        lblResult=findViewById(R.id.lblResultadoLogin);



    }


    public void OnLoginClick(View v) {

        String userName=txtUser.getText().toString();
        String password=txtPassword.getText().toString();

        if(userName.equals("parcialETps1")  && password.equals("p4rC14l#tp$")){
            lblResult.setText("");

            Intent intent = new Intent(this, CalculoIMC.class);
            startActivity(intent);
            return;
        }

        lblResult.setText("contraseña y usuario no son correctos.");

    }
}