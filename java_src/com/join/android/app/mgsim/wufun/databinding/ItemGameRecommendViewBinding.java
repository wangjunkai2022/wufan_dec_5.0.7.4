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
public final class ItemGameRecommendViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22326b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22327c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22328d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22329e;

    private ItemGameRecommendViewBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f22326b = linearLayout;
        this.f22327c = simpleDraweeView;
        this.f22328d = linearLayout2;
        this.f22329e = textView;
    }

    @NonNull
    public static ItemGameRecommendViewBinding bind(@NonNull View view) {
        int i4 = R.id.itemGameRecommendIv;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.itemGameRecommendIv);
        if (simpleDraweeView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.itemGameRecommendTx);
            if (textView != null) {
                return new ItemGameRecommendViewBinding(linearLayout, simpleDraweeView, linearLayout, textView);
            }
            i4 = R.id.itemGameRecommendTx;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameRecommendViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22326b;
    }

    @NonNull
    public static ItemGameRecommendViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_recommend_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
