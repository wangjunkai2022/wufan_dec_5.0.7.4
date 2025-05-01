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
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class GameBuildBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20216b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f20217c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20218d;

    private GameBuildBinding(@NonNull LinearLayout linearLayout, @NonNull XListView2 xListView2, @NonNull LinearLayout linearLayout2) {
        this.f20216b = linearLayout;
        this.f20217c = xListView2;
        this.f20218d = linearLayout2;
    }

    @NonNull
    public static GameBuildBinding bind(@NonNull View view) {
        int i4 = R.id.listview;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
        if (xListView2 != null) {
            i4 = R.id.tv_nodata;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tv_nodata);
            if (linearLayout != null) {
                return new GameBuildBinding((LinearLayout) view, xListView2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameBuildBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20216b;
    }

    @NonNull
    public static GameBuildBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_build, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
