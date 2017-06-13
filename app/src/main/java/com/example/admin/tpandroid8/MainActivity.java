package com.example.admin.tpandroid8;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void Envoyer(EditText tel, EditText mess){
        String uri = "smsto:" + tel.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(uri));
        intent.putExtra("sms_body", mess.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText telephone = ((EditText) findViewById(R.id.telephone));
        final EditText message = ((EditText) findViewById(R.id.message));
        final Button envoyer = ((Button) findViewById(R.id.send));

        envoyer.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                Envoyer(telephone, message);
            }

        });




    }


}
