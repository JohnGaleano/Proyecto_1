package com.example.proyecto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button perc = findViewById(R.id.percent);
        Button log = findViewById(R.id.log);
        Button sin = findViewById(R.id.sin);
        Button clear = findViewById(R.id.clear_text);
        Button expx = findViewById(R.id.expx);
        Button exp2 = findViewById(R.id.exp2);
        Button sqx = findViewById(R.id.sqx);
        Button div = findViewById(R.id.div);
        Button n7 = findViewById(R.id.n7);
        Button n8 = findViewById(R.id.n8);
        Button n9 = findViewById(R.id.n9);
        Button n6 = findViewById(R.id.n6);
        Button n5 = findViewById(R.id.n5);
        Button n4 = findViewById(R.id.n4);
        Button n3 = findViewById(R.id.n3);
        Button n2 = findViewById(R.id.n2);
        Button n1 = findViewById(R.id.n1);
        Button n0 = findViewById(R.id.n0);
        Button add = findViewById(R.id.add);
        Button rest = findViewById(R.id.rest);
        Button sum = findViewById(R.id.sum);
        Button less = findViewById(R.id.less);
        Button dot = findViewById(R.id.dot);
        Button eql0 = findViewById(R.id.eql);
    }

    public void onClick(View view)
    {
        String lbl;
        Button b = (Button)view;
        lbl = b.getText().toString();
        Concat(lbl);
    }

    public void Concat(String lbl)
    {
        TextView label = findViewById(R.id.lbl);
        String val = label.getText().toString();

        String text = val+lbl;
        label.setText(text);
    }

    public static int suma()
    {
        int x = 1;
        return x;
    }
}