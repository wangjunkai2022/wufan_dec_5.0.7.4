package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.HorizontalRecyclerView;
/* loaded from: classes3.dex */
public final class PapamainItemGameNewsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f25756b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f25757c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final HorizontalRecyclerView f25758d;

    private PapamainItemGameNewsBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull HorizontalRecyclerView horizontalRecyclerView) {
        this.f25756b = frameLayout;
        this.f25757c = frameLayout2;
        this.f25758d = horizontalRecyclerView;
    }

    @NonNull
    public static PapamainItemGameNewsBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        HorizontalRecyclerView horizontalRecyclerView = (HorizontalRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
        if (horizontalRecyclerView != null) {
            return new PapamainItemGameNewsBinding(frameLayout, frameLayout, horizontalRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.recyclerView)));
    }

    @NonNull
    public static PapamainItemGameNewsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f25756b;
    }

    @NonNull
    public static PapamainItemGameNewsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_item_game_news, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
