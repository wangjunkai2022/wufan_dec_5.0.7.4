package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.SquareLayout;
/* loaded from: classes3.dex */
public final class MyAlbumItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final SquareLayout f25298b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f25299c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25300d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SquareLayout f25301e;

    private MyAlbumItemBinding(@NonNull SquareLayout squareLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull SquareLayout squareLayout2) {
        this.f25298b = squareLayout;
        this.f25299c = simpleDraweeView;
        this.f25300d = imageView;
        this.f25301e = squareLayout2;
    }

    @NonNull
    public static MyAlbumItemBinding bind(@NonNull View view) {
        int i4 = R.id.image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image);
        if (simpleDraweeView != null) {
            i4 = R.id.image_flag;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.image_flag);
            if (imageView != null) {
                SquareLayout squareLayout = (SquareLayout) view;
                return new MyAlbumItemBinding(squareLayout, simpleDraweeView, imageView, squareLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyAlbumItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public SquareLayout getRoot() {
        return this.f25298b;
    }

    @NonNull
    public static MyAlbumItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_album_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
