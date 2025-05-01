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
public final class ActivityQuarkInstallAppBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f16851b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f16852c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f16853d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f16854e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16855f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16856g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16857h;

    private ActivityQuarkInstallAppBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f16851b = constraintLayout;
        this.f16852c = constraintLayout2;
        this.f16853d = constraintLayout3;
        this.f16854e = simpleDraweeView;
        this.f16855f = textView;
        this.f16856g = textView2;
        this.f16857h = textView3;
    }

    @NonNull
    public static ActivityQuarkInstallAppBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.close);
        if (constraintLayout != null) {
            i4 = R.id.container;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.container);
            if (constraintLayout2 != null) {
                i4 = R.id.ivIcon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivIcon);
                if (simpleDraweeView != null) {
                    i4 = R.id.tvInstall;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInstall);
                    if (textView != null) {
                        i4 = R.id.tvName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvName);
                        if (textView2 != null) {
                            i4 = R.id.tvTitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                            if (textView3 != null) {
                                return new ActivityQuarkInstallAppBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, simpleDraweeView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityQuarkInstallAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f16851b;
    }

    @NonNull
    public static ActivityQuarkInstallAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_quark_install_app, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
