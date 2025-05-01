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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CollectionTwoHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18080b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f18081c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f18082d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18083e;

    private CollectionTwoHeaderBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.f18080b = relativeLayout;
        this.f18081c = simpleDraweeView;
        this.f18082d = relativeLayout2;
        this.f18083e = textView;
    }

    @NonNull
    public static CollectionTwoHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.imgBreak;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imgBreak);
        if (simpleDraweeView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textViewBreak);
            if (textView != null) {
                return new CollectionTwoHeaderBinding(relativeLayout, simpleDraweeView, relativeLayout, textView);
            }
            i4 = R.id.textViewBreak;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CollectionTwoHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18080b;
    }

    @NonNull
    public static CollectionTwoHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.collection_two_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
