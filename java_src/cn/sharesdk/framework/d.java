package cn.sharesdk.framework;

import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.HashonHelper;
import java.util.HashMap;
/* compiled from: InnerPlatformActionListener.java */
/* loaded from: classes2.dex */
public class d implements PlatformActionListener {

    /* renamed from: a  reason: collision with root package name */
    private PlatformActionListener f965a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<Platform, Platform.ShareParams> f966b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private int f967c;

    private void b(Platform platform, int i4, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2;
        Platform platform2;
        Platform.ShareParams remove = this.f966b.remove(platform);
        if (hashMap != null) {
            remove = (Platform.ShareParams) hashMap.remove("ShareParams");
        }
        try {
            hashMap2 = (HashMap) hashMap.clone();
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            hashMap2 = hashMap;
        }
        if (remove != null) {
            cn.sharesdk.framework.a.b.f fVar = new cn.sharesdk.framework.a.b.f();
            fVar.f900n = remove.getCustomFlag();
            String userId = platform.getDb().getUserId();
            if ((WechatMoments.NAME.equals(platform.getName()) || "WechatFavorite".equals(platform.getName())) && TextUtils.isEmpty(userId)) {
                try {
                    platform2 = ShareSDK.getPlatform(Wechat.NAME);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2, "InnerPlatformActionListener wechat is null", new Object[0]);
                    platform2 = null;
                }
                if (platform2 != null) {
                    userId = platform2.getDb().getUserId();
                }
            } else if ("TencentWeibo".equals(platform.getName())) {
                userId = platform.getDb().get("name");
            }
            fVar.f896b = userId;
            fVar.f895a = platform.getPlatformId();
            String filterShareContent = platform.filterShareContent(remove);
            if (!TextUtils.isEmpty(filterShareContent)) {
                try {
                    fVar.f898d = (f.a) HashonHelper.fromJson(filterShareContent, f.a.class);
                } catch (Throwable th3) {
                    SSDKLog.b().a(th3);
                }
            } else {
                f.a filterShareContent2 = platform.filterShareContent(remove, hashMap2);
                if (filterShareContent2 != null) {
                    fVar.f897c = filterShareContent2.f901a;
                    fVar.f898d = filterShareContent2;
                }
            }
            fVar.f899m = b(platform);
            cn.sharesdk.framework.a.d a5 = cn.sharesdk.framework.a.d.a();
            if (a5 != null) {
                a5.a(fVar);
            }
        }
        PlatformActionListener platformActionListener = this.f965a;
        if (platformActionListener != null) {
            try {
                platformActionListener.onComplete(platform, i4, hashMap);
                this.f965a = null;
                this.f967c = 0;
            } catch (Throwable th4) {
                SSDKLog.b().a(th4);
            }
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i4) {
        PlatformActionListener platformActionListener = this.f965a;
        if (platformActionListener != null) {
            platformActionListener.onCancel(platform, i4);
            this.f965a = null;
            this.f967c = 0;
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
        if (platform instanceof CustomPlatform) {
            PlatformActionListener platformActionListener = this.f965a;
            if (platformActionListener != null) {
                platformActionListener.onComplete(platform, i4, hashMap);
                this.f965a = null;
                this.f967c = 0;
            }
        } else if (i4 == 1) {
            a(platform, i4, hashMap);
        } else if (i4 != 9) {
            PlatformActionListener platformActionListener2 = this.f965a;
            if (platformActionListener2 != null) {
                platformActionListener2.onComplete(platform, i4, hashMap);
                if (Wechat.NAME.equals(platform.getName())) {
                    return;
                }
                int i5 = this.f967c;
                if (i5 == 0 || i5 == i4) {
                    this.f965a = null;
                    this.f967c = 0;
                }
            }
        } else {
            b(platform, i4, hashMap);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i4, Throwable th) {
        PlatformActionListener platformActionListener = this.f965a;
        if (platformActionListener != null) {
            platformActionListener.onError(platform, i4, th);
            this.f965a = null;
            this.f967c = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PlatformActionListener platformActionListener) {
        this.f965a = platformActionListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlatformActionListener a() {
        return this.f965a;
    }

    public void a(Platform platform, Platform.ShareParams shareParams) {
        this.f966b.put(platform, shareParams);
    }

    private void a(Platform platform, final int i4, final HashMap<String, Object> hashMap) {
        final PlatformActionListener platformActionListener = this.f965a;
        this.f965a = new PlatformActionListener() { // from class: cn.sharesdk.framework.d.1
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform2, int i5) {
                d.this.f965a = platformActionListener;
                if (d.this.f965a != null) {
                    d.this.f965a.onComplete(platform2, i4, hashMap);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform2, int i5, HashMap<String, Object> hashMap2) {
                d.this.f965a = platformActionListener;
                if (d.this.f965a != null) {
                    d.this.f965a.onComplete(platform2, i4, hashMap);
                }
                cn.sharesdk.framework.a.b.b bVar = new cn.sharesdk.framework.a.b.b();
                bVar.f873a = platform2.getPlatformId();
                bVar.f874b = "TencentWeibo".equals(platform2.getName()) ? platform2.getDb().get("name") : platform2.getDb().getUserId();
                bVar.f875c = new Hashon().fromHashMap(hashMap2);
                bVar.f876d = d.this.a(platform2);
                cn.sharesdk.framework.a.d a5 = cn.sharesdk.framework.a.d.a();
                if (a5 != null) {
                    a5.a(bVar);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform2, int i5, Throwable th) {
                SSDKLog.b().b(th);
                d.this.f965a = platformActionListener;
                if (d.this.f965a != null) {
                    d.this.f965a.onComplete(platform2, i4, hashMap);
                }
            }
        };
        platform.showUser(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Platform platform, final int i4, final Object obj) {
        this.f967c = i4;
        final PlatformActionListener platformActionListener = this.f965a;
        this.f965a = new PlatformActionListener() { // from class: cn.sharesdk.framework.d.2
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform2, int i5) {
                d.this.f965a = platformActionListener;
                if (d.this.f965a != null) {
                    d.this.f965a.onCancel(platform2, i4);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform2, int i5, HashMap<String, Object> hashMap) {
                d.this.f965a = platformActionListener;
                platform2.afterRegister(i4, obj);
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform2, int i5, Throwable th) {
                d.this.f965a = platformActionListener;
                if (d.this.f965a != null) {
                    d.this.f965a.onError(platform2, i5, th);
                }
            }
        };
        platform.doAuthorize(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(Platform platform) {
        try {
            try {
                return a(platform.getDb(), new String[]{"nickname", "icon", "gender", "snsUserUrl", "resume", "secretType", "secret", "birthday", "followerCount", "favouriteCount", "shareCount", "snsregat", "snsUserLevel", "educationJSONArrayStr", "workJSONArrayStr"});
            } catch (Throwable th) {
                th = th;
                SSDKLog.b().b(th);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String a(PlatformDb platformDb, String[] strArr) throws Throwable {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i4 = 0;
        for (String str : strArr) {
            if (i4 > 0) {
                sb2.append('|');
                sb.append('|');
            }
            i4++;
            String str2 = platformDb.get(str);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
                sb2.append(Data.urlEncode(str2, "utf-8"));
            }
        }
        SSDKLog.b().b("======UserData: " + sb.toString());
        return sb2.toString();
    }

    private String b(Platform platform) {
        Platform platform2;
        PlatformDb db = platform.getDb();
        if ((WechatMoments.NAME.equals(platform.getName()) || "WechatFavorite".equals(platform.getName())) && TextUtils.isEmpty(db.getUserGender())) {
            try {
                platform2 = ShareSDK.getPlatform(Wechat.NAME);
            } catch (Throwable th) {
                SSDKLog.b().a(th, "InnerPlatformActionListener getUserDataBrief catch ", new Object[0]);
                platform2 = null;
            }
            if (platform2 != null) {
                db = platform2.getDb();
            }
        }
        try {
            return a(db, new String[]{"gender", "birthday", "secretType", "educationJSONArrayStr", "workJSONArrayStr"});
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
            return null;
        }
    }
}
