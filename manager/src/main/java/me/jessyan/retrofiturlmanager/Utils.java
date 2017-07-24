package me.jessyan.retrofiturlmanager;

import okhttp3.HttpUrl;

/**
 * Created by yu on 2017/7/24.
 */
public class Utils {

    private Utils() {
        throw new IllegalStateException("do not instantiation me");
    }

    public static HttpUrl checkUrl(String url) {
        HttpUrl parseUrl = HttpUrl.parse(url);
        if (null == parseUrl) {
            throw new InvalidUrlException(url);
        } else {
            return parseUrl;
        }
    }
}
