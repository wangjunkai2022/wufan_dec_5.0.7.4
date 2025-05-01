package cn.sharesdk.framework;

import cn.sharesdk.framework.authorize.AuthorizeHelper;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
/* compiled from: PlatformHelper.java */
/* loaded from: classes2.dex */
public abstract class e implements AuthorizeHelper {

    /* renamed from: a  reason: collision with root package name */
    protected Platform f976a;

    /* renamed from: b  reason: collision with root package name */
    private AuthorizeListener f977b;

    /* renamed from: c  reason: collision with root package name */
    private SSOListener f978c;

    public e(Platform platform) {
        this.f976a = platform;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(SSOListener sSOListener) {
        this.f978c = sSOListener;
        SSOAuthorizeActivity sSOAuthorizeActivity = new SSOAuthorizeActivity();
        sSOAuthorizeActivity.setSSOListener(sSOListener);
        sSOAuthorizeActivity.show(this);
    }

    public int b() {
        return this.f976a.getPlatformId();
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public AuthorizeListener getAuthorizeListener() {
        return this.f977b;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public Platform getPlatform() {
        return this.f976a;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public SSOListener getSSOListener() {
        return this.f978c;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
        return null;
    }

    protected void b(AuthorizeListener authorizeListener) {
        this.f977b = authorizeListener;
        WebAuthorizeActivity webAuthorizeActivity = new WebAuthorizeActivity();
        webAuthorizeActivity.setAuthorizeListener(this.f977b);
        webAuthorizeActivity.show(this);
    }
}
