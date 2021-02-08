package dev.moutamid.drbest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivitySignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.loginBtn_signUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivitySignUp.this, ActivityLogin.class));
            }
        });

        findViewById(R.id.create_btn_activity_sign_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.user_name_edittext_activity_sign_up);
                EditText email = findViewById(R.id.email_edittext_activity_sign_up);
                EditText password = findViewById(R.id.password_edittext_activity_sign_up);
                EditText confirmpassword = findViewById(R.id.confirm_password_edittext_activity_sign_up);

                Toast.makeText(ActivitySignUp.this, "You are signed in using name: "+name.getText().toString()+ " email: "+email.getText().toString()+" password: " +password.getText().toString() + " confirm password: " + confirmpassword.getText().toString()+" and Bla Bla Bla ", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.google_btn_btn_activity_sign_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivitySignUp.this, "You are signed in using Google+ Bla Bla Bla", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.backbtn_signup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}