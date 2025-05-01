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
public final class DownlargeGameDialogActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19120b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19121c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19122d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19123e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19124f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19125g;

    private DownlargeGameDialogActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19120b = linearLayout;
        this.f19121c = imageView;
        this.f19122d = textView;
        this.f19123e = imageView2;
        this.f19124f = textView2;
        this.f19125g = textView3;
    }

    @NonNull
    public static DownlargeGameDialogActivityBinding bind(@NonNull View view) {
        int i4 = R.id.closed;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closed);
        if (imageView != null) {
            i4 = R.id.content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
            if (textView != null) {
                i4 = R.id.icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
                if (imageView2 != null) {
                    i4 = R.id.openH5;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.openH5);
                    if (textView2 != null) {
                        i4 = R.id.title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView3 != null) {
                            return new DownlargeGameDialogActivityBinding((LinearLayout) view, imageView, textView, imageView2, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DownlargeGameDialogActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19120b;
    }

    @NonNull
    public static DownlargeGameDialogActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.downlarge_game_dialog_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
