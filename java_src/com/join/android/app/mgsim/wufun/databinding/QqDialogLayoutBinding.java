package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class QqDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26180b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26181c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f26182d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f26183e;

    private QqDialogLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f26180b = linearLayout;
        this.f26181c = imageView;
        this.f26182d = button;
        this.f26183e = simpleDraweeView;
    }

    @NonNull
    public static QqDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.closed;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closed);
        if (imageView != null) {
            i4 = R.id.dialog_button_ok;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (button != null) {
                i4 = R.id.images;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.images);
                if (simpleDraweeView != null) {
                    return new QqDialogLayoutBinding((LinearLayout) view, imageView, button, simpleDraweeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static QqDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26180b;
    }

    @NonNull
    public static QqDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.qq_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
