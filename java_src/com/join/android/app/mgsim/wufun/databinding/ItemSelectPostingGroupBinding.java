package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemSelectPostingGroupBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22761b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22762c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22763d;

    private ItemSelectPostingGroupBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f22761b = linearLayout;
        this.f22762c = imageView;
        this.f22763d = textView;
    }

    @NonNull
    public static ItemSelectPostingGroupBinding bind(@NonNull View view) {
        int i4 = R.id.iv_selected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_selected);
        if (imageView != null) {
            i4 = R.id.tv_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
            if (textView != null) {
                return new ItemSelectPostingGroupBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemSelectPostingGroupBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22761b;
    }

    @NonNull
    public static ItemSelectPostingGroupBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_select_posting_group, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
