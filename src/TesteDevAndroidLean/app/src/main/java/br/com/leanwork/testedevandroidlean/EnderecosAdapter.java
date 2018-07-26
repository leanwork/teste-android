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

public class EnderecosAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final LayoutInflater layoutInflater;
    private List<Endereco> enderecoList = new ArrayList<>();

    EnderecosAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new EnderecoHolder(layoutInflater.inflate(R.layout.item_view_endereco_modelo_1, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        Endereco endereco = enderecoList.get(position);
    }

    @Override
    public int getItemCount() {
        return enderecoList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 1;
    }

    public void setData(List<Endereco> data) {
        enderecoList.clear();
        enderecoList.addAll(data);
        notifyDataSetChanged();
    }

    public static class EnderecoHolder extends RecyclerView.ViewHolder {

        private TextView tvCep, tvEndereco, tvBairro, tvCidade, tvEstado;

        EnderecoHolder(View itemView) {
            super(itemView);
            tvCep = itemView.findViewById(R.id.tvCep);
            tvEndereco = itemView.findViewById(R.id.tvEndereco);
            tvBairro = itemView.findViewById(R.id.tvBairro);
            tvCidade = itemView.findViewById(R.id.tvCidade);
            tvEstado = itemView.findViewById(R.id.tvEstado);
        }

    }

    public static class EnderecoHolder2 extends RecyclerView.ViewHolder {

        private TextView tvCep, tvEndereco, tvBairro, tvCidade, tvEstado;

        EnderecoHolder2(View itemView) {
            super(itemView);
            tvCep = itemView.findViewById(R.id.tvCep);
            tvEndereco = itemView.findViewById(R.id.tvEndereco);
            tvBairro = itemView.findViewById(R.id.tvBairro);
            tvCidade = itemView.findViewById(R.id.tvCidade);
            tvEstado = itemView.findViewById(R.id.tvEstado);
        }

    }

}
