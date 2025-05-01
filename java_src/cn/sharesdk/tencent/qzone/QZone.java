package cn.sharesdk.tencent.qzone;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.g;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.tencent.qzone.utils.QQClientNotExistException;
import cn.sharesdk.tencent.qzone.utils.b;
import com.alipay.sdk.packet.d;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import com.mob.MobSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class QZone extends Platform {
    public static final String NAME = "QZone";

    /* renamed from: a  reason: collision with root package name */
    private String f1221a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1222b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i4, Object obj) {
        b a5 = b.a(this);
        if (this.isClientValid && this.f1222b && i4 == 9) {
            return true;
        }
        if (!isAuthValid() && i4 != 9) {
            innerAuthorize(i4, obj);
            return false;
        }
        a5.a(this.f1221a);
        a5.b(this.db.getUserId());
        a5.c(this.db.getToken());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        final b a5 = b.a(this);
        a5.a(this.f1221a);
        a5.a(strArr);
        a5.a(new AuthorizeListener() { // from class: cn.sharesdk.tencent.qzone.QZone.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (((Platform) QZone.this).listener != null) {
                    ((Platform) QZone.this).listener.onCancel(QZone.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                String string = bundle.getString("open_id");
                String string2 = bundle.getString("access_token");
                String string3 = bundle.getString("expires_in");
                ((Platform) QZone.this).db.putToken(string2);
                ((Platform) QZone.this).db.putTokenSecret("");
                try {
                    ((Platform) QZone.this).db.putExpiresIn(ResHelper.parseLong(string3));
                } catch (Throwable th) {
                    SSDKLog.b().a(th);
                }
                ((Platform) QZone.this).db.putUserId(string);
                String string4 = bundle.getString("pf");
                String string5 = bundle.getString("pfkey");
                String string6 = bundle.getString("pay_token");
                ((Platform) QZone.this).db.put("pf", string4);
                ((Platform) QZone.this).db.put("pfkey", string5);
                ((Platform) QZone.this).db.put("pay_token", string6);
                a5.b(string);
                a5.c(string2);
                a5.a();
                QZone.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th) {
                if (((Platform) QZone.this).listener != null) {
                    ((Platform) QZone.this).listener.onError(QZone.this, 1, th);
                }
            }
        }, isSSODisable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i4, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        HashMap<String, Object> a5 = b.a(this).a(str, str2, hashMap, hashMap2);
        if (a5 != null && a5.size() > 0) {
            if (!a5.containsKey("ret")) {
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, i4, new Throwable());
                    return;
                }
                return;
            } else if (((Integer) a5.get("ret")).intValue() != 0) {
                if (this.listener != null) {
                    this.listener.onError(this, i4, new Throwable(new Hashon().fromHashMap(a5)));
                    return;
                }
                return;
            } else {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onComplete(this, i4, a5);
                    return;
                }
                return;
            }
        }
        PlatformActionListener platformActionListener3 = this.listener;
        if (platformActionListener3 != null) {
            platformActionListener3.onError(this, i4, new Throwable());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doShare(Platform.ShareParams shareParams) {
        b.a(this);
        SSDKLog b5 = SSDKLog.b();
        b5.a("QZone start Share with Appid:" + this.f1221a + "bypassApproval:" + this.f1222b, new Object[0]);
        SSDKLog b6 = SSDKLog.b();
        StringBuilder sb = new StringBuilder();
        sb.append("QZone ShareParams:");
        sb.append(shareParams.toString());
        b6.a(sb.toString(), new Object[0]);
        if (this.isClientValid && this.f1222b) {
            try {
                a(shareParams);
            } catch (Throwable th) {
                if (this.listener != null) {
                    this.listener.onError(this, 9, th);
                }
            }
        } else if (shareParams.isShareTencentWeibo()) {
            b(shareParams);
        } else {
            c(shareParams);
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
        aVar.f902b = shareParams.getText();
        String imageUrl = shareParams.getImageUrl();
        String imagePath = shareParams.getImagePath();
        if (imagePath != null) {
            aVar.f905e.add(imagePath);
        } else if (hashMap.get("large_url") != null) {
            aVar.f904d.add(String.valueOf(hashMap.get("large_url")));
        } else if (hashMap.get("small_url") != null) {
            aVar.f904d.add(String.valueOf(hashMap.get("small_url")));
        } else if (imageUrl != null) {
            aVar.f904d.add(imageUrl);
        }
        String titleUrl = shareParams.getTitleUrl();
        if (titleUrl != null) {
            aVar.f903c.add(titleUrl);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("title", shareParams.getTitle());
        hashMap2.put("titleUrl", shareParams.getTitleUrl());
        hashMap2.put("site", shareParams.getSite());
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
        return 6;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 2;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f1221a = getDevinfo(d.f4899h);
        this.f1222b = "true".equals(getDevinfo("BypassApproval"));
        String str2 = this.f1221a;
        if (str2 == null || str2.length() <= 0) {
            String devinfo = getDevinfo(QQ.NAME, d.f4899h);
            this.f1221a = devinfo;
            if (devinfo == null || devinfo.length() <= 0) {
                return;
            }
            copyDevinfo(QQ.NAME, NAME);
            this.f1221a = getDevinfo(d.f4899h);
            SSDKLog.b().a("Try to use the dev info of QQ, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            b a5 = b.a(this);
            a5.a(this.f1221a);
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
        this.f1221a = networkDevinfo;
        if (networkDevinfo == null || networkDevinfo.length() <= 0) {
            String networkDevinfo2 = getNetworkDevinfo(24, PluginConstants.KEY_APP_ID, d.f4899h);
            this.f1221a = networkDevinfo2;
            if (networkDevinfo2 == null || networkDevinfo2.length() <= 0) {
                return;
            }
            copyNetworkDevinfo(24, 6);
            this.f1221a = getNetworkDevinfo(PluginConstants.KEY_APP_ID, d.f4899h);
            SSDKLog.b().a("Try to use the dev info of QQ, this will cause Id and SortId field are always 0.", new Object[0]);
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
        if (str == null || str.length() < 0) {
            str = this.db.getUserId();
        }
        if (str != null && str.length() >= 0) {
            try {
                HashMap<String, Object> d5 = b.a(this).d(str);
                if (d5 != null && d5.size() > 0) {
                    if (!d5.containsKey("ret")) {
                        PlatformActionListener platformActionListener = this.listener;
                        if (platformActionListener != null) {
                            platformActionListener.onError(this, 8, new Throwable());
                            return;
                        }
                        return;
                    } else if (((Integer) d5.get("ret")).intValue() != 0) {
                        if (this.listener != null) {
                            this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(d5)));
                            return;
                        }
                        return;
                    } else {
                        if (str == this.db.getUserId()) {
                            this.db.put("nickname", String.valueOf(d5.get("nickname")));
                            if (d5.containsKey("figureurl_qq_2")) {
                                this.db.put("iconQQ", String.valueOf(d5.get("figureurl_qq_2")));
                            } else if (d5.containsKey("figureurl_qq_1")) {
                                this.db.put("iconQQ", String.valueOf(d5.get("figureurl_qq_1")));
                            }
                            if (d5.containsKey("figureurl_2")) {
                                this.db.put("icon", String.valueOf(d5.get("figureurl_2")));
                            } else if (d5.containsKey("figureurl_1")) {
                                this.db.put("icon", String.valueOf(d5.get("figureurl_1")));
                            } else if (d5.containsKey("figureurl")) {
                                this.db.put("icon", String.valueOf(d5.get("figureurl")));
                            }
                            this.db.put("secretType", String.valueOf(d5.get("is_yellow_vip")));
                            if (String.valueOf(d5.get("is_yellow_vip")).equals("1")) {
                                this.db.put("snsUserLevel", String.valueOf(d5.get(SimulatorExitPlayActivity_.O)));
                            }
                            String valueOf = String.valueOf(d5.get("gender"));
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
                                d5.put("userTags", this.db.get("userTags"));
                            }
                            this.listener.onComplete(this, 8, d5);
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

    private void b(final Platform.ShareParams shareParams) {
        String imageUrl = shareParams.getImageUrl();
        final String imagePath = shareParams.getImagePath();
        final boolean isShareTencentWeibo = shareParams.isShareTencentWeibo();
        try {
            if (TextUtils.isEmpty(imagePath) && !TextUtils.isEmpty(imageUrl)) {
                shareParams.setImagePath(BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl));
                doShare(shareParams);
            } else if (!isAuthValid()) {
                final PlatformActionListener platformActionListener = getPlatformActionListener();
                setPlatformActionListener(new PlatformActionListener() { // from class: cn.sharesdk.tencent.qzone.QZone.2
                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onCancel(Platform platform, int i4) {
                        PlatformActionListener platformActionListener2 = platformActionListener;
                        if (platformActionListener2 != null) {
                            platformActionListener2.onCancel(platform, 9);
                        }
                    }

                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
                        QZone.this.setPlatformActionListener(platformActionListener);
                        QZone.this.doShare(shareParams);
                    }

                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onError(Platform platform, int i4, Throwable th) {
                        PlatformActionListener platformActionListener2 = platformActionListener;
                        if (platformActionListener2 != null) {
                            platformActionListener2.onError(platform, 9, th);
                        }
                    }
                });
                authorize();
            } else {
                String text = shareParams.getText();
                if (TextUtils.isEmpty(text)) {
                    PlatformActionListener platformActionListener2 = this.listener;
                    if (platformActionListener2 != null) {
                        platformActionListener2.onError(this, 9, new Throwable("share params' value of text is empty!"));
                        return;
                    }
                    return;
                }
                getShortLintk(text, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.tencent.qzone.QZone.3
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(String str) {
                        HashMap<String, Object> a5;
                        try {
                            shareParams.setText(str);
                            b a6 = b.a(QZone.this);
                            if (isShareTencentWeibo) {
                                a5 = a6.b(imagePath, str);
                            } else {
                                a5 = a6.a(imagePath, str);
                            }
                            if (a5 == null && ((Platform) QZone.this).listener != null) {
                                ((Platform) QZone.this).listener.onError(QZone.this, 9, new Throwable("response is empty"));
                            }
                            a5.put("ShareParams", shareParams);
                            if (((Platform) QZone.this).listener != null) {
                                ((Platform) QZone.this).listener.onComplete(QZone.this, 9, a5);
                            }
                        } catch (Throwable th) {
                            if (((Platform) QZone.this).listener != null) {
                                ((Platform) QZone.this).listener.onError(QZone.this, 9, th);
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, 9, th);
            }
        }
    }

    private void c(final Platform.ShareParams shareParams) {
        try {
            String imageUrl = shareParams.getImageUrl();
            String imagePath = shareParams.getImagePath();
            if (this.isClientValid) {
                String str = (TextUtils.isEmpty(imagePath) || !new File(imagePath).exists()) ? imageUrl : imagePath;
                String title = shareParams.getTitle();
                String titleUrl = shareParams.getTitleUrl();
                String site = shareParams.getSite();
                String text = shareParams.getText();
                String filePath = shareParams.getFilePath();
                String[] imageArray = shareParams.getImageArray();
                int shareType = shareParams.getShareType();
                String qQMiniProgramAppid = shareParams.getQQMiniProgramAppid();
                String qQMiniProgramPath = shareParams.getQQMiniProgramPath();
                String qQMiniProgramType = shareParams.getQQMiniProgramType();
                String imageUrl2 = shareParams.getImageUrl();
                b a5 = b.a(this);
                a5.a(shareParams.isDisableNewTask());
                PlatformActionListener platformActionListener = new PlatformActionListener() { // from class: cn.sharesdk.tencent.qzone.QZone.4
                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onCancel(Platform platform, int i4) {
                        if (((Platform) QZone.this).listener != null) {
                            ((Platform) QZone.this).listener.onCancel(QZone.this, 9);
                        }
                    }

                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
                        if (((Platform) QZone.this).listener != null) {
                            hashMap.put("ShareParams", shareParams);
                            ((Platform) QZone.this).listener.onComplete(QZone.this, 9, hashMap);
                        }
                    }

                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onError(Platform platform, int i4, Throwable th) {
                        if (((Platform) QZone.this).listener != null) {
                            ((Platform) QZone.this).listener.onError(QZone.this, 9, th);
                        }
                    }
                };
                if (imagePath == null && str == null && imageArray != null) {
                    if (imageArray.length == 0) {
                        PlatformActionListener platformActionListener2 = this.listener;
                        if (platformActionListener2 != null) {
                            platformActionListener2.onError(this, 9, new Throwable("imageArray is Empty"));
                            return;
                        }
                        return;
                    }
                    a5.a(imageArray, platformActionListener);
                    return;
                }
                a5.a(shareType, title, titleUrl, text, str, site, filePath, qQMiniProgramAppid, qQMiniProgramPath, qQMiniProgramType, imageUrl2, platformActionListener);
                return;
            }
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, 9, new QQClientNotExistException());
            }
        } catch (Throwable th) {
            PlatformActionListener platformActionListener4 = this.listener;
            if (platformActionListener4 != null) {
                platformActionListener4.onError(this, 9, th);
            }
        }
    }

    private void a(Platform.ShareParams shareParams) throws Throwable {
        g gVar = new g();
        gVar.a("com.qzone", "com.qzonex.module.operation.ui.QZonePublishMoodActivity");
        gVar.a(shareParams, this);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ShareParams", shareParams);
        this.listener.onComplete(this, 9, hashMap);
    }
}
