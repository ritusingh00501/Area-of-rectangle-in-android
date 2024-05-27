package com.example.areaofrectangle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText T1 = (EditText) findViewById(R.id.Text1);
        EditText T2 = (EditText) findViewById(R.id.Text2);
        TextView Result = (TextView) findViewById(R.id.textView3);
        Button B1 = (Button) findViewById(R.id.btn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1, n2, area;
                n1 = Integer.parseInt(T1.getText().toString().trim());
                n2 = Integer.parseInt(T2.getText().toString().trim());
                area = n1 * n2;
                Result.setText("Area of Rectangle" + n1 + " and " + n2 + " is " + area);
                Toast.makeText(MainActivity.this, "Area of Rectangle is" + area, Toast.LENGTH_SHORT).show();
            }
        });
    }
}