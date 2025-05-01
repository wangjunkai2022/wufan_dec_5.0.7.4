package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CustomerNotitficationLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18303b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18304c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f18305d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18306e;

    private CustomerNotitficationLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull TextView textView) {
        this.f18303b = relativeLayout;
        this.f18304c = imageView;
        this.f18305d = progressBar;
        this.f18306e = textView;
    }

    @NonNull
    public static CustomerNotitficationLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
        if (imageView != null) {
            i4 = R.id.pb_progress;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress);
            if (progressBar != null) {
                i4 = R.id.title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                if (textView != null) {
                    return new CustomerNotitficationLayoutBinding((RelativeLayout) view, imageView, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CustomerNotitficationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18303b;
    }

    @NonNull
    public static CustomerNotitficationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.customer_notitfication_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
