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
public final class LayoutPapaMainHomeV4GuessLikeRecommendBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23212b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f23213c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23214d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23215e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23216f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23217g;

    private LayoutPapaMainHomeV4GuessLikeRecommendBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23212b = linearLayout;
        this.f23213c = simpleDraweeView;
        this.f23214d = textView;
        this.f23215e = textView2;
        this.f23216f = textView3;
        this.f23217g = textView4;
    }

    @NonNull
    public static LayoutPapaMainHomeV4GuessLikeRecommendBinding bind(@NonNull View view) {
        int i4 = R.id.appimage;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appimage);
        if (simpleDraweeView != null) {
            i4 = R.id.appname;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname);
            if (textView != null) {
                i4 = R.id.appsize;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appsize);
                if (textView2 != null) {
                    i4 = R.id.downloadapp;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.downloadapp);
                    if (textView3 != null) {
                        i4 = R.id.moneyText;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                        if (textView4 != null) {
                            return new LayoutPapaMainHomeV4GuessLikeRecommendBinding((LinearLayout) view, simpleDraweeView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutPapaMainHomeV4GuessLikeRecommendBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23212b;
    }

    @NonNull
    public static LayoutPapaMainHomeV4GuessLikeRecommendBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_papa_main_home_v4_guess_like_recommend, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
