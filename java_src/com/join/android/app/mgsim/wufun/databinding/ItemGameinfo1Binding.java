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
public final class ItemGameinfo1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22355b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22356c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22357d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22358e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22359f;

    private ItemGameinfo1Binding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22355b = linearLayout;
        this.f22356c = simpleDraweeView;
        this.f22357d = linearLayout2;
        this.f22358e = textView;
        this.f22359f = textView2;
    }

    @NonNull
    public static ItemGameinfo1Binding bind(@NonNull View view) {
        int i4 = R.id.iv_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_icon);
        if (simpleDraweeView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i4 = R.id.tv_gameName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gameName);
            if (textView != null) {
                i4 = R.id.tv_roomCounts;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_roomCounts);
                if (textView2 != null) {
                    return new ItemGameinfo1Binding(linearLayout, simpleDraweeView, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameinfo1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22355b;
    }

    @NonNull
    public static ItemGameinfo1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_gameinfo_1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
