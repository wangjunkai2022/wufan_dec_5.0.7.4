package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetailItemOneTouchSkillItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20689b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20690c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20691d;

    private GamedetailItemOneTouchSkillItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f20689b = constraintLayout;
        this.f20690c = linearLayout;
        this.f20691d = textView;
    }

    @NonNull
    public static GamedetailItemOneTouchSkillItemBinding bind(@NonNull View view) {
        int i4 = R.id.list;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.list);
        if (linearLayout != null) {
            i4 = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
            if (textView != null) {
                return new GamedetailItemOneTouchSkillItemBinding((ConstraintLayout) view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetailItemOneTouchSkillItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20689b;
    }

    @NonNull
    public static GamedetailItemOneTouchSkillItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_one_touch_skill_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
