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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class LiveContrybutionSecondthreeItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23530b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23531c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23532d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final VipView f23533e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f23534f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23535g;

    private LiveContrybutionSecondthreeItemLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull VipView vipView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2) {
        this.f23530b = relativeLayout;
        this.f23531c = textView;
        this.f23532d = imageView;
        this.f23533e = vipView;
        this.f23534f = simpleDraweeView;
        this.f23535g = textView2;
    }

    @NonNull
    public static LiveContrybutionSecondthreeItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.contribution;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.contribution);
        if (textView != null) {
            i4 = R.id.numberImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.numberImage);
            if (imageView != null) {
                i4 = R.id.svip;
                VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.svip);
                if (vipView != null) {
                    i4 = R.id.userIcon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.userName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                        if (textView2 != null) {
                            return new LiveContrybutionSecondthreeItemLayoutBinding((RelativeLayout) view, textView, imageView, vipView, simpleDraweeView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LiveContrybutionSecondthreeItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23530b;
    }

    @NonNull
    public static LiveContrybutionSecondthreeItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.live_contrybution_secondthree_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
