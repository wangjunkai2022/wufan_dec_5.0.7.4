package com.alipay.sdk.data;

import android.content.Context;
import com.alipay.sdk.util.i;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f4863b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f4864c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, Context context) {
        this.f4864c = aVar;
        this.f4863b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.alipay.sdk.packet.b a5 = new com.alipay.sdk.packet.impl.b().a(this.f4863b);
            if (a5 != null) {
                this.f4864c.e(a5.f4891b);
                a aVar = this.f4864c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout", aVar.a());
                jSONObject.put(a.f4859j, aVar.f4862b);
                i.c(m.b.b().f71504a, a.f4856g, jSONObject.toString());
            }
        } catch (Throwable unused) {
        }
    }
}
