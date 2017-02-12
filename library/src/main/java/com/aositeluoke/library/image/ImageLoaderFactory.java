package com.aositeluoke.library.image;

import android.content.Context;

/**
 * 类描述:采用工厂方法模式获取图片加载库
 * 作者:xues
 * 时间:2017年02月07日
 */

public class ImageLoaderFactory {

    /**
     * 获取加载网络图片工具  Glide或Picasso
     *
     * @param clz
     * @param context
     * @param <T>
     * @return
     */
    public static <T extends IImageLoader> T getImageLoaderTool(Class<T> clz, Context context) {
        try {
            IImageLoader imageLoader = (IImageLoader) Class.forName(clz.getName()).newInstance();
            imageLoader.init(context);
            return (T) imageLoader;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
