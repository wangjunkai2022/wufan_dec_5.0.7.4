package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NewGameExplosionBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25465b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25466c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f25467d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25468e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25469f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25470g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25471h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25472i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25473j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25474k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25475l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25476m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25477n;

    private NewGameExplosionBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.f25465b = linearLayout;
        this.f25466c = linearLayout2;
        this.f25467d = simpleDraweeView;
        this.f25468e = textView;
        this.f25469f = textView2;
        this.f25470g = textView3;
        this.f25471h = textView4;
        this.f25472i = textView5;
        this.f25473j = textView6;
        this.f25474k = textView7;
        this.f25475l = textView8;
        this.f25476m = textView9;
        this.f25477n = textView10;
    }

    @NonNull
    public static NewGameExplosionBinding bind(@NonNull View view) {
        int i4 = R.id.countdownLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.countdownLayout);
        if (linearLayout != null) {
            i4 = R.id.gameIcon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
            if (simpleDraweeView != null) {
                i4 = R.id.gameName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                if (textView != null) {
                    i4 = R.id.installButton;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.installButton);
                    if (textView2 != null) {
                        i4 = R.id.moneyText;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                        if (textView3 != null) {
                            i4 = R.id.openState;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.openState);
                            if (textView4 != null) {
                                i4 = R.id.openTime;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.openTime);
                                if (textView5 != null) {
                                    i4 = R.id.sectionTitle;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.sectionTitle);
                                    if (textView6 != null) {
                                        i4 = R.id.textView10;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView10);
                                        if (textView7 != null) {
                                            i4 = R.id.textView7;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.textView7);
                                            if (textView8 != null) {
                                                i4 = R.id.time_h;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.time_h);
                                                if (textView9 != null) {
                                                    i4 = R.id.time_m;
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.time_m);
                                                    if (textView10 != null) {
                                                        return new NewGameExplosionBinding((LinearLayout) view, linearLayout, simpleDraweeView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static NewGameExplosionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25465b;
    }

    @NonNull
    public static NewGameExplosionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.new_game_explosion, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
