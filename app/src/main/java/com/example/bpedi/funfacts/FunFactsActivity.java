package com.example.bpedi.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // declare our view variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // assign the views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.facTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             String fact = mFactBook.getFact();
             int color = mColorWheel.getColor();
                //update the screen
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);

            }
        };

        mShowFactButton.setOnClickListener(listener);
//        Toast.makeText(FunFactsActivity.this,"Yeah our activity was created!",Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are loggin form inside the on create method");

    }
}
