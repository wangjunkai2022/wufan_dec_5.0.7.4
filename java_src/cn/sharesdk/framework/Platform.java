package cn.sharesdk.framework;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.k;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.UIHandler;
import java.util.HashMap;
/* loaded from: classes2.dex */
public abstract class Platform {
    public static final int ACTION_AUTHORIZING = 1;
    protected static final int ACTION_CUSTOMER = 655360;
    public static final int ACTION_FOLLOWING_USER = 6;
    protected static final int ACTION_GETTING_BILATERAL_LIST = 10;
    protected static final int ACTION_GETTING_FOLLOWER_LIST = 11;
    public static final int ACTION_GETTING_FRIEND_LIST = 2;
    public static final int ACTION_SENDING_DIRECT_MESSAGE = 5;
    public static final int ACTION_SHARE = 9;
    public static final int ACTION_TIMELINE = 7;
    public static final int ACTION_USER_INFOR = 8;
    public static final int CUSTOMER_ACTION_MASK = 65535;
    public static final int DY_MIXFILE = 23;
    public static final int GGP_REFUSE = 21;
    public static final int INSTAGRAM_FRIEND = 13;
    public static final int KAKAO_COMMERCE_TEMPLATE = 18;
    public static final int KAKAO_CUSTOM_TEMPLATE = 20;
    public static final int KAKAO_FEED_TEMPLATE = 16;
    public static final int KAKAO_TEXT_TEMPLATE = 19;
    public static final int KAKAO_URL_TEMPLATE = 17;
    public static final int OPEN_QQMINIPROGRAM = 22;
    public static final int OPEN_WXMINIPROGRAM = 12;
    public static final int QQ_MINI_PROGRAM = 15;
    public static final int SHARE_APPS = 7;
    public static final int SHARE_DYIM_IMG = 24;
    public static final int SHARE_DYIM_WEBPAGE = 25;
    public static final int SHARE_EMOJI = 9;
    public static final int SHARE_FILE = 8;
    public static final int SHARE_IMAGE = 2;
    public static final int SHARE_LINKCARD = 14;
    public static final int SHARE_MUSIC = 5;
    public static final int SHARE_TEXT = 1;
    public static final int SHARE_VIDEO = 6;
    public static final int SHARE_WEBPAGE = 4;
    public static final int SHARE_WXMINIPROGRAM = 11;
    public static final int SHARE_ZHIFUBAO = 10;

    /* renamed from: c  reason: collision with root package name */
    private static Platform f739c;

    /* renamed from: a  reason: collision with root package name */
    private f f740a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f741b = new Object();
    protected final PlatformDb db;
    protected volatile boolean isClientValid;
    protected PlatformActionListener listener;
    protected String pkgName;
    protected final PlatformActionListener uIListener;

    /* loaded from: classes2.dex */
    public static class ShareParams extends InnerShareParams {
        public ShareParams() {
        }

        public ShareParams(HashMap<String, Object> hashMap) {
            super(hashMap);
        }

        public ShareParams(String str) {
            super(str);
        }
    }

