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
public final class PlatGridviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25937b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f25938c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25939d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25940e;

    private PlatGridviewItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f25937b = relativeLayout;
        this.f25938c = button;
        this.f25939d = imageView;
        this.f25940e = textView;
    }

    @NonNull
    public static PlatGridviewItemBinding bind(@NonNull View view) {
        int i4 = R.id.checkButton;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.checkButton);
        if (button != null) {
            i4 = R.id.imgIconCategory;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIconCategory);
            if (imageView != null) {
                i4 = R.id.textViewCategory;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textViewCategory);
                if (textView != null) {
                    return new PlatGridviewItemBinding((RelativeLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PlatGridviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25937b;
    }

    @NonNull
    public static PlatGridviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.plat_gridview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
