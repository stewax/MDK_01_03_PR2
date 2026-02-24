package com.example.pr2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStepAge(View view){
        EditText tbName = findViewById(R.id.tbName);
        String NameUser = tbName.getText().toString();

        setContentView(R.layout.step_2);

        TextView tvName = findViewById(R.id.tvName);
        tvName.setText("Очень приятно познакомиться " +NameUser+" Меня зовут Бисквит. \nСколько тебе лет?");
    }

    public void onStepSex(View view){
        EditText tbAge = findViewById(R.id.tbAge);
        String AgeUser = tbAge.getText().toString();
        setContentView(R.layout.step_3);
        TextView tvAge = findViewById(R.id.tvAge);
        tvAge.setText("Ничего себе ты большой, целых " +AgeUser+ " лет \n Какого ты пола?");
    }

    public void onStepEmail(View view){
        setContentView(R.layout.step_4);
    }
}