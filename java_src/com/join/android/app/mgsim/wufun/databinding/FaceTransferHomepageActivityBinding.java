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
public final class FaceTransferHomepageActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19339b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f19340c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19341d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19342e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TopbarLeftTitleBinding f19343f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19344g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f19345h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f19346i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f19347j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f19348k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f19349l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f19350m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f19351n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f19352o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f19353p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f19354q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f19355r;

    private FaceTransferHomepageActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TopbarLeftTitleBinding topbarLeftTitleBinding, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull ImageView imageView5, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f19339b = relativeLayout;
        this.f19340c = relativeLayout2;
        this.f19341d = textView;
        this.f19342e = textView2;
        this.f19343f = topbarLeftTitleBinding;
        this.f19344g = imageView;
        this.f19345h = imageView2;
        this.f19346i = imageView3;
        this.f19347j = imageView4;
        this.f19348k = relativeLayout3;
        this.f19349l = relativeLayout4;
        this.f19350m = imageView5;
        this.f19351n = textView3;
        this.f19352o = textView4;
        this.f19353p = textView5;
        this.f19354q = textView6;
        this.f19355r = textView7;
    }

    @NonNull
    public static FaceTransferHomepageActivityBinding bind(@NonNull View view) {
        int i4 = R.id.face_transfer_declare_rlayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.face_transfer_declare_rlayout);
        if (relativeLayout != null) {
            i4 = R.id.face_transfer_declare_txt;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.face_transfer_declare_txt);
            if (textView != null) {
                i4 = R.id.face_transfer_declare_txt_bottom;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.face_transfer_declare_txt_bottom);
                if (textView2 != null) {
                    i4 = R.id.face_transfer_homepage_title;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.face_transfer_homepage_title);
                    if (findChildViewById != null) {
                        TopbarLeftTitleBinding bind = TopbarLeftTitleBinding.bind(findChildViewById);
                        i4 = R.id.face_transfer_img_create_hotspot;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.face_transfer_img_create_hotspot);
                        if (imageView != null) {
                            i4 = R.id.face_transfer_img_join_hotspot;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.face_transfer_img_join_hotspot);
                            if (imageView2 != null) {
                                i4 = R.id.face_transfer_left_img;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.face_transfer_left_img);
                                if (imageView3 != null) {
                                    i4 = R.id.face_transfer_mid_img;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.face_transfer_mid_img);
                                    if (imageView4 != null) {
                                        i4 = R.id.face_transfer_rel_create_hotspot;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.face_transfer_rel_create_hotspot);
                                        if (relativeLayout2 != null) {
                                            i4 = R.id.face_transfer_rel_join_hotspot;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.face_transfer_rel_join_hotspot);
                                            if (relativeLayout3 != null) {
                                                i4 = R.id.face_transfer_right_img;
                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.face_transfer_right_img);
                                                if (imageView5 != null) {
                                                    i4 = R.id.face_transfer_text_create_hotspot;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.face_transfer_text_create_hotspot);
                                                    if (textView3 != null) {
                                                        i4 = R.id.face_transfer_text_join_hotspot;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.face_transfer_text_join_hotspot);
                                                        if (textView4 != null) {
                                                            i4 = R.id.face_transfer_text_phone1;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.face_transfer_text_phone1);
                                                            if (textView5 != null) {
                                                                i4 = R.id.face_transfer_text_phone2;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.face_transfer_text_phone2);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.nopapaTip;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.nopapaTip);
                                                                    if (textView7 != null) {
                                                                        return new FaceTransferHomepageActivityBinding((RelativeLayout) view, relativeLayout, textView, textView2, bind, imageView, imageView2, imageView3, imageView4, relativeLayout2, relativeLayout3, imageView5, textView3, textView4, textView5, textView6, textView7);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static FaceTransferHomepageActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19339b;
    }

    @NonNull
    public static FaceTransferHomepageActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.face_transfer_homepage_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
