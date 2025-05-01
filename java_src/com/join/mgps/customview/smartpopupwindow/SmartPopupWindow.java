package com.join.mgps.customview.smartpopupwindow;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.widget.PopupWindowCompat;
/* loaded from: classes4.dex */
public class SmartPopupWindow extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private int f48660a;

    /* renamed from: b  reason: collision with root package name */
    private int f48661b;

    /* renamed from: c  reason: collision with root package name */
    private float f48662c;

    /* renamed from: d  reason: collision with root package name */
    private Context f48663d;

    /* renamed from: e  reason: collision with root package name */
    private View f48664e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f48665f;

    /* renamed from: g  reason: collision with root package name */
    private int f48666g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f48667h;

    /* renamed from: i  reason: collision with root package name */
    private View f48668i;

    /* renamed from: j  reason: collision with root package name */
    private int f48669j;

    /* renamed from: k  reason: collision with root package name */
    private int f48670k;

    /* renamed from: l  reason: collision with root package name */
    private int f48671l;

    /* renamed from: m  reason: collision with root package name */
    private int f48672m;

    /* renamed from: n  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f48673n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnKeyListener {
        a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                SmartPopupWindow.this.dismiss();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int x4 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            return (motionEvent.getAction() == 0 && (x4 < 0 || x4 >= SmartPopupWindow.this.f48660a || y2 < 0 || y2 >= SmartPopupWindow.this.f48661b)) || motionEvent.getAction() == 4;
        }
    }

    /* loaded from: classes4.dex */
    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SmartPopupWindow smartPopupWindow = SmartPopupWindow.this;
            smartPopupWindow.f48660a = smartPopupWindow.getContentView().getWidth();
            SmartPopupWindow smartPopupWindow2 = SmartPopupWindow.this;
            smartPopupWindow2.f48661b = smartPopupWindow2.getContentView().getHeight();
            if (SmartPopupWindow.this.f48667h) {
                SmartPopupWindow.this.z();
                return;
            }
            SmartPopupWindow smartPopupWindow3 = SmartPopupWindow.this;
            smartPopupWindow3.H(smartPopupWindow3.f48660a, SmartPopupWindow.this.f48661b, SmartPopupWindow.this.f48668i, SmartPopupWindow.this.f48669j, SmartPopupWindow.this.f48670k, SmartPopupWindow.this.f48671l, SmartPopupWindow.this.f48672m);
            SmartPopupWindow.this.z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartPopupWindow.this.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartPopupWindow.this.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private SmartPopupWindow f48679a;

        private f(Activity activity, View view) {
            SmartPopupWindow smartPopupWindow = new SmartPopupWindow(activity);
            this.f48679a = smartPopupWindow;
            smartPopupWindow.f48663d = activity;
            this.f48679a.f48664e = view;
        }

        public static f a(Activity activity, View view) {
            return new f(activity, view);
        }

        public SmartPopupWindow b() {
            this.f48679a.x();
            return this.f48679a;
        }

        public f c(float f5) {
            this.f48679a.f48662c = f5;
            return this;
        }

        public f d(int i4) {
            this.f48679a.f48666g = i4;
            return this;
        }

        public f e(boolean z4) {
            this.f48679a.f48665f = z4;
            return this;
        }

        public f f(int i4, int i5) {
            this.f48679a.f48660a = i4;
            this.f48679a.f48661b = i5;
            return this;
        }
    }

    public SmartPopupWindow(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(float f5) {
        Context context = this.f48663d;
        if (context != null && (context instanceof Activity)) {
            Window window = ((Activity) context).getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = f5;
            window.setAttributes(attributes);
        }
    }

    private void F() {
        float f5 = this.f48662c;
        if (f5 >= 1.0f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f5);
        ofFloat.addUpdateListener(new d());
        ofFloat.setDuration(360L);
        ofFloat.start();
    }

    private void G(boolean z4) {
        if (!z4) {
            setFocusable(true);
            setOutsideTouchable(false);
            setBackgroundDrawable(null);
            getContentView().setFocusable(true);
            getContentView().setFocusableInTouchMode(true);
            getContentView().setOnKeyListener(new a());
            setTouchInterceptor(new b());
            return;
        }
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i4, int i5, @NonNull View view, int i6, int i7, int i8, int i9) {
        update(view, t(view, i7, i4, i8), u(view, i6, i5, i9), i4, i5);
    }

    private void s(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f48673n);
    }

    private int t(View view, int i4, int i5, int i6) {
        int width;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    width = view.getWidth();
                } else if (i4 != 4) {
                    return i6;
                } else {
                    i5 -= view.getWidth();
                }
            }
            return i6 - i5;
        }
        width = (view.getWidth() / 2) - (i5 / 2);
        return i6 + width;
    }

    private int u(View view, int i4, int i5, int i6) {
        int height;
        if (i4 != 0) {
            if (i4 == 1) {
                i5 += view.getHeight();
            } else if (i4 == 3) {
                height = view.getHeight();
            } else if (i4 != 4) {
                return i6;
            }
            return i6 - i5;
        }
        height = (view.getHeight() / 2) + (i5 / 2);
        return i6 - height;
    }

    private void v() {
        float f5 = this.f48662c;
        if (f5 >= 1.0f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, 1.0f);
        ofFloat.addUpdateListener(new e());
        ofFloat.setDuration(360L);
        ofFloat.start();
    }

    private static int w(int i4) {
        return i4 != -2 ? 1073741824 : 0;
    }

    private static int y(int i4) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), w(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (getContentView() != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f48673n);
            } else {
                getContentView().getViewTreeObserver().removeGlobalOnLayoutListener(this.f48673n);
            }
        }
    }

    public void B(@NonNull View view, int i4, int i5) {
        E(view, i4, i5, true);
    }

    public void C(@NonNull View view, int i4, int i5, int i6, int i7) {
        D(view, i4, i5, i6, i7, true);
    }

    public void D(@NonNull View view, int i4, int i5, int i6, int i7, boolean z4) {
        this.f48667h = false;
        this.f48668i = view;
        this.f48671l = i6;
        this.f48672m = i7;
        this.f48669j = i4;
        this.f48670k = i5;
        F();
        View contentView = getContentView();
        s(contentView);
        setClippingEnabled(z4);
        contentView.measure(y(getWidth()), y(getHeight()));
        int measuredWidth = contentView.getMeasuredWidth();
        int measuredHeight = contentView.getMeasuredHeight();
        if (!z4) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            i6 += iArr[0];
            i7 += iArr[1] + view.getHeight();
        }
        int u4 = u(view, i4, measuredHeight, i7);
        int t4 = t(view, i5, measuredWidth, i6);
        if (z4) {
            PopupWindowCompat.showAsDropDown(this, view, t4, u4, 0);
        } else {
            showAtLocation(view, 0, t4, u4);
        }
    }

    public void E(@NonNull View view, int i4, int i5, boolean z4) {
        D(view, i4, i5, 0, 0, z4);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        v();
        z();
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i4, int i5, int i6) {
        this.f48667h = true;
        this.f48668i = view;
        this.f48671l = i5;
        this.f48672m = i6;
        s(getContentView());
        super.showAtLocation(view, i4, i5, i6);
    }

    public void x() {
        setContentView(this.f48664e);
        setHeight(this.f48661b);
        setWidth(this.f48660a);
        G(this.f48665f);
        int i4 = this.f48666g;
        if (i4 != -1) {
            setAnimationStyle(i4);
        }
    }

    public SmartPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmartPopupWindow(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f48660a = -2;
        this.f48661b = -2;
        this.f48662c = 1.0f;
        this.f48665f = true;
        this.f48666g = -1;
        this.f48667h = true;
        this.f48669j = 2;
        this.f48670k = 1;
        this.f48673n = new c();
        this.f48663d = context;
    }
}
