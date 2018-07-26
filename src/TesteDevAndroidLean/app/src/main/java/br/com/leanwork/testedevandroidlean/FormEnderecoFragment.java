package br.com.leanwork.testedevandroidlean;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FormEnderecoFragment extends Fragment {

    private TextInputEditText etCep, etEndereco, etCidade, etBairro, etEstado;
    private String cep, endereco, bairro, cidade, estado;

    public static FormEnderecoFragment newInstance() {
        Bundle args = new Bundle();
        FormEnderecoFragment fragment = new FormEnderecoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_form_endereco, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        etCep = view.findViewById(R.id.etCep);
        etEndereco = view.findViewById(R.id.etLogradouro);
        etBairro = view.findViewById(R.id.etBairro);
        etCidade = view.findViewById(R.id.etCidade);
        etEstado = view.findViewById(R.id.etEstado);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    private void preencherCep(CepResponse cepResponse) {
        etCep.setText(cepResponse.getCep());
        etEndereco.setText(cepResponse.getEndereco());
        etBairro.setText(cepResponse.getBairro());
        etCidade.setText(cepResponse.getCidade());
        etEstado.setText(cepResponse.getEstado());
    }

    private void cadastroRealizadoComSucesso(Long idEndereco) {
        limparDados();
        PushCadastro.disparar(getContext(), "Endereço", idEndereco);
        Toast.makeText(getActivity(), "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
    }

    private void limparDados() {
        cep = null;
        endereco = null;
        bairro = null;
        cidade = null;
        estado = null;
        etCep.setText(null);
        etEndereco.setText(null);
        etCidade.setText(null);
        etBairro.setText(null);
        etEstado.setText(null);
    }

    private boolean formValido() {
        cep = etCep.getText() != null ? etCep.getText().toString() : null;
        endereco = etEndereco.getText() != null ? etEndereco.getText().toString() : null;
        bairro = etBairro.getText() != null ? etBairro.getText().toString() : null;
        cidade = etCidade.getText() != null ? etCidade.getText().toString() : null;
        estado = etEstado.getText() != null ? etEstado.getText().toString() : null;
        return FormUtil.formularioPreenchido(cep, endereco, bairro, cidade, estado);
    }

}
