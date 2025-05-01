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
import com.join.mgps.customview.SlidingTabForumLayout;
/* loaded from: classes3.dex */
public final class MgForumForumActivityItemTabBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23840b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SlidingTabForumLayout f23841c;

    private MgForumForumActivityItemTabBinding(@NonNull LinearLayout linearLayout, @NonNull SlidingTabForumLayout slidingTabForumLayout) {
        this.f23840b = linearLayout;
        this.f23841c = slidingTabForumLayout;
    }

    @NonNull
    public static MgForumForumActivityItemTabBinding bind(@NonNull View view) {
        SlidingTabForumLayout slidingTabForumLayout = (SlidingTabForumLayout) ViewBindings.findChildViewById(view, R.id.tabs);
        if (slidingTabForumLayout != null) {
            return new MgForumForumActivityItemTabBinding((LinearLayout) view, slidingTabForumLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tabs)));
    }

    @NonNull
    public static MgForumForumActivityItemTabBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23840b;
    }

    @NonNull
    public static MgForumForumActivityItemTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_activity_item_tab, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
