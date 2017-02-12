package com.aositeluoke.library.image;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.aositeluoke.library.R;
import com.bumptech.glide.Glide;

/**
 * 类描述:Glide网络图片加载库
 * 作者:xues
 * 时间:2017年02月07日
 */

public class GlideLoader implements IImageLoader {
    private String TAG = GlideLoader.class.getSimpleName();
    private Context context;

    /**
     * 初始化Glide工具
     *
     * @param context
     */
    @Override
    public void init(Context context) {
        this.context = context;
    }

    /**
     * 加载头像
     *
     * @param url
     * @param imageView
     */
    @Override
    public void loadHead(Object url, ImageView imageView) {
        loadPicture(url, imageView, R.drawable.default_header, R.drawable.default_header);
    }

    /**
     * 加载商品图片
     *
     * @param url
     * @param imageView
     */
    @Override
    public void loadProduct(Object url, ImageView imageView) {
        loadPicture(url, imageView, R.drawable.default_image, R.drawable.default_image);
    }


    /**
     * 清空缓存
     */
    @Override
    public void clearCache() {
        Glide.get(context).clearMemory();
        Glide.get(context).clearDiskCache();
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
        Glide.with(imageView.getContext())
                .load(url)
                .crossFade(500)//淡入淡出动画
                //.bitmapTransform(new BlurTransformation(mContext, 23, 4))  // "23":模糊度；"4":图片缩放4倍后再进行模糊
                .placeholder(placeholder)//占位符
                //.dontAnimate();//是否使用动画效果
                .error(error)//加载失败显示的图片
                .into(imageView);
    }


}
