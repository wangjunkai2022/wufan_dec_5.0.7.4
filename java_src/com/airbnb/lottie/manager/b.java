package com.airbnb.lottie.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.d;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.utils.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ImageAssetManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f3900e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f3901a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3902b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private d f3903c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, o0> f3904d;

    public b(Drawable.Callback callback, String str, d dVar, Map<String, o0> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f3902b = str + '/';
        } else {
            this.f3902b = str;
        }
        if (!(callback instanceof View)) {
            com.airbnb.lottie.utils.d.e("LottieDrawable must be inside of a view for images to work.");
            this.f3904d = new HashMap();
            this.f3901a = null;
            return;
        }
        this.f3901a = ((View) callback).getContext();
        this.f3904d = map;
        e(dVar);
    }

    private Bitmap d(String str, @Nullable Bitmap bitmap) {
        synchronized (f3900e) {
            this.f3904d.get(str).h(bitmap);
        }
        return bitmap;
    }

    @Nullable
    public Bitmap a(String str) {
        o0 o0Var = this.f3904d.get(str);
        if (o0Var == null) {
            return null;
        }
        Bitmap a5 = o0Var.a();
        if (a5 != null) {
            return a5;
        }
        d dVar = this.f3903c;
        if (dVar != null) {
            Bitmap a6 = dVar.a(o0Var);
            if (a6 != null) {
                d(str, a6);
            }
            return a6;
        }
        String c5 = o0Var.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (c5.startsWith("data:") && c5.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(c5.substring(c5.indexOf(44) + 1), 0);
                return d(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e5) {
                com.airbnb.lottie.utils.d.f("data URL did not have correct base64 format.", e5);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f3902b)) {
                AssetManager assets = this.f3901a.getAssets();
                try {
                    return d(str, h.m(BitmapFactory.decodeStream(assets.open(this.f3902b + c5), null, options), o0Var.f(), o0Var.d()));
                } catch (IllegalArgumentException e6) {
                    com.airbnb.lottie.utils.d.f("Unable to decode image.", e6);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e7) {
            com.airbnb.lottie.utils.d.f("Unable to open asset.", e7);
            return null;
        }
    }

    @Nullable
    public o0 b(String str) {
        return this.f3904d.get(str);
    }

    public boolean c(Context context) {
        return (context == null && this.f3901a == null) || this.f3901a.equals(context);
    }

    public void e(@Nullable d dVar) {
        this.f3903c = dVar;
    }

    @Nullable
    public Bitmap f(String str, @Nullable Bitmap bitmap) {
        if (bitmap == null) {
            o0 o0Var = this.f3904d.get(str);
            Bitmap a5 = o0Var.a();
            o0Var.h(null);
            return a5;
        }
        Bitmap a6 = this.f3904d.get(str).a();
        d(str, bitmap);
        return a6;
    }
}
