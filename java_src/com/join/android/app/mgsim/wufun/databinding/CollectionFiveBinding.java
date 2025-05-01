package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView;
/* loaded from: classes3.dex */
public final class CollectionFiveBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18037b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView f18038c;

    private CollectionFiveBinding(@NonNull LinearLayout linearLayout, @NonNull XListView xListView) {
        this.f18037b = linearLayout;
        this.f18038c = xListView;
    }

    @NonNull
    public static CollectionFiveBinding bind(@NonNull View view) {
        XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.gridListView);
        if (xListView != null) {
            return new CollectionFiveBinding((LinearLayout) view, xListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.gridListView)));
    }

    @NonNull
    public static CollectionFiveBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18037b;
    }

    @NonNull
    public static CollectionFiveBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.collection_five, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
