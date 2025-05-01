package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemHeaderDiscoveryListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f22378b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22379c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f22380d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22381e;

    private ItemHeaderDiscoveryListBinding(@NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull TextView textView) {
        this.f22378b = frameLayout;
        this.f22379c = simpleDraweeView;
        this.f22380d = view;
        this.f22381e = textView;
    }

    @NonNull
    public static ItemHeaderDiscoveryListBinding bind(@NonNull View view) {
        int i4 = R.id.ivIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.selectMask;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.selectMask);
            if (findChildViewById != null) {
                i4 = R.id.tvGameName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                if (textView != null) {
                    return new ItemHeaderDiscoveryListBinding((FrameLayout) view, simpleDraweeView, findChildViewById, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemHeaderDiscoveryListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f22378b;
    }

    @NonNull
    public static ItemHeaderDiscoveryListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_header_discovery_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
