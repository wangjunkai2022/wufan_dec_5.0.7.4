package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class ChioceItemRecommand2CoverBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final SimpleDraweeView f17776b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17777c;

    private ChioceItemRecommand2CoverBinding(@NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.f17776b = simpleDraweeView;
        this.f17777c = simpleDraweeView2;
    }

    @NonNull
    public static ChioceItemRecommand2CoverBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
        return new ChioceItemRecommand2CoverBinding(simpleDraweeView, simpleDraweeView);
    }

    @NonNull
    public static ChioceItemRecommand2CoverBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public SimpleDraweeView getRoot() {
        return this.f17776b;
    }

    @NonNull
    public static ChioceItemRecommand2CoverBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_recommand_2_cover, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
