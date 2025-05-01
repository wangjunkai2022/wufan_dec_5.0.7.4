package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityEndGameSelectBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16070b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f16071c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f16072d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16073e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager2 f16074f;

    private ActivityEndGameSelectBinding(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.f16070b = linearLayout;
        this.f16071c = constraintLayout;
        this.f16072d = recyclerView;
        this.f16073e = textView;
        this.f16074f = viewPager2;
    }

    @NonNull
    public static ActivityEndGameSelectBinding bind(@NonNull View view) {
        int i4 = R.id.outside;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.outside);
        if (constraintLayout != null) {
            i4 = R.id.rvType;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvType);
            if (recyclerView != null) {
                i4 = R.id.tvTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                if (textView != null) {
                    i4 = R.id.viewpager;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.viewpager);
                    if (viewPager2 != null) {
                        return new ActivityEndGameSelectBinding((LinearLayout) view, constraintLayout, recyclerView, textView, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityEndGameSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16070b;
    }

    @NonNull
    public static ActivityEndGameSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_end_game_select, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
