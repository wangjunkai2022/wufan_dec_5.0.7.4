package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class LiveContributionOtherItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23512b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23513c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23514d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final VipView f23515e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f23516f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23517g;

    private LiveContributionOtherItemLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull VipView vipView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3) {
        this.f23512b = relativeLayout;
        this.f23513c = textView;
        this.f23514d = textView2;
        this.f23515e = vipView;
        this.f23516f = simpleDraweeView;
        this.f23517g = textView3;
    }

    @NonNull
    public static LiveContributionOtherItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.contribution;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.contribution);
        if (textView != null) {
            i4 = R.id.numberText;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.numberText);
            if (textView2 != null) {
                i4 = R.id.svip;
                VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.svip);
                if (vipView != null) {
                    i4 = R.id.userIcon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.userName;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                        if (textView3 != null) {
                            return new LiveContributionOtherItemLayoutBinding((RelativeLayout) view, textView, textView2, vipView, simpleDraweeView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LiveContributionOtherItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23512b;
    }

    @NonNull
    public static LiveContributionOtherItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.live_contribution_other_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
