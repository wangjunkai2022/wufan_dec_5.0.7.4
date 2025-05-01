package com.sina.weibo.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.b.a;
import com.sina.weibo.sdk.b.c;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.net.h;
import com.sina.weibo.sdk.web.WebActivity;
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public WbAuthListener f60127d;

    public final void a(Activity activity) {
        c.a("WBSsoTag", "startClientAuth()");
        try {
            a.C0605a e5 = com.sina.weibo.sdk.b.a.e(activity);
            Intent intent = new Intent();
            if (e5 == null) {
                intent.setClassName(BuildConfig.APPLICATION_ID, "com.sina.weibo.SSOActivity");
            } else {
                intent.setClassName(e5.packageName, e5.ag);
            }
            AuthInfo a5 = com.sina.weibo.sdk.a.a();
            intent.putExtra("appKey", a5.getAppKey());
            intent.putExtra("redirectUri", a5.getRedirectUrl());
            intent.putExtra("scope", a5.getScope());
            intent.putExtra("packagename", a5.getPackageName());
            intent.putExtra("key_hash", a5.getHash());
            intent.putExtra("_weibo_command_type", 3);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            intent.putExtra("_weibo_transaction", sb.toString());
            if (activity == null) {
                this.f60127d.onError(new UiError(-1, "activity is null", ""));
            } else if (com.sina.weibo.sdk.b.a.a(activity, intent)) {
                activity.startActivityForResult(intent, 32973);
                c.a("WBSsoTag", "start SsoActivity ");
            } else {
                this.f60127d.onError(new UiError(-2, "your app is illegal", ""));
            }
        } catch (Exception e6) {
            e6.printStackTrace();
            c.b("WBSsoTag", e6.getMessage());
            this.f60127d.onError(new UiError(-3, "occur exception", e6.getMessage()));
        }
    }

    public final void b(Activity activity) {
        h hVar = new h();
        AuthInfo a5 = com.sina.weibo.sdk.a.a();
        if (a5 == null) {
            return;
        }
        hVar.put("client_id", a5.getAppKey());
        hVar.put("redirect_uri", a5.getRedirectUrl());
        hVar.put("scope", a5.getScope());
        hVar.put("packagename", a5.getPackageName());
        hVar.put("key_hash", a5.getHash());
        hVar.put("response_type", "code");
        hVar.put("version", "0041005000");
        hVar.put("luicode", "10000360");
        hVar.put("lfid", "OP_" + a5.getAppKey());
        Oauth2AccessToken readAccessToken = AccessTokenHelper.readAccessToken(activity);
        if (readAccessToken != null) {
            String accessToken = readAccessToken.getAccessToken();
            if (!TextUtils.isEmpty(readAccessToken.getAccessToken())) {
                hVar.put("trans_token", accessToken);
                hVar.put("trans_access_token", accessToken);
            }
        }
        String str = "https://open.weibo.cn/oauth2/authorize?" + hVar.g();
        if (this.f60127d != null) {
            b b5 = b.b();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            String sb2 = sb.toString();
            b5.a(sb2, this.f60127d);
            Intent intent = new Intent(activity, WebActivity.class);
            com.sina.weibo.sdk.web.b.a aVar = new com.sina.weibo.sdk.web.b.a(a5, str, sb2);
            Bundle bundle = new Bundle();
            aVar.writeToBundle(bundle);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }
}
