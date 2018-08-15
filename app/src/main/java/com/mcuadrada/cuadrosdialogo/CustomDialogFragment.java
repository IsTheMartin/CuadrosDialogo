package com.mcuadrada.cuadrosdialogo;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CustomDialogFragment extends android.support.v4.app.DialogFragment {

    private android.widget.EditText edtEmail;
    private android.widget.EditText edtPassword;
    private android.widget.Button btnLogin;
    private android.widget.LinearLayout frgCustomDialog;

    public CustomDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_custom_dialog, container, false);
        /*this.frgCustomDialog = (LinearLayout) view.findViewById(R.id.frgCustomDialog);
        this.btnLogin = (Button) view.findViewById(R.id.btnLogin);
        this.edtPassword = (EditText) view.findViewById(R.id.edtPassword);
        this.edtEmail = (EditText) view.findViewById(R.id.edtEmail);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Email: " + edtEmail.getText()
                + " Contraseña: " + edtPassword.getText()
                        , Toast.LENGTH_SHORT).show();
            }
        });
        getDialog().setTitle("Login");*/
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        return super.onCreateDialog(savedInstanceState);
    }
}
