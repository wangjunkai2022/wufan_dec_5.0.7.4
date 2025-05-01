package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SimpleSheetItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26568b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26569c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f26570d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26571e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26572f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f26573g;

    private SimpleSheetItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull View view) {
        this.f26568b = constraintLayout;
        this.f26569c = textView;
        this.f26570d = button;
        this.f26571e = imageView;
        this.f26572f = textView2;
        this.f26573g = view;
    }

    @NonNull
    public static SimpleSheetItemBinding bind(@NonNull View view) {
        int i4 = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
        if (textView != null) {
            i4 = R.id.download;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.download);
            if (button != null) {
                i4 = R.id.imageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                if (imageView != null) {
                    i4 = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                    if (textView2 != null) {
                        i4 = R.id.view;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view);
                        if (findChildViewById != null) {
                            return new SimpleSheetItemBinding((ConstraintLayout) view, textView, button, imageView, textView2, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SimpleSheetItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26568b;
    }

    @NonNull
    public static SimpleSheetItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.simple_sheet_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
