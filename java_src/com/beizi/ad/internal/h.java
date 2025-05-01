package com.beizi.ad.internal;

import android.text.TextUtils;
import com.beizi.ad.internal.utilities.HTTPGet;
import com.beizi.ad.internal.utilities.HTTPResponse;
/* compiled from: ClickTracker.java */
/* loaded from: classes2.dex */
public class h extends HTTPGet {

    /* renamed from: a  reason: collision with root package name */
    private String f5915a;

    public h(String str) {
        super(false, false);
        this.f5915a = str;
    }

    @Override // com.beizi.ad.internal.utilities.HTTPGet
    protected String getUrl() {
        return this.f5915a;
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
        new h(locationUrl).execute(new Void[0]);
    }
}
