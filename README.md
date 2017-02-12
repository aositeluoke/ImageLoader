# 一行代码来回切换Glide和Picasso图片加载库
##使用教程
###1、在build.gradle文件中，添加仓库链接
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
###2、添加依赖
```
dependencies {
	        compile 'com.github.aositeluoke:ImageLoader:v1.0'
	}
```
###3、在Application的子类，onCreate方法中对图片加载库进行初始化
```
       ImageLoaderUtil.init(this, GlideLoader.class);
       //或ImageLoaderUtil.init(this, PicassoLoader.class);
```
###4、加载图片
```
 ImageLoaderUtil.loadProduct(url, imageView);
```
