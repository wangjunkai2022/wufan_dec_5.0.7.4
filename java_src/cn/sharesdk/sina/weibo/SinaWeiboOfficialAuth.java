package cn.sharesdk.sina.weibo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.k;
import com.mob.MobSDK;
import com.mob.tools.FakeActivity;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
/* loaded from: classes2.dex */
public class SinaWeiboOfficialAuth extends FakeActivity {
    private String appkey;
    private IWBAPI iwbapi;
    private AuthorizeListener listener;
    private String permissions;
    private String redirectUrl;

    public SinaWeiboOfficialAuth(String str, String str2, String str3, AuthorizeListener authorizeListener) {
        this.appkey = str;
        this.redirectUrl = str2;
        this.permissions = str3;
        this.listener = authorizeListener;
    }

    private String join(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, str, 0, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loginManager() {
        SSDKLog.b().a("SinaWeiboOfficialAuth loginManager");
        IWBAPI iwbapi = this.iwbapi;
        if (iwbapi != null) {
            iwbapi.authorizeClient(this.activity, new WbAuthListener() { // from class: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth.3
                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onCancel() {
                    SinaWeiboOfficialAuth.this.listener.onCancel();
                    SinaWeiboOfficialAuth.this.finish();
                }

                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onComplete(Oauth2AccessToken oauth2AccessToken) {
                    Bundle bundle = new Bundle();
                    bundle.putString("access_token", oauth2AccessToken.getAccessToken());
                    bundle.putString("expires_in", String.valueOf(oauth2AccessToken.getExpiresTime()));
                    bundle.putString("refresh_token", oauth2AccessToken.getRefreshToken());
                    bundle.putString("username", oauth2AccessToken.getScreenName());
                    bundle.putString("uid", oauth2AccessToken.getUid());
                    SinaWeiboOfficialAuth.this.listener.onComplete(bundle);
                    SinaWeiboOfficialAuth.this.finish();
                }

                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onError(UiError uiError) {
                    SinaWeiboOfficialAuth sinaWeiboOfficialAuth = SinaWeiboOfficialAuth.this;
                    sinaWeiboOfficialAuth.showWebAuthActivity(sinaWeiboOfficialAuth.listener);
                    SinaWeiboOfficialAuth.this.finish();
                }
            });
            return;
        }
        AuthorizeListener authorizeListener = this.listener;
        if (authorizeListener != null) {
            authorizeListener.onError(new Throwable("SinaWeibo SDK init failed"));
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWebAuthActivity(AuthorizeListener authorizeListener) {
        new SinaWeiboWebAuthOfficial(this.appkey, this.redirectUrl, this.permissions, authorizeListener).show(MobSDK.getContext(), null);
        SSDKLog.b().a("SinaWeibo SDK Web showWebAuthActivity ");
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        IWBAPI iwbapi = this.iwbapi;
        if (iwbapi != null) {
            iwbapi.authorizeCallback(this.activity, i4, i5, intent);
        }
        SSDKLog.b().a("SinaWeiboOfficialAuth onActivityResult");
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        SSDKLog.b().a("SinaWeiboOfficialAuth onCreate ");
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Exception e5) {
            SSDKLog.b().a(e5);
            SSDKLog b5 = SSDKLog.b();
            b5.a("SinaWeiboOfficialAuth onCreate exception " + e5.getMessage());
            AuthorizeListener authorizeListener = this.listener;
            if (authorizeListener != null && authorizeListener != null) {
                authorizeListener.onError(new Throwable("SinaWeibo SDK init failed"));
            }
            finish();
        }
        k.a(new k.a() { // from class: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth.1
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    AuthInfo authInfo = new AuthInfo(((FakeActivity) SinaWeiboOfficialAuth.this).activity, SinaWeiboOfficialAuth.this.appkey, SinaWeiboOfficialAuth.this.redirectUrl, SinaWeiboOfficialAuth.this.permissions);
                    SinaWeiboOfficialAuth sinaWeiboOfficialAuth = SinaWeiboOfficialAuth.this;
                    sinaWeiboOfficialAuth.iwbapi = WBAPIFactory.createWBAPI(((FakeActivity) sinaWeiboOfficialAuth).activity);
                    SinaWeiboOfficialAuth.this.iwbapi.registerApp(((FakeActivity) SinaWeiboOfficialAuth.this).activity, authInfo, new SdkListener() { // from class: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth.1.1
                        @Override // com.sina.weibo.sdk.openapi.SdkListener
                        public void onInitFailure(Exception exc) {
                            if (SinaWeiboOfficialAuth.this.listener != null) {
                                SinaWeiboOfficialAuth.this.listener.onError(exc);
                            }
                            SSDKLog b6 = SSDKLog.b();
                            b6.a("SinaWeiboShareOfficial", "WeiboInitFailure " + exc);
                        }

                        @Override // com.sina.weibo.sdk.openapi.SdkListener
                        public void onInitSuccess() {
                            SinaWeibo.initFlag = true;
                            SSDKLog.b().a("WB init Sucess", new Object[0]);
                        }
                    });
                } catch (Throwable th) {
                    SSDKLog b6 = SSDKLog.b();
                    b6.a("SinaWeiboOfficialAuth", "onCreate AuthInfo " + th);
                }
            }
        });
        k.a(new k.a() { // from class: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth.2
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                try {
                    if (SinaWeibo.initFlag) {
                        SinaWeiboOfficialAuth.this.loginManager();
                    }
                    SSDKLog.b().a("SinaWeiboOfficialAuth onCreate loginManager() ");
                } catch (Throwable th) {
                    if (SinaWeiboOfficialAuth.this.listener != null) {
                        SinaWeiboOfficialAuth.this.listener.onError(new Throwable("Authorize catch: " + th));
                    }
                    SSDKLog b6 = SSDKLog.b();
                    b6.a("SinaWeiboOfficialAuth onCreate catch: " + th);
                    SinaWeiboOfficialAuth.this.finish();
                }
            }
        });
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        super.onDestroy();
        SSDKLog.b().a("SinaWeiboOfficialAuth onDestroy");
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        super.onPause();
        SSDKLog.b().a("SinaWeiboOfficialAuth onPause");
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        super.onResume();
        SSDKLog.b().a("SinaWeiboOfficialAuth onResume");
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
        SSDKLog.b().a("SinaWeiboOfficialAuth onStop");
    }

    private String join(Object[] objArr, String str, int i4, int i5) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i6 * 16);
        if (objArr[i4] != null) {
            sb.append(objArr[i4]);
        }
        while (true) {
            i4++;
            if (i4 < i5) {
                sb.append(str);
                if (objArr[i4] != null) {
                    sb.append(objArr[i4]);
                }
            } else {
                return sb.toString();
            }
        }
    }
}
