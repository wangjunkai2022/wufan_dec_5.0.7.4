package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemDownRecommendAd1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22016b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f22017c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22018d;

    private ItemDownRecommendAd1Binding(@NonNull CardView cardView, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f22016b = cardView;
        this.f22017c = linearLayout;
        this.f22018d = simpleDraweeView;
    }

    @NonNull
    public static ItemDownRecommendAd1Binding bind(@NonNull View view) {
        int i4 = R.id.main;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
        if (linearLayout != null) {
            i4 = R.id.sdv_image;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
            if (simpleDraweeView != null) {
                return new ItemDownRecommendAd1Binding((CardView) view, linearLayout, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemDownRecommendAd1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22016b;
    }

    @NonNull
    public static ItemDownRecommendAd1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_down_recommend_ad_1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
