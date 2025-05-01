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
public final class WufungameFirstDownpermissDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f27161b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27162c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27163d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f27164e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f27165f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f27166g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27167h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27168i;

    private WufungameFirstDownpermissDialogBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f27161b = relativeLayout;
        this.f27162c = imageView;
        this.f27163d = textView;
        this.f27164e = simpleDraweeView;
        this.f27165f = linearLayout;
        this.f27166g = relativeLayout2;
        this.f27167h = textView2;
        this.f27168i = textView3;
    }

    @NonNull
    public static WufungameFirstDownpermissDialogBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.gameName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
            if (textView != null) {
                i4 = R.id.img;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
                if (simpleDraweeView != null) {
                    i4 = R.id.main;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                    if (linearLayout != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i4 = R.id.settingInfo;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.settingInfo);
                        if (textView2 != null) {
                            i4 = R.id.startButn;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.startButn);
                            if (textView3 != null) {
                                return new WufungameFirstDownpermissDialogBinding(relativeLayout, imageView, textView, simpleDraweeView, linearLayout, relativeLayout, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static WufungameFirstDownpermissDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f27161b;
    }

    @NonNull
    public static WufungameFirstDownpermissDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.wufungame_first_downpermiss_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
