package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemMemberFunViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22444b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22445c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22446d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22447e;

    private ItemMemberFunViewBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f22444b = linearLayout;
        this.f22445c = simpleDraweeView;
        this.f22446d = linearLayout2;
        this.f22447e = textView;
    }

    @NonNull
    public static ItemMemberFunViewBinding bind(@NonNull View view) {
        int i4 = R.id.itemMemberFunIv;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.itemMemberFunIv);
        if (simpleDraweeView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.itemMemberFunTx);
            if (textView != null) {
                return new ItemMemberFunViewBinding(linearLayout, simpleDraweeView, linearLayout, textView);
            }
            i4 = R.id.itemMemberFunTx;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemMemberFunViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22444b;
    }

    @NonNull
    public static ItemMemberFunViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_member_fun_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
