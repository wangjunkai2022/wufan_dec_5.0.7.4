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
public final class PopForumPostCommontSortBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25998b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25999c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26000d;

    private PopForumPostCommontSortBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f25998b = linearLayout;
        this.f25999c = linearLayout2;
        this.f26000d = linearLayout3;
    }

    @NonNull
    public static PopForumPostCommontSortBinding bind(@NonNull View view) {
        int i4 = R.id.ll_early;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_early);
        if (linearLayout != null) {
            i4 = R.id.ll_new;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_new);
            if (linearLayout2 != null) {
                return new PopForumPostCommontSortBinding((LinearLayout) view, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopForumPostCommontSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25998b;
    }

    @NonNull
    public static PopForumPostCommontSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_forum_post_commont_sort, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
