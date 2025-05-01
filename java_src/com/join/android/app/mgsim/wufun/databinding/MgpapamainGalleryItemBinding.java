package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LeftGalleryLayout;
/* loaded from: classes3.dex */
public final class MgpapamainGalleryItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LeftGalleryLayout f24876b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f24877c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LeftGalleryLayout f24878d;

    private MgpapamainGalleryItemBinding(@NonNull LeftGalleryLayout leftGalleryLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LeftGalleryLayout leftGalleryLayout2) {
        this.f24876b = leftGalleryLayout;
        this.f24877c = simpleDraweeView;
        this.f24878d = leftGalleryLayout2;
    }

    @NonNull
    public static MgpapamainGalleryItemBinding bind(@NonNull View view) {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.intersting_itemback);
        if (simpleDraweeView != null) {
            LeftGalleryLayout leftGalleryLayout = (LeftGalleryLayout) view;
            return new MgpapamainGalleryItemBinding(leftGalleryLayout, simpleDraweeView, leftGalleryLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.intersting_itemback)));
    }

    @NonNull
    public static MgpapamainGalleryItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LeftGalleryLayout getRoot() {
        return this.f24876b;
    }

    @NonNull
    public static MgpapamainGalleryItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapamain_gallery_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
