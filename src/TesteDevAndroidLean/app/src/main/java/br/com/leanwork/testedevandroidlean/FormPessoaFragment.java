package br.com.leanwork.testedevandroidlean;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class FormPessoaFragment extends Fragment {

    private TextInputEditText etNomeCompleto, etTelefone, etDataNascimento;
    private Spinner spnGenero;
    private String nome, genero, telefone, dataNascimento;

    public static FormPessoaFragment newInstance() {
        Bundle args = new Bundle();
        FormPessoaFragment fragment = new FormPessoaFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_form_pessoa, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etNomeCompleto = view.findViewById(R.id.etNomeCompleto);
        etTelefone = view.findViewById(R.id.etTelefoneCelular);
        etDataNascimento = view.findViewById(R.id.etDataNascimento);
        spnGenero = view.findViewById(R.id.spnGenero);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    private void cadastroRealizadoComSucesso(Long idNovaPessoa) {
        limparDados();
        PushCadastro.disparar(getContext(), "Pessoa", idNovaPessoa);
        ServiceUtil.esconderTeclado(getContext(), etNomeCompleto);
        Toast.makeText(getActivity(), "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
    }

    private void limparDados() {
        nome = null;
        genero = null;
        telefone = null;
        dataNascimento = null;
        etNomeCompleto.setText(null);
        etTelefone.setText(null);
        etDataNascimento.setText(null);
        spnGenero.setSelection(0);
    }

    private boolean formValido() {
        nome = etNomeCompleto.getText() != null ? etNomeCompleto.getText().toString() : null;
        telefone = etTelefone.getText() != null ? etTelefone.getText().toString() : null;
        return FormUtil.formularioPreenchido(nome, genero, dataNascimento, telefone);
    }

    public static class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);
            //noinspection ConstantConditions
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
        }
    }

}
