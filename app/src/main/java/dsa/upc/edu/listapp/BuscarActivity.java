package dsa.upc.edu.listapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BuscarActivity extends AppCompatActivity {

    private EditText ownerText;
    private EditText repoText;
    private Button button;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscar_activity);
        ownerText = findViewById(R.id.editTextTextPersonName);
        repoText = findViewById(R.id.editTextTextPersonName2);
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(corkyListener);
    }

    private View.OnClickListener corkyListener = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), MainActivity.class);
            intent.putExtra("owner",ownerText.getText().toString());
            intent.putExtra("repo",repoText.getText().toString());
            startActivity(intent);
        }
    };

}
