package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChioceItemOrderTopBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17764b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17765c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17766d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f17767e;

    private ChioceItemOrderTopBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2) {
        this.f17764b = linearLayout;
        this.f17765c = imageView;
        this.f17766d = imageView2;
        this.f17767e = linearLayout2;
    }

    @NonNull
    public static ChioceItemOrderTopBinding bind(@NonNull View view) {
        int i4 = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrow);
        if (imageView != null) {
            i4 = R.id.icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
            if (imageView2 != null) {
                i4 = R.id.more;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.more);
                if (linearLayout != null) {
                    return new ChioceItemOrderTopBinding((LinearLayout) view, imageView, imageView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChioceItemOrderTopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17764b;
    }

    @NonNull
    public static ChioceItemOrderTopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_order_top, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
