package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.HorizontalRecyclerView;
/* loaded from: classes3.dex */
public final class LayoutSimulatorLaunchAchievementHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23349b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23350c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23351d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23352e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f23353f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final HorizontalRecyclerView f23354g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final HorizontalRecyclerView f23355h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23356i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23357j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23358k;

    private LayoutSimulatorLaunchAchievementHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ProgressBar progressBar, @NonNull HorizontalRecyclerView horizontalRecyclerView, @NonNull HorizontalRecyclerView horizontalRecyclerView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f23349b = constraintLayout;
        this.f23350c = linearLayout;
        this.f23351d = linearLayout2;
        this.f23352e = linearLayout3;
        this.f23353f = progressBar;
        this.f23354g = horizontalRecyclerView;
        this.f23355h = horizontalRecyclerView2;
        this.f23356i = textView;
        this.f23357j = textView2;
        this.f23358k = textView3;
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.llLocked;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llLocked);
        if (linearLayout != null) {
            i4 = R.id.llProgress;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llProgress);
            if (linearLayout2 != null) {
                i4 = R.id.llUnlocked;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llUnlocked);
                if (linearLayout3 != null) {
                    i4 = R.id.progressBar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                    if (progressBar != null) {
                        i4 = R.id.rvAchievementLocked;
                        HorizontalRecyclerView horizontalRecyclerView = (HorizontalRecyclerView) ViewBindings.findChildViewById(view, R.id.rvAchievementLocked);
                        if (horizontalRecyclerView != null) {
                            i4 = R.id.rvAchievementUnlocked;
                            HorizontalRecyclerView horizontalRecyclerView2 = (HorizontalRecyclerView) ViewBindings.findChildViewById(view, R.id.rvAchievementUnlocked);
                            if (horizontalRecyclerView2 != null) {
                                i4 = R.id.tvLockCount;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLockCount);
                                if (textView != null) {
                                    i4 = R.id.tvProgress;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgress);
                                    if (textView2 != null) {
                                        i4 = R.id.tvUnlockCount;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUnlockCount);
                                        if (textView3 != null) {
                                            return new LayoutSimulatorLaunchAchievementHeaderBinding((ConstraintLayout) view, linearLayout, linearLayout2, linearLayout3, progressBar, horizontalRecyclerView, horizontalRecyclerView2, textView, textView2, textView3);
                                        }
                                    }
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
    public static LayoutSimulatorLaunchAchievementHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23349b;
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_launch_achievement_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
