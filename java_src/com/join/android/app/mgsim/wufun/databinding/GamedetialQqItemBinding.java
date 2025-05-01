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
public final class GamedetialQqItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21097b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f21098c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21099d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21100e;

    private GamedetialQqItemBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f21097b = linearLayout;
        this.f21098c = linearLayout2;
        this.f21099d = imageView;
        this.f21100e = textView;
    }

    @NonNull
    public static GamedetialQqItemBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.imageView42;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView42);
        if (imageView != null) {
            i4 = R.id.suntitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.suntitle);
            if (textView != null) {
                return new GamedetialQqItemBinding(linearLayout, linearLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialQqItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21097b;
    }

    @NonNull
    public static GamedetialQqItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_qq_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
