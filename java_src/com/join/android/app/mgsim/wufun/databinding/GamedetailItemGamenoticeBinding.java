package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetailItemGamenoticeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20582b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20583c;

    private GamedetailItemGamenoticeBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f20582b = linearLayout;
        this.f20583c = linearLayout2;
    }

    @NonNull
    public static GamedetailItemGamenoticeBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.itemLayout);
        if (linearLayout != null) {
            return new GamedetailItemGamenoticeBinding((LinearLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.itemLayout)));
    }

    @NonNull
    public static GamedetailItemGamenoticeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20582b;
    }

    @NonNull
    public static GamedetailItemGamenoticeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_gamenotice, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
