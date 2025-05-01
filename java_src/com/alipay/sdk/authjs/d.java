package com.alipay.sdk.authjs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.sdk.authjs.a;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    c f4806a;

    /* renamed from: b  reason: collision with root package name */
    Context f4807b;

    public d(Context context, c cVar) {
        this.f4807b = context;
        this.f4806a = cVar;
    }

    private static /* synthetic */ a.EnumC0158a a(d dVar, a aVar) {
        if (aVar != null && com.papa.controller.component.bluetooth.spp.c.f57968o.equals(aVar.f4795c)) {
            JSONObject jSONObject = aVar.f4797e;
            String optString = jSONObject.optString("content");
            int i4 = jSONObject.optInt("duration") < 2500 ? 0 : 1;
            Toast.makeText(dVar.f4807b, optString, i4).show();
            new Timer().schedule(new f(dVar, aVar), i4);
        }
        return a.EnumC0158a.NONE_ERROR;
    }

    private static void e(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private void f(String str) {
        JSONObject jSONObject;
        String string;
        String str2 = null;
        try {
            jSONObject = new JSONObject(str);
            string = jSONObject.getString(a.f4789k);
        } catch (Exception unused) {
        }
        try {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(a.f4790l);
            JSONObject jSONObject3 = jSONObject2 instanceof JSONObject ? jSONObject2 : null;
            String string2 = jSONObject.getString(a.f4791m);
            String string3 = jSONObject.getString(a.f4788j);
            a aVar = new a("call");
            aVar.f4794b = string3;
            aVar.f4795c = string2;
            aVar.f4797e = jSONObject3;
            aVar.f4793a = string;
            c(aVar);
        } catch (Exception unused2) {
            str2 = string;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            try {
                g(str2, a.EnumC0158a.RUNTIME_ERROR);
            } catch (JSONException unused3) {
            }
        }
    }

    private a.EnumC0158a h(a aVar) {
        if (aVar != null && com.papa.controller.component.bluetooth.spp.c.f57968o.equals(aVar.f4795c)) {
            JSONObject jSONObject = aVar.f4797e;
            String optString = jSONObject.optString("content");
            int i4 = jSONObject.optInt("duration") < 2500 ? 0 : 1;
            Toast.makeText(this.f4807b, optString, i4).show();
            new Timer().schedule(new f(this, aVar), i4);
        }
        return a.EnumC0158a.NONE_ERROR;
    }

    private void i(a aVar) {
        JSONObject jSONObject = aVar.f4797e;
        String optString = jSONObject.optString("content");
        int i4 = jSONObject.optInt("duration") < 2500 ? 0 : 1;
        Toast.makeText(this.f4807b, optString, i4).show();
        new Timer().schedule(new f(this, aVar), i4);
    }

    public final void c(a aVar) throws JSONException {
        if (aVar == null) {
            return;
        }
        if (TextUtils.isEmpty(aVar.f4795c)) {
            g(aVar.f4793a, a.EnumC0158a.INVALID_PARAMETER);
            return;
        }
        e eVar = new e(this, aVar);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            eVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(eVar);
        }
    }

    public final void g(String str, a.EnumC0158a enumC0158a) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", enumC0158a.ordinal());
        a aVar = new a(a.f4787i);
        aVar.f4797e = jSONObject;
        aVar.f4793a = str;
        this.f4806a.a(aVar);
    }
}
