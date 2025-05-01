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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MygameTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25371b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25372c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25373d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25374e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25375f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25376g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25377h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f25378i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25379j;

    private MygameTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull ImageView imageView5, @NonNull TextView textView2) {
        this.f25371b = relativeLayout;
        this.f25372c = imageView;
        this.f25373d = imageView2;
        this.f25374e = imageView3;
        this.f25375f = linearLayout;
        this.f25376g = imageView4;
        this.f25377h = textView;
        this.f25378i = imageView5;
        this.f25379j = textView2;
    }

    @NonNull
    public static MygameTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.communt_message;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.communt_message);
            if (imageView2 != null) {
                i4 = R.id.communt_user;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.communt_user);
                if (imageView3 != null) {
                    i4 = R.id.layout_share;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_share);
                    if (linearLayout != null) {
                        i4 = R.id.searchImage;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.searchImage);
                        if (imageView4 != null) {
                            i4 = R.id.share_textview;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.share_textview);
                            if (textView != null) {
                                i4 = R.id.shoubing;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.shoubing);
                                if (imageView5 != null) {
                                    i4 = R.id.title_textview;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                    if (textView2 != null) {
                                        return new MygameTitleLayoutBinding((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, imageView4, textView, imageView5, textView2);
                                    }
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
    public static MygameTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25371b;
    }

    @NonNull
    public static MygameTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mygame_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
