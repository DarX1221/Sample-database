package com.darasdev.mobiledataterminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddProductActivity extends AppCompatActivity {
    EditText productNameET, productDescriptionET, productCodeET;
    private DataDAO dataDAO = new DataDAO(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        productNameET = (EditText) findViewById(R.id.product_name_editText);
        productDescriptionET = (EditText) findViewById(R.id.product_description_editText);
        productCodeET = (EditText) findViewById(R.id.product_code_editText);

    }



    private String productNameStr, productDescriptionStr, productCodeStr;
    private void getProductEditText(){
        productNameStr = productNameET.getText().toString();
        productDescriptionStr = productDescriptionET.getText().toString();
        productCodeStr = productCodeET.getText().toString();
    }

    private Product product;
    private void addProductToDB(){
         product = new Product();

         product.setName(productNameStr);
         product.setDescription(productDescriptionStr);
         product.setCode(Integer.parseInt(productCodeStr));

         dataDAO.insertProduct(product);
        Toast.makeText(this, "Added new product", Toast.LENGTH_LONG).show();
    }

    public void addProductOnClick(View view) {

        Boolean showData = true;
        try{
        getProductEditText();
        addProductToDB();}
        catch(Exception ex){
            Toast.makeText(this, "Wrong parameters", Toast.LENGTH_LONG).show();
            showData = false;
        }
        if (showData) {
            Intent intent = new Intent(this, DataActivity.class);
            startActivity(intent);
        }

    }
/*
    public void showDataOnClick(View view) {
        Intent intent = new Intent(this, DataActivity.class);
        startActivity(intent);
    }*/
}