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
public final class GameDetialStrainfmoreItemimage3Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20331b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f20332c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20333d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20334e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f20335f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20336g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f20337h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f20338i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f20339j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20340k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f20341l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f20342m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f20343n;

    private GameDetialStrainfmoreItemimage3Binding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout3) {
        this.f20331b = linearLayout;
        this.f20332c = relativeLayout;
        this.f20333d = linearLayout2;
        this.f20334e = imageView;
        this.f20335f = imageView2;
        this.f20336g = textView;
        this.f20337h = simpleDraweeView;
        this.f20338i = simpleDraweeView2;
        this.f20339j = simpleDraweeView3;
        this.f20340k = textView2;
        this.f20341l = textView3;
        this.f20342m = textView4;
        this.f20343n = linearLayout3;
    }

    @NonNull
    public static GameDetialStrainfmoreItemimage3Binding bind(@NonNull View view) {
        int i4 = R.id.forum_post_media_container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.forum_post_media_container);
        if (relativeLayout != null) {
            i4 = R.id.forum_post_media_pic_main;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_post_media_pic_main);
            if (linearLayout != null) {
                i4 = R.id.imageView16;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView16);
                if (imageView != null) {
                    i4 = R.id.imageView17;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView17);
                    if (imageView2 != null) {
                        i4 = R.id.images_count;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.images_count);
                        if (textView != null) {
                            i4 = R.id.img_m_1;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_m_1);
                            if (simpleDraweeView != null) {
                                i4 = R.id.img_m_2;
                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_m_2);
                                if (simpleDraweeView2 != null) {
                                    i4 = R.id.img_m_3;
                                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_m_3);
                                    if (simpleDraweeView3 != null) {
                                        i4 = R.id.pubtime;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.pubtime);
                                        if (textView2 != null) {
                                            i4 = R.id.pv;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.pv);
                                            if (textView3 != null) {
                                                i4 = R.id.uv;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.uv);
                                                if (textView4 != null) {
                                                    i4 = R.id.viewBottom;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.viewBottom);
                                                    if (linearLayout2 != null) {
                                                        return new GameDetialStrainfmoreItemimage3Binding((LinearLayout) view, relativeLayout, linearLayout, imageView, imageView2, textView, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, textView2, textView3, textView4, linearLayout2);
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
    public static GameDetialStrainfmoreItemimage3Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20331b;
    }

    @NonNull
    public static GameDetialStrainfmoreItemimage3Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_detial_strainfmore_itemimage3, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
