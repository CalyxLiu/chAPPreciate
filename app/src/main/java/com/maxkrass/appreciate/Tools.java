package com.maxkrass.appreciate;

import android.content.Context;
import android.util.TypedValue;

/**
 * Max made this for APPreciate on 19.12.2015.
 */
public class Tools {

    public static float dpToPixels(Context context, int dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

}
