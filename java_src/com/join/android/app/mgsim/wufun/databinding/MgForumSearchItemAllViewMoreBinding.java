package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumSearchItemAllViewMoreBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24252b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f24253c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f24254d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24255e;

    private MgForumSearchItemAllViewMoreBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull TextView textView) {
        this.f24252b = constraintLayout;
        this.f24253c = constraintLayout2;
        this.f24254d = view;
        this.f24255e = textView;
    }

    @NonNull
    public static MgForumSearchItemAllViewMoreBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = R.id.post_footer_divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.post_footer_divider);
        if (findChildViewById != null) {
            i4 = R.id.textView39;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView39);
            if (textView != null) {
                return new MgForumSearchItemAllViewMoreBinding(constraintLayout, constraintLayout, findChildViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumSearchItemAllViewMoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24252b;
    }

    @NonNull
    public static MgForumSearchItemAllViewMoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_search_item_all_view_more, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
