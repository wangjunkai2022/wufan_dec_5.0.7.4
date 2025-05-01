package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumWelcomeItemHotForumFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24374b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24375c;

    private MgForumWelcomeItemHotForumFooterBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f24374b = linearLayout;
        this.f24375c = textView;
    }

    @NonNull
    public static MgForumWelcomeItemHotForumFooterBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forums_hot_item_forum_all);
        if (textView != null) {
            return new MgForumWelcomeItemHotForumFooterBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.forums_hot_item_forum_all)));
    }

    @NonNull
    public static MgForumWelcomeItemHotForumFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24374b;
    }

    @NonNull
    public static MgForumWelcomeItemHotForumFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_hot_forum_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
