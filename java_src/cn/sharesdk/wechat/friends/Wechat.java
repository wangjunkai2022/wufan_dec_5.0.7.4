package cn.sharesdk.wechat.friends;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.wechat.moments.WechatMoments;
import cn.sharesdk.wechat.utils.WechatClientNotExistException;
import cn.sharesdk.wechat.utils.h;
import cn.sharesdk.wechat.utils.k;
import cn.sharesdk.wechat.utils.l;
import com.alipay.sdk.packet.d;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.join.mgps.activity.QuarkDownGameActivity_;
import io.netty.handler.codec.http.cookie.CookieHeaderNames;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class Wechat extends Platform {
    public static final String NAME = "Wechat";

    /* renamed from: a  reason: collision with root package name */
    private String f1284a;

    /* renamed from: b  reason: collision with root package name */
    private String f1285b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1286c;

    /* renamed from: d  reason: collision with root package name */
    private String f1287d;

    /* renamed from: e  reason: collision with root package name */
    private String f1288e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1289f;

    /* renamed from: g  reason: collision with root package name */
    private int f1290g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i4, Object obj) {
        if (i4 == 9 || isAuthValid() || c()) {
            return true;
        }
        if (!TextUtils.isEmpty(getDb().get("refresh_token"))) {
            try {
                h hVar = new h(this, 22);
                hVar.a(this.f1284a, this.f1285b);
                if (hVar.a()) {
                    return true;
                }
            } catch (Exception e5) {
                SSDKLog.b().a(e5);
            }
        }
        innerAuthorize(i4, obj);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        if (!TextUtils.isEmpty(this.f1284a) && !TextUtils.isEmpty(this.f1285b)) {
            l a5 = l.a();
            a5.c(this.f1284a);
            if (!this.isClientValid) {
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 1, new WechatClientNotExistException());
                    return;
                }
                return;
            }
            h hVar = new h(this, 22);
            hVar.a(this.f1284a, this.f1285b);
            k kVar = new k(this);
            kVar.a(hVar);
            kVar.a(new AuthorizeListener() { // from class: cn.sharesdk.wechat.friends.Wechat.1
                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onCancel() {
                    if (((Platform) Wechat.this).listener != null) {
                        ((Platform) Wechat.this).listener.onCancel(Wechat.this, 1);
                    }
                }

                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onComplete(Bundle bundle) {
                    Wechat.this.afterRegister(1, null);
                }

                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onError(Throwable th) {
                    if (((Platform) Wechat.this).listener != null) {
                        ((Platform) Wechat.this).listener.onError(Wechat.this, 1, th);
                    }
                }
            });
            try {
                a5.a(kVar);
                return;
            } catch (Throwable th) {
                if (this.listener != null) {
                    this.listener.onError(this, 1, th);
                    return;
                }
                return;
            }
        }
        PlatformActionListener platformActionListener2 = this.listener;
        if (platformActionListener2 != null) {
            platformActionListener2.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i4, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doShare(Platform.ShareParams shareParams) {
        SSDKLog b5 = SSDKLog.b();
        b5.a("Wechat start Share with Appid:" + this.f1284a + "appSecret:" + this.f1285b, new Object[0]);
        SSDKLog b6 = SSDKLog.b();
        StringBuilder sb = new StringBuilder();
        sb.append("Wechat ShareParams:");
        sb.append(shareParams.toString());
        b6.a(sb.toString(), new Object[0]);
        if (!this.isClientValid) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 9, new WechatClientNotExistException());
                return;
            }
            return;
        }
        shareParams.set("scene", 0);
        l a5 = l.a();
        this.f1288e = TextUtils.isEmpty(shareParams.getWxPath()) ? this.f1288e : shareParams.getWxPath();
        this.f1287d = TextUtils.isEmpty(shareParams.getWxUserName()) ? this.f1287d : shareParams.getWxUserName();
        this.f1289f = !shareParams.toMap().containsKey("wxWithShareTicket") ? this.f1289f : shareParams.getWxWithShareTicket();
        this.f1290g = !shareParams.toMap().containsKey("wxMiniProgramType") ? this.f1290g : shareParams.getWxMiniProgramType();
        a5.a(this.f1288e);
        a5.b(this.f1287d);
        a5.a(this.f1289f);
        a5.a(this.f1290g);
        a5.c(this.f1284a);
        k kVar = new k(this);
        if (this.f1286c) {
            try {
                a5.a(kVar, shareParams, this.listener);
                return;
            } catch (Throwable th) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 9, th);
                    return;
                }
                return;
            }
        }
        kVar.a(shareParams, this.listener);
        try {
            a5.c(kVar);
        } catch (Throwable th2) {
            if (this.listener != null) {
                this.listener.onError(this, 9, th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> filterFriendshipInfo(int i4, HashMap<String, Object> hashMap) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        f.a aVar = new f.a();
        String text = shareParams.getText();
        aVar.f902b = text;
        String imageUrl = shareParams.getImageUrl();
        String imagePath = shareParams.getImagePath();
        Bitmap imageData = shareParams.getImageData();
        if (!TextUtils.isEmpty(imageUrl)) {
            aVar.f904d.add(imageUrl);
        } else if (imagePath != null) {
            aVar.f905e.add(imagePath);
        } else if (imageData != null) {
            aVar.f906f.add(imageData);
        }
        String url = shareParams.getUrl();
        if (url != null) {
            aVar.f903c.add(url);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("title", shareParams.getTitle());
        hashMap2.put("url", url);
        hashMap2.put(QuarkDownGameActivity_.f36977u, null);
        hashMap2.put("content", text);
        hashMap2.put("image", aVar.f904d);
        hashMap2.put("musicFileUrl", url);
        aVar.f907g = hashMap2;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void follow(String str) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, 6);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getBilaterals(int i4, int i5, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getFollowers(int i4, int i5, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getFollowings(int i4, int i5, String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i4, int i5, String str) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, 2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
        return NAME;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
        return 22;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return !this.f1286c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f1284a = getDevinfo(d.f4899h);
        this.f1285b = getDevinfo("AppSecret");
        this.f1286c = "true".equals(getDevinfo("BypassApproval"));
        this.f1287d = getDevinfo(TextUtils.isEmpty(getDevinfo("UserName")) ? "userName" : "UserName");
        String str2 = CookieHeaderNames.PATH;
        if (TextUtils.isEmpty(getDevinfo(CookieHeaderNames.PATH))) {
            str2 = "path";
        }
        this.f1288e = getDevinfo(str2);
        this.f1289f = "true".equals(getDevinfo("WithShareTicket"));
        try {
            this.f1290g = Integer.valueOf(getDevinfo("MiniprogramType")).intValue();
        } catch (Throwable unused) {
            this.f1290g = 0;
        }
        String str3 = this.f1284a;
        if (str3 == null || str3.length() <= 0) {
            this.f1284a = getDevinfo(WechatMoments.NAME, d.f4899h);
            this.f1286c = "true".equals(getDevinfo(WechatMoments.NAME, "BypassApproval"));
            String str4 = this.f1284a;
            if (str4 != null && str4.length() > 0) {
                copyDevinfo(WechatMoments.NAME, NAME);
                this.f1284a = getDevinfo(d.f4899h);
                this.f1286c = "true".equals(getDevinfo("BypassApproval"));
                SSDKLog.b().a("Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0.", new Object[0]);
                return;
            }
            String devinfo = getDevinfo("WechatFavorite", d.f4899h);
            this.f1284a = devinfo;
            if (devinfo == null || devinfo.length() <= 0) {
                return;
            }
            copyDevinfo("WechatFavorite", NAME);
            this.f1284a = getDevinfo(d.f4899h);
            SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            l a5 = l.a();
            a5.c(this.f1284a);
            a5.b(shareSDKCallback);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        this.f1284a = getNetworkDevinfo(PluginConstants.KEY_APP_ID, d.f4899h);
        this.f1285b = getNetworkDevinfo("app_secret", "AppSecret");
        String str = this.f1284a;
        if (str == null || str.length() <= 0) {
            String networkDevinfo = getNetworkDevinfo(23, PluginConstants.KEY_APP_ID, d.f4899h);
            this.f1284a = networkDevinfo;
            if (networkDevinfo != null && networkDevinfo.length() > 0) {
                copyNetworkDevinfo(23, 22);
                this.f1284a = getNetworkDevinfo(PluginConstants.KEY_APP_ID, d.f4899h);
                SSDKLog.b().a("Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0.", new Object[0]);
            } else {
                String networkDevinfo2 = getNetworkDevinfo(37, PluginConstants.KEY_APP_ID, d.f4899h);
                this.f1284a = networkDevinfo2;
                if (networkDevinfo2 != null && networkDevinfo2.length() > 0) {
                    copyNetworkDevinfo(37, 22);
                    this.f1284a = getNetworkDevinfo(PluginConstants.KEY_APP_ID, d.f4899h);
                    SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
                }
            }
        }
        String str2 = this.f1285b;
        if (str2 == null || str2.length() <= 0) {
            String networkDevinfo3 = getNetworkDevinfo(23, "app_secret", "AppSecret");
            this.f1285b = networkDevinfo3;
            if (networkDevinfo3 != null && networkDevinfo3.length() > 0) {
                copyNetworkDevinfo(23, 22);
                this.f1285b = getNetworkDevinfo("app_secret", "AppSecret");
                SSDKLog.b().a("Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0.", new Object[0]);
                return;
            }
            String networkDevinfo4 = getNetworkDevinfo(37, "app_secret", "AppSecret");
            this.f1285b = networkDevinfo4;
            if (networkDevinfo4 == null || networkDevinfo4.length() <= 0) {
                return;
            }
            copyNetworkDevinfo(37, 22);
            this.f1285b = getNetworkDevinfo("app_secret", "AppSecret");
            SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void subscribeAuth(Platform.ShareParams shareParams) {
        if (!TextUtils.isEmpty(this.f1284a) && !TextUtils.isEmpty(this.f1285b)) {
            l a5 = l.a();
            a5.c(this.f1284a);
            if (!this.isClientValid) {
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 1, new WechatClientNotExistException());
                    return;
                }
                return;
            }
            k kVar = new k(this);
            kVar.a(shareParams, this.listener);
            try {
                a5.b(kVar);
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onComplete(this, 9, null);
                }
                SSDKLog.b().a(OnekeyShare.SHARESDK_TAG, "subscribeAuth start on Wechat");
                return;
            } catch (Throwable th) {
                PlatformActionListener platformActionListener3 = this.listener;
                if (platformActionListener3 != null) {
                    platformActionListener3.onError(this, 1, th);
                    return;
                }
                return;
            }
        }
        PlatformActionListener platformActionListener4 = this.listener;
        if (platformActionListener4 != null) {
            platformActionListener4.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i4, int i5, String str) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
        if (!TextUtils.isEmpty(this.f1284a) && !TextUtils.isEmpty(this.f1285b)) {
            h hVar = new h(this, 22);
            hVar.a(this.f1284a, this.f1285b);
            try {
                hVar.a(this.listener);
                return;
            } catch (Throwable th) {
                SSDKLog.b().a(th);
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 8, th);
                    return;
                }
                return;
            }
        }
        PlatformActionListener platformActionListener2 = this.listener;
        if (platformActionListener2 != null) {
            platformActionListener2.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
        }
    }

    private boolean c() {
        if (TextUtils.isEmpty(getDb().get("refresh_token"))) {
            return false;
        }
        h hVar = new h(this, 22);
        hVar.a(this.f1284a, this.f1285b);
        return hVar.a();
    }
}
