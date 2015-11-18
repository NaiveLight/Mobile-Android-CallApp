package kookmin.android.ac.kr.callapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText inputnumber;
    Button button;
    Context context = getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputnumber = (EditText) findViewById(R.id.inputnumber);
        String myData = inputnumber.getText().toString();


        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String mydata = inputnumber.getText().toString();
                Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata));
                startActivity(myActivity2);
            }
        });
    }

}
