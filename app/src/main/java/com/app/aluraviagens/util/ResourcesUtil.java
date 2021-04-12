package com.app.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.app.aluraviagens.model.Pacote;

public class ResourcesUtil {
    public static Drawable devolveDrawable(Context context, String drawableEmTexto) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(drawableEmTexto,
                "drawable", context.getPackageName());
        return resources.getDrawable(idDoDrawable);
    }
}
