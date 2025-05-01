package com.join.mgps.customview.popup;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.join.mgps.customview.wheel.picker.WheelView;
import java.util.Objects;
/* compiled from: ConfirmPopup.java */
/* loaded from: classes4.dex */
public abstract class b<V extends View> extends com.join.mgps.customview.popup.a<View> {
    protected int A;
    protected int B;
    protected int C;
    protected TextView D;
    protected TextView E;
    protected View F;
    protected View G;
    protected View H;
    protected View I;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f48599j;

    /* renamed from: k  reason: collision with root package name */
    protected int f48600k;

    /* renamed from: l  reason: collision with root package name */
    protected int f48601l;

    /* renamed from: m  reason: collision with root package name */
    protected int f48602m;

    /* renamed from: n  reason: collision with root package name */
    protected int f48603n;

    /* renamed from: o  reason: collision with root package name */
    protected int f48604o;

    /* renamed from: p  reason: collision with root package name */
    protected int f48605p;

    /* renamed from: q  reason: collision with root package name */
    protected int f48606q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f48607r;

    /* renamed from: s  reason: collision with root package name */
    protected CharSequence f48608s;

    /* renamed from: t  reason: collision with root package name */
    protected CharSequence f48609t;

    /* renamed from: u  reason: collision with root package name */
    protected CharSequence f48610u;

    /* renamed from: v  reason: collision with root package name */
    protected int f48611v;

    /* renamed from: w  reason: collision with root package name */
    protected int f48612w;

    /* renamed from: x  reason: collision with root package name */
    protected int f48613x;

    /* renamed from: y  reason: collision with root package name */
    protected int f48614y;

