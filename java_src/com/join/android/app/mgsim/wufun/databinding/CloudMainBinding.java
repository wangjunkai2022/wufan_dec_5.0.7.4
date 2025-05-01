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
public final class CloudMainBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17983b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17984c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17985d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17986e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17987f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17988g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17989h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f17990i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17991j;

    private CloudMainBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView3) {
        this.f17983b = linearLayout;
        this.f17984c = imageView;
        this.f17985d = imageView2;
        this.f17986e = textView;
        this.f17987f = linearLayout2;
        this.f17988g = linearLayout3;
        this.f17989h = textView2;
        this.f17990i = relativeLayout;
        this.f17991j = textView3;
    }

    @NonNull
    public static CloudMainBinding bind(@NonNull View view) {
        int i4 = R.id.backImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i4 = R.id.backups;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.backups);
            if (imageView2 != null) {
                i4 = R.id.cloudRom;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cloudRom);
                if (textView != null) {
                    i4 = R.id.lay_1;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_1);
                    if (linearLayout != null) {
                        i4 = R.id.lay_2;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.lay_2);
                        if (linearLayout2 != null) {
                            i4 = R.id.localRom;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.localRom);
                            if (textView2 != null) {
                                i4 = R.id.relativeLayout;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout);
                                if (relativeLayout != null) {
                                    i4 = R.id.titleText;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                    if (textView3 != null) {
                                        return new CloudMainBinding((LinearLayout) view, imageView, imageView2, textView, linearLayout, linearLayout2, textView2, relativeLayout, textView3);
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
    public static CloudMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17983b;
    }

    @NonNull
    public static CloudMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cloud_main, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
