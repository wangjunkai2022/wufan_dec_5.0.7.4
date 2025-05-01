package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutEmuPluginDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23024b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23025c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23026d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23027e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23028f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23029g;

    private LayoutEmuPluginDialogBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23024b = constraintLayout;
        this.f23025c = imageView;
        this.f23026d = textView;
        this.f23027e = textView2;
        this.f23028f = textView3;
        this.f23029g = textView4;
    }

    @NonNull
    public static LayoutEmuPluginDialogBinding bind(@NonNull View view) {
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icon);
        if (imageView != null) {
            i4 = R.id.skip;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.skip);
            if (textView != null) {
                i4 = R.id.subTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.subTitle);
                if (textView2 != null) {
                    i4 = R.id.submit;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.submit);
                    if (textView3 != null) {
                        i4 = R.id.title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView4 != null) {
                            return new LayoutEmuPluginDialogBinding((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutEmuPluginDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23024b;
    }

    @NonNull
    public static LayoutEmuPluginDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_emu_plugin_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
