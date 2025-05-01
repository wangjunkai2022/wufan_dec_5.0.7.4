package com.cmic.sso.sdk.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.a.b;
import com.cmic.sso.sdk.e.k;
/* compiled from: UmcConfigManager.java */
/* loaded from: classes2.dex */
public class c implements b.a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static c f9115a;

    /* renamed from: b  reason: collision with root package name */
    private a f9116b;

    /* renamed from: c  reason: collision with root package name */
    private a f9117c;

    /* renamed from: d  reason: collision with root package name */
    private b f9118d;

    /* renamed from: e  reason: collision with root package name */
    private Context f9119e;

    private c(Context context) {
        this.f9119e = context;
        b();
    }

    public static c a(Context context) {
        if (f9115a == null) {
            synchronized (c.class) {
                if (f9115a == null) {
                    f9115a = new c(context);
                }
            }
        }
        return f9115a;
    }

    private void b() {
        String b5 = k.b("sdk_config_version", "");
        if (!TextUtils.isEmpty(b5) && com.cmic.sso.sdk.auth.c.SDK_VERSION.equals(b5)) {
            b a5 = b.a(false);
            this.f9118d = a5;
            this.f9116b = a5.b();
        } else {
            b a6 = b.a(true);
            this.f9118d = a6;
            this.f9116b = a6.a();
            if (!TextUtils.isEmpty(b5)) {
                c();
            }
        }
        this.f9118d.a(this);
        this.f9117c = this.f9118d.a();
    }

    private void c() {
        com.cmic.sso.sdk.e.c.b("UmcConfigManager", "delete localConfig");
        this.f9118d.c();
    }

    public a a() {
        try {
            return this.f9116b.clone();
        } catch (CloneNotSupportedException unused) {
            return this.f9117c;
        }
    }

    @Override // com.cmic.sso.sdk.a.b.a
    public void a(a aVar) {
        this.f9116b = aVar;
    }

    public void a(com.cmic.sso.sdk.a aVar) {
        this.f9118d.a(aVar);
    }
}
