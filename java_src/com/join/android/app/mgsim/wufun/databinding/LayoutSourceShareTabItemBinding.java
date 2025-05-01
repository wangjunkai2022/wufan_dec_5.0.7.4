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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutSourceShareTabItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23428b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f23429c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23430d;

    private LayoutSourceShareTabItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull TextView textView) {
        this.f23428b = relativeLayout;
        this.f23429c = view;
        this.f23430d = textView;
    }

    @NonNull
    public static LayoutSourceShareTabItemBinding bind(@NonNull View view) {
        int i4 = R.id.iv_ind;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.iv_ind);
        if (findChildViewById != null) {
            i4 = R.id.tv_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
            if (textView != null) {
                return new LayoutSourceShareTabItemBinding((RelativeLayout) view, findChildViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSourceShareTabItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23428b;
    }

    @NonNull
    public static LayoutSourceShareTabItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_source_share_tab_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
