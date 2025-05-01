package com.kwad.components.ad.f;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.kwad.sdk.utils.az;
import com.kwad.sdk.utils.bo;
import com.kwad.sdk.utils.br;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes5.dex */
public final class b {
    private com.kwad.sdk.core.g.d eg;

    /* renamed from: me  reason: collision with root package name */
    private CopyOnWriteArrayList<C0399b> f55888me = new CopyOnWriteArrayList<>();
    private int mf;

    /* loaded from: classes5.dex */
    static final class a {
        private static final b mi = new b();
    }

    /* renamed from: com.kwad.components.ad.f.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0399b {
        private final c mj;
        private final WeakReference<View> mk;

        public C0399b(c cVar, View view) {
            this.mk = new WeakReference<>(view);
            this.mj = cVar;
        }
    }

    /* loaded from: classes5.dex */
    public interface c {
        void f(double d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(double d5) {
        CopyOnWriteArrayList<C0399b> copyOnWriteArrayList = this.f55888me;
        int CV = (int) (com.kwad.sdk.core.config.d.CV() * 100.0f);
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        int i4 = Integer.MAX_VALUE;
        Iterator<C0399b> it2 = copyOnWriteArrayList.iterator();
        C0399b c0399b = null;
        C0399b c0399b2 = null;
        while (it2.hasNext()) {
            C0399b next = it2.next();
            WeakReference weakReference = next.mk;
            if (weakReference != null) {
                Rect rect = new Rect();
                if (((View) weakReference.get()).getGlobalVisibleRect(rect) && br.o((View) weakReference.get(), CV)) {
                    int i5 = this.mf / 2;
                    int min = Math.min(Math.abs(rect.top - i5), Math.abs(rect.bottom - i5));
                    if (min < i4) {
                        c0399b = next;
                        i4 = min;
                    } else if (min == i4) {
                        c0399b2 = next;
                    }
                }
            }
        }
        if (c0399b != null) {
            if (c0399b2 != null) {
                Rect rect2 = new Rect();
                ((View) c0399b.mk.get()).getGlobalVisibleRect(rect2);
                Rect rect3 = new Rect();
                ((View) c0399b2.mk.get()).getGlobalVisibleRect(rect2);
                if (rect2.top < rect3.top) {
                    c0399b = c0399b2;
                }
            }
            c0399b.mj.f(d5);
        }
    }

    public static b em() {
        return a.mi;
    }

    public final void a(float f5, View view, c cVar) {
        if (view == null || view.getContext() == null) {
            return;
        }
        if (this.eg == null) {
            this.mf = com.kwad.sdk.c.a.a.aV(view.getContext());
            a(f5, view.getContext());
        }
        this.f55888me.add(new C0399b(cVar, view));
    }

    public final void a(c cVar) {
        Iterator<C0399b> it2 = this.f55888me.iterator();
        while (it2.hasNext()) {
            C0399b next = it2.next();
            if (next.mj == cVar) {
                this.f55888me.remove(next);
            }
        }
        com.kwad.sdk.core.e.c.d("KSNativeAdShakeManager", "sShakeItems size " + this.f55888me.size());
    }

    private void a(float f5, Context context) {
        this.eg = new com.kwad.sdk.core.g.d(f5);
        this.f55888me = new CopyOnWriteArrayList<>();
        this.eg.a(new com.kwad.sdk.core.g.b() { // from class: com.kwad.components.ad.f.b.1
            @Override // com.kwad.sdk.core.g.b
            public final void a(double d5) {
                if (b.this.f55888me != null) {
                    b.this.e(d5);
                    bo.a(new az() { // from class: com.kwad.components.ad.f.b.1.1
                        @Override // com.kwad.sdk.utils.az
                        public final void doTask() {
                            com.kwad.sdk.core.e.c.d("KSNativeAdShakeManager", "onShakeEvent openGate2");
                            b.this.eg.Ge();
                        }
                    }, null, 500L);
                }
            }

            @Override // com.kwad.sdk.core.g.b
            public final void aV() {
            }
        });
        this.eg.g(f5);
        this.eg.bv(context);
    }
}
