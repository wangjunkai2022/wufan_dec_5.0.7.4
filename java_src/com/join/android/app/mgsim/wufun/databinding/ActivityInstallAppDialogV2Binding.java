package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityInstallAppDialogV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f16543b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f16544c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16545d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16546e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16547f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16548g;

    private ActivityInstallAppDialogV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f16543b = constraintLayout;
        this.f16544c = simpleDraweeView;
        this.f16545d = imageView;
        this.f16546e = textView;
        this.f16547f = textView2;
        this.f16548g = textView3;
    }

    @NonNull
    public static ActivityInstallAppDialogV2Binding bind(@NonNull View view) {
        int i4 = R.id.gameImg;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameImg);
        if (simpleDraweeView != null) {
            i4 = R.id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivClose);
            if (imageView != null) {
                i4 = R.id.tvDesc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
                if (textView != null) {
                    i4 = R.id.tvGameName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                    if (textView2 != null) {
                        i4 = R.id.tvInstall;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInstall);
                        if (textView3 != null) {
                            return new ActivityInstallAppDialogV2Binding((ConstraintLayout) view, simpleDraweeView, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityInstallAppDialogV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f16543b;
    }

    @NonNull
    public static ActivityInstallAppDialogV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_install_app_dialog_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
