package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutSimulatorLaunchAchievementItemTimeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23374b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23375c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CardView f23376d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23377e;

    private LayoutSimulatorLaunchAchievementItemTimeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull CardView cardView, @NonNull TextView textView) {
        this.f23374b = constraintLayout;
        this.f23375c = imageView;
        this.f23376d = cardView;
        this.f23377e = textView;
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementItemTimeBinding bind(@NonNull View view) {
        int i4 = R.id.chooseType;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.chooseType);
        if (imageView != null) {
            i4 = R.id.tagView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.tagView);
            if (cardView != null) {
                i4 = R.id.tvTimeDesc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTimeDesc);
                if (textView != null) {
                    return new LayoutSimulatorLaunchAchievementItemTimeBinding((ConstraintLayout) view, imageView, cardView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementItemTimeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23374b;
    }

    @NonNull
    public static LayoutSimulatorLaunchAchievementItemTimeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_launch_achievement_item_time, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
