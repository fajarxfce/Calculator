package com.example.calculator.fajar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_hapus, btn_backspace, btn_percent, btn_bagi, btn_x, btn_min, btn_plus, btn_dot, btn_equal;
    TextView input, output;
    String process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_0 = findViewById(R.id.btn_0);

        btn_hapus = findViewById(R.id.btn_hapus);
        btn_backspace = findViewById(R.id.btn_backspace);
        btn_percent = findViewById(R.id.btn_percent);
        btn_bagi = findViewById(R.id.btn_bagi);
        btn_x = findViewById(R.id.btn_x);
        btn_min = findViewById(R.id.btn_min);
        btn_plus = findViewById(R.id.btn_plus);
        btn_dot = findViewById(R.id.btn_dot);
        btn_equal = findViewById(R.id.btn_equal);

        input = findViewById(R.id.output);
        output = findViewById(R.id.output);

        btn_hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                output.setText("");
            }
        });


    }
}