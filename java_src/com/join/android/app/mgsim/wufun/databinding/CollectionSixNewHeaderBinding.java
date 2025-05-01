package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CollectionSixNewHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18052b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18053c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f18054d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f18055e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18056f;

    private CollectionSixNewHeaderBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.f18052b = relativeLayout;
        this.f18053c = linearLayout;
        this.f18054d = simpleDraweeView;
        this.f18055e = relativeLayout2;
        this.f18056f = textView;
    }

    @NonNull
    public static CollectionSixNewHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.headerViewLl;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.headerViewLl);
        if (linearLayout != null) {
            i4 = R.id.imgBreak;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imgBreak);
            if (simpleDraweeView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.textViewBreak;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textViewBreak);
                if (textView != null) {
                    return new CollectionSixNewHeaderBinding(relativeLayout, linearLayout, simpleDraweeView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CollectionSixNewHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18052b;
    }

    @NonNull
    public static CollectionSixNewHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.collection_six_new_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
