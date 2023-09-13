package com.example.e_travel;

/*import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;*/
import androidx.appcompat.app.AppCompatActivity;

//import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mStartSignupButton;
    private Button mStartLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartSignupButton = findViewById(R.id.startSignup);
        mStartLoginButton = findViewById(R.id.startLogin);


        mStartSignupButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,SignupActivity.class);
             startActivity(intent);
        });

        mStartLoginButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,loginActivity.class);
                startActivity(intent);
           }
       });
    }
}