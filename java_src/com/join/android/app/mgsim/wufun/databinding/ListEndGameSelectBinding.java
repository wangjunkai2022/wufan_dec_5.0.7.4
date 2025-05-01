package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class ListEndGameSelectBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView f23447b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f23448c;

    private ListEndGameSelectBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f23447b = recyclerView;
        this.f23448c = recyclerView2;
    }

    @NonNull
    public static ListEndGameSelectBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        RecyclerView recyclerView = (RecyclerView) view;
        return new ListEndGameSelectBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static ListEndGameSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RecyclerView getRoot() {
        return this.f23447b;
    }

    @NonNull
    public static ListEndGameSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.list_end_game_select, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
