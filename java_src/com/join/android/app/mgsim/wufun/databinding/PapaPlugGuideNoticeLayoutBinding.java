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
public final class PapaPlugGuideNoticeLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25638b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25639c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25640d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f25641e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25642f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25643g;

    private PapaPlugGuideNoticeLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull ImageView imageView) {
        this.f25638b = linearLayout;
        this.f25639c = textView;
        this.f25640d = textView2;
        this.f25641e = simpleDraweeView;
        this.f25642f = textView3;
        this.f25643g = imageView;
    }

    @NonNull
    public static PapaPlugGuideNoticeLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.describe;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.describe);
        if (textView != null) {
            i4 = R.id.describe2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.describe2);
            if (textView2 != null) {
                i4 = R.id.guideImage;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.guideImage);
                if (simpleDraweeView != null) {
                    i4 = R.id.iKnow;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.iKnow);
                    if (textView3 != null) {
                        i4 = R.id.imageView25;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView25);
                        if (imageView != null) {
                            return new PapaPlugGuideNoticeLayoutBinding((LinearLayout) view, textView, textView2, simpleDraweeView, textView3, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapaPlugGuideNoticeLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25638b;
    }

    @NonNull
    public static PapaPlugGuideNoticeLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papa_plug_guide_notice_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
