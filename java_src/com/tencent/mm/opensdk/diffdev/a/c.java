package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
/* loaded from: classes6.dex */
class c extends AsyncTask<Void, Void, a> {

    /* renamed from: a  reason: collision with root package name */
    private String f62784a;

    /* renamed from: b  reason: collision with root package name */
    private String f62785b;

    /* renamed from: c  reason: collision with root package name */
    private OAuthListener f62786c;

    /* renamed from: d  reason: collision with root package name */
    private int f62787d;

    /* loaded from: classes6.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public OAuthErrCode f62788a;

        /* renamed from: b  reason: collision with root package name */
        public String f62789b;

        /* renamed from: c  reason: collision with root package name */
        public int f62790c;

        a() {
        }
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f62784a = str;
        this.f62786c = oAuthListener;
        this.f62785b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.tencent.mm.opensdk.diffdev.a.c.a doInBackground(java.lang.Void[] r14) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.diffdev.a.c.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f62786c.onAuthFinish(aVar2.f62788a, aVar2.f62789b);
    }
}
