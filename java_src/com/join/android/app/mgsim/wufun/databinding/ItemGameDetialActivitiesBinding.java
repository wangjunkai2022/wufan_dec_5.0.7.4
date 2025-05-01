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
import com.join.mgps.customview.ActivityTabView;
/* loaded from: classes3.dex */
public final class ItemGameDetialActivitiesBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22306b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ActivityTabView f22307c;

    private ItemGameDetialActivitiesBinding(@NonNull LinearLayout linearLayout, @NonNull ActivityTabView activityTabView) {
        this.f22306b = linearLayout;
        this.f22307c = activityTabView;
    }

    @NonNull
    public static ItemGameDetialActivitiesBinding bind(@NonNull View view) {
        ActivityTabView activityTabView = (ActivityTabView) ViewBindings.findChildViewById(view, R.id.atv_activities);
        if (activityTabView != null) {
            return new ItemGameDetialActivitiesBinding((LinearLayout) view, activityTabView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.atv_activities)));
    }

    @NonNull
    public static ItemGameDetialActivitiesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22306b;
    }

    @NonNull
    public static ItemGameDetialActivitiesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_detial_activities, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
