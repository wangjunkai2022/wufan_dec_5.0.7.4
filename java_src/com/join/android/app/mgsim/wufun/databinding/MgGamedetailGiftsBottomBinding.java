package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgGamedetailGiftsBottomBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24462b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24463c;

    private MgGamedetailGiftsBottomBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout) {
        this.f24462b = relativeLayout;
        this.f24463c = linearLayout;
    }

    @NonNull
    public static MgGamedetailGiftsBottomBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutBottom);
        if (linearLayout != null) {
            return new MgGamedetailGiftsBottomBinding((RelativeLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.layoutBottom)));
    }

    @NonNull
    public static MgGamedetailGiftsBottomBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24462b;
    }

    @NonNull
    public static MgGamedetailGiftsBottomBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_gifts_bottom, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
