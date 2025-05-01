package v0;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* compiled from: RequestLoggingListener.java */
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: c  reason: collision with root package name */
    private static final String f73384c = "RequestLoggingListener";
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final Map<Pair<String, String>, Long> f73385a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f73386b = new HashMap();

    private static long l(@Nullable Long l4, long j4) {
        if (l4 != null) {
            return j4 - l4.longValue();
        }
        return -1L;
    }

    private static long m() {
        return SystemClock.uptimeMillis();
    }

    @Override // v0.c
    public synchronized void a(ImageRequest imageRequest, Object obj, String str, boolean z4) {
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.g0(f73384c, "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", Long.valueOf(m()), str, obj, Boolean.valueOf(z4));
            this.f73386b.put(str, Long.valueOf(m()));
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized void b(String str, String str2) {
        if (com.facebook.common.logging.a.R(2)) {
            Pair<String, String> create = Pair.create(str, str2);
            long m4 = m();
            this.f73385a.put(create, Long.valueOf(m4));
            com.facebook.common.logging.a.f0(f73384c, "time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(m4), str, str2);
        }
    }

    @Override // v0.c
    public synchronized void c(ImageRequest imageRequest, String str, boolean z4) {
        if (com.facebook.common.logging.a.R(2)) {
            long m4 = m();
            com.facebook.common.logging.a.f0(f73384c, "time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(m4), str, Long.valueOf(l(this.f73386b.remove(str), m4)));
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public boolean d(String str) {
        return com.facebook.common.logging.a.R(2);
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized void e(String str, String str2, @Nullable Map<String, String> map) {
        if (com.facebook.common.logging.a.R(2)) {
            Pair create = Pair.create(str, str2);
            long m4 = m();
            com.facebook.common.logging.a.i0(f73384c, "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(m4), str, str2, Long.valueOf(l(this.f73385a.remove(create), m4)), map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized void f(String str, String str2, Throwable th, @Nullable Map<String, String> map) {
        if (com.facebook.common.logging.a.R(5)) {
            Pair create = Pair.create(str, str2);
            long m4 = m();
            com.facebook.common.logging.a.r0(f73384c, th, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", Long.valueOf(m4), str, str2, Long.valueOf(l(this.f73385a.remove(create), m4)), map, th.toString());
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized void g(String str, String str2, @Nullable Map<String, String> map) {
        if (com.facebook.common.logging.a.R(2)) {
            Pair create = Pair.create(str, str2);
            long m4 = m();
            com.facebook.common.logging.a.i0(f73384c, "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(m4), str, str2, Long.valueOf(l(this.f73385a.remove(create), m4)), map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized void h(String str, String str2, boolean z4) {
        if (com.facebook.common.logging.a.R(2)) {
            Pair create = Pair.create(str, str2);
            long m4 = m();
            com.facebook.common.logging.a.i0(f73384c, "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(m4), str, str2, Long.valueOf(l(this.f73385a.remove(create), m4)), Boolean.valueOf(z4));
        }
    }

    @Override // v0.c
    public synchronized void i(ImageRequest imageRequest, String str, Throwable th, boolean z4) {
        if (com.facebook.common.logging.a.R(5)) {
            long m4 = m();
            com.facebook.common.logging.a.q0(f73384c, "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(m4), str, Long.valueOf(l(this.f73386b.remove(str), m4)), th.toString());
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized void j(String str, String str2, String str3) {
        if (com.facebook.common.logging.a.R(2)) {
            com.facebook.common.logging.a.i0(f73384c, "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(m()), str, str2, str3, Long.valueOf(l(this.f73385a.get(Pair.create(str, str2)), m())));
        }
    }

    @Override // v0.c
    public synchronized void k(String str) {
        if (com.facebook.common.logging.a.R(2)) {
            long m4 = m();
            com.facebook.common.logging.a.f0(f73384c, "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(m4), str, Long.valueOf(l(this.f73386b.remove(str), m4)));
        }
    }
}
