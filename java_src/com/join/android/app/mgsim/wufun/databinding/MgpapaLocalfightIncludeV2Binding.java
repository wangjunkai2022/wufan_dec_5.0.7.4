package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgpapaLocalfightIncludeV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24783b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24784c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f24785d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f24786e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f24787f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24788g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f24789h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f24790i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f24791j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24792k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24793l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f24794m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f24795n;

    private MgpapaLocalfightIncludeV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f24783b = constraintLayout;
        this.f24784c = textView;
        this.f24785d = simpleDraweeView;
        this.f24786e = view;
        this.f24787f = simpleDraweeView2;
        this.f24788g = linearLayout;
        this.f24789h = relativeLayout;
        this.f24790i = relativeLayout2;
        this.f24791j = relativeLayout3;
        this.f24792k = textView2;
        this.f24793l = textView3;
        this.f24794m = textView4;
        this.f24795n = textView5;
    }

    @NonNull
    public static MgpapaLocalfightIncludeV2Binding bind(@NonNull View view) {
        int i4 = R.id.fight_appname;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.fight_appname);
        if (textView != null) {
            i4 = R.id.fightapp_image;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.fightapp_image);
            if (simpleDraweeView != null) {
                i4 = R.id.gradientView;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.gradientView);
                if (findChildViewById != null) {
                    i4 = R.id.ivDzg;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivDzg);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.llDailyNewIcon;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDailyNewIcon);
                        if (linearLayout != null) {
                            i4 = R.id.rlDailyDiscovery;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlDailyDiscovery);
                            if (relativeLayout != null) {
                                i4 = R.id.rlDailyNew;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlDailyNew);
                                if (relativeLayout2 != null) {
                                    i4 = R.id.rlDzg;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlDzg);
                                    if (relativeLayout3 != null) {
                                        i4 = R.id.tvDailyNewCount;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDailyNewCount);
                                        if (textView2 != null) {
                                            i4 = R.id.tvDialyNew;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDialyNew);
                                            if (textView3 != null) {
                                                i4 = R.id.tvDzg;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDzg);
                                                if (textView4 != null) {
                                                    i4 = R.id.tvDzgSub;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDzgSub);
                                                    if (textView5 != null) {
                                                        return new MgpapaLocalfightIncludeV2Binding((ConstraintLayout) view, textView, simpleDraweeView, findChildViewById, simpleDraweeView2, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, textView2, textView3, textView4, textView5);
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
    public static MgpapaLocalfightIncludeV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24783b;
    }

    @NonNull
    public static MgpapaLocalfightIncludeV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_localfight_include_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
