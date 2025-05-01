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
public final class GamedetialNoneCommentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21094b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21095c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21096d;

    private GamedetialNoneCommentLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f21094b = linearLayout;
        this.f21095c = textView;
        this.f21096d = imageView;
    }

    @NonNull
    public static GamedetialNoneCommentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.editText5;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editText5);
        if (textView != null) {
            i4 = R.id.imageView44;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView44);
            if (imageView != null) {
                return new GamedetialNoneCommentLayoutBinding((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialNoneCommentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21094b;
    }

    @NonNull
    public static GamedetialNoneCommentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_none_comment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
