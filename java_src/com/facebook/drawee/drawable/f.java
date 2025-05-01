package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;
/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public class f {
    @Nullable
    public static Drawable a(Drawable drawable) {
        if (drawable instanceof c) {
            return ((c) drawable).d();
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return null;
    }

    public static void b(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static int c(int i4) {
        int i5 = i4 >>> 24;
        if (i5 == 255) {
            return -1;
        }
        return i5 == 0 ? -2 : -3;
    }

    public static int d(int i4, int i5) {
        if (i5 == 255) {
            return i4;
        }
        if (i5 == 0) {
            return i4 & 16777215;
        }
        return (i4 & 16777215) | ((((i4 >>> 24) * (i5 + (i5 >> 7))) >> 8) << 24);
    }

    public static void e(@Nullable Drawable drawable, @Nullable Drawable.Callback callback, @Nullable t tVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof s) {
                ((s) drawable).h(tVar);
            }
        }
    }

    public static void f(@Nullable Drawable drawable, @Nullable e eVar) {
        if (drawable == null || eVar == null) {
            return;
        }
        eVar.a(drawable);
    }
}
