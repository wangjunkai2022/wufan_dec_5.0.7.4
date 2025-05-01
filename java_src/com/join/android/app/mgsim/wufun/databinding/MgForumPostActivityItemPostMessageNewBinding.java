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
public final class MgForumPostActivityItemPostMessageNewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24141b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24142c;

    private MgForumPostActivityItemPostMessageNewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f24141b = linearLayout;
        this.f24142c = linearLayout2;
    }

    @NonNull
    public static MgForumPostActivityItemPostMessageNewBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        LinearLayout linearLayout = (LinearLayout) view;
        return new MgForumPostActivityItemPostMessageNewBinding(linearLayout, linearLayout);
    }

    @NonNull
    public static MgForumPostActivityItemPostMessageNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24141b;
    }

    @NonNull
    public static MgForumPostActivityItemPostMessageNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_message_new, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
