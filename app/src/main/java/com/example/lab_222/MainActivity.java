
package com.example.lab_222;




import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
        final CheckBox checkBox=findViewById(R.id.checkBox);

            @Override

            public void onClick(View view) {


                Toast.makeText(MainActivity.this, R.string.létiquette_a_été_mise_à_jour, Toast.LENGTH_LONG).show();

                Snackbar s =Snackbar.make(checkBox,"CheckBox is now",Snackbar.LENGTH_LONG);
                s.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();


            }
        });
                s.show();
    }
});

    }}