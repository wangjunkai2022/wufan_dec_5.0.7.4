package com.kuaishou.weapon.p0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class v {

    /* renamed from: h  reason: collision with root package name */
    public static JSONObject f55730h = null;

    /* renamed from: i  reason: collision with root package name */
    public static final String f55731i = "1";

    /* renamed from: j  reason: collision with root package name */
    public static final String f55732j = "2";

    /* renamed from: k  reason: collision with root package name */
    public static final String f55733k = "3";

    /* renamed from: l  reason: collision with root package name */
    public static final String f55734l = "4";

    /* renamed from: m  reason: collision with root package name */
    public static final String f55735m = "5";

    /* renamed from: n  reason: collision with root package name */
    public static final String f55736n = "6";

    /* renamed from: o  reason: collision with root package name */
    public static final String f55737o = "7";

    /* renamed from: a  reason: collision with root package name */
    public int f55738a;

    /* renamed from: b  reason: collision with root package name */
    public long f55739b;

    /* renamed from: c  reason: collision with root package name */
    public long f55740c;

    /* renamed from: d  reason: collision with root package name */
    public String f55741d;

    /* renamed from: e  reason: collision with root package name */
    public String f55742e;

    /* renamed from: f  reason: collision with root package name */
    public String f55743f;

    /* renamed from: g  reason: collision with root package name */
    public int f55744g;

    /* renamed from: p  reason: collision with root package name */
    private PackageInfo f55745p;

    /* renamed from: q  reason: collision with root package name */
    private ApplicationInfo f55746q;

    /* renamed from: r  reason: collision with root package name */
    private Context f55747r;

    public v(PackageInfo packageInfo, Context context) {
        this.f55745p = packageInfo;
        this.f55747r = context;
    }

    public int a() {
        return this.f55738a;
    }

    public String b() {
        return this.f55742e;
    }

    public String c() {
        return this.f55743f;
    }

    public long d() {
        return this.f55739b;
    }

    public String e() {
        return this.f55741d;
    }

    public long f() {
        return this.f55740c;
    }

    public int g() {
        return this.f55744g;
    }

    public void h() {
        PackageInfo packageInfo = this.f55745p;
        if (packageInfo == null && this.f55746q == null) {
            return;
        }
        if (packageInfo == null) {
            try {
                if (this.f55746q != null) {
                    this.f55745p = this.f55747r.getPackageManager().getPackageInfo(this.f55746q.packageName, 0);
                }
            } catch (Exception unused) {
            }
        }
        PackageInfo packageInfo2 = this.f55745p;
        a(packageInfo2 == null ? this.f55746q.packageName : packageInfo2.packageName);
        PackageInfo packageInfo3 = this.f55745p;
        a((packageInfo3 == null ? this.f55746q : packageInfo3.applicationInfo).flags & 1);
        b(j());
        PackageInfo packageInfo4 = this.f55745p;
        if (packageInfo4 != null) {
            a(packageInfo4.firstInstallTime);
            b(this.f55745p.lastUpdateTime);
            c(this.f55745p.versionName);
            b(this.f55745p.versionCode);
        }
    }

    public void i() {
        PackageInfo packageInfo = this.f55745p;
        if (packageInfo == null && this.f55746q == null) {
            return;
        }
        if (packageInfo == null) {
            try {
                if (this.f55746q != null) {
                    this.f55745p = this.f55747r.getPackageManager().getPackageInfo(this.f55746q.packageName, 0);
                }
            } catch (Exception unused) {
            }
        }
        PackageInfo packageInfo2 = this.f55745p;
        a(packageInfo2 == null ? this.f55746q.packageName : packageInfo2.packageName);
        PackageInfo packageInfo3 = this.f55745p;
        a((packageInfo3 == null ? this.f55746q : packageInfo3.applicationInfo).flags & 1);
        PackageInfo packageInfo4 = this.f55745p;
        if (packageInfo4 != null) {
            a(packageInfo4.firstInstallTime);
            b(this.f55745p.lastUpdateTime);
            c(this.f55745p.versionName);
            b(this.f55745p.versionCode);
        }
    }

    public String j() {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = this.f55745p;
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                String charSequence = applicationInfo.loadLabel(this.f55747r.getPackageManager()).toString();
                if (!TextUtils.isEmpty(charSequence)) {
                    return charSequence;
                }
            } else {
                ApplicationInfo applicationInfo2 = this.f55746q;
                if (applicationInfo2 != null) {
                    String charSequence2 = applicationInfo2.loadLabel(this.f55747r.getPackageManager()).toString();
                    if (!TextUtils.isEmpty(charSequence2)) {
                        return charSequence2;
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public JSONObject k() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("1", c());
            jSONObject.put("2", b());
            jSONObject.put("3", e());
            jSONObject.put("4", g());
            jSONObject.put("5", a());
            jSONObject.put("6", d());
            jSONObject.put("7", f());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(int i4) {
        this.f55738a = i4;
    }

    public void b(String str) {
        this.f55743f = str;
    }

    public void c(String str) {
        this.f55741d = str;
    }

    public void a(String str) {
        this.f55742e = str;
    }

    public void b(long j4) {
        this.f55740c = j4;
    }

    public v(ApplicationInfo applicationInfo, Context context) {
        this.f55746q = applicationInfo;
        this.f55747r = context;
    }

    public void a(long j4) {
        this.f55739b = j4;
    }

    public void b(int i4) {
        this.f55744g = i4;
    }
}
