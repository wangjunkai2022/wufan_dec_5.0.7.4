package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class HandshankKeyTitleIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21396b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21397c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f21398d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f21399e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f21400f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21401g;

    private HandshankKeyTitleIncludeBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull Button button2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.f21396b = linearLayout;
        this.f21397c = imageView;
        this.f21398d = button;
        this.f21399e = button2;
        this.f21400f = relativeLayout;
        this.f21401g = textView;
    }

    @NonNull
    public static HandshankKeyTitleIncludeBinding bind(@NonNull View view) {
        int i4 = R.id.backImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i4 = R.id.errButn;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.errButn);
            if (button != null) {
                i4 = R.id.okButn;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.okButn);
                if (button2 != null) {
                    i4 = R.id.relativeLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout);
                    if (relativeLayout != null) {
                        i4 = R.id.titleText;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                        if (textView != null) {
                            return new HandshankKeyTitleIncludeBinding((LinearLayout) view, imageView, button, button2, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HandshankKeyTitleIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21396b;
    }

    @NonNull
    public static HandshankKeyTitleIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_key_title_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
