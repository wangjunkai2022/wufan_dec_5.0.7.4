package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ForumThemeCategoryParentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19595b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19596c;

    private ForumThemeCategoryParentBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout) {
        this.f19595b = relativeLayout;
        this.f19596c = linearLayout;
    }

    @NonNull
    public static ForumThemeCategoryParentBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.group);
        if (linearLayout != null) {
            return new ForumThemeCategoryParentBinding((RelativeLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.group)));
    }

    @NonNull
    public static ForumThemeCategoryParentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19595b;
    }

    @NonNull
    public static ForumThemeCategoryParentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_theme_category_parent, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
