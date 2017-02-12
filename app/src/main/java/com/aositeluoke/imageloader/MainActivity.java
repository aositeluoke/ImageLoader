package com.aositeluoke.imageloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.aositeluoke.library.image.ImageLoaderUtil;

public class MainActivity extends AppCompatActivity {
    private String url = "https://img12.360buyimg.com/n4/s260x260_jfs/t3838/283/508800763/116936/36c781c7/58130399N3f8dfe90.jpg";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewByID(R.id.iv_product);
        ImageLoaderUtil.loadProduct(url, imageView);

    }


    private <T extends View> T findViewByID(int id) {
        return ((T) findViewById(id));
    }
}
