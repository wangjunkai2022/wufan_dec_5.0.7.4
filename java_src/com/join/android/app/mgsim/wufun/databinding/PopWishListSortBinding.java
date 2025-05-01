package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopWishListSortBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26115b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f26116c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f26117d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f26118e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26119f;

    private PopWishListSortBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull LinearLayout linearLayout) {
        this.f26115b = relativeLayout;
        this.f26116c = button;
        this.f26117d = button2;
        this.f26118e = button3;
        this.f26119f = linearLayout;
    }

    @NonNull
    public static PopWishListSortBinding bind(@NonNull View view) {
        int i4 = R.id.btn_all;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_all);
        if (button != null) {
            i4 = R.id.btn_sxz;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_sxz);
            if (button2 != null) {
                i4 = R.id.btn_ysx;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_ysx);
                if (button3 != null) {
                    i4 = R.id.rgSort;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rgSort);
                    if (linearLayout != null) {
                        return new PopWishListSortBinding((RelativeLayout) view, button, button2, button3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopWishListSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26115b;
    }

    @NonNull
    public static PopWishListSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_wish_list_sort, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
