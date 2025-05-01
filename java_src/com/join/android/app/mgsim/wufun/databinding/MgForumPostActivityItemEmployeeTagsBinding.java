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
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemEmployeeTagsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24047b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HListView f24048c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24049d;

    private MgForumPostActivityItemEmployeeTagsBinding(@NonNull LinearLayout linearLayout, @NonNull HListView hListView, @NonNull TextView textView) {
        this.f24047b = linearLayout;
        this.f24048c = hListView;
        this.f24049d = textView;
    }

    @NonNull
    public static MgForumPostActivityItemEmployeeTagsBinding bind(@NonNull View view) {
        int i4 = R.id.list;
        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.list);
        if (hListView != null) {
            i4 = R.id.textView51;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView51);
            if (textView != null) {
                return new MgForumPostActivityItemEmployeeTagsBinding((LinearLayout) view, hListView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumPostActivityItemEmployeeTagsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24047b;
    }

    @NonNull
    public static MgForumPostActivityItemEmployeeTagsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_employee_tags, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
