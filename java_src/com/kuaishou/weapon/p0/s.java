package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
/* loaded from: classes5.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public int f55657a;

    /* renamed from: b  reason: collision with root package name */
    public int f55658b;

    /* renamed from: c  reason: collision with root package name */
    public String f55659c;

    /* renamed from: d  reason: collision with root package name */
    public String f55660d;

    /* renamed from: e  reason: collision with root package name */
    public String f55661e;

    /* renamed from: f  reason: collision with root package name */
    public Context f55662f;

    /* renamed from: g  reason: collision with root package name */
    public ClassLoader f55663g;

    /* renamed from: h  reason: collision with root package name */
    public String f55664h;

    /* renamed from: i  reason: collision with root package name */
    public String f55665i;

    /* renamed from: j  reason: collision with root package name */
    public String f55666j;

    /* renamed from: k  reason: collision with root package name */
    public String f55667k;

    /* renamed from: l  reason: collision with root package name */
    public ActivityInfo[] f55668l;

    /* renamed from: m  reason: collision with root package name */
    public String f55669m;

    /* renamed from: n  reason: collision with root package name */
    public String f55670n;

    /* renamed from: o  reason: collision with root package name */
    public String f55671o;

    /* renamed from: p  reason: collision with root package name */
    public int f55672p;

    /* renamed from: q  reason: collision with root package name */
    public int f55673q;

    /* renamed from: r  reason: collision with root package name */
    public PackageInfo f55674r;

    /* renamed from: s  reason: collision with root package name */
    public long f55675s;

    /* renamed from: t  reason: collision with root package name */
    public int f55676t;

    /* renamed from: u  reason: collision with root package name */
    public int f55677u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f55678v;

    /* renamed from: w  reason: collision with root package name */
    public int f55679w;

    /* renamed from: x  reason: collision with root package name */
    public int f55680x = -1;

    /* renamed from: y  reason: collision with root package name */
    public boolean f55681y;

    public s() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s sVar = (s) obj;
            String str = this.f55659c;
            if (str == null) {
                if (sVar.f55659c != null) {
                    return false;
                }
            } else if (!str.equals(sVar.f55659c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f55659c;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public s(PackageInfo packageInfo, int i4, String str, String str2, String str3, String str4) {
        this.f55674r = packageInfo;
        this.f55657a = i4;
        this.f55659c = str;
        this.f55660d = str2;
        this.f55665i = str3;
        this.f55666j = str4;
    }
}
