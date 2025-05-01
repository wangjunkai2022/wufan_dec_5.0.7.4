package cn.sharesdk.framework;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import cn.sharesdk.framework.AgreementDialog;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ProvicyCanContinue;
import cn.sharesdk.framework.loopshare.MoblinkActionListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.tencent.qq.QQ;
import com.mob.MobSDK;
import com.mob.commons.ForbThrowable;
import com.mob.commons.dialog.PolicyThrowable;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.ResHelper;
import com.tencent.bugly.Bugly;
import java.util.HashMap;
/* compiled from: PlatformImpl.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private Platform f979a;

    /* renamed from: b  reason: collision with root package name */
    private PlatformDb f980b;

    /* renamed from: c  reason: collision with root package name */
    private d f981c;

    /* renamed from: d  reason: collision with root package name */
    private int f982d;

    /* renamed from: e  reason: collision with root package name */
    private int f983e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f984f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f985g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f986h;

    public f(Platform platform) {
        this.f979a = platform;
        String name = platform.getName();
        this.f980b = new PlatformDb(name, platform.getVersion());
        a(name);
        this.f981c = new d();
        c.a();
    }

    private String b(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                switch (i4) {
                    case 5:
                        return "ACTION_SENDING_DIRECT_MESSAGE";
                    case 6:
                        return "ACTION_FOLLOWING_USER";
                    case 7:
                        return "ACTION_TIMELINE";
                    case 8:
                        return "ACTION_USER_INFOR";
                    case 9:
                        return "ACTION_SHARE";
                    case 10:
                        return "ACTION_GETTING_BILATERAL_LIST";
                    case 11:
                        return "ACTION_GETTING_FOLLOWER_LIST";
                    default:
                        return "ACTION_CUSTOMER";
                }
            }
            return "ACTION_GETTING_FRIEND_LIST";
        }
        return "ACTION_AUTHORIZING";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        if (ShareSDK.a()) {
            this.f985g = !Bugly.SDK_IS_DEV.equals(a(this.f979a.getPlatformId(), "covert_url", (String) null));
            this.f979a.setNetworkDevinfo();
            return true;
        }
        try {
            ShareSDK.a(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.f.1
                @Override // cn.sharesdk.framework.ShareSDKCallback
                /* renamed from: a */
                public void onCallback(Boolean bool) {
                    if (bool.booleanValue()) {
                        f fVar = f.this;
                        String a5 = fVar.a(fVar.f979a.getPlatformId(), "covert_url", (String) null);
                        if (a5 != null) {
                            a5 = a5.trim();
                        }
                        f.this.f985g = !Bugly.SDK_IS_DEV.equals(a5);
                        f.this.f979a.setNetworkDevinfo();
                    }
                }
            });
            return false;
        } catch (Throwable th) {
            SSDKLog.b().b(th);
            return false;
        }
    }

    private String k() {
        StringBuilder sb = new StringBuilder();
        try {
            if ("TencentWeibo".equals(this.f979a.getName())) {
                SSDKLog.b().c("user id %s ==>>", g().getUserName());
                sb.append(Data.urlEncode(g().getUserName(), "utf-8"));
            } else {
                sb.append(Data.urlEncode(g().getUserId(), "utf-8"));
            }
            sb.append("|");
            sb.append(Data.urlEncode(g().get("secretType"), "utf-8"));
            sb.append("|");
            sb.append(Data.urlEncode(g().get("gender"), "utf-8"));
            sb.append("|");
            sb.append(Data.urlEncode(g().get("birthday"), "utf-8"));
            sb.append("|");
            sb.append(Data.urlEncode(g().get("educationJSONArrayStr"), "utf-8"));
            sb.append("|");
            sb.append(Data.urlEncode(g().get("workJSONArrayStr"), "utf-8"));
        } catch (Throwable th) {
            SSDKLog.b().b(th);
        }
        return sb.toString();
    }

    public boolean d() {
        return this.f980b.isValid();
    }

    public boolean e() {
        return this.f984f;
    }

    public boolean f() {
        return this.f986h;
    }

    public PlatformDb g() {
        return this.f980b;
    }

    public void h() {
        this.f980b.removeAccount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PlatformActionListener i() {
        return this.f981c;
    }

    public PlatformActionListener c() {
        return this.f981c.a();
    }

    public String d(String str) {
        return ShareSDK.a(str);
    }

    public int b() {
        return this.f983e;
    }

    protected void c(final int i4, final Object obj) {
        new Thread(a(i4)) { // from class: cn.sharesdk.framework.f.5
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (MobSDK.isForb() || !a.a()) {
                        return;
                    }
                    int isAuth = MobSDK.isAuth();
                    if (isAuth == 1 || isAuth == 2) {
                        f.this.j();
                        SSDKLog.b().a("The user is using the privacy version without a popup newThreadJob 001");
                    }
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("newThreadJob  " + th);
                }
            }
        }.start();
        new Thread() { // from class: cn.sharesdk.framework.f.6
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (MobSDK.isForb()) {
                        f fVar = f.this;
                        fVar.a(fVar.f981c, i4);
                    } else {
                        try {
                            int isAuth = MobSDK.isAuth();
                            if (isAuth != 1 && isAuth != 2) {
                                if (f.this.f981c != null) {
                                    f.this.f981c.onError(f.this.f979a, i4, new PolicyThrowable());
                                }
                            } else if (a.a()) {
                                if (f.this.f979a.checkAuthorize(i4, obj)) {
                                    f.this.b(i4, obj);
                                    SSDKLog.b().a("The user is using the privacy version without a popup newThreadJob 002");
                                }
                            } else {
                                f fVar2 = f.this;
                                fVar2.b(fVar2.f981c, i4);
                            }
                        } catch (Throwable unused) {
                            ProvicyCanContinue.a().a(new ProvicyCanContinue.OnBusinessListener() { // from class: cn.sharesdk.framework.f.6.1
                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onContinue() {
                                    if (a.a()) {
                                        Platform platform = f.this.f979a;
                                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                        if (platform.checkAuthorize(i4, obj)) {
                                            AnonymousClass6 anonymousClass62 = AnonymousClass6.this;
                                            f.this.b(i4, obj);
                                        }
                                    } else {
                                        f fVar3 = f.this;
                                        fVar3.b(fVar3.f981c, i4);
                                    }
                                    SSDKLog.b().a("The user is using the framed privacy version newThreadJob 002");
                                }

                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onError(Throwable th) {
                                    if (f.this.f981c != null) {
                                        f.this.f981c.onError(f.this.f979a, i4, th);
                                    }
                                }

                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onStop() {
                                    if (f.this.f981c != null) {
                                        f.this.f981c.onError(f.this.f979a, i4, new PolicyThrowable());
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("new Thread(getThreadName(action)) " + th, new Object[0]);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00bd -> B:47:0x012d). Please submit an issue!!! */
    public void b(int i4, Object obj) {
        if (i4 == 1) {
            d dVar = this.f981c;
            if (dVar != null) {
                dVar.onComplete(this.f979a, 1, null);
            }
        } else if (i4 != 2) {
            switch (i4) {
                case 6:
                    this.f979a.follow((String) obj);
                    return;
                case 7:
                    Object[] objArr = (Object[]) obj;
                    this.f979a.timeline(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (String) objArr[2]);
                    return;
                case 8:
                    this.f979a.userInfor(obj != null ? (String) obj : null);
                    return;
                case 9:
                    final Platform.ShareParams shareParams = (Platform.ShareParams) obj;
                    d dVar2 = this.f981c;
                    if (dVar2 instanceof d) {
                        dVar2.a(this.f979a, shareParams);
                    }
                    try {
                        if (shareParams.getLoopshareCustomParams().size() > 0 && shareParams.getLoopshareCustomParams() != null) {
                            if (this.f979a.getName().equals(QQ.NAME)) {
                                if (!TextUtils.isEmpty(shareParams.getTitleUrl())) {
                                    ShareSDK.mobLinkGetMobID(shareParams.getLoopshareCustomParams(), new MoblinkActionListener() { // from class: cn.sharesdk.framework.f.3
                                        @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
                                        public void onError(Throwable th) {
                                            if (f.this.f981c != null) {
                                                f.this.f981c.onError(f.this.f979a, 9, th);
                                            }
                                        }

                                        @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
                                        public void onResult(Object obj2) {
                                            if (!TextUtils.isEmpty(Uri.parse(shareParams.getTitleUrl()).getEncodedQuery())) {
                                                Platform.ShareParams shareParams2 = shareParams;
                                                shareParams2.setTitleUrl(shareParams.getTitleUrl() + "&mobid=" + obj2);
                                            } else {
                                                Platform.ShareParams shareParams3 = shareParams;
                                                shareParams3.setTitleUrl(shareParams.getTitleUrl() + "?mobid=" + obj2);
                                            }
                                            new Thread() { // from class: cn.sharesdk.framework.f.3.1
                                                @Override // java.lang.Thread, java.lang.Runnable
                                                public void run() {
                                                    super.run();
                                                    f.this.f979a.doShare(shareParams);
                                                }
                                            }.start();
                                        }
                                    });
                                } else if (this.f981c != null) {
                                    this.f981c.onError(this.f979a, 9, new Throwable("TitleUrl cannot be empty if setLoopshareCustomParams is used in QQ"));
                                }
                            } else if (!TextUtils.isEmpty(shareParams.getUrl())) {
                                if (this.f981c != null) {
                                    ShareSDK.mobLinkGetMobID(shareParams.getLoopshareCustomParams(), new MoblinkActionListener() { // from class: cn.sharesdk.framework.f.4
                                        @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
                                        public void onError(Throwable th) {
                                            if (f.this.f981c != null) {
                                                f.this.f981c.onError(f.this.f979a, 9, th);
                                            }
                                        }

                                        @Override // cn.sharesdk.framework.loopshare.MoblinkActionListener
                                        public void onResult(Object obj2) {
                                            if (!TextUtils.isEmpty(Uri.parse(shareParams.getUrl()).getEncodedQuery())) {
                                                Platform.ShareParams shareParams2 = shareParams;
                                                shareParams2.setUrl(shareParams.getUrl() + "&mobid=" + obj2);
                                            } else {
                                                Platform.ShareParams shareParams3 = shareParams;
                                                shareParams3.setUrl(shareParams.getUrl() + "?mobid=" + obj2);
                                            }
                                            new Thread() { // from class: cn.sharesdk.framework.f.4.1
                                                @Override // java.lang.Thread, java.lang.Runnable
                                                public void run() {
                                                    super.run();
                                                    f.this.f979a.doShare(shareParams);
                                                }
                                            }.start();
                                        }
                                    });
                                }
                            } else if (this.f981c != null) {
                                this.f981c.onError(this.f979a, 9, new Throwable("SetUrl cannot be empty if setLoopshareCustomParams is used"));
                            }
                        } else {
                            this.f979a.doShare(shareParams);
                        }
                    } catch (Throwable th) {
                        SSDKLog b5 = SSDKLog.b();
                        b5.a("PlatformImpl platform.doshare() " + th, new Object[0]);
                    }
                    return;
                default:
                    Object[] objArr2 = (Object[]) obj;
                    this.f979a.doCustomerProtocol(String.valueOf(objArr2[0]), String.valueOf(objArr2[1]), i4, (HashMap) objArr2[2], (HashMap) objArr2[3]);
                    return;
            }
        } else {
            Object[] objArr3 = (Object[]) obj;
            this.f979a.getFriendList(((Integer) objArr3[0]).intValue(), ((Integer) objArr3[1]).intValue(), (String) objArr3[2]);
        }
    }

    public void a(String str) {
        try {
            this.f982d = ResHelper.parseInt(String.valueOf(ShareSDK.getDevinfo(str, "Id")).trim());
        } catch (Throwable unused) {
            if (!(this.f979a instanceof CustomPlatform)) {
                SSDKLog b5 = SSDKLog.b();
                b5.a(this.f979a.getName() + " failed to parse Id, this will cause method getId() always returens 0", new Object[0]);
            }
        }
        try {
            this.f983e = ResHelper.parseInt(String.valueOf(ShareSDK.getDevinfo(str, "SortId")).trim());
        } catch (Throwable unused2) {
            if (!(this.f979a instanceof CustomPlatform)) {
                SSDKLog b6 = SSDKLog.b();
                b6.a(this.f979a.getName() + " failed to parse SortId, this won't cause any problem, don't worry", new Object[0]);
            }
        }
        String devinfo = ShareSDK.getDevinfo(str, "Enable");
        if (devinfo == null) {
            this.f986h = true;
            if (!(this.f979a instanceof CustomPlatform)) {
                SSDKLog b7 = SSDKLog.b();
                b7.a(this.f979a.getName() + " failed to parse Enable, this will cause platform always be enable", new Object[0]);
            }
        } else {
            this.f986h = "true".equals(devinfo.trim());
        }
        this.f979a.initDevInfo(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Platform.ShareParams shareParams) {
        try {
            if (shareParams == null) {
                d dVar = this.f981c;
                if (dVar != null) {
                    dVar.onError(this.f979a, 9, new NullPointerException());
                    return;
                }
                return;
            }
            try {
                if (!shareParams.getOpenCustomEven()) {
                    ShareSDK.logDemoEvent(3, this.f979a);
                }
            } catch (Throwable unused) {
            }
            c(9, shareParams);
        } catch (Throwable th) {
            SSDKLog.b().d(th);
        }
    }

    public void c(String str) {
        c(8, str);
    }

    public int a() {
        return this.f982d;
    }

    public void a(PlatformActionListener platformActionListener) {
        this.f981c.a(platformActionListener);
    }

    public void a(boolean z4) {
        this.f984f = z4;
    }

    private String a(int i4) {
        return "ShareSDK_" + this.f979a.getName() + "_" + b(i4);
    }

    public String a(int i4, String str, String str2) {
        String a5 = ShareSDK.a(i4, str);
        if (TextUtils.isEmpty(a5) || "null".equals(a5)) {
            Platform platform = this.f979a;
            return platform.getDevinfo(platform.getName(), str2);
        }
        return a5;
    }

    public void a(int i4, Object obj) {
        this.f981c.a(this.f979a, i4, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, int i4) {
        if (dVar != null) {
            dVar.onError(this.f979a, i4, new ForbThrowable());
        }
    }

    public void a(final Platform.ShareParams shareParams) {
        if (shareParams == null) {
            d dVar = this.f981c;
            if (dVar != null) {
                dVar.onError(this.f979a, 9, new NullPointerException());
                return;
            }
            return;
        }
        new Thread(a(1)) { // from class: cn.sharesdk.framework.f.7
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    f.this.f979a.subscribeAuth(shareParams);
                    SSDKLog.b().a(OnekeyShare.SHARESDK_TAG, "subscribeAuth start on PlatformImpl");
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a(OnekeyShare.SHARESDK_TAG, " subscribeAuth catch " + th);
                }
            }
        }.start();
    }

    public void a(final String[] strArr) {
        try {
            if (MobSDK.isGppVer() && !cn.sharesdk.framework.a.a.e.a().i("no_use_gpp")) {
                if (!cn.sharesdk.framework.a.a.e.a().i("gpp_ver_sent")) {
                    AgreementDialog agreementDialog = new AgreementDialog();
                    agreementDialog.setShareParam(new AgreementDialog.OnDialogDismiss() { // from class: cn.sharesdk.framework.f.8
                        @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
                        public void consent() {
                            cn.sharesdk.framework.a.a.e.a().a(true);
                            f.this.b(strArr);
                        }

                        @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
                        public void refuse() {
                            if (f.this.f981c != null) {
                                f.this.f981c.onError(f.this.f979a, 21, null);
                            }
                        }
                    });
                    agreementDialog.show(MobSDK.getContext(), null);
                } else {
                    b(strArr);
                }
            } else {
                b(strArr);
            }
        } catch (Throwable th) {
            SSDKLog.b().b(th);
            b(strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar, int i4) {
        if (dVar != null) {
            dVar.onError(this.f979a, i4, new Throwable("'appkey' is illegal"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String[] strArr) {
        new Thread(a(1)) { // from class: cn.sharesdk.framework.f.9
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (MobSDK.isForb() || !a.a()) {
                        return;
                    }
                    int isAuth = MobSDK.isAuth();
                    if (isAuth == 1 || isAuth == 2) {
                        f.this.j();
                        SSDKLog.b().a("The user is using the privacy version without a popup authorize 001");
                    }
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("authorize(final String[] permissions) " + th, new Object[0]);
                }
            }
        }.start();
        new Thread() { // from class: cn.sharesdk.framework.f.10
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    if (MobSDK.isForb()) {
                        f fVar = f.this;
                        fVar.a(fVar.f981c, 1);
                    } else {
                        try {
                            int isAuth = MobSDK.isAuth();
                            if (isAuth != 1 && isAuth != 2) {
                                if (f.this.f981c != null) {
                                    f.this.f981c.onError(f.this.f979a, 1, new PolicyThrowable());
                                }
                            } else if (a.a()) {
                                f.this.f979a.doAuthorize(strArr);
                            } else {
                                f fVar2 = f.this;
                                fVar2.b(fVar2.f981c, 1);
                            }
                        } catch (Throwable unused) {
                            ProvicyCanContinue.a().a(new ProvicyCanContinue.OnBusinessListener() { // from class: cn.sharesdk.framework.f.10.1
                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onContinue() {
                                    if (a.a()) {
                                        f.this.f979a.doAuthorize(strArr);
                                    } else {
                                        f fVar3 = f.this;
                                        fVar3.b(fVar3.f981c, 1);
                                    }
                                    SSDKLog.b().a("The user is using the privacy version with a pop-up box authorize 002");
                                }

                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onError(Throwable th) {
                                    if (f.this.f981c != null) {
                                        f.this.f981c.onError(f.this.f979a, 1, new PolicyThrowable());
                                    }
                                }

                                @Override // cn.sharesdk.framework.ProvicyCanContinue.OnBusinessListener
                                public void onStop() {
                                    if (f.this.f981c != null) {
                                        f.this.f981c.onError(f.this.f979a, 1, new PolicyThrowable());
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("new Thread Platform.ACTION_AUTHORIZING " + th, new Object[0]);
                }
            }
        }.start();
    }

    public void b(final Platform.ShareParams shareParams) {
        try {
            if (MobSDK.isGppVer() && !cn.sharesdk.framework.a.a.e.a().i("no_use_gpp")) {
                if (!cn.sharesdk.framework.a.a.e.a().i("gpp_ver_sent")) {
                    AgreementDialog agreementDialog = new AgreementDialog();
                    agreementDialog.setShareParam(new AgreementDialog.OnDialogDismiss() { // from class: cn.sharesdk.framework.f.2
                        @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
                        public void consent() {
                            cn.sharesdk.framework.a.a.e.a().a(true);
                            f.this.c(shareParams);
                        }

                        @Override // cn.sharesdk.framework.AgreementDialog.OnDialogDismiss
                        public void refuse() {
                            if (f.this.f981c != null) {
                                f.this.f981c.onError(f.this.f979a, 21, new Throwable("The user rejected the request to read the applist"));
                            }
                        }
                    });
                    agreementDialog.show(MobSDK.getContext(), null);
                    return;
                }
                c(shareParams);
                return;
            }
            c(shareParams);
        } catch (Throwable unused) {
            c(shareParams);
        }
    }

    public void a(String str, int i4, int i5) {
        c(7, new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), str});
    }

    public void a(int i4, int i5, String str) {
        c(2, new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), str});
    }

    public void a(String str, String str2, short s4, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        c(s4 | 655360, new Object[]{str, str2, hashMap, hashMap2});
    }

    public void a(String str, boolean z4, ShareSDKCallback<String> shareSDKCallback) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f985g) {
            SSDKLog b5 = SSDKLog.b();
            b5.b("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis));
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(str);
            }
        } else if (TextUtils.isEmpty(str)) {
            SSDKLog b6 = SSDKLog.b();
            b6.b("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis));
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(str);
            }
        } else {
            ShareSDK.a(str, z4, this.f979a.getPlatformId(), k(), shareSDKCallback);
            SSDKLog b7 = SSDKLog.b();
            b7.b("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public void b(String str) {
        c(6, str);
    }

    public String a(Bitmap bitmap) {
        return ShareSDK.a(bitmap);
    }

    public String a(String str, boolean z4, HashMap<String, String> hashMap) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f985g) {
            SSDKLog b5 = SSDKLog.b();
            b5.b("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis));
            return str;
        } else if (TextUtils.isEmpty(str)) {
            SSDKLog b6 = SSDKLog.b();
            b6.b("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis));
            return str;
        } else {
            String a5 = cn.sharesdk.framework.a.a.a().a(str, this.f979a.getPlatformId(), z4, k(), hashMap);
            SSDKLog b7 = SSDKLog.b();
            b7.b("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis));
            return a5;
        }
    }
}
