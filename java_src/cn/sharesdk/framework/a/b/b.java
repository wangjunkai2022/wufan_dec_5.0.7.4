package cn.sharesdk.framework.a.b;

import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.utils.Data;
/* compiled from: AuthEvent.java */
/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: m  reason: collision with root package name */
    private static int f871m;

    /* renamed from: n  reason: collision with root package name */
    private static long f872n;

    /* renamed from: a  reason: collision with root package name */
    public int f873a;

    /* renamed from: b  reason: collision with root package name */
    public String f874b;

    /* renamed from: c  reason: collision with root package name */
    public String f875c;

    /* renamed from: d  reason: collision with root package name */
    public String f876d;

    @Override // cn.sharesdk.framework.a.b.c
    protected String a() {
        return "[AUT]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void a(long j4) {
        f872n = j4;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected int c() {
        return 5;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long d() {
        return f871m;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected long e() {
        return f872n;
    }

    @Override // cn.sharesdk.framework.a.b.c
    protected void f() {
        f871m++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|');
        sb.append(this.f873a);
        sb.append('|');
        sb.append(this.f874b);
        sb.append('|');
        if (!TextUtils.isEmpty(this.f876d)) {
            try {
                String encodeToString = Base64.encodeToString(Data.AES128Encode(this.f878f.substring(0, 16), this.f876d), 0);
                if (!TextUtils.isEmpty(encodeToString) && encodeToString.contains("\n")) {
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
        if (!TextUtils.isEmpty(this.f875c)) {
            sb.append(this.f875c);
        }
        return sb.toString();
    }
}
