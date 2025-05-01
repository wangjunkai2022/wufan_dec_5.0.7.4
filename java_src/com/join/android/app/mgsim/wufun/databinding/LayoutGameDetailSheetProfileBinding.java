package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
/* loaded from: classes3.dex */
public final class LayoutGameDetailSheetProfileBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final TextView B;
    @NonNull
    public final Group C;
    @NonNull
    public final TextView D;
    @NonNull
    public final View E;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23060b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23061c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23062d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23063e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23064f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23065g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23066h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final FlowLayout f23067i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23068j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23069k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f23070l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ScrollView f23071m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final Group f23072n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f23073o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f23074p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f23075q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f23076r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f23077s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f23078t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f23079u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f23080v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f23081w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f23082x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f23083y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f23084z;

    private LayoutGameDetailSheetProfileBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull FlowLayout flowLayout, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull ScrollView scrollView, @NonNull Group group, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull TextView textView17, @NonNull TextView textView18, @NonNull TextView textView19, @NonNull TextView textView20, @NonNull TextView textView21, @NonNull TextView textView22, @NonNull Group group2, @NonNull TextView textView23, @NonNull View view) {
        this.f23060b = linearLayout;
        this.f23061c = textView;
        this.f23062d = textView2;
        this.f23063e = imageView;
        this.f23064f = textView3;
        this.f23065g = textView4;
        this.f23066h = textView5;
        this.f23067i = flowLayout;
        this.f23068j = textView6;
        this.f23069k = textView7;
        this.f23070l = textView8;
        this.f23071m = scrollView;
        this.f23072n = group;
        this.f23073o = textView9;
        this.f23074p = textView10;
        this.f23075q = textView11;
        this.f23076r = textView12;
        this.f23077s = textView13;
        this.f23078t = textView14;
        this.f23079u = textView15;
        this.f23080v = textView16;
        this.f23081w = textView17;
        this.f23082x = textView18;
        this.f23083y = textView19;
        this.f23084z = textView20;
        this.A = textView21;
        this.B = textView22;
        this.C = group2;
        this.D = textView23;
        this.E = view;
    }

    @NonNull
    public static LayoutGameDetailSheetProfileBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.beian;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.beian);
            if (textView2 != null) {
                i4 = R.id.close;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
                if (imageView != null) {
                    i4 = R.id.date;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.date);
                    if (textView3 != null) {
                        i4 = R.id.desc;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
                        if (textView4 != null) {
                            i4 = R.id.downloadCount;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.downloadCount);
                            if (textView5 != null) {
                                i4 = R.id.flowLayout;
                                FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, R.id.flowLayout);
                                if (flowLayout != null) {
                                    i4 = R.id.gameFrom;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.gameFrom);
                                    if (textView6 != null) {
                                        i4 = R.id.permission;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.permission);
                                        if (textView7 != null) {
                                            i4 = R.id.privacy;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.privacy);
                                            if (textView8 != null) {
                                                i4 = R.id.scrollView;
                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                if (scrollView != null) {
                                                    i4 = R.id.sourceGroup;
                                                    Group group = (Group) ViewBindings.findChildViewById(view, R.id.sourceGroup);
                                                    if (group != null) {
                                                        i4 = R.id.textView101;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.textView101);
                                                        if (textView9 != null) {
                                                            i4 = R.id.textView103;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.textView103);
                                                            if (textView10 != null) {
                                                                i4 = R.id.textView104;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.textView104);
                                                                if (textView11 != null) {
                                                                    i4 = R.id.textView108;
                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.textView108);
                                                                    if (textView12 != null) {
                                                                        i4 = R.id.textView110;
                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.textView110);
                                                                        if (textView13 != null) {
                                                                            i4 = R.id.textView112;
                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.textView112);
                                                                            if (textView14 != null) {
                                                                                i4 = R.id.textView114;
                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.textView114);
                                                                                if (textView15 != null) {
                                                                                    i4 = R.id.textView93;
                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.textView93);
                                                                                    if (textView16 != null) {
                                                                                        i4 = R.id.textViewBeian;
                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.textViewBeian);
                                                                                        if (textView17 != null) {
                                                                                            i4 = R.id.textViewPrivacy;
                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.textViewPrivacy);
                                                                                            if (textView18 != null) {
                                                                                                i4 = R.id.updateMessage;
                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.updateMessage);
                                                                                                if (textView19 != null) {
                                                                                                    i4 = R.id.updateMessageTitle;
                                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.updateMessageTitle);
                                                                                                    if (textView20 != null) {
                                                                                                        i4 = R.id.uploadGame;
                                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.uploadGame);
                                                                                                        if (textView21 != null) {
                                                                                                            i4 = R.id.vendor;
                                                                                                            TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.vendor);
                                                                                                            if (textView22 != null) {
                                                                                                                i4 = R.id.vendorGroup;
                                                                                                                Group group2 = (Group) ViewBindings.findChildViewById(view, R.id.vendorGroup);
                                                                                                                if (group2 != null) {
                                                                                                                    i4 = R.id.versionName;
                                                                                                                    TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.versionName);
                                                                                                                    if (textView23 != null) {
                                                                                                                        i4 = R.id.view17;
                                                                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view17);
                                                                                                                        if (findChildViewById != null) {
                                                                                                                            return new LayoutGameDetailSheetProfileBinding((LinearLayout) view, textView, textView2, imageView, textView3, textView4, textView5, flowLayout, textView6, textView7, textView8, scrollView, group, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, group2, textView23, findChildViewById);
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
    public static LayoutGameDetailSheetProfileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23060b;
    }

    @NonNull
    public static LayoutGameDetailSheetProfileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_game_detail_sheet_profile, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
