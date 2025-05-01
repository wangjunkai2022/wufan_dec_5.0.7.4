package com.yatoooon.screenadaptation;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
/* compiled from: ScreenAdapterTools.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static com.yatoooon.screenadaptation.a f68481a;

    /* compiled from: ScreenAdapterTools.java */
    /* loaded from: classes6.dex */
    static class a implements b {
        a() {
        }

        @Override // com.yatoooon.screenadaptation.e.b
        public com.yatoooon.screenadaptation.a a(Context context, int i4, int i5, float f5, String str) {
            return new d(context, i4, i5, f5, str);
        }
    }

    /* compiled from: ScreenAdapterTools.java */
    /* loaded from: classes6.dex */
    public interface b {
        com.yatoooon.screenadaptation.a a(Context context, int i4, int i5, float f5, String str);
    }

    public static com.yatoooon.screenadaptation.a a() {
        return f68481a;
    }

    public static void b(Context context) {
        c(context, new a());
    }

    public static void c(Context context, b bVar) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            applicationInfo = null;
        }
        f68481a = bVar.a(context, applicationInfo.metaData.getInt("designwidth"), applicationInfo.metaData.getInt("designdpi"), applicationInfo.metaData.getFloat("fontsize"), applicationInfo.metaData.getString("unit"));
    }
}
