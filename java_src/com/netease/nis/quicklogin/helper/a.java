package com.netease.nis.quicklogin.helper;

import android.content.Context;
import com.netease.nis.basesdk.HttpUtil;
import com.netease.nis.quicklogin.listener.QuickLoginPreMobileListener;
import com.netease.nis.quicklogin.listener.QuickLoginTokenListener;
import com.netease.nis.quicklogin.utils.g;
/* compiled from: AbstractLoginHelper.java */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f57514a = true;

    /* compiled from: AbstractLoginHelper.java */
    /* renamed from: com.netease.nis.quicklogin.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0570a implements HttpUtil.ResponseCallBack {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f57515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QuickLoginTokenListener f57516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f57517c;

        C0570a(String str, QuickLoginTokenListener quickLoginTokenListener, String str2) {
            this.f57515a = str;
            this.f57516b = quickLoginTokenListener;
            this.f57517c = str2;
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onError(int i4, String str) {
            g.c().b().h(this.f57517c);
            a.this.a(i4, str, this.f57515a, this.f57516b);
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onSuccess(String str) {
            a.this.a(str, this.f57515a, this.f57516b);
        }
    }

    /* compiled from: AbstractLoginHelper.java */
    /* loaded from: classes5.dex */
    class b implements HttpUtil.ResponseCallBack {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f57519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QuickLoginTokenListener f57520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f57521c;

        b(String str, QuickLoginTokenListener quickLoginTokenListener, String str2) {
            this.f57519a = str;
            this.f57520b = quickLoginTokenListener;
            this.f57521c = str2;
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onError(int i4, String str) {
            g.c().b().h(this.f57521c);
            a.this.a(i4, str, this.f57519a, this.f57520b);
        }

        @Override // com.netease.nis.basesdk.HttpUtil.ResponseCallBack
        public void onSuccess(String str) {
            a.this.a(str, this.f57519a, this.f57520b);
        }
    }

    protected void a(int i4, String str, String str2, QuickLoginTokenListener quickLoginTokenListener) {
    }

    public void a(Context context, String str, String str2, QuickLoginTokenListener quickLoginTokenListener) {
        if (this.f57514a) {
            HttpUtil.doGetRequestByMobileNet(context, str, new C0570a(str2, quickLoginTokenListener, str));
        } else {
            HttpUtil.doGetRequestByForm(str, new b(str2, quickLoginTokenListener, str));
        }
    }

    public abstract void a(String str, QuickLoginPreMobileListener quickLoginPreMobileListener);

    public abstract void a(String str, QuickLoginTokenListener quickLoginTokenListener);

    protected void a(String str, String str2, QuickLoginTokenListener quickLoginTokenListener) {
    }
}
