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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.PictureHProgress;
/* loaded from: classes3.dex */
public final class ActivityQuarkLoadingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16872b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f16873c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PictureHProgress f16874d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f16875e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f16876f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16877g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16878h;

    private ActivityQuarkLoadingBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull PictureHProgress pictureHProgress, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f16872b = linearLayout;
        this.f16873c = linearLayout2;
        this.f16874d = pictureHProgress;
        this.f16875e = simpleDraweeView;
        this.f16876f = view;
        this.f16877g = textView;
        this.f16878h = textView2;
    }

    @NonNull
    public static ActivityQuarkLoadingBinding bind(@NonNull View view) {
        int i4 = R.id.ll_back;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_back);
        if (linearLayout != null) {
            i4 = R.id.pb_progress;
            PictureHProgress pictureHProgress = (PictureHProgress) ViewBindings.findChildViewById(view, R.id.pb_progress);
            if (pictureHProgress != null) {
                i4 = R.id.sdv_image;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
                if (simpleDraweeView != null) {
                    i4 = R.id.statubar;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                    if (findChildViewById != null) {
                        i4 = R.id.tv_loading_progress;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_loading_progress);
                        if (textView != null) {
                            i4 = R.id.tv_name;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                            if (textView2 != null) {
                                return new ActivityQuarkLoadingBinding((LinearLayout) view, linearLayout, pictureHProgress, simpleDraweeView, findChildViewById, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityQuarkLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16872b;
    }

    @NonNull
    public static ActivityQuarkLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_quark_loading, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
