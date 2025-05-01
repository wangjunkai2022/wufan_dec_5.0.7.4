package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityKeyMapHeadIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16549b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16550c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f16551d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f16552e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f16553f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16554g;

    private ActivityKeyMapHeadIncludeBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull RelativeLayout relativeLayout2, @NonNull Button button2, @NonNull TextView textView) {
        this.f16549b = relativeLayout;
        this.f16550c = imageView;
        this.f16551d = button;
        this.f16552e = relativeLayout2;
        this.f16553f = button2;
        this.f16554g = textView;
    }

    @NonNull
    public static ActivityKeyMapHeadIncludeBinding bind(@NonNull View view) {
        int i4 = R.id.backImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i4 = R.id.okButn;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.okButn);
            if (button != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.resetButn;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.resetButn);
                if (button2 != null) {
                    i4 = R.id.titleText;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                    if (textView != null) {
                        return new ActivityKeyMapHeadIncludeBinding(relativeLayout, imageView, button, relativeLayout, button2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityKeyMapHeadIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16549b;
    }

    @NonNull
    public static ActivityKeyMapHeadIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_key_map_head_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
