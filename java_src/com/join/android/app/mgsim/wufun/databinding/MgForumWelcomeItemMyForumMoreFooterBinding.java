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
public final class MgForumWelcomeItemMyForumMoreFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24396b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24397c;

    private MgForumWelcomeItemMyForumMoreFooterBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f24396b = linearLayout;
        this.f24397c = textView;
    }

    @NonNull
    public static MgForumWelcomeItemMyForumMoreFooterBinding bind(@NonNull View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forums_hot_item_forum_all);
        if (textView != null) {
            return new MgForumWelcomeItemMyForumMoreFooterBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.forums_hot_item_forum_all)));
    }

    @NonNull
    public static MgForumWelcomeItemMyForumMoreFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24396b;
    }

    @NonNull
    public static MgForumWelcomeItemMyForumMoreFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_my_forum_more_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
