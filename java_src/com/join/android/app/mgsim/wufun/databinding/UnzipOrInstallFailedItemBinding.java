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
public final class UnzipOrInstallFailedItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26815b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26816c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26817d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26818e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26819f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26820g;

    private UnzipOrInstallFailedItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26815b = linearLayout;
        this.f26816c = imageView;
        this.f26817d = linearLayout2;
        this.f26818e = textView;
        this.f26819f = textView2;
        this.f26820g = textView3;
    }

    @NonNull
    public static UnzipOrInstallFailedItemBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
        if (imageView != null) {
            i4 = R.id.main;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
            if (linearLayout != null) {
                i4 = R.id.message;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                if (textView != null) {
                    i4 = R.id.subtitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.subtitle);
                    if (textView2 != null) {
                        i4 = R.id.title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView3 != null) {
                            return new UnzipOrInstallFailedItemBinding((LinearLayout) view, imageView, linearLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static UnzipOrInstallFailedItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26815b;
    }

    @NonNull
    public static UnzipOrInstallFailedItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.unzip_or_install_failed_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
