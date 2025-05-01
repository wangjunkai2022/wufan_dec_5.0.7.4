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
public final class MgForumWelcomeItemPostThumbnailBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24402b;

    private MgForumWelcomeItemPostThumbnailBinding(@NonNull LinearLayout linearLayout) {
        this.f24402b = linearLayout;
    }

    @NonNull
    public static MgForumWelcomeItemPostThumbnailBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MgForumWelcomeItemPostThumbnailBinding((LinearLayout) view);
    }

    @NonNull
    public static MgForumWelcomeItemPostThumbnailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24402b;
    }

    @NonNull
    public static MgForumWelcomeItemPostThumbnailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_post_thumbnail, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
