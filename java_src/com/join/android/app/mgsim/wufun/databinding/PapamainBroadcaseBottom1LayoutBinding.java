package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class PapamainBroadcaseBottom1LayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25664b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25665c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25666d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25667e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f25668f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f25669g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25670h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f25671i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25672j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25673k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25674l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25675m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f25676n;

    private PapamainBroadcaseBottom1LayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull RelativeLayout relativeLayout2) {
        this.f25664b = linearLayout;
        this.f25665c = textView;
        this.f25666d = textView2;
        this.f25667e = textView3;
        this.f25668f = simpleDraweeView;
        this.f25669g = relativeLayout;
        this.f25670h = linearLayout2;
        this.f25671i = simpleDraweeView2;
        this.f25672j = textView4;
        this.f25673k = textView5;
        this.f25674l = textView6;
        this.f25675m = textView7;
        this.f25676n = relativeLayout2;
    }

    @NonNull
    public static PapamainBroadcaseBottom1LayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.appname;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appname);
            if (textView2 != null) {
                i4 = R.id.emptyView;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.emptyView);
                if (textView3 != null) {
                    i4 = R.id.gameIcon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.gameLayout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.gameLayout);
                        if (relativeLayout != null) {
                            i4 = R.id.gamebroadcastbottom1;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gamebroadcastbottom1);
                            if (linearLayout != null) {
                                i4 = R.id.gamebroadcastbottom1Image;
                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastbottom1Image);
                                if (simpleDraweeView2 != null) {
                                    i4 = R.id.gamebroadcastbottom1Text1;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.gamebroadcastbottom1Text1);
                                    if (textView4 != null) {
                                        i4 = R.id.gamebroadcastbottom1Text2;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.gamebroadcastbottom1Text2);
                                        if (textView5 != null) {
                                            i4 = R.id.itemInstall;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.itemInstall);
                                            if (textView6 != null) {
                                                i4 = R.id.moneyText;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                if (textView7 != null) {
                                                    i4 = R.id.rLayoutRight;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                    if (relativeLayout2 != null) {
                                                        return new PapamainBroadcaseBottom1LayoutBinding((LinearLayout) view, textView, textView2, textView3, simpleDraweeView, relativeLayout, linearLayout, simpleDraweeView2, textView4, textView5, textView6, textView7, relativeLayout2);
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
    public static PapamainBroadcaseBottom1LayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25664b;
    }

    @NonNull
    public static PapamainBroadcaseBottom1LayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_broadcase_bottom1_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