    public Platform() {
        f fVar = new f(this);
        this.f740a = fVar;
        this.db = fVar.g();
        this.listener = this.f740a.i();
        this.uIListener = new PlatformActionListener() { // from class: cn.sharesdk.framework.Platform.1
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(final Platform platform, final int i4) {
                if (Platform.this.listener == null) {
                    return;
                }
                try {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Platform.this.listener.onCancel(platform, i4);
                    } else {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: cn.sharesdk.framework.Platform.1.3
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                Platform.this.listener.onCancel(platform, i4);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(final Platform platform, final int i4, final HashMap<String, Object> hashMap) {
                if (Platform.this.listener == null) {
                    return;
                }
                try {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Platform.this.listener.onComplete(platform, i4, hashMap);
                    } else {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: cn.sharesdk.framework.Platform.1.2
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                Platform.this.listener.onComplete(platform, i4, hashMap);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th) {
                    SSDKLog.b().a(th);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(final Platform platform, final int i4, final Throwable th) {
                if (Platform.this.listener == null) {
                    return;
                }
                try {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Platform.this.listener.onError(platform, i4, th);
                    } else {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: cn.sharesdk.framework.Platform.1.1
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                Platform.this.listener.onError(platform, i4, th);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        };
    }

    public static Platform getDefaultPlatform() {
        if (f739c == null) {
            f739c = new Platform() { // from class: cn.sharesdk.framework.Platform.8

                /* renamed from: a  reason: collision with root package name */
                final Throwable f766a = new Throwable("Privacy policy is not accepted Use default platform");

                @Override // cn.sharesdk.framework.Platform
                protected boolean checkAuthorize(int i4, Object obj) {
                    return true;
                }

                @Override // cn.sharesdk.framework.Platform
                protected void doAuthorize(String[] strArr) {
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onError(this, 1, this.f766a);
                    }
                }

                @Override // cn.sharesdk.framework.Platform
                protected void doCustomerProtocol(String str, String str2, int i4, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
                }

                @Override // cn.sharesdk.framework.Platform
                protected void doShare(ShareParams shareParams) {
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onError(this, 9, this.f766a);
                    }
                }

                @Override // cn.sharesdk.framework.Platform
                protected HashMap<String, Object> filterFriendshipInfo(int i4, HashMap<String, Object> hashMap) {
                    return null;
                }

                @Override // cn.sharesdk.framework.Platform
                protected f.a filterShareContent(ShareParams shareParams, HashMap<String, Object> hashMap) {
                    return null;
                }

                @Override // cn.sharesdk.framework.Platform
                protected void follow(String str) {
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

                @Override // cn.sharesdk.framework.Platform
                protected void getFriendList(int i4, int i5, String str) {
                }

                @Override // cn.sharesdk.framework.Platform
                public String getName() {
                    return "default";
                }

                @Override // cn.sharesdk.framework.Platform
                protected int getPlatformId() {
                    return -1;
                }

                @Override // cn.sharesdk.framework.Platform
                public int getVersion() {
                    return -1;
                }

                @Override // cn.sharesdk.framework.Platform
                public boolean hasShareCallback() {
                    return false;
                }

                @Override // cn.sharesdk.framework.Platform
                protected void initDevInfo(String str) {
                }

                @Override // cn.sharesdk.framework.Platform
                protected void setNetworkDevinfo() {
                }

                @Override // cn.sharesdk.framework.Platform
                protected void timeline(int i4, int i5, String str) {
                }

                @Override // cn.sharesdk.framework.Platform
                protected void userInfor(String str) {
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onError(this, 8, this.f766a);
                    }
                }
            };
        }
        return f739c;
    }

    public void SSOSetting(boolean z4) {
        this.f740a.a(z4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void afterRegister(int i4, Object obj) {
        this.f740a.b(i4, obj);
    }

    public void authorize() {
        authorize(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean checkAuthorize(int i4, Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public void copyDevinfo(String str, String str2) {
        ShareSDK.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void copyNetworkDevinfo(int i4, int i5) {
        ShareSDK.a(i4, i5);
    }

    public void customerProtocol(String str, String str2, short s4, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        this.f740a.a(str, str2, s4, hashMap, hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void doAuthorize(String[] strArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void doCustomerProtocol(String str, String str2, int i4, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void doShare(ShareParams shareParams);

    protected abstract HashMap<String, Object> filterFriendshipInfo(int i4, HashMap<String, Object> hashMap);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract f.a filterShareContent(ShareParams shareParams, HashMap<String, Object> hashMap);

    /* JADX INFO: Access modifiers changed from: protected */
    public String filterShareContent(ShareParams shareParams) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void follow(String str);

    public void followFriend(String str) {
        this.f740a.b(str);
    }

    protected abstract HashMap<String, Object> getBilaterals(int i4, int i5, String str);

    public PlatformDb getDb() {
        return this.db;
    }

    public String getDevinfo(String str) {
        return getDevinfo(getName(), str);
    }

    protected abstract HashMap<String, Object> getFollowers(int i4, int i5, String str);

    protected abstract HashMap<String, Object> getFollowings(int i4, int i5, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void getFriendList(int i4, int i5, String str);

    public int getId() {
        return this.f740a.a();
    }

    public abstract String getName();

    /* JADX INFO: Access modifiers changed from: protected */
    public String getNetworkDevinfo(String str, String str2) {
        return getNetworkDevinfo(getPlatformId(), str, str2);
    }

    public PlatformActionListener getPlatformActionListener() {
        return this.f740a.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int getPlatformId();

    public void getShortLintk(String str, boolean z4, ShareSDKCallback<String> shareSDKCallback) {
        this.f740a.a(str, z4, shareSDKCallback);
    }

    public int getSortId() {
        return this.f740a.b();
    }

    public void getTimeLine(String str, int i4, int i5) {
        this.f740a.a(str, i4, i5);
    }

    public abstract int getVersion();

    public abstract boolean hasShareCallback();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void initDevInfo(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public void innerAuthorize(int i4, Object obj) {
        this.f740a.a(i4, obj);
    }

    public boolean isAuthValid() {
        return this.f740a.d();
    }

    @Deprecated
    public boolean isClientValid() {
        k.a(new k.a() { // from class: cn.sharesdk.framework.Platform.2
            @Override // cn.sharesdk.framework.utils.k.a
            public void a() throws Throwable {
                Platform.this.isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.2.1
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(Boolean bool) {
                        synchronized (Platform.this.f741b) {
                            Platform.this.isClientValid = bool != null && bool.booleanValue();
                            Platform.this.f741b.notifyAll();
                        }
                    }
                });
            }
        });
        synchronized (this.f741b) {
            try {
                this.f741b.wait(1000L);
            }
        }
        return this.isClientValid;
    }

    public boolean isSSODisable() {
        return this.f740a.e();
    }

    public void listFriend(int i4, int i5, String str) {
        this.f740a.a(i4, i5, str);
    }

    public void removeAccount(boolean z4) {
        this.f740a.h();
        ShareSDK.removeCookieOnAuthorize(z4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void setNetworkDevinfo();

    public void setPlatformActionListener(PlatformActionListener platformActionListener) {
        this.f740a.a(platformActionListener);
    }

    public void share(final ShareParams shareParams) {
        cn.sharesdk.framework.utils.i.a();
        isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.6
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                Platform.this.isClientValid = bool.booleanValue();
                Platform.this.f740a.b(shareParams);
            }
        });
    }

    public void showUser(final String str) {
        isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.7
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                Platform.this.isClientValid = bool.booleanValue();
                Platform.this.f740a.c(str);
            }
        });
    }

    public void subscribeAuth(final ShareParams shareParams) {
        isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.5
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                Platform.this.isClientValid = bool.booleanValue();
                Platform.this.f740a.a(shareParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void timeline(int i4, int i5, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public String uploadImageToFileServer(String str) {
        return this.f740a.d(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void userInfor(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f740a.a(false);
        this.f740a.a(getName());
    }

    public void authorize(final String[] strArr) {
        cn.sharesdk.framework.utils.i.a();
        isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.4
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                Platform.this.isClientValid = bool.booleanValue();
                Platform.this.f740a.a(strArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f740a.f();
    }

    public String getDevinfo(String str, String str2) {
        return ShareSDK.getDevinfo(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getNetworkDevinfo(int i4, String str, String str2) {
        return this.f740a.a(i4, str, str2);
    }

    public String getShortLintk(String str, boolean z4, HashMap<String, String> hashMap) {
        return this.f740a.a(str, z4, hashMap);
    }

    protected String uploadImageToFileServer(Bitmap bitmap) {
        return this.f740a.a(bitmap);
    }

    public void isClientValid(final ShareSDKCallback<Boolean> shareSDKCallback) {
        if (shareSDKCallback == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(this.pkgName)) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            } else {
                DH.requester(MobSDK.getContext()).getPInfoForce(true, this.pkgName, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.framework.Platform.3
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        try {
                            if (dHResponse.getPInfoForce(new int[0]) == null) {
                                shareSDKCallback.onCallback(Boolean.valueOf(cn.sharesdk.framework.utils.i.a(Platform.this.pkgName, 0) != null));
                            } else {
                                shareSDKCallback.onCallback(Boolean.TRUE);
                            }
                        } catch (Throwable th) {
                            SSDKLog b5 = SSDKLog.b();
                            b5.a("isClientValid" + th, new Object[0]);
                            shareSDKCallback.onCallback(Boolean.FALSE);
                        }
                    }
                });
            }
        } catch (Throwable unused) {
            shareSDKCallback.onCallback(Boolean.FALSE);
        }
    }
}
