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
public final class GamedetailItemGiftsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20589b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20590c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20591d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20592e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f20593f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20594g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f20595h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20596i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20597j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f20598k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f20599l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f20600m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f20601n;

    private GamedetailItemGiftsBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull ImageView imageView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2) {
        this.f20589b = relativeLayout;
        this.f20590c = textView;
        this.f20591d = textView2;
        this.f20592e = textView3;
        this.f20593f = simpleDraweeView;
        this.f20594g = textView4;
        this.f20595h = imageView;
        this.f20596i = textView5;
        this.f20597j = textView6;
        this.f20598k = view;
        this.f20599l = linearLayout;
        this.f20600m = linearLayout2;
        this.f20601n = relativeLayout2;
    }

    @NonNull
    public static GamedetailItemGiftsBinding bind(@NonNull View view) {
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
                                                        return new GamedetailItemGiftsBinding((RelativeLayout) view, textView, textView2, textView3, simpleDraweeView, textView4, imageView, textView5, textView6, findChildViewById, linearLayout, linearLayout2, relativeLayout);
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
    public static GamedetailItemGiftsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20589b;
    }

    @NonNull
    public static GamedetailItemGiftsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_gifts, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
