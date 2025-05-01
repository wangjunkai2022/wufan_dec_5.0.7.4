package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainVideoBannerLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25822b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25823c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25824d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25825e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f25826f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f25827g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25828h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f25829i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25830j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f25831k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f25832l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final FrameLayout f25833m;

    private PapamainVideoBannerLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout3, @NonNull FrameLayout frameLayout) {
        this.f25822b = linearLayout;
        this.f25823c = textView;
        this.f25824d = textView2;
        this.f25825e = linearLayout2;
        this.f25826f = simpleDraweeView;
        this.f25827g = simpleDraweeView2;
        this.f25828h = textView3;
        this.f25829i = simpleDraweeView3;
        this.f25830j = textView4;
        this.f25831k = relativeLayout;
        this.f25832l = linearLayout3;
        this.f25833m = frameLayout;
    }

    @NonNull
    public static PapamainVideoBannerLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.appname;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appname);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i4 = R.id.bannerView;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.bannerView);
                if (simpleDraweeView != null) {
                    i4 = R.id.gameIcon;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.itemInstall;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.itemInstall);
                        if (textView3 != null) {
                            i4 = R.id.loading;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loading);
                            if (simpleDraweeView3 != null) {
                                i4 = R.id.moneyText;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                if (textView4 != null) {
                                    i4 = R.id.rLayoutRight;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                    if (relativeLayout != null) {
                                        i4 = R.id.tipsLayout;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.videoContner;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContner);
                                            if (frameLayout != null) {
                                                return new PapamainVideoBannerLayoutBinding(linearLayout, textView, textView2, linearLayout, simpleDraweeView, simpleDraweeView2, textView3, simpleDraweeView3, textView4, relativeLayout, linearLayout2, frameLayout);
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
    public static PapamainVideoBannerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25822b;
    }

    @NonNull
    public static PapamainVideoBannerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_video_banner_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
