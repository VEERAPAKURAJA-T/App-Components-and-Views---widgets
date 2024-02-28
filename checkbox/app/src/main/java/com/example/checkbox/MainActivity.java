package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner =findViewById(R.id.spinner);
        //data source
        String[] in={"INDIA","CHINA","SRI LANKA"};
        /*ArrayAdapter = it is used to populate the 'spinner' with the item
        from a string array source.
          */

        ArrayAdapter<String> array =new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, in);
        //Apply the adapter to the spinner
        spinner.setAdapter(array);
    }
}