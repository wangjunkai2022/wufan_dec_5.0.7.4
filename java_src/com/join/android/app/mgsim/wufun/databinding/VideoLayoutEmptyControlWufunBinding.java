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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class VideoLayoutEmptyControlWufunBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26911b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26912c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f26913d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f26914e;

    private VideoLayoutEmptyControlWufunBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3) {
        this.f26911b = relativeLayout;
        this.f26912c = imageView;
        this.f26913d = relativeLayout2;
        this.f26914e = relativeLayout3;
    }

    @NonNull
    public static VideoLayoutEmptyControlWufunBinding bind(@NonNull View view) {
        int i4 = R.id.mute;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.mute);
        if (imageView != null) {
            i4 = R.id.surface_container;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.surface_container);
            if (relativeLayout != null) {
                i4 = R.id.thumb;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.thumb);
                if (relativeLayout2 != null) {
                    return new VideoLayoutEmptyControlWufunBinding((RelativeLayout) view, imageView, relativeLayout, relativeLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static VideoLayoutEmptyControlWufunBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26911b;
    }

    @NonNull
    public static VideoLayoutEmptyControlWufunBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.video_layout_empty_control_wufun, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
