package com.example.jiangchuanfa.a321yingyin.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.jiangchuanfa.a321yingyin.base.BaseFragment;

/**
 * Created by crest on 2017/5/19.
 */

public class LocalAudioFragment extends BaseFragment {
    private TextView textView;
    @Override
    public View initView() {
        Log.e("TAG","本地音频ui初始化了。。");
        textView = new TextView(context);
        textView.setTextColor(Color.RED);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(25);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG","本地音频数据初始化了。。");
        textView.setText("本地音频");
    }
}

