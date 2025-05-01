package cn.sharesdk.sina.weibo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.authorize.b;
import cn.sharesdk.framework.authorize.c;
import cn.sharesdk.framework.e;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.sina.weibo.utils.WebSharePage;
import com.facebook.common.util.f;
import com.join.mgps.activity.QuarkInstallAppActivity_;
import com.mob.MobSDK;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.BuildConfig;
import com.umeng.analytics.pro.bm;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: Weibo.java */
/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private static a f1095b;

    /* renamed from: c  reason: collision with root package name */
    private String f1096c;

    /* renamed from: d  reason: collision with root package name */
    private String f1097d;

    /* renamed from: e  reason: collision with root package name */
    private String f1098e;

    /* renamed from: f  reason: collision with root package name */
    private String f1099f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f1100g;

    /* renamed from: h  reason: collision with root package name */
    private SSDKNetworkHelper f1101h;

    private a(Platform platform) {
        super(platform);
        this.f1100g = new String[]{"follow_app_official_microblog"};
        this.f1101h = SSDKNetworkHelper.getInstance();
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        return "";
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
        return new cn.sharesdk.sina.weibo.utils.a(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return TextUtils.isEmpty(this.f1098e) ? "https://api.weibo.com/oauth2/default.html" : this.f1098e;
    }

    @Override // cn.sharesdk.framework.e, cn.sharesdk.framework.authorize.AuthorizeHelper
    public c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
        cn.sharesdk.sina.weibo.utils.b bVar = new cn.sharesdk.sina.weibo.utils.b(sSOAuthorizeActivity);
        bVar.a(32973);
        bVar.a(this.f1096c, this.f1098e, this.f1100g);
        return bVar;
    }

    public String b(String str) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("client_id", this.f1096c));
        arrayList.add(new KVPair<>("client_secret", this.f1097d));
        arrayList.add(new KVPair<>("redirect_uri", this.f1098e));
        arrayList.add(new KVPair<>("grant_type", "authorization_code"));
        arrayList.add(new KVPair<>("code", str));
        String httpPost = this.f1101h.httpPost("https://api.weibo.com/oauth2/access_token", arrayList, "/oauth2/access_token", b());
        ShareSDK.logApiEvent("/oauth2/access_token", b());
        return httpPost;
    }

    public void c(String str) {
        this.f1099f = str;
    }

    public HashMap<String, Object> d(String str) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f1096c));
        String str2 = this.f1099f;
        if (str2 != null) {
            arrayList.add(new KVPair<>("access_token", str2));
        }
        boolean z4 = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable unused) {
            z4 = false;
        }
        if (z4) {
            arrayList.add(new KVPair<>("uid", str));
        } else {
            arrayList.add(new KVPair<>("screen_name", str));
        }
        String httpGet = this.f1101h.httpGet("https://api.weibo.com/2/users/show.json", arrayList, "/2/users/show.json", b());
        if (httpGet != null) {
            return new Hashon().fromJson(httpGet);
        }
        return null;
    }

    public HashMap<String, Object> e(String str) throws Throwable {
        boolean z4;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f1096c));
        arrayList.add(new KVPair<>("access_token", this.f1099f));
        try {
            ResHelper.parseLong(str);
            z4 = true;
        } catch (Throwable unused) {
            z4 = false;
        }
        if (z4) {
            arrayList.add(new KVPair<>("uid", str));
        } else {
            arrayList.add(new KVPair<>("screen_name", str));
        }
        String httpPost = this.f1101h.httpPost("https://api.weibo.com/2/friendships/create.json", arrayList, "/2/friendships/create.json", b());
        if (httpPost != null) {
            return new Hashon().fromJson(httpPost);
        }
        return null;
    }

    public static synchronized a a(Platform platform) {
        a aVar;
        synchronized (a.class) {
            if (f1095b == null) {
                f1095b = new a(platform);
            }
            aVar = f1095b;
        }
        return aVar;
    }

    public HashMap<String, Object> c(int i4, int i5, String str) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f1096c));
        String str2 = this.f1099f;
        if (str2 != null) {
            arrayList.add(new KVPair<>("access_token", str2));
        }
        boolean z4 = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable unused) {
            z4 = false;
        }
        if (z4) {
            arrayList.add(new KVPair<>("uid", str));
        } else {
            arrayList.add(new KVPair<>("screen_name", str));
        }
        arrayList.add(new KVPair<>(QuarkInstallAppActivity_.f36990i, String.valueOf(i4)));
        arrayList.add(new KVPair<>("page", String.valueOf(i5)));
        String httpGet = this.f1101h.httpGet("https://api.weibo.com/2/friendships/friends/bilateral.json", arrayList, "/2/friendships/friends/bilateral.json", b());
        if (httpGet != null) {
            return new Hashon().fromJson(httpGet);
        }
        return null;
    }

    public void a(String str, String str2) {
        this.f1096c = str;
        this.f1097d = str2;
    }

    public void a(String str) {
        this.f1098e = str;
    }

    public void a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f1100g = strArr;
    }

    public void b(final Platform.ShareParams shareParams, final PlatformActionListener platformActionListener) {
        DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().getScreenSize().getCarrier().getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.sina.weibo.a.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                String str;
                try {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put(bm.bv, dHResponse.getDeviceKey());
                    hashMap.put("nt", dHResponse.getNetworkType());
                    hashMap.put("dnwktfs", dHResponse.getDetailNetworkTypeForStatic());
                    hashMap.put("srs", dHResponse.getScreenSize());
                    hashMap.put("car", dHResponse.getCarrier());
                    final Platform.ShareParams shareParams2 = shareParams;
                    if (TextUtils.isEmpty(shareParams2.getUrl())) {
                        str = shareParams.getText();
                    } else {
                        str = shareParams.getText() + " " + shareParams.getUrl();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        shareParams.setText(((e) a.this).f976a.getShortLintk(str, false, hashMap));
                    } else {
                        int stringRes = ResHelper.getStringRes(MobSDK.getContext(), "ssdk_weibo_upload_content");
                        if (stringRes > 0) {
                            shareParams.setText(MobSDK.getContext().getResources().getString(stringRes));
                        }
                    }
                    AuthorizeListener authorizeListener = new AuthorizeListener() { // from class: cn.sharesdk.sina.weibo.a.3.1
                        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                        public void onCancel() {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onCancel(((e) a.this).f976a, 9);
                            }
                        }

                        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                        public void onComplete(Bundle bundle) {
                            if (platformActionListener != null) {
                                HashMap<String, Object> hashMap2 = new HashMap<>();
                                hashMap2.put("ShareParams", shareParams2);
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                platformActionListener.onComplete(((e) a.this).f976a, 9, hashMap2);
                            }
                            if (bundle != null) {
                                String string = bundle.getString("uid");
                                String string2 = bundle.getString("access_token");
                                String string3 = bundle.getString("expire_in");
                                if (!TextUtils.isEmpty(string2)) {
                                    a.this.f1099f = string2;
                                    ((e) a.this).f976a.getDb().putToken(a.this.f1099f);
                                }
                                ((e) a.this).f976a.getDb().putUserId(string);
                                try {
                                    ((e) a.this).f976a.getDb().putExpiresIn(ResHelper.parseLong(string3));
                                } catch (Throwable unused) {
                                }
                            }
                        }

                        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                        public void onError(Throwable th) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onError(((e) a.this).f976a, 9, th);
                            }
                        }
                    };
                    WebSharePage webSharePage = new WebSharePage();
                    webSharePage.setAppKey(a.this.f1096c, a.this.f1099f);
                    webSharePage.setShareParams(shareParams);
                    webSharePage.setListener(authorizeListener);
                    webSharePage.show(MobSDK.getContext(), null);
                } catch (Throwable th) {
                    PlatformActionListener platformActionListener2 = platformActionListener;
                    if (platformActionListener2 != null) {
                        platformActionListener2.onError(((e) a.this).f976a, 9, th);
                    }
                }
            }
        });
    }

    private String a(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return a(objArr, str, 0, objArr.length);
    }

    public HashMap<String, Object> d(int i4, int i5, String str) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f1096c));
        String str2 = this.f1099f;
        if (str2 != null) {
            arrayList.add(new KVPair<>("access_token", str2));
        }
        boolean z4 = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable unused) {
            z4 = false;
        }
        if (z4) {
            arrayList.add(new KVPair<>("uid", str));
        } else {
            arrayList.add(new KVPair<>("screen_name", str));
        }
        arrayList.add(new KVPair<>(QuarkInstallAppActivity_.f36990i, String.valueOf(i4)));
        arrayList.add(new KVPair<>("cursor", String.valueOf(i5)));
        String httpGet = this.f1101h.httpGet("https://api.weibo.com/2/friendships/followers.json", arrayList, "/2/friendships/followers.json", b());
        if (httpGet != null) {
            return new Hashon().fromJson(httpGet);
        }
        return null;
    }

    private String a(Object[] objArr, String str, int i4, int i5) {
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

    public void c() {
        cn.sharesdk.sina.weibo.sdk.a.a(MobSDK.getContext(), DH.SyncMtd.getPackageName(), new ShareSDKCallback<String>() { // from class: cn.sharesdk.sina.weibo.a.4
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(String str) {
                Intent intent = new Intent();
                intent.setAction("com.sina.weibo.sdk.Intent.ACTION_WEIBO_REGISTER");
                String packageName = MobSDK.getContext().getPackageName();
                intent.putExtra("_weibo_sdkVersion", "0031405000");
                intent.putExtra("_weibo_appPackage", packageName);
                intent.putExtra("_weibo_appKey", a.this.f1096c);
                intent.putExtra("_weibo_flag", 538116905);
                intent.putExtra("_weibo_sign", str);
                SSDKLog b5 = SSDKLog.b();
                b5.a("intent=" + intent + ", extra=" + intent.getExtras(), new Object[0]);
                MobSDK.getContext().sendBroadcast(intent, "com.sina.weibo.permission.WEIBO_SDK_PERMISSION");
            }
        });
    }

    public HashMap<String, Object> b(int i4, int i5, String str) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f1096c));
        String str2 = this.f1099f;
        if (str2 != null) {
            arrayList.add(new KVPair<>("access_token", str2));
        }
        boolean z4 = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable unused) {
            z4 = false;
        }
        if (z4) {
            arrayList.add(new KVPair<>("uid", str));
        } else {
            arrayList.add(new KVPair<>("screen_name", str));
        }
        arrayList.add(new KVPair<>(QuarkInstallAppActivity_.f36990i, String.valueOf(i4)));
        arrayList.add(new KVPair<>("cursor", String.valueOf(i5)));
        String httpGet = this.f1101h.httpGet("https://api.weibo.com/2/friendships/friends.json", arrayList, "/2/friendships/friends.json", b());
        if (httpGet != null) {
            return new Hashon().fromJson(httpGet);
        }
        return null;
    }

    public void a(AuthorizeListener authorizeListener, boolean z4) {
        if (z4) {
            a(authorizeListener);
            return;
        }
        new SinaWeiboOfficialAuth(this.f1096c, this.f1098e, a(this.f1100g, ","), authorizeListener).show(MobSDK.getContext(), null);
        SSDKLog.b().a("SinaWeibo SDK Client doAuthorize ");
    }

    public boolean a() {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("client_id", this.f1096c));
        arrayList.add(new KVPair<>("client_secret", this.f1097d));
        arrayList.add(new KVPair<>("redirect_uri", this.f1098e));
        arrayList.add(new KVPair<>("grant_type", "refresh_token"));
        arrayList.add(new KVPair<>("refresh_token", this.f976a.getDb().get("refresh_token")));
        try {
            String httpPost = this.f1101h.httpPost("https://api.weibo.com/oauth2/access_token", arrayList, "/oauth2/access_token", b());
            if (TextUtils.isEmpty(httpPost) || httpPost.contains("error") || httpPost.contains("error_code")) {
                return false;
            }
            HashMap fromJson = new Hashon().fromJson(httpPost);
            String valueOf = String.valueOf(fromJson.get("uid"));
            String valueOf2 = String.valueOf(fromJson.get("expires_in"));
            this.f1099f = String.valueOf(fromJson.get("access_token"));
            String valueOf3 = String.valueOf(fromJson.get("refresh_token"));
            String valueOf4 = String.valueOf(fromJson.get("remind_in"));
            this.f976a.getDb().putUserId(valueOf);
            this.f976a.getDb().putExpiresIn(Long.valueOf(valueOf2).longValue());
            this.f976a.getDb().putToken(this.f1099f);
            this.f976a.getDb().put("refresh_token", valueOf3);
            this.f976a.getDb().put("remind_in", valueOf4);
            return true;
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return false;
        }
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage(BuildConfig.APPLICATION_ID);
        intent.setType("image/*");
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setPackage("com.sina.weibog3");
        intent2.setType("image/*");
        DH.requester(MobSDK.getContext()).resolveActivity(intent, 0).resolveActivity(intent2, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.sina.weibo.a.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                boolean z4 = true;
                try {
                    if (dHResponse.resolveActivity(0) == null) {
                        ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                        if (shareSDKCallback2 != null) {
                            if (dHResponse.resolveActivity(1) == null) {
                                z4 = false;
                            }
                            shareSDKCallback2.onCallback(Boolean.valueOf(z4));
                        }
                    } else {
                        ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                        if (shareSDKCallback3 != null) {
                            shareSDKCallback3.onCallback(Boolean.TRUE);
                        }
                    }
                } catch (Throwable unused) {
                    ShareSDKCallback shareSDKCallback4 = shareSDKCallback;
                    if (shareSDKCallback4 != null) {
                        shareSDKCallback4.onCallback(Boolean.FALSE);
                    }
                }
            }
        });
    }

    private void a(AuthorizeListener authorizeListener) {
        new SinaWeiboWebAuthOfficial(this.f1096c, this.f1098e, a(this.f1100g, ","), authorizeListener).show(MobSDK.getContext(), null);
        SSDKLog.b().a("SinaWeibo SDK Web showWebAuthActivity ");
    }

    public void a(final Platform.ShareParams shareParams, final PlatformActionListener platformActionListener) {
        if (shareParams == null) {
            if (platformActionListener != null) {
                platformActionListener.onError(this.f976a, 9, new Throwable("Please set params"));
                return;
            }
            return;
        }
        if (shareParams.getImageData() == null && TextUtils.isEmpty(shareParams.getImagePath()) && !TextUtils.isEmpty(shareParams.getImageUrl())) {
            try {
                File file = new File(BitmapHelper.downloadBitmap(MobSDK.getContext(), shareParams.getImageUrl()));
                if (file.exists()) {
                    shareParams.setImagePath(file.getAbsolutePath());
                }
            } catch (Throwable th) {
                SSDKLog.b().a(th);
            }
        }
        if (shareParams.getImageArray() != null && shareParams.getImageArray().length > 0) {
            try {
                List<String> asList = Arrays.asList(shareParams.getImageArray());
                String[] strArr = new String[asList.size()];
                int i4 = 0;
                for (String str : asList) {
                    if (str.startsWith(f.f10923a)) {
                        str = BitmapHelper.downloadBitmap(MobSDK.getContext(), str);
                    }
                    File file2 = new File(str);
                    if (file2.exists() && str.startsWith("/data/")) {
                        String cachePath = ResHelper.getCachePath(MobSDK.getContext(), "images");
                        File file3 = new File(cachePath, System.currentTimeMillis() + file2.getName());
                        String absolutePath = file3.getAbsolutePath();
                        file3.createNewFile();
                        if (ResHelper.copyFile(str, absolutePath)) {
                            str = file3.getAbsolutePath();
                        }
                    }
                    strArr[i4] = str;
                    i4++;
                }
                shareParams.setImageArray(strArr);
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
            }
        }
        AuthorizeListener authorizeListener = new AuthorizeListener() { // from class: cn.sharesdk.sina.weibo.a.2
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                PlatformActionListener platformActionListener2 = platformActionListener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onCancel(((e) a.this).f976a, 9);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                if (platformActionListener != null) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("ShareParams", shareParams);
                    platformActionListener.onComplete(((e) a.this).f976a, 9, hashMap);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th3) {
                PlatformActionListener platformActionListener2 = platformActionListener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(((e) a.this).f976a, 9, th3);
                }
            }
        };
        new SinaWeiboShareOfficial(this.f1096c, this.f1098e, a(this.f1100g, ","), shareParams, authorizeListener).show(MobSDK.getContext(), null);
    }

    public HashMap<String, Object> a(int i4, int i5, String str) throws Throwable {
        boolean z4;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f1096c));
        try {
            ResHelper.parseLong(str);
            z4 = true;
        } catch (Throwable unused) {
            z4 = false;
        }
        if (z4) {
            arrayList.add(new KVPair<>("uid", str));
        } else {
            arrayList.add(new KVPair<>("screen_name", str));
        }
        arrayList.add(new KVPair<>(QuarkInstallAppActivity_.f36990i, String.valueOf(i4)));
        arrayList.add(new KVPair<>("page", String.valueOf(i5)));
        String httpGet = this.f1101h.httpGet("https://api.weibo.com/2/statuses/user_timeline.json", arrayList, "/2/statuses/user_timeline.json", b());
        if (httpGet != null) {
            return new Hashon().fromJson(httpGet);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        arrayList.add(new KVPair<>("source", this.f1096c));
        String str4 = this.f1099f;
        if (str4 != null) {
            arrayList.add(new KVPair<>("access_token", str4));
        }
        if (hashMap2 == null || hashMap2.size() <= 0) {
            kVPair = null;
        } else {
            KVPair kVPair2 = null;
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                kVPair2 = new KVPair(entry2.getKey(), entry2.getValue());
            }
            kVPair = kVPair2;
        }
        try {
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
        if ("GET".equals(str2.toUpperCase())) {
            str3 = new NetworkHelper().httpGet(str, arrayList, null, null);
        } else {
            if ("POST".equals(str2.toUpperCase())) {
                str3 = new NetworkHelper().httpPost(str, arrayList, kVPair, (ArrayList<KVPair<String>>) null, (NetworkHelper.NetworkTimeOut) null);
            }
            str3 = null;
        }
        if (str3 == null || str3.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(str3);
    }
}
