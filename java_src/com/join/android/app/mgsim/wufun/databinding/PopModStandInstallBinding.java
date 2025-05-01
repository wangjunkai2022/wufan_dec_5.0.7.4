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
public final class PopModStandInstallBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26046b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26047c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26048d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26049e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26050f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f26051g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f26052h;

    private PopModStandInstallBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view, @NonNull View view2) {
        this.f26046b = constraintLayout;
        this.f26047c = textView;
        this.f26048d = simpleDraweeView;
        this.f26049e = textView2;
        this.f26050f = textView3;
        this.f26051g = view;
        this.f26052h = view2;
    }

    @NonNull
    public static PopModStandInstallBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (textView != null) {
            i4 = R.id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
            if (simpleDraweeView != null) {
                i4 = R.id.install;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.install);
                if (textView2 != null) {
                    i4 = R.id.name;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                    if (textView3 != null) {
                        i4 = R.id.view5;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view5);
                        if (findChildViewById != null) {
                            i4 = R.id.view8;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view8);
                            if (findChildViewById2 != null) {
                                return new PopModStandInstallBinding((ConstraintLayout) view, textView, simpleDraweeView, textView2, textView3, findChildViewById, findChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopModStandInstallBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26046b;
    }

    @NonNull
    public static PopModStandInstallBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_mod_stand_install, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
