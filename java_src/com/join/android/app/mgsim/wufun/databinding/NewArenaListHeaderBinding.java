package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.AutoScrollViewPager;
/* loaded from: classes3.dex */
public final class NewArenaListHeaderBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25439b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f25440c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final AutoScrollViewPager f25441d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25442e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25443f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25444g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25445h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f25446i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25447j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25448k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25449l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25450m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f25451n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25452o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f25453p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f25454q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f25455r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f25456s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f25457t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final LinearLayout f25458u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f25459v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f25460w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f25461x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f25462y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f25463z;

    private NewArenaListHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull AutoScrollViewPager autoScrollViewPager, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull LinearLayout linearLayout2, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16) {
        this.f25439b = linearLayout;
        this.f25440c = simpleDraweeView;
        this.f25441d = autoScrollViewPager;
        this.f25442e = textView;
        this.f25443f = textView2;
        this.f25444g = textView3;
        this.f25445h = textView4;
        this.f25446i = relativeLayout;
        this.f25447j = textView5;
        this.f25448k = textView6;
        this.f25449l = textView7;
        this.f25450m = textView8;
        this.f25451n = linearLayout2;
        this.f25452o = textView9;
        this.f25453p = textView10;
        this.f25454q = textView11;
        this.f25455r = linearLayout3;
        this.f25456s = linearLayout4;
        this.f25457t = linearLayout5;
        this.f25458u = linearLayout6;
        this.f25459v = linearLayout7;
        this.f25460w = textView12;
        this.f25461x = textView13;
        this.f25462y = textView14;
        this.f25463z = textView15;
        this.A = textView16;
    }

    @NonNull
    public static NewArenaListHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.ad_iv_icon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ad_iv_icon);
        if (simpleDraweeView != null) {
            i4 = R.id.ad_viewpager;
            AutoScrollViewPager autoScrollViewPager = (AutoScrollViewPager) ViewBindings.findChildViewById(view, R.id.ad_viewpager);
            if (autoScrollViewPager != null) {
                i4 = R.id.event_gamename_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.event_gamename_tv);
                if (textView != null) {
                    i4 = R.id.event_nike_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.event_nike_tv);
                    if (textView2 != null) {
                        i4 = R.id.event_num_after_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.event_num_after_tv);
                        if (textView3 != null) {
                            i4 = R.id.event_num_tv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.event_num_tv);
                            if (textView4 != null) {
                                i4 = R.id.event_root_rl;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.event_root_rl);
                                if (relativeLayout != null) {
                                    i4 = R.id.fcLine;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.fcLine);
                                    if (textView5 != null) {
                                        i4 = R.id.fc_num_tv;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.fc_num_tv);
                                        if (textView6 != null) {
                                            i4 = R.id.gbaLine;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.gbaLine);
                                            if (textView7 != null) {
                                                i4 = R.id.jieji_num_tv;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.jieji_num_tv);
                                                if (textView8 != null) {
                                                    i4 = R.id.jingxuan;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.jingxuan);
                                                    if (linearLayout != null) {
                                                        i4 = R.id.jingxuanLine;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.jingxuanLine);
                                                        if (textView9 != null) {
                                                            i4 = R.id.jingxuantext;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.jingxuantext);
                                                            if (textView10 != null) {
                                                                i4 = R.id.latest_num_tv;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.latest_num_tv);
                                                                if (textView11 != null) {
                                                                    i4 = R.id.ll_fast_entrance;
                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_fast_entrance);
                                                                    if (linearLayout2 != null) {
                                                                        i4 = R.id.ll_fc;
                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_fc);
                                                                        if (linearLayout3 != null) {
                                                                            i4 = R.id.ll_jieji;
                                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_jieji);
                                                                            if (linearLayout4 != null) {
                                                                                i4 = R.id.ll_latest;
                                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_latest);
                                                                                if (linearLayout5 != null) {
                                                                                    i4 = R.id.ll_others;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_others);
                                                                                    if (linearLayout6 != null) {
                                                                                        i4 = R.id.newLine;
                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.newLine);
                                                                                        if (textView12 != null) {
                                                                                            i4 = R.id.tvFC;
                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFC);
                                                                                            if (textView13 != null) {
                                                                                                i4 = R.id.tvGBA;
                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGBA);
                                                                                                if (textView14 != null) {
                                                                                                    i4 = R.id.tvJingxuan;
                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJingxuan);
                                                                                                    if (textView15 != null) {
                                                                                                        i4 = R.id.tvNew;
                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNew);
                                                                                                        if (textView16 != null) {
                                                                                                            return new NewArenaListHeaderBinding((LinearLayout) view, simpleDraweeView, autoScrollViewPager, textView, textView2, textView3, textView4, relativeLayout, textView5, textView6, textView7, textView8, linearLayout, textView9, textView10, textView11, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView12, textView13, textView14, textView15, textView16);
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
    public static NewArenaListHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25439b;
    }

    @NonNull
    public static NewArenaListHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.new_arena_list_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
