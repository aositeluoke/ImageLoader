package com.aositeluoke.library.image;

import android.content.Context;
import android.widget.ImageView;

/**
 * 类描述:图片加载工具类,可以改变在init方法中更换Glide或Picasso
 * 作者:xues
 * 时间:2017年02月08日
 */

public class ImageLoaderUtil {
    private static IImageLoader loader;

    /**
     * 初始化
     *
     * @param context
     * @param clz     使用Glide或Picasso网络图片加载库，传GlideLoader.class或PicassoLoader.class
     * @param <T>     实现IImageLoader接口的实体类
     */
    public static <T extends IImageLoader> void init(Context context, Class<T> clz) {
        loader = ImageLoaderFactory.getImageLoaderTool(clz, context);
    }

    /**
     * 加载头像
     *
     * @param url
     * @param imageView
     */
    public static void loadHead(Object url, ImageView imageView) {
        loader.loadHead(url, imageView);
    }

    /**
     * 加载商品
     *
     * @param url
     * @param imageView
     */
    public static void loadProduct(Object url, ImageView imageView) {
        loader.loadProduct(url, imageView);
    }


    /**
     * 清楚缓存
     */
    public static void clearCache() {
        loader.clearCache();
    }
}
