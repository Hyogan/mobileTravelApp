package com.example.e_travel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class SignupActivity extends AppCompatActivity {

    private Button mInit_signUp;

    private final String BASE_URL =   "https://reqres.in";
    private final String  TAG = "CHECK_RESPONSE";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    UserRequest mUserRequest = retrofit.create(UserRequest.class);

    mUserRequest.getUser(3)

}