package com.example.tuagsintent1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button expintent;
    Button impintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expintent = (Button) findViewById(R.id.explicitintent);
        expintent.setOnClickListener(this); // Pass 'this' as the listener

        impintent = (Button) findViewById(R.id.implicitintent);
        impintent.setOnClickListener(this); // Pass 'this' as the listener

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.explicitintent) {
            Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
            startActivity(explicit);
        }else if (v.getId() == R.id.implicitintent) {
            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mhsG7K8Ko"));
            startActivity(implicit);
        }
    }

}
