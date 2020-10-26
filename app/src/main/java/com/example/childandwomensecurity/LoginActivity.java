package com.example.childandwomensecurity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button btn;
    EditText txt,txt1,txt2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        btn=(Button)findViewById(R.id.buttonSignIn);
        txt=(EditText)findViewById(R.id.numberHere);
        txt1=(EditText)findViewById(R.id.yournumber);
        txt2=(EditText)findViewById(R.id.name);


    }

    public void message(View view) {
        String parentNumber=txt.getText().toString();
        String yourNumber=txt1.getText().toString();
        String fullName=txt2.getText().toString();

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("Value1", parentNumber);
        i.putExtra("Value2", yourNumber);
        i.putExtra("Value3", fullName);
        startActivity(i);
    }


}
