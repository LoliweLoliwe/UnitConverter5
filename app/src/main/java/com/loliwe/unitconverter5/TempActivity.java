package com.loliwe.unitconverter5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TempActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioGroup radioGroup2;
    RadioButton radioButton;
    RadioButton radioButton2;
    TextView textView;
    EditText editText;
    Button myButton;

    Button bckButton;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup2 = findViewById(R.id.radioGroup2);
        textView = findViewById(R.id.textView12);

        myButton = findViewById(R.id.button5);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int radioId = radioGroup.getCheckedRadioButtonId();
                    int radioId2 = radioGroup2.getCheckedRadioButtonId();

                    radioButton = findViewById(radioId);
                    radioButton2 = findViewById(radioId2);

                    double last;
                    editText = (EditText) findViewById(R.id.editTextNumberDecimal3);
                    double pounds = Float.parseFloat(editText.getText().toString());

                    String select;
                    String select2;

                    if (radioButton.getText() != null) {
                        select = radioButton.getText().toString();
                        select2 = radioButton2.getText().toString();
                        switch (select) {
                            case "°C":
                                switch (select2) {
                                    case "°C":
                                        last = pounds * 1;
                                        str = "Converted temperature is: " + last + " °C";
                                        break;
                                        case "°F":
                                            last = (pounds * 9/5) + 32;
                                            str = "Converted weight is: " + last + " °F";
                                            break;
                                            case "°K":
                                                last = pounds + 273.15;
                                            str = "Converted weight is: " +last + " °K";
                                            break;
                                            default:
                                                last = 0;
                                                break;
                                }
                        }
                        switch (select) {
                            case "°F":
                                switch (select2) {
                                    case "°C":
                                        last = (pounds - 32) * 5/9;
                                        str = "Converted weight is: " + last + " °C";
                                        break;
                                        case "°F":
                                            last = pounds * 1;
                                            str = "Converted weight is: " +last + " °F";
                                            break;
                                            case "°K":
                                                last = (pounds - 32) * 5/9 + 273.15;
                                                str = "Converted weight is: " + last + " °K";
                                                break;
                                                default:
                                                    last = 0;
                                                    break;
                                }
                        }
                        switch (select) {
                            case "°K":
                                switch (select2) {
                                    case "°C":
                                        last = pounds - 273.15;
                                        str = "Converted weight is: " +last + " °C";
                                        break;
                                        case "°F":
                                            last = (pounds - 273.15) * 9/5 + 32;
                                            str = "Converted weight is: " + last + " °F";
                                            break;
                                            case "°K":
                                                last = pounds * 1;
                                                str = "Converted weight is: " + last + " °K";
                                                break;
                                                default:
                                                    last = 0;
                                                    break;
                                }
                        }
                    }
                    textView.setText(str);

                    radioGroup.clearCheck();
                    editText.setText("");
                    radioGroup2.clearCheck();
                } catch (Exception e) {
                    Toast.makeText(TempActivity.this, "Something was not done right", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bckButton = findViewById(R.id.button6);
        bckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(TempActivity.this, MainActivity.class);
                startActivity(newIntent);
            }
        });
    }

    public void checkButton (View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        Toast.makeText(TempActivity.this, "First selection is  " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
    public void checkButton2 (View v){
        int radioId2 = radioGroup2.getCheckedRadioButtonId();

        radioButton2 = findViewById(radioId2);
        Toast.makeText(TempActivity.this, "Second selection is  " + radioButton2.getText(), Toast.LENGTH_SHORT).show();
    }
}