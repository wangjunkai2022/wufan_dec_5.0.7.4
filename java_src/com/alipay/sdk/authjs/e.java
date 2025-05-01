package com.alipay.sdk.authjs;

import android.widget.Toast;
import com.alipay.sdk.authjs.a;
import java.util.Timer;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f4808b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f4809c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d dVar, a aVar) {
        this.f4809c = dVar;
        this.f4808b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f4809c;
        a aVar = this.f4808b;
        if (aVar != null && com.papa.controller.component.bluetooth.spp.c.f57968o.equals(aVar.f4795c)) {
            JSONObject jSONObject = aVar.f4797e;
            String optString = jSONObject.optString("content");
            int i4 = jSONObject.optInt("duration") < 2500 ? 0 : 1;
            Toast.makeText(dVar.f4807b, optString, i4).show();
            new Timer().schedule(new f(dVar, aVar), i4);
        }
        a.EnumC0158a enumC0158a = a.EnumC0158a.NONE_ERROR;
    }
}
