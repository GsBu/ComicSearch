package com.example.gs.comicsearch.search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.gs.comicsearch.R;
import com.example.gs.comicsearch.base.BaseActivity;

public class SearchActivity extends BaseActivity {

    public static void showActivity(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, SearchActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onInitParams(Bundle bundle) {

    }

    @Override
    protected void setupViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_search);
    }
}
