package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* loaded from: classes2.dex */
final class a0 extends FutureTask<e> {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e0 f4532b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z f4533c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, Callable callable, e0 e0Var) {
        super(callable);
        this.f4533c = zVar;
        this.f4532b = e0Var;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        c0 d5 = this.f4532b.d();
        if (d5.a() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (isCancelled() || d5.f4547a) {
                d5.f4547a = true;
                if (isCancelled() && isDone()) {
                    return;
                }
                cancel(false);
            }
        } catch (InterruptedException e5) {
            e5.toString();
        } catch (CancellationException unused) {
            d5.f4547a = true;
        } catch (ExecutionException e6) {
            if (e6.getCause() == null || !(e6.getCause() instanceof a)) {
                e6.toString();
                return;
            }
            a aVar = (a) e6.getCause();
            aVar.a();
            aVar.b();
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}
