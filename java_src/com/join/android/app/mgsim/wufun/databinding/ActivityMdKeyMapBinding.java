package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityMdKeyMapBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16579b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f16580c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16581d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f16582e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16583f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f16584g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16585h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16586i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final Button f16587j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f16588k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final Button f16589l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f16590m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final Button f16591n;

    private ActivityMdKeyMapBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2, @NonNull TextView textView2, @NonNull Button button3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Button button4, @NonNull TextView textView5, @NonNull Button button5, @NonNull TextView textView6, @NonNull Button button6) {
        this.f16579b = linearLayout;
        this.f16580c = button;
        this.f16581d = textView;
        this.f16582e = button2;
        this.f16583f = textView2;
        this.f16584g = button3;
        this.f16585h = textView3;
        this.f16586i = textView4;
        this.f16587j = button4;
        this.f16588k = textView5;
        this.f16589l = button5;
        this.f16590m = textView6;
        this.f16591n = button6;
    }

    @NonNull
    public static ActivityMdKeyMapBinding bind(@NonNull View view) {
        int i4 = R.id.f15589a;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.f15589a);
        if (button != null) {
            i4 = R.id.a_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.a_tv);
            if (textView != null) {
                i4 = R.id.f15591b;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.f15591b);
                if (button2 != null) {
                    i4 = R.id.b_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.b_tv);
                    if (textView2 != null) {
                        i4 = R.id.f15595c;
                        Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.f15595c);
                        if (button3 != null) {
                            i4 = R.id.l1_tv;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.l1_tv);
                            if (textView3 != null) {
                                i4 = R.id.r1_tv;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.r1_tv);
                                if (textView4 != null) {
                                    i4 = R.id.f15620x;
                                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.f15620x);
                                    if (button4 != null) {
                                        i4 = R.id.x_tv;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.x_tv);
                                        if (textView5 != null) {
                                            i4 = R.id.f15621y;
                                            Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.f15621y);
                                            if (button5 != null) {
                                                i4 = R.id.y_tv;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.y_tv);
                                                if (textView6 != null) {
                                                    i4 = R.id.f15622z;
                                                    Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.f15622z);
                                                    if (button6 != null) {
                                                        return new ActivityMdKeyMapBinding((LinearLayout) view, button, textView, button2, textView2, button3, textView3, textView4, button4, textView5, button5, textView6, button6);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityMdKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16579b;
    }

    @NonNull
    public static ActivityMdKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_md_key_map, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
