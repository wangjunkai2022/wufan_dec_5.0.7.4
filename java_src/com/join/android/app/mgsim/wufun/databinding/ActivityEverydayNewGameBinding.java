package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView4NewGame;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class ActivityEverydayNewGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16090b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f16091c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView4NewGame f16092d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ForumLoadingView f16093e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final PtrClassicFrameLayout f16094f;

    private ActivityEverydayNewGameBinding(@NonNull RelativeLayout relativeLayout, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding, @NonNull XListView4NewGame xListView4NewGame, @NonNull ForumLoadingView forumLoadingView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout) {
        this.f16090b = relativeLayout;
        this.f16091c = topbarLeftTitleLayoutBinding;
        this.f16092d = xListView4NewGame;
        this.f16093e = forumLoadingView;
        this.f16094f = ptrClassicFrameLayout;
    }

    @NonNull
    public static ActivityEverydayNewGameBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            TopbarLeftTitleLayoutBinding bind = TopbarLeftTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.listView;
            XListView4NewGame xListView4NewGame = (XListView4NewGame) ViewBindings.findChildViewById(view, R.id.listView);
            if (xListView4NewGame != null) {
                i4 = R.id.loadingView;
                ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                if (forumLoadingView != null) {
                    i4 = R.id.mPtrFrame;
                    PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                    if (ptrClassicFrameLayout != null) {
                        return new ActivityEverydayNewGameBinding((RelativeLayout) view, bind, xListView4NewGame, forumLoadingView, ptrClassicFrameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityEverydayNewGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16090b;
    }

    @NonNull
    public static ActivityEverydayNewGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_everyday_new_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
