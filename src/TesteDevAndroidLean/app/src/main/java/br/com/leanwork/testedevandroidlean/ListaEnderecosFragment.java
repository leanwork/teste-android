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

public class ListaEnderecosFragment extends Fragment {

    private EnderecosAdapter enderecosAdapter;
    private RecyclerView rvListaEnderecos;

    public static ListaEnderecosFragment newInstance() {
        Bundle args = new Bundle();
        ListaEnderecosFragment fragment = new ListaEnderecosFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lista_enderecos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvListaEnderecos = view.findViewById(R.id.rvListaEnderecos);
        rvListaEnderecos.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvListaEnderecos.setHasFixedSize(true);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
