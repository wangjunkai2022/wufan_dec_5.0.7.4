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
public final class FastEntryLayoutBinding implements ViewBinding {
    @NonNull
    public final LinearLayout A;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19375b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19376c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19377d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f19378e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19379f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f19380g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19381h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19382i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f19383j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f19384k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f19385l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f19386m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f19387n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f19388o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f19389p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final SimpleDraweeView f19390q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f19391r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f19392s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f19393t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f19394u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f19395v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f19396w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f19397x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final SimpleDraweeView f19398y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f19399z;

    private FastEntryLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull LinearLayout linearLayout7, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout8, @NonNull TextView textView7, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull TextView textView8, @NonNull LinearLayout linearLayout9) {
        this.f19375b = linearLayout;
        this.f19376c = linearLayout2;
        this.f19377d = linearLayout3;
        this.f19378e = simpleDraweeView;
        this.f19379f = textView;
        this.f19380g = simpleDraweeView2;
        this.f19381h = linearLayout4;
        this.f19382i = textView2;
        this.f19383j = imageView;
        this.f19384k = imageView2;
        this.f19385l = imageView3;
        this.f19386m = imageView4;
        this.f19387n = imageView5;
        this.f19388o = linearLayout5;
        this.f19389p = linearLayout6;
        this.f19390q = simpleDraweeView3;
        this.f19391r = linearLayout7;
        this.f19392s = textView3;
        this.f19393t = textView4;
        this.f19394u = textView5;
        this.f19395v = textView6;
        this.f19396w = linearLayout8;
        this.f19397x = textView7;
        this.f19398y = simpleDraweeView4;
        this.f19399z = textView8;
        this.A = linearLayout9;
    }

    @NonNull
    public static FastEntryLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.autoLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.autoLayout);
        if (linearLayout != null) {
            i4 = R.id.bottomLayout;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bottomLayout);
            if (linearLayout2 != null) {
                i4 = R.id.fastFourlayoutImage;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.fastFourlayoutImage);
                if (simpleDraweeView != null) {
                    i4 = R.id.fastFourlayoutText;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.fastFourlayoutText);
                    if (textView != null) {
                        i4 = R.id.forumImage;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.forumImage);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.forum_layout;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_layout);
                            if (linearLayout3 != null) {
                                i4 = R.id.forumText;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forumText);
                                if (textView2 != null) {
                                    i4 = R.id.imageView19;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView19);
                                    if (imageView != null) {
                                        i4 = R.id.imageView20;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView20);
                                        if (imageView2 != null) {
                                            i4 = R.id.imageView21;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView21);
                                            if (imageView3 != null) {
                                                i4 = R.id.imageView22;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView22);
                                                if (imageView4 != null) {
                                                    i4 = R.id.imageView23;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView23);
                                                    if (imageView5 != null) {
                                                        i4 = R.id.linearLayout5;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout5);
                                                        if (linearLayout4 != null) {
                                                            i4 = R.id.mainlayout;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.mainlayout);
                                                            if (linearLayout5 != null) {
                                                                i4 = R.id.qqImage;
                                                                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.qqImage);
                                                                if (simpleDraweeView3 != null) {
                                                                    i4 = R.id.qqLayout;
                                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.qqLayout);
                                                                    if (linearLayout6 != null) {
                                                                        i4 = R.id.qqText;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.qqText);
                                                                        if (textView3 != null) {
                                                                            i4 = R.id.textView34;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView34);
                                                                            if (textView4 != null) {
                                                                                i4 = R.id.textView35;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView35);
                                                                                if (textView5 != null) {
                                                                                    i4 = R.id.textView36;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView36);
                                                                                    if (textView6 != null) {
                                                                                        i4 = R.id.title;
                                                                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.title);
                                                                                        if (linearLayout7 != null) {
                                                                                            i4 = R.id.today_number;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.today_number);
                                                                                            if (textView7 != null) {
                                                                                                i4 = R.id.weiCharImage;
                                                                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.weiCharImage);
                                                                                                if (simpleDraweeView4 != null) {
                                                                                                    i4 = R.id.weiCharText;
                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.weiCharText);
                                                                                                    if (textView8 != null) {
                                                                                                        i4 = R.id.weichartLayout;
                                                                                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.weichartLayout);
                                                                                                        if (linearLayout8 != null) {
                                                                                                            return new FastEntryLayoutBinding((LinearLayout) view, linearLayout, linearLayout2, simpleDraweeView, textView, simpleDraweeView2, linearLayout3, textView2, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout4, linearLayout5, simpleDraweeView3, linearLayout6, textView3, textView4, textView5, textView6, linearLayout7, textView7, simpleDraweeView4, textView8, linearLayout8);
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
    public static FastEntryLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19375b;
    }

    @NonNull
    public static FastEntryLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fast_entry_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
