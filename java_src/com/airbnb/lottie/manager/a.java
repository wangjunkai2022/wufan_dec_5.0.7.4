package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.h;
import com.airbnb.lottie.utils.d;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FontAssetManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    private final AssetManager f3897d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private com.airbnb.lottie.c f3898e;

    /* renamed from: a  reason: collision with root package name */
    private final h<String> f3894a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<h<String>, Typeface> f3895b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Typeface> f3896c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private String f3899f = ".ttf";

    public a(Drawable.Callback callback, @Nullable com.airbnb.lottie.c cVar) {
        this.f3898e = cVar;
        if (!(callback instanceof View)) {
            d.e("LottieDrawable must be inside of a view for images to work.");
            this.f3897d = null;
            return;
        }
        this.f3897d = ((View) callback).getContext().getAssets();
    }

    private Typeface a(String str) {
        String b5;
        Typeface typeface = this.f3896c.get(str);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.c cVar = this.f3898e;
        Typeface a5 = cVar != null ? cVar.a(str) : null;
        com.airbnb.lottie.c cVar2 = this.f3898e;
        if (cVar2 != null && a5 == null && (b5 = cVar2.b(str)) != null) {
            a5 = Typeface.createFromAsset(this.f3897d, b5);
        }
        if (a5 == null) {
            a5 = Typeface.createFromAsset(this.f3897d, "fonts/" + str + this.f3899f);
        }
        this.f3896c.put(str, a5);
        return a5;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i4 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i4 ? typeface : Typeface.create(typeface, i4);
    }

    public Typeface b(String str, String str2) {
        this.f3894a.b(str, str2);
        Typeface typeface = this.f3895b.get(this.f3894a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e5 = e(a(str), str2);
        this.f3895b.put(this.f3894a, e5);
        return e5;
    }

    public void c(String str) {
        this.f3899f = str;
    }

    public void d(@Nullable com.airbnb.lottie.c cVar) {
        this.f3898e = cVar;
    }
}
