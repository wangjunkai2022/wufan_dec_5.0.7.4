package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemDiscoveryPaiweiGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f21999b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CardView f22000c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22001d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f22002e;

    private ItemDiscoveryPaiweiGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.f21999b = constraintLayout;
        this.f22000c = cardView;
        this.f22001d = simpleDraweeView;
        this.f22002e = simpleDraweeView2;
    }

    @NonNull
    public static ItemDiscoveryPaiweiGameBinding bind(@NonNull View view) {
        int i4 = R.id.flIconGameSmall;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.flIconGameSmall);
        if (cardView != null) {
            i4 = R.id.iconGameBig;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iconGameBig);
            if (simpleDraweeView != null) {
                i4 = R.id.iconGameSmall;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iconGameSmall);
                if (simpleDraweeView2 != null) {
                    return new ItemDiscoveryPaiweiGameBinding((ConstraintLayout) view, cardView, simpleDraweeView, simpleDraweeView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemDiscoveryPaiweiGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f21999b;
    }

    @NonNull
    public static ItemDiscoveryPaiweiGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_discovery_paiwei_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
