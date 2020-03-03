package com.weifeng.android.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.weifeng.android.livedata.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    private TextView clickNumShowTv;
    private Button clickBtn;

    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initClickListener();
        initData();
    }

    private void initData() {
        viewModel  = new MainActivityViewModel();
        viewModel.getClickNumLiveData().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                clickNumShowTv.setText(String.valueOf(integer));
            }
        });

    }

    private void initView() {
        clickNumShowTv = findViewById(R.id.tv_num_show);
        clickBtn = findViewById(R.id.btn_click);
    }

    private void initClickListener() {
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.addClickNum();
            }
        });
    }





}