    /* renamed from: z  reason: collision with root package name */
    protected int f48615z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfirmPopup.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.a();
            b.this.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfirmPopup.java */
    /* renamed from: com.join.mgps.customview.popup.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class View$OnClickListenerC0361b implements View.OnClickListener {
        View$OnClickListenerC0361b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.a();
            b.this.K();
        }
    }

    public b(Activity activity) {
        super(activity);
        this.f48599j = true;
        this.f48600k = -13388315;
        this.f48601l = 1;
        this.f48602m = -1;
        this.f48603n = 40;
        this.f48604o = 15;
        this.f48605p = 0;
        this.f48606q = 0;
        this.f48607r = true;
        this.f48608s = "";
        this.f48609t = "";
        this.f48610u = "";
        this.f48611v = -13388315;
        this.f48612w = -13388315;
        this.f48613x = -16777216;
        this.f48614y = WheelView.W;
        this.f48615z = 0;
        this.A = 0;
        this.B = 0;
        this.C = -1;
        this.f48608s = activity.getString(17039360);
        this.f48609t = activity.getString(17039370);
    }

    public TextView D() {
        TextView textView = this.D;
        Objects.requireNonNull(textView, "please call show at first");
        return textView;
    }

    public TextView E() {
        TextView textView = this.E;
        Objects.requireNonNull(textView, "please call show at first");
        return textView;
    }

    public View F() {
        View view = this.F;
        Objects.requireNonNull(view, "please call show at first");
        return view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public abstract V G();

    @Nullable
    protected View H() {
        View view = this.I;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Nullable
    protected View I() {
        View view = this.G;
        if (view != null) {
            return view;
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.f48589b);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, a2.a.H(this.f48589b, this.f48603n)));
        relativeLayout.setBackgroundColor(this.f48602m);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(this.f48589b);
        this.D = textView;
        textView.setVisibility(this.f48607r ? 0 : 8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        this.D.setLayoutParams(layoutParams);
        this.D.setBackgroundColor(0);
        this.D.setGravity(17);
        int H = a2.a.H(this.f48589b, this.f48604o);
        this.D.setPadding(H, 0, H, 0);
        if (!TextUtils.isEmpty(this.f48608s)) {
            this.D.setText(this.f48608s);
        }
        this.D.setTextColor(a2.a.n(this.f48611v, this.f48614y));
        int i4 = this.f48615z;
        if (i4 != 0) {
            this.D.setTextSize(i4);
        }
        this.D.setOnClickListener(new a());
        relativeLayout.addView(this.D);
        if (this.F == null) {
            TextView textView2 = new TextView(this.f48589b);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            int H2 = a2.a.H(this.f48589b, this.f48604o);
            layoutParams2.leftMargin = H2;
            layoutParams2.rightMargin = H2;
            layoutParams2.addRule(14, -1);
            layoutParams2.addRule(15, -1);
            textView2.setLayoutParams(layoutParams2);
            textView2.setGravity(17);
            if (!TextUtils.isEmpty(this.f48610u)) {
                textView2.setText(this.f48610u);
            }
            textView2.setTextColor(this.f48613x);
            int i5 = this.B;
            if (i5 != 0) {
                textView2.setTextSize(i5);
            }
            this.F = textView2;
        }
        relativeLayout.addView(this.F);
        this.E = new TextView(this.f48589b);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.addRule(11, -1);
        layoutParams3.addRule(15, -1);
        this.E.setLayoutParams(layoutParams3);
        this.E.setBackgroundColor(0);
        this.E.setGravity(17);
        this.E.setPadding(H, 0, H, 0);
        if (!TextUtils.isEmpty(this.f48609t)) {
            this.E.setText(this.f48609t);
        }
        this.E.setTextColor(a2.a.n(this.f48612w, this.f48614y));
        int i6 = this.A;
        if (i6 != 0) {
            this.E.setTextSize(i6);
        }
        this.E.setOnClickListener(new View$OnClickListenerC0361b());
        relativeLayout.addView(this.E);
        return relativeLayout;
    }

    protected void J() {
    }

    protected void K() {
    }

    public void L(@ColorInt int i4) {
        this.C = i4;
    }

    public void M(@StringRes int i4) {
        N(this.f48589b.getString(i4));
    }

    public void N(CharSequence charSequence) {
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.f48608s = charSequence;
        }
    }

    public void O(@ColorInt int i4) {
        TextView textView = this.D;
        if (textView != null) {
            textView.setTextColor(i4);
        } else {
            this.f48611v = i4;
        }
    }

    public void P(@IntRange(from = 10, to = 40) int i4) {
        this.f48615z = i4;
    }

    public void Q(boolean z4) {
        TextView textView = this.D;
        if (textView != null) {
            textView.setVisibility(z4 ? 0 : 8);
        } else {
            this.f48607r = z4;
        }
    }

    public void R(int i4, int i5) {
        this.f48605p = i4;
        this.f48606q = i5;
    }

    public void S(View view) {
        this.I = view;
    }

    public void T(View view) {
        this.G = view;
    }

    public void U(int i4) {
        this.f48614y = i4;
    }

    public void V(@StringRes int i4) {
        W(this.f48589b.getString(i4));
    }

    public void W(CharSequence charSequence) {
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.f48609t = charSequence;
        }
    }

    public void X(@ColorInt int i4) {
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i4);
        } else {
            this.f48612w = i4;
        }
    }

    public void Y(@IntRange(from = 10, to = 40) int i4) {
        this.A = i4;
    }

    public void Z(@StringRes int i4) {
        a0(this.f48589b.getString(i4));
    }

    public void a0(CharSequence charSequence) {
        View view = this.F;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setText(charSequence);
        } else {
            this.f48610u = charSequence;
        }
    }

    public void b0(@ColorInt int i4) {
        View view = this.F;
        if (view != null && (view instanceof TextView)) {
            ((TextView) view).setTextColor(i4);
        } else {
            this.f48613x = i4;
        }
    }

    public void c0(@IntRange(from = 10, to = 40) int i4) {
        this.B = i4;
    }

    public void d0(View view) {
        this.F = view;
    }

    public void e0(@ColorInt int i4) {
        this.f48602m = i4;
    }

    public void f0(@IntRange(from = 10, to = 80) int i4) {
        this.f48603n = i4;
    }

    public void g0(@ColorInt int i4) {
        this.f48600k = i4;
    }

    public void h0(int i4) {
        this.f48601l = i4;
    }

    public void i0(boolean z4) {
        this.f48599j = z4;
    }

    @Override // com.join.mgps.customview.popup.a
    protected final View j() {
        LinearLayout linearLayout = new LinearLayout(this.f48589b);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(this.C);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, 0, 0, 0);
        linearLayout.setClipToPadding(false);
        View I = I();
        if (I != null) {
            linearLayout.addView(I);
        }
        if (this.f48599j) {
            View view = new View(this.f48589b);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f48601l));
            view.setBackgroundColor(this.f48600k);
            linearLayout.addView(view);
        }
        if (this.H == null) {
            this.H = G();
        }
        int i4 = this.f48605p;
        int H = i4 > 0 ? a2.a.H(this.f48589b, i4) : 0;
        int i5 = this.f48606q;
        int H2 = i5 > 0 ? a2.a.H(this.f48589b, i5) : 0;
        this.H.setPadding(H, H2, H, H2);
        ViewGroup viewGroup = (ViewGroup) this.H.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.H);
        }
        linearLayout.addView(this.H, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        View H3 = H();
        if (H3 != null) {
            linearLayout.addView(H3);
        }
        return linearLayout;
    }

    public void j0(int i4) {
        this.f48604o = i4;
    }
}
