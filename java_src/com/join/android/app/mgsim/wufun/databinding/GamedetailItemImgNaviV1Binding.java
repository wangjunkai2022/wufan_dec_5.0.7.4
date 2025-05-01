package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MViewpagerV4;
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class GamedetailItemImgNaviV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20680b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HListView f20681c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20682d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final MViewpagerV4 f20683e;

    private GamedetailItemImgNaviV1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull HListView hListView, @NonNull LinearLayout linearLayout, @NonNull MViewpagerV4 mViewpagerV4) {
        this.f20680b = constraintLayout;
        this.f20681c = hListView;
        this.f20682d = linearLayout;
        this.f20683e = mViewpagerV4;
    }

    @NonNull
    public static GamedetailItemImgNaviV1Binding bind(@NonNull View view) {
        int i4 = R.id.hlv_top_list;
        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.hlv_top_list);
        if (hListView != null) {
            i4 = R.id.ll_top_images;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_top_images);
            if (linearLayout != null) {
                i4 = R.id.viewPager1;
                MViewpagerV4 mViewpagerV4 = (MViewpagerV4) ViewBindings.findChildViewById(view, R.id.viewPager1);
                if (mViewpagerV4 != null) {
                    return new GamedetailItemImgNaviV1Binding((ConstraintLayout) view, hListView, linearLayout, mViewpagerV4);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetailItemImgNaviV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20680b;
    }

    @NonNull
    public static GamedetailItemImgNaviV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_img_navi_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
