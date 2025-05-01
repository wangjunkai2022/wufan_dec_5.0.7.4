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
/* loaded from: classes3.dex */
public final class MgForumWelcomeItemPostSubjectBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24400b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f24401c;

    private MgForumWelcomeItemPostSubjectBinding(@NonNull LinearLayout linearLayout, @NonNull View view) {
        this.f24400b = linearLayout;
        this.f24401c = view;
    }

    @NonNull
    public static MgForumWelcomeItemPostSubjectBinding bind(@NonNull View view) {
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.forum_post_divider);
        if (findChildViewById != null) {
            return new MgForumWelcomeItemPostSubjectBinding((LinearLayout) view, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.forum_post_divider)));
    }

    @NonNull
    public static MgForumWelcomeItemPostSubjectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24400b;
    }

    @NonNull
    public static MgForumWelcomeItemPostSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_post_subject, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
