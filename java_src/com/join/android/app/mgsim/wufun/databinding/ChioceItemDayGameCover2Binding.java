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
public final class ChioceItemDayGameCover2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final SimpleDraweeView f17729b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17730c;

    private ChioceItemDayGameCover2Binding(@NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.f17729b = simpleDraweeView;
        this.f17730c = simpleDraweeView2;
    }

    @NonNull
    public static ChioceItemDayGameCover2Binding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
        return new ChioceItemDayGameCover2Binding(simpleDraweeView, simpleDraweeView);
    }

    @NonNull
    public static ChioceItemDayGameCover2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public SimpleDraweeView getRoot() {
        return this.f17729b;
    }

    @NonNull
    public static ChioceItemDayGameCover2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_day_game_cover2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
