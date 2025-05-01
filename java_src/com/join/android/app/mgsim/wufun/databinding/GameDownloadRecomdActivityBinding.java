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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameDownloadRecomdActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20362b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final AppBarLayout f20363c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20364d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20365e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f20366f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20367g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f20368h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f20369i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f20370j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final CoordinatorLayout f20371k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RecyclerView f20372l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f20373m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f20374n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f20375o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f20376p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f20377q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f20378r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f20379s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final RelativeLayout f20380t;

    private GameDownloadRecomdActivityBinding(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView4, @NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout) {
        this.f20362b = linearLayout;
        this.f20363c = appBarLayout;
        this.f20364d = imageView;
        this.f20365e = imageView2;
        this.f20366f = imageView3;
        this.f20367g = textView;
        this.f20368h = constraintLayout;
        this.f20369i = simpleDraweeView;
        this.f20370j = imageView4;
        this.f20371k = coordinatorLayout;
        this.f20372l = recyclerView;
        this.f20373m = textView2;
        this.f20374n = linearLayout2;
        this.f20375o = textView3;
        this.f20376p = textView4;
        this.f20377q = textView5;
        this.f20378r = textView6;
        this.f20379s = linearLayout3;
        this.f20380t = relativeLayout;
    }

    @NonNull
    public static GameDownloadRecomdActivityBinding bind(@NonNull View view) {
        int i4 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (appBarLayout != null) {
            i4 = R.id.close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
            if (imageView != null) {
                i4 = R.id.close2;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.close2);
                if (imageView2 != null) {
                    i4 = R.id.close3;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.close3);
                    if (imageView3 != null) {
                        i4 = R.id.downNumber;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.downNumber);
                        if (textView != null) {
                            i4 = R.id.downloadAcc;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.downloadAcc);
                            if (constraintLayout != null) {
                                i4 = R.id.icon;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                                if (simpleDraweeView != null) {
                                    i4 = R.id.imageView56;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView56);
                                    if (imageView4 != null) {
                                        i4 = R.id.main;
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, R.id.main);
                                        if (coordinatorLayout != null) {
                                            i4 = R.id.recyclerView;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                                            if (recyclerView != null) {
                                                i4 = R.id.seetext;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.seetext);
                                                if (textView2 != null) {
                                                    i4 = R.id.speedLayout;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.speedLayout);
                                                    if (linearLayout != null) {
                                                        i4 = R.id.table1;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.table1);
                                                        if (textView3 != null) {
                                                            i4 = R.id.table2;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.table2);
                                                            if (textView4 != null) {
                                                                i4 = R.id.tip;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tip);
                                                                if (textView5 != null) {
                                                                    i4 = R.id.title;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                    if (textView6 != null) {
                                                                        i4 = R.id.f15620x;
                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.f15620x);
                                                                        if (linearLayout2 != null) {
                                                                            i4 = R.id.xx;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.xx);
                                                                            if (relativeLayout != null) {
                                                                                return new GameDownloadRecomdActivityBinding((LinearLayout) view, appBarLayout, imageView, imageView2, imageView3, textView, constraintLayout, simpleDraweeView, imageView4, coordinatorLayout, recyclerView, textView2, linearLayout, textView3, textView4, textView5, textView6, linearLayout2, relativeLayout);
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
    public static GameDownloadRecomdActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20362b;
    }

    @NonNull
    public static GameDownloadRecomdActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_download_recomd_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
