package com.kingja.loadsir.core;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kingja.loadsir.callback.Callback;
import com.kingja.loadsir.callback.SuccessCallback;
import com.kingja.loadsir.core.c;
import java.util.List;
/* compiled from: LoadService.java */
/* loaded from: classes5.dex */
public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f55211a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private LoadLayout f55212b;

    /* renamed from: c  reason: collision with root package name */
    private com.kingja.loadsir.core.a<T> f55213c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoadService.java */
    /* loaded from: classes5.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f55214b;

        a(Class cls) {
            this.f55214b = cls;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f55214b != null) {
                b.this.f55212b.e(this.f55214b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.kingja.loadsir.core.a<T> aVar, LoadLayout loadLayout, c.b bVar) {
        this.f55213c = aVar;
        this.f55212b = loadLayout;
        e(bVar);
    }

    private void e(c.b bVar) {
        List<Callback> e5 = bVar.e();
        Class<? extends Callback> f5 = bVar.f();
        if (e5 != null && e5.size() > 0) {
            for (Callback callback : e5) {
                this.f55212b.setupCallback(callback);
            }
        }
        new Handler().post(new a(f5));
    }

    public Class<? extends Callback> b() {
        return this.f55212b.getCurrentCallback();
    }

    public LoadLayout c() {
        return this.f55212b;
    }

    public LinearLayout d(Context context, ViewGroup viewGroup, View view) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setLayoutParams(layoutParams);
        viewGroup.removeView(view);
        linearLayout.addView(view);
        linearLayout.addView(this.f55212b, layoutParams);
        return linearLayout;
    }

    public b<T> f(Class<? extends Callback> cls, d dVar) {
        this.f55212b.setCallBack(cls, dVar);
        return this;
    }

    public void g(Class<? extends Callback> cls) {
        this.f55212b.e(cls);
    }

    public void h() {
        this.f55212b.e(SuccessCallback.class);
    }

    public void i(T t4) {
        com.kingja.loadsir.core.a<T> aVar = this.f55213c;
        if (aVar != null) {
            this.f55212b.e(aVar.map(t4));
            return;
        }
        throw new IllegalArgumentException("You haven't set the Convertor.");
    }
}
