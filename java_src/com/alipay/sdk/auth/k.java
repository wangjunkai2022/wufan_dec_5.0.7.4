package com.alipay.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f4782b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ StringBuilder f4783c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f4784d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Activity activity, StringBuilder sb, a aVar) {
        this.f4782b = activity;
        this.f4783c = sb;
        this.f4784d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.alipay.sdk.widget.a aVar;
        com.alipay.sdk.widget.a aVar2;
        com.alipay.sdk.widget.a aVar3;
        com.alipay.sdk.widget.a aVar4;
        com.alipay.sdk.packet.b bVar;
        com.alipay.sdk.widget.a aVar5;
        String str;
        String str2;
        com.alipay.sdk.widget.a aVar6;
        String str3;
        com.alipay.sdk.widget.a aVar7;
        com.alipay.sdk.widget.a aVar8;
        String str4;
        com.alipay.sdk.widget.a aVar9;
        com.alipay.sdk.widget.a aVar10;
        com.alipay.sdk.widget.a aVar11;
        try {
            bVar = null;
            try {
                bVar = new com.alipay.sdk.packet.impl.a().b(this.f4782b, this.f4783c.toString());
            } catch (Throwable unused) {
            }
            aVar5 = j.f4780c;
            if (aVar5 != null) {
                aVar11 = j.f4780c;
                aVar11.f();
                j.f();
            }
        } catch (Exception unused2) {
            aVar3 = j.f4780c;
            if (aVar3 == null) {
                return;
            }
        } catch (Throwable th) {
            aVar = j.f4780c;
            if (aVar != null) {
                aVar2 = j.f4780c;
                aVar2.f();
            }
            throw th;
        }
        if (bVar == null) {
            String unused3 = j.f4781d = this.f4784d.d() + "?resultCode=202";
            Activity activity = this.f4782b;
            str4 = j.f4781d;
            j.d(activity, str4);
            aVar9 = j.f4780c;
            if (aVar9 != null) {
                aVar10 = j.f4780c;
                aVar10.f();
                return;
            }
            return;
        }
        List<com.alipay.sdk.protocol.b> b5 = com.alipay.sdk.protocol.b.b(bVar.a().optJSONObject(com.alipay.sdk.cons.c.f4840c).optJSONObject(com.alipay.sdk.cons.c.f4841d));
        int i4 = 0;
        while (true) {
            if (i4 >= b5.size()) {
                break;
            } else if (b5.get(i4).f4922a == com.alipay.sdk.protocol.a.WapPay) {
                String unused4 = j.f4781d = b5.get(i4).f4924c[0];
                break;
            } else {
                i4++;
            }
        }
        str = j.f4781d;
        if (TextUtils.isEmpty(str)) {
            String unused5 = j.f4781d = this.f4784d.d() + "?resultCode=202";
            Activity activity2 = this.f4782b;
            str3 = j.f4781d;
            j.d(activity2, str3);
            aVar7 = j.f4780c;
            if (aVar7 != null) {
                aVar8 = j.f4780c;
                aVar8.f();
                return;
            }
            return;
        }
        Intent intent = new Intent(this.f4782b, AuthActivity.class);
        str2 = j.f4781d;
        intent.putExtra("params", str2);
        intent.putExtra("redirectUri", this.f4784d.d());
        this.f4782b.startActivity(intent);
        aVar6 = j.f4780c;
        if (aVar6 == null) {
            return;
        }
        aVar4 = j.f4780c;
        aVar4.f();
    }
}
