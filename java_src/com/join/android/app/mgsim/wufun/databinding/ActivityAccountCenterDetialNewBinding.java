package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityAccountCenterDetialNewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CoordinatorLayout f15690b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final AppBarLayout f15691c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CoordinatorLayout f15692d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f15693e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15694f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f15695g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f15696h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f15697i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f15698j;

    private ActivityAccountCenterDetialNewBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView2) {
        this.f15690b = coordinatorLayout;
        this.f15691c = appBarLayout;
        this.f15692d = coordinatorLayout2;
        this.f15693e = recyclerView;
        this.f15694f = textView;
        this.f15695g = linearLayout;
        this.f15696h = simpleDraweeView;
        this.f15697i = simpleDraweeView2;
        this.f15698j = textView2;
    }

    @NonNull
    public static ActivityAccountCenterDetialNewBinding bind(@NonNull View view) {
        int i4 = R.id.appBarLayout2;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appBarLayout2);
        if (appBarLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i4 = R.id.recycleView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recycleView);
            if (recyclerView != null) {
                i4 = R.id.tipName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tipName);
                if (textView != null) {
                    i4 = R.id.tipsLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                    if (linearLayout != null) {
                        i4 = R.id.titleImg;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.titleImg);
                        if (simpleDraweeView != null) {
                            i4 = R.id.userIcon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIcon);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.userName;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                                if (textView2 != null) {
                                    return new ActivityAccountCenterDetialNewBinding(coordinatorLayout, appBarLayout, coordinatorLayout, recyclerView, textView, linearLayout, simpleDraweeView, simpleDraweeView2, textView2);
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
    public static ActivityAccountCenterDetialNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CoordinatorLayout getRoot() {
        return this.f15690b;
    }

    @NonNull
    public static ActivityAccountCenterDetialNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_account_center_detial_new, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
