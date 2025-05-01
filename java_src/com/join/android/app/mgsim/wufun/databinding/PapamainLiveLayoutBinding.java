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
public final class PapamainLiveLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25766b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25767c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25768d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f25769e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25770f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25771g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25772h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25773i;

    private PapamainLiveLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3) {
        this.f25766b = linearLayout;
        this.f25767c = linearLayout2;
        this.f25768d = imageView;
        this.f25769e = simpleDraweeView;
        this.f25770f = textView;
        this.f25771g = textView2;
        this.f25772h = textView3;
        this.f25773i = linearLayout3;
    }

    @NonNull
    public static PapamainLiveLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.goLive;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.goLive);
        if (linearLayout != null) {
            i4 = R.id.imageView34;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView34);
            if (imageView != null) {
                i4 = R.id.picImage;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.picImage);
                if (simpleDraweeView != null) {
                    i4 = R.id.subtitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.subtitle);
                    if (textView != null) {
                        i4 = R.id.textView64;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView64);
                        if (textView2 != null) {
                            i4 = R.id.title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                            if (textView3 != null) {
                                i4 = R.id.tvLiveListLayout;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tvLiveListLayout);
                                if (linearLayout2 != null) {
                                    return new PapamainLiveLayoutBinding((LinearLayout) view, linearLayout, imageView, simpleDraweeView, textView, textView2, textView3, linearLayout2);
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
    public static PapamainLiveLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25766b;
    }

    @NonNull
    public static PapamainLiveLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_live_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
