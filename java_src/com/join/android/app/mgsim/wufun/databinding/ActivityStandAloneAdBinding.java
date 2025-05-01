package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityStandAloneAdBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17081b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f17082c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17083d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17084e;

    private ActivityStandAloneAdBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f17081b = linearLayout;
        this.f17082c = relativeLayout;
        this.f17083d = imageView;
        this.f17084e = textView;
    }

    @NonNull
    public static ActivityStandAloneAdBinding bind(@NonNull View view) {
        int i4 = R.id.adRl;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.adRl);
        if (relativeLayout != null) {
            i4 = R.id.localIv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.localIv);
            if (imageView != null) {
                i4 = R.id.timeTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.timeTv);
                if (textView != null) {
                    return new ActivityStandAloneAdBinding((LinearLayout) view, relativeLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityStandAloneAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17081b;
    }

    @NonNull
    public static ActivityStandAloneAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_stand_alone_ad, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
