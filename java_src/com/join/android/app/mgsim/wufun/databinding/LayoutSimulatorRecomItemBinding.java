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
public final class LayoutSimulatorRecomItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23410b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f23411c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f23412d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23413e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23414f;

    private LayoutSimulatorRecomItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23410b = constraintLayout;
        this.f23411c = simpleDraweeView;
        this.f23412d = simpleDraweeView2;
        this.f23413e = textView;
        this.f23414f = textView2;
    }

    @NonNull
    public static LayoutSimulatorRecomItemBinding bind(@NonNull View view) {
        int i4 = R.id.ivIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.ivPoster;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivPoster);
            if (simpleDraweeView2 != null) {
                i4 = R.id.tvGameName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                if (textView != null) {
                    i4 = R.id.tvTags;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTags);
                    if (textView2 != null) {
                        return new LayoutSimulatorRecomItemBinding((ConstraintLayout) view, simpleDraweeView, simpleDraweeView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSimulatorRecomItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23410b;
    }

    @NonNull
    public static LayoutSimulatorRecomItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_recom_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
