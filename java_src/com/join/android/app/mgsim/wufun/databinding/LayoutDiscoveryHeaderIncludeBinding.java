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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutDiscoveryHeaderIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22982b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22983c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22984d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f22985e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f22986f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f22987g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f22988h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22989i;

    private LayoutDiscoveryHeaderIncludeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView2) {
        this.f22982b = constraintLayout;
        this.f22983c = textView;
        this.f22984d = simpleDraweeView;
        this.f22985e = view;
        this.f22986f = view2;
        this.f22987g = view3;
        this.f22988h = simpleDraweeView2;
        this.f22989i = textView2;
    }

    @NonNull
    public static LayoutDiscoveryHeaderIncludeBinding bind(@NonNull View view) {
        int i4 = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
        if (textView != null) {
            i4 = R.id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
            if (simpleDraweeView != null) {
                i4 = R.id.redPointDesc;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.redPointDesc);
                if (findChildViewById != null) {
                    i4 = R.id.redPointSubIcon;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.redPointSubIcon);
                    if (findChildViewById2 != null) {
                        i4 = R.id.redPointTitle;
                        View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.redPointTitle);
                        if (findChildViewById3 != null) {
                            i4 = R.id.subIcon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.subIcon);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                if (textView2 != null) {
                                    return new LayoutDiscoveryHeaderIncludeBinding((ConstraintLayout) view, textView, simpleDraweeView, findChildViewById, findChildViewById2, findChildViewById3, simpleDraweeView2, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutDiscoveryHeaderIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22982b;
    }

    @NonNull
    public static LayoutDiscoveryHeaderIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_discovery_header_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
