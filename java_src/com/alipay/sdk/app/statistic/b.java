package com.alipay.sdk.app.statistic;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.sdk.util.i;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f4726b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f4727c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str) {
        this.f4726b = context;
        this.f4727c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.alipay.sdk.packet.impl.c cVar = new com.alipay.sdk.packet.impl.c();
        try {
            String b5 = i.b(this.f4726b, a.f4725b);
            if (!TextUtils.isEmpty(b5) && cVar.b(this.f4726b, b5) != null) {
                PreferenceManager.getDefaultSharedPreferences(this.f4726b).edit().remove(a.f4725b).commit();
            }
        } catch (Throwable unused) {
        }
        try {
            if (TextUtils.isEmpty(this.f4727c)) {
                return;
            }
            cVar.b(this.f4726b, this.f4727c);
        } catch (IOException unused2) {
            i.c(this.f4726b, a.f4725b, this.f4727c);
        } catch (Throwable unused3) {
        }
    }
}
