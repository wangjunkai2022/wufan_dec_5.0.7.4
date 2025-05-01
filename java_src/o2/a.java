package o2;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
/* compiled from: KeyBoardUtils.java */
/* loaded from: classes5.dex */
public class a {

    /* compiled from: KeyBoardUtils.java */
    /* renamed from: o2.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC0789a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f  reason: collision with root package name */
        private static final String f72040f = "ListenerHandler";

        /* renamed from: b  reason: collision with root package name */
        private View f72041b;

        /* renamed from: c  reason: collision with root package name */
        private int f72042c;

        /* renamed from: d  reason: collision with root package name */
        private int f72043d;

        /* renamed from: e  reason: collision with root package name */
        private InterfaceC0790a f72044e;

        /* compiled from: KeyBoardUtils.java */
        /* renamed from: o2.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC0790a {
            void a(boolean z4, int i4);
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC0789a(Activity activity) {
            if (activity == null) {
                return;
            }
            View c5 = c(activity);
            this.f72041b = c5;
            if (c5 != null) {
                a();
            }
        }

        private void a() {
            this.f72041b.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private View c(Activity activity) {
            return activity.findViewById(16908290);
        }

        public void b() {
            View view = this.f72041b;
            if (view == null || Build.VERSION.SDK_INT < 16) {
                return;
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        public void d(InterfaceC0790a interfaceC0790a) {
            this.f72044e = interfaceC0790a;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onGlobalLayout() {
            /*
                r4 = this;
                android.view.View r0 = r4.f72041b
                int r0 = r0.getHeight()
                if (r0 != 0) goto L9
                return
            L9:
                int r1 = r4.f72043d
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L15
                r4.f72043d = r0
                r4.f72042c = r0
            L13:
                r1 = 0
                goto L1a
            L15:
                if (r1 == r0) goto L13
                r4.f72043d = r0
                r1 = 1
            L1a:
                if (r1 == 0) goto L2b
                int r1 = r4.f72042c
                if (r1 != r0) goto L22
                r2 = 0
                goto L24
            L22:
                int r3 = r1 - r0
            L24:
                o2.a$a$a r0 = r4.f72044e
                if (r0 == 0) goto L2b
                r0.a(r2, r3)
            L2b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.a.ViewTreeObserver$OnGlobalLayoutListenerC0789a.onGlobalLayout():void");
        }
    }

    public static void a(Context context, IBinder iBinder) {
        if (context == null || iBinder == null) {
            return;
        }
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(iBinder, 0);
    }

    public static void b(View view) {
        if (view == null) {
            return;
        }
        a(view.getContext(), view.getWindowToken());
    }

    public static void c(View view) {
        if (view == null) {
            return;
        }
        view.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 2);
    }
}
