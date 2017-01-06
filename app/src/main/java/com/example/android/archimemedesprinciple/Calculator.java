package com.example.android.archimemedesprinciple;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.archimemedesprinciple.R;

public class Calculator extends Activity {

    Spinner spnr;
    int indx;
    String[] celebrities = {
            "Water",
            "Alcohol (ethanol)",
            "Benzene",
            "Glycerine",
            "Kerosene",
            "Petrol",
            "Nitric acid"
    };

    double [] values = {
            1000,
            785.1,
            873.8,
            1259,
            820.1,
            711,
            1560
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        spnr = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, celebrities);

        spnr.setAdapter(adapter);
        spnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1,
                                               int arg2, long arg3) {

                        int position = spnr.getSelectedItemPosition();
                        indx = position;
                        Toast.makeText(getApplicationContext(), "You have selected " + celebrities[position], Toast.LENGTH_LONG).show();
                        // TODO Auto-generated method stub
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                        // TODO Auto-generated method stub

                    }

                }
        );
    }

    public void doCalculation(View v){
        EditText num1 = (EditText) findViewById(R.id.editText);
        EditText num2 = (EditText) findViewById(R.id.editText2);
        double volume = Double.parseDouble(num1.getText().toString());
        double mass = Double.parseDouble(num2.getText().toString());
        double objDensity = mass/volume;

        double spGravity = objDensity / values[indx];

        TextView result = (TextView) findViewById(R.id.textView3);
        result.setText(Double.toString(spGravity));
    }

}