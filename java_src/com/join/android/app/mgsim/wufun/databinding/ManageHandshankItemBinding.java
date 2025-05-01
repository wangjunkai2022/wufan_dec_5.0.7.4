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
public final class ManageHandshankItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23643b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23644c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23645d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23646e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f23647f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23648g;

    private ManageHandshankItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2) {
        this.f23643b = linearLayout;
        this.f23644c = imageView;
        this.f23645d = textView;
        this.f23646e = imageView2;
        this.f23647f = relativeLayout;
        this.f23648g = textView2;
    }

    @NonNull
    public static ManageHandshankItemBinding bind(@NonNull View view) {
        int i4 = R.id.arrowImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowImage);
        if (imageView != null) {
            i4 = R.id.itemCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.itemCount);
            if (textView != null) {
                i4 = R.id.itemImage;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.itemImage);
                if (imageView2 != null) {
                    i4 = R.id.itemLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.itemLayout);
                    if (relativeLayout != null) {
                        i4 = R.id.zzz;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.zzz);
                        if (textView2 != null) {
                            return new ManageHandshankItemBinding((LinearLayout) view, imageView, textView, imageView2, relativeLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ManageHandshankItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23643b;
    }

    @NonNull
    public static ManageHandshankItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.manage_handshank_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
