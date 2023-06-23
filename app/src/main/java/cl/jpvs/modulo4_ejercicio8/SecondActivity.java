package cl.jpvs.modulo4_ejercicio8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListener();
    }

    private void initListener() {
        Button btnUrl = findViewById(R.id.goToUrl);
        Button btnBack = findViewById(R.id.button_Back);

        btnUrl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(web);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                onBackPressed();
            }
        });


    }
}