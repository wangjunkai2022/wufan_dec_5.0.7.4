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
public final class InformationContentItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21560b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f21561c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f21562d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21563e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21564f;

    private InformationContentItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f21560b = relativeLayout;
        this.f21561c = simpleDraweeView;
        this.f21562d = relativeLayout2;
        this.f21563e = textView;
        this.f21564f = textView2;
    }

    @NonNull
    public static InformationContentItemBinding bind(@NonNull View view) {
        int i4 = R.id.imageAd;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imageAd);
        if (simpleDraweeView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i4 = R.id.tvPraise;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPraise);
            if (textView != null) {
                i4 = R.id.tvTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                if (textView2 != null) {
                    return new InformationContentItemBinding(relativeLayout, simpleDraweeView, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InformationContentItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21560b;
    }

    @NonNull
    public static InformationContentItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.information_content_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
