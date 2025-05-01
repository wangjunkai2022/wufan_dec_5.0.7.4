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
public final class ItemInfoStreamAdTtBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22398b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f22399c;

    private ItemInfoStreamAdTtBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout) {
        this.f22398b = relativeLayout;
        this.f22399c = linearLayout;
    }

    @NonNull
    public static ItemInfoStreamAdTtBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.express_ad_container);
        if (linearLayout != null) {
            return new ItemInfoStreamAdTtBinding((RelativeLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.express_ad_container)));
    }

    @NonNull
    public static ItemInfoStreamAdTtBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22398b;
    }

    @NonNull
    public static ItemInfoStreamAdTtBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_info_stream_ad_tt, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
