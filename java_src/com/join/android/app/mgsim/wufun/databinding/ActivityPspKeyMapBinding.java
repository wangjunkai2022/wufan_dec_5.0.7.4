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
public final class ActivityPspKeyMapBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16816b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f16817c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16818d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f16819e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16820f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f16821g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16822h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Button f16823i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16824j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TableLayout f16825k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final Button f16826l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f16827m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final Button f16828n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f16829o;

    private ActivityPspKeyMapBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2, @NonNull TextView textView2, @NonNull Button button3, @NonNull TextView textView3, @NonNull Button button4, @NonNull TextView textView4, @NonNull TableLayout tableLayout, @NonNull Button button5, @NonNull TextView textView5, @NonNull Button button6, @NonNull TextView textView6) {
        this.f16816b = linearLayout;
        this.f16817c = button;
        this.f16818d = textView;
        this.f16819e = button2;
        this.f16820f = textView2;
        this.f16821g = button3;
        this.f16822h = textView3;
        this.f16823i = button4;
        this.f16824j = textView4;
        this.f16825k = tableLayout;
        this.f16826l = button5;
        this.f16827m = textView5;
        this.f16828n = button6;
        this.f16829o = textView6;
    }

    @NonNull
    public static ActivityPspKeyMapBinding bind(@NonNull View view) {
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
                                i4 = R.id.f15613r;
                                Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.f15613r);
                                if (button4 != null) {
                                    i4 = R.id.r1_tv;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.r1_tv);
                                    if (textView4 != null) {
                                        i4 = R.id.table_main;
                                        TableLayout tableLayout = (TableLayout) ViewBindings.findChildViewById(view, R.id.table_main);
                                        if (tableLayout != null) {
                                            i4 = R.id.f15620x;
                                            Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.f15620x);
                                            if (button5 != null) {
                                                i4 = R.id.x_tv;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.x_tv);
                                                if (textView5 != null) {
                                                    i4 = R.id.f15621y;
                                                    Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.f15621y);
                                                    if (button6 != null) {
                                                        i4 = R.id.y_tv;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.y_tv);
                                                        if (textView6 != null) {
                                                            return new ActivityPspKeyMapBinding((LinearLayout) view, button, textView, button2, textView2, button3, textView3, button4, textView4, tableLayout, button5, textView5, button6, textView6);
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
    public static ActivityPspKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16816b;
    }

    @NonNull
    public static ActivityPspKeyMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_psp_key_map, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
