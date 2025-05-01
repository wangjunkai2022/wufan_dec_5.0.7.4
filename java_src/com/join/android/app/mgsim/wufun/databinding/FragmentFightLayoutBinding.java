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
import com.join.mgps.customview.MViewpagerV4;
/* loaded from: classes3.dex */
public final class FragmentFightLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19765b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19766c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MViewpagerV4 f19767d;

    private FragmentFightLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull MViewpagerV4 mViewpagerV4) {
        this.f19765b = linearLayout;
        this.f19766c = linearLayout2;
        this.f19767d = mViewpagerV4;
    }

    @NonNull
    public static FragmentFightLayoutBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        MViewpagerV4 mViewpagerV4 = (MViewpagerV4) ViewBindings.findChildViewById(view, R.id.mViewpagerV4);
        if (mViewpagerV4 != null) {
            return new FragmentFightLayoutBinding(linearLayout, linearLayout, mViewpagerV4);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.mViewpagerV4)));
    }

    @NonNull
    public static FragmentFightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19765b;
    }

    @NonNull
    public static FragmentFightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fight_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
