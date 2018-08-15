package com.mcuadrada.cuadrosdialogo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomDialogActivity extends Dialog implements View.OnClickListener {

    public Activity activity;
    private android.widget.EditText edtEmail;
    private android.widget.EditText edtPassword;
    private android.widget.Button btnLogin;

    public CustomDialogActivity(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_custom_dialog);

        this.btnLogin = (Button) findViewById(R.id.btnLogin);
        this.edtPassword = (EditText) findViewById(R.id.edtPassword);
        this.edtEmail = (EditText) findViewById(R.id.edtEmail);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                Toast.makeText(activity,
                        "Email: " + edtEmail.getText() + " Contraseña: " + edtPassword.getText(),
                        Toast.LENGTH_SHORT).show();
                //activity.finish();
                break;
        }
        dismiss();
    }
}
