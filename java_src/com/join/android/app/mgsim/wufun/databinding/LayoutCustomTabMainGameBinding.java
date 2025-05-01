package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutCustomTabMainGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22976b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Barrier f22977c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f22978d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f22979e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22980f;

    private LayoutCustomTabMainGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView) {
        this.f22976b = constraintLayout;
        this.f22977c = barrier;
        this.f22978d = view;
        this.f22979e = simpleDraweeView;
        this.f22980f = textView;
    }

    @NonNull
    public static LayoutCustomTabMainGameBinding bind(@NonNull View view) {
        int i4 = R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.barrier);
        if (barrier != null) {
            i4 = R.id.redPoint;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.redPoint);
            if (findChildViewById != null) {
                i4 = R.id.tabImg;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.tabImg);
                if (simpleDraweeView != null) {
                    i4 = R.id.tabText;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tabText);
                    if (textView != null) {
                        return new LayoutCustomTabMainGameBinding((ConstraintLayout) view, barrier, findChildViewById, simpleDraweeView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutCustomTabMainGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22976b;
    }

    @NonNull
    public static LayoutCustomTabMainGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_custom_tab_main_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
