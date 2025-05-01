package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CodesBoxHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18021b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18022c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f18023d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18024e;

    private CodesBoxHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.f18021b = linearLayout;
        this.f18022c = imageView;
        this.f18023d = relativeLayout;
        this.f18024e = textView;
    }

    @NonNull
    public static CodesBoxHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.emptyGiftPackage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.emptyGiftPackage);
        if (imageView != null) {
            i4 = R.id.emptyGiftPackageLayout;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.emptyGiftPackageLayout);
            if (relativeLayout != null) {
                i4 = R.id.textview_gift_get;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textview_gift_get);
                if (textView != null) {
                    return new CodesBoxHeaderBinding((LinearLayout) view, imageView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CodesBoxHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18021b;
    }

    @NonNull
    public static CodesBoxHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.codes_box_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
