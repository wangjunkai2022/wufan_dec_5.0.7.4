package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogModDownloadNewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18863b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18864c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18865d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f18866e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18867f;

    private DialogModDownloadNewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2) {
        this.f18863b = linearLayout;
        this.f18864c = imageView;
        this.f18865d = textView;
        this.f18866e = imageView2;
        this.f18867f = textView2;
    }

    @NonNull
    public static DialogModDownloadNewBinding bind(@NonNull View view) {
        int i4 = R.id.centerImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.centerImage);
        if (imageView != null) {
            i4 = R.id.centerText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.centerText);
            if (textView != null) {
                i4 = R.id.iv_close;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
                if (imageView2 != null) {
                    i4 = R.id.tv_mod_opt_right;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_opt_right);
                    if (textView2 != null) {
                        return new DialogModDownloadNewBinding((LinearLayout) view, imageView, textView, imageView2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogModDownloadNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18863b;
    }

    @NonNull
    public static DialogModDownloadNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_download_new, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
