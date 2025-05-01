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
public final class MgForumAllActivityItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23801b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumItemForWelcomeBinding f23802c;

    private MgForumAllActivityItemBinding(@NonNull LinearLayout linearLayout, @NonNull MgForumItemForWelcomeBinding mgForumItemForWelcomeBinding) {
        this.f23801b = linearLayout;
        this.f23802c = mgForumItemForWelcomeBinding;
    }

    @NonNull
    public static MgForumAllActivityItemBinding bind(@NonNull View view) {
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.mg_forum_item);
        if (findChildViewById != null) {
            return new MgForumAllActivityItemBinding((LinearLayout) view, MgForumItemForWelcomeBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.mg_forum_item)));
    }

    @NonNull
    public static MgForumAllActivityItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23801b;
    }

    @NonNull
    public static MgForumAllActivityItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_all_activity_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
