package com.beizi.fusion.sm.a.a;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Objects;
/* compiled from: CooseaImpl.java */
/* loaded from: classes2.dex */
public class c implements com.beizi.fusion.sm.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7085a;

    /* renamed from: b  reason: collision with root package name */
    private final KeyguardManager f7086b;

    public c(Context context) {
        this.f7085a = context;
        this.f7086b = (KeyguardManager) context.getSystemService("keyguard");
    }

    @Override // com.beizi.fusion.sm.a.d
    public boolean a() {
        KeyguardManager keyguardManager;
        if (this.f7085a == null || (keyguardManager = this.f7086b) == null) {
            return false;
        }
        try {
            Object invoke = keyguardManager.getClass().getDeclaredMethod("isSupported", new Class[0]).invoke(this.f7086b, new Object[0]);
            Objects.requireNonNull(invoke);
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e5) {
            com.beizi.fusion.sm.a.f.a(e5);
            return false;
        }
    }

    @Override // com.beizi.fusion.sm.a.d
    public void a(com.beizi.fusion.sm.a.c cVar) {
        if (this.f7085a == null || cVar == null) {
            return;
        }
        KeyguardManager keyguardManager = this.f7086b;
        if (keyguardManager == null) {
            cVar.a(new com.beizi.fusion.sm.a.e("KeyguardManager not found"));
            return;
        }
        try {
            Object invoke = keyguardManager.getClass().getDeclaredMethod("obtainOaid", new Class[0]).invoke(this.f7086b, new Object[0]);
            if (invoke != null) {
                String obj = invoke.toString();
                com.beizi.fusion.sm.a.f.a("OAID obtain success: " + obj);
                cVar.a(obj);
                return;
            }
            throw new com.beizi.fusion.sm.a.e("OAID obtain failed");
        } catch (Exception e5) {
            com.beizi.fusion.sm.a.f.a(e5);
        }
    }
}
