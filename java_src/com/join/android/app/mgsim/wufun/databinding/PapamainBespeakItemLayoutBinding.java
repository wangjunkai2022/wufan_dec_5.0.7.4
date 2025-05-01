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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainBespeakItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25651b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f25652c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f25653d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25654e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25655f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25656g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25657h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25658i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25659j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f25660k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f25661l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f25662m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f25663n;

    private PapamainBespeakItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f25651b = linearLayout;
        this.f25652c = simpleDraweeView;
        this.f25653d = simpleDraweeView2;
        this.f25654e = textView;
        this.f25655f = textView2;
        this.f25656g = textView3;
        this.f25657h = textView4;
        this.f25658i = textView5;
        this.f25659j = textView6;
        this.f25660k = simpleDraweeView3;
        this.f25661l = simpleDraweeView4;
        this.f25662m = linearLayout2;
        this.f25663n = linearLayout3;
    }

    @NonNull
    public static PapamainBespeakItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appimage;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appimage);
        if (simpleDraweeView != null) {
            i4 = R.id.appimage2;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appimage2);
            if (simpleDraweeView2 != null) {
                i4 = R.id.appname;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname);
                if (textView != null) {
                    i4 = R.id.appname2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appname2);
                    if (textView2 != null) {
                        i4 = R.id.bespeakNumber;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.bespeakNumber);
                        if (textView3 != null) {
                            i4 = R.id.bespeakNumber2;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.bespeakNumber2);
                            if (textView4 != null) {
                                i4 = R.id.downloadapp;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.downloadapp);
                                if (textView5 != null) {
                                    i4 = R.id.downloadapp2;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.downloadapp2);
                                    if (textView6 != null) {
                                        i4 = R.id.gameIcon;
                                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                                        if (simpleDraweeView3 != null) {
                                            i4 = R.id.gameIcon2;
                                            SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon2);
                                            if (simpleDraweeView4 != null) {
                                                i4 = R.id.itemLeft;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.itemLeft);
                                                if (linearLayout != null) {
                                                    i4 = R.id.itemRight;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.itemRight);
                                                    if (linearLayout2 != null) {
                                                        return new PapamainBespeakItemLayoutBinding((LinearLayout) view, simpleDraweeView, simpleDraweeView2, textView, textView2, textView3, textView4, textView5, textView6, simpleDraweeView3, simpleDraweeView4, linearLayout, linearLayout2);
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
    public static PapamainBespeakItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25651b;
    }

    @NonNull
    public static PapamainBespeakItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_bespeak_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
