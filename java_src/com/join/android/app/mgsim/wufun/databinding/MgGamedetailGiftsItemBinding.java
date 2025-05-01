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
public final class MgGamedetailGiftsItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24464b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24465c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24466d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24467e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f24468f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24469g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24470h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24471i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24472j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f24473k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f24474l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f24475m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f24476n;

    private MgGamedetailGiftsItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull ImageView imageView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2) {
        this.f24464b = relativeLayout;
        this.f24465c = textView;
        this.f24466d = textView2;
        this.f24467e = textView3;
        this.f24468f = simpleDraweeView;
        this.f24469g = textView4;
        this.f24470h = imageView;
        this.f24471i = textView5;
        this.f24472j = textView6;
        this.f24473k = view;
        this.f24474l = linearLayout;
        this.f24475m = linearLayout2;
        this.f24476n = relativeLayout2;
    }

    @NonNull
    public static MgGamedetailGiftsItemBinding bind(@NonNull View view) {
        int i4 = R.id.getGiftTextView;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.getGiftTextView);
        if (textView != null) {
            i4 = R.id.giftContent;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.giftContent);
            if (textView2 != null) {
                i4 = R.id.giftCount;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.giftCount);
                if (textView3 != null) {
                    i4 = R.id.giftIcon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.giftIcon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.giftName;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.giftName);
                        if (textView4 != null) {
                            i4 = R.id.giftPackageSwich;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwich);
                            if (imageView != null) {
                                i4 = R.id.giftSurplus;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.giftSurplus);
                                if (textView5 != null) {
                                    i4 = R.id.giftSurplusTitle;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.giftSurplusTitle);
                                    if (textView6 != null) {
                                        i4 = R.id.itemLine;
                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.itemLine);
                                        if (findChildViewById != null) {
                                            i4 = R.id.layoutContent;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutContent);
                                            if (linearLayout != null) {
                                                i4 = R.id.linearLayout;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                                                if (linearLayout2 != null) {
                                                    i4 = R.id.rightButnLayout;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rightButnLayout);
                                                    if (relativeLayout != null) {
                                                        return new MgGamedetailGiftsItemBinding((RelativeLayout) view, textView, textView2, textView3, simpleDraweeView, textView4, imageView, textView5, textView6, findChildViewById, linearLayout, linearLayout2, relativeLayout);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGamedetailGiftsItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24464b;
    }

    @NonNull
    public static MgGamedetailGiftsItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_gifts_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
