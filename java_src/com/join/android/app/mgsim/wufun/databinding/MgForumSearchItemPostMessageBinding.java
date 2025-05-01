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
import com.join.mgps.customview.EllipseTextView;
/* loaded from: classes3.dex */
public final class MgForumSearchItemPostMessageBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24276b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final EllipseTextView f24277c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24278d;

    private MgForumSearchItemPostMessageBinding(@NonNull LinearLayout linearLayout, @NonNull EllipseTextView ellipseTextView, @NonNull LinearLayout linearLayout2) {
        this.f24276b = linearLayout;
        this.f24277c = ellipseTextView;
        this.f24278d = linearLayout2;
    }

    @NonNull
    public static MgForumSearchItemPostMessageBinding bind(@NonNull View view) {
        EllipseTextView ellipseTextView = (EllipseTextView) ViewBindings.findChildViewById(view, R.id.forum_post_message);
        if (ellipseTextView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new MgForumSearchItemPostMessageBinding(linearLayout, ellipseTextView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.forum_post_message)));
    }

    @NonNull
    public static MgForumSearchItemPostMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24276b;
    }

    @NonNull
    public static MgForumSearchItemPostMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_search_item_post_message, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
