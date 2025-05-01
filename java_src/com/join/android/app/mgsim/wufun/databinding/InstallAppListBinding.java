package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class InstallAppListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21574b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f21575c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21576d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f21577e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f21578f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21579g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21580h;

    private InstallAppListBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull Button button, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f21574b = linearLayout;
        this.f21575c = simpleDraweeView;
        this.f21576d = textView;
        this.f21577e = button;
        this.f21578f = imageView;
        this.f21579g = linearLayout2;
        this.f21580h = textView2;
    }

    @NonNull
    public static InstallAppListBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.appName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
            if (textView != null) {
                i4 = R.id.btn_install;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_install);
                if (button != null) {
                    i4 = R.id.iv_star;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star);
                    if (imageView != null) {
                        i4 = R.id.tipsLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                        if (linearLayout != null) {
                            i4 = R.id.tv_score;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_score);
                            if (textView2 != null) {
                                return new InstallAppListBinding((LinearLayout) view, simpleDraweeView, textView, button, imageView, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InstallAppListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21574b;
    }

    @NonNull
    public static InstallAppListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.install_app_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
