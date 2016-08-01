package com.example.ayratin.timebeetween;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.duration;

public class MainActivity extends AppCompatActivity {
       EditText n1,n2;
       Button b;
        TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                finish();
            }
        });
        res= (TextView) findViewById(R.id.result);
        n1= (EditText) findViewById(R.id.numbr1);
        n2= (EditText) findViewById(R.id.number2);
        b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duration duration = new duration();
                 int s1=Integer.parseInt(n1.getText().toString());
                int s2=Integer.parseInt(n2.getText().toString());

              //  if((s1>2400||s1<0)||(s2>2400||s2<0))
               // { res.setText("عدد درست وارد کنید");
               //     return;
             //   }
                duration.setNum1(s1);
                duration.setNum2(s2);
                if (duration.getDuration()==-1){
                    res.setText("عدد درست وارد کنید");
                }else{
                res.setText(String.valueOf(duration.getDuration()));}
                //  res.setText(n1.getText().toString()+n2.getText().toString());
            }
        });
    }

}
