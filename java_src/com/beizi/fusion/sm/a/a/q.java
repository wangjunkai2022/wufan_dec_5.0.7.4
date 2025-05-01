package com.beizi.fusion.sm.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: XiaomiImpl.java */
/* loaded from: classes2.dex */
public class q implements com.beizi.fusion.sm.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7110a;

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f7111b;

    /* renamed from: c  reason: collision with root package name */
    private Object f7112c;

    @SuppressLint({"PrivateApi"})
    public q(Context context) {
        this.f7110a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.f7111b = cls;
            this.f7112c = cls.newInstance();
        } catch (Exception e5) {
            com.beizi.fusion.sm.a.f.a(e5);
        }
    }

    private String b() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (String) this.f7111b.getMethod("getOAID", Context.class).invoke(this.f7112c, this.f7110a);
    }

    @Override // com.beizi.fusion.sm.a.d
    public boolean a() {
        return this.f7112c != null;
    }

    @Override // com.beizi.fusion.sm.a.d
    public void a(com.beizi.fusion.sm.a.c cVar) {
        if (this.f7110a == null || cVar == null) {
            return;
        }
        if (this.f7111b != null && this.f7112c != null) {
            try {
                String b5 = b();
                if (b5 != null && b5.length() != 0) {
                    com.beizi.fusion.sm.a.f.a("OAID query success: " + b5);
                    cVar.a(b5);
                    return;
                }
                throw new com.beizi.fusion.sm.a.e("OAID query failed");
            } catch (Exception e5) {
                com.beizi.fusion.sm.a.f.a(e5);
                cVar.a(e5);
                return;
            }
        }
        cVar.a(new com.beizi.fusion.sm.a.e("Xiaomi IdProvider not exists"));
    }
}
