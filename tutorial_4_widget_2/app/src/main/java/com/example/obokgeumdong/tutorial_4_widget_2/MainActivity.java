package com.example.obokgeumdong.tutorial_4_widget_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Text1,Text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog,rdoCat,rdoBoth;
    Button btnOK;
    ImageView imgDog,imgCat,imgBoth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text1= (TextView) findViewById(R.id.text1);
        Text2 = (TextView) findViewById(R.id.text2);
        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);
        rGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        rdoDog = (RadioButton) findViewById(R.id.dog_button);
        rdoCat = (RadioButton) findViewById(R.id.cat_button);
        rdoBoth = (RadioButton) findViewById(R.id.both_button);
        btnOK = (Button) findViewById(R.id.BtnOK);
        imgDog = (ImageView) findViewById(R.id.dog_pic);
        imgCat = (ImageView) findViewById(R.id.cat_pic);
        imgBoth = (ImageView) findViewById(R.id.both_pic);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkAgree.isChecked()==true){
                    Text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);

                    btnOK.setVisibility(android.view.View.VISIBLE);

                }
                else{
                    Text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgCat.setVisibility(android.view.View.INVISIBLE);
                    imgDog.setVisibility(android.view.View.INVISIBLE);
                    imgBoth.setVisibility(android.view.View.INVISIBLE);
                    btnOK.setVisibility(android.view.View.INVISIBLE);

                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (rdoDog.isChecked()) {
                    imgDog.setVisibility(android.view.View.VISIBLE);
                    imgCat.setVisibility(android.view.View.INVISIBLE);
                    imgBoth.setVisibility(android.view.View.INVISIBLE);


                }
                else if(rdoCat.isChecked()){
                    imgDog.setVisibility(android.view.View.INVISIBLE);
                    imgCat.setVisibility(android.view.View.VISIBLE);
                    imgBoth.setVisibility(android.view.View.INVISIBLE);

                }
                else if(rdoBoth.isChecked()){
                    imgDog.setVisibility(android.view.View.INVISIBLE);
                    imgCat.setVisibility(android.view.View.INVISIBLE);
                    imgBoth.setVisibility(android.view.View.VISIBLE);

                }
            }
        });

    }



}
