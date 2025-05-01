package cn.sharesdk.tencent.qzone.utils;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.e;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.ShareSDKFileProvider;
import cn.sharesdk.framework.utils.i;
import cn.sharesdk.onekeyshare.OnekeyShare;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.facebook.common.util.f;
import com.mob.MobSDK;
import com.mob.tools.RxMob;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import io.netty.util.internal.StringUtil;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: QZoneHelper.java */
/* loaded from: classes2.dex */
public class b extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f1246b = {"get_user_info", "get_simple_userinfo", "get_user_profile", "get_app_friends", "add_share", "list_album", "upload_pic", "add_album", "set_user_face", "get_vip_info", "get_vip_rich_info", "get_intimate_friends_weibo", "match_nick_tips_weibo", "add_t", "add_pic_t"};

    /* renamed from: c  reason: collision with root package name */
    private static b f1247c;

    /* renamed from: d  reason: collision with root package name */
    private String f1248d;

    /* renamed from: e  reason: collision with root package name */
    private String f1249e;

    /* renamed from: f  reason: collision with root package name */
    private String f1250f;

    /* renamed from: g  reason: collision with root package name */
    private String f1251g;

    /* renamed from: h  reason: collision with root package name */
    private SSDKNetworkHelper f1252h;

    /* renamed from: i  reason: collision with root package name */
    private String[] f1253i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1254j;

    private b(Platform platform) {
        super(platform);
        this.f1252h = SSDKNetworkHelper.getInstance();
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        String redirectUri;
        ShareSDK.logApiEvent("/oauth2.0/authorize", b());
        String c5 = c();
        try {
            redirectUri = Data.urlEncode(getRedirectUri(), "utf-8");
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            redirectUri = getRedirectUri();
        }
        return "https://graph.qq.com/oauth2.0/m_authorize?response_type=token&client_id=" + this.f1248d + "&redirect_uri=" + redirectUri + "&display=mobile&scope=" + c5;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
        return new a(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return "auth://tauth.qq.com/";
    }

    @Override // cn.sharesdk.framework.e, cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
        c cVar = new c(sSOAuthorizeActivity);
        cVar.a(5656);
        cVar.a(this.f1248d, c());
        return cVar;
    }

    private String c() {
        String[] strArr = this.f1253i;
        if (strArr == null) {
            strArr = f1246b;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (String str : strArr) {
            if (i4 > 0) {
                sb.append(StringUtil.COMMA);
            }
            sb.append(str);
            i4++;
        }
        return sb.toString();
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e5) {
            SSDKLog b5 = SSDKLog.b();
            b5.b("getBytesUTF8: UnsupportedEncodingException" + e5);
            return new byte[0];
        }
    }

    private String g(String str) {
        if (Build.VERSION.SDK_INT > 10) {
            try {
                Class<?> cls = ReflectHelper.getClass("android.media.MediaMetadataRetriever");
                Object newInstance = cls.newInstance();
                cls.getMethod("setDataSource", String.class).invoke(newInstance, str);
                return (String) ReflectHelper.invokeInstanceMethod(newInstance, "extractMetadata", 9);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    private String h(String str) {
        try {
            File file = new File(str);
            Context context = MobSDK.getContext();
            Uri a5 = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file);
            MobSDK.getContext().grantUriPermission("com.tencent.mobileqq", a5, 3);
            MobSDK.getContext().grantUriPermission("com.tencent.tim", a5, 3);
            MobSDK.getContext().grantUriPermission("com.tencent.minihd.qq", a5, 3);
            MobSDK.getContext().grantUriPermission("com.tencent.qqlite", a5, 3);
            if (a5 == null) {
                return null;
            }
            return a5.toString();
        } catch (Throwable th) {
            SSDKLog b5 = SSDKLog.b();
            b5.b("pathToUrl" + th);
            return null;
        }
    }

    public HashMap<String, Object> d(String str) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("access_token", this.f1250f));
        arrayList.add(new KVPair<>("oauth_consumer_key", this.f1248d));
        arrayList.add(new KVPair<>("openid", this.f1249e));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Agent", System.getProperties().getProperty("http.agent") + " ArzenAndroidSDK"));
        String httpGet = this.f1252h.httpGet("https://graph.qq.com/user/get_simple_userinfo", arrayList, arrayList2, null, "/user/get_simple_userinfo", b());
        if (httpGet == null || httpGet.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(httpGet);
    }

    public HashMap<String, Object> e(String str) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("access_token", str));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Agent", System.getProperties().getProperty("http.agent") + " ArzenAndroidSDK"));
        String httpGet = this.f1252h.httpGet("https://graph.qq.com/oauth2.0/me", arrayList, arrayList2, null, "/oauth2.0/me", b());
        if (httpGet.startsWith(com.alipay.sdk.authjs.a.f4787i)) {
            while (!httpGet.startsWith("{") && httpGet.length() > 0) {
                httpGet = httpGet.substring(1);
            }
            while (!httpGet.endsWith("}") && httpGet.length() > 0) {
                httpGet = httpGet.substring(0, httpGet.length() - 1);
            }
        }
        if (httpGet.length() > 0) {
            return new Hashon().fromJson(httpGet);
        }
        return null;
    }

    public void b(String str) {
        this.f1249e = str;
    }

    public static b a(Platform platform) {
        if (f1247c == null) {
            f1247c = new b(platform);
        }
        return f1247c;
    }

    public HashMap<String, Object> b(String str, String str2) throws Throwable {
        String httpPost;
        boolean z4 = !TextUtils.isEmpty(str);
        String str3 = z4 ? "/t/add_pic_t" : "/t/add_t";
        String str4 = "https://graph.qq.com" + str3;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("oauth_consumer_key", this.f1248d));
        arrayList.add(new KVPair<>("access_token", this.f1250f));
        arrayList.add(new KVPair<>("openid", this.f1249e));
        arrayList.add(new KVPair<>(IjkMediaMeta.IJKM_KEY_FORMAT, "json"));
        arrayList.add(new KVPair<>("content", str2));
        if (z4) {
            httpPost = this.f1252h.httpPost(str4, arrayList, new KVPair<>("pic", str), str3, b());
        } else {
            httpPost = this.f1252h.httpPost(str4, arrayList, str3, b());
        }
        if (httpPost == null || httpPost.length() <= 0) {
            return null;
        }
        HashMap<String, Object> fromJson = new Hashon().fromJson(httpPost);
        if (((Integer) fromJson.get("ret")).intValue() == 0) {
            return fromJson;
        }
        throw new Throwable(httpPost);
    }

    public void a(boolean z4) {
        this.f1254j = z4;
    }

    public void a(String str) {
        this.f1248d = str;
    }

    public void c(String str) {
        this.f1250f = str;
    }

    public void a(String[] strArr) {
        this.f1253i = strArr;
    }

    public void a(final AuthorizeListener authorizeListener, boolean z4) {
        a(new SSOListener() { // from class: cn.sharesdk.tencent.qzone.utils.b.1
            @Override // cn.sharesdk.framework.authorize.SSOListener
            public void onCancel() {
                authorizeListener.onCancel();
            }

            @Override // cn.sharesdk.framework.authorize.SSOListener
            public void onComplete(Bundle bundle) {
                authorizeListener.onComplete(bundle);
            }

            @Override // cn.sharesdk.framework.authorize.SSOListener
            public void onFailed(Throwable th) {
                if (th != null) {
                    authorizeListener.onError(th);
                } else {
                    authorizeListener.onError(new Throwable("Unknown Throwable!"));
                }
            }
        });
    }

    public void a() {
        RxMob.Subscribable create = RxMob.create(new RxMob.OnSubscribe() { // from class: cn.sharesdk.tencent.qzone.utils.QZoneHelper$2
            @Override // com.mob.tools.RxMob.OnSubscribe
            public void call(RxMob.Subscriber subscriber) {
                String str;
                Platform platform;
                ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                str = b.this.f1250f;
                arrayList.add(new KVPair<>("access_token", str));
                arrayList.add(new KVPair<>("unionid", "1"));
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 10000;
                networkTimeOut.connectionTimeout = 10000;
                SSDKNetworkHelper sSDKNetworkHelper = SSDKNetworkHelper.getInstance();
                try {
                    b.this.f1251g = sSDKNetworkHelper.httpPost("https://graph.qq.com/oauth2.0/me", arrayList, (KVPair<String>) null, (ArrayList<KVPair<String>>) null, networkTimeOut);
                    subscriber.onCompleted();
                } catch (Throwable unused) {
                    platform = ((e) b.this).f976a;
                    platform.getDb().put("unionid", "");
                    SSDKLog.b().a("qq auth, get unionId fail", new Object[0]);
                }
            }
        });
        create.subscribeOn(RxMob.Thread.NEW_THREAD);
        create.observeOn(RxMob.Thread.IMMEDIATE);
        create.subscribe(new RxMob.Subscriber() { // from class: cn.sharesdk.tencent.qzone.utils.QZoneHelper$3
            @Override // com.mob.tools.RxMob.Subscriber
            public void onCompleted() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Platform platform;
                Platform platform2;
                str = b.this.f1251g;
                if (str != null) {
                    str2 = b.this.f1251g;
                    if (str2.length() > 0) {
                        b bVar = b.this;
                        str3 = bVar.f1251g;
                        bVar.f1251g = str3.replace("callback( ", "");
                        b bVar2 = b.this;
                        str4 = bVar2.f1251g;
                        bVar2.f1251g = str4.replace(" );", "");
                        Hashon hashon = new Hashon();
                        str5 = b.this.f1251g;
                        HashMap fromJson = hashon.fromJson(str5);
                        if (fromJson.containsKey("unionid")) {
                            platform2 = ((e) b.this).f976a;
                            platform2.getDb().put("unionid", (String) fromJson.get("unionid"));
                            return;
                        }
                        platform = ((e) b.this).f976a;
                        platform.getDb().put("unionid", "");
                    }
                }
            }

            @Override // com.mob.tools.RxMob.Subscriber
            public void onError(Throwable th) {
                Platform platform;
                platform = ((e) b.this).f976a;
                platform.getDb().put("unionid", "");
                SSDKLog.b().a("qq auth, get unionId fail", new Object[0]);
            }
        });
    }

    public void a(final int i4, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, String str7, String str8, String str9, String str10, final PlatformActionListener platformActionListener) throws Throwable {
        DH.requester(MobSDK.getContext()).getAppName().request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qzone.utils.b.2
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String appName = dHResponse.getAppName();
                    String str11 = str5;
                    String str12 = str;
                    if (!TextUtils.isEmpty(str11)) {
                        appName = str11;
                    }
                    if (appName.length() > 20) {
                        appName = appName.substring(0, 20) + "...";
                    }
                    String str13 = appName;
                    if (!TextUtils.isEmpty(str12) && str12.length() > 200) {
                        str12 = str12.substring(0, 200);
                    }
                    b.this.a(i4, str12, str2, str3, str4, str13, str6, platformActionListener);
                } catch (Throwable th) {
                    SSDKLog.b().a("qzone share " + th, new Object[0]);
                }
            }
        });
    }

    public void a(int i4, String str, String str2, String str3, String str4, String str5, String str6, PlatformActionListener platformActionListener) throws Throwable {
        String str7;
        if (!TextUtils.isEmpty(str6)) {
            str7 = "4";
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            str7 = "3";
        } else if (TextUtils.isEmpty(str2)) {
            if (platformActionListener != null) {
                platformActionListener.onError(null, 9, new Throwable("The param of title or titleUrl is null !"));
                return;
            }
            return;
        } else {
            str7 = "1";
        }
        a(str7, str, str2, str3, str4, str5, str6, platformActionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public void b(Intent intent) {
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 16 && intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            int flags = intent.getFlags();
            if (i4 >= 21) {
                intent.setFlags(flags & (-196));
            } else if (i4 >= 19) {
                intent.setFlags(flags & (-68));
            } else {
                intent.setFlags(flags & (-4));
            }
        } catch (Throwable th) {
            SSDKLog.b().d("setActivityIntent security catch exception", th);
        }
    }

    private void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, final PlatformActionListener platformActionListener) {
        String str8 = str5;
        try {
            final StringBuilder sb = new StringBuilder();
            if (str != "3" && str != "4") {
                sb.append("mqqapi://share/to_qzone?src_type=app&version=1&file_type=news");
            } else {
                sb.append("mqqapi://qzone/publish?src_type=app&version=1&file_type=news");
            }
            if (!TextUtils.isEmpty(str5)) {
                if (!str8.startsWith(f.f10923a) && !str8.startsWith("https")) {
                    File file = new File(str8);
                    if (file.exists() && str8.startsWith("/data/")) {
                        String cachePath = ResHelper.getCachePath(MobSDK.getContext(), "images");
                        String absolutePath = new File(cachePath, System.currentTimeMillis() + file.getName()).getAbsolutePath();
                        if (ResHelper.copyFile(str8, absolutePath)) {
                            str8 = absolutePath;
                        }
                    }
                    File file2 = new File(str8);
                    Context context = MobSDK.getContext();
                    Uri a5 = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file2);
                    MobSDK.getContext().grantUriPermission("com.tencent.mobileqq", a5, 3);
                    sb.append("&image_uri=");
                    sb.append(Base64.encodeToString(String.valueOf(a5).getBytes("utf-8"), 2));
                }
                sb.append("&image_url=");
                sb.append(Base64.encodeToString(str8.getBytes("utf-8"), 2));
            }
            String substring = (TextUtils.isEmpty(str4) || str4.length() <= 600) ? str4 : str4.substring(0, 600);
            if (!TextUtils.isEmpty(str7) && str.equals("4")) {
                ResHelper.getFileSize(str7);
                String valueOf = String.valueOf(str6);
                String g4 = g(str7);
                sb.append("&videoPath=");
                sb.append(Base64.encodeToString(str7.getBytes("utf-8"), 2));
                sb.append("&videoSize=");
                sb.append(Base64.encodeToString(valueOf.getBytes("utf-8"), 2));
                if (!TextUtils.isEmpty(g4)) {
                    sb.append("&videoDuration=");
                    sb.append(Base64.encodeToString(g4.getBytes("utf-8"), 2));
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&title=");
                sb.append(Base64.encodeToString(str2.getBytes("utf-8"), 2));
            }
            if (!TextUtils.isEmpty(substring)) {
                sb.append("&description=");
                sb.append(Base64.encodeToString(substring.getBytes("utf-8"), 2));
            }
            sb.append("&share_id=");
            sb.append(this.f1248d);
            if (!TextUtils.isEmpty(str3)) {
                sb.append("&url=");
                sb.append(Base64.encodeToString(str3.getBytes("utf-8"), 2));
            }
            sb.append("&app_name=");
            sb.append(Base64.encodeToString(str6.getBytes("utf-8"), 2));
            if (!TextUtils.isEmpty(substring)) {
                sb.append("&share_qq_ext_str=");
                sb.append(Base64.encodeToString(substring.getBytes(), 2));
            }
            sb.append("&req_type=");
            sb.append(Base64.encodeToString(str.getBytes("utf-8"), 2));
            sb.append("&cflag=");
            sb.append(Base64.encodeToString("1".getBytes("utf-8"), 2));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(sb.toString()));
            DH.requester(MobSDK.getContext()).resolveActivity(intent, 1).request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qzone.utils.b.3
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    if (dHResponse.resolveActivity(new int[0]) != null) {
                        ShareActivity shareActivity = new ShareActivity();
                        shareActivity.setDisableNewTask(b.this.f1254j);
                        shareActivity.setScheme(sb.toString(), true);
                        shareActivity.setSharedCallback(platformActionListener);
                        shareActivity.setAppId(b.this.f1248d);
                        shareActivity.show(MobSDK.getContext(), null);
                    }
                }
            });
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            SSDKLog b5 = SSDKLog.b();
            b5.a(OnekeyShare.SHARESDK_TAG, " QQ ShareActivity run catch " + th);
        }
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getPInfoForce(true, "com.tencent.mobileqq", 0).getPInfoForce(true, "com.tencent.tim", 0).getPInfoForce(true, "com.tencent.minihd.qq", 0).request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qzone.utils.b.4
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                boolean z4 = true;
                try {
                    PackageInfo pInfoForce = dHResponse.getPInfoForce(0);
                    if (pInfoForce == null) {
                        pInfoForce = i.a("com.tencent.mobileqq", 0);
                    }
                    PackageInfo pInfoForce2 = dHResponse.getPInfoForce(1);
                    if (pInfoForce2 == null) {
                        pInfoForce2 = i.a("com.tencent.tim", 0);
                    }
                    PackageInfo pInfoForce3 = dHResponse.getPInfoForce(2);
                    if (pInfoForce3 == null) {
                        pInfoForce3 = i.a("com.tencent.minihd.qq", 0);
                    }
                    ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 != null) {
                        if (pInfoForce == null && pInfoForce2 == null && pInfoForce3 == null) {
                            z4 = false;
                        }
                        shareSDKCallback2.onCallback(Boolean.valueOf(z4));
                    }
                } catch (Throwable unused) {
                    ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                    if (shareSDKCallback3 != null) {
                        shareSDKCallback3.onCallback(Boolean.FALSE);
                    }
                }
            }
        });
    }

    public HashMap<String, Object> a(String str, String str2) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("access_token", this.f1250f));
        arrayList.add(new KVPair<>("oauth_consumer_key", this.f1248d));
        arrayList.add(new KVPair<>("openid", this.f1249e));
        arrayList.add(new KVPair<>(IjkMediaMeta.IJKM_KEY_FORMAT, "json"));
        if (!TextUtils.isEmpty(str2)) {
            if (str2.length() > 200) {
                str2 = str2.substring(0, 199) + MobSDK.getContext().getString(ResHelper.getStringRes(MobSDK.getContext(), "ssdk_symbol_ellipsis"));
            }
            arrayList.add(new KVPair<>("photodesc", str2));
        }
        arrayList.add(new KVPair<>("mobile", "1"));
        KVPair<String> kVPair = new KVPair<>("picture", str);
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Agent", System.getProperties().getProperty("http.agent") + " ArzenAndroidSDK"));
        String httpPost = this.f1252h.httpPost("https://graph.qq.com/photo/upload_pic", arrayList, kVPair, arrayList2, "/photo/upload_pic", b());
        if (httpPost == null || httpPost.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(httpPost);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00fd -> B:34:0x00fe). Please submit an issue!!! */
    public HashMap<String, Object> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        KVPair kVPair;
        String str3;
        if (str2 == null) {
            return null;
        }
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                arrayList.add(new KVPair<>(entry.getKey(), String.valueOf(entry.getValue())));
            }
        }
        arrayList.add(new KVPair<>("access_token", this.f1250f));
        arrayList.add(new KVPair<>("oauth_consumer_key", this.f1248d));
        arrayList.add(new KVPair<>("openid", this.f1249e));
        arrayList.add(new KVPair<>(IjkMediaMeta.IJKM_KEY_FORMAT, "json"));
        if (hashMap2 == null || hashMap2.size() <= 0) {
            kVPair = null;
        } else {
            KVPair kVPair2 = null;
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                kVPair2 = new KVPair(entry2.getKey(), entry2.getValue());
            }
            kVPair = kVPair2;
        }
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Agent", System.getProperties().getProperty("http.agent") + " ArzenAndroidSDK"));
        try {
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
        if ("GET".equals(str2.toUpperCase())) {
            str3 = new NetworkHelper().httpGet(str, arrayList, arrayList2, null);
        } else {
            if ("POST".equals(str2.toUpperCase())) {
                str3 = new NetworkHelper().httpPost(str, arrayList, kVPair, arrayList2, (NetworkHelper.NetworkTimeOut) null);
            }
            str3 = null;
        }
        if (str3 == null || str3.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(str3);
    }

    public void a(String[] strArr, final PlatformActionListener platformActionListener) {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            try {
                sb.append(URLEncoder.encode(strArr[i4]));
                String h4 = h(strArr[i4]);
                if (!TextUtils.isEmpty(h4)) {
                    sb2.append(h4);
                }
                if (i4 != length - 1) {
                    sb.append(";");
                    sb2.append(";");
                }
            } catch (Throwable th) {
                SSDKLog b5 = SSDKLog.b();
                b5.a("imgArray:" + th, new Object[0]);
            }
        }
        final Bundle bundle = new Bundle();
        bundle.putString("openid", "");
        bundle.putString("report_type", "11");
        bundle.putString("act_type", "3");
        bundle.putString("via", "ANDROIDQQ.SHARETOQZ.XX");
        bundle.putString(PluginConstants.KEY_APP_ID, this.f1248d);
        bundle.putString("type", "3");
        bundle.putString("login_status", "");
        bundle.putString("need_user_auth", "");
        bundle.putString("to_uin", "0");
        bundle.putString("call_source", "1");
        bundle.putString("to_type", "0");
        bundle.putString("platform", "1");
        DH.requester(MobSDK.getContext()).getAppName().request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qzone.utils.b.5
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    StringBuilder sb3 = new StringBuilder("mqqapi://qzone/publish?src_type=app&version=1&file_type=news");
                    sb3.append("&image_url=");
                    sb3.append(Base64.encodeToString(b.f(sb.toString()), 2));
                    if (!TextUtils.isEmpty(sb2.toString())) {
                        sb3.append("&image_uri=");
                        sb3.append(Base64.encodeToString(b.f(sb2.toString()), 2));
                    }
                    if (!TextUtils.isEmpty(b.this.f1248d)) {
                        sb3.append("&share_id=");
                        sb3.append(b.this.f1248d);
                    }
                    String appName = dHResponse.getAppName();
                    if (!TextUtils.isEmpty(appName)) {
                        sb3.append("&app_name=");
                        sb3.append(Base64.encodeToString(b.f(appName), 2));
                    }
                    sb3.append("&req_type=");
                    sb3.append(Base64.encodeToString(b.f(String.valueOf(3)), 2));
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setPackage("com.tencent.mobileqq");
                    intent.setData(Uri.parse(sb3.toString()));
                    intent.putExtra("pkg_name", DH.SyncMtd.getPackageName());
                    intent.putExtra("key_pass", bundle);
                    b.this.b(intent);
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_extra_pending_intent", b.this.a(intent));
                    QzoneShareImgArrayActivity qzoneShareImgArrayActivity = new QzoneShareImgArrayActivity();
                    qzoneShareImgArrayActivity.setAppid(b.this.f1248d);
                    qzoneShareImgArrayActivity.setSharedCallback(platformActionListener);
                    qzoneShareImgArrayActivity.show(MobSDK.getContext(), intent2);
                } catch (Throwable th2) {
                    SSDKLog b6 = SSDKLog.b();
                    b6.a("QZONE imgs share" + th2, new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PendingIntent a(Intent intent) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return PendingIntent.getActivity(MobSDK.getContext(), 10104, intent, 1140850688);
            }
            return PendingIntent.getActivity(MobSDK.getContext(), 10104, intent, 1073741824);
        } catch (Throwable th) {
            SSDKLog.b().d("create pI exception", th);
            return null;
        }
    }
}
