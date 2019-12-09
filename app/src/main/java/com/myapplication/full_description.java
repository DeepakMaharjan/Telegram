package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class full_description extends AppCompatActivity {

    CircleImageView imageProfilee;
    TextView tvNamee, tvMessagee, tvTimee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_description);

        imageProfilee = findViewById(R.id.imageProfilee);
        tvNamee = findViewById(R.id.tvNamee);
        tvMessagee = findViewById(R.id.tvMessagee);
        tvTimee = findViewById(R.id.tvTimee);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            imageProfilee.setImageResource(bundle.getInt("image"));
            tvNamee.setText(bundle.getString("name"));
            tvMessagee.setText(bundle.getString("message"));
            tvTimee.setText(bundle.getString("time"));
        }

    }
}
