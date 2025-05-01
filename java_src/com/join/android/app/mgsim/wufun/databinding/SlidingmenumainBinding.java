package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
import m.framework.ui.widget.slidingmenu.SlidingMenu;
/* loaded from: classes3.dex */
public final class SlidingmenumainBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final SlidingMenu f26638b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingMenu f26639c;

    private SlidingmenumainBinding(@NonNull SlidingMenu slidingMenu, @NonNull SlidingMenu slidingMenu2) {
        this.f26638b = slidingMenu;
        this.f26639c = slidingMenu2;
    }

    @NonNull
    public static SlidingmenumainBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        SlidingMenu slidingMenu = (SlidingMenu) view;
        return new SlidingmenumainBinding(slidingMenu, slidingMenu);
    }

    @NonNull
    public static SlidingmenumainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public SlidingMenu getRoot() {
        return this.f26638b;
    }

    @NonNull
    public static SlidingmenumainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.slidingmenumain, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
