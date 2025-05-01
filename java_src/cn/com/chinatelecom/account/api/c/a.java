package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.ResultListener;
import cn.com.chinatelecom.account.api.d.g;
import cn.com.chinatelecom.account.api.e.f;
import cn.com.chinatelecom.account.api.e.g;
import cn.com.chinatelecom.account.api.e.h;
import cn.com.chinatelecom.account.api.e.j;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.kuaishou.weapon.p0.t;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f572a = "a";

    /* renamed from: b  reason: collision with root package name */
    private boolean f573b = false;

    /* renamed from: c  reason: collision with root package name */
    private Context f574c;

    /* renamed from: d  reason: collision with root package name */
    private String f575d;

    /* renamed from: e  reason: collision with root package name */
    private String f576e;

    /* renamed from: f  reason: collision with root package name */
    private c f577f;

    public a(Context context, String str, String str2) {
        this.f574c = context;
        this.f575d = str;
        this.f576e = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(Context context, String str, String str2, String str3, CtSetting ctSetting, Network network, String str4, String str5, int i4) {
        String b5;
        String b6;
        boolean z4;
        try {
            long a5 = cn.com.chinatelecom.account.api.e.a.a(context);
            if (i4 == cn.com.chinatelecom.account.api.a.f534d) {
                b5 = h.a();
                b6 = h.a(context, str, str2, str3, a5, "");
            } else {
                b5 = h.b();
                b6 = h.b(context, str, str2, str3, a5, "");
            }
            if (g.a() != null) {
                b5 = b5.replace(cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.e.b.f673f), g.a());
            }
            JSONObject jSONObject = new JSONObject(b6);
            String optString = jSONObject.optString("p");
            String optString2 = jSONObject.optString(t.f55682a);
            g.a aVar = new g.a();
            aVar.a(str5);
            aVar.a(false, cn.com.chinatelecom.account.api.d.c.a(), cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.e.b.f673f));
            aVar.b(str4);
            aVar.a(network);
            aVar.a(CtSetting.getConnTimeout(ctSetting));
            aVar.b(CtSetting.getReadTimeout(ctSetting));
            cn.com.chinatelecom.account.api.d.g a6 = aVar.a();
            cn.com.chinatelecom.account.api.d.b bVar = new cn.com.chinatelecom.account.api.d.b(context);
            cn.com.chinatelecom.account.api.d.h a7 = bVar.a(b5, optString, 1, a6);
            if (a7.f665d) {
                synchronized (this) {
                    z4 = this.f573b;
                }
                if (!z4) {
                    cn.com.chinatelecom.account.api.d.h a8 = bVar.a(b5, optString, 1, aVar.a(true).a(false, "", "").a());
                    f.a(str4).b(1);
                    a7 = a8;
                }
            }
            JSONObject a9 = cn.com.chinatelecom.account.api.e.a.a(context, a7, optString2, network, true, str4);
            f.b(str4, a9, optString);
            return a9;
        } catch (Throwable th) {
            JSONObject g4 = j.g();
            cn.com.chinatelecom.account.api.e.e a10 = f.a(str4);
            a10.g("gpm ：" + th.getMessage()).a(80102).e(cn.com.chinatelecom.account.api.a.d.a(j.f726k));
            CtAuth.warn(f572a, "GPM Throwable", th);
            return g4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        c cVar = this.f577f;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, String str, String str2, long j4, String str3, ResultListener resultListener) {
        f.a(str2).a(i4).e(str).b(j4).g(str3);
        f.c(str2);
        String a5 = j.a(i4, str, str2);
        if (resultListener != null) {
            resultListener.onResult(a5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final CtSetting ctSetting, final Network network, final ResultListener resultListener, long j4, final String str2, final String str3, final int i4) {
        new d().a(new e(j4) { // from class: cn.com.chinatelecom.account.api.c.a.3
            @Override // cn.com.chinatelecom.account.api.c.e
            public void a() {
                a aVar = a.this;
                JSONObject a5 = aVar.a(aVar.f574c, a.this.f575d, a.this.f576e, str, ctSetting, network, str2, str3, i4);
                synchronized (this) {
                    if (!c()) {
                        a(true);
                        d();
                        CtAuth.postResultOnMainThread(str2, a5, resultListener);
                    }
                }
                if (network != null) {
                    a.this.a();
                }
            }

            @Override // cn.com.chinatelecom.account.api.c.e
            public void b() {
                super.b();
                synchronized (a.this) {
                    a.this.f573b = true;
                }
                synchronized (this) {
                    if (!c()) {
                        a(true);
                        a.this.a(MediationConstant.ErrorCode.ADN_INIT_FAIL, cn.com.chinatelecom.account.api.a.d.a(j.f716a), str2, 0L, "", resultListener);
                    }
                }
                if (network != null) {
                    a.this.a();
                }
            }
        });
    }

    public void a(String str, CtSetting ctSetting, int i4, ResultListener resultListener) {
        int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        String a5 = cn.com.chinatelecom.account.api.e.d.a();
        String a6 = cn.com.chinatelecom.account.api.e.d.a(this.f574c);
        String a7 = cn.com.chinatelecom.account.api.e.a.a(i4);
        f.a(a5).a(a6).c(a7).b(cn.com.chinatelecom.account.api.e.g.e(this.f574c)).f(cn.com.chinatelecom.account.api.e.g.i(this.f574c));
        a(str, ctSetting, null, resultListener, totalTimeout, a5, a7, i4);
    }

    public void b(final String str, final CtSetting ctSetting, final int i4, final ResultListener resultListener) {
        final int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        final String a5 = cn.com.chinatelecom.account.api.e.d.a();
        String a6 = cn.com.chinatelecom.account.api.e.d.a(this.f574c);
        final String a7 = cn.com.chinatelecom.account.api.e.a.a(i4);
        f.a(a5).a(a6).c(a7).b("BOTH").f(cn.com.chinatelecom.account.api.e.g.i(this.f574c));
        if (Build.VERSION.SDK_INT >= 21) {
            c cVar = new c(this.f574c);
            this.f577f = cVar;
            cVar.a(new b() { // from class: cn.com.chinatelecom.account.api.c.a.1
                @Override // cn.com.chinatelecom.account.api.c.b
                public void a() {
                    a.this.a();
                    a.this.a(80800, cn.com.chinatelecom.account.api.a.d.a(j.f730o), a5, 2500L, "", resultListener);
                }

                @Override // cn.com.chinatelecom.account.api.c.b
                public void a(long j4) {
                    a.this.a();
                    a.this.a(80801, cn.com.chinatelecom.account.api.a.d.a(j.f731p), a5, j4, "", resultListener);
                }

                @Override // cn.com.chinatelecom.account.api.c.b
                public void a(Network network, long j4) {
                    long j5 = totalTimeout - j4;
                    if (j5 > 100) {
                        a.this.a(str, ctSetting, network, resultListener, j5, a5, a7, i4);
                    } else {
                        a.this.a();
                        CtAuth.postResultOnMainThread(a5, j.c(), resultListener);
                    }
                    f.a(a5).b(j4);
                }
            });
            return;
        }
        this.f577f = new c(this.f574c);
        String a8 = h.a();
        if (cn.com.chinatelecom.account.api.e.g.a() != null) {
            a8 = a8.replace(cn.com.chinatelecom.account.api.a.d.a(cn.com.chinatelecom.account.api.e.b.f673f), cn.com.chinatelecom.account.api.e.g.a());
        }
        this.f577f.a(new b() { // from class: cn.com.chinatelecom.account.api.c.a.2
            @Override // cn.com.chinatelecom.account.api.c.b
            public void a() {
                a.this.a(80800, cn.com.chinatelecom.account.api.a.d.a(j.f730o), a5, 2500L, "Switching network timeout (4.x)", resultListener);
            }

            @Override // cn.com.chinatelecom.account.api.c.b
            public void a(long j4) {
                a.this.a(80801, cn.com.chinatelecom.account.api.a.d.a(j.f731p), a5, j4, "Switching network failed (4.x)", resultListener);
            }

            @Override // cn.com.chinatelecom.account.api.c.b
            public void a(Network network, long j4) {
                long j5 = totalTimeout - j4;
                if (j5 > 100) {
                    a.this.a(str, ctSetting, null, resultListener, j5, a5, a7, i4);
                } else {
                    CtAuth.postResultOnMainThread(a5, j.c(), resultListener);
                }
                f.a(a5).b(j4);
            }
        }, a8);
    }
}
