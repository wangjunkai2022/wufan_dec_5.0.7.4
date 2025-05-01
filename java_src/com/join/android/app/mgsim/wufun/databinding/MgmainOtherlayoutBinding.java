package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgmainOtherlayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24724b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f24725c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f24726d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f24727e;

    private MgmainOtherlayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout2) {
        this.f24724b = relativeLayout;
        this.f24725c = mgForumTitleLayoutBinding;
        this.f24726d = simpleDraweeView;
        this.f24727e = relativeLayout2;
    }

    @NonNull
    public static MgmainOtherlayoutBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.coinFloatad);
            if (simpleDraweeView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.mainTop);
                if (relativeLayout != null) {
                    return new MgmainOtherlayoutBinding((RelativeLayout) view, bind, simpleDraweeView, relativeLayout);
                }
                i4 = R.id.mainTop;
            } else {
                i4 = R.id.coinFloatad;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgmainOtherlayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24724b;
    }

    @NonNull
    public static MgmainOtherlayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgmain_otherlayout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
