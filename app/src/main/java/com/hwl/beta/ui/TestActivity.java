package com.hwl.beta.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.hwl.beta.R;
import com.hwl.beta.emotion.EmotionDefaultPannel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/4.
 */

public class TestActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        EmotionDefaultPannel edpEmotion = findViewById(R.id.ecp_emotion);
        edpEmotion.setEditTextFocus(false);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();

        View view = getWindow().getDecorView();
        WindowManager.LayoutParams lp = (WindowManager.LayoutParams) view.getLayoutParams();
        lp.gravity = Gravity.BOTTOM;
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        getWindowManager().updateViewLayout(view, lp);
    }
//    private List<MultiImageView.ImageBean> getImageUrls() {
//        List<MultiImageView.ImageBean> urls = new ArrayList<>();
////        urls.add(new MultiImageView.ImageBean(439,300,"http://img2.imgtn.bdimg.com/it/u=114139281,1353799337&fm=27&gp=0.jpg"));
//        urls.add(new MultiImageView.ImageBean(590,300,"http://image.uisdc.com/wp-content/uploads/2014/12/20141212164404274-590x300.jpg"));
//        urls.add(new MultiImageView.ImageBean(1160,653,"http://pic.pptbz.com/201506/2015070581208537.JPG"));
//        return urls;
//    }
}
