package cn.sharesdk.sina.weibo;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.tencent.bugly.Bugly;
import com.xinzhu.overmind.client.hook.proxies.context.providers.b;
import com.xinzhu.overmind.utils.helpers.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class SinaWeibo extends Platform {
    public static final String NAME = "SinaWeibo";
    public static volatile boolean initFlag;

    /* renamed from: a  reason: collision with root package name */
    private String f1078a;

    /* renamed from: b  reason: collision with root package name */
    private String f1079b;

    /* renamed from: c  reason: collision with root package name */
    private String f1080c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1081d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i4, Object obj) {
        a a5 = a.a(this);
        a5.c(this.db.getToken());
        a5.a(this.f1078a, this.f1079b);
        a5.a(this.f1080c);
        a5.c();
        if (i4 == 9 || isAuthValid() || c()) {
            return true;
        }
        innerAuthorize(i4, obj);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        final a a5 = a.a(this);
        a5.a(this.f1078a, this.f1079b);
        a5.a(this.f1080c);
        a5.a(strArr);
        a5.a(new AuthorizeListener() { // from class: cn.sharesdk.sina.weibo.SinaWeibo.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (((Platform) SinaWeibo.this).listener != null) {
                    ((Platform) SinaWeibo.this).listener.onCancel(SinaWeibo.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                long j4;
                String string = bundle.getString("uid");
                String string2 = bundle.getString("access_token");
                String string3 = bundle.getString("expires_in");
                String string4 = bundle.getString("refresh_token");
                if (bundle.containsKey("username")) {
                    ((Platform) SinaWeibo.this).db.put("nickname", bundle.getString("userName"));
                }
                ((Platform) SinaWeibo.this).db.putToken(string2);
                try {
                    j4 = ResHelper.parseLong(string3);
                } catch (Throwable unused) {
                    j4 = 0;
                }
                ((Platform) SinaWeibo.this).db.putExpiresIn(j4);
                ((Platform) SinaWeibo.this).db.put("refresh_token", string4);
                ((Platform) SinaWeibo.this).db.putUserId(string);
                a5.c(string2);
                SinaWeibo.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th) {
                if (((Platform) SinaWeibo.this).listener != null) {
                    ((Platform) SinaWeibo.this).listener.onError(SinaWeibo.this, 1, th);
                }
            }
        }, isSSODisable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i4, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> a5 = a.a(this).a(str, str2, hashMap, hashMap2);
            if (a5 != null && a5.size() > 0) {
                if (a5.containsKey("error_code") && ((Integer) a5.get("error_code")).intValue() != 0) {
                    if (this.listener != null) {
                        this.listener.onError(this, i4, new Throwable(new Hashon().fromHashMap(a5)));
                        return;
                    }
                    return;
                }
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onComplete(this, i4, a5);
                    return;
                }
                return;
            }
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, i4, new Throwable());
            }
        } catch (Throwable th) {
            this.listener.onError(this, i4, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doShare(Platform.ShareParams shareParams) {
        SSDKLog b5 = SSDKLog.b();
        b5.a("Weibo start Share with Appkey:" + this.f1078a + ",appSecret:" + this.f1079b + ",redirectUrl:" + this.f1080c, new Object[0]);
        SSDKLog b6 = SSDKLog.b();
        StringBuilder sb = new StringBuilder();
        sb.append("Weibo ShareParams:");
        sb.append(shareParams.toString());
        b6.a(sb.toString(), new Object[0]);
        a a5 = a.a(this);
        a5.a(this.f1078a, this.f1079b);
        if (this.f1081d && this.isClientValid) {
            try {
                a5.a(shareParams, this.listener);
                return;
            } catch (Throwable th) {
                this.listener.onError(this, 9, th);
                return;
            }
        }
        try {
            a5.b(shareParams, this.listener);
        } catch (Throwable th2) {
            this.listener.onError(this, 9, th2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> filterFriendshipInfo(int i4, HashMap<String, Object> hashMap) {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2;
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (i4 == 2) {
            hashMap2.put("type", "FOLLOWING");
        } else if (i4 == 10) {
            hashMap2.put("type", "FRIENDS");
        } else if (i4 != 11) {
            return null;
        } else {
            hashMap2.put("type", "FOLLOWERS");
        }
        hashMap2.put("snsplat", Integer.valueOf(getPlatformId()));
        hashMap2.put("snsuid", this.db.getUserId());
        int parseInt = Integer.parseInt(String.valueOf(hashMap.get("current_cursor")));
        int parseInt2 = Integer.parseInt(String.valueOf(hashMap.get("total_number")));
        if (parseInt2 == 0 || (obj = hashMap.get("users")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.size() <= 0) {
            return null;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            HashMap hashMap3 = (HashMap) it2.next();
            if (hashMap3 != null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("snsuid", String.valueOf(hashMap3.get("id")));
                hashMap4.put("nickname", String.valueOf(hashMap3.get("screen_name")));
                hashMap4.put("icon", String.valueOf(hashMap3.get("avatar_hd")));
                if (String.valueOf(hashMap3.get("verified")).equals("true")) {
                    hashMap4.put("secretType", "1");
                } else {
                    hashMap4.put("secretType", "0");
                }
                hashMap4.put("secret", String.valueOf(hashMap3.get("verified_reason")));
                String valueOf = String.valueOf(hashMap3.get("gender"));
                if (valueOf.equals("m")) {
                    hashMap4.put("gender", "0");
                } else if (valueOf.equals(f.f68332a)) {
                    hashMap4.put("gender", "1");
                } else {
                    hashMap4.put("gender", "2");
                }
                hashMap4.put("snsUserUrl", "http://weibo.com/" + String.valueOf(hashMap3.get("profile_url")));
                hashMap4.put("resume", String.valueOf(hashMap3.get(b.f67677k)));
                hashMap4.put("followerCount", String.valueOf(hashMap3.get("followers_count")));
                hashMap4.put("favouriteCount", String.valueOf(hashMap3.get("friends_count")));
                hashMap4.put("shareCount", String.valueOf(hashMap3.get("statuses_count")));
                hashMap4.put("snsregat", String.valueOf(ResHelper.dateToLong(String.valueOf(hashMap3.get("created_at")))));
                arrayList.add(hashMap4);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        if (10 == i4) {
            int i5 = parseInt + 1;
            if (((Integer) hashMap.get("page_count")).intValue() * i5 >= parseInt2) {
                sb2 = new StringBuilder();
                sb2.append(parseInt);
                sb2.append("_true");
            } else {
                sb2 = new StringBuilder();
                sb2.append(i5);
                sb2.append("_false");
            }
            hashMap2.put("nextCursor", sb2.toString());
        } else {
            int size = parseInt + arrayList.size();
            if (size >= parseInt2) {
                sb = new StringBuilder();
                sb.append(parseInt2);
                sb.append("_true");
            } else {
                sb = new StringBuilder();
                sb.append(size);
                sb.append("_false");
            }
            hashMap2.put("nextCursor", sb.toString());
        }
        hashMap2.put("list", arrayList);
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        f.a aVar = new f.a();
        aVar.f902b = shareParams.getText();
        if (hashMap != null) {
            aVar.f901a = String.valueOf(hashMap.get("id"));
            aVar.f904d.add(String.valueOf(hashMap.get("original_pic")));
            aVar.f907g = hashMap;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void follow(String str) {
        try {
            HashMap<String, Object> e5 = a.a(this).e(str);
            if (e5 == null) {
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 6, new Throwable());
                }
            } else if (e5.containsKey("error_code") && ((Integer) e5.get("error_code")).intValue() != 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 6, new Throwable(new Hashon().fromHashMap(e5)));
                }
            } else {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onComplete(this, 6, e5);
                }
            }
        } catch (Throwable th) {
            this.listener.onError(this, 6, th);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getBilaterals(int i4, int i5, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            HashMap<String, Object> c5 = a.a(this).c(i4, i5, str);
            if (c5 == null || c5.containsKey("error_code")) {
                return null;
            }
            c5.put("page_count", Integer.valueOf(i4));
            c5.put("current_cursor", Integer.valueOf(i5));
            return filterFriendshipInfo(10, c5);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getFollowers(int i4, int i5, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            HashMap<String, Object> d5 = a.a(this).d(i4, i5, str);
            if (d5 == null || d5.containsKey("error_code")) {
                return null;
            }
            d5.put("current_cursor", Integer.valueOf(i5));
            return filterFriendshipInfo(11, d5);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getFollowings(int i4, int i5, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            HashMap<String, Object> b5 = a.a(this).b(i4, i5, str);
            if (b5 == null || b5.containsKey("error_code")) {
                return null;
            }
            b5.put("current_cursor", Integer.valueOf(i5));
            return filterFriendshipInfo(2, b5);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i4, int i5, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 2, new RuntimeException("Both weibo id and screen_name are null"));
                return;
            }
            return;
        }
        try {
            HashMap<String, Object> b5 = a.a(this).b(i4, i5, str);
            if (b5 == null) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 2, new Throwable());
                }
            } else if (b5.containsKey("error_code") && ((Integer) b5.get("error_code")).intValue() != 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new Hashon().fromHashMap(b5)));
                }
            } else {
                PlatformActionListener platformActionListener3 = this.listener;
                if (platformActionListener3 != null) {
                    platformActionListener3.onComplete(this, 2, b5);
                }
            }
        } catch (Throwable th) {
            this.listener.onError(this, 2, th);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f1078a = getDevinfo("AppKey");
        this.f1079b = getDevinfo("AppSecret");
        this.f1080c = getDevinfo("RedirectUrl");
        this.f1081d = !Bugly.SDK_IS_DEV.equals(getDevinfo("ShareByAppClient"));
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            a.a(this).a(shareSDKCallback);
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
        this.f1078a = getNetworkDevinfo(com.alipay.sdk.cons.b.f4835h, "AppKey");
        this.f1079b = getNetworkDevinfo("app_secret", "AppSecret");
        this.f1080c = getNetworkDevinfo("redirect_uri", "RedirectUrl");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i4, int i5, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 7, new RuntimeException("Both weibo id and screen_name are null"));
                return;
            }
            return;
        }
        try {
            HashMap<String, Object> a5 = a.a(this).a(i4, i5, str);
            if (a5 == null) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 7, new Throwable());
                }
            } else if (a5.containsKey("error_code") && ((Integer) a5.get("error_code")).intValue() != 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 7, new Throwable(new Hashon().fromHashMap(a5)));
                }
            } else {
                PlatformActionListener platformActionListener3 = this.listener;
                if (platformActionListener3 != null) {
                    platformActionListener3.onComplete(this, 7, a5);
                }
            }
        } catch (Throwable th) {
            this.listener.onError(this, 7, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
        boolean z4;
        boolean z5 = true;
        if (TextUtils.isEmpty(str)) {
            str = this.db.getUserId();
            z4 = true;
        } else {
            z4 = false;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.db.get("nickname");
        } else {
            z5 = z4;
        }
        if (TextUtils.isEmpty(str)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 8, new RuntimeException("Both weibo id and screen_name are null"));
                return;
            }
            return;
        }
        try {
            HashMap<String, Object> d5 = a.a(this).d(str);
            if (d5 == null) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 8, new Throwable());
                }
            } else if (d5.containsKey("error_code") && ((Integer) d5.get("error_code")).intValue() != 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(d5)));
                }
            } else {
                if (z5) {
                    this.db.putUserId(String.valueOf(d5.get("id")));
                    this.db.put("nickname", String.valueOf(d5.get("screen_name")));
                    this.db.put("icon", String.valueOf(d5.get("avatar_hd")));
                    if (String.valueOf(d5.get("verified")).equals("true")) {
                        this.db.put("secretType", "1");
                    } else {
                        this.db.put("secretType", "0");
                    }
                    this.db.put("secret", String.valueOf(d5.get("verified_reason")));
                    String valueOf = String.valueOf(d5.get("gender"));
                    if (valueOf.equals("m")) {
                        this.db.put("gender", "0");
                    } else if (valueOf.equals(com.xinzhu.overmind.utils.helpers.f.f68332a)) {
                        this.db.put("gender", "1");
                    } else {
                        this.db.put("gender", "2");
                    }
                    PlatformDb platformDb = this.db;
                    platformDb.put("snsUserUrl", "http://weibo.com/" + String.valueOf(d5.get("profile_url")));
                    this.db.put("resume", String.valueOf(d5.get(b.f67677k)));
                    this.db.put("followerCount", String.valueOf(d5.get("followers_count")));
                    this.db.put("favouriteCount", String.valueOf(d5.get("friends_count")));
                    this.db.put("shareCount", String.valueOf(d5.get("statuses_count")));
                    this.db.put("snsregat", String.valueOf(ResHelper.dateToLong(String.valueOf(d5.get("created_at")))));
                }
                PlatformActionListener platformActionListener3 = this.listener;
                if (platformActionListener3 != null) {
                    platformActionListener3.onComplete(this, 8, d5);
                }
            }
        } catch (Throwable th) {
            this.listener.onError(this, 8, th);
        }
    }

    private boolean c() {
        if (TextUtils.isEmpty(getDb().get("refresh_token"))) {
            return false;
        }
        a a5 = a.a(this);
        a5.a(this.f1078a, this.f1079b);
        a5.a(this.f1080c);
        return a5.a();
    }
}
