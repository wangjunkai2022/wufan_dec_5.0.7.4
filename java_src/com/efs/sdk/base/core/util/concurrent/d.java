package com.efs.sdk.base.core.util.concurrent;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class d<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private List<b<T>> f10437a = new ArrayList(5);

    /* renamed from: b  reason: collision with root package name */
    private c<T> f10438b;

    public d(@NonNull c<T> cVar) {
        this.f10438b = cVar;
    }

    public final void a(@NonNull List<b<T>> list) {
        this.f10437a.addAll(list);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    public final T a() {
        T t4 = null;
        try {
            Iterator<b<T>> it2 = this.f10437a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            t4 = this.f10438b.a();
            for (b<T> bVar : this.f10437a) {
                bVar.a(this.f10438b, t4);
            }
            for (b<T> bVar2 : this.f10437a) {
                bVar2.result(t4);
            }
        } catch (Throwable th) {
            Log.w("efs.util.concurrent", th);
            Iterator<b<T>> it3 = this.f10437a.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        return t4;
    }
}
