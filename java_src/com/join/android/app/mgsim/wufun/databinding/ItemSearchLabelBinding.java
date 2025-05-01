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
public final class ItemSearchLabelBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22711b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22712c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22713d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22714e;

    private ItemSearchLabelBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22711b = linearLayout;
        this.f22712c = simpleDraweeView;
        this.f22713d = textView;
        this.f22714e = textView2;
    }

    @NonNull
    public static ItemSearchLabelBinding bind(@NonNull View view) {
        int i4 = R.id.iv_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_icon);
        if (simpleDraweeView != null) {
            i4 = R.id.tv_count;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_count);
            if (textView != null) {
                i4 = R.id.tv_label_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_name);
                if (textView2 != null) {
                    return new ItemSearchLabelBinding((LinearLayout) view, simpleDraweeView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemSearchLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22711b;
    }

    @NonNull
    public static ItemSearchLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_search_label, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
