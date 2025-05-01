package com.join.mgps.Util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.onekeyshare.ShareContentCustomizeCallback;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.tencent.qq.utils.QQClientNotExistException;
import cn.sharesdk.tencent.qzone.QZone;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;
import cn.sharesdk.wechat.utils.WechatClientNotExistException;
import com.MApplication;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.ShareBeanMain;
import com.join.mgps.dto.SharePostRequest;
import com.join.mgps.service.CommonService_;
import com.tencent.bugly.Bugly;
import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
/* compiled from: CommonUtil.java */
/* loaded from: classes3.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static String f28036a = "CommonUtil";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommonUtil.java */
    /* loaded from: classes3.dex */
    public class a implements ShareContentCustomizeCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f28037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28038b;

        a(Context context, String str) {
            this.f28037a = context;
            this.f28038b = str;
        }

        @Override // cn.sharesdk.onekeyshare.ShareContentCustomizeCallback
        public void onShare(Platform platform, Platform.ShareParams shareParams) {
            int i4;
            String str = SinaWeibo.NAME;
            if (str.equals(platform.getName())) {
                shareParams.setTitleUrl("http://tuis.5fun.com/?aid=Nif7jk&t=" + System.currentTimeMillis());
                shareParams.setText("海量免费经典游戏，深度手机定制优化，超爽联机体验！\n http://tuis.5fun.com/?aid=Nif7jk");
            }
            String str2 = QZone.NAME;
            if (str2.equals(platform.getName())) {
                shareParams.setTitleUrl("http://tuis.5fun.com/?aid=Nif7jk&t=" + System.currentTimeMillis());
                shareParams.setImageUrl(com.join.mgps.rpc.h.L + "/upload/images/wf_ico.png");
            }
            String str3 = Wechat.NAME;
            if (str3.equals(platform.getName())) {
                shareParams.setTitleUrl("http://tuis.5fun.com/?aid=Nif7jk&t=" + System.currentTimeMillis());
            }
            String str4 = WechatMoments.NAME;
            if (str4.equals(platform.getName())) {
                shareParams.setTitleUrl("http://tuis.5fun.com/?aid=Nif7jk&t=" + System.currentTimeMillis());
            }
            String str5 = QQ.NAME;
            if (str5.equals(platform.getName())) {
                shareParams.setTitleUrl("http://tuis.5fun.com/?aid=Nif7jk&t=" + System.currentTimeMillis());
            }
            if (platform.getName().equals(str3)) {
                i4 = 1;
            } else if (platform.getName().equals(str4)) {
                i4 = 2;
            } else if (platform.getName().equals(str5)) {
                i4 = 3;
            } else if (platform.getName().equals(str2)) {
                i4 = 4;
            } else {
                i4 = platform.getName().equals(str) ? 5 : -1;
            }
            MApplication.f1497x.G(true);
            com.papa.sim.statistic.p.l(this.f28037a).U1(this.f28038b, 1, i4, "0", "0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommonUtil.java */
    /* loaded from: classes3.dex */
    public class b implements ShareContentCustomizeCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareBean f28039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f28040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28041c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f28042d;

        b(ShareBean shareBean, Context context, String str, int i4) {
            this.f28039a = shareBean;
            this.f28040b = context;
            this.f28041c = str;
            this.f28042d = i4;
        }

        @Override // cn.sharesdk.onekeyshare.ShareContentCustomizeCallback
        public void onShare(Platform platform, Platform.ShareParams shareParams) {
            int i4;
            String str;
            String str2;
            String str3;
            String str4 = SinaWeibo.NAME;
            if (str4.equals(platform.getName())) {
                String weiboShareUrl = this.f28039a.getWeiboShareUrl();
                if (g2.i(weiboShareUrl)) {
                    if (weiboShareUrl.contains("?")) {
                        str3 = weiboShareUrl + "&t=" + System.currentTimeMillis();
                    } else {
                        str3 = weiboShareUrl + "?t=" + System.currentTimeMillis();
                    }
                    shareParams.setTitleUrl(str3);
                }
                shareParams.setText(this.f28039a.getText() + "\n" + this.f28039a.getWeiboShareUrl());
            }
            String str5 = QZone.NAME;
            if (str5.equals(platform.getName())) {
                String str6 = this.f28039a.getqZoneShareUrl();
                if (g2.i(str6)) {
                    if (str6.contains("?")) {
                        str2 = str6 + "&t=" + System.currentTimeMillis();
                    } else {
                        str2 = str6 + "?t=" + System.currentTimeMillis();
                    }
                    shareParams.setTitleUrl(str2);
                }
                String imageUrl = this.f28039a.getImageUrl();
                if (g2.i(imageUrl)) {
                    shareParams.setImageUrl(imageUrl);
                }
            }
            String str7 = QQ.NAME;
            if (str7.equals(platform.getName())) {
                String qqUrl = this.f28039a.getQqUrl();
                if (g2.i(qqUrl)) {
                    if (qqUrl.contains("?")) {
                        str = qqUrl + "&t=" + System.currentTimeMillis();
                    } else {
                        str = qqUrl + "?t=" + System.currentTimeMillis();
                    }
                    shareParams.setTitleUrl(str);
                }
            }
            if (platform.getName().equals(Wechat.NAME)) {
                i4 = 1;
            } else if (platform.getName().equals(WechatMoments.NAME)) {
                i4 = 2;
            } else if (platform.getName().equals(str7)) {
                i4 = 3;
            } else if (platform.getName().equals(str5)) {
                i4 = 4;
            } else {
                i4 = platform.getName().equals(str4) ? 5 : -1;
            }
            com.papa.sim.statistic.p.l(this.f28040b).U1(this.f28041c, this.f28042d, i4, this.f28039a.getGameId(), this.f28039a.getArticleId());
        }
    }

    /* compiled from: CommonUtil.java */
    /* loaded from: classes3.dex */
    class c implements ShareContentCustomizeCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareBean f28043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f28044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28045c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f28046d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ShareContentCustomizeCallback f28047e;

        c(ShareBean shareBean, Context context, String str, int i4, ShareContentCustomizeCallback shareContentCustomizeCallback) {
            this.f28043a = shareBean;
            this.f28044b = context;
            this.f28045c = str;
            this.f28046d = i4;
            this.f28047e = shareContentCustomizeCallback;
        }

        @Override // cn.sharesdk.onekeyshare.ShareContentCustomizeCallback
        public void onShare(Platform platform, Platform.ShareParams shareParams) {
            int i4;
            String str;
            String str2;
            String str3;
            String str4 = SinaWeibo.NAME;
            if (str4.equals(platform.getName())) {
                String weiboShareUrl = this.f28043a.getWeiboShareUrl();
                if (g2.i(weiboShareUrl)) {
                    if (weiboShareUrl.contains("?")) {
                        str3 = weiboShareUrl + "&t=" + System.currentTimeMillis();
                    } else {
                        str3 = weiboShareUrl + "?t=" + System.currentTimeMillis();
                    }
                    shareParams.setTitleUrl(str3);
                }
                shareParams.setText(this.f28043a.getText() + "\n" + this.f28043a.getWeiboShareUrl());
            }
            String str5 = QZone.NAME;
            if (str5.equals(platform.getName())) {
                String str6 = this.f28043a.getqZoneShareUrl();
                if (g2.i(str6)) {
                    if (str6.contains("?")) {
                        str2 = str6 + "&t=" + System.currentTimeMillis();
                    } else {
                        str2 = str6 + "?t=" + System.currentTimeMillis();
                    }
                    shareParams.setTitleUrl(str2);
                }
                String imageUrl = this.f28043a.getImageUrl();
                if (g2.i(imageUrl)) {
                    shareParams.setImageUrl(imageUrl);
                }
            }
            String str7 = QQ.NAME;
            if (str7.equals(platform.getName())) {
                String qqUrl = this.f28043a.getQqUrl();
                if (g2.i(qqUrl)) {
                    if (qqUrl.contains("?")) {
                        str = qqUrl + "&t=" + System.currentTimeMillis();
                    } else {
                        str = qqUrl + "?t=" + System.currentTimeMillis();
                    }
                    shareParams.setTitleUrl(str);
                }
            }
            if (platform.getName().equals(Wechat.NAME)) {
                i4 = 1;
            } else if (platform.getName().equals(WechatMoments.NAME)) {
                i4 = 2;
            } else if (platform.getName().equals(str7)) {
                i4 = 3;
            } else if (platform.getName().equals(str5)) {
                i4 = 4;
            } else {
                i4 = platform.getName().equals(str4) ? 5 : -1;
            }
            com.papa.sim.statistic.p.l(this.f28044b).U1(this.f28045c, this.f28046d, i4, this.f28043a.getGameId(), this.f28043a.getArticleId());
            ShareContentCustomizeCallback shareContentCustomizeCallback = this.f28047e;
            if (shareContentCustomizeCallback != null) {
                shareContentCustomizeCallback.onShare(platform, shareParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommonUtil.java */
    /* loaded from: classes3.dex */
    public class d implements PlatformActionListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f28048b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f28049c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f28050d;

        d(Context context, int i4, String str) {
            this.f28048b = context;
            this.f28049c = i4;
            this.f28050d = str;
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onCancel(Platform platform, int i4) {
            s.e(this.f28048b, platform, this.f28049c, 1, this.f28050d, "");
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
            s.e(this.f28048b, platform, this.f28049c, 2, this.f28050d, "");
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onError(Platform platform, int i4, Throwable th) {
            if (th != null) {
                if (!(th instanceof QQClientNotExistException) && (TextUtils.isEmpty(th.getMessage()) || !th.getMessage().equals("QQClientNotExistException"))) {
                    if (th instanceof WechatClientNotExistException) {
                        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.v("目前您的微信版本过低或未安装微信，需要安装微信才能使用"));
                    }
                } else {
                    org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.v("目前您的QQ版本过低或未安装QQ，需要安装QQ才能使用"));
                }
            }
            s.e(this.f28048b, platform, this.f28049c, 3, this.f28050d, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommonUtil.java */
    /* loaded from: classes3.dex */
    public class e implements PlatformActionListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f28051b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f28052c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f28053d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f28054e;

        e(Context context, int i4, String str, String str2) {
            this.f28051b = context;
            this.f28052c = i4;
            this.f28053d = str;
            this.f28054e = str2;
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onCancel(Platform platform, int i4) {
            s.e(this.f28051b, platform, this.f28052c, 1, this.f28053d, this.f28054e);
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
            s.e(this.f28051b, platform, this.f28052c, 2, this.f28053d, this.f28054e);
        }

        @Override // cn.sharesdk.framework.PlatformActionListener
        public void onError(Platform platform, int i4, Throwable th) {
            if (th != null) {
                if (!(th instanceof QQClientNotExistException) && (TextUtils.isEmpty(th.getMessage()) || !th.getMessage().equals("QQClientNotExistException"))) {
                    if (th instanceof WechatClientNotExistException) {
                        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.v("目前您的微信版本过低或未安装微信，需要安装微信才能使用"));
                    }
                } else {
                    org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.v("目前您的QQ版本过低或未安装QQ，需要安装QQ才能使用"));
                }
            }
            s.e(this.f28051b, platform, this.f28052c, 3, this.f28053d, this.f28054e);
        }
    }

    private static void A(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setText("分享");
        shareParams.setImageUrl(str);
        Platform platform = ShareSDK.getPlatform(SinaWeibo.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    private static void B(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setText(str);
        Platform platform = ShareSDK.getPlatform(SinaWeibo.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    private static void C(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setImageUrl(str);
        Platform platform = ShareSDK.getPlatform(QZone.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    public static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String c(Context context, String str) {
        List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(8192);
        BigDecimal bigDecimal = null;
        for (int i4 = 0; i4 < installedApplications.size(); i4++) {
            ApplicationInfo applicationInfo = installedApplications.get(i4);
            if (applicationInfo.packageName.equals(str)) {
                double intValue = Integer.valueOf((int) new File(applicationInfo.publicSourceDir).length()).intValue();
                Double.isNaN(intValue);
                bigDecimal = new BigDecimal(intValue / 1048576.0d).setScale(2, 1);
            }
        }
        return bigDecimal + "";
    }

    public static String d(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return context.getString(R.string.version_name) + str;
        } catch (Exception e5) {
            e5.printStackTrace();
            return context.getString(R.string.can_not_find_version_name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, Platform platform, int i4, int i5, String str, String str2) {
        int i6;
        String str3;
        String uid = AccountUtil_.getInstance_(context).getUid();
        if (platform.getName().equals(Wechat.NAME)) {
            i6 = 1;
            str3 = "weixin";
        } else if (platform.getName().equals(WechatMoments.NAME)) {
            i6 = 2;
            str3 = "quan";
        } else if (platform.getName().equals(QQ.NAME)) {
            i6 = 3;
            str3 = "qq";
        } else if (platform.getName().equals(QZone.NAME)) {
            i6 = 4;
            str3 = "qzone";
        } else if (platform.getName().equals(SinaWeibo.NAME)) {
            i6 = 5;
            str3 = "weibo";
        } else {
            i6 = -1;
            str3 = "";
        }
        com.papa.sim.statistic.p.l(context).V1(uid, i4, i6, i5);
        SharePostRequest sharePostRequest = new SharePostRequest();
        sharePostRequest.setUid(uid);
        sharePostRequest.setStatus(i5);
        sharePostRequest.setShare_url(str);
        sharePostRequest.setRes_id(str2);
        sharePostRequest.setRes_type(i4);
        sharePostRequest.setShare_channel(str3);
        ((CommonService_.h2) CommonService_.S2(context).extra("sharePostData", sharePostRequest)).a();
    }

    public static void f(Context context, Platform platform, int i4, String str) {
        if (platform == null) {
            return;
        }
        try {
            platform.setPlatformActionListener(new d(context, i4, str));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void g(Context context, OnekeyShare onekeyShare, int i4, String str, String str2) {
        if (onekeyShare == null) {
            return;
        }
        try {
            onekeyShare.setCallback(new e(context, i4, str, str2));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void h(int i4, TextView textView) {
        if (i4 < 5) {
            textView.setBackgroundResource(R.drawable.level_bg_tiffany);
        } else if (i4 < 10) {
            textView.setBackgroundResource(R.drawable.level_bg_yellow);
        } else {
            textView.setBackgroundResource(R.drawable.level_bg_orange);
        }
    }

    public static void i(Context context) {
        String uid = AccountUtil_.getInstance_(context).getUid();
        OnekeyShare onekeyShare = new OnekeyShare();
        onekeyShare.disableSSOWhenAuthorize();
        onekeyShare.setTitle("太好啦，终于找到这个神器了");
        onekeyShare.setText("海量免费经典游戏，深度手机定制优化，超爽联机体验！");
        onekeyShare.setImageUrl(com.join.mgps.rpc.h.L + "/upload/images/wf_ico.png");
        onekeyShare.setUrl("http://tuis.5fun.com/?aid=Nif7jk&t=" + System.currentTimeMillis());
        onekeyShare.setComment("海量免费经典游戏，深度手机定制优化，超爽联机体验！");
        onekeyShare.setSite(context.getString(R.string.app_name));
        onekeyShare.setShareContentCustomizeCallback(new a(context, uid));
        g(context, onekeyShare, 1, "http://tuis.5fun.com/?aid=Nif7jk&t=" + System.currentTimeMillis(), "0");
        onekeyShare.show(context);
        com.papa.sim.statistic.p.l(context).c2(uid, 1);
    }

    public static void j(Context context, String str, int i4) {
        if (i4 == 0) {
            v(context, str, i4);
        } else if (i4 == 1) {
            w(context, str, i4);
        } else if (i4 == 2) {
            l(context, str, i4);
        } else if (i4 != 3) {
        } else {
            o(context, str, i4);
        }
    }

    private static void k(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setImageUrl(str);
        Platform platform = ShareSDK.getPlatform(QQ.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    public static void l(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(2);
        shareParams.setImagePath(str);
        Platform platform = ShareSDK.getPlatform(QQ.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    private static void m(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setText(str);
        Platform platform = ShareSDK.getPlatform(QQ.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    private static void n(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setText(str);
        shareParams.setTitle(str);
        Platform platform = ShareSDK.getPlatform(QZone.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    public static void o(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(2);
        shareParams.setImagePath(str);
        Platform platform = ShareSDK.getPlatform(QZone.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    public static void p(Context context, int i4, ShareBean shareBean) {
        String uid = AccountUtil_.getInstance_(context).getUid();
        int from = shareBean != null ? shareBean.getFrom() : 0;
        int i5 = -1;
        if (i4 == 0) {
            i5 = 1;
        } else if (i4 == 1) {
            i5 = 2;
        } else if (i4 == 2) {
            i5 = 3;
        } else if (i4 == 3) {
            i5 = 4;
        } else if (i4 == 4) {
            i5 = 5;
        }
        com.papa.sim.statistic.p.l(context).c2(uid, from);
        if (i4 == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("Id", "4");
            hashMap.put("SortId", "1");
            hashMap.put(com.alipay.sdk.packet.d.f4899h, "wxf04635c4c318fe2d");
            hashMap.put("AppSecret", "8e21d75298829047b830ac5034b7073c");
            hashMap.put("BypassApproval", Bugly.SDK_IS_DEV);
            hashMap.put("Enable", "true");
            String str = Wechat.NAME;
            ShareSDK.setPlatformDevInfo(str, hashMap);
            Platform.ShareParams shareParams = new Platform.ShareParams();
            shareParams.setShareType(4);
            shareParams.setTitle(shareBean.getTitle());
            shareParams.setText(shareBean.getText());
            shareParams.setImageUrl(shareBean.getImageUrl());
            shareParams.setUrl(shareBean.getWechatShareUrl());
            Platform platform = ShareSDK.getPlatform(str);
            f(context, platform, from, shareBean.getWechatShareUrl());
            platform.share(shareParams);
            com.papa.sim.statistic.p.l(context).U1(uid, from, i5, shareBean.getGameId(), shareBean.getArticleId());
            return;
        }
        if (i4 == 0) {
            Platform.ShareParams shareParams2 = new Platform.ShareParams();
            shareParams2.setShareType(4);
            shareParams2.setTitle(shareBean.getTitle());
            shareParams2.setText(shareBean.getText());
            shareParams2.setImageUrl(shareBean.getImageUrl());
            shareParams2.setUrl(shareBean.getWechatShareUrl());
            Platform platform2 = ShareSDK.getPlatform(Wechat.NAME);
            f(context, platform2, from, shareBean.getWechatShareUrl());
            platform2.share(shareParams2);
        } else if (i4 == 1) {
            Platform.ShareParams shareParams3 = new Platform.ShareParams();
            shareParams3.setShareType(4);
            shareParams3.setTitle(shareBean.getTitle());
            shareParams3.setText(shareBean.getText());
            shareParams3.setImageUrl(shareBean.getImageUrl());
            shareParams3.setUrl(shareBean.getWechatFriendUrl());
            Platform platform3 = ShareSDK.getPlatform(WechatMoments.NAME);
            f(context, platform3, from, shareBean.getWechatFriendUrl());
            platform3.share(shareParams3);
        } else if (i4 == 2) {
            Platform.ShareParams shareParams4 = new Platform.ShareParams();
            shareParams4.setTitle(shareBean.getTitle());
            shareParams4.setTitleUrl(shareBean.getQqUrl());
            shareParams4.setText(shareBean.getText());
            shareParams4.setImageUrl(shareBean.getImageUrl());
            shareParams4.setSite(com.join.android.app.mgsim.wufun.b.f15658i);
            Platform platform4 = ShareSDK.getPlatform(QQ.NAME);
            f(context, platform4, from, shareBean.getQqUrl());
            platform4.share(shareParams4);
        } else if (i4 == 3) {
            Platform.ShareParams shareParams5 = new Platform.ShareParams();
            shareParams5.setTitle(shareBean.getTitle());
            shareParams5.setTitleUrl(shareBean.getqZoneShareUrl());
            shareParams5.setText(shareBean.getText());
            shareParams5.setImageUrl(shareBean.getImageUrl());
            shareParams5.setSite(com.join.android.app.mgsim.wufun.b.f15658i);
            Platform platform5 = ShareSDK.getPlatform(QZone.NAME);
            f(context, platform5, from, shareBean.getqZoneShareUrl());
            platform5.share(shareParams5);
        } else if (i4 == 4) {
            Platform.ShareParams shareParams6 = new Platform.ShareParams();
            shareParams6.setText(shareBean.getText() + shareBean.getWeiboShareUrl());
            shareParams6.setImageUrl(shareBean.getImageUrl());
            Platform platform6 = ShareSDK.getPlatform(SinaWeibo.NAME);
            f(context, platform6, from, shareBean.getWeiboShareUrl());
            platform6.share(shareParams6);
        }
        com.papa.sim.statistic.p.l(context).U1(uid, from, i5, shareBean.getGameId(), shareBean.getArticleId());
    }

    public static void q(Context context, int i4, String str, int i5, int i6) {
        String uid = AccountUtil_.getInstance_(context).getUid();
        int i7 = i4 == 0 ? 1 : i4 == 1 ? 2 : i4 == 2 ? 3 : i4 == 3 ? 4 : i4 == 4 ? 5 : -1;
        if (i5 == 0) {
            try {
                ShareBean shareBean = (ShareBean) JsonMapper.getInstance().fromJson(str, ShareBean.class);
                shareBean.setFrom(i6);
                p(context, i4, shareBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (i5 == 1) {
            com.papa.sim.statistic.p.l(context).c2(uid, i6);
            if (i4 == 0) {
                z(context, str, i6);
            } else if (i4 == 1) {
                y(context, str, i6);
            } else if (i4 == 2) {
                m(context, str, i6);
            } else if (i4 == 3) {
                n(context, str, i6);
            } else if (i4 == 4) {
                B(context, str, i6);
            }
            com.papa.sim.statistic.p.l(context).U1(uid, i6, i7, "0", "0");
        } else if (i5 != 2) {
        } else {
            com.papa.sim.statistic.p.l(context).c2(uid, i6);
            if (i4 == 0) {
                u(context, str, i6);
            } else if (i4 == 1) {
                x(context, str, i6);
            } else if (i4 == 2) {
                k(context, str, i6);
            } else if (i4 == 3) {
                C(context, str, i6);
            } else if (i4 == 4) {
                A(context, str, i6);
            }
            com.papa.sim.statistic.p.l(context).U1(uid, i6, i7, "0", "0");
        }
    }

    public static void r(Context context, ShareBean shareBean) {
        try {
            String uid = AccountUtil_.getInstance_(context).getUid();
            int from = shareBean.getFrom();
            OnekeyShare onekeyShare = new OnekeyShare();
            onekeyShare.setTitle(shareBean.getTitle());
            onekeyShare.setText(shareBean.getText());
            onekeyShare.disableSSOWhenAuthorize();
            String imageUrl = shareBean.getImageUrl();
            if (g2.i(imageUrl)) {
                onekeyShare.setImageUrl(imageUrl);
            }
            String wechatShareUrl = shareBean.getWechatShareUrl();
            if (g2.i(wechatShareUrl)) {
                if (wechatShareUrl.contains("?")) {
                    wechatShareUrl = wechatShareUrl + "&t=" + System.currentTimeMillis();
                } else {
                    wechatShareUrl = wechatShareUrl + "?t=" + System.currentTimeMillis();
                }
                onekeyShare.setUrl(wechatShareUrl);
            }
            onekeyShare.setComment(shareBean.getText());
            onekeyShare.setSite(context.getString(R.string.app_name));
            onekeyShare.setShareContentCustomizeCallback(new b(shareBean, context, uid, from));
            g(context, onekeyShare, from, wechatShareUrl, shareBean.getGameId());
            onekeyShare.show(context);
            com.papa.sim.statistic.p.l(context).c2(uid, from);
        } catch (Exception e5) {
            e5.printStackTrace();
            l2.a(context).b("分享失败。");
        }
    }

    public static void s(Context context, String str, int i4) {
        try {
            ShareBean share = ((ShareBeanMain) JsonMapper.getInstance().fromJson(str, ShareBeanMain.class)).getShare();
            if (share != null) {
                share.setFrom(i4);
                share.toString();
            }
            r(context, share);
        } catch (Exception e5) {
            e5.printStackTrace();
            l2.a(context).b("分享失败。");
        }
    }

    public static void t(Context context, ShareBean shareBean, ShareContentCustomizeCallback shareContentCustomizeCallback) {
        try {
            String uid = AccountUtil_.getInstance_(context).getUid();
            int from = shareBean.getFrom();
            OnekeyShare onekeyShare = new OnekeyShare();
            onekeyShare.disableSSOWhenAuthorize();
            onekeyShare.setTitle(shareBean.getTitle());
            onekeyShare.setText(shareBean.getText());
            String imageUrl = shareBean.getImageUrl();
            if (g2.i(imageUrl)) {
                onekeyShare.setImageUrl(imageUrl);
            }
            String wechatShareUrl = shareBean.getWechatShareUrl();
            if (g2.i(wechatShareUrl)) {
                if (wechatShareUrl.contains("?")) {
                    wechatShareUrl = wechatShareUrl + "&t=" + System.currentTimeMillis();
                } else {
                    wechatShareUrl = wechatShareUrl + "?t=" + System.currentTimeMillis();
                }
                onekeyShare.setUrl(wechatShareUrl);
            }
            onekeyShare.setComment(shareBean.getText());
            onekeyShare.setSite(context.getString(R.string.app_name));
            onekeyShare.setShareContentCustomizeCallback(new c(shareBean, context, uid, from, shareContentCustomizeCallback));
            g(context, onekeyShare, from, wechatShareUrl, shareBean.getGameId());
            onekeyShare.show(context);
            com.papa.sim.statistic.p.l(context).c2(uid, from);
        } catch (Exception e5) {
            e5.printStackTrace();
            l2.a(context).b("分享失败。");
        }
    }

    private static void u(Context context, String str, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("Id", "4");
        hashMap.put("SortId", "1");
        hashMap.put(com.alipay.sdk.packet.d.f4899h, "wxf04635c4c318fe2d");
        hashMap.put("AppSecret", "8e21d75298829047b830ac5034b7073c");
        hashMap.put("BypassApproval", Bugly.SDK_IS_DEV);
        hashMap.put("Enable", "true");
        String str2 = Wechat.NAME;
        ShareSDK.setPlatformDevInfo(str2, hashMap);
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(2);
        shareParams.setTitle("分享");
        shareParams.setImageUrl(str);
        Platform platform = ShareSDK.getPlatform(str2);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    public static void v(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(2);
        shareParams.setImagePath(str);
        Platform platform = ShareSDK.getPlatform(Wechat.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    public static void w(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setImagePath(str);
        shareParams.setShareType(2);
        Platform platform = ShareSDK.getPlatform(WechatMoments.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    private static void x(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(2);
        shareParams.setTitle("分享");
        shareParams.setImageUrl(str);
        Platform platform = ShareSDK.getPlatform(WechatMoments.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    private static void y(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(1);
        shareParams.setTitle("分享");
        shareParams.setText(str);
        Platform platform = ShareSDK.getPlatform(WechatMoments.NAME);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }

    private static void z(Context context, String str, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("Id", "4");
        hashMap.put("SortId", "1");
        hashMap.put(com.alipay.sdk.packet.d.f4899h, "wxf04635c4c318fe2d");
        hashMap.put("AppSecret", "8e21d75298829047b830ac5034b7073c");
        hashMap.put("BypassApproval", Bugly.SDK_IS_DEV);
        hashMap.put("Enable", "true");
        String str2 = Wechat.NAME;
        ShareSDK.setPlatformDevInfo(str2, hashMap);
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(1);
        shareParams.setTitle("分享");
        shareParams.setText(str);
        Platform platform = ShareSDK.getPlatform(str2);
        f(context, platform, i4, str);
        platform.share(shareParams);
    }
}
