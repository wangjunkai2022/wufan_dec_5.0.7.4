package com.aggmoread.sdk.z.a.m;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.aggmoread.sdk.z.a.g.b;
import com.aggmoread.sdk.z.a.r.g;
import com.aggmoread.sdk.z.a.t.b;
import java.util.List;
/* loaded from: classes2.dex */
public class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.g.c f2329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.g.b f2330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b.a.C0056a f2331c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f2332d;

        a(com.aggmoread.sdk.z.a.g.c cVar, com.aggmoread.sdk.z.a.g.b bVar, b.a.C0056a c0056a, c cVar2) {
            this.f2329a = cVar;
            this.f2330b = bVar;
            this.f2331c = c0056a;
            this.f2332d = cVar2;
        }

        @Override // com.aggmoread.sdk.z.a.r.g.c
        public void a(g.b bVar) {
            if (bVar.a()) {
                com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "ClickUrlRequestJuHeApi onResult enter, empty");
                return;
            }
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "ClickUrlRequestJuHeApi onResult enter, clickUrlResponse = " + bVar);
            com.aggmoread.sdk.z.a.g.c cVar = this.f2329a;
            cVar.f2092i = bVar.f2452a;
            l.b(bVar.f2453b, this.f2330b, this.f2331c, cVar);
            c cVar2 = this.f2332d;
            if (cVar2 != null) {
                cVar2.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b extends com.aggmoread.sdk.z.a.j.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.a.C0056a f2333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.g.c f2334c;

        b(b.a.C0056a c0056a, com.aggmoread.sdk.z.a.g.c cVar) {
            this.f2333b = c0056a;
            this.f2334c = cVar;
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a() {
            super.a();
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "apkIsDownLoading  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a(long j4) {
            super.a(j4);
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "onApkInstalled  ");
            com.aggmoread.sdk.z.a.q.a.a("onApkInstalled", this.f2333b.d(), this.f2334c);
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a(long j4, int i4, String str) {
            super.a(j4, i4, str);
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "onApkInstalledError  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b() {
            super.b();
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "onStartDownload  ");
            com.aggmoread.sdk.z.a.q.a.a("onStartDownload", this.f2333b.f2071l, this.f2334c);
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b(long j4) {
            super.b(j4);
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "onDownloadSuccess  ");
            com.aggmoread.sdk.z.a.q.a.a("onDownloadCompleted", this.f2333b.b(), this.f2334c);
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b(long j4, int i4, String str) {
            super.b(j4, i4, str);
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "onDownloadFail  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void c(long j4) {
            super.c(j4);
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "onStartApkInstaller  ");
            com.aggmoread.sdk.z.a.q.a.a("onStartApkInstaller", this.f2333b.c(), this.f2334c);
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public static void a(com.aggmoread.sdk.z.a.g.b bVar, b.a.C0056a c0056a, com.aggmoread.sdk.z.a.g.c cVar, com.aggmoread.sdk.z.a.i.b bVar2) {
        a(bVar, c0056a, cVar, bVar2, null, null);
    }

    private static void a(com.aggmoread.sdk.z.a.g.b bVar, b.a.C0056a c0056a, com.aggmoread.sdk.z.a.g.c cVar, com.aggmoread.sdk.z.a.i.b bVar2, b.a aVar) {
        String str = c0056a.f2061b;
        if (TextUtils.isEmpty(str)) {
            com.aggmoread.sdk.z.a.r.b.a(bVar2, new com.aggmoread.sdk.z.a.g.e(50008, "跳转地址异常"));
            return;
        }
        com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "startWebActivity = " + str);
        String a5 = com.aggmoread.sdk.z.a.q.a.a(str, cVar);
        com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "startWebActivity final = " + a5);
        Context j4 = bVar.d().j();
        String str2 = c0056a.f2062c;
        if (aVar == null) {
            aVar = b.a.f2569a;
        }
        com.aggmoread.sdk.z.a.t.b.a(j4, str2, a5, aVar);
    }

    public static void a(com.aggmoread.sdk.z.a.g.b bVar, b.a.C0056a c0056a, com.aggmoread.sdk.z.a.g.c cVar, com.aggmoread.sdk.z.a.i.b bVar2, b.a aVar, c cVar2) {
        Intent a5;
        List<String> a6;
        String str;
        com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "metaGroupBean.deeplink = " + c0056a.f2063d);
        String str2 = c0056a.f2063d;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent = new Intent();
                intent.setData(Uri.parse(c0056a.f2063d));
                intent.addFlags(268435456);
                if (bVar.d().e() != null) {
                    bVar.d().e().startActivity(intent);
                } else {
                    bVar.d().j().startActivity(intent);
                }
                com.aggmoread.sdk.z.a.q.a.a("onStartAppSuccess", c0056a.a(3), cVar);
                com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "onStartAppSuccess");
                if (cVar2 != null) {
                    cVar2.b();
                    return;
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                com.aggmoread.sdk.z.a.d.a("JHAPIHTAG", "e %s", e5);
                if (e5 instanceof ActivityNotFoundException) {
                    a6 = c0056a.a(0);
                    str = "onAppNotExist";
                } else {
                    a6 = c0056a.a(2);
                    str = "onStartAppFailed";
                }
                com.aggmoread.sdk.z.a.q.a.a(str, a6, cVar);
                com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", str);
            }
        }
        if (!c0056a.r()) {
            try {
                a(bVar, c0056a, cVar, bVar2, aVar);
                if (cVar2 != null) {
                    cVar2.d();
                    return;
                }
                return;
            } catch (com.aggmoread.sdk.z.a.t.e e6) {
                e6.printStackTrace();
                return;
            }
        }
        Context applicationContext = bVar.d().j().getApplicationContext();
        String m4 = c0056a.m();
        if (d.c(applicationContext, m4) && (a5 = d.a(applicationContext, m4)) != null) {
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "intent = " + a5);
            a5.addFlags(268435456);
            applicationContext.startActivity(a5);
            if (cVar2 != null) {
                cVar2.e();
            }
        } else if (c0056a.h() != 2) {
            b(c0056a.i(), bVar, c0056a, cVar);
            if (cVar2 != null) {
                cVar2.c();
            }
        } else {
            String a7 = com.aggmoread.sdk.z.a.q.a.a(c0056a.e(), cVar);
            com.aggmoread.sdk.z.a.d.c("JHAPIHTAG", "rClickUrl = " + a7);
            com.aggmoread.sdk.z.a.r.g.a(a7, new a(cVar, bVar, c0056a, cVar2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, com.aggmoread.sdk.z.a.g.b bVar, b.a.C0056a c0056a, com.aggmoread.sdk.z.a.g.c cVar) {
        try {
            new com.aggmoread.sdk.z.a.j.b(bVar.d().j().getApplicationContext(), bVar.d().i(), new b(c0056a, cVar)).a(str, c0056a.f2060a, c0056a.f2062c);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
