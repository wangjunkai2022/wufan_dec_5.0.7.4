package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.WrapContentGridView;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class ChioceItemGameClassifyContentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final WrapContentGridView f17754b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final WrapContentGridView f17755c;

    private ChioceItemGameClassifyContentBinding(@NonNull WrapContentGridView wrapContentGridView, @NonNull WrapContentGridView wrapContentGridView2) {
        this.f17754b = wrapContentGridView;
        this.f17755c = wrapContentGridView2;
    }

    @NonNull
    public static ChioceItemGameClassifyContentBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        WrapContentGridView wrapContentGridView = (WrapContentGridView) view;
        return new ChioceItemGameClassifyContentBinding(wrapContentGridView, wrapContentGridView);
    }

    @NonNull
    public static ChioceItemGameClassifyContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public WrapContentGridView getRoot() {
        return this.f17754b;
    }

    @NonNull
    public static ChioceItemGameClassifyContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_game_classify_content, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
