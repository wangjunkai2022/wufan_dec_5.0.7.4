package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.WrapContentListView;
/* loaded from: classes3.dex */
public final class ForumActivityForumPostBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19517b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final WrapContentListView f19518c;

    private ForumActivityForumPostBinding(@NonNull RelativeLayout relativeLayout, @NonNull WrapContentListView wrapContentListView) {
        this.f19517b = relativeLayout;
        this.f19518c = wrapContentListView;
    }

    @NonNull
    public static ForumActivityForumPostBinding bind(@NonNull View view) {
        WrapContentListView wrapContentListView = (WrapContentListView) ViewBindings.findChildViewById(view, R.id.wrapListView);
        if (wrapContentListView != null) {
            return new ForumActivityForumPostBinding((RelativeLayout) view, wrapContentListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.wrapListView)));
    }

    @NonNull
    public static ForumActivityForumPostBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19517b;
    }

    @NonNull
    public static ForumActivityForumPostBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_activity_forum_post, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
