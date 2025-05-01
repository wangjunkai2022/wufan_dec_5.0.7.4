package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class HavenWishAcitivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21447b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21448c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f21449d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21450e;

    private HavenWishAcitivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull TextView textView) {
        this.f21447b = linearLayout;
        this.f21448c = imageView;
        this.f21449d = editText;
        this.f21450e = textView;
    }

    @NonNull
    public static HavenWishAcitivityBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.edittext;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.edittext);
            if (editText != null) {
                i4 = R.id.sennd;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.sennd);
                if (textView != null) {
                    return new HavenWishAcitivityBinding((LinearLayout) view, imageView, editText, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HavenWishAcitivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21447b;
    }

    @NonNull
    public static HavenWishAcitivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.haven_wish_acitivity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
