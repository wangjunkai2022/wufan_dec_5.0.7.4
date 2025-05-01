package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgGamedetailGiftsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24456b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24457c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24458d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f24459e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f24460f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24461g;

    private MgGamedetailGiftsBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2) {
        this.f24456b = linearLayout;
        this.f24457c = imageView;
        this.f24458d = textView;
        this.f24459e = simpleDraweeView;
        this.f24460f = relativeLayout;
        this.f24461g = textView2;
    }

    @NonNull
    public static MgGamedetailGiftsBinding bind(@NonNull View view) {
        int i4 = R.id.arrowImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowImage);
        if (imageView != null) {
            i4 = R.id.giftsCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.giftsCount);
            if (textView != null) {
                i4 = R.id.giftsImage;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.giftsImage);
                if (simpleDraweeView != null) {
                    i4 = R.id.giftsLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.giftsLayout);
                    if (relativeLayout != null) {
                        i4 = R.id.giftsTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.giftsTitle);
                        if (textView2 != null) {
                            return new MgGamedetailGiftsBinding((LinearLayout) view, imageView, textView, simpleDraweeView, relativeLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGamedetailGiftsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24456b;
    }

    @NonNull
    public static MgGamedetailGiftsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_gifts, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
