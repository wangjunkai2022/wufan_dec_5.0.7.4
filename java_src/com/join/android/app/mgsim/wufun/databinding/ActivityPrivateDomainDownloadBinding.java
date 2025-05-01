package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityPrivateDomainDownloadBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f16795b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16796c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f16797d;

    private ActivityPrivateDomainDownloadBinding(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f16795b = cardView;
        this.f16796c = imageView;
        this.f16797d = simpleDraweeView;
    }

    @NonNull
    public static ActivityPrivateDomainDownloadBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i4 = R.id.sdv_image;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
            if (simpleDraweeView != null) {
                return new ActivityPrivateDomainDownloadBinding((CardView) view, imageView, simpleDraweeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityPrivateDomainDownloadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f16795b;
    }

    @NonNull
    public static ActivityPrivateDomainDownloadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_private_domain_download, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
