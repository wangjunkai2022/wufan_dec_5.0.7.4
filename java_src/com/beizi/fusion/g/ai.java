package com.beizi.fusion.g;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.beizi.fusion.BeiZis;
import com.beizi.fusion.e.a.b;
import com.beizi.fusion.model.RequestInfo;
/* compiled from: OaidUtil.java */
/* loaded from: classes2.dex */
public class ai {

    /* renamed from: a  reason: collision with root package name */
    static String f6863a = "OaidUtil";

    /* renamed from: c  reason: collision with root package name */
    private static String f6865c;

    /* renamed from: b  reason: collision with root package name */
    public static b.a f6864b = new b.a() { // from class: com.beizi.fusion.g.ai.1
        @Override // com.beizi.fusion.e.a.b.a
        public void a(@NonNull String str) {
            String str2 = ai.f6863a;
            StringBuilder sb = new StringBuilder();
            sb.append("code cn Oaid:");
            sb.append(str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String unused = ai.f6865c = str;
            Context e5 = com.beizi.fusion.d.b.a().e();
            at.a(e5, "__OAID__", (Object) ai.f6865c);
            at.a(e5, "__CNOAID__", (Object) ai.f6865c);
            if (RequestInfo.getInstance(e5).getDevInfo() != null) {
                if (aj.b() && BeiZis.isLimitPersonalAds()) {
                    return;
                }
                RequestInfo.getInstance(e5).getDevInfo().setOaid(ai.f6865c);
                RequestInfo.getInstance(e5).getDevInfo().setCnOaid(ai.f6865c);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static boolean f6866d = true;
}
