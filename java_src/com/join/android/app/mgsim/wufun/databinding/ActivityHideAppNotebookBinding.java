package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
public final class ActivityHideAppNotebookBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16528b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16529c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f16530d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f16531e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f16532f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f16533g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16534h;

    private ActivityHideAppNotebookBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView) {
        this.f16528b = linearLayout;
        this.f16529c = imageView;
        this.f16530d = editText;
        this.f16531e = relativeLayout;
        this.f16532f = imageView2;
        this.f16533g = view;
        this.f16534h = textView;
    }

    @NonNull
    public static ActivityHideAppNotebookBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.etNote;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.etNote);
            if (editText != null) {
                i4 = R.id.headview;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.headview);
                if (relativeLayout != null) {
                    i4 = R.id.ic_add;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ic_add);
                    if (imageView2 != null) {
                        i4 = R.id.statubar;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                        if (findChildViewById != null) {
                            i4 = R.id.title_textview;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                            if (textView != null) {
                                return new ActivityHideAppNotebookBinding((LinearLayout) view, imageView, editText, relativeLayout, imageView2, findChildViewById, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityHideAppNotebookBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16528b;
    }

    @NonNull
    public static ActivityHideAppNotebookBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_hide_app_notebook, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
