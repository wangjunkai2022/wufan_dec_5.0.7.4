package cn.sharesdk.framework.authorize;

import android.content.Intent;
/* compiled from: SSOProcessor.java */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    protected SSOAuthorizeActivity f955a;

    /* renamed from: b  reason: collision with root package name */
    protected int f956b;

    /* renamed from: c  reason: collision with root package name */
    protected SSOListener f957c;

    public c(SSOAuthorizeActivity sSOAuthorizeActivity) {
        this.f955a = sSOAuthorizeActivity;
        this.f957c = sSOAuthorizeActivity.getHelper().getSSOListener();
    }

    public abstract void a();

    public void a(int i4) {
        this.f956b = i4;
    }

    public void a(int i4, int i5, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Intent intent) {
    }
}
