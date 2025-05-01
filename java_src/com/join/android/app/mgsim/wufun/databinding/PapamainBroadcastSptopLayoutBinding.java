package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainBroadcastSptopLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25697b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f25698c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25699d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25700e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f25701f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25702g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f25703h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25704i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f25705j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25706k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f25707l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f25708m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final FrameLayout f25709n;

    private PapamainBroadcastSptopLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull FrameLayout frameLayout) {
        this.f25697b = relativeLayout;
        this.f25698c = relativeLayout2;
        this.f25699d = textView;
        this.f25700e = relativeLayout3;
        this.f25701f = simpleDraweeView;
        this.f25702g = textView2;
        this.f25703h = simpleDraweeView2;
        this.f25704i = textView3;
        this.f25705j = simpleDraweeView3;
        this.f25706k = textView4;
        this.f25707l = relativeLayout4;
        this.f25708m = relativeLayout5;
        this.f25709n = frameLayout;
    }

    @NonNull
    public static PapamainBroadcastSptopLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.aaa;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.aaa);
        if (relativeLayout != null) {
            i4 = R.id.appname;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname);
            if (textView != null) {
                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                i4 = R.id.bannerView;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.bannerView);
                if (simpleDraweeView != null) {
                    i4 = R.id.describe;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.describe);
                    if (textView2 != null) {
                        i4 = R.id.gameIcon;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.itemInstall;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.itemInstall);
                            if (textView3 != null) {
                                i4 = R.id.loading;
                                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loading);
                                if (simpleDraweeView3 != null) {
                                    i4 = R.id.moneyText;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                    if (textView4 != null) {
                                        i4 = R.id.rLayoutRight;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                        if (relativeLayout3 != null) {
                                            i4 = R.id.topImage;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.topImage);
                                            if (relativeLayout4 != null) {
                                                i4 = R.id.videoContner;
                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContner);
                                                if (frameLayout != null) {
                                                    return new PapamainBroadcastSptopLayoutBinding(relativeLayout2, relativeLayout, textView, relativeLayout2, simpleDraweeView, textView2, simpleDraweeView2, textView3, simpleDraweeView3, textView4, relativeLayout3, relativeLayout4, frameLayout);
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
    public static PapamainBroadcastSptopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25697b;
    }

    @NonNull
    public static PapamainBroadcastSptopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_broadcast_sptop_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
