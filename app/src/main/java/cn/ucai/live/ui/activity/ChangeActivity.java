package cn.ucai.live.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;

import cn.ucai.live.R;

/**
 * Created by Administrator on 2017/3/6.
 */
public class ChangeActivity extends BaseActivity{
    View loadingView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        loadingView = LayoutInflater.from(this).inflate(R.layout.rp_loading, null);

    }
}
