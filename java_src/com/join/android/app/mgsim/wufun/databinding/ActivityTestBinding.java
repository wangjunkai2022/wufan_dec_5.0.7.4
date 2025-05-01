package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class ActivityTestBinding implements ViewBinding {
    @NonNull
    public final ImageView A;
    @NonNull
    public final RelativeLayout B;
    @NonNull
    public final LinearLayout C;
    @NonNull
    public final TextView D;
    @NonNull
    public final FrameLayout E;
    @NonNull
    public final ImageView F;
    @NonNull
    public final LinearLayout G;
    @NonNull
    public final TextView H;
    @NonNull
    public final TextView I;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17109b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f17110c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17111d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f17112e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f17113f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f17114g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f17115h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f17116i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f17117j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f17118k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17119l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f17120m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f17121n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f17122o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f17123p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f17124q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f17125r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f17126s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final RelativeLayout f17127t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f17128u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f17129v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f17130w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f17131x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final RelativeLayout f17132y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f17133z;

    private ActivityTestBinding(@NonNull FrameLayout frameLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView9, @NonNull LinearLayout linearLayout4, @NonNull TextView textView3, @NonNull ImageView imageView10, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView4, @NonNull ImageView imageView11, @NonNull RelativeLayout relativeLayout5, @NonNull LinearLayout linearLayout5, @NonNull TextView textView5, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView12, @NonNull LinearLayout linearLayout6, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f17109b = frameLayout;
        this.f17110c = mgForumTitleLayoutBinding;
        this.f17111d = textView;
        this.f17112e = linearLayout;
        this.f17113f = relativeLayout;
        this.f17114g = imageView;
        this.f17115h = imageView2;
        this.f17116i = simpleDraweeView;
        this.f17117j = imageView3;
        this.f17118k = linearLayout2;
        this.f17119l = textView2;
        this.f17120m = linearLayout3;
        this.f17121n = imageView4;
        this.f17122o = imageView5;
        this.f17123p = relativeLayout2;
        this.f17124q = imageView6;
        this.f17125r = imageView7;
        this.f17126s = imageView8;
        this.f17127t = relativeLayout3;
        this.f17128u = imageView9;
        this.f17129v = linearLayout4;
        this.f17130w = textView3;
        this.f17131x = imageView10;
        this.f17132y = relativeLayout4;
        this.f17133z = textView4;
        this.A = imageView11;
        this.B = relativeLayout5;
        this.C = linearLayout5;
        this.D = textView5;
        this.E = frameLayout2;
        this.F = imageView12;
        this.G = linearLayout6;
        this.H = textView6;
        this.I = textView7;
    }

    @NonNull
    public static ActivityTestBinding bind(@NonNull View view) {
        int i4 = R.id.actionbarLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.actionbarLayout);
        if (findChildViewById != null) {
            MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
            i4 = R.id.bigCenterRound;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.bigCenterRound);
            if (textView != null) {
                i4 = R.id.bottom;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bottom);
                if (linearLayout != null) {
                    i4 = R.id.classify_tips;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.classify_tips);
                    if (relativeLayout != null) {
                        i4 = R.id.classify_tips_circle;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.classify_tips_circle);
                        if (imageView != null) {
                            i4 = R.id.classify_tips_ok;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.classify_tips_ok);
                            if (imageView2 != null) {
                                i4 = R.id.coinFloatad;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.coinFloatad);
                                if (simpleDraweeView != null) {
                                    i4 = R.id.fightImage;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.fightImage);
                                    if (imageView3 != null) {
                                        i4 = R.id.fightSelect;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.fightSelect);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.fightText;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.fightText);
                                            if (textView2 != null) {
                                                i4 = R.id.home_tab_default_layout;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.home_tab_default_layout);
                                                if (linearLayout3 != null) {
                                                    i4 = R.id.home_tab_huojian_image;
                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.home_tab_huojian_image);
                                                    if (imageView4 != null) {
                                                        i4 = R.id.home_tab_monkey_image;
                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.home_tab_monkey_image);
                                                        if (imageView5 != null) {
                                                            i4 = R.id.home_tab_monkey_layout;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.home_tab_monkey_layout);
                                                            if (relativeLayout2 != null) {
                                                                i4 = R.id.imageView36;
                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView36);
                                                                if (imageView6 != null) {
                                                                    i4 = R.id.imageView38;
                                                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView38);
                                                                    if (imageView7 != null) {
                                                                        i4 = R.id.imageView39;
                                                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView39);
                                                                        if (imageView8 != null) {
                                                                            i4 = R.id.mainTop;
                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.mainTop);
                                                                            if (relativeLayout3 != null) {
                                                                                i4 = R.id.mg_category_image;
                                                                                ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.mg_category_image);
                                                                                if (imageView9 != null) {
                                                                                    i4 = R.id.mg_category_tabselect;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.mg_category_tabselect);
                                                                                    if (linearLayout4 != null) {
                                                                                        i4 = R.id.mg_category_text;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.mg_category_text);
                                                                                        if (textView3 != null) {
                                                                                            i4 = R.id.mg_chart_image;
                                                                                            ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.mg_chart_image);
                                                                                            if (imageView10 != null) {
                                                                                                i4 = R.id.mg_chart_tabselect;
                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.mg_chart_tabselect);
                                                                                                if (relativeLayout4 != null) {
                                                                                                    i4 = R.id.mg_chart_text;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mg_chart_text);
                                                                                                    if (textView4 != null) {
                                                                                                        i4 = R.id.mg_emulator_image;
                                                                                                        ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, R.id.mg_emulator_image);
                                                                                                        if (imageView11 != null) {
                                                                                                            i4 = R.id.mg_emulator_tabselect;
                                                                                                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.mg_emulator_tabselect);
                                                                                                            if (relativeLayout5 != null) {
                                                                                                                i4 = R.id.mg_emulator_tabselect_layout;
                                                                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.mg_emulator_tabselect_layout);
                                                                                                                if (linearLayout5 != null) {
                                                                                                                    i4 = R.id.mg_emulator_text;
                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.mg_emulator_text);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i4 = R.id.mg_mian_fragmentlayout;
                                                                                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.mg_mian_fragmentlayout);
                                                                                                                        if (frameLayout != null) {
                                                                                                                            i4 = R.id.mg_recom_image;
                                                                                                                            ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(view, R.id.mg_recom_image);
                                                                                                                            if (imageView12 != null) {
                                                                                                                                i4 = R.id.mg_recom_tabselect;
                                                                                                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.mg_recom_tabselect);
                                                                                                                                if (linearLayout6 != null) {
                                                                                                                                    i4 = R.id.mg_recom_text;
                                                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.mg_recom_text);
                                                                                                                                    if (textView6 != null) {
                                                                                                                                        i4 = R.id.unreadMessageBadge;
                                                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.unreadMessageBadge);
                                                                                                                                        if (textView7 != null) {
                                                                                                                                            return new ActivityTestBinding((FrameLayout) view, bind, textView, linearLayout, relativeLayout, imageView, imageView2, simpleDraweeView, imageView3, linearLayout2, textView2, linearLayout3, imageView4, imageView5, relativeLayout2, imageView6, imageView7, imageView8, relativeLayout3, imageView9, linearLayout4, textView3, imageView10, relativeLayout4, textView4, imageView11, relativeLayout5, linearLayout5, textView5, frameLayout, imageView12, linearLayout6, textView6, textView7);
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
    public static ActivityTestBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17109b;
    }

    @NonNull
    public static ActivityTestBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_test, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
