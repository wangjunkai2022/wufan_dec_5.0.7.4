package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutSimulatorLaunchAchievementItemHorizontalBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23359b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f23360c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23361d;

    private LayoutSimulatorLaunchAchievementItemHorizontalBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView) {
        this.f23359b = linearLayout;
        this.f23360c = simpleDraweeView;
        this.f23361d = textView;
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementItemHorizontalBinding bind(@NonNull View view) {
        int i4 = R.id.ivAchievement;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAchievement);
        if (simpleDraweeView != null) {
            i4 = R.id.tvAchievementDesc;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAchievementDesc);
            if (textView != null) {
                return new LayoutSimulatorLaunchAchievementItemHorizontalBinding((LinearLayout) view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementItemHorizontalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23359b;
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementItemHorizontalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_launch_achievement_item_horizontal, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
