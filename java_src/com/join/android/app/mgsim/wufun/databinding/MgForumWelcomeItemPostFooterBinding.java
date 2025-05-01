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
public final class MgForumWelcomeItemPostFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24398b;

    private MgForumWelcomeItemPostFooterBinding(@NonNull LinearLayout linearLayout) {
        this.f24398b = linearLayout;
    }

    @NonNull
    public static MgForumWelcomeItemPostFooterBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MgForumWelcomeItemPostFooterBinding((LinearLayout) view);
    }

    @NonNull
    public static MgForumWelcomeItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24398b;
    }

    @NonNull
    public static MgForumWelcomeItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_post_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
