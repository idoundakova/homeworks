package com.example.i301223.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set-vame layout-a na content-a
        // Pyrvoto nesto koeto trqbva da napravim e da slojim content na Activity-to; Zadavame tochni[ resurs na layout-a
        setContentView(R.layout.activity_main);
        Button btnClickMe =  (Button)findViewById(R.id.buttonIdClick);
        assert btnClickMe != null;
        btnClickMe.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView myText = (TextView)findViewById(R.id.textView);
                String text = (String) myText.getText();
                if("One".equals(text)) {
                    myText.setText("Two");
                }else{
                    myText.setText("One");
                }
            }
        });
    }
}
