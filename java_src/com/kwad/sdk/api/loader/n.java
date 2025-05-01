package com.kwad.sdk.api.loader;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.kwad.sdk.api.loader.a;
import com.kwad.sdk.api.loader.g;
import java.io.File;
import java.util.Objects;
/* loaded from: classes5.dex */
final class n {

    /* loaded from: classes5.dex */
    static abstract class a<T> implements c<T> {
        c<T> aod;

        a(c<T> cVar) {
            this.aod = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements f<a.C0507a> {
        b() {
        }

        @Override // com.kwad.sdk.api.loader.n.f
        public final void a(final v vVar, final c<a.C0507a> cVar) {
            try {
                new com.kwad.sdk.api.loader.g(vVar).a(new g.a() { // from class: com.kwad.sdk.api.loader.n.b.1
                    @Override // com.kwad.sdk.api.loader.g.a
                    @WorkerThread
                    public final void a(a.b bVar) {
                        Objects.toString(bVar);
                        if (bVar.AK()) {
                            cVar.i(bVar.anc);
                        } else {
                            new RuntimeException("UpdateData is illegal");
                        }
                        try {
                            com.kwad.sdk.api.loader.e.aL(vVar.getContext()).cancel();
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface c<T> {
        void i(T t4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class d implements f<a.C0507a> {
        f<a.C0507a> aoh;

        d(f<a.C0507a> fVar) {
            this.aoh = fVar;
        }

        @Override // com.kwad.sdk.api.loader.n.f
        public final void a(final v vVar, final c<a.C0507a> cVar) {
            this.aoh.a(vVar, new a<a.C0507a>(cVar) { // from class: com.kwad.sdk.api.loader.n.d.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.api.loader.n.c
                @WorkerThread
                /* renamed from: c */
                public void i(@NonNull a.C0507a c0507a) {
                    long currentTimeMillis = System.currentTimeMillis();
                    File file = null;
                    try {
                        k.a(c0507a);
                        file = i.r(vVar.getContext(), c0507a.sdkVersion);
                        j.c(c0507a.amZ, file);
                        k.a(c0507a, System.currentTimeMillis() - currentTimeMillis);
                        c0507a.ana = file;
                        cVar.i(c0507a);
                    } catch (Throwable th) {
                        k.a(c0507a, System.currentTimeMillis() - currentTimeMillis, Log.getStackTraceString(th));
                        i.j(file);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class e implements f<Boolean> {
        f<a.C0507a> aoh;

        e(f<a.C0507a> fVar) {
            this.aoh = fVar;
        }

        @Override // com.kwad.sdk.api.loader.n.f
        public final void a(final v vVar, final c<Boolean> cVar) {
            this.aoh.a(vVar, new c<a.C0507a>() { // from class: com.kwad.sdk.api.loader.n.e.1
                private void a(a.C0507a c0507a, int i4, Throwable th) {
                    i.j(c0507a.ana);
                    k.b(c0507a, i4, Log.getStackTraceString(th));
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.api.loader.n.c
                /* renamed from: c */
                public void i(@NonNull a.C0507a c0507a) {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        k.b(c0507a);
                        if (!com.kwad.sdk.api.loader.c.a(vVar.getContext(), AnonymousClass1.class.getClassLoader(), c0507a.ana.getPath(), c0507a.sdkVersion)) {
                            a(c0507a, 1, new RuntimeException("Apk pre install fail"));
                            return;
                        }
                        com.kwad.sdk.api.loader.h.p(vVar.getContext(), c0507a.sdkVersion);
                        i.j(c0507a.ana);
                        k.b(c0507a, System.currentTimeMillis() - currentTimeMillis);
                        cVar.i(Boolean.TRUE);
                    } catch (Throwable th) {
                        a(c0507a, 2, th);
                    }
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public interface f<T> {
        void a(v vVar, c<T> cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class g implements f<a.C0507a> {
        f<a.C0507a> aoh;

        g(f<a.C0507a> fVar) {
            this.aoh = fVar;
        }

        @Override // com.kwad.sdk.api.loader.n.f
        public final void a(v vVar, final c<a.C0507a> cVar) {
            this.aoh.a(vVar, new a<a.C0507a>(cVar) { // from class: com.kwad.sdk.api.loader.n.g.1
                private void a(a.C0507a c0507a, int i4, Throwable th) {
                    i.j(c0507a.ana);
                    k.a(c0507a, i4, th.getMessage());
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.api.loader.n.c
                /* renamed from: c */
                public void i(@NonNull a.C0507a c0507a) {
                    try {
                        File file = c0507a.ana;
                        if (!s.k(file)) {
                            a(c0507a, 1, new RuntimeException("Security checkFileValid fail"));
                        } else if (!s.a(file, c0507a.md5)) {
                            a(c0507a, 2, new RuntimeException("Security checkMd5 fail"));
                        } else {
                            cVar.i(c0507a);
                        }
                    } catch (Throwable th) {
                        a(c0507a, 3, th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class h implements f<a.C0507a> {
        f<a.C0507a> aoh;

        h(f<a.C0507a> fVar) {
            this.aoh = fVar;
        }

        @Override // com.kwad.sdk.api.loader.n.f
        public final void a(final v vVar, final c<a.C0507a> cVar) {
            this.aoh.a(vVar, new c<a.C0507a>() { // from class: com.kwad.sdk.api.loader.n.h.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.api.loader.n.c
                /* renamed from: c */
                public void i(a.C0507a c0507a) {
                    String aM = com.kwad.sdk.api.loader.h.aM(vVar.getContext());
                    if (TextUtils.isEmpty(aM)) {
                        aM = com.kwad.sdk.api.c.AD().getSDKVersion();
                    }
                    String str = c0507a.sdkVersion;
                    com.kwad.sdk.api.loader.b.a(vVar.getContext(), "interval", c0507a.interval);
                    com.kwad.sdk.api.loader.b.a(vVar.getContext(), "lastUpdateTime", System.currentTimeMillis());
                    if (c0507a.AJ()) {
                        u.aS(vVar.getContext());
                        new RuntimeException("DynamicType == -1, curVersion: " + aM);
                    } else if (com.kwad.sdk.api.loader.h.K(c0507a.sdkVersion, aM) && c0507a.AI()) {
                        cVar.i(c0507a);
                    } else {
                        new RuntimeException("No new sdkVersion. remote sdkVersion:" + c0507a.sdkVersion + " currentDynamicVersion:" + aM + " dynamicType:" + c0507a.amY);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f<Boolean> AS() {
        return new e(new g(new d(new h(new b()))));
    }
}
