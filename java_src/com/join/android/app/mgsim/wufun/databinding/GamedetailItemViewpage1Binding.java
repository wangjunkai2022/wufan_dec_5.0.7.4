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
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class GamedetailItemViewpage1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20793b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20794c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20795d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final HListView f20796e;

    private GamedetailItemViewpage1Binding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull HListView hListView) {
        this.f20793b = linearLayout;
        this.f20794c = linearLayout2;
        this.f20795d = linearLayout3;
        this.f20796e = hListView;
    }

    @NonNull
    public static GamedetailItemViewpage1Binding bind(@NonNull View view) {
        int i4 = R.id.backLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.screenListView);
            if (hListView != null) {
                return new GamedetailItemViewpage1Binding(linearLayout2, linearLayout, linearLayout2, hListView);
            }
            i4 = R.id.screenListView;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetailItemViewpage1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20793b;
    }

    @NonNull
    public static GamedetailItemViewpage1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_viewpage1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
