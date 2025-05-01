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
public final class PapapayCenterLeftTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25860b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25861c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25862d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25863e;

    private PapapayCenterLeftTitleBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f25860b = relativeLayout;
        this.f25861c = textView;
        this.f25862d = imageView;
        this.f25863e = textView2;
    }

    @NonNull
    public static PapapayCenterLeftTitleBinding bind(@NonNull View view) {
        int i4 = R.id.aboutPabi;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.aboutPabi);
        if (textView != null) {
            i4 = R.id.back_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
            if (imageView != null) {
                i4 = R.id.title_textview;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                if (textView2 != null) {
                    return new PapapayCenterLeftTitleBinding((RelativeLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapapayCenterLeftTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25860b;
    }

    @NonNull
    public static PapapayCenterLeftTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papapay_center_left_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
