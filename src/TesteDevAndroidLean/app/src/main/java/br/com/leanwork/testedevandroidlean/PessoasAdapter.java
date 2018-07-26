package br.com.leanwork.testedevandroidlean;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PessoasAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final LayoutInflater layoutInflater;
    private List<Pessoa> pessoasList = new ArrayList<>();

    PessoasAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PessoaHolder(layoutInflater.inflate(R.layout.item_view_pessoa, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        Pessoa pessoa = pessoasList.get(position);
    }

    @Override
    public int getItemCount() {
        return pessoasList.size();
    }

    public void setData(List<Pessoa> data) {
        pessoasList.clear();
        pessoasList.addAll(data);
        notifyDataSetChanged();
    }

    public static class PessoaHolder extends RecyclerView.ViewHolder {

        private TextView tvNomePessoa, tvGeneroPessoa, tvTelefonePessoa, tvDataNascPessoa;

        PessoaHolder(View itemView) {
            super(itemView);
            tvNomePessoa = itemView.findViewById(R.id.tvNomePessoa);
            tvGeneroPessoa = itemView.findViewById(R.id.tvGeneroPessoa);
            tvDataNascPessoa = itemView.findViewById(R.id.tvDataNascimentoPessoa);
            tvTelefonePessoa = itemView.findViewById(R.id.tvTelefonePessoa);
        }
    }

}
