package com.example.e_travel;

import retrofit2.Call;

public class UserRequest implements RequestUser {

    @Override
    public Call<UserData> getUser(String uid) {
        return null;
    }
}
