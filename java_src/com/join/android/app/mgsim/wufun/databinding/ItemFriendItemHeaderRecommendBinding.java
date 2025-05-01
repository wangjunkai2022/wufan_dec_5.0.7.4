package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemFriendItemHeaderRecommendBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22166b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22167c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22168d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22169e;

    private ItemFriendItemHeaderRecommendBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22166b = constraintLayout;
        this.f22167c = textView;
        this.f22168d = textView2;
        this.f22169e = textView3;
    }

    @NonNull
    public static ItemFriendItemHeaderRecommendBinding bind(@NonNull View view) {
        int i4 = R.id.label;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.label);
        if (textView != null) {
            i4 = R.id.reqPermission;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.reqPermission);
            if (textView2 != null) {
                i4 = R.id.textView105;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView105);
                if (textView3 != null) {
                    return new ItemFriendItemHeaderRecommendBinding((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemFriendItemHeaderRecommendBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22166b;
    }

    @NonNull
    public static ItemFriendItemHeaderRecommendBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_friend_item_header_recommend, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
