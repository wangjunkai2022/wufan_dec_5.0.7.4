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
public final class HandshankTitleIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21434b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21435c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f21436d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21437e;

    private HandshankTitleIncludeBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull TextView textView) {
        this.f21434b = relativeLayout;
        this.f21435c = imageView;
        this.f21436d = button;
        this.f21437e = textView;
    }

    @NonNull
    public static HandshankTitleIncludeBinding bind(@NonNull View view) {
        int i4 = R.id.backImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i4 = R.id.rightButn;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.rightButn);
            if (button != null) {
                i4 = R.id.titleText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                if (textView != null) {
                    return new HandshankTitleIncludeBinding((RelativeLayout) view, imageView, button, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HandshankTitleIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21434b;
    }

    @NonNull
    public static HandshankTitleIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_title_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
