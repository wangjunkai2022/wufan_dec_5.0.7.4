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
public final class ActivityFcKeyMapBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16162b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f16163c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16164d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f16165e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f16166f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16167g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16168h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Button f16169i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16170j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f16171k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16172l;

    private ActivityFcKeyMapBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2, @NonNull Button button3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Button button4, @NonNull TextView textView4, @NonNull Button button5, @NonNull TextView textView5) {
        this.f16162b = linearLayout;
        this.f16163c = button;
        this.f16164d = textView;
        this.f16165e = button2;
        this.f16166f = button3;
        this.f16167g = textView2;
        this.f16168h = textView3;
        this.f16169i = button4;
        this.f16170j = textView4;
        this.f16171k = button5;
        this.f16172l = textView5;
    }

    @NonNull
    public static ActivityFcKeyMapBinding bind(@NonNull View view) {
        int i4 = R.id.f15589a;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.f15589a);
        if (button != null) {
            i4 = R.id.a_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.a_tv);
            if (textView != null) {
                i4 = R.id.ab;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.ab);
                if (button2 != null) {
                    i4 = R.id.f15591b;
                    Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.f15591b);
                    if (button3 != null) {
                        i4 = R.id.b_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.b_tv);
                        if (textView2 != null) {
                            i4 = R.id.r1_tv;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.r1_tv);
                            if (textView3 != null) {
                                i4 = R.id.f15620x;
                                Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.f15620x);
                                if (button4 != null) {
                                    i4 = R.id.x_tv;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.x_tv);
                                    if (textView4 != null) {
                                        i4 = R.id.f15621y;
                                        Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.f15621y);
                                        if (button5 != null) {
                                            i4 = R.id.y_tv;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.y_tv);
                                            if (textView5 != null) {
                                                return new ActivityFcKeyMapBinding((LinearLayout) view, button, textView, button2, button3, textView2, textView3, button4, textView4, button5, textView5);
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
    public static ActivityFcKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16162b;
    }

    @NonNull
    public static ActivityFcKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_fc_key_map, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
