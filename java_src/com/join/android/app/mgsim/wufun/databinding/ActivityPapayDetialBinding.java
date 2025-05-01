package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityPapayDetialBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16708b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f16709c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16710d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16711e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16712f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16713g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16714h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16715i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16716j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f16717k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16718l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f16719m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f16720n;

    private ActivityPapayDetialBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12) {
        this.f16708b = linearLayout;
        this.f16709c = textView;
        this.f16710d = textView2;
        this.f16711e = textView3;
        this.f16712f = textView4;
        this.f16713g = textView5;
        this.f16714h = textView6;
        this.f16715i = textView7;
        this.f16716j = textView8;
        this.f16717k = textView9;
        this.f16718l = textView10;
        this.f16719m = textView11;
        this.f16720n = textView12;
    }

    @NonNull
    public static ActivityPapayDetialBinding bind(@NonNull View view) {
        int i4 = R.id.money;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.money);
        if (textView != null) {
            i4 = R.id.orderName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.orderName);
            if (textView2 != null) {
                i4 = R.id.orderType;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.orderType);
                if (textView3 != null) {
                    i4 = R.id.payOderId;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.payOderId);
                    if (textView4 != null) {
                        i4 = R.id.payTime;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.payTime);
                        if (textView5 != null) {
                            i4 = R.id.payType;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.payType);
                            if (textView6 != null) {
                                i4 = R.id.textView12;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView12);
                                if (textView7 != null) {
                                    i4 = R.id.textView20;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.textView20);
                                    if (textView8 != null) {
                                        i4 = R.id.textView23;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.textView23);
                                        if (textView9 != null) {
                                            i4 = R.id.textView24;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.textView24);
                                            if (textView10 != null) {
                                                i4 = R.id.textView25;
                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.textView25);
                                                if (textView11 != null) {
                                                    i4 = R.id.textView27;
                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.textView27);
                                                    if (textView12 != null) {
                                                        return new ActivityPapayDetialBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
    public static ActivityPapayDetialBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16708b;
    }

    @NonNull
    public static ActivityPapayDetialBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_papay_detial, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
