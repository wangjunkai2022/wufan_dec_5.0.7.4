package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivitySfcKeyMapBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16934b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f16935c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16936d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f16937e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16938f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f16939g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16940h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Button f16941i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16942j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f16943k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16944l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TableLayout f16945m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final Button f16946n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f16947o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final Button f16948p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f16949q;

    private ActivitySfcKeyMapBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2, @NonNull TextView textView2, @NonNull Button button3, @NonNull TextView textView3, @NonNull Button button4, @NonNull TextView textView4, @NonNull Button button5, @NonNull TextView textView5, @NonNull TableLayout tableLayout, @NonNull Button button6, @NonNull TextView textView6, @NonNull Button button7, @NonNull TextView textView7) {
        this.f16934b = linearLayout;
        this.f16935c = button;
        this.f16936d = textView;
        this.f16937e = button2;
        this.f16938f = textView2;
        this.f16939g = button3;
        this.f16940h = textView3;
        this.f16941i = button4;
        this.f16942j = textView4;
        this.f16943k = button5;
        this.f16944l = textView5;
        this.f16945m = tableLayout;
        this.f16946n = button6;
        this.f16947o = textView6;
        this.f16948p = button7;
        this.f16949q = textView7;
    }

    @NonNull
    public static ActivitySfcKeyMapBinding bind(@NonNull View view) {
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
                        i4 = R.id.f15607l1;
                        Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.f15607l1);
                        if (button3 != null) {
                            i4 = R.id.l1_tv;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.l1_tv);
                            if (textView3 != null) {
                                i4 = R.id.f15608l2;
                                Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.f15608l2);
                                if (button4 != null) {
                                    i4 = R.id.l2_tv;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.l2_tv);
                                    if (textView4 != null) {
                                        i4 = R.id.f15614r1;
                                        Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.f15614r1);
                                        if (button5 != null) {
                                            i4 = R.id.r1_tv;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.r1_tv);
                                            if (textView5 != null) {
                                                i4 = R.id.tableLayout;
                                                TableLayout tableLayout = (TableLayout) ViewBindings.findChildViewById(view, R.id.tableLayout);
                                                if (tableLayout != null) {
                                                    i4 = R.id.f15620x;
                                                    Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.f15620x);
                                                    if (button6 != null) {
                                                        i4 = R.id.x_tv;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.x_tv);
                                                        if (textView6 != null) {
                                                            i4 = R.id.f15621y;
                                                            Button button7 = (Button) ViewBindings.findChildViewById(view, R.id.f15621y);
                                                            if (button7 != null) {
                                                                i4 = R.id.y_tv;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.y_tv);
                                                                if (textView7 != null) {
                                                                    return new ActivitySfcKeyMapBinding((LinearLayout) view, button, textView, button2, textView2, button3, textView3, button4, textView4, button5, textView5, tableLayout, button6, textView6, button7, textView7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivitySfcKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16934b;
    }

    @NonNull
    public static ActivitySfcKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_sfc_key_map, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
