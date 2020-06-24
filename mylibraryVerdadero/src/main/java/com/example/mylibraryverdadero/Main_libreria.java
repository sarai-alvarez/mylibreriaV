package com.example.mylibraryverdadero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.jar.Attributes;

public class Main_libreria extends LinearLayout {

    public Main_libreria(Context context) {
        super(context);
        initialize(context);
    }
public Main_libreria(Context context, AttributeSet attributeSet)
{
        super(context,attributeSet);
        initialize(context);
}
private void  initialize(Context context){
        inflate(context,R.layout.activity_main_libreria, this);
}


}