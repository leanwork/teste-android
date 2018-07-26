package br.com.leanwork.testedevandroidlean;

import retrofit2.http.GET;

public interface ApiCep {

    @GET("{cep}/json")
    Object pesquisarEndereco(String cep);

}
