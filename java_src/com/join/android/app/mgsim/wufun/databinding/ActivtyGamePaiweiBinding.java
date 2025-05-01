package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
public final class ActivtyGamePaiweiBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17311b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f17312c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f17313d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final AutoScrollViewPager f17314e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f17315f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17316g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f17317h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17318i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17319j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17320k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17321l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ListView f17322m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17323n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final Button f17324o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f17325p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f17326q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f17327r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f17328s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f17329t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final ListView f17330u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f17331v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f17332w;

    private ActivtyGamePaiweiBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull AutoScrollViewPager autoScrollViewPager, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ListView listView, @NonNull TextView textView6, @NonNull Button button, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView3, @NonNull ListView listView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView10) {
        this.f17311b = relativeLayout;
        this.f17312c = relativeLayout2;
        this.f17313d = simpleDraweeView;
        this.f17314e = autoScrollViewPager;
        this.f17315f = imageView;
        this.f17316g = textView;
        this.f17317h = imageView2;
        this.f17318i = textView2;
        this.f17319j = textView3;
        this.f17320k = textView4;
        this.f17321l = textView5;
        this.f17322m = listView;
        this.f17323n = textView6;
        this.f17324o = button;
        this.f17325p = textView7;
        this.f17326q = textView8;
        this.f17327r = textView9;
        this.f17328s = relativeLayout3;
        this.f17329t = imageView3;
        this.f17330u = listView2;
        this.f17331v = linearLayout;
        this.f17332w = textView10;
    }

    @NonNull
    public static ActivtyGamePaiweiBinding bind(@NonNull View view) {
        int i4 = R.id.info_rl;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.info_rl);
        if (relativeLayout != null) {
            i4 = R.id.paiwei_ad_iv;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.paiwei_ad_iv);
            if (simpleDraweeView != null) {
                i4 = R.id.paiwei_ad_viewpager;
                AutoScrollViewPager autoScrollViewPager = (AutoScrollViewPager) ViewBindings.findChildViewById(view, R.id.paiwei_ad_viewpager);
                if (autoScrollViewPager != null) {
                    i4 = R.id.paiwei_back_iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.paiwei_back_iv);
                    if (imageView != null) {
                        i4 = R.id.paiwei_cion_tv;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_cion_tv);
                        if (textView != null) {
                            i4 = R.id.paiwei_help_ib;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.paiwei_help_ib);
                            if (imageView2 != null) {
                                i4 = R.id.paiwei_info_tv1;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_info_tv1);
                                if (textView2 != null) {
                                    i4 = R.id.paiwei_info_tv2;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_info_tv2);
                                    if (textView3 != null) {
                                        i4 = R.id.paiwei_info_tv3;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_info_tv3);
                                        if (textView4 != null) {
                                            i4 = R.id.paiwei_info_tv4;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_info_tv4);
                                            if (textView5 != null) {
                                                i4 = R.id.paiwei_listview;
                                                ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.paiwei_listview);
                                                if (listView != null) {
                                                    i4 = R.id.paiwei_null_tv;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_null_tv);
                                                    if (textView6 != null) {
                                                        i4 = R.id.paiwei_start_bt;
                                                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.paiwei_start_bt);
                                                        if (button != null) {
                                                            i4 = R.id.paiwei_start_name_tv;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_start_name_tv);
                                                            if (textView7 != null) {
                                                                i4 = R.id.paiwei_start_order_tv;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_start_order_tv);
                                                                if (textView8 != null) {
                                                                    i4 = R.id.paiwei_start_time_tv;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.paiwei_start_time_tv);
                                                                    if (textView9 != null) {
                                                                        i4 = R.id.paiwei_title_rl;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.paiwei_title_rl);
                                                                        if (relativeLayout2 != null) {
                                                                            i4 = R.id.select_rolo_iv;
                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.select_rolo_iv);
                                                                            if (imageView3 != null) {
                                                                                i4 = R.id.select_rolo_listview;
                                                                                ListView listView2 = (ListView) ViewBindings.findChildViewById(view, R.id.select_rolo_listview);
                                                                                if (listView2 != null) {
                                                                                    i4 = R.id.select_rolo_ll;
                                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.select_rolo_ll);
                                                                                    if (linearLayout != null) {
                                                                                        i4 = R.id.select_rolo_tx;
                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.select_rolo_tx);
                                                                                        if (textView10 != null) {
                                                                                            return new ActivtyGamePaiweiBinding((RelativeLayout) view, relativeLayout, simpleDraweeView, autoScrollViewPager, imageView, textView, imageView2, textView2, textView3, textView4, textView5, listView, textView6, button, textView7, textView8, textView9, relativeLayout2, imageView3, listView2, linearLayout, textView10);
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
    public static ActivtyGamePaiweiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17311b;
    }

    @NonNull
    public static ActivtyGamePaiweiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activty_game_paiwei, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
