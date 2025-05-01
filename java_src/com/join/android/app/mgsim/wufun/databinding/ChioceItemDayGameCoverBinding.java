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
public final class ChioceItemDayGameCoverBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final SimpleDraweeView f17731b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17732c;

    private ChioceItemDayGameCoverBinding(@NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.f17731b = simpleDraweeView;
        this.f17732c = simpleDraweeView2;
    }

    @NonNull
    public static ChioceItemDayGameCoverBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
        return new ChioceItemDayGameCoverBinding(simpleDraweeView, simpleDraweeView);
    }

    @NonNull
    public static ChioceItemDayGameCoverBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public SimpleDraweeView getRoot() {
        return this.f17731b;
    }

    @NonNull
    public static ChioceItemDayGameCoverBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_day_game_cover, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
