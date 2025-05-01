package com.aggmoread.sdk.z.c.a.a.d.a.d.p.e;

import android.content.Context;
import com.aggmoread.sdk.z.c.a.a.d.a.d.k;
import com.aggmoread.sdk.z.c.a.a.d.a.d.p.c;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.baidu.mobads.sdk.api.BaiduNativeManager;
import com.baidu.mobads.sdk.api.NativeResponse;
import com.baidu.mobads.sdk.api.RequestParameters;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class e extends k implements c.i {

    /* renamed from: k  reason: collision with root package name */
    private static String f2985k = "AMUTAGBD";

    /* renamed from: j  reason: collision with root package name */
    public BaiduNativeManager f2986j;

    public e(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.i
    public void a(int i4, String str, NativeResponse nativeResponse) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f2985k, "onAdError %d, %s", Integer.valueOf(i4), str);
        b(new i(i4, str));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.k
    protected void a(Object obj, int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(obj, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.i
    public void a(List<NativeResponse> list) {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2985k, "ad loaded");
        boolean a5 = this.f3244c.a("com.sdk.key.ESP", 16);
        List<com.aggmoread.sdk.z.c.a.a.c.o.e> arrayList = new ArrayList<>();
        if (list != null && list.size() > 0) {
            int i4 = -1;
            for (NativeResponse nativeResponse : list) {
                i4 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(nativeResponse);
                if (q() && com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3245d, i4)) {
                    a(nativeResponse, 0);
                } else {
                    b(nativeResponse, i4);
                    arrayList.add(a5 ? new a(nativeResponse, this.f2986j, this.f3244c, this.f3245d, this.f3243b) : new d(nativeResponse, this.f2986j, this.f3244c, this.f3245d, this.f3243b));
                }
            }
            if (q() && arrayList.size() == 0) {
                a(i4, 0);
                return;
            }
        }
        e(arrayList);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.i
    public void b(int i4, String str, NativeResponse nativeResponse) {
        com.aggmoread.sdk.z.c.a.a.e.e.a(f2985k, "onNoAd %d, %s", Integer.valueOf(i4), str);
        b(new i(i4, str));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.i
    public void c() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2985k, "onLpClosed");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.k
    protected void c(Object obj, int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(obj, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        String a5 = this.f3245d.f3309c.a(e.c.X, "");
        Context a6 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3244c, this.f3245d, this.f3248g);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a6, a5);
        BaiduNativeManager baiduNativeManager = new BaiduNativeManager(a6, this.f3245d.f3309c.a(e.c.T, ""));
        this.f2986j = baiduNativeManager;
        baiduNativeManager.setAppSid(a5);
        int i4 = this.f3244c.f3269m;
        RequestParameters.Builder builder = new RequestParameters.Builder();
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2985k, "load ad");
        new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f3244c, this.f3245d).a(0).b();
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(builder, this.f3244c, this.f3245d);
        this.f2986j.loadFeedAd(builder.build(), com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.a().a(this));
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.i
    public void onVideoDownloadFailed() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2985k, "onVideoDownloadFailed");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.i
    public void onVideoDownloadSuccess() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2985k, "onVideoDownloadSuccess");
    }
}
