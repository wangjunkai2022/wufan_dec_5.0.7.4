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
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class SearchListFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26405b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26406c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f26407d;

    private SearchListFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull XListView2 xListView2) {
        this.f26405b = linearLayout;
        this.f26406c = linearLayout2;
        this.f26407d = xListView2;
    }

    @NonNull
    public static SearchListFragmentBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.searchListView);
        if (xListView2 != null) {
            return new SearchListFragmentBinding(linearLayout, linearLayout, xListView2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.searchListView)));
    }

    @NonNull
    public static SearchListFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26405b;
    }

    @NonNull
    public static SearchListFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_list_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
