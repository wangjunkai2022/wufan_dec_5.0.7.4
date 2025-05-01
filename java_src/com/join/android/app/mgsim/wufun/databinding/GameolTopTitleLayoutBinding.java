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
public final class GameolTopTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21252b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21253c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f21254d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21255e;

    private GameolTopTitleLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull TextView textView) {
        this.f21252b = linearLayout;
        this.f21253c = imageView;
        this.f21254d = view;
        this.f21255e = textView;
    }

    @NonNull
    public static GameolTopTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.adImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.adImage);
        if (imageView != null) {
            i4 = R.id.line;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
            if (findChildViewById != null) {
                i4 = R.id.titleText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                if (textView != null) {
                    return new GameolTopTitleLayoutBinding((LinearLayout) view, imageView, findChildViewById, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameolTopTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21252b;
    }

    @NonNull
    public static GameolTopTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameol_top_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
