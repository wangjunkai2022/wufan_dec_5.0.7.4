package com.aggmoread.sdk.z.c.a.a.d.a.d.p.e;

import android.content.Context;
import com.aggmoread.sdk.z.c.a.a.d.a.d.h;
import com.aggmoread.sdk.z.c.a.a.d.a.d.p.c;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.baidu.mobads.sdk.api.BaiduNativeManager;
import com.baidu.mobads.sdk.api.ExpressResponse;
import com.baidu.mobads.sdk.api.RequestParameters;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class b extends h {

    /* renamed from: l  reason: collision with root package name */
    private static String f2959l = "AMEPTAGBD";

    /* renamed from: j  reason: collision with root package name */
    public BaiduNativeManager f2960j;

    /* renamed from: k  reason: collision with root package name */
    private BaiduNativeManager.ExpressAdListener f2961k;

    /* loaded from: classes2.dex */
    class a implements c.h {
        a() {
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.h
        public void a(int i4, String str, ExpressResponse expressResponse) {
            com.aggmoread.sdk.z.c.a.a.e.e.a(b.f2959l, "onAdError %d, %s", Integer.valueOf(i4), str);
            b.this.b(new i(i4, str));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.h
        public void a(List<ExpressResponse> list) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(b.f2959l, "ad loaded");
            ArrayList arrayList = new ArrayList();
            if (list != null && list.size() > 0) {
                int i4 = -1;
                for (ExpressResponse expressResponse : list) {
                    int a5 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a((Object) expressResponse);
                    if (b.this.q() && com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(b.this.f3245d, a5)) {
                        b.this.a(expressResponse, 0);
                    } else {
                        b.this.b(expressResponse, a5);
                        b bVar = b.this;
                        arrayList.add(new c(expressResponse, bVar.f3244c, bVar.f3245d, bVar.f3243b));
                    }
                    i4 = a5;
                }
                if (b.this.q() && arrayList.size() == 0) {
                    b.this.a(i4, 0);
                    return;
                }
            }
            b.this.e(arrayList);
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.h
        public void b(int i4, String str, ExpressResponse expressResponse) {
            com.aggmoread.sdk.z.c.a.a.e.e.a(b.f2959l, "onAdError %d, %s", Integer.valueOf(i4), str);
            b.this.b(new i(i4, str));
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.h
        public void c() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(b.f2959l, "onLpClosed");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.h
        public void onVideoDownloadFailed() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(b.f2959l, "onVideoDownloadFailed");
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.h
        public void onVideoDownloadSuccess() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(b.f2959l, "onVideoDownloadSuccess");
        }
    }

    public b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        super(dVar, eVar);
        this.f2961k = com.aggmoread.sdk.z.c.a.a.d.a.d.p.c.a().a(new a());
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.h
    protected void a(Object obj, int i4, int i5) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(obj, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.h
    protected void c(Object obj, int i4) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(obj, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.b.a
    public void l() {
        String a5 = this.f3245d.f3309c.a(e.c.X, "");
        Context a6 = com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f3244c, this.f3245d, this.f3248g);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(a6, a5);
        BaiduNativeManager baiduNativeManager = new BaiduNativeManager(a6, this.f3245d.f3309c.a(e.c.T, ""));
        this.f2960j = baiduNativeManager;
        baiduNativeManager.setAppSid(a5);
        int i4 = this.f3244c.f3269m;
        com.aggmoread.sdk.z.c.a.a.e.e.b(f2959l, "load ad");
        new k(this.f3244c, this.f3245d).a(0).b();
        RequestParameters.Builder builder = new RequestParameters.Builder();
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(builder, this.f3244c, this.f3245d);
        this.f2960j.loadExpressAd(builder.build(), this.f2961k);
    }
}
