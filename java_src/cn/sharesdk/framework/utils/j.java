package cn.sharesdk.framework.utils;

import android.content.Context;
import com.mob.tools.utils.ResHelper;
/* compiled from: SizeHelper.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static float f1067a = 1.5f;

    /* renamed from: b  reason: collision with root package name */
    public static int f1068b = 540;

    /* renamed from: c  reason: collision with root package name */
    private static Context f1069c;

    public static void a(Context context) {
        Context context2 = f1069c;
        if (context2 == null || context2 != context.getApplicationContext()) {
            f1069c = context;
        }
    }

    public static int b(int i4) {
        return ResHelper.designToDevice(f1069c, f1068b, i4);
    }

    public static int a(int i4) {
        return ResHelper.designToDevice(f1069c, f1067a, i4);
    }
}
