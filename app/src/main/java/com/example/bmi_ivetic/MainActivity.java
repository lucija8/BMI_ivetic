package com.example.bmi_ivetic;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myAwesomeTextView = (TextView)findViewById(R.id.BMItext);
        EditText weight2= findViewById(R.id.weight);



        EditText height2 = findViewById(R.id.height);

        Button button= (Button) findViewById(R.id.calculate);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int height=Integer.parseInt(height2.getText().toString());
                int kg=Integer.parseInt(weight2.getText().toString());
                float con=(float)height/100;
                double konacno=0;
                    konacno=(float)kg/(con*con);
                    konacno=Math.round(konacno);
                    if(konacno<20)
                    {
                        myAwesomeTextView.setText("Pothranjeni ste: "+konacno);
                    }
                    else if(konacno<25 && konacno>20)
                    {
                        myAwesomeTextView.setText("Normalna težina: "+konacno);
                    }
                    else
                    {
                        myAwesomeTextView.setText("Prekomjerna tezina: "+konacno+ "");
                    }




            }
        });
    }
}