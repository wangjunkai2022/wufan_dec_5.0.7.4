package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogBespeakTipBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f18608b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18609c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18610d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18611e;

    private DialogBespeakTipBinding(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18608b = cardView;
        this.f18609c = imageView;
        this.f18610d = textView;
        this.f18611e = textView2;
    }

    @NonNull
    public static DialogBespeakTipBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i4 = R.id.tv_known;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_known);
            if (textView != null) {
                i4 = R.id.tv_message;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_message);
                if (textView2 != null) {
                    return new DialogBespeakTipBinding((CardView) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogBespeakTipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f18608b;
    }

    @NonNull
    public static DialogBespeakTipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_bespeak_tip, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
