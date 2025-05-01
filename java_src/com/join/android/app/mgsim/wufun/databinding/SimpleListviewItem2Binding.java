package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SimpleListviewItem2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26562b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26563c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26564d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CardView f26565e;

    private SimpleListviewItem2Binding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull CardView cardView) {
        this.f26562b = relativeLayout;
        this.f26563c = imageView;
        this.f26564d = textView;
        this.f26565e = cardView;
    }

    @NonNull
    public static SimpleListviewItem2Binding bind(@NonNull View view) {
        int i4 = R.id.dotHistory;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.dotHistory);
        if (imageView != null) {
            i4 = R.id.lv_tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.lv_tv_title);
            if (textView != null) {
                i4 = R.id.tag;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.tag);
                if (cardView != null) {
                    return new SimpleListviewItem2Binding((RelativeLayout) view, imageView, textView, cardView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SimpleListviewItem2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26562b;
    }

    @NonNull
    public static SimpleListviewItem2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.simple_listview_item2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
