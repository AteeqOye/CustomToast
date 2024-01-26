package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Button button = findViewById (R.id.btn1);

        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast (getApplicationContext ());
                v = getLayoutInflater ().inflate (R.layout.custom_toast , (ViewGroup) findViewById (R.id.ll1));
                toast.setView (v);
                TextView textView = v.findViewById (R.id.abc);
                textView.setText ("ABC");
                toast.setDuration (Toast.LENGTH_LONG);
                toast.show ();

                Log.e ("Toast Log" , "Is this is working");
            }
        });

    }

}