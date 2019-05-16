package com.example.gs.comicsearch.home;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.gs.comicsearch.R;
import com.example.gs.comicsearch.base.BaseActivity;
import com.example.gs.comicsearch.search.SearchActivity;
import com.example.gs.comicsearch.util.LightStatusBarUtil;
import com.example.gs.comicsearch.util.LogUtil;
import com.example.gs.comicsearch.util.StatusBarUtil;

public class HomeActivity extends BaseActivity implements View.OnClickListener {

    private TextView tvToolbarMainTitle;

    @Override
    protected void onInitParams(Bundle bundle) {

    }

    @Override
    protected void setupViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_home);

        StatusBarUtil.enableTranslucentStatusBar(this);
        LightStatusBarUtil.setLightStatusBar(this, true);

        tvToolbarMainTitle = (TextView)findViewById(R.id.tv_toolbar_main_title);
        tvToolbarMainTitle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.tv_toolbar_main_title:
                SearchActivity.showActivity(this);
                break;
            default:
                break;
        }
    }
}
