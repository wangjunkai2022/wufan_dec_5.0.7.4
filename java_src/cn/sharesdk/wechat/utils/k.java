package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import com.mob.tools.utils.Hashon;
import java.util.HashMap;
/* compiled from: WechatHandler.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private Platform f1345a;

    /* renamed from: b  reason: collision with root package name */
    private Platform.ShareParams f1346b;

    /* renamed from: c  reason: collision with root package name */
    private PlatformActionListener f1347c;

    /* renamed from: d  reason: collision with root package name */
    private AuthorizeListener f1348d;

    /* renamed from: e  reason: collision with root package name */
    private h f1349e;

    public k(Platform platform) {
        this.f1345a = platform;
    }

    public void a(AuthorizeListener authorizeListener) {
        this.f1348d = authorizeListener;
    }

    public Platform b() {
        return this.f1345a;
    }

    public PlatformActionListener c() {
        return this.f1347c;
    }

    public void a(Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        this.f1346b = shareParams;
        this.f1347c = platformActionListener;
    }

    public void a(h hVar) {
        this.f1349e = hVar;
    }

    public void a(WechatResp wechatResp) {
        AuthorizeListener authorizeListener;
        PlatformActionListener platformActionListener;
        PlatformActionListener platformActionListener2;
        int i4 = wechatResp.f1302g;
        if (i4 == -4) {
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(wechatResp.f1302g));
            hashMap.put("errStr", wechatResp.f1303h);
            hashMap.put("transaction", wechatResp.f1304i);
            Throwable th = new Throwable(new Hashon().fromHashMap(hashMap));
            if (wechatResp.a() == 1 && (authorizeListener = this.f1348d) != null) {
                authorizeListener.onError(th);
            }
        } else if (i4 == -3) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", Integer.valueOf(wechatResp.f1302g));
            hashMap2.put("errStr", wechatResp.f1303h);
            hashMap2.put("transaction", wechatResp.f1304i);
            Throwable th2 = new Throwable(new Hashon().fromHashMap(hashMap2));
            int a5 = wechatResp.a();
            if (a5 != 1) {
                if (a5 == 2 && (platformActionListener = this.f1347c) != null) {
                    platformActionListener.onError(this.f1345a, 9, th2);
                    return;
                }
                return;
            }
            AuthorizeListener authorizeListener2 = this.f1348d;
            if (authorizeListener2 != null) {
                authorizeListener2.onError(th2);
            }
        } else if (i4 == -2) {
            int a6 = wechatResp.a();
            if (a6 != 1) {
                if (a6 == 2 && (platformActionListener2 = this.f1347c) != null) {
                    platformActionListener2.onCancel(this.f1345a, 9);
                    return;
                }
                return;
            }
            AuthorizeListener authorizeListener3 = this.f1348d;
            if (authorizeListener3 != null) {
                authorizeListener3.onCancel();
            }
        } else if (i4 != 0) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("req", wechatResp.getClass().getSimpleName());
            hashMap3.put("errCode", Integer.valueOf(wechatResp.f1302g));
            hashMap3.put("errStr", wechatResp.f1303h);
            hashMap3.put("transaction", wechatResp.f1304i);
            Throwable th3 = new Throwable(new Hashon().fromHashMap(hashMap3));
            PlatformActionListener platformActionListener3 = this.f1347c;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this.f1345a, 9, th3);
            }
            AuthorizeListener authorizeListener4 = this.f1348d;
            if (authorizeListener4 != null) {
                authorizeListener4.onError(th3);
            }
        } else {
            int a7 = wechatResp.a();
            if (a7 != 1) {
                if (a7 == 2 && this.f1347c != null) {
                    HashMap<String, Object> hashMap4 = new HashMap<>();
                    hashMap4.put("ShareParams", this.f1346b);
                    this.f1347c.onComplete(this.f1345a, 9, hashMap4);
                }
            } else if (this.f1348d != null) {
                Bundle bundle = new Bundle();
                wechatResp.b(bundle);
                this.f1349e.a(bundle, this.f1348d);
            }
        }
    }

    public Platform.ShareParams a() {
        return this.f1346b;
    }
}
