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
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogVaExtSupportBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19070b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f19071c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19072d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f19073e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CardView f19074f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19075g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19076h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19077i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19078j;

    private DialogVaExtSupportBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull Button button, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19070b = linearLayout;
        this.f19071c = simpleDraweeView;
        this.f19072d = textView;
        this.f19073e = button;
        this.f19074f = cardView;
        this.f19075g = imageView;
        this.f19076h = linearLayout2;
        this.f19077i = textView2;
        this.f19078j = textView3;
    }

    @NonNull
    public static DialogVaExtSupportBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.appName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
            if (textView != null) {
                i4 = R.id.btn_install;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_install);
                if (button != null) {
                    i4 = R.id.cv_tips;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cv_tips);
                    if (cardView != null) {
                        i4 = R.id.iv_close;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
                        if (imageView != null) {
                            i4 = R.id.ll_install_local;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_install_local);
                            if (linearLayout != null) {
                                i4 = R.id.tv_install_local;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_install_local);
                                if (textView2 != null) {
                                    i4 = R.id.tv_install_tip;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_install_tip);
                                    if (textView3 != null) {
                                        return new DialogVaExtSupportBinding((LinearLayout) view, simpleDraweeView, textView, button, cardView, imageView, linearLayout, textView2, textView3);
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
    public static DialogVaExtSupportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19070b;
    }

    @NonNull
    public static DialogVaExtSupportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_va_ext_support, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
