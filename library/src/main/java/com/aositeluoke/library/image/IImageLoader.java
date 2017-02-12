package com.aositeluoke.library.image;

import android.content.Context;
import android.widget.ImageView;

/**
 * 类描述:图片加载接口
 * 作者:xues
 * 时间:2017年02月07日
 */

public interface IImageLoader {
    /**
     * 图片加载器初始化
     *
     * @param context
     */
    public void init(Context context);

    /**
     * 加载头像
     *
     * @param url
     * @param imageView
     */
    public void loadHead(Object url, ImageView imageView);

    /**
     * 加载商品
     *
     * @param url
     * @param imageView
     */
    public void loadProduct(Object url, ImageView imageView);


    /**
     * 清楚缓存
     */
    public void clearCache();
}
