package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.optimizetext.StaticLayoutView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgFItemPostMessageBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23757b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f23758c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final StaticLayoutView f23759d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f23760e;

    private MgFItemPostMessageBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull StaticLayoutView staticLayoutView, @NonNull View view2) {
        this.f23757b = linearLayout;
        this.f23758c = view;
        this.f23759d = staticLayoutView;
        this.f23760e = view2;
    }

    @NonNull
    public static MgFItemPostMessageBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            i4 = R.id.msg;
            StaticLayoutView staticLayoutView = (StaticLayoutView) ViewBindings.findChildViewById(view, R.id.msg);
            if (staticLayoutView != null) {
                i4 = R.id.spaceT;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.spaceT);
                if (findChildViewById2 != null) {
                    return new MgFItemPostMessageBinding((LinearLayout) view, findChildViewById, staticLayoutView, findChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgFItemPostMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23757b;
    }

    @NonNull
    public static MgFItemPostMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_f_item_post_message, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
