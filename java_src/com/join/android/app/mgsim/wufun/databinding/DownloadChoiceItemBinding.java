package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DownloadChoiceItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19155b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19156c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19157d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f19158e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19159f;

    private DownloadChoiceItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2) {
        this.f19155b = relativeLayout;
        this.f19156c = textView;
        this.f19157d = imageView;
        this.f19158e = relativeLayout2;
        this.f19159f = textView2;
    }

    @NonNull
    public static DownloadChoiceItemBinding bind(@NonNull View view) {
        int i4 = R.id.downUrlName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.downUrlName);
        if (textView != null) {
            i4 = R.id.imageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
            if (imageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.textView;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                if (textView2 != null) {
                    return new DownloadChoiceItemBinding(relativeLayout, textView, imageView, relativeLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DownloadChoiceItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19155b;
    }

    @NonNull
    public static DownloadChoiceItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_choice_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
