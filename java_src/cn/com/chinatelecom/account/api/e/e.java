package cn.com.chinatelecom.account.api.e;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.ClientUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import com.umeng.analytics.pro.bm;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e {

    /* renamed from: l  reason: collision with root package name */
    private String f691l;

    /* renamed from: o  reason: collision with root package name */
    private int f694o;

    /* renamed from: q  reason: collision with root package name */
    private long f696q;

    /* renamed from: t  reason: collision with root package name */
    private int f699t;

    /* renamed from: w  reason: collision with root package name */
    private long f702w;

    /* renamed from: r  reason: collision with root package name */
    private long f697r = -1;

    /* renamed from: u  reason: collision with root package name */
    private StringBuffer f700u = new StringBuffer();

    /* renamed from: c  reason: collision with root package name */
    private String f682c = "";

    /* renamed from: e  reason: collision with root package name */
    private String f684e = "";

    /* renamed from: n  reason: collision with root package name */
    private String f693n = "";

    /* renamed from: m  reason: collision with root package name */
    private String f692m = "";

    /* renamed from: p  reason: collision with root package name */
    private String f695p = "";

    /* renamed from: a  reason: collision with root package name */
    private String f680a = j1.b.f69563b;

    /* renamed from: v  reason: collision with root package name */
    private long f701v = SystemClock.uptimeMillis();

    /* renamed from: b  reason: collision with root package name */
    private String f681b = a(System.currentTimeMillis());

    /* renamed from: d  reason: collision with root package name */
    private String f683d = CtAuth.mAppId;

    /* renamed from: f  reason: collision with root package name */
    private String f685f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f686g = Build.BRAND;

    /* renamed from: h  reason: collision with root package name */
    private String f687h = Build.MODEL;

    /* renamed from: i  reason: collision with root package name */
    private String f688i = "Android";

    /* renamed from: j  reason: collision with root package name */
    private String f689j = Build.VERSION.RELEASE;

    /* renamed from: k  reason: collision with root package name */
    private String f690k = ClientUtils.getSdkVersion();

    /* renamed from: s  reason: collision with root package name */
    private String f698s = "0";

    public e(String str) {
        this.f691l = str;
    }

    public static String a(long j4) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA).format(new Date(j4));
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public e a(int i4) {
        this.f694o = i4;
        return this;
    }

    public e a(String str) {
        this.f684e = str;
        return this;
    }

    public String a() {
        return this.f691l;
    }

    public e b(int i4) {
        this.f699t = i4;
        return this;
    }

    public e b(long j4) {
        if (j4 > 0) {
            this.f696q = j4;
        }
        return this;
    }

    public e b(String str) {
        this.f685f = str;
        return this;
    }

    public void b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f702w = uptimeMillis;
        if (this.f697r == -1) {
            this.f697r = uptimeMillis - this.f701v;
        }
    }

    public e c(String str) {
        this.f692m = str;
        return this;
    }

    public e d(String str) {
        this.f693n = str;
        return this;
    }

    public e e(String str) {
        this.f695p = str;
        return this;
    }

    public e f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f698s = str;
        }
        return this;
    }

    public e g(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuffer stringBuffer = this.f700u;
            stringBuffer.append(str);
            stringBuffer.append(";");
        }
        return this;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", this.f680a);
            jSONObject.put(bm.aM, this.f681b);
            jSONObject.put("tag", this.f682c);
            jSONObject.put("ai", this.f683d);
            jSONObject.put("di", this.f684e);
            jSONObject.put("ns", this.f685f);
            jSONObject.put("br", this.f686g);
            jSONObject.put("ml", this.f687h);
            jSONObject.put(bm.f63463x, this.f688i);
            jSONObject.put("ov", this.f689j);
            jSONObject.put(m.a.f71496j, this.f690k);
            jSONObject.put("ri", this.f691l);
            jSONObject.put("api", this.f692m);
            jSONObject.put("p", this.f693n);
            jSONObject.put("rt", this.f694o);
            jSONObject.put("msg", this.f695p);
            jSONObject.put("st", this.f696q);
            jSONObject.put("tt", this.f697r);
            jSONObject.put("ot", this.f698s);
            jSONObject.put("rec", this.f699t);
            jSONObject.put("ep", this.f700u.toString());
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
