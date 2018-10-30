package com.sjs.edu.explicitsendbuldle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        Bundle bundle = getIntent().getExtras();
        TextView textView = (TextView)findViewById(R.id.textViewSingleName);
        textView.setText(bundle.getString("singleName","No Data"));
    }
}
