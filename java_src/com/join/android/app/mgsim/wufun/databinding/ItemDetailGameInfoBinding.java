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
public final class ItemDetailGameInfoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21882b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21883c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21884d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21885e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21886f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21887g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21888h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21889i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21890j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21891k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21892l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f21893m;

    private ItemDetailGameInfoBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.f21882b = linearLayout;
        this.f21883c = textView;
        this.f21884d = textView2;
        this.f21885e = textView3;
        this.f21886f = textView4;
        this.f21887g = textView5;
        this.f21888h = textView6;
        this.f21889i = textView7;
        this.f21890j = textView8;
        this.f21891k = textView9;
        this.f21892l = textView10;
        this.f21893m = textView11;
    }

    @NonNull
    public static ItemDetailGameInfoBinding bind(@NonNull View view) {
        int i4 = R.id.tv_label1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label1);
        if (textView != null) {
            i4 = R.id.tv_label2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label2);
            if (textView2 != null) {
                i4 = R.id.tv_label3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label3);
                if (textView3 != null) {
                    i4 = R.id.tv_label4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label4);
                    if (textView4 != null) {
                        i4 = R.id.tv_label5;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label5);
                        if (textView5 != null) {
                            i4 = R.id.tv_title;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                            if (textView6 != null) {
                                i4 = R.id.tv_value1;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_value1);
                                if (textView7 != null) {
                                    i4 = R.id.tv_value2;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_value2);
                                    if (textView8 != null) {
                                        i4 = R.id.tv_value3;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_value3);
                                        if (textView9 != null) {
                                            i4 = R.id.tv_value4;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_value4);
                                            if (textView10 != null) {
                                                i4 = R.id.tv_value5;
                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_value5);
                                                if (textView11 != null) {
                                                    return new ItemDetailGameInfoBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
    public static ItemDetailGameInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21882b;
    }

    @NonNull
    public static ItemDetailGameInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_detail_game_info, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
