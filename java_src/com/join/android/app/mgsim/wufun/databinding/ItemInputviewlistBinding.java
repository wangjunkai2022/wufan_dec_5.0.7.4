package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemInputviewlistBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22400b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22401c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f22402d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22403e;

    private ItemInputviewlistBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.f22400b = relativeLayout;
        this.f22401c = imageView;
        this.f22402d = relativeLayout2;
        this.f22403e = textView;
    }

    @NonNull
    public static ItemInputviewlistBinding bind(@NonNull View view) {
        int i4 = R.id.myInputPwdListItem_delete;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.myInputPwdListItem_delete);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.myInputPwdListItem_tv);
            if (textView != null) {
                return new ItemInputviewlistBinding(relativeLayout, imageView, relativeLayout, textView);
            }
            i4 = R.id.myInputPwdListItem_tv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemInputviewlistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22400b;
    }

    @NonNull
    public static ItemInputviewlistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_inputviewlist, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
