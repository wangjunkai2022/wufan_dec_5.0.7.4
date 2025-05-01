package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.InterceptEventHorizontalScrollView;
/* loaded from: classes3.dex */
public final class ItemStandaloneCompanyViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22841b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final InterceptEventHorizontalScrollView f22842c;

    private ItemStandaloneCompanyViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull InterceptEventHorizontalScrollView interceptEventHorizontalScrollView) {
        this.f22841b = relativeLayout;
        this.f22842c = interceptEventHorizontalScrollView;
    }

    @NonNull
    public static ItemStandaloneCompanyViewBinding bind(@NonNull View view) {
        InterceptEventHorizontalScrollView interceptEventHorizontalScrollView = (InterceptEventHorizontalScrollView) ViewBindings.findChildViewById(view, R.id.mHorizontalScrollView);
        if (interceptEventHorizontalScrollView != null) {
            return new ItemStandaloneCompanyViewBinding((RelativeLayout) view, interceptEventHorizontalScrollView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.mHorizontalScrollView)));
    }

    @NonNull
    public static ItemStandaloneCompanyViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22841b;
    }

    @NonNull
    public static ItemStandaloneCompanyViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_standalone_company_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
