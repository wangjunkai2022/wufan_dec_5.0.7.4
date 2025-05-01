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
public final class FavorioseTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19400b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19401c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19402d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19403e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final VipView f19404f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19405g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19406h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f19407i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f19408j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19409k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f19410l;

    private FavorioseTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull VipView vipView, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull ImageView imageView3) {
        this.f19400b = relativeLayout;
        this.f19401c = linearLayout;
        this.f19402d = linearLayout2;
        this.f19403e = imageView;
        this.f19404f = vipView;
        this.f19405g = textView;
        this.f19406h = linearLayout3;
        this.f19407i = imageView2;
        this.f19408j = simpleDraweeView;
        this.f19409k = textView2;
        this.f19410l = imageView3;
    }

    @NonNull
    public static FavorioseTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.f15591b;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.f15591b);
        if (linearLayout != null) {
            i4 = R.id.nameLayout;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.nameLayout);
            if (linearLayout2 != null) {
                i4 = R.id.sexImg;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.sexImg);
                if (imageView != null) {
                    i4 = R.id.svip;
                    VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.svip);
                    if (vipView != null) {
                        i4 = R.id.tipName;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tipName);
                        if (textView != null) {
                            i4 = R.id.tipsLayout;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                            if (linearLayout3 != null) {
                                i4 = R.id.titleImg;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.titleImg);
                                if (imageView2 != null) {
                                    i4 = R.id.userIcon;
                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
                                    if (simpleDraweeView != null) {
                                        i4 = R.id.userName;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                                        if (textView2 != null) {
                                            i4 = R.id.vip;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.vip);
                                            if (imageView3 != null) {
                                                return new FavorioseTitleLayoutBinding((RelativeLayout) view, linearLayout, linearLayout2, imageView, vipView, textView, linearLayout3, imageView2, simpleDraweeView, textView2, imageView3);
                                            }
                                        }
                                    }
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
    public static FavorioseTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19400b;
    }

    @NonNull
    public static FavorioseTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.favoriose_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
