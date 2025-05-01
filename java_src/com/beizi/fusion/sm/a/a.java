package com.beizi.fusion.sm.a;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.beizi.fusion.sm.a.a.l;
/* compiled from: DeviceID.java */
/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private Application f7078a;

    /* renamed from: b  reason: collision with root package name */
    private String f7079b;

    /* compiled from: DeviceID.java */
    /* renamed from: com.beizi.fusion.sm.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0199a {

        /* renamed from: a  reason: collision with root package name */
        static final a f7080a = new a();
    }

    public static void a(Application application) {
        if (application == null) {
            return;
        }
        a aVar = C0199a.f7080a;
        aVar.f7078a = application;
        a(application, aVar);
    }

    @Override // com.beizi.fusion.sm.a.c
    public void a(Exception exc) {
    }

    private a() {
    }

    public static void a(Context context, c cVar) {
        l.a(context).a(cVar);
    }

    public static boolean a(Context context) {
        return l.a(context).a();
    }

    @Override // com.beizi.fusion.sm.a.c
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            a(new e("OAID is empty"));
        } else {
            this.f7079b = str;
        }
    }
}
