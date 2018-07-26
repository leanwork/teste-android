package br.com.leanwork.testedevandroidlean;

import com.google.gson.annotations.SerializedName;

public class CepResponse {

    @SerializedName("cep")
    private final String cep;
    @SerializedName("logradouro")
    private final String endereco;
    @SerializedName("bairro")
    private final String bairro;
    @SerializedName("localidade")
    private final String cidade;
    @SerializedName("uf")
    private final String estado;

    public CepResponse(String cep, String endereco, String bairro, String cidade, String estado) {
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

}
