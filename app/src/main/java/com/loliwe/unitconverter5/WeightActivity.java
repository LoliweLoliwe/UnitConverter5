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

public class WeightActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_weight);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup2 = findViewById(R.id.radioGroup2);
        textView = findViewById(R.id.textView);

        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int radioId = radioGroup.getCheckedRadioButtonId();
                    int radioId2 = radioGroup2.getCheckedRadioButtonId();

                    radioButton = findViewById(radioId);
                    radioButton2 = findViewById(radioId2);

                    double last;
                    editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
                    double pounds = Float.parseFloat(editText.getText().toString());


                    String select;
                    String select2;

                    if (radioButton.getText() != null) {
                        select = radioButton.getText().toString();
                        select2 = radioButton2.getText().toString();
                        switch (select) {
                            case "pound":
                                switch (select2) {
                                    case "mg":
                                        last = pounds * 453592.37;
                                        str = "Converted weight is: " + last + " mg";
                                        break;
                                    case "cm":
                                        last = pounds * 453.59237;
                                        str = "Converted weight is: " + last + " g";
                                        break;
                                    case "kg":
                                        last = pounds * 0.45359237;
                                        str = "Converted weight is: " + last + " kg";
                                        break;
                                    default:
                                        last = 0;
                                        break;
                                }
                        }
                        switch (select) {
                            case "ounce":
                                switch (select2) {
                                    case "mg":
                                        last = pounds * 28349.523125;
                                        str = "Converted weight is: " + last + " mg";
                                        break;
                                    case "g":
                                        last = pounds * 28.3495;
                                        str = "Converted weight is: " + last + " g";
                                        break;
                                    case "kg":
                                        last = pounds * 0.028349523125;
                                        str = "Converted weight is: " + last + " kg";
                                        break;
                                    default:
                                        last = 0;
                                        break;
                                }
                        }
                        switch (select) {
                            case "ton":
                                switch (select2) {
                                    case "mg":
                                        last = pounds * 907184740;
                                        str = "Converted weight is: " + last + " mg";
                                        break;
                                    case "g":
                                        last = pounds * 907184.74;
                                        str = "Converted weight is: " + last + " g";
                                        break;
                                    case "kg":
                                        last = pounds * 907.18474;
                                        str = "Converted weight is: " + last + " kg";
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
                    Toast.makeText(WeightActivity.this, "Something was not done right", Toast.LENGTH_SHORT).show();
                }
            }
    });

    bckButton = findViewById(R.id.button4);
    bckButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent newIntent = new Intent(WeightActivity.this, MainActivity.class);
            startActivity(newIntent);
        }
    });
        }
        public void checkButton(View v) {
            int radioId = radioGroup.getCheckedRadioButtonId();

            radioButton = findViewById(radioId);
            Toast.makeText(WeightActivity.this, "First selection is  " + radioButton.getText(), Toast.LENGTH_SHORT).show();
        }

        public void checkButton2(View v) {
            int radioId2 = radioGroup2.getCheckedRadioButtonId();

            radioButton2 = findViewById(radioId2);
                Toast.makeText(WeightActivity.this, "Second selection is  " + radioButton2.getText(), Toast.LENGTH_SHORT).show();
        }
}