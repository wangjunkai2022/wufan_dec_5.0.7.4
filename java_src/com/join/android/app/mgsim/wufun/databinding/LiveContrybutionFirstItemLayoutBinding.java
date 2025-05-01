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
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class LiveContrybutionFirstItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23522b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23523c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23524d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23525e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f23526f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final VipView f23527g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23528h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f23529i;

    private LiveContrybutionFirstItemLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull VipView vipView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f23522b = relativeLayout;
        this.f23523c = imageView;
        this.f23524d = textView;
        this.f23525e = imageView2;
        this.f23526f = linearLayout;
        this.f23527g = vipView;
        this.f23528h = textView2;
        this.f23529i = simpleDraweeView;
    }

    @NonNull
    public static LiveContrybutionFirstItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.backImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i4 = R.id.contrybution;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.contrybution);
            if (textView != null) {
                i4 = R.id.imageViewMuberOne;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageViewMuberOne);
                if (imageView2 != null) {
                    i4 = R.id.ll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll);
                    if (linearLayout != null) {
                        i4 = R.id.svip;
                        VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.svip);
                        if (vipView != null) {
                            i4 = R.id.userName;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                            if (textView2 != null) {
                                i4 = R.id.usericon;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.usericon);
                                if (simpleDraweeView != null) {
                                    return new LiveContrybutionFirstItemLayoutBinding((RelativeLayout) view, imageView, textView, imageView2, linearLayout, vipView, textView2, simpleDraweeView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LiveContrybutionFirstItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23522b;
    }

    @NonNull
    public static LiveContrybutionFirstItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.live_contrybution_first_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
