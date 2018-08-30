package dialog.cursoandroid.com.diaolog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botao = (Button) findViewById(R.id.btnId);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Titulo da dialog");

                dialog.setMessage("Mensagem da dialog");

                dialog.setCancelable(false);
                dialog.setIcon(android.R.drawable.ic_delete);


                dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this,"Pressionado o botão não",Toast.LENGTH_LONG).show();

                    }
                });


                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Pressionado o botão sim",Toast.LENGTH_SHORT).show();
                    }
                });


                dialog.create();
                dialog.show();

            }
        });


    }
}
