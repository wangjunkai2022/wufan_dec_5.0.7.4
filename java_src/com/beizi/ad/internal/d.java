package com.beizi.ad.internal;

import android.content.Context;
import com.beizi.ad.R;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.StringUtil;
import com.umeng.analytics.pro.bm;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AdParameters.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    static HashSet<String> f5849a;

    /* renamed from: c  reason: collision with root package name */
    private String f5851c;

    /* renamed from: j  reason: collision with root package name */
    private String f5858j;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference<Context> f5862n;

    /* renamed from: o  reason: collision with root package name */
    private String f5863o;

    /* renamed from: b  reason: collision with root package name */
    private j f5850b = j.PREFETCH;

    /* renamed from: d  reason: collision with root package name */
    private int f5852d = 3;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5853e = false;

    /* renamed from: f  reason: collision with root package name */
    private int f5854f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f5855g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f5856h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f5857i = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5859k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5860l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5861m = false;

    public d(Context context, String str) {
        this.f5863o = "";
        this.f5862n = new WeakReference<>(context);
        this.f5863o = str;
    }

    public void a(boolean z4) {
        this.f5859k = z4;
    }

    public Context b() {
        if (this.f5862n.get() != null) {
            return this.f5862n.get();
        }
        return null;
    }

    public String c() {
        return this.f5851c;
    }

    public int d() {
        if (this.f5850b == j.BANNER) {
            return this.f5854f;
        }
        return -1;
    }

    public int e() {
        if (this.f5850b == j.BANNER) {
            return this.f5855g;
        }
        return -1;
    }

    public int f() {
        return this.f5856h;
    }

    public int g() {
        return this.f5857i;
    }

    public boolean h() {
        return this.f5853e;
    }

    public j i() {
        return this.f5850b;
    }

    public boolean j() {
        if (StringUtil.isEmpty(g.a().d()) || StringUtil.isEmpty(this.f5851c)) {
            HaoboLog.e(HaoboLog.baseLogTag, HaoboLog.getString(R.string.no_identification));
            return false;
        }
        return true;
    }

    public String k() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = b().getResources().getConfiguration().orientation == 2 ? bm.aK : "v";
            this.f5858j = str;
            if (!StringUtil.isEmpty(str)) {
                jSONObject.put("mOrientation", this.f5858j);
            }
            if (this.f5854f > 0 && this.f5855g > 0) {
                jSONObject.put("size", this.f5854f + "x" + this.f5855g);
            }
            int g4 = g();
            int f5 = f();
            if (g4 > 0 && f5 > 0) {
                j jVar = this.f5850b;
                j jVar2 = j.INTERSTITIAL;
                if (!jVar.equals(jVar2) && (this.f5854f < 0 || this.f5855g < 0)) {
                    jSONObject.put("max_size", f5 + "x" + g4);
                } else if (this.f5850b.equals(jVar2)) {
                    jSONObject.put("size", f5 + "x" + g4);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e5) {
            String str2 = HaoboLog.jsonLogTag;
            HaoboLog.e(str2, "Failed to encode adUnitParams, err = " + e5.getMessage());
            return "";
        }
    }

    public boolean l() {
        return this.f5861m;
    }

    public String a() {
        return this.f5863o;
    }

    public void c(int i4) {
        this.f5855g = i4;
    }

    public void a(String str) {
        this.f5851c = str;
    }

    public void b(int i4) {
        this.f5854f = i4;
    }

    public void c(boolean z4) {
        this.f5861m = z4;
    }

    public void d(int i4) {
        this.f5856h = i4;
    }

    public void e(int i4) {
        this.f5857i = i4;
    }

    public void a(int i4) {
        this.f5852d = i4;
    }

    public void b(boolean z4) {
        this.f5853e = z4;
    }

    public void a(j jVar) {
        this.f5850b = jVar;
    }
}
