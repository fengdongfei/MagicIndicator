package net.lucode.hackware.magicindicator;

import android.content.Context;

/**
 * 博客: http://hackware.lucode.net
 * Created by hackware on 2016/6/26.
 */
public final class UIUtil {

    public static int dip2px(Context context, double dpValue) {
        final float density = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * density + 0.5);
    }

    public static int px2dip(Context context, double pxValue) {
        final float density = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / density + 0.5);
    }
}