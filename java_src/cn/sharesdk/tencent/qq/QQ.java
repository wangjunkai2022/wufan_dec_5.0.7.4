package cn.sharesdk.tencent.qq;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.k;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.tencent.qzone.QZone;
import com.alipay.sdk.packet.d;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class QQ extends Platform {
    public static final String NAME = "QQ";

    /* renamed from: a  reason: collision with root package name */
    private String f1151a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1153c;

    /* renamed from: d  reason: collision with root package name */
    private String f1154d = null;

    /* renamed from: e  reason: collision with root package name */
    private final Object f1155e = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1152b = true;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i4, Object obj) {
        cn.sharesdk.tencent.qq.utils.a a5 = cn.sharesdk.tencent.qq.utils.a.a(this);
        if (this.isClientValid && this.f1153c && i4 == 9) {
            SSDKLog.b().a(OnekeyShare.SHARESDK_TAG, "QQ checkAuthorize qq.isQQInstalled() return true ");
            return true;
        } else if (!isAuthValid() && (i4 != 9 || obj == null || !(obj instanceof Platform.ShareParams) || ((Platform.ShareParams) obj).isShareTencentWeibo())) {
            innerAuthorize(i4, obj);
            return false;
        } else {
            a5.a(this.f1151a);
            a5.b(this.db.getUserId());
            a5.d(this.db.getToken());
            SSDKLog.b().a(OnekeyShare.SHARESDK_TAG, "QQ checkAuthorize isAuthValid return true ");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        SSDKLog.b().a(OnekeyShare.SHARESDK_TAG, "QQ doAuthorize ");
        SSDKLog b5 = SSDKLog.b();
        b5.a("QQ start Authorize with Appid:" + this.f1151a, new Object[0]);
        final cn.sharesdk.tencent.qq.utils.a a5 = cn.sharesdk.tencent.qq.utils.a.a(this);
        a5.a(this.f1151a);
        a5.a(strArr);
        a5.a(new AuthorizeListener() { // from class: cn.sharesdk.tencent.qq.QQ.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (((Platform) QQ.this).listener != null) {
                    ((Platform) QQ.this).listener.onCancel(QQ.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                String string = bundle.getString("open_id");
                String string2 = bundle.getString("access_token");
                String string3 = bundle.getString("expires_in");
                ((Platform) QQ.this).db.putToken(string2);
                ((Platform) QQ.this).db.putTokenSecret("");
                try {
                    ((Platform) QQ.this).db.putExpiresIn(ResHelper.parseLong(string3));
                } catch (Throwable th) {
                    SSDKLog.b().b(th);
                }
                ((Platform) QQ.this).db.putUserId(string);
                String string4 = bundle.getString("pf");
                String string5 = bundle.getString("pfkey");
                String string6 = bundle.getString("pay_token");
                ((Platform) QQ.this).db.put("pf", string4);
                ((Platform) QQ.this).db.put("pfkey", string5);
                ((Platform) QQ.this).db.put("pay_token", string6);
                a5.b(string);
                a5.d(string2);
                a5.a();
                QQ.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th) {
                if (((Platform) QQ.this).listener != null) {
                    ((Platform) QQ.this).listener.onError(QQ.this, 1, th);
                }
            }
        }, isSSODisable());
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
    public void doShare(final Platform.ShareParams shareParams) {
        SSDKLog.b().a(OnekeyShare.SHARESDK_TAG, " QQ doShare ");
        SSDKLog b5 = SSDKLog.b();
        b5.a("QQ start Share with Appid:" + this.f1151a, new Object[0]);
        SSDKLog b6 = SSDKLog.b();
        b6.a("QQ ShareParams:" + shareParams.toString(), new Object[0]);
        final cn.sharesdk.tencent.qq.utils.a a5 = cn.sharesdk.tencent.qq.utils.a.a(this);
        if (this.f1153c && this.isClientValid) {
            try {
                a5.a(this, shareParams, this.listener);
                SSDKLog.b().a(OnekeyShare.SHARESDK_TAG, " QQ byPassShare ");
                return;
            } catch (Throwable th) {
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 9, th);
                }
                SSDKLog b7 = SSDKLog.b();
                b7.a(OnekeyShare.SHARESDK_TAG, " QQ doShare catch: " + th);
                return;
            }
        }
        final String title = shareParams.getTitle();
        final String text = shareParams.getText();
        final String imagePath = shareParams.getImagePath();
        final String imageUrl = shareParams.getImageUrl();
        final String musicUrl = shareParams.getMusicUrl();
        String titleUrl = shareParams.getTitleUrl();
        if (TextUtils.isEmpty(titleUrl)) {
            titleUrl = shareParams.getUrl();
        }
        String str = titleUrl;
        final boolean isShareTencentWeibo = shareParams.isShareTencentWeibo();
        final int hidden = shareParams.getHidden();
        final String qQMiniProgramAppid = shareParams.getQQMiniProgramAppid();
        final String qQMiniProgramPath = shareParams.getQQMiniProgramPath();
        final String qQMiniProgramType = shareParams.getQQMiniProgramType();
        final int shareType = shareParams.getShareType();
        if (TextUtils.isEmpty(title) && TextUtils.isEmpty(text) && TextUtils.isEmpty(imagePath) && TextUtils.isEmpty(imageUrl) && TextUtils.isEmpty(musicUrl) && TextUtils.isEmpty(qQMiniProgramAppid)) {
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 9, new Throwable("qq share must have one param at least"));
            }
        } else if (!TextUtils.isEmpty(str)) {
            getShortLintk(str, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.tencent.qq.QQ.2
                @Override // cn.sharesdk.framework.ShareSDKCallback
                /* renamed from: a */
                public void onCallback(String str2) {
                    shareParams.setTitleUrl(str2);
                    QQ.this.a(a5, title, str2, text, imagePath, imageUrl, musicUrl, isShareTencentWeibo, hidden, qQMiniProgramAppid, qQMiniProgramPath, qQMiniProgramType, shareType, shareParams);
                }
            });
        } else {
            a(a5, title, str, text, imagePath, imageUrl, musicUrl, isShareTencentWeibo, hidden, qQMiniProgramAppid, qQMiniProgramPath, qQMiniProgramType, shareType, shareParams);
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
        String titleUrl = shareParams.getTitleUrl();
        aVar.f903c.add(titleUrl);
        aVar.f901a = this.f1151a;
        String text = shareParams.getText();
        if (!TextUtils.isEmpty(text)) {
            aVar.f902b = text;
        }
        String imageUrl = shareParams.getImageUrl();
        String imagePath = shareParams.getImagePath();
        if (!TextUtils.isEmpty(imagePath)) {
            aVar.f905e.add(imagePath);
        } else if (!TextUtils.isEmpty(imageUrl)) {
            aVar.f904d.add(imageUrl);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("title", shareParams.getTitle());
        hashMap2.put("url", titleUrl);
        hashMap2.put("imageLocalUrl", imagePath);
        hashMap2.put("summary", text);
        k.a(new k.a() { // from class: cn.sharesdk.tencent.qq.QQ.4
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                DH.requester(MobSDK.getContext()).getAppName().request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qq.QQ.4.1
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        try {
                            synchronized (QQ.this.f1155e) {
                                QQ.this.f1154d = dHResponse.getAppName();
                                QQ.this.f1155e.notifyAll();
                            }
                        } catch (Throwable th) {
                            SSDKLog.b().a(th);
                        }
                    }
                });
            }
        });
        synchronized (this.f1155e) {
            try {
                this.f1155e.wait(1000L);
            }
        }
        hashMap2.put(TTDownloadField.TT_APP_NAME, this.f1154d);
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
        return 24;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 2;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return this.f1152b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f1151a = getDevinfo(d.f4899h);
        this.f1153c = "true".equals(getDevinfo("BypassApproval"));
        String str2 = this.f1151a;
        if (str2 == null || str2.length() <= 0) {
            String devinfo = getDevinfo(QZone.NAME, d.f4899h);
            this.f1151a = devinfo;
            if (devinfo == null || devinfo.length() <= 0) {
                return;
            }
            copyDevinfo(QZone.NAME, NAME);
            this.f1151a = getDevinfo(d.f4899h);
            SSDKLog.b().a("Try to use the dev info of QZone, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            cn.sharesdk.tencent.qq.utils.a a5 = cn.sharesdk.tencent.qq.utils.a.a(this);
            a5.a(this.f1151a);
            a5.a(shareSDKCallback);
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
        String networkDevinfo = getNetworkDevinfo(PluginConstants.KEY_APP_ID, d.f4899h);
        this.f1151a = networkDevinfo;
        if (networkDevinfo == null || networkDevinfo.length() <= 0) {
            String networkDevinfo2 = getNetworkDevinfo(6, PluginConstants.KEY_APP_ID, d.f4899h);
            this.f1151a = networkDevinfo2;
            if (networkDevinfo2 == null || networkDevinfo2.length() <= 0) {
                return;
            }
            copyNetworkDevinfo(6, 24);
            this.f1151a = getNetworkDevinfo(PluginConstants.KEY_APP_ID, d.f4899h);
            SSDKLog.b().a("Try to use the dev info of QZone, this will cause Id and SortId field are always 0.", new Object[0]);
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
    public String uploadImageToFileServer(String str) {
        return super.uploadImageToFileServer(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
        if (str == null || str.length() < 0) {
            str = this.db.getUserId();
        }
        if (str != null && str.length() >= 0) {
            try {
                HashMap<String, Object> e5 = cn.sharesdk.tencent.qq.utils.a.a(this).e(str);
                if (e5 != null && e5.size() > 0) {
                    if (!e5.containsKey("ret")) {
                        PlatformActionListener platformActionListener = this.listener;
                        if (platformActionListener != null) {
                            platformActionListener.onError(this, 8, new Throwable());
                            return;
                        }
                        return;
                    } else if (((Integer) e5.get("ret")).intValue() != 0) {
                        if (this.listener != null) {
                            this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(e5)));
                            return;
                        }
                        return;
                    } else {
                        if (str == this.db.getUserId()) {
                            this.db.put("nickname", String.valueOf(e5.get("nickname")));
                            if (e5.containsKey("figureurl_qq_2")) {
                                this.db.put("icon", String.valueOf(e5.get("figureurl_qq_2")));
                            } else if (e5.containsKey("figureurl_qq_1")) {
                                this.db.put("icon", String.valueOf(e5.get("figureurl_qq_1")));
                            }
                            if (e5.containsKey("figureurl_2")) {
                                this.db.put("iconQzone", String.valueOf(e5.get("figureurl_2")));
                            } else if (e5.containsKey("figureurl_1")) {
                                this.db.put("iconQzone", String.valueOf(e5.get("figureurl_1")));
                            } else if (e5.containsKey("figureurl")) {
                                this.db.put("iconQzone", String.valueOf(e5.get("figureurl")));
                            }
                            this.db.put("secretType", String.valueOf(e5.get("is_yellow_vip")));
                            if (String.valueOf(e5.get("is_yellow_vip")).equals("1")) {
                                this.db.put("snsUserLevel", String.valueOf(e5.get(SimulatorExitPlayActivity_.O)));
                            }
                            String valueOf = String.valueOf(e5.get("gender"));
                            int stringRes = ResHelper.getStringRes(MobSDK.getContext(), "ssdk_gender_male");
                            int stringRes2 = ResHelper.getStringRes(MobSDK.getContext(), "ssdk_gender_female");
                            if (valueOf.equals(MobSDK.getContext().getString(stringRes))) {
                                this.db.put("gender", "0");
                            } else if (valueOf.equals(MobSDK.getContext().getString(stringRes2))) {
                                this.db.put("gender", "1");
                            } else {
                                this.db.put("gender", "2");
                            }
                        }
                        if (this.listener != null) {
                            if (this.db.get("userTags") != null) {
                                e5.put("userTags", this.db.get("userTags"));
                            }
                            this.listener.onComplete(this, 8, e5);
                            return;
                        }
                        return;
                    }
                }
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 8, new Throwable());
                    return;
                }
                return;
            } catch (Throwable th) {
                PlatformActionListener platformActionListener3 = this.listener;
                if (platformActionListener3 != null) {
                    platformActionListener3.onError(this, 8, th);
                    return;
                }
                return;
            }
        }
        PlatformActionListener platformActionListener4 = this.listener;
        if (platformActionListener4 != null) {
            platformActionListener4.onError(this, 8, new RuntimeException("qq account is null"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(cn.sharesdk.tencent.qq.utils.a aVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, int i4, String str7, String str8, String str9, int i5, final Platform.ShareParams shareParams) {
        try {
            aVar.a(str, str2, str3, str4, str5, str6, new PlatformActionListener() { // from class: cn.sharesdk.tencent.qq.QQ.3
                @Override // cn.sharesdk.framework.PlatformActionListener
                public void onCancel(Platform platform, int i6) {
                    if (((Platform) QQ.this).listener != null) {
                        ((Platform) QQ.this).listener.onCancel(QQ.this, 9);
                    }
                }

                @Override // cn.sharesdk.framework.PlatformActionListener
                public void onComplete(Platform platform, int i6, HashMap<String, Object> hashMap) {
                    HashMap<String, Object> hashMap2 = new HashMap<>();
                    hashMap2.put("ShareParams", shareParams);
                    if (((Platform) QQ.this).listener != null) {
                        ((Platform) QQ.this).listener.onComplete(QQ.this, 9, hashMap2);
                    }
                }

                @Override // cn.sharesdk.framework.PlatformActionListener
                public void onError(Platform platform, int i6, Throwable th) {
                    if (((Platform) QQ.this).listener != null) {
                        ((Platform) QQ.this).listener.onError(QQ.this, 9, th);
                    }
                }
            }, z4, i4, str7, str8, str9, i5, this.isClientValid);
        } catch (Throwable th) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 9, th);
            }
        }
    }
}
