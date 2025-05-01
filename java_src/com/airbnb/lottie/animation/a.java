package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import com.airbnb.lottie.utils.g;
/* compiled from: LPaint.java */
/* loaded from: classes2.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i4) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((g.d(i4, 0, 255) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(g.d(i4, 0, 255));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }

    public a(int i4) {
        super(i4);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i4, PorterDuff.Mode mode) {
        super(i4);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
