package com.darasdev.mobiledataterminal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.PointerIcon;
import android.view.View;
import android.widget.TextView;

public class Product  {
    View view;
    TextView nameTextView;
    TextView descripitonTextView;
    TextView codeTextView;

    public Product(String name, String description, String code){
        this.name = name;
        this.description = description;
        this.code = code;
    }
    public Product(){
        this.name = name;
        this.description = description;
        this.code = code;
    }

    public void setLayoutViews(){

    }


    String name, type, code, description;

    long id;
    void setID(long id){
        this.id = id;
    }
    long getID(){
        return id;
    }


    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }


    void setDescription(String description){
        this.description = description;
    }
    String getDescription(){
        return description;
    }


    void setType(String type){
        this.type = type;
    }
    String getType(){
        return type;
    }


    void setCode(String code){
        this.code = code;
    }
    String getCode(){
        return code;
    }


    @Override
    public String toString() {
        return name;
    }



}




