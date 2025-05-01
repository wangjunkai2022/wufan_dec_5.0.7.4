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
public final class SearchTabItemLayoutV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26454b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f26455c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26456d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26457e;

    private SearchTabItemLayoutV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26454b = constraintLayout;
        this.f26455c = view;
        this.f26456d = textView;
        this.f26457e = textView2;
    }

    @NonNull
    public static SearchTabItemLayoutV2Binding bind(@NonNull View view) {
        int i4 = R.id.iv;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.iv);
        if (findChildViewById != null) {
            i4 = R.id.redTags;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.redTags);
            if (textView != null) {
                i4 = R.id.f15618tv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.f15618tv);
                if (textView2 != null) {
                    return new SearchTabItemLayoutV2Binding((ConstraintLayout) view, findChildViewById, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SearchTabItemLayoutV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26454b;
    }

    @NonNull
    public static SearchTabItemLayoutV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_tab_item_layout_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
