package com.example.fibonacciapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  FibonacciPresenter.FibView{

    private TextView fibTextView;
    private FibonacciPresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fibTextView = findViewById(R.id.textView);

        presenter = new FibonacciPresenter();
        presenter.setView(this);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.generateFibonacciSequence();
            }
        });
    }




    public void setFibText(String text){
        fibTextView.setText(text);
    }
}
