package br.com.leanwork.testedevandroidlean;

import android.provider.BaseColumns;

public class Endereco {

    private long idEnderecoCadastrado;
    private final String cep, endereco, bairro, cidade, estado;

    Endereco(String cep, String endereco, String bairro, String cidade, String estado) {
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    Endereco(long idEnderecoCadastrado, String cep, String endereco, String bairro, String cidade, String estado) {
        this.idEnderecoCadastrado = idEnderecoCadastrado;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public long getIdEnderecoCadastrado() {
        return idEnderecoCadastrado;
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

    public static class EnderecoDBEntry implements BaseColumns {
        public static final String TABLE_NAME = "enderecos";
    }

}
