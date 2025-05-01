package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopBattleAreaBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25970b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25971c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25972d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f25973e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f25974f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25975g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f25976h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f25977i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f25978j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ListView f25979k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f25980l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f25981m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f25982n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f25983o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f25984p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f25985q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f25986r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f25987s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f25988t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final View f25989u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final View f25990v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final View f25991w;

    private PopBattleAreaBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ListView listView, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view3, @NonNull View view4, @NonNull View view5) {
        this.f25970b = linearLayout;
        this.f25971c = linearLayout2;
        this.f25972d = textView;
        this.f25973e = view;
        this.f25974f = view2;
        this.f25975g = imageView;
        this.f25976h = imageView2;
        this.f25977i = imageView3;
        this.f25978j = imageView4;
        this.f25979k = listView;
        this.f25980l = linearLayout3;
        this.f25981m = relativeLayout;
        this.f25982n = relativeLayout2;
        this.f25983o = relativeLayout3;
        this.f25984p = relativeLayout4;
        this.f25985q = relativeLayout5;
        this.f25986r = textView2;
        this.f25987s = textView3;
        this.f25988t = textView4;
        this.f25989u = view3;
        this.f25990v = view4;
        this.f25991w = view5;
    }

    @NonNull
    public static PopBattleAreaBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.area_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.area_title);
        if (textView != null) {
            i4 = R.id.dot;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.dot);
            if (findChildViewById != null) {
                i4 = R.id.emptyView;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.emptyView);
                if (findChildViewById2 != null) {
                    i4 = R.id.iv_arrow;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_arrow);
                    if (imageView != null) {
                        i4 = R.id.iv_bj_battle_area_rec;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bj_battle_area_rec);
                        if (imageView2 != null) {
                            i4 = R.id.iv_gz_battle_area_rec;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gz_battle_area_rec);
                            if (imageView3 != null) {
                                i4 = R.id.iv_sh_battle_area_rec;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sh_battle_area_rec);
                                if (imageView4 != null) {
                                    i4 = R.id.listview;
                                    ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listview);
                                    if (listView != null) {
                                        i4 = R.id.rl_areas;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_areas);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.rl_bj;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_bj);
                                            if (relativeLayout != null) {
                                                i4 = R.id.rl_games;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_games);
                                                if (relativeLayout2 != null) {
                                                    i4 = R.id.rl_gz;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_gz);
                                                    if (relativeLayout3 != null) {
                                                        i4 = R.id.rl_sel;
                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_sel);
                                                        if (relativeLayout4 != null) {
                                                            i4 = R.id.rl_sh;
                                                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_sh);
                                                            if (relativeLayout5 != null) {
                                                                i4 = R.id.tv_bj;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bj);
                                                                if (textView2 != null) {
                                                                    i4 = R.id.tv_gz;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gz);
                                                                    if (textView3 != null) {
                                                                        i4 = R.id.tv_sh;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sh);
                                                                        if (textView4 != null) {
                                                                            i4 = R.id.view_bj;
                                                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.view_bj);
                                                                            if (findChildViewById3 != null) {
                                                                                i4 = R.id.view_gz;
                                                                                View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.view_gz);
                                                                                if (findChildViewById4 != null) {
                                                                                    i4 = R.id.view_sh;
                                                                                    View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.view_sh);
                                                                                    if (findChildViewById5 != null) {
                                                                                        return new PopBattleAreaBinding(linearLayout, linearLayout, textView, findChildViewById, findChildViewById2, imageView, imageView2, imageView3, imageView4, listView, linearLayout2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, textView2, textView3, textView4, findChildViewById3, findChildViewById4, findChildViewById5);
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
    public static PopBattleAreaBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25970b;
    }

    @NonNull
    public static PopBattleAreaBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_battle_area, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
