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
public final class PapmainItemTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25884b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25885c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25886d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25887e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25888f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25889g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25890h;

    private PapmainItemTitleLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f25884b = linearLayout;
        this.f25885c = imageView;
        this.f25886d = linearLayout2;
        this.f25887e = relativeLayout;
        this.f25888f = textView;
        this.f25889g = textView2;
        this.f25890h = textView3;
    }

    @NonNull
    public static PapmainItemTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.imageView5;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
        if (imageView != null) {
            i4 = R.id.look_other;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.look_other);
            if (linearLayout != null) {
                i4 = R.id.main;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.main);
                if (relativeLayout != null) {
                    i4 = R.id.subtitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.subtitle);
                    if (textView != null) {
                        i4 = R.id.textView11;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView11);
                        if (textView2 != null) {
                            i4 = R.id.titleText;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                            if (textView3 != null) {
                                return new PapmainItemTitleLayoutBinding((LinearLayout) view, imageView, linearLayout, relativeLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapmainItemTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25884b;
    }

    @NonNull
    public static PapmainItemTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papmain_item_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
