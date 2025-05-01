package it.sephiroth.android.library.util;

import android.os.Build;
import android.view.View;
/* compiled from: ViewHelperFactory.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f69313a = "ViewHelper";

    /* compiled from: ViewHelperFactory.java */
    /* loaded from: classes6.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        protected View f69314a;

        protected a(View view) {
            this.f69314a = view;
        }

        public abstract boolean a();

        public abstract void b(Runnable runnable);

        public abstract void c(int i4);
    }

    /* compiled from: ViewHelperFactory.java */
    /* renamed from: it.sephiroth.android.library.util.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0776b extends a {
        public C0776b(View view) {
            super(view);
        }

        @Override // it.sephiroth.android.library.util.b.a
        public boolean a() {
            return false;
        }

        @Override // it.sephiroth.android.library.util.b.a
        public void b(Runnable runnable) {
            this.f69314a.post(runnable);
        }

        @Override // it.sephiroth.android.library.util.b.a
        public void c(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("setScrollX: ");
            sb.append(i4);
            View view = this.f69314a;
            view.scrollTo(i4, view.getScrollY());
        }
    }

    public static final a a(View view) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 16) {
            return new q3.a(view);
        }
        if (i4 >= 14) {
            return new p3.a(view);
        }
        return new C0776b(view);
    }
}
