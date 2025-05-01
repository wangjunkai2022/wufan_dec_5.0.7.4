package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ClipImageLayout;
import com.join.mgps.customview.LoadingImageView;
/* loaded from: classes3.dex */
public final class CropPicLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18280b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ClipImageLayout f18281c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LoadingImageView f18282d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f18283e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18284f;

    private CropPicLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ClipImageLayout clipImageLayout, @NonNull LoadingImageView loadingImageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f18280b = linearLayout;
        this.f18281c = clipImageLayout;
        this.f18282d = loadingImageView;
        this.f18283e = linearLayout2;
        this.f18284f = textView;
    }

    @NonNull
    public static CropPicLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.id_clipImageLayout;
        ClipImageLayout clipImageLayout = (ClipImageLayout) ViewBindings.findChildViewById(view, R.id.id_clipImageLayout);
        if (clipImageLayout != null) {
            i4 = R.id.loading_view;
            LoadingImageView loadingImageView = (LoadingImageView) ViewBindings.findChildViewById(view, R.id.loading_view);
            if (loadingImageView != null) {
                i4 = R.id.loding_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_layout);
                if (linearLayout != null) {
                    i4 = R.id.textView2;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                    if (textView != null) {
                        return new CropPicLayoutBinding((LinearLayout) view, clipImageLayout, loadingImageView, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CropPicLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18280b;
    }

    @NonNull
    public static CropPicLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.crop_pic_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
