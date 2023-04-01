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

public class LengthActivity extends AppCompatActivity {

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
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup2 = findViewById(R.id.radioGroup2);
        textView = findViewById(R.id.textView5);

        myButton = findViewById(R.id.button2);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int radioId = radioGroup.getCheckedRadioButtonId();
                    int radioId2 = radioGroup2.getCheckedRadioButtonId();

                    radioButton = findViewById(radioId);
                    radioButton2 = findViewById(radioId2);

                    double last;
                    editText = (EditText) findViewById(R.id.editTextNumberDecimal);
                    double pounds = Float.parseFloat(editText.getText().toString());


                    String select;
                    String select2;

                    if (radioButton.getText() != null) {
                        select = radioButton.getText().toString();
                        select2 = radioButton2.getText().toString();
                        switch (select) {
                            case "inch":
                                switch (select2) {
                                    case "mm":
                                        last = pounds * 25.4;
                                        str = "Converted length is: " + last + " mm";
                                        break;
                                    case "cm":
                                        last = pounds * 2.54;
                                        str = "Converted length is: " +last + " cm";
                                        break;
                                    case "m":
                                        last = pounds * 0.0254;
                                        str = "Converted length is: " +last + " m";
                                        break;
                                    case "km":
                                        last = pounds * 0.0000254;
                                        str = "Converted length is: " +last + " km";
                                        break;
                                    default:
                                        last = 0;
                                        break;
                                }
                        }
                        switch (select) {
                            case "foot":
                                switch (select2) {
                                    case "mm":
                                        last = pounds * 304.8;
                                        str = "Converted length is: " +last + " mm";
                                        break;
                                    case "cm":
                                        last = pounds * 30.48;
                                        str = "Converted length is: " + last + " cm";
                                        break;
                                    case "m":
                                        last = pounds * 0.3048;
                                        str = "Converted length is: " +last + " m";
                                        break;
                                    case "km":
                                        last = pounds * 0.0003048;
                                        str = "Converted length is: " +last + " km";
                                        break;
                                    default:
                                        last = 0;
                                        break;
                                }
                        }
                        switch (select) {
                            case "yard":
                                switch (select2) {
                                    case "mm":
                                        last = pounds * 914.4;
                                        str = last + " mm";
                                        break;
                                    case "cm":
                                        last = pounds * 91.44;
                                        str = "Converted length is: " +last + " cm";
                                        break;
                                    case "m":
                                        last = pounds * 0.9144;
                                        str = "Converted length is: " +last + " m";
                                        break;
                                    case "km":
                                        last = pounds * 0.0009144;
                                        str = "Converted length is: " +last + " km";
                                        break;
                                    default:
                                        last = 0;
                                        break;
                                }
                        }
                        switch (select) {
                            case "mile":
                                switch (select2) {
                                    case "mm":
                                        last = pounds * 1609340;
                                        str = "Converted length is: " +last + " mm";
                                        break;
                                    case "cm":
                                        last = pounds * 160934;
                                        str = "Converted length is: " +last + " cm";
                                        break;
                                    case "m":
                                        last = pounds * 1609.34;
                                        str = "Converted length is: " +last + " m";
                                        break;
                                    case "km":
                                        last = pounds * 1.60934;
                                        str = "Converted length is: " +last + " km";
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
                }
                catch (Exception e){
                    Toast.makeText(LengthActivity.this, "Something was not done right", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bckButton = findViewById(R.id.button3);
        bckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(LengthActivity.this, MainActivity.class);
                startActivity(newIntent);
            }
        });
    }
    public void checkButton (View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        Toast.makeText(LengthActivity.this, "First selection is  " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
    public void checkButton2 (View v){
        int radioId2 = radioGroup2.getCheckedRadioButtonId();

        radioButton2 = findViewById(radioId2);
        Toast.makeText(LengthActivity.this, "Second selection is  " + radioButton2.getText(), Toast.LENGTH_SHORT).show();
    }
}