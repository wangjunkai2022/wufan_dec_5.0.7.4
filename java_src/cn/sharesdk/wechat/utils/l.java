package cn.sharesdk.wechat.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.ShareSDKFileProvider;
import cn.sharesdk.wechat.utils.i;
import com.mob.MobSDK;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
/* compiled from: WechatHelper.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static l f1350a;

    /* renamed from: b  reason: collision with root package name */
    private j f1351b = new j();

    /* renamed from: c  reason: collision with root package name */
    private k f1352c;

    /* renamed from: d  reason: collision with root package name */
    private String f1353d;

    /* renamed from: e  reason: collision with root package name */
    private String f1354e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1355f;

    /* renamed from: g  reason: collision with root package name */
    private int f1356g;

    private l() {
    }

    public boolean b() {
        return true;
    }

    public void c(final k kVar) throws Throwable {
        final Platform.ShareParams a5 = kVar.a();
        final int shareType = a5.getShareType();
        final PlatformActionListener c5 = kVar.c();
        c(new ShareSDKCallback<Integer>() { // from class: cn.sharesdk.wechat.utils.l.1
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Integer num) {
                try {
                    if (shareType == 11 && num.intValue() < 620756993) {
                        SSDKLog.b().a("not support share miniprogram", new Object[0]);
                        l.this.a(kVar, 4, a5, c5);
                    } else {
                        l.this.a(kVar, shareType, a5, c5);
                    }
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("wx share " + th, new Object[0]);
                }
            }
        });
    }

    public void d(final ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            DH.requester(MobSDK.getContext()).getPInfoForce(true, "com.tencent.mm", 0).request(new DH.DHResponder() { // from class: cn.sharesdk.wechat.utils.l.8
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    String str;
                    try {
                        str = dHResponse.getPInfoForce(new int[0]).versionName;
                        SSDKLog b5 = SSDKLog.b();
                        b5.b("wechat versionName ==>> " + str);
                    } catch (Throwable th) {
                        SSDKLog.b().a(th);
                        str = "0";
                    }
                    String[] split = str.split("_")[0].split("\\.");
                    int length = split.length;
                    int[] iArr = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        try {
                            iArr[i4] = ResHelper.parseInt(split[i4]);
                        } catch (Throwable th2) {
                            SSDKLog.b().a(th2);
                            iArr[i4] = 0;
                        }
                    }
                    if (length >= 3) {
                        if (iArr[0] == 7 && iArr[1] == 0 && iArr[2] >= 13) {
                            ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                            if (shareSDKCallback2 != null) {
                                shareSDKCallback2.onCallback(Boolean.TRUE);
                                return;
                            }
                            return;
                        } else if (iArr[0] >= 8) {
                            ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                            if (shareSDKCallback3 != null) {
                                shareSDKCallback3.onCallback(Boolean.TRUE);
                                return;
                            }
                            return;
                        } else {
                            ShareSDKCallback shareSDKCallback4 = shareSDKCallback;
                            if (shareSDKCallback4 != null) {
                                shareSDKCallback4.onCallback(Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                    }
                    ShareSDKCallback shareSDKCallback5 = shareSDKCallback;
                    if (shareSDKCallback5 != null) {
                        shareSDKCallback5.onCallback(Boolean.FALSE);
                    }
                }
            });
        } catch (Throwable unused) {
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    public void b(String str) {
        this.f1353d = str;
    }

    private void c(Context context, String str, String str2, String str3, String str4, int i4, k kVar) throws Throwable {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.filePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        if (!TextUtils.isEmpty(str)) {
            wXMediaMessage.title = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.mediaObject = wXFileObject;
        if (!TextUtils.isEmpty(str4)) {
            wXMediaMessage.thumbData = a(context, str4, false);
        }
        a(wXMediaMessage, "filedata", i4, kVar);
    }

    public void b(k kVar) throws Throwable {
        this.f1352c = kVar;
        g gVar = new g();
        Platform.ShareParams a5 = kVar.a();
        String valueOf = String.valueOf(a5.getWxTemplateid());
        String valueOf2 = String.valueOf(a5.getWxReserved());
        int scence = a5.getScence();
        gVar.f1323b = valueOf;
        gVar.f1322a = scence;
        gVar.f1324c = valueOf2;
        this.f1351b.a(gVar);
    }

    public static l a() {
        if (f1350a == null) {
            f1350a = new l();
        }
        return f1350a;
    }

    public void a(String str) {
        this.f1354e = str;
    }

    private void b(Context context, String str, String str2, String str3, int i4, k kVar) throws Throwable {
        WXImageObject wXImageObject = new WXImageObject();
        wXImageObject.imagePath = a(new File(str3));
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        if (i4 != 0) {
            wXMediaMessage.title = str;
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.thumbData = a(context, str3, false);
        a(wXMediaMessage, "img", i4, kVar);
    }

    public void a(boolean z4) {
        this.f1355f = z4;
    }

    private void c(Context context, String str, String str2, String str3, Bitmap bitmap, int i4, k kVar) throws Throwable {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.filePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXFileObject;
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "filedata", i4, kVar);
    }

    public void a(int i4) {
        this.f1356g = i4;
    }

    public void a(k kVar) throws Throwable {
        this.f1352c = kVar;
        b bVar = new b();
        bVar.f1308a = "snsapi_userinfo";
        bVar.f1309b = "sharesdk_wechat_auth";
        this.f1351b.a((m) bVar, false);
    }

    public void a(ShareSDKCallback<Boolean> shareSDKCallback) {
        this.f1351b.a(shareSDKCallback);
    }

    public void a(k kVar, Platform.ShareParams shareParams, PlatformActionListener platformActionListener) throws Throwable {
        Platform b5 = kVar.b();
        String str = ((Integer) shareParams.get("scene", Integer.class)).intValue() == 1 ? "com.tencent.mm.ui.tools.ShareToTimeLineUI" : "com.tencent.mm.ui.tools.ShareImgUI";
        cn.sharesdk.framework.utils.g gVar = new cn.sharesdk.framework.utils.g();
        gVar.a("com.tencent.mm", str);
        gVar.a(shareParams, b5);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ShareParams", shareParams);
        platformActionListener.onComplete(b5, 9, hashMap);
    }

    private void c(Context context, String str, String str2, String str3, int i4, k kVar) throws Throwable {
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        if (Build.VERSION.SDK_INT >= 24) {
            wXEmojiObject.emojiPath = a(new File(str3));
        } else {
            wXEmojiObject.emojiPath = str3;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = a(context, str3, false);
        a(wXMediaMessage, "emoji", i4, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, String str, String str2, String str3, String str4, int i4, k kVar) throws Throwable {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        if (str4 != null && new File(str4).exists()) {
            byte[] a5 = a(context, str4, false);
            wXMediaMessage.thumbData = a5;
            if (a5 != null) {
                if (a5.length > 32768) {
                    throw new RuntimeException("checkArgs fail, thumbData is too large: " + wXMediaMessage.thumbData.length + " > 32768");
                }
            } else {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            }
        }
        a(wXMediaMessage, "webpage", i4, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final k kVar, int i4, Platform.ShareParams shareParams, final PlatformActionListener platformActionListener) throws Throwable {
        File parentFile;
        final Platform b5 = kVar.b();
        final String title = shareParams.getTitle();
        final String text = shareParams.getText();
        final int scence = shareParams.getScence();
        final String imagePath = shareParams.getImagePath();
        String imageFileProviderPath = shareParams.getImageFileProviderPath();
        final String imageUrl = shareParams.getImageUrl();
        final Bitmap imageData = shareParams.getImageData();
        String musicUrl = shareParams.getMusicUrl();
        String url = shareParams.getUrl();
        String filePath = shareParams.getFilePath();
        String extInfo = shareParams.getExtInfo();
        switch (i4) {
            case 1:
                a(title, text, scence, kVar);
                return;
            case 2:
                if (imagePath != null && imagePath.length() > 0) {
                    b(MobSDK.getContext(), title, text, imagePath, scence, kVar);
                    return;
                } else if (imageFileProviderPath != null && imageFileProviderPath.length() > 0) {
                    a(MobSDK.getContext(), title, text, imageFileProviderPath, scence, kVar);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    a(MobSDK.getContext(), title, text, imageData, scence, kVar);
                    return;
                } else if (imageUrl != null && imageUrl.length() > 0) {
                    String downloadBitmap = BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl);
                    try {
                        if (!TextUtils.isEmpty(downloadBitmap) && (parentFile = new File(downloadBitmap).getParentFile()) != null && parentFile.isDirectory()) {
                            File file = new File(parentFile.getAbsolutePath(), ".nomedia");
                            if (!file.exists() || !file.isFile()) {
                                file.createNewFile();
                            }
                        }
                    } catch (Throwable th) {
                        SSDKLog b6 = SSDKLog.b();
                        b6.a("when share iamge wechat that create nomedia catch " + th, new Object[0]);
                    }
                    b(MobSDK.getContext(), title, text, downloadBitmap, scence, kVar);
                    return;
                } else {
                    b(MobSDK.getContext(), title, text, "", scence, kVar);
                    return;
                }
            case 3:
            case 10:
            default:
                if (platformActionListener != null) {
                    platformActionListener.onError(b5, 9, new IllegalArgumentException("shareType = " + i4));
                    return;
                }
                return;
            case 4:
                b5.getShortLintk(url, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.wechat.utils.l.4
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(String str) {
                        try {
                            kVar.a().setUrl(str);
                            String str2 = imagePath;
                            if (str2 != null && str2.length() > 0) {
                                l.this.b(MobSDK.getContext(), title, text, str, imagePath, scence, kVar);
                            } else {
                                Bitmap bitmap = imageData;
                                if (bitmap != null && !bitmap.isRecycled()) {
                                    l.this.b(MobSDK.getContext(), title, text, str, imageData, scence, kVar);
                                } else {
                                    String str3 = imageUrl;
                                    if (str3 == null || str3.length() <= 0) {
                                        l.this.b(MobSDK.getContext(), title, text, str, "", scence, kVar);
                                    } else {
                                        l.this.b(MobSDK.getContext(), title, text, str, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onError(b5, 9, th2);
                            }
                        }
                    }
                });
                return;
            case 5:
                b5.getShortLintk(musicUrl + " " + url, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.wechat.utils.l.2
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(String str) {
                        try {
                            String str2 = str.split(" ")[0];
                            String str3 = str.split(" ")[1];
                            String str4 = imagePath;
                            if (str4 == null || str4.length() <= 0) {
                                Bitmap bitmap = imageData;
                                if (bitmap != null && !bitmap.isRecycled()) {
                                    l.this.a(MobSDK.getContext(), title, text, str2, str3, imageData, scence, kVar);
                                } else {
                                    String str5 = imageUrl;
                                    if (str5 == null || str5.length() <= 0) {
                                        l.this.a(MobSDK.getContext(), title, text, str2, str3, "", scence, kVar);
                                    } else {
                                        l.this.a(MobSDK.getContext(), title, text, str2, str3, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                                    }
                                }
                            } else {
                                l.this.a(MobSDK.getContext(), title, text, str2, str3, imagePath, scence, kVar);
                            }
                        } catch (Throwable th2) {
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onError(b5, 9, th2);
                            }
                        }
                    }
                });
                return;
            case 6:
                b5.getShortLintk(url, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.wechat.utils.l.3
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(String str) {
                        try {
                            kVar.a().setUrl(str);
                            String str2 = imagePath;
                            if (str2 != null && str2.length() > 0) {
                                l.this.a(MobSDK.getContext(), title, text, str, imagePath, scence, kVar);
                            } else {
                                Bitmap bitmap = imageData;
                                if (bitmap != null && !bitmap.isRecycled()) {
                                    l.this.a(MobSDK.getContext(), title, text, str, imageData, scence, kVar);
                                } else {
                                    String str3 = imageUrl;
                                    if (str3 == null || str3.length() <= 0) {
                                        l.this.a(MobSDK.getContext(), title, text, str, "", scence, kVar);
                                    } else {
                                        l.this.a(MobSDK.getContext(), title, text, str, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onError(b5, 9, th2);
                            }
                        }
                    }
                });
                return;
            case 7:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SAHRE_APP");
                }
                if (scence != 2) {
                    if (imagePath != null && imagePath.length() > 0) {
                        b(MobSDK.getContext(), title, text, filePath, extInfo, imagePath, scence, kVar);
                        return;
                    } else if (imageData != null && !imageData.isRecycled()) {
                        b(MobSDK.getContext(), title, text, filePath, extInfo, imageData, scence, kVar);
                        return;
                    } else if (imageUrl != null && imageUrl.length() > 0) {
                        b(MobSDK.getContext(), title, text, filePath, extInfo, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                        return;
                    } else {
                        b(MobSDK.getContext(), title, text, filePath, extInfo, "", scence, kVar);
                        return;
                    }
                }
                throw new Throwable("WechatFavorite does not support SAHRE_APP");
            case 8:
                if (scence != 1) {
                    if (imagePath != null && imagePath.length() > 0) {
                        c(MobSDK.getContext(), title, text, filePath, imagePath, scence, kVar);
                        return;
                    } else if (imageData != null && !imageData.isRecycled()) {
                        c(MobSDK.getContext(), title, text, filePath, imageData, scence, kVar);
                        return;
                    } else if (imageUrl != null && imageUrl.length() > 0) {
                        c(MobSDK.getContext(), title, text, filePath, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                        return;
                    } else {
                        c(MobSDK.getContext(), title, text, a(new File(filePath)), "", scence, kVar);
                        return;
                    }
                }
                throw new Throwable("WechatMoments does not support SHARE_FILE");
            case 9:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SHARE_EMOJI");
                }
                if (scence != 2) {
                    if (imagePath != null && imagePath.length() > 0) {
                        c(MobSDK.getContext(), title, text, imagePath, scence, kVar);
                        return;
                    } else if (imageUrl != null && imageUrl.length() > 0) {
                        c(MobSDK.getContext(), title, text, new NetworkHelper().downloadCache(MobSDK.getContext(), imageUrl, "images", true, null), scence, kVar);
                        return;
                    } else if (imageData != null && !imageData.isRecycled()) {
                        b(MobSDK.getContext(), title, text, imageData, scence, kVar);
                        return;
                    } else {
                        c(MobSDK.getContext(), title, text, "", scence, kVar);
                        return;
                    }
                }
                throw new Throwable("WechatFavorite does not support SHARE_EMOJI");
            case 11:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SAHRE_WXMINIPROGRAM");
                }
                if (scence != 2) {
                    if (!TextUtils.isEmpty(this.f1353d)) {
                        b5.getShortLintk(url, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.wechat.utils.l.5
                            @Override // cn.sharesdk.framework.ShareSDKCallback
                            /* renamed from: a */
                            public void onCallback(String str) {
                                try {
                                    kVar.a().setUrl(str);
                                    String str2 = imagePath;
                                    if (str2 == null || str2.length() <= 0) {
                                        Bitmap bitmap = imageData;
                                        if (bitmap == null || bitmap.isRecycled()) {
                                            String str3 = imageUrl;
                                            if (str3 == null || str3.length() <= 0) {
                                                l.this.a(MobSDK.getContext(), str, l.this.f1353d, l.this.f1354e, title, text, "", scence, kVar);
                                            } else {
                                                l.this.a(MobSDK.getContext(), str, l.this.f1353d, l.this.f1354e, title, text, BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl), scence, kVar);
                                            }
                                        } else {
                                            l.this.a(MobSDK.getContext(), str, l.this.f1353d, l.this.f1354e, title, text, imageData, scence, kVar);
                                        }
                                    } else {
                                        l.this.a(MobSDK.getContext(), str, l.this.f1353d, l.this.f1354e, title, text, imagePath, scence, kVar);
                                    }
                                } catch (Throwable th2) {
                                    PlatformActionListener platformActionListener2 = platformActionListener;
                                    if (platformActionListener2 != null) {
                                        platformActionListener2.onError(b5, 9, th2);
                                    }
                                }
                            }
                        });
                        return;
                    } else if (platformActionListener != null) {
                        platformActionListener.onError(b5, 9, new Throwable("checkArgs fail, UserName or Path is invalid"));
                        return;
                    } else {
                        return;
                    }
                }
                throw new Throwable("WechatFavorite does not support SAHRE_WXMINIPROGRAM");
            case 12:
                if (!TextUtils.isEmpty(this.f1353d) && !TextUtils.isEmpty(this.f1354e)) {
                    a(this.f1353d, this.f1354e);
                    return;
                } else if (platformActionListener != null) {
                    platformActionListener.onError(b5, 9, new Throwable("checkArgs fail, UserName or Path is invalid"));
                    return;
                } else {
                    return;
                }
        }
    }

    public boolean c(String str) {
        return this.f1351b.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, String str, String str2, String str3, Bitmap bitmap, int i4, k kVar) throws Throwable {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        if (bitmap != null && !bitmap.isRecycled()) {
            byte[] a5 = a(context, bitmap, false);
            wXMediaMessage.thumbData = a5;
            if (a5 != null) {
                if (a5.length > 32768) {
                    throw new RuntimeException("checkArgs fail, thumbData is too large: " + wXMediaMessage.thumbData.length + " > 32768");
                }
            } else {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            }
        }
        a(wXMediaMessage, "webpage", i4, kVar);
    }

    @SuppressLint({"WrongConstant"})
    public void c(final ShareSDKCallback<Integer> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getAInfoForPkg("com.tencent.mm", 128).request(new DH.DHResponder() { // from class: cn.sharesdk.wechat.utils.l.7
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    shareSDKCallback.onCallback(Integer.valueOf(dHResponse.getAInfoForPkg(new int[0]).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0)));
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("WechatHelper getWXAppSupportAPI() get from metaData failed : " + th, new Object[0]);
                    shareSDKCallback.onCallback(0);
                }
            }
        });
    }

    public boolean c() {
        return Build.VERSION.SDK_INT >= 24;
    }

    private void b(Context context, String str, String str2, String str3, String str4, String str5, int i4, k kVar) throws Throwable {
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.filePath = str3;
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXAppExtendObject;
        wXMediaMessage.thumbData = a(context, str5, false);
        a(wXMediaMessage, "appdata", i4, kVar);
    }

    private void b(Context context, String str, String str2, String str3, String str4, Bitmap bitmap, int i4, k kVar) throws Throwable {
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.filePath = str3;
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXAppExtendObject;
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "appdata", i4, kVar);
    }

    private void b(Context context, String str, String str2, Bitmap bitmap, int i4, k kVar) throws Throwable {
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        byte[] a5 = a(context, bitmap, false);
        wXEmojiObject.emojiData = a5;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = a5;
        a(wXMediaMessage, "emoji", i4, kVar);
    }

    public void b(ShareSDKCallback<Boolean> shareSDKCallback) {
        this.f1351b.b(shareSDKCallback);
    }

    private void a(String str, String str2, int i4, k kVar) throws Throwable {
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = str2;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = str2;
        a(wXMediaMessage, "text", i4, kVar);
    }

    private void a(final Context context, final String str, final String str2, final String str3, final int i4, final k kVar) throws Throwable {
        try {
            final WXImageObject wXImageObject = new WXImageObject();
            try {
                d(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.wechat.utils.l.6
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(Boolean bool) {
                        try {
                            if (bool.booleanValue()) {
                                if (l.this.c()) {
                                    String a5 = l.this.a(new File(str3));
                                    wXImageObject.imagePath = a5;
                                    SSDKLog b5 = SSDKLog.b();
                                    b5.a("ShareSDK share file with FileProvider path is: " + a5);
                                }
                            } else if (kVar.c() != null) {
                                kVar.c().onError(kVar.b(), 9, new Throwable("Wecaht Version is not new"));
                            }
                            WXMediaMessage wXMediaMessage = new WXMediaMessage();
                            wXMediaMessage.mediaObject = wXImageObject;
                            if (i4 != 0) {
                                wXMediaMessage.title = str;
                                wXMediaMessage.description = str2;
                            }
                            wXMediaMessage.thumbData = l.this.a(context, str3, false);
                            l.this.a(wXMediaMessage, "img", i4, kVar);
                        } catch (Throwable th) {
                            SSDKLog.b().a(th);
                        }
                    }
                });
            } catch (Throwable th) {
                th = th;
                SSDKLog.b().a(th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a(Context context, String str, String str2, Bitmap bitmap, int i4, k kVar) throws Throwable {
        WXImageObject wXImageObject = new WXImageObject();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        wXImageObject.imageData = byteArrayOutputStream.toByteArray();
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        if (i4 != 0) {
            wXMediaMessage.title = str;
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "img", i4, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, String str4, String str5, int i4, k kVar) throws Throwable {
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str4;
        wXMusicObject.musicDataUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.thumbData = a(context, str5, false);
        a(wXMediaMessage, "music", i4, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, String str4, Bitmap bitmap, int i4, k kVar) throws Throwable {
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str4;
        wXMusicObject.musicDataUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "music", i4, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, String str4, int i4, k kVar) throws Throwable {
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXVideoObject;
        wXMediaMessage.thumbData = a(context, str4, false);
        a(wXMediaMessage, "video", i4, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, Bitmap bitmap, int i4, k kVar) throws Throwable {
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXVideoObject;
        wXMediaMessage.thumbData = a(context, bitmap, false);
        a(wXMediaMessage, "video", i4, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, String str4, String str5, Bitmap bitmap, int i4, k kVar) throws Throwable {
        String[] split;
        String str6;
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.webpageUrl = str;
        if (!TextUtils.isEmpty(str2) && str2.endsWith("@app")) {
            wXMiniProgramObject.userName = str2;
        } else {
            wXMiniProgramObject.userName = str2 + "@app";
        }
        if (!TextUtils.isEmpty(str3)) {
            if (str3.split("\\?").length > 1) {
                str6 = split[0] + ".html?" + split[1];
            } else {
                str6 = split[0] + ".html";
            }
            wXMiniProgramObject.path = str6;
            wXMiniProgramObject.withShareTicket = this.f1355f;
            wXMiniProgramObject.miniprogramType = this.f1356g;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str4;
        wXMediaMessage.mediaObject = wXMiniProgramObject;
        wXMediaMessage.description = str5;
        if (bitmap != null && !bitmap.isRecycled()) {
            byte[] a5 = a(context, bitmap, true);
            wXMediaMessage.thumbData = a5;
            if (a5 != null) {
                if (a5.length > 131072) {
                    throw new RuntimeException("checkArgs fail, thumbData is too large: " + wXMediaMessage.thumbData.length + " > 131072");
                }
            } else {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            }
        }
        a(wXMediaMessage, "webpage", i4, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, String str4, String str5, String str6, int i4, k kVar) throws Throwable {
        String[] split;
        String str7;
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.miniprogramType = this.f1356g;
        wXMiniProgramObject.webpageUrl = str;
        if (!TextUtils.isEmpty(str2) && str2.endsWith("@app")) {
            wXMiniProgramObject.userName = str2;
        } else {
            wXMiniProgramObject.userName = str2 + "@app";
        }
        if (!TextUtils.isEmpty(str3)) {
            if (str3.split("\\?").length > 1) {
                str7 = split[0] + ".html?" + split[1];
            } else {
                str7 = split[0] + ".html";
            }
            wXMiniProgramObject.path = str7;
            wXMiniProgramObject.withShareTicket = this.f1355f;
            wXMiniProgramObject.miniprogramType = this.f1356g;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str4;
        wXMediaMessage.mediaObject = wXMiniProgramObject;
        wXMediaMessage.description = str5;
        wXMediaMessage.thumbData = a(context, str6, true);
        a(wXMediaMessage, "miniProgram", i4, kVar);
    }

    private void a(String str, String str2) throws Throwable {
        i.a aVar = new i.a();
        aVar.f1335a = str;
        aVar.f1336b = str2;
        aVar.f1337c = this.f1356g;
        this.f1351b.b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(Context context, String str, boolean z4) throws Throwable {
        if (new File(str).exists()) {
            return a(context, BitmapHelper.getBitmap(str), BitmapHelper.getBmpFormat(str), z4);
        }
        throw new FileNotFoundException();
    }

    private byte[] a(Context context, Bitmap bitmap, boolean z4) throws Throwable {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                return a(context, bitmap, Bitmap.CompressFormat.PNG, z4);
            }
            throw new RuntimeException("checkArgs fail, thumbData is recycled");
        }
        throw new RuntimeException("checkArgs fail, thumbData is null");
    }

    private byte[] a(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z4) throws Throwable {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(compressFormat, 100, byteArrayOutputStream);
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = byteArray.length;
                int i4 = z4 ? 131072 : 32768;
                while (length > i4) {
                    double d5 = length;
                    double d6 = i4;
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    bitmap = a(bitmap, d5 / d6);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    bitmap.compress(compressFormat, 100, byteArrayOutputStream2);
                    byteArrayOutputStream2.flush();
                    byteArrayOutputStream2.close();
                    byteArray = byteArrayOutputStream2.toByteArray();
                    length = byteArray.length;
                }
                return byteArray;
            }
            throw new RuntimeException("checkArgs fail, thumbData is recycled");
        }
        throw new RuntimeException("checkArgs fail, thumbData is null");
    }

    private Bitmap a(Bitmap bitmap, double d5) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double sqrt = Math.sqrt(d5);
        double d6 = width;
        Double.isNaN(d6);
        double d7 = height;
        Double.isNaN(d7);
        return Bitmap.createScaledBitmap(bitmap, (int) (d6 / sqrt), (int) (d7 / sqrt), true);
    }

    public boolean a(WechatHandlerActivity wechatHandlerActivity) {
        return this.f1351b.a(wechatHandlerActivity, this.f1352c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WXMediaMessage wXMediaMessage, String str, int i4, k kVar) throws Throwable {
        Class<?> cls;
        String str2 = DH.SyncMtd.getPackageName() + MMessageActV2.DEFAULT_ENTRY_CLASS_NAME;
        try {
            cls = Class.forName(str2);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            cls = null;
        }
        if (cls != null && !WechatHandlerActivity.class.isAssignableFrom(cls)) {
            new Throwable(str2 + " does not extend from " + WechatHandlerActivity.class.getName()).printStackTrace();
        }
        SendMessageReq sendMessageReq = new SendMessageReq();
        sendMessageReq.f1414e = str + System.currentTimeMillis();
        sendMessageReq.f1298a = wXMediaMessage;
        sendMessageReq.f1299b = i4;
        this.f1352c = kVar;
        this.f1351b.a(sendMessageReq, wXMediaMessage.mediaObject instanceof WXMiniProgramObject);
    }

    public String a(File file) {
        String str;
        if (file != null && file.exists()) {
            try {
                str = MobSDK.getContext().getPackageName();
            } catch (Throwable th) {
                SSDKLog b5 = SSDKLog.b();
                b5.a("get packagename is catch: " + th, new Object[0]);
                str = null;
            }
            if (str != null) {
                Context context = MobSDK.getContext();
                Uri a5 = ShareSDKFileProvider.a(context, str + ".cn.sharesdk.ShareSDKFileProvider", file);
                MobSDK.getContext().grantUriPermission("com.tencent.mm", a5, 1);
                return a5.toString();
            }
        }
        return null;
    }
}
