package com.example.joseph.shippingcalculator;

/**
    Nguyen Hoang C02288487
    Project 1: Shipping Calculator
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText weightPackageEditText;
    private TextView addedCostTextView;
    private TextView totalShippingCostTextView;
    private TextView baseCostTextView;
    private ShipItem item;

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item = new ShipItem();
        addedCostTextView = (TextView) findViewById(R.id.addedCostTextView);
        totalShippingCostTextView = (TextView) findViewById(R.id.totalShippingCostTextView);
        baseCostTextView = (TextView) findViewById(R.id.bastCostTextView);
        //findViewById(R.id.weightPackageEditText).requestFocus();
        weightPackageEditText = (EditText) findViewById(R.id.weightPackageEditText);

        weightPackageEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Do nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(weightPackageEditText.getText().toString().trim().length() > 0) {
                    item.setWeight(Double.parseDouble(weightPackageEditText.getText().toString()));
                    item.calculateShippingCost();
                    addedCostTextView.setText("$" + decimalFormat.format(item.getAddedCost()));
                    totalShippingCostTextView.setText("$" + decimalFormat.format(item.getTotalCost()));
                }
                else{
                    baseCostTextView.setText("$" + decimalFormat.format(item.getBaseCost()));
                    addedCostTextView.setText("$" + decimalFormat.format(item.getAddedCost()));
                    totalShippingCostTextView.setText("$" + decimalFormat.format(item.getTotalCost()));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Do nothing
            }
        });


    }
}
