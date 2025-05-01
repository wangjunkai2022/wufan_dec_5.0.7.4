package com.sdk.d;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/* JADX INFO: Add missing generic type declarations: [Result] */
/* loaded from: classes5.dex */
public class d<Result> extends FutureTask<Result> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f60006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Callable callable) {
        super(callable);
        this.f60006a = eVar;
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        try {
            e.b(this.f60006a, super.get());
        } catch (Exception e5) {
            e.b(this.f60006a, null);
            com.sdk.o.b.a("PriorityAsyncTask", e5.getMessage(), this.f60006a.f60014h);
        }
    }
}
