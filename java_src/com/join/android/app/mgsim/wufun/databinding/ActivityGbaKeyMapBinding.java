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
public final class ActivityGbaKeyMapBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16441b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f16442c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16443d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f16444e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16445f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f16446g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16447h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Button f16448i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16449j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f16450k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16451l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TableLayout f16452m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final Button f16453n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final Button f16454o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f16455p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f16456q;

    private ActivityGbaKeyMapBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2, @NonNull TextView textView2, @NonNull Button button3, @NonNull TextView textView3, @NonNull Button button4, @NonNull TextView textView4, @NonNull Button button5, @NonNull TextView textView5, @NonNull TableLayout tableLayout, @NonNull Button button6, @NonNull Button button7, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f16441b = linearLayout;
        this.f16442c = button;
        this.f16443d = textView;
        this.f16444e = button2;
        this.f16445f = textView2;
        this.f16446g = button3;
        this.f16447h = textView3;
        this.f16448i = button4;
        this.f16449j = textView4;
        this.f16450k = button5;
        this.f16451l = textView5;
        this.f16452m = tableLayout;
        this.f16453n = button6;
        this.f16454o = button7;
        this.f16455p = textView6;
        this.f16456q = textView7;
    }

    @NonNull
    public static ActivityGbaKeyMapBinding bind(@NonNull View view) {
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
                        i4 = R.id.f15606l;
                        Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.f15606l);
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
                                        i4 = R.id.f15613r;
                                        Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.f15613r);
                                        if (button5 != null) {
                                            i4 = R.id.r1_tv;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.r1_tv);
                                            if (textView5 != null) {
                                                i4 = R.id.table_main;
                                                TableLayout tableLayout = (TableLayout) ViewBindings.findChildViewById(view, R.id.table_main);
                                                if (tableLayout != null) {
                                                    i4 = R.id.turbo_a;
                                                    Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.turbo_a);
                                                    if (button6 != null) {
                                                        i4 = R.id.turbo_b;
                                                        Button button7 = (Button) ViewBindings.findChildViewById(view, R.id.turbo_b);
                                                        if (button7 != null) {
                                                            i4 = R.id.x_tv;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.x_tv);
                                                            if (textView6 != null) {
                                                                i4 = R.id.y_tv;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.y_tv);
                                                                if (textView7 != null) {
                                                                    return new ActivityGbaKeyMapBinding((LinearLayout) view, button, textView, button2, textView2, button3, textView3, button4, textView4, button5, textView5, tableLayout, button6, button7, textView6, textView7);
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
    public static ActivityGbaKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16441b;
    }

    @NonNull
    public static ActivityGbaKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_gba_key_map, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
