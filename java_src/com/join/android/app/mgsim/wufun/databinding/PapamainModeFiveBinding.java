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
public final class PapamainModeFiveBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25774b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25775c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25776d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f25777e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f25778f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25779g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f25780h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f25781i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f25782j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25783k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25784l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f25785m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f25786n;

    private PapamainModeFiveBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout3) {
        this.f25774b = linearLayout;
        this.f25775c = textView;
        this.f25776d = textView2;
        this.f25777e = simpleDraweeView;
        this.f25778f = relativeLayout;
        this.f25779g = linearLayout2;
        this.f25780h = simpleDraweeView2;
        this.f25781i = simpleDraweeView3;
        this.f25782j = simpleDraweeView4;
        this.f25783k = textView3;
        this.f25784l = textView4;
        this.f25785m = relativeLayout2;
        this.f25786n = linearLayout3;
    }

    @NonNull
    public static PapamainModeFiveBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.appname;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appname);
            if (textView2 != null) {
                i4 = R.id.gameIcon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                if (simpleDraweeView != null) {
                    i4 = R.id.gameLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.gameLayout);
                    if (relativeLayout != null) {
                        i4 = R.id.gamebroadcastTop;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gamebroadcastTop);
                        if (linearLayout != null) {
                            i4 = R.id.gamebroadcastTopImage1;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastTopImage1);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.gamebroadcastTopImage2;
                                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastTopImage2);
                                if (simpleDraweeView3 != null) {
                                    i4 = R.id.gamebroadcastTopImage3;
                                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastTopImage3);
                                    if (simpleDraweeView4 != null) {
                                        i4 = R.id.itemInstall;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.itemInstall);
                                        if (textView3 != null) {
                                            i4 = R.id.moneyText;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                            if (textView4 != null) {
                                                i4 = R.id.rLayoutRight;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                if (relativeLayout2 != null) {
                                                    i4 = R.id.tipsLayout;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                    if (linearLayout2 != null) {
                                                        return new PapamainModeFiveBinding((LinearLayout) view, textView, textView2, simpleDraweeView, relativeLayout, linearLayout, simpleDraweeView2, simpleDraweeView3, simpleDraweeView4, textView3, textView4, relativeLayout2, linearLayout2);
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
    public static PapamainModeFiveBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25774b;
    }

    @NonNull
    public static PapamainModeFiveBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_mode_five, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
