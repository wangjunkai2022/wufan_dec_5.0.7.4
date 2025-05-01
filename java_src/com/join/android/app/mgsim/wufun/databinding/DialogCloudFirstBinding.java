package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogCloudFirstBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18612b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18613c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18614d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18615e;

    private DialogCloudFirstBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f18612b = linearLayout;
        this.f18613c = textView;
        this.f18614d = imageView;
        this.f18615e = textView2;
    }

    @NonNull
    public static DialogCloudFirstBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (textView != null) {
            i4 = R.id.cloud_select_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.cloud_select_img);
            if (imageView != null) {
                i4 = R.id.ok;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                if (textView2 != null) {
                    return new DialogCloudFirstBinding((LinearLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogCloudFirstBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18612b;
    }

    @NonNull
    public static DialogCloudFirstBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_cloud_first, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
