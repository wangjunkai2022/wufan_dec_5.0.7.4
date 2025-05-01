package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
/* loaded from: classes3.dex */
public final class GamedetialMoreServiceLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21086b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView f21087c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f21088d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f21089e;

    private GamedetialMoreServiceLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull XListView xListView, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding, @NonNull View view) {
        this.f21086b = linearLayout;
        this.f21087c = xListView;
        this.f21088d = topbarLeftTitleLayoutBinding;
        this.f21089e = view;
    }

    @NonNull
    public static GamedetialMoreServiceLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.rankListView;
        XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.rankListView);
        if (xListView != null) {
            i4 = R.id.title_bar_layout;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
            if (findChildViewById != null) {
                TopbarLeftTitleLayoutBinding bind = TopbarLeftTitleLayoutBinding.bind(findChildViewById);
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewBg);
                if (findChildViewById2 != null) {
                    return new GamedetialMoreServiceLayoutBinding((LinearLayout) view, xListView, bind, findChildViewById2);
                }
                i4 = R.id.viewBg;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialMoreServiceLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21086b;
    }

    @NonNull
    public static GamedetialMoreServiceLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_more_service_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
