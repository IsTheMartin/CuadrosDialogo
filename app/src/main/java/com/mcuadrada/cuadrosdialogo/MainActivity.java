package com.mcuadrada.cuadrosdialogo;

import android.app.FragmentManager;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Main Activity";

    private Button btnBasicDialog;
    private Button btnTimeDialog;
    private Button btnCustomDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnCustomDialog = (Button) findViewById(R.id.btnCustomDialog);
        this.btnTimeDialog = (Button) findViewById(R.id.btnTimeDialog);
        this.btnBasicDialog = (Button) findViewById(R.id.btnBasicDialog);



        btnBasicDialog.setOnClickListener(this);
        btnCustomDialog.setOnClickListener(this);
        btnTimeDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBasicDialog:
                Log.d("Hola", "onClick: Basic dialog selected");
                basicDialog();
                break;
            case R.id.btnTimeDialog:
                Log.d("Hola", "onClick: Time dialog selected");
                timeDialog();
                break;
            case R.id.btnCustomDialog:
                customDialog();
                Log.d("Hola", "onClick: Custom dialog selected");
                break;
        }
    }

    private void basicDialog() {
        AlertDialog.Builder basic = new AlertDialog.Builder(MainActivity.this);
        basic.setTitle("Hola mundo")
                .setMessage("Este es un cuadro de diálogo básico")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,
                                "Ok en diálogo básico",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,
                                "Cancelación en diálogo básico",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    private void timeDialog() {
        int hour = Calendar.HOUR_OF_DAY;
        int minute = Calendar.MINUTE;
        TimePickerDialog time;
        time = new TimePickerDialog(MainActivity.this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Toast.makeText(MainActivity.this,
                                "Seleccionaste " + hourOfDay + ":" + minute,
                                Toast.LENGTH_SHORT).show();
                    }
                }, hour, minute, false);
        time.setTitle("Selecciona una hora");
        time.show();
    }

    private void customDialog() {
        /*CustomDialogActivity customDialogActivity = new CustomDialogActivity(this);
        customDialogActivity.setTitle("Login");
        customDialogActivity.show();*/
        android.support.v4.app.FragmentManager fragmentManager = this.getSupportFragmentManager();
        CustomDialogFragment customDialogFragment = new CustomDialogFragment();

        customDialogFragment.show(fragmentManager, "Custom Dialog");
    }
}
