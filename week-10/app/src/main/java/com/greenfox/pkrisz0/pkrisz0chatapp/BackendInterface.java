package com.greenfox.pkrisz0.pkrisz0chatapp;


import com.greenfox.pkrisz0.pkrisz0chatapp.model.Message;
import com.greenfox.pkrisz0.pkrisz0chatapp.model.MessageFromAndroid;
import com.greenfox.pkrisz0.pkrisz0chatapp.model.ToBeRecieved;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Sir Robin on 2017. 11. 16..
 */

public interface BackendInterface {

    @GET("/api/messages")
    Call<MessageFromAndroid> getMessages();

    @POST("/api/message/receive")
    Call<ToBeRecieved> postMessage(@Body Message message);
}
