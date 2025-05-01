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
public final class DialogFightMismatchBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18729b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18730c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18731d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18732e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18733f;

    private DialogFightMismatchBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18729b = relativeLayout;
        this.f18730c = imageView;
        this.f18731d = button;
        this.f18732e = textView;
        this.f18733f = textView2;
    }

    @NonNull
    public static DialogFightMismatchBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.cancel;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.cancel);
            if (button != null) {
                i4 = R.id.info;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.info);
                if (textView != null) {
                    i4 = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                    if (textView2 != null) {
                        return new DialogFightMismatchBinding((RelativeLayout) view, imageView, button, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogFightMismatchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18729b;
    }

    @NonNull
    public static DialogFightMismatchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fight_mismatch, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
