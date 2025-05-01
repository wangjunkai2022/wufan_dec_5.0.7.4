package com.wufun.union.ad;

import android.app.Activity;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public abstract class AdChannel {

    /* renamed from: c  reason: collision with root package name */
    protected Type f65578c;

    /* renamed from: d  reason: collision with root package name */
    protected a f65579d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f65580e;

    /* renamed from: g  reason: collision with root package name */
    protected int f65582g;

    /* renamed from: h  reason: collision with root package name */
    protected String f65583h;

    /* renamed from: i  reason: collision with root package name */
    protected String f65584i;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f65576a = false;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f65577b = false;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f65581f = false;

    /* loaded from: classes6.dex */
    public enum Type {
        TT(0),
        GDT(1),
        UNKNOWN(-1);
        
        public int val;

        Type(int i4) {
            this.val = i4;
        }

        public static Type parse(int i4) {
            Type type = TT;
            if (i4 == type.val) {
                return type;
            }
            Type type2 = GDT;
            return i4 == type2.val ? type2 : UNKNOWN;
        }
    }

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i4, String str);
    }

    public a a() {
        return this.f65579d;
    }

    public int b() {
        return this.f65582g;
    }

    public String c() {
        return this.f65584i;
    }

    public abstract void d(Context context, String str);

    public boolean e() {
        return this.f65577b;
    }

    public boolean f() {
        return this.f65576a;
    }

    public void g(String str) {
        h(str, 1080.0f, 1920.0f);
    }

    public Type getType() {
        return this.f65578c;
    }

    public abstract void h(String str, float f5, float f6);

    public void i(int i4, Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("type", Integer.valueOf(this.f65578c.val));
            jSONObject.putOpt("event", Integer.valueOf(i4));
            jSONObject.putOpt("result", obj);
            jSONObject.putOpt("message", str);
            a aVar = this.f65579d;
            if (aVar != null) {
                aVar.a(i4, jSONObject.toString());
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    public void j(a aVar) {
        this.f65579d = aVar;
    }

    public void k(int i4) {
        this.f65582g = i4;
    }

    public void l(String str) {
        this.f65584i = str;
    }

    public abstract void m(Activity activity);
}
