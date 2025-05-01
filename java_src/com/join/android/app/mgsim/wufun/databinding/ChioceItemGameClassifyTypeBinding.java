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
/* loaded from: classes3.dex */
public final class ChioceItemGameClassifyTypeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17756b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f17757c;

    private ChioceItemGameClassifyTypeBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f17756b = linearLayout;
        this.f17757c = linearLayout2;
    }

    @NonNull
    public static ChioceItemGameClassifyTypeBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.classifies);
        if (linearLayout != null) {
            return new ChioceItemGameClassifyTypeBinding((LinearLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.classifies)));
    }

    @NonNull
    public static ChioceItemGameClassifyTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17756b;
    }

    @NonNull
    public static ChioceItemGameClassifyTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_game_classify_type, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
