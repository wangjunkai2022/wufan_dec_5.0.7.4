package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentCheeseListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19627b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XRecyclerView f19628c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19629d;

    private FragmentCheeseListBinding(@NonNull RelativeLayout relativeLayout, @NonNull XRecyclerView xRecyclerView, @NonNull TextView textView) {
        this.f19627b = relativeLayout;
        this.f19628c = xRecyclerView;
        this.f19629d = textView;
    }

    @NonNull
    public static FragmentCheeseListBinding bind(@NonNull View view) {
        int i4 = R.id.listView;
        XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.listView);
        if (xRecyclerView != null) {
            i4 = R.id.noData;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noData);
            if (textView != null) {
                return new FragmentCheeseListBinding((RelativeLayout) view, xRecyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentCheeseListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19627b;
    }

    @NonNull
    public static FragmentCheeseListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_cheese_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
