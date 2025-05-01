package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class StubBuildQrCodeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26719b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26720c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26721d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26722e;

    private StubBuildQrCodeBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f26719b = relativeLayout;
        this.f26720c = textView;
        this.f26721d = imageView;
        this.f26722e = textView2;
    }

    @NonNull
    public static StubBuildQrCodeBinding bind(@NonNull View view) {
        int i4 = R.id.qr_code_declare_txt;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.qr_code_declare_txt);
        if (textView != null) {
            i4 = R.id.qr_code_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.qr_code_img);
            if (imageView != null) {
                i4 = R.id.ssidTxt;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ssidTxt);
                if (textView2 != null) {
                    return new StubBuildQrCodeBinding((RelativeLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static StubBuildQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26719b;
    }

    @NonNull
    public static StubBuildQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.stub_build_qr_code, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
