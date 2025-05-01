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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogApkInstallGuideBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18522b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18523c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18524d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18525e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18526f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18527g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f18528h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f18529i;

    private DialogApkInstallGuideBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view, @NonNull View view2) {
        this.f18522b = constraintLayout;
        this.f18523c = imageView;
        this.f18524d = textView;
        this.f18525e = textView2;
        this.f18526f = textView3;
        this.f18527g = textView4;
        this.f18528h = view;
        this.f18529i = view2;
    }

    @NonNull
    public static DialogApkInstallGuideBinding bind(@NonNull View view) {
        int i4 = R.id.iv_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_image);
        if (imageView != null) {
            i4 = R.id.textView103;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView103);
            if (textView != null) {
                i4 = R.id.tv_opt_left;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_opt_left);
                if (textView2 != null) {
                    i4 = R.id.tv_opt_right;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_opt_right);
                    if (textView3 != null) {
                        i4 = R.id.tv_sub_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sub_title);
                        if (textView4 != null) {
                            i4 = R.id.v_line;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_line);
                            if (findChildViewById != null) {
                                i4 = R.id.v_line_v;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_line_v);
                                if (findChildViewById2 != null) {
                                    return new DialogApkInstallGuideBinding((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4, findChildViewById, findChildViewById2);
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
    public static DialogApkInstallGuideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18522b;
    }

    @NonNull
    public static DialogApkInstallGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_apk_install_guide, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
