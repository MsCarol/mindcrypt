package com.carolkariuki.mindcrypt.restclient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by carolkariuki on 10/29/17.
 */

public interface APISERVICE {
    @GET
    Call<ResponseBody> getCalls(@Url String url);
}

