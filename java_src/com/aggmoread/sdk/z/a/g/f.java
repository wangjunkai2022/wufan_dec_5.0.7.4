package com.aggmoread.sdk.z.a.g;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private String f2116a;

    /* renamed from: b  reason: collision with root package name */
    private int f2117b;

    /* renamed from: c  reason: collision with root package name */
    private int f2118c;

    /* renamed from: d  reason: collision with root package name */
    private a f2119d = com.aggmoread.sdk.z.a.h.a.d().b();

    public JSONObject a(Context context) {
        this.f2116a = TextUtils.isEmpty(this.f2119d.n()) ? com.aggmoread.sdk.z.a.p.e.b(context) : this.f2119d.n();
        this.f2117b = com.aggmoread.sdk.z.a.p.e.c(context);
        this.f2118c = com.aggmoread.sdk.z.a.p.e.e(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f2116a);
            jSONObject.put("connectionType", this.f2117b);
            jSONObject.put("operatorType", this.f2118c);
            Location j4 = this.f2119d.j();
            if (j4 != null) {
                double latitude = j4.getLatitude();
                double longitude = j4.getLongitude();
                jSONObject.put(com.umeng.analytics.pro.f.C, latitude);
                jSONObject.put("lon", longitude);
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "JuHeApiNetwork{ip='" + this.f2116a + "', connectionType=" + this.f2117b + ", operatorType=" + this.f2118c + '}';
    }
}
