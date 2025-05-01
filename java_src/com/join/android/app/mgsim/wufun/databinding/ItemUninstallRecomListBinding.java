package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemUninstallRecomListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22904b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22905c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22906d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22907e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22908f;

    private ItemUninstallRecomListBinding(@NonNull CardView cardView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22904b = cardView;
        this.f22905c = simpleDraweeView;
        this.f22906d = textView;
        this.f22907e = textView2;
        this.f22908f = textView3;
    }

    @NonNull
    public static ItemUninstallRecomListBinding bind(@NonNull View view) {
        int i4 = R.id.gamePic;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamePic);
        if (simpleDraweeView != null) {
            i4 = R.id.tvGameName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
            if (textView != null) {
                i4 = R.id.tvLaunch;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLaunch);
                if (textView2 != null) {
                    i4 = R.id.tvTag;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTag);
                    if (textView3 != null) {
                        return new ItemUninstallRecomListBinding((CardView) view, simpleDraweeView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemUninstallRecomListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22904b;
    }

    @NonNull
    public static ItemUninstallRecomListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_uninstall_recom_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
