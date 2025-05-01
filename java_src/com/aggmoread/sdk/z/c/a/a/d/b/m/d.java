package com.aggmoread.sdk.z.c.a.a.d.b.m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.aggmoread.sdk.z.c.a.a.e.p;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class d extends TextView {
    public d(Context context) {
        super(context);
        a();
    }

    protected void a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(180, 140, 140, 140));
        gradientDrawable.setCornerRadius(p.a(6.0d) * 1.0f);
        setBackground(gradientDrawable);
        setTextColor(-1);
        setTextSize(2, 13.0f);
        setGravity(17);
        setLayoutParams(new FrameLayout.LayoutParams(p.a(85.0d), p.a(35.0d)));
    }
}
