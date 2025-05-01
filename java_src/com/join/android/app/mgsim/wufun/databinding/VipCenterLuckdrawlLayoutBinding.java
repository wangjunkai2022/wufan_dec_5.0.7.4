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
import com.join.mgps.customview.ScratchView;
/* loaded from: classes3.dex */
public final class VipCenterLuckdrawlLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27082b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f27083c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f27084d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27085e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f27086f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f27087g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27088h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f27089i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f27090j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27091k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ScratchView f27092l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27093m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f27094n;

    private VipCenterLuckdrawlLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView3, @NonNull ScratchView scratchView, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f27082b = linearLayout;
        this.f27083c = simpleDraweeView;
        this.f27084d = linearLayout2;
        this.f27085e = textView;
        this.f27086f = simpleDraweeView2;
        this.f27087g = linearLayout3;
        this.f27088h = textView2;
        this.f27089i = simpleDraweeView3;
        this.f27090j = linearLayout4;
        this.f27091k = textView3;
        this.f27092l = scratchView;
        this.f27093m = textView4;
        this.f27094n = textView5;
    }

    @NonNull
    public static VipCenterLuckdrawlLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.prizeDataImg;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.prizeDataImg);
        if (simpleDraweeView != null) {
            i4 = R.id.prizeDataLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.prizeDataLayout);
            if (linearLayout != null) {
                i4 = R.id.prizeDataName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.prizeDataName);
                if (textView != null) {
                    i4 = R.id.prizeListImg;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.prizeListImg);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.prizeListLayout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.prizeListLayout);
                        if (linearLayout2 != null) {
                            i4 = R.id.prizeListName;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.prizeListName);
                            if (textView2 != null) {
                                i4 = R.id.prizeRuleImg;
                                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.prizeRuleImg);
                                if (simpleDraweeView3 != null) {
                                    i4 = R.id.prizeRuleLayout;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.prizeRuleLayout);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.prizeRuleName;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.prizeRuleName);
                                        if (textView3 != null) {
                                            i4 = R.id.scratch;
                                            ScratchView scratchView = (ScratchView) ViewBindings.findChildViewById(view, R.id.scratch);
                                            if (scratchView != null) {
                                                i4 = R.id.scratchBack;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.scratchBack);
                                                if (textView4 != null) {
                                                    i4 = R.id.todayScratchNumber;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.todayScratchNumber);
                                                    if (textView5 != null) {
                                                        return new VipCenterLuckdrawlLayoutBinding((LinearLayout) view, simpleDraweeView, linearLayout, textView, simpleDraweeView2, linearLayout2, textView2, simpleDraweeView3, linearLayout3, textView3, scratchView, textView4, textView5);
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
    public static VipCenterLuckdrawlLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27082b;
    }

    @NonNull
    public static VipCenterLuckdrawlLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.vip_center_luckdrawl_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
