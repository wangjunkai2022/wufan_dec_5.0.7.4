package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemCommnetDividerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final View f24043b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f24044c;

    private MgForumPostActivityItemCommnetDividerBinding(@NonNull View view, @NonNull View view2) {
        this.f24043b = view;
        this.f24044c = view2;
    }

    @NonNull
    public static MgForumPostActivityItemCommnetDividerBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new MgForumPostActivityItemCommnetDividerBinding(view, view);
    }

    @NonNull
    public static MgForumPostActivityItemCommnetDividerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f24043b;
    }

    @NonNull
    public static MgForumPostActivityItemCommnetDividerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_commnet_divider, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
