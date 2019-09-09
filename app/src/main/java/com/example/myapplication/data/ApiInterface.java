package com.example.myapplication.data;

import com.example.myapplication.data.model.LoggedInUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded // annotation used in POST type requests
    @POST("/auth/token")
        // API's endpoints
    Call<String> login(@Field("employeeId") String employeeId,
                                    @Field("pin") String pin
                                   );

    // In registration method @Field used to set the keys and String data type is representing its a string type value and callback is used to get the response from api and it will set it in our POJO class
}
