package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgForumWelcomeItemAdBlockBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24361b;

    private MgForumWelcomeItemAdBlockBinding(@NonNull LinearLayout linearLayout) {
        this.f24361b = linearLayout;
    }

    @NonNull
    public static MgForumWelcomeItemAdBlockBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MgForumWelcomeItemAdBlockBinding((LinearLayout) view);
    }

    @NonNull
    public static MgForumWelcomeItemAdBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24361b;
    }

    @NonNull
    public static MgForumWelcomeItemAdBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_ad_block, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
