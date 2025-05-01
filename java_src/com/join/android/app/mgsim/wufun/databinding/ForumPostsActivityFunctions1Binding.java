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
import com.join.mgps.customview.WrapContentGridView;
/* loaded from: classes3.dex */
public final class ForumPostsActivityFunctions1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19528b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final WrapContentGridView f19529c;

    private ForumPostsActivityFunctions1Binding(@NonNull LinearLayout linearLayout, @NonNull WrapContentGridView wrapContentGridView) {
        this.f19528b = linearLayout;
        this.f19529c = wrapContentGridView;
    }

    @NonNull
    public static ForumPostsActivityFunctions1Binding bind(@NonNull View view) {
        WrapContentGridView wrapContentGridView = (WrapContentGridView) ViewBindings.findChildViewById(view, R.id.gridView);
        if (wrapContentGridView != null) {
            return new ForumPostsActivityFunctions1Binding((LinearLayout) view, wrapContentGridView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.gridView)));
    }

    @NonNull
    public static ForumPostsActivityFunctions1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19528b;
    }

    @NonNull
    public static ForumPostsActivityFunctions1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_posts_activity_functions1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
