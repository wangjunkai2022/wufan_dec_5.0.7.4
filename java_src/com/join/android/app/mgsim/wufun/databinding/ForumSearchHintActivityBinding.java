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
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MarqueeTextView;
import com.join.mgps.customview.WrapContentGridView;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class ForumSearchHintActivityBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final WrapContentGridView B;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19552b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19553c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f19554d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19555e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f19556f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f19557g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f19558h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f19559i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f19560j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f19561k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f19562l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SearchBarLayoutBinding f19563m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final MarqueeTextView f19564n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final MarqueeTextView f19565o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final MarqueeTextView f19566p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final MarqueeTextView f19567q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final MarqueeTextView f19568r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final MarqueeTextView f19569s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f19570t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f19571u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f19572v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f19573w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f19574x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f19575y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f19576z;

    private ForumSearchHintActivityBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull XListView2 xListView2, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull RelativeLayout relativeLayout6, @NonNull LinearLayout linearLayout3, @NonNull SearchBarLayoutBinding searchBarLayoutBinding, @NonNull MarqueeTextView marqueeTextView, @NonNull MarqueeTextView marqueeTextView2, @NonNull MarqueeTextView marqueeTextView3, @NonNull MarqueeTextView marqueeTextView4, @NonNull MarqueeTextView marqueeTextView5, @NonNull MarqueeTextView marqueeTextView6, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull WrapContentGridView wrapContentGridView) {
        this.f19552b = linearLayout;
        this.f19553c = linearLayout2;
        this.f19554d = xListView2;
        this.f19555e = textView;
        this.f19556f = relativeLayout;
        this.f19557g = relativeLayout2;
        this.f19558h = relativeLayout3;
        this.f19559i = relativeLayout4;
        this.f19560j = relativeLayout5;
        this.f19561k = relativeLayout6;
        this.f19562l = linearLayout3;
        this.f19563m = searchBarLayoutBinding;
        this.f19564n = marqueeTextView;
        this.f19565o = marqueeTextView2;
        this.f19566p = marqueeTextView3;
        this.f19567q = marqueeTextView4;
        this.f19568r = marqueeTextView5;
        this.f19569s = marqueeTextView6;
        this.f19570t = textView2;
        this.f19571u = textView3;
        this.f19572v = textView4;
        this.f19573w = textView5;
        this.f19574x = textView6;
        this.f19575y = textView7;
        this.f19576z = textView8;
        this.A = textView9;
        this.B = wrapContentGridView;
    }

    @NonNull
    public static ForumSearchHintActivityBinding bind(@NonNull View view) {
        int i4 = R.id.allSearch;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.allSearch);
        if (linearLayout != null) {
            i4 = R.id.autoListView;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.autoListView);
            if (xListView2 != null) {
                i4 = R.id.change_data;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.change_data);
                if (textView != null) {
                    i4 = R.id.layout1;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout1);
                    if (relativeLayout != null) {
                        i4 = R.id.layout2;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout2);
                        if (relativeLayout2 != null) {
                            i4 = R.id.layout3;
                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout3);
                            if (relativeLayout3 != null) {
                                i4 = R.id.layout4;
                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout4);
                                if (relativeLayout4 != null) {
                                    i4 = R.id.layout5;
                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout5);
                                    if (relativeLayout5 != null) {
                                        i4 = R.id.layout6;
                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layout6);
                                        if (relativeLayout6 != null) {
                                            i4 = R.id.llHotSearch;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llHotSearch);
                                            if (linearLayout2 != null) {
                                                i4 = R.id.search_bar_layout;
                                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.search_bar_layout);
                                                if (findChildViewById != null) {
                                                    SearchBarLayoutBinding bind = SearchBarLayoutBinding.bind(findChildViewById);
                                                    i4 = R.id.text1;
                                                    MarqueeTextView marqueeTextView = (MarqueeTextView) ViewBindings.findChildViewById(view, R.id.text1);
                                                    if (marqueeTextView != null) {
                                                        i4 = R.id.text2;
                                                        MarqueeTextView marqueeTextView2 = (MarqueeTextView) ViewBindings.findChildViewById(view, R.id.text2);
                                                        if (marqueeTextView2 != null) {
                                                            i4 = R.id.text3;
                                                            MarqueeTextView marqueeTextView3 = (MarqueeTextView) ViewBindings.findChildViewById(view, R.id.text3);
                                                            if (marqueeTextView3 != null) {
                                                                i4 = R.id.text4;
                                                                MarqueeTextView marqueeTextView4 = (MarqueeTextView) ViewBindings.findChildViewById(view, R.id.text4);
                                                                if (marqueeTextView4 != null) {
                                                                    i4 = R.id.text5;
                                                                    MarqueeTextView marqueeTextView5 = (MarqueeTextView) ViewBindings.findChildViewById(view, R.id.text5);
                                                                    if (marqueeTextView5 != null) {
                                                                        i4 = R.id.text6;
                                                                        MarqueeTextView marqueeTextView6 = (MarqueeTextView) ViewBindings.findChildViewById(view, R.id.text6);
                                                                        if (marqueeTextView6 != null) {
                                                                            i4 = R.id.textView;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                                                            if (textView2 != null) {
                                                                                i4 = R.id.textView2;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                                                                if (textView3 != null) {
                                                                                    i4 = R.id.tv1;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv1);
                                                                                    if (textView4 != null) {
                                                                                        i4 = R.id.tv2;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv2);
                                                                                        if (textView5 != null) {
                                                                                            i4 = R.id.tv3;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv3);
                                                                                            if (textView6 != null) {
                                                                                                i4 = R.id.tv4;
                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv4);
                                                                                                if (textView7 != null) {
                                                                                                    i4 = R.id.tv5;
                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv5);
                                                                                                    if (textView8 != null) {
                                                                                                        i4 = R.id.tv6;
                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv6);
                                                                                                        if (textView9 != null) {
                                                                                                            i4 = R.id.wrapGridView;
                                                                                                            WrapContentGridView wrapContentGridView = (WrapContentGridView) ViewBindings.findChildViewById(view, R.id.wrapGridView);
                                                                                                            if (wrapContentGridView != null) {
                                                                                                                return new ForumSearchHintActivityBinding((LinearLayout) view, linearLayout, xListView2, textView, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, linearLayout2, bind, marqueeTextView, marqueeTextView2, marqueeTextView3, marqueeTextView4, marqueeTextView5, marqueeTextView6, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, wrapContentGridView);
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
    public static ForumSearchHintActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19552b;
    }

    @NonNull
    public static ForumSearchHintActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_search_hint_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
