package ru.dkotik.myfirstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.editTextTextPersonName2);
        TextView target = findViewById(R.id.textView2);
        Button btn = findViewById(R.id.button);

        @SuppressLint("UseSwitchCompatOrMaterialCode")
        Switch switcher = findViewById(R.id.switcher);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String inputText = input.getText().toString();
                target.setText(inputText);
                input.setText("");

            }
        });

        switcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    btn.setBackgroundColor(Color.BLACK);
                } else {
                    btn.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }
}