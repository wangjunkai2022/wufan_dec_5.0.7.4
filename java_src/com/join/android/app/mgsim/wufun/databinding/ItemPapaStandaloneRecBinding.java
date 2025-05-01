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
public final class ItemPapaStandaloneRecBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22547b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final InterceptEventHorizontalScrollView f22548c;

    private ItemPapaStandaloneRecBinding(@NonNull RelativeLayout relativeLayout, @NonNull InterceptEventHorizontalScrollView interceptEventHorizontalScrollView) {
        this.f22547b = relativeLayout;
        this.f22548c = interceptEventHorizontalScrollView;
    }

    @NonNull
    public static ItemPapaStandaloneRecBinding bind(@NonNull View view) {
        InterceptEventHorizontalScrollView interceptEventHorizontalScrollView = (InterceptEventHorizontalScrollView) ViewBindings.findChildViewById(view, R.id.mHorizontalScrollView);
        if (interceptEventHorizontalScrollView != null) {
            return new ItemPapaStandaloneRecBinding((RelativeLayout) view, interceptEventHorizontalScrollView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.mHorizontalScrollView)));
    }

    @NonNull
    public static ItemPapaStandaloneRecBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22547b;
    }

    @NonNull
    public static ItemPapaStandaloneRecBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_papa_standalone_rec, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
