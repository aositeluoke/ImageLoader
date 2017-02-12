package com.aositeluoke.library.image;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.aositeluoke.library.R;
import com.squareup.picasso.Picasso;

/**
 * 类描述:Picasso图片加载包装类
 * 作者:xues
 * 时间:2017年02月08日
 */

public class PicassoLoader implements IImageLoader {
    @Override
    public void init(Context context) {
    }

    @Override
    public void loadHead(Object url, ImageView imageView) {
        loadPicture(url, imageView, R.drawable.default_header, R.drawable.default_header);
    }

    @Override
    public void loadProduct(Object url, ImageView imageView) {
        loadPicture(url, imageView, R.drawable.default_image, R.drawable.default_image);
    }

    @Override
    public void clearCache() {

    }

    /**
     * 加载网络图片
     *
     * @param url         网络地址
     * @param imageView   目标控件
     * @param placeholder 占位符
     * @param error       加载失败显示的图片
     */
    private void loadPicture(@NonNull Object url, @NonNull ImageView imageView, @NonNull int placeholder, @NonNull int error) {
        Picasso.with(imageView.getContext())
                .load(url.toString())
                .placeholder(placeholder)//占位符
                .error(error)//错误时显示的图片
                .noFade()       //设置淡入淡出效果
                .into(imageView);
    }
}
