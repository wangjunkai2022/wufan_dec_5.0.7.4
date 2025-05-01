package com.netease.nis.quicklogin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.netease.nis.basesdk.Logger;
/* compiled from: ViewIdHelper.java */
/* loaded from: classes5.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private static volatile h f57642c;

    /* renamed from: a  reason: collision with root package name */
    private Context f57643a;

    /* renamed from: b  reason: collision with root package name */
    private Resources f57644b;

    private h(Context context) {
        this.f57643a = null;
        if (context != null) {
            this.f57643a = context.getApplicationContext();
        }
        if (context != null) {
            this.f57644b = context.getResources();
        }
        LayoutInflater.from(context);
    }

    public static h a(Context context) {
        if (f57642c == null) {
            try {
                f57642c = new h(context);
            } catch (Exception e5) {
                Logger.e(e5.getMessage());
            }
        }
        return f57642c;
    }

    public Drawable b(String str) {
        int identifier;
        Resources resources = this.f57644b;
        if (resources == null || str == null || (identifier = resources.getIdentifier(str, "drawable", this.f57643a.getPackageName())) == 0) {
            return null;
        }
        return this.f57644b.getDrawable(identifier);
    }

    public int c(String str) {
        Resources resources = this.f57644b;
        if (resources == null || str == null) {
            return 0;
        }
        return resources.getIdentifier(str, "drawable", this.f57643a.getPackageName());
    }

    public int d(String str) {
        Resources resources = this.f57644b;
        if (resources != null) {
            return resources.getIdentifier(str, "layout", this.f57643a.getPackageName());
        }
        return 0;
    }

    public int a(String str) {
        Resources resources = this.f57644b;
        if (resources == null || str == null) {
            return 0;
        }
        return resources.getIdentifier(str, "anim", this.f57643a.getPackageName());
    }
}
