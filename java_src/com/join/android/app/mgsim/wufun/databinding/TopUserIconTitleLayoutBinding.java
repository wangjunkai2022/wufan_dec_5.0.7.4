package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyUserIconTitleLayout;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class TopUserIconTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final MyUserIconTitleLayout f26742b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f26743c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26744d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26745e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final VipView f26746f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final MyUserIconTitleLayout f26747g;

    private TopUserIconTitleLayoutBinding(@NonNull MyUserIconTitleLayout myUserIconTitleLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull VipView vipView, @NonNull MyUserIconTitleLayout myUserIconTitleLayout2) {
        this.f26742b = myUserIconTitleLayout;
        this.f26743c = simpleDraweeView;
        this.f26744d = textView;
        this.f26745e = textView2;
        this.f26746f = vipView;
        this.f26747g = myUserIconTitleLayout2;
    }

    @NonNull
    public static TopUserIconTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.papa_user_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.papa_user_icon);
        if (simpleDraweeView != null) {
            i4 = R.id.papa_user_is_in;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.papa_user_is_in);
            if (textView != null) {
                i4 = R.id.papa_user_round;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.papa_user_round);
                if (textView2 != null) {
                    i4 = R.id.papa_vip;
                    VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.papa_vip);
                    if (vipView != null) {
                        MyUserIconTitleLayout myUserIconTitleLayout = (MyUserIconTitleLayout) view;
                        return new TopUserIconTitleLayoutBinding(myUserIconTitleLayout, simpleDraweeView, textView, textView2, vipView, myUserIconTitleLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static TopUserIconTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public MyUserIconTitleLayout getRoot() {
        return this.f26742b;
    }

    @NonNull
    public static TopUserIconTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.top_user_icon_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
