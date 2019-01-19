package com.codingblocks.conduit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText etVar1 = findViewById(R.id.etVar1);
        final EditText etVar2 = findViewById(R.id.etVar2);
        final Button btnAdd = findViewById(R.id.btnAdd);
        final TextView tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int a = Integer.valueOf(etVar1.getText().toString());
                    int b = Integer.valueOf(etVar2.getText().toString());

                    int c = a + b;

                    tvResult.setText(String.valueOf(c));
                } catch (NumberFormatException nfe) {
                    Toast.makeText(
                            Main2Activity.this,
                            "Please enter both numbers",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}
