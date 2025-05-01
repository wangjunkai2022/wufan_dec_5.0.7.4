package com.beizi.ad.internal.a;

import android.app.Activity;
import com.beizi.ad.R;
import com.beizi.ad.internal.j;
import com.beizi.ad.internal.network.ServerResponse;
import com.beizi.ad.internal.utilities.HaoboLog;
/* compiled from: MediationInterstitialAdViewController.java */
/* loaded from: classes2.dex */
public class f extends b {
    private f(Activity activity, com.beizi.ad.internal.e eVar, a aVar, com.beizi.ad.internal.b bVar, ServerResponse serverResponse) {
        super(eVar, aVar, bVar, j.INTERSTITIAL, serverResponse);
        if (a(g.class)) {
            HaoboLog.d(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediated_request));
            e();
            g();
            int i4 = 0;
            try {
                if (activity != null) {
                    ((g) this.f5623b).a(this, activity, this.f5624c.b(), this.f5624c.e(), a());
                    i4 = -1;
                } else {
                    HaoboLog.e(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediated_request_null_activity));
                }
            } catch (Error e5) {
                HaoboLog.e(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediated_request_error), e5);
            } catch (Exception e6) {
                HaoboLog.e(HaoboLog.mediationLogTag, HaoboLog.getString(R.string.mediated_request_exception), e6);
            }
            if (i4 != -1) {
                a(i4);
            }
        }
    }

    public static f a(Activity activity, com.beizi.ad.internal.e eVar, a aVar, com.beizi.ad.internal.b bVar, ServerResponse serverResponse) {
        f fVar = new f(activity, eVar, aVar, bVar, serverResponse);
        if (fVar.f5628g) {
            return null;
        }
        return fVar;
    }

    @Override // com.beizi.ad.internal.a.b
    public void c() {
        if (this.f5623b == null || d()) {
            return;
        }
        ((g) this.f5623b).a();
    }

    @Override // com.beizi.ad.internal.a.b
    public void i() {
        this.f5630i = true;
        com.beizi.ad.b.b bVar = this.f5623b;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // com.beizi.ad.internal.a.b
    public void j() {
        com.beizi.ad.b.b bVar = this.f5623b;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // com.beizi.ad.internal.a.b
    public void k() {
        com.beizi.ad.b.b bVar = this.f5623b;
        if (bVar != null) {
            bVar.d();
        }
    }
}
