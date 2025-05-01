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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainBroadcaseBottomLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25677b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25678c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f25679d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f25680e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f25681f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25682g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25683h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f25684i;

    private PapamainBroadcaseBottomLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView) {
        this.f25677b = linearLayout;
        this.f25678c = linearLayout2;
        this.f25679d = simpleDraweeView;
        this.f25680e = simpleDraweeView2;
        this.f25681f = simpleDraweeView3;
        this.f25682g = textView;
        this.f25683h = textView2;
        this.f25684i = imageView;
    }

    @NonNull
    public static PapamainBroadcaseBottomLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.gamebroadcastBottom;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gamebroadcastBottom);
        if (linearLayout != null) {
            i4 = R.id.gamebroadcastBottomImage1;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastBottomImage1);
            if (simpleDraweeView != null) {
                i4 = R.id.gamebroadcastBottomImage2;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastBottomImage2);
                if (simpleDraweeView2 != null) {
                    i4 = R.id.gamebroadcastBottomImage3;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastBottomImage3);
                    if (simpleDraweeView3 != null) {
                        i4 = R.id.gamebroadcastBottomText1;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gamebroadcastBottomText1);
                        if (textView != null) {
                            i4 = R.id.gamebroadcastBottomText2;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gamebroadcastBottomText2);
                            if (textView2 != null) {
                                i4 = R.id.imageView12;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView12);
                                if (imageView != null) {
                                    return new PapamainBroadcaseBottomLayoutBinding((LinearLayout) view, linearLayout, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, textView, textView2, imageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapamainBroadcaseBottomLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25677b;
    }

    @NonNull
    public static PapamainBroadcaseBottomLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_broadcase_bottom_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
