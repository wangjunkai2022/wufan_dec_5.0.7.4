package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemSearchMiniProgramBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22755b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22756c;

    private ItemSearchMiniProgramBinding(@NonNull CardView cardView, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f22755b = cardView;
        this.f22756c = simpleDraweeView;
    }

    @NonNull
    public static ItemSearchMiniProgramBinding bind(@NonNull View view) {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
        if (simpleDraweeView != null) {
            return new ItemSearchMiniProgramBinding((CardView) view, simpleDraweeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.sdv_image)));
    }

    @NonNull
    public static ItemSearchMiniProgramBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22755b;
    }

    @NonNull
    public static ItemSearchMiniProgramBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_search_mini_program, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
