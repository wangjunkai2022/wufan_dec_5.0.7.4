package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameDetailItem1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20268b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f20269c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20270d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f20271e;

    private GameDetailItem1Binding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView2) {
        this.f20268b = relativeLayout;
        this.f20269c = simpleDraweeView;
        this.f20270d = imageView;
        this.f20271e = simpleDraweeView2;
    }

    @NonNull
    public static GameDetailItem1Binding bind(@NonNull View view) {
        int i4 = R.id.imageViewHPic;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imageViewHPic);
        if (simpleDraweeView != null) {
            i4 = R.id.imageViewPlay;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageViewPlay);
            if (imageView != null) {
                i4 = R.id.imageViewVPic;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imageViewVPic);
                if (simpleDraweeView2 != null) {
                    return new GameDetailItem1Binding((RelativeLayout) view, simpleDraweeView, imageView, simpleDraweeView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameDetailItem1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20268b;
    }

    @NonNull
    public static GameDetailItem1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_detail_item1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
