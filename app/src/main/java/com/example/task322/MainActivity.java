package com.example.task322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button btn_switching;
    private RelativeLayout normal_layout;
    private RelativeLayout engineer_layout;
    private boolean start_normal = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn_switching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (start_normal) {
                    normal_layout.setVisibility(View.GONE);
                    engineer_layout.setVisibility(View.VISIBLE);
                    start_normal = false;
                    btn_switching.setText(getString(R.string.text_ordinary));
                } else {
                    normal_layout.setVisibility(View.VISIBLE);
                    engineer_layout.setVisibility(View.GONE);
                    start_normal = true;
                    btn_switching.setText(getString(R.string.text_engineer));
                }
            }
        });
    }

    private void initView() {
        btn_switching = findViewById(R.id.btn_switching);
        normal_layout = findViewById(R.id.normal_layout);
        engineer_layout = findViewById(R.id.engineer_layout);
    }
}
