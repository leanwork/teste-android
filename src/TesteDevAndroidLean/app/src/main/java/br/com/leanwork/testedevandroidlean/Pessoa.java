package br.com.leanwork.testedevandroidlean;

import android.provider.BaseColumns;

public class Pessoa {

    private long idPessoaCadastrada;
    private final String nome, genero, dataNascimento, telefone;

    Pessoa(String nome, String genero, String dataNascimento, String telefone) {
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    Pessoa(long idPessoaCadastrada, String nome, String genero, String dataNascimento, String telefone) {
        this.idPessoaCadastrada = idPessoaCadastrada;
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public long getIdPessoaCadastrada() {
        return idPessoaCadastrada;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getAssetGenero() {
        return getGenero().toLowerCase().startsWith("m") ? R.drawable.ic_gender_male : R.drawable.ic_gender_female;
    }

    public static class PessoaDBEntry implements BaseColumns {
        public static final String TABLE_NAME = "pessoas";
    }

}
