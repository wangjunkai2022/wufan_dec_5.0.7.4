package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutSimulatorLaunchAchievementItemListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23362b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f23363c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f23364d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f23365e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Group f23366f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f23367g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f23368h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f23369i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23370j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23371k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f23372l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f23373m;

    private LayoutSimulatorLaunchAchievementItemListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ProgressBar progressBar, @NonNull Group group, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23362b = constraintLayout;
        this.f23363c = constraintLayout2;
        this.f23364d = simpleDraweeView;
        this.f23365e = progressBar;
        this.f23366f = group;
        this.f23367g = view;
        this.f23368h = view2;
        this.f23369i = view3;
        this.f23370j = textView;
        this.f23371k = textView2;
        this.f23372l = textView3;
        this.f23373m = textView4;
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementItemListBinding bind(@NonNull View view) {
        int i4 = R.id.clContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clContainer);
        if (constraintLayout != null) {
            i4 = R.id.ivAchievement;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAchievement);
            if (simpleDraweeView != null) {
                i4 = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                if (progressBar != null) {
                    i4 = R.id.progressGroup;
                    Group group = (Group) ViewBindings.findChildViewById(view, R.id.progressGroup);
                    if (group != null) {
                        i4 = R.id.treeBall;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.treeBall);
                        if (findChildViewById != null) {
                            i4 = R.id.treeLineBottom;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.treeLineBottom);
                            if (findChildViewById2 != null) {
                                i4 = R.id.treeLineTop;
                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.treeLineTop);
                                if (findChildViewById3 != null) {
                                    i4 = R.id.tvAchievementDesc;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAchievementDesc);
                                    if (textView != null) {
                                        i4 = R.id.tvAchievementName;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAchievementName);
                                        if (textView2 != null) {
                                            i4 = R.id.tvAchievementUnlockPercent;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAchievementUnlockPercent);
                                            if (textView3 != null) {
                                                i4 = R.id.tvProgress;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgress);
                                                if (textView4 != null) {
                                                    return new LayoutSimulatorLaunchAchievementItemListBinding((ConstraintLayout) view, constraintLayout, simpleDraweeView, progressBar, group, findChildViewById, findChildViewById2, findChildViewById3, textView, textView2, textView3, textView4);
                                                }
                                            }
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
    public static LayoutSimulatorLaunchAchievementItemListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23362b;
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementItemListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_launch_achievement_item_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
