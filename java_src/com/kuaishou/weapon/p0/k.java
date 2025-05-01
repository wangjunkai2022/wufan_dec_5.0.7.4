package com.kuaishou.weapon.p0;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class k<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private String f55597a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f55598b;

    /* renamed from: c  reason: collision with root package name */
    private j f55599c;

    /* renamed from: d  reason: collision with root package name */
    private Context f55600d;

    /* renamed from: e  reason: collision with root package name */
    private String f55601e;

    /* renamed from: f  reason: collision with root package name */
    private String f55602f;

    public k(Context context, String str, String str2, String str3, JSONObject jSONObject, j jVar) {
        this.f55600d = context;
        this.f55597a = str3;
        this.f55598b = jSONObject;
        this.f55599c = jVar;
        this.f55601e = str;
        this.f55602f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            l a5 = l.a(this.f55600d);
            m mVar = new m(this.f55597a, this.f55598b);
            mVar.a(this.f55601e);
            mVar.b(this.f55602f);
            a5.b(mVar, new j() { // from class: com.kuaishou.weapon.p0.k.1
                @Override // com.kuaishou.weapon.p0.j
                public void a(String str) {
                    e.c("WeaponHttpTask sendLog response: --- " + str);
                    if (k.this.f55599c != null) {
                        k.this.f55599c.a(str);
                    }
                }

                @Override // com.kuaishou.weapon.p0.j
                public void b(String str) {
                    e.c("WeaponHttpTask sendLog errorMsg: --- " + str);
                    if (k.this.f55599c != null) {
                        k.this.f55599c.b(str);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
