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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ModTabLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24965b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24966c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f24967d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f24968e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f24969f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24970g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24971h;

    private ModTabLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f24965b = relativeLayout;
        this.f24966c = imageView;
        this.f24967d = simpleDraweeView;
        this.f24968e = linearLayout;
        this.f24969f = relativeLayout2;
        this.f24970g = textView;
        this.f24971h = textView2;
    }

    @NonNull
    public static ModTabLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
        if (imageView != null) {
            i4 = R.id.icon_gif;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon_gif);
            if (simpleDraweeView != null) {
                i4 = R.id.llMain;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llMain);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i4 = R.id.name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                    if (textView != null) {
                        i4 = R.id.tvRedPoint;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRedPoint);
                        if (textView2 != null) {
                            return new ModTabLayoutBinding(relativeLayout, imageView, simpleDraweeView, linearLayout, relativeLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ModTabLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24965b;
    }

    @NonNull
    public static ModTabLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mod_tab_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
