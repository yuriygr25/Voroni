package com.example.yura.voroni;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button mCrowsCounterButton;
    private int mCount = 0;
    private int mCount1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView mInfoTextView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        TextView helloTextView = (TextView)findViewById(R.id.textView);
        helloTextView.setText("Ты кто такой? Давай, до свидания!!");
    }

    public void onClick1(View view) {
        TextView helloTextView = (TextView)findViewById(R.id.textView);
        helloTextView.setText(("Я насчитал " + ++mCount + " вороны"));
    }

    public void onClick2(View view) {
        TextView helloTextView = (TextView)findViewById(R.id.textView);
        helloTextView.setText(("Я насчитал " + ++mCount1 + " кота"));

    }
}
