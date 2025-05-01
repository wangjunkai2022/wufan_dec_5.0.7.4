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
public final class LayoutSimulatorAchievementListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23328b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f23329c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23330d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23331e;

    private LayoutSimulatorAchievementListItemBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23328b = linearLayout;
        this.f23329c = simpleDraweeView;
        this.f23330d = textView;
        this.f23331e = textView2;
    }

    @NonNull
    public static LayoutSimulatorAchievementListItemBinding bind(@NonNull View view) {
        int i4 = R.id.ivAchievement;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAchievement);
        if (simpleDraweeView != null) {
            i4 = R.id.tvAchievement;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAchievement);
            if (textView != null) {
                i4 = R.id.tvUnlockPercent;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUnlockPercent);
                if (textView2 != null) {
                    return new LayoutSimulatorAchievementListItemBinding((LinearLayout) view, simpleDraweeView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSimulatorAchievementListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23328b;
    }

    @NonNull
    public static LayoutSimulatorAchievementListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_achievement_list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
