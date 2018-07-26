package br.com.leanwork.testedevandroidlean;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListaPessoasFragment extends Fragment {

    private PessoasAdapter pessoasAdapter;
    private RecyclerView rvListaPessoas;

    public static ListaPessoasFragment newInstance() {
        Bundle args = new Bundle();
        ListaPessoasFragment fragment = new ListaPessoasFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lista_pessoas, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvListaPessoas = view.findViewById(R.id.rvListaPessoas);
        rvListaPessoas.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvListaPessoas.setHasFixedSize(true);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
