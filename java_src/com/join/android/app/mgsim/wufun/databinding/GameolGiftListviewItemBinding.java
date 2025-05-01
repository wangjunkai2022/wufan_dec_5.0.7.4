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
public final class GameolGiftListviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21220b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21221c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21222d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21223e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f21224f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f21225g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f21226h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21227i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f21228j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21229k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f21230l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f21231m;

    private GameolGiftListviewItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3) {
        this.f21220b = relativeLayout;
        this.f21221c = textView;
        this.f21222d = textView2;
        this.f21223e = textView3;
        this.f21224f = imageView;
        this.f21225g = view;
        this.f21226h = linearLayout;
        this.f21227i = textView4;
        this.f21228j = simpleDraweeView;
        this.f21229k = textView5;
        this.f21230l = relativeLayout2;
        this.f21231m = relativeLayout3;
    }

    @NonNull
    public static GameolGiftListviewItemBinding bind(@NonNull View view) {
        int i4 = R.id.GiftCount;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.GiftCount);
        if (textView != null) {
            i4 = R.id.GiftEndTime;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.GiftEndTime);
            if (textView2 != null) {
                i4 = R.id.GiftSurplus;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.GiftSurplus);
                if (textView3 != null) {
                    i4 = R.id.giftPackageSwich;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwich);
                    if (imageView != null) {
                        i4 = R.id.line;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                        if (findChildViewById != null) {
                            i4 = R.id.linearLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                            if (linearLayout != null) {
                                i4 = R.id.mgListviewItemAppname;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemAppname);
                                if (textView4 != null) {
                                    i4 = R.id.mgListviewItemIcon;
                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.mgListviewItemIcon);
                                    if (simpleDraweeView != null) {
                                        i4 = R.id.mgListviewItemInstall;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
                                        if (textView5 != null) {
                                            i4 = R.id.rLayoutRight;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                            if (relativeLayout != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                return new GameolGiftListviewItemBinding(relativeLayout2, textView, textView2, textView3, imageView, findChildViewById, linearLayout, textView4, simpleDraweeView, textView5, relativeLayout, relativeLayout2);
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
    public static GameolGiftListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21220b;
    }

    @NonNull
    public static GameolGiftListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameol_gift_listview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
