package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumSearchItemAllSectionTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24249b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24250c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24251d;

    private MgForumSearchItemAllSectionTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f24249b = constraintLayout;
        this.f24250c = imageView;
        this.f24251d = textView;
    }

    @NonNull
    public static MgForumSearchItemAllSectionTitleBinding bind(@NonNull View view) {
        int i4 = R.id.imageView50;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView50);
        if (imageView != null) {
            i4 = R.id.title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
            if (textView != null) {
                return new MgForumSearchItemAllSectionTitleBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumSearchItemAllSectionTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24249b;
    }

    @NonNull
    public static MgForumSearchItemAllSectionTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_search_item_all_section_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
