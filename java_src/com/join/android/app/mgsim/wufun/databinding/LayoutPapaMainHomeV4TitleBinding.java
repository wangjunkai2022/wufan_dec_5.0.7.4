package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutPapaMainHomeV4TitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23226b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23227c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23228d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23229e;

    private LayoutPapaMainHomeV4TitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23226b = constraintLayout;
        this.f23227c = imageView;
        this.f23228d = textView;
        this.f23229e = textView2;
    }

    @NonNull
    public static LayoutPapaMainHomeV4TitleBinding bind(@NonNull View view) {
        int i4 = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrow);
        if (imageView != null) {
            i4 = R.id.more;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.more);
            if (textView != null) {
                i4 = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                if (textView2 != null) {
                    return new LayoutPapaMainHomeV4TitleBinding((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutPapaMainHomeV4TitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23226b;
    }

    @NonNull
    public static LayoutPapaMainHomeV4TitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_papa_main_home_v4_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
