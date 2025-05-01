package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DataHelper;
/* compiled from: UMSLNetWorkSenderHelper.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f64348a = "10.0.0.172";

    /* renamed from: b  reason: collision with root package name */
    private int f64349b = 80;

    /* renamed from: c  reason: collision with root package name */
    private Context f64350c;

    public c(Context context) {
        this.f64350c = context;
    }

    private void a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f64350c, "sl_domain_p", "");
        if (TextUtils.isEmpty(imprintProperty)) {
            return;
        }
        a.f64332i = DataHelper.assembleStatelessURL(imprintProperty);
    }

    private void b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f64350c, "sl_domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f64350c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            a.f64331h = DataHelper.assembleStatelessURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            a.f64334k = DataHelper.assembleStatelessURL(imprintProperty2);
        }
        a.f64332i = a.f64334k;
        if (TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.f64358b)) {
            return;
        }
        if (com.umeng.commonsdk.statistics.b.f64358b.startsWith("460") || com.umeng.commonsdk.statistics.b.f64358b.startsWith("461")) {
            a.f64332i = a.f64331h;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
        if (r11 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [javax.net.ssl.HttpsURLConnection, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(byte[] r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.c.a(byte[], java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
