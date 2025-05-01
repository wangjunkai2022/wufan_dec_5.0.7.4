package com.alipay.sdk.authjs;

import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class f extends TimerTask {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f4810b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f4811c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(d dVar, a aVar) {
        this.f4811c = dVar;
        this.f4810b = aVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("toastCallBack", "true");
        } catch (JSONException unused) {
        }
        a aVar = new a(a.f4787i);
        aVar.f4793a = this.f4810b.f4793a;
        aVar.f4797e = jSONObject;
        this.f4811c.f4806a.a(aVar);
    }
}
