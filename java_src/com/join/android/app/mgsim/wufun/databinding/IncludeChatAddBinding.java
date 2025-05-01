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
public final class IncludeChatAddBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21515b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21516c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21517d;

    private IncludeChatAddBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f21515b = relativeLayout;
        this.f21516c = textView;
        this.f21517d = imageView;
    }

    @NonNull
    public static IncludeChatAddBinding bind(@NonNull View view) {
        int i4 = R.id.footer_tip;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.footer_tip);
        if (textView != null) {
            i4 = R.id.image_add;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.image_add);
            if (imageView != null) {
                return new IncludeChatAddBinding((RelativeLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static IncludeChatAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21515b;
    }

    @NonNull
    public static IncludeChatAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.include_chat_add, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
