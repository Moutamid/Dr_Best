package dev.moutamid.drbest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.signBtn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, ActivitySignUp.class));
            }
        });

        findViewById(R.id.login_btn_activity_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email = findViewById(R.id.email_edittext_activity_login);
                EditText password = findViewById(R.id.password_edittext_activity_login);

                Toast.makeText(ActivityLogin.this, "You are signed in using email: " +email.getText().toString()+" and password: " +password.getText().toString()+" and Bla Bla Bla ", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.google_btn_activity_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityLogin.this, "You are signed in using Google+ Bla Bla Bla", Toast.LENGTH_SHORT).show();
            }
        });

    }
}