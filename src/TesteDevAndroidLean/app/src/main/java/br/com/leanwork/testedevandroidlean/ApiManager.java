package br.com.leanwork.testedevandroidlean;

import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {

    private static ApiManager instance;
    private ApiCep apiCep;

    private ApiManager() {
        Retrofit cepRetrofit = new Retrofit.Builder()
                .baseUrl("https://viacep.com.br/ws/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .build();
        apiCep = cepRetrofit.create(ApiCep.class);
    }

    public static ApiManager getInstance() {
        if (instance == null)
            instance = new ApiManager();
        return instance;
    }

    public ApiCep getApiCep() {
        return apiCep;
    }

}
