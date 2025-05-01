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
public final class ActivityMiniGameLoadingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16616b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f16617c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final PictureHProgress f16618d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f16619e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f16620f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16621g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16622h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16623i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16624j;

    private ActivityMiniGameLoadingBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull PictureHProgress pictureHProgress, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f16616b = linearLayout;
        this.f16617c = linearLayout2;
        this.f16618d = pictureHProgress;
        this.f16619e = simpleDraweeView;
        this.f16620f = view;
        this.f16621g = textView;
        this.f16622h = textView2;
        this.f16623i = textView3;
        this.f16624j = textView4;
    }

    @NonNull
    public static ActivityMiniGameLoadingBinding bind(@NonNull View view) {
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
                        i4 = R.id.tv_cancel;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                        if (textView != null) {
                            i4 = R.id.tv_loading_progress;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_loading_progress);
                            if (textView2 != null) {
                                i4 = R.id.tv_name;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                                if (textView3 != null) {
                                    i4 = R.id.tv_speed;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_speed);
                                    if (textView4 != null) {
                                        return new ActivityMiniGameLoadingBinding((LinearLayout) view, linearLayout, pictureHProgress, simpleDraweeView, findChildViewById, textView, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityMiniGameLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16616b;
    }

    @NonNull
    public static ActivityMiniGameLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_mini_game_loading, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
