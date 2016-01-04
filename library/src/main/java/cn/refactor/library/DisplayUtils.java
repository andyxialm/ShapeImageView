package cn.refactor.library;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;

/**
 * 作者 : andy
 * 日期 : 15/12/23 10:14
 * 邮箱 : andyxialm@gmail.com
 * 描述 :
 */
public class DisplayUtils {

    public static int dp2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    public static Bitmap zoom(Bitmap bitmap, int targetWidth, int targetHeight) {
        float scaleVal = getScaleVal(bitmap, targetWidth, targetHeight);
        Matrix matrix = new Matrix();
        matrix.postScale(scaleVal, scaleVal);
        Bitmap resizeBmp = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        return resizeBmp;
    }

    private static float getScaleVal(Bitmap bitmap, float targetWidth, float targetHeight) {
        if (bitmap == null) {
            return 0;
        }
        try {
            int srcWidth = bitmap.getWidth();
            int srcHeight = bitmap.getHeight();
            float scaleVal = Math.max(targetWidth / srcWidth, targetHeight / srcHeight);
            return scaleVal;
        } catch (Exception e) {
            return 0;
        }

    }
}
