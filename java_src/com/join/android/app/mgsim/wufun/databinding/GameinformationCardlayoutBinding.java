package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class GameinformationCardlayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21103b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21104c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21105d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f21106e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21107f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21108g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f21109h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21110i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f21111j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21112k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21113l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f21114m;

    private GameinformationCardlayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f21103b = linearLayout;
        this.f21104c = textView;
        this.f21105d = textView2;
        this.f21106e = button;
        this.f21107f = linearLayout2;
        this.f21108g = textView3;
        this.f21109h = simpleDraweeView;
        this.f21110i = textView4;
        this.f21111j = relativeLayout;
        this.f21112k = textView5;
        this.f21113l = textView6;
        this.f21114m = textView7;
    }

    @NonNull
    public static GameinformationCardlayoutBinding bind(@NonNull View view) {
        int i4 = R.id.cardAppSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cardAppSize);
        if (textView != null) {
            i4 = R.id.cardAppname;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.cardAppname);
            if (textView2 != null) {
                i4 = R.id.cardDownButn;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.cardDownButn);
                if (button != null) {
                    i4 = R.id.cardDownNumber;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.cardDownNumber);
                    if (linearLayout != null) {
                        i4 = R.id.cardDownNumberText;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.cardDownNumberText);
                        if (textView3 != null) {
                            i4 = R.id.cardIcon;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.cardIcon);
                            if (simpleDraweeView != null) {
                                i4 = R.id.cardInfo;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.cardInfo);
                                if (textView4 != null) {
                                    i4 = R.id.gameCardLayout;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.gameCardLayout);
                                    if (relativeLayout != null) {
                                        i4 = R.id.moneyText;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                        if (textView5 != null) {
                                            i4 = R.id.textView69;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView69);
                                            if (textView6 != null) {
                                                i4 = R.id.textView70;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView70);
                                                if (textView7 != null) {
                                                    return new GameinformationCardlayoutBinding((LinearLayout) view, textView, textView2, button, linearLayout, textView3, simpleDraweeView, textView4, relativeLayout, textView5, textView6, textView7);
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
    public static GameinformationCardlayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21103b;
    }

    @NonNull
    public static GameinformationCardlayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameinformation_cardlayout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
