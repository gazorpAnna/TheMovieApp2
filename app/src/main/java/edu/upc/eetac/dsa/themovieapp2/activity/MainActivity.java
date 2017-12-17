package edu.upc.eetac.dsa.themovieapp2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import edu.upc.eetac.dsa.themovieapp2.R;

public class MainActivity extends AppCompatActivity {

    private Button buscar_boto;
    private TextView parametres;
    private String query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parametres = (TextView) findViewById(R.id.textView);
        buscar_boto = (Button) findViewById(R.id.button);

        buscar_boto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (parametres.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), "No has buscat res", Toast.LENGTH_SHORT).show();
                else{
                    query = parametres.getText().toString();

                    Intent inb1 = new Intent(MainActivity.this, Main2Activity.class);
                    inb1.putExtra("query", query);
                    startActivityForResult(inb1, 1);
                }
            }
        });
    }
}
