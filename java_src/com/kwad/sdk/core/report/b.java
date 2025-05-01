package com.kwad.sdk.core.report;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.report.e;
import com.kwad.sdk.core.response.model.BaseResultData;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.service.ServiceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public abstract class b<T extends e, R extends com.kwad.sdk.core.network.f> {
    private static ExecutorService ayA;
    private static volatile Handler fS;
    private T ayD;
    private Context mContext;
    private volatile long TN = 120000;
    protected l ayz = new m();
    private AtomicInteger ayB = new AtomicInteger(0);
    private AtomicInteger mRetryCount = new AtomicInteger(0);
    private int ayC = 5;

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        if (ayA == null) {
            ayA = GlobalThreadPools.Gp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fm() {
        int andIncrement = this.mRetryCount.getAndIncrement();
        if (andIncrement <= this.ayC) {
            if (andIncrement > 0) {
                this.TN *= 2;
            }
            ax(this.TN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ax(long j4) {
        if (fS == null) {
            return;
        }
        fS.removeMessages(16843025);
        Message obtain = Message.obtain(fS, a(this.mContext, this.ayz, this.ayB));
        obtain.what = 16843025;
        fS.sendMessageDelayed(obtain, j4);
    }

    protected final boolean Fk() {
        int i4 = this.mRetryCount.get();
        if (i4 > 16) {
            i4 = 16;
        }
        s sVar = (s) ServiceProvider.get(s.class);
        return this.ayz.size() >= (sVar != null ? (long) (sVar.yS() << i4) : 20L);
    }

    public final void Fl() {
        ax(0L);
    }

    protected final void aw(long j4) {
        if (j4 < 60) {
            this.TN = 60000L;
        } else {
            this.TN = j4 * 1000;
        }
    }

    public synchronized void j(Context context, int i4) {
        this.mContext = context;
        if (fS == null) {
            fS = com.kwad.sdk.core.threads.a.Gj();
        }
    }

    protected abstract R w(List<T> list);

    private void c(@NonNull final k<T> kVar) {
        new com.kwad.sdk.core.network.l<R, BatchReportResult>() { // from class: com.kwad.sdk.core.report.b.4
            @NonNull
            private static BatchReportResult ex(String str) {
                JSONObject jSONObject = new JSONObject(str);
                BatchReportResult batchReportResult = new BatchReportResult();
                batchReportResult.parseJson(jSONObject);
                return batchReportResult;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.kwad.sdk.core.network.a
            @NonNull
            public final R createRequest() {
                e Fp = kVar.Fp();
                b.this.ayD = Fp;
                return (R) b.this.a((b) Fp);
            }

            @Override // com.kwad.sdk.core.network.l
            public final boolean enableMonitorReport() {
                return false;
            }

            @Override // com.kwad.sdk.core.network.a
            public final ExecutorService getExecutor() {
                return b.ayA;
            }

            @Override // com.kwad.sdk.core.network.l
            @NonNull
            public final /* synthetic */ BatchReportResult parseData(String str) {
                return ex(str);
            }
        }.request(new com.kwad.sdk.core.network.o<R, BatchReportResult>() { // from class: com.kwad.sdk.core.report.b.5
            private void a(@NonNull BatchReportResult batchReportResult) {
                com.kwad.sdk.core.e.c.d("BaseBatchReporter", "立即上报 onSuccess action= " + b.this.ayD + " result " + batchReportResult.getResult());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            public final void onError(@NonNull R r4, int i4, String str) {
                com.kwad.sdk.core.e.c.e("BaseBatchReporter", "立即上报 onError errorCode:" + i4 + " errorMsg:" + str + "\naction=" + b.this.ayD);
                b.this.a((k) new k<T>() { // from class: com.kwad.sdk.core.report.b.5.1
                    @Override // com.kwad.sdk.core.report.k
                    @NonNull
                    public final T Fp() {
                        return (T) b.this.ayD;
                    }
                });
            }

            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            public final /* synthetic */ void onSuccess(@NonNull com.kwad.sdk.core.network.f fVar, @NonNull BaseResultData baseResultData) {
                a((BatchReportResult) baseResultData);
            }
        });
    }

    public final void b(@NonNull k<T> kVar) {
        try {
            c(kVar);
        } catch (Throwable th) {
            ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).gatherException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(l lVar) {
        this.ayz = lVar;
    }

    public final void a(@NonNull final k<T> kVar) {
        ayA.execute(new Runnable() { // from class: com.kwad.sdk.core.report.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (b.fS != null && !b.fS.hasMessages(16843025)) {
                    b bVar = b.this;
                    bVar.ax(bVar.TN);
                }
                e Fp = kVar.Fp();
                if (Fp != null) {
                    b.this.ayz.j(Fp);
                }
                if (b.this.Fk()) {
                    b.this.Fl();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Runnable a(Context context, l<T> lVar, AtomicInteger atomicInteger) {
        return new u(context, lVar, this, atomicInteger);
    }

    public final void a(final List<T> list, final AtomicBoolean atomicBoolean) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.ayB.getAndIncrement();
        new com.kwad.sdk.core.network.l<R, BatchReportResult>() { // from class: com.kwad.sdk.core.report.b.2
            @NonNull
            private static BatchReportResult ex(String str) {
                JSONObject jSONObject = new JSONObject(str);
                BatchReportResult batchReportResult = new BatchReportResult();
                batchReportResult.parseJson(jSONObject);
                return batchReportResult;
            }

            @Override // com.kwad.sdk.core.network.a
            @NonNull
            public final R createRequest() {
                return (R) b.this.w(list);
            }

            @Override // com.kwad.sdk.core.network.l
            public final boolean enableMonitorReport() {
                return false;
            }

            @Override // com.kwad.sdk.core.network.a
            public final ExecutorService getExecutor() {
                return b.ayA;
            }

            @Override // com.kwad.sdk.core.network.l
            @NonNull
            public final /* synthetic */ BatchReportResult parseData(String str) {
                return ex(str);
            }
        }.request(new com.kwad.sdk.core.network.o<R, BatchReportResult>() { // from class: com.kwad.sdk.core.report.b.3
            private void a(@NonNull BatchReportResult batchReportResult) {
                b.this.ayz.x(list);
                if (b.this.ayB.decrementAndGet() == 0 && atomicBoolean.get()) {
                    b.this.Fm();
                }
                b.this.aw(batchReportResult.getInterval());
                b bVar = b.this;
                bVar.ax(bVar.TN);
            }

            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            public final void onError(@NonNull R r4, int i4, String str) {
                atomicBoolean.set(true);
                if (b.this.ayB.decrementAndGet() == 0) {
                    b.this.Fm();
                }
            }

            @Override // com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
            public final /* synthetic */ void onSuccess(@NonNull com.kwad.sdk.core.network.f fVar, @NonNull BaseResultData baseResultData) {
                a((BatchReportResult) baseResultData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public R a(T t4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(t4);
        return w(arrayList);
    }
}
