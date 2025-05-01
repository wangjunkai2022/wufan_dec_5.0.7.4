package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.optimizetext.StaticLayoutView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemPostMessage1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24136b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final StaticLayoutView f24137c;

    private MgForumPostActivityItemPostMessage1Binding(@NonNull LinearLayout linearLayout, @NonNull StaticLayoutView staticLayoutView) {
        this.f24136b = linearLayout;
        this.f24137c = staticLayoutView;
    }

    @NonNull
    public static MgForumPostActivityItemPostMessage1Binding bind(@NonNull View view) {
        StaticLayoutView staticLayoutView = (StaticLayoutView) ViewBindings.findChildViewById(view, R.id.forum_post_message);
        if (staticLayoutView != null) {
            return new MgForumPostActivityItemPostMessage1Binding((LinearLayout) view, staticLayoutView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.forum_post_message)));
    }

    @NonNull
    public static MgForumPostActivityItemPostMessage1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24136b;
    }

    @NonNull
    public static MgForumPostActivityItemPostMessage1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_message1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
