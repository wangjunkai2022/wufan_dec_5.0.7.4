package com.beizi.ad.internal;

import android.text.TextUtils;
import com.beizi.ad.internal.utilities.HTTPGet;
import com.beizi.ad.internal.utilities.HTTPResponse;
/* compiled from: ShowMonitorTracker.java */
/* loaded from: classes2.dex */
public class o extends HTTPGet {

    /* renamed from: a  reason: collision with root package name */
    private String f6103a;

    public o(String str) {
        super(false, false);
        this.f6103a = str;
        a();
    }

    private void a() {
        com.beizi.ad.internal.network.c a5 = com.beizi.ad.internal.network.c.a(g.a().e());
        if (a5.b(g.a().e())) {
            execute(new Void[0]);
        } else {
            a5.a(this.f6103a, g.a().e());
        }
    }

    @Override // com.beizi.ad.internal.utilities.HTTPGet
    protected String getUrl() {
        return this.f6103a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.beizi.ad.internal.utilities.HTTPGet, android.os.AsyncTask
    public void onPostExecute(HTTPResponse hTTPResponse) {
        if (hTTPResponse == null || !hTTPResponse.getSucceeded()) {
            return;
        }
        int code = hTTPResponse.getCode();
        String locationUrl = hTTPResponse.getLocationUrl();
        if (code != 302 || TextUtils.isEmpty(locationUrl)) {
            return;
        }
        new o(locationUrl).execute(new Void[0]);
    }
}
