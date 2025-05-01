package com.join.mgps.Util;

import android.content.Context;
import android.content.Intent;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.PayGameCheckResult;
import com.join.mgps.dto.PayGameDataRequest;
/* compiled from: PayGameUtils.java */
/* loaded from: classes3.dex */
public class m1 {

    /* renamed from: a  reason: collision with root package name */
    static m1 f27932a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PayGameUtils.java */
    /* loaded from: classes3.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f27935d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f27936e;

        /* compiled from: PayGameUtils.java */
        /* renamed from: com.join.mgps.Util.m1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0325a implements com.join.android.app.common.http.b {
            C0325a() {
            }

            @Override // com.join.android.app.common.http.b
            public void a(Object obj) {
                v0.d("xxxxx", "checkPayGamePay::onFailed" + obj);
                a.this.f27935d.d(-1);
                a aVar = a.this;
                aVar.f27936e.a(aVar.f27935d);
            }

            @Override // com.join.android.app.common.http.b
            public void onSuccess(Object obj) {
                v0.d("xxxxx", "checkPayGamePay::onSuccess" + obj);
                CommentResponse commentResponse = (CommentResponse) obj;
                if (commentResponse != null) {
                    if (commentResponse.getCode() == 0) {
                        PayGameCheckResult payGameCheckResult = (PayGameCheckResult) commentResponse.getData_info();
                        if (payGameCheckResult != null) {
                            if (payGameCheckResult.isState()) {
                                a.this.f27935d.d(1);
                                a.this.f27935d.f(payGameCheckResult.getExpireTime());
                                if (a.this.f27935d.c() == 0) {
                                    a aVar = a.this;
                                    aVar.f27935d.f(m1.this.d());
                                }
                                a.this.f27935d.e(payGameCheckResult.getAppGameId());
                            } else {
                                a.this.f27935d.d(2);
                                a.this.f27935d.e(payGameCheckResult.getAppGameId());
                            }
                        } else {
                            a.this.f27935d.d(2);
                            a.this.f27935d.e(payGameCheckResult.getAppGameId());
                        }
                    } else if (commentResponse.getCode() == 100006) {
                        a.this.f27935d.d(3);
                    } else {
                        a.this.f27935d.d(-1);
                    }
                } else {
                    a.this.f27935d.d(-1);
                }
                v0.d("xxxxx", "checkPayGamePay::original result=" + a.this.f27935d);
                String json = JsonMapper.defaultAll().toJson(a.this.f27935d);
                v0.d("xxxxx", "rs=" + json);
                a aVar2 = a.this;
                aVar2.f27936e.a(aVar2.f27935d);
            }
        }

        a(Context context, String str, c cVar, b bVar) {
            this.f27933b = context;
            this.f27934c = str;
            this.f27935d = cVar;
            this.f27936e = bVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f27933b).getAccountData();
            int uid = accountData != null ? accountData.getUid() : 0;
            PayGameDataRequest payGameDataRequest = new PayGameDataRequest();
            payGameDataRequest.setToken(accountData.getToken());
            payGameDataRequest.setDevice_id(com.join.android.app.common.utils.n.n(this.f27933b).e(this.f27933b));
            payGameDataRequest.setUid(uid + "");
            payGameDataRequest.setApp_key(this.f27934c);
            com.join.mgps.rpc.n.b(payGameDataRequest, new C0325a());
        }
    }

    /* compiled from: PayGameUtils.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(c cVar);
    }

    /* compiled from: PayGameUtils.java */
    /* loaded from: classes3.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private int f27939a;

        /* renamed from: b  reason: collision with root package name */
        private String f27940b;

        /* renamed from: c  reason: collision with root package name */
        private long f27941c;

        public c() {
        }

        public int a() {
            return this.f27939a;
        }

        public String b() {
            return this.f27940b;
        }

        public long c() {
            return this.f27941c;
        }

        public void d(int i4) {
            this.f27939a = i4;
        }

        public void e(String str) {
            this.f27940b = str;
        }

        public void f(long j4) {
            this.f27941c = j4;
        }

        public String toString() {
            return "{\"code\":" + this.f27939a + ",\"gid\":\"" + this.f27940b + "\",\"time\":" + this.f27941c + "}";
        }
    }

    private m1() {
    }

    public static m1 c() {
        if (f27932a == null) {
            f27932a = new m1();
        }
        return f27932a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long d() {
        return System.currentTimeMillis() + 86400000;
    }

    public void b(Context context, String str, b bVar) {
        v0.d("xxxxx", "method checkPayGameResult() called.appkey=" + str);
        c cVar = new c();
        try {
            new a(context, str, cVar, bVar).start();
        } catch (Exception e5) {
            v0.d("xxxxx", "checkPayGamePay::Exception" + e5.getLocalizedMessage());
            e5.printStackTrace();
            bVar.a(cVar);
        }
    }

    public void e(Context context, String str, String str2) {
        Intent intent = new Intent("com.join.android.wufun.sdk.wfsg.broadcast." + str);
        c cVar = new c();
        cVar.d(1);
        cVar.f(d());
        cVar.e(str2);
        intent.putExtra("result", JsonMapper.defaultAll().toJson(cVar));
        context.sendBroadcast(intent);
    }
}
