package br.ufrpe.revcare.infra.gui;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import br.ufrpe.revcare.R;

public class Validacao {

    public boolean isCampoValido(EditText editText) {
        boolean result = true;
        if (editText.getText().toString().trim().length()==0) {
            editText.requestFocus();
            editText.setError("Preencha o Campo.");
            result = false;
        }
        return result;
    }

    public boolean isValido(EditText... editTexts) {
        boolean result = true;
        for (EditText editText : editTexts) {
            if (!isCampoValido(editText)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean confirmarSenha(Context context,String nSenha, String nConfirmarSenha) {
        boolean result = true;
        if (!nSenha.equals(nConfirmarSenha)) {
            result = false;
            Toast.makeText(context,"Senhas diferentes", Toast.LENGTH_LONG).show();
        }
        return result;
    }
}
