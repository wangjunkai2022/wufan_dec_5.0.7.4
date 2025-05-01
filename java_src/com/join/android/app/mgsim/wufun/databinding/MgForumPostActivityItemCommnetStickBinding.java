package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumStickView;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemCommnetStickBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ForumStickView f24045b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ForumStickView f24046c;

    private MgForumPostActivityItemCommnetStickBinding(@NonNull ForumStickView forumStickView, @NonNull ForumStickView forumStickView2) {
        this.f24045b = forumStickView;
        this.f24046c = forumStickView2;
    }

    @NonNull
    public static MgForumPostActivityItemCommnetStickBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        ForumStickView forumStickView = (ForumStickView) view;
        return new MgForumPostActivityItemCommnetStickBinding(forumStickView, forumStickView);
    }

    @NonNull
    public static MgForumPostActivityItemCommnetStickBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ForumStickView getRoot() {
        return this.f24045b;
    }

    @NonNull
    public static MgForumPostActivityItemCommnetStickBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_commnet_stick, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
