package retrofit2.adapter.rxjava2;

import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
/* compiled from: RxJava2CallAdapter.java */
/* loaded from: classes.dex */
final class f<R> implements CallAdapter<R, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Type f73219a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Scheduler f73220b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73221c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f73222d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f73223e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f73224f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f73225g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f73226h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f73227i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Type type, @Nullable Scheduler scheduler, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f73219a = type;
        this.f73220b = scheduler;
        this.f73221c = z4;
        this.f73222d = z5;
        this.f73223e = z6;
        this.f73224f = z7;
        this.f73225g = z8;
        this.f73226h = z9;
        this.f73227i = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object adapt(retrofit2.Call<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.f73221c
            if (r0 == 0) goto La
            retrofit2.adapter.rxjava2.b r0 = new retrofit2.adapter.rxjava2.b
            r0.<init>(r2)
            goto Lf
        La:
            retrofit2.adapter.rxjava2.c r0 = new retrofit2.adapter.rxjava2.c
            r0.<init>(r2)
        Lf:
            boolean r2 = r1.f73222d
            if (r2 == 0) goto L1a
            retrofit2.adapter.rxjava2.e r2 = new retrofit2.adapter.rxjava2.e
            r2.<init>(r0)
        L18:
            r0 = r2
            goto L24
        L1a:
            boolean r2 = r1.f73223e
            if (r2 == 0) goto L24
            retrofit2.adapter.rxjava2.a r2 = new retrofit2.adapter.rxjava2.a
            r2.<init>(r0)
            goto L18
        L24:
            io.reactivex.Scheduler r2 = r1.f73220b
            if (r2 == 0) goto L2c
            io.reactivex.Observable r0 = r0.subscribeOn(r2)
        L2c:
            boolean r2 = r1.f73224f
            if (r2 == 0) goto L37
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.Flowable r2 = r0.toFlowable(r2)
            return r2
        L37:
            boolean r2 = r1.f73225g
            if (r2 == 0) goto L40
            io.reactivex.Single r2 = r0.singleOrError()
            return r2
        L40:
            boolean r2 = r1.f73226h
            if (r2 == 0) goto L49
            io.reactivex.Maybe r2 = r0.singleElement()
            return r2
        L49:
            boolean r2 = r1.f73227i
            if (r2 == 0) goto L52
            io.reactivex.Completable r2 = r0.ignoreElements()
            return r2
        L52:
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.f.adapt(retrofit2.Call):java.lang.Object");
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.f73219a;
    }
}
