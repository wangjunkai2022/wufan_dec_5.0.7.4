package cn.sharesdk.framework.a.b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ShareEvent.java */
/* loaded from: classes2.dex */
public class f extends c {

    /* renamed from: o  reason: collision with root package name */
    private static int f893o;

    /* renamed from: p  reason: collision with root package name */
    private static long f894p;

    /* renamed from: a  reason: collision with root package name */
    public int f895a;

    /* renamed from: b  reason: collision with root package name */
    public String f896b;

    /* renamed from: c  reason: collision with root package name */
    public String f897c;

    /* renamed from: d  reason: collision with root package name */
    public a f898d = new a();

    /* renamed from: m  reason: collision with root package name */
    public String f899m;

    /* renamed from: n  reason: collision with root package name */
    public String[] f900n;

    /* compiled from: ShareEvent.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        public String f902b;

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, Object> f907g;

        /* renamed from: a  reason: collision with root package name */
        public String f901a = "";

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<String> f903c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<String> f904d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<String> f905e = new ArrayList<>();

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<Bitmap> f906f = new ArrayList<>();

        public String toString() {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.f902b)) {
                String replaceAll = this.f902b.trim().replaceAll("\r", "");
                this.f902b = replaceAll;
                String replaceAll2 = replaceAll.trim().replaceAll("\n", "");
                this.f902b = replaceAll2;
                this.f902b = replaceAll2.trim().replaceAll("\r\n", "");
            }
            hashMap.put("text", this.f902b);
            hashMap.put("url", this.f903c);
            ArrayList<String> arrayList = this.f904d;
            if (arrayList != null && arrayList.size() > 0) {
                hashMap.put("imgs", this.f904d);
            }
            if (this.f907g != null) {
                hashMap.put("attch", new Hashon().fromHashMap(this.f907g));
            }
            return new Hashon().fromHashMap(hashMap);
        }
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected String a() {
        return "[SHR]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void a(long j4) {
        f894p = j4;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int c() {
        return 30;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long d() {
        return f893o;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long e() {
        return f894p;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void f() {
        f893o++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|');
        sb.append(this.f895a);
        sb.append('|');
        sb.append(this.f896b);
        sb.append('|');
        sb.append(TextUtils.isEmpty(this.f897c) ? "" : this.f897c);
        String[] strArr = this.f900n;
        if (strArr == null || strArr.length <= 0) {
            str = "";
        } else {
            str = "[\"" + TextUtils.join("\",\"", this.f900n) + "\"]";
        }
        sb.append('|');
        sb.append(str);
        sb.append('|');
        a aVar = this.f898d;
        if (aVar != null) {
            try {
                String encodeToString = Base64.encodeToString(Data.AES128Encode(this.f878f.substring(0, 16), aVar.toString()), 0);
                if (encodeToString.contains("\n")) {
                    encodeToString = encodeToString.replace("\n", "");
                }
                sb.append(encodeToString);
            } catch (Throwable th) {
                SSDKLog.b().a(th);
            }
        }
        sb.append('|');
        if (!TextUtils.isEmpty(this.f884l)) {
            sb.append(this.f884l);
        }
        sb.append('|');
        if (!TextUtils.isEmpty(this.f899m)) {
            try {
                String encodeToString2 = Base64.encodeToString(Data.AES128Encode(this.f878f.substring(0, 16), this.f899m), 0);
                if (!TextUtils.isEmpty(encodeToString2) && encodeToString2.contains("\n")) {
                    encodeToString2 = encodeToString2.replace("\n", "");
                }
                sb.append(encodeToString2);
            } catch (Throwable th2) {
                SSDKLog.b().b(th2);
            }
        }
        return sb.toString();
    }
}
