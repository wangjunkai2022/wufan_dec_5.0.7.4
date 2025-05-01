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
public final class MgForumWelcomeItemHotForumItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24384b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumItemForWelcomeBinding f24385c;

    private MgForumWelcomeItemHotForumItemBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumItemForWelcomeBinding mgForumItemForWelcomeBinding) {
        this.f24384b = linearLayout;
        this.f24385c = mgForumItemForWelcomeBinding;
    }

    @NonNull
    public static MgForumWelcomeItemHotForumItemBinding bind(@NonNull View view) {
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.mg_forum_item);
        if (findChildViewById != null) {
            return new MgForumWelcomeItemHotForumItemBinding((LinearLayout) view, MgForumItemForWelcomeBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.mg_forum_item)));
    }

    @NonNull
    public static MgForumWelcomeItemHotForumItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24384b;
    }

    @NonNull
    public static MgForumWelcomeItemHotForumItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_welcome_item_hot_forum_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
