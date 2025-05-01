package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.gamedetail.FulllScreenVideoView;
/* loaded from: classes3.dex */
public final class GamedetailVideoFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20815b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f20816c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20817d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20818e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f20819f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20820g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f20821h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f20822i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20823j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f20824k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f20825l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f20826m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f20827n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f20828o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f20829p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f20830q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f20831r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f20832s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final RelativeLayout f20833t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f20834u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final View f20835v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f20836w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final RelativeLayout f20837x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final FulllScreenVideoView f20838y;

    private GamedetailVideoFragmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView4, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView4, @NonNull View view, @NonNull TextView textView7, @NonNull RelativeLayout relativeLayout4, @NonNull FulllScreenVideoView fulllScreenVideoView) {
        this.f20815b = relativeLayout;
        this.f20816c = progressBar;
        this.f20817d = imageView;
        this.f20818e = textView;
        this.f20819f = simpleDraweeView;
        this.f20820g = textView2;
        this.f20821h = simpleDraweeView2;
        this.f20822i = linearLayout;
        this.f20823j = textView3;
        this.f20824k = simpleDraweeView3;
        this.f20825l = textView4;
        this.f20826m = relativeLayout2;
        this.f20827n = imageView2;
        this.f20828o = linearLayout2;
        this.f20829p = textView5;
        this.f20830q = textView6;
        this.f20831r = imageView3;
        this.f20832s = linearLayout3;
        this.f20833t = relativeLayout3;
        this.f20834u = imageView4;
        this.f20835v = view;
        this.f20836w = textView7;
        this.f20837x = relativeLayout4;
        this.f20838y = fulllScreenVideoView;
    }

    @NonNull
    public static GamedetailVideoFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.butnProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.butnProgressBar);
        if (progressBar != null) {
            i4 = R.id.butn_showdownload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.butn_showdownload);
            if (imageView != null) {
                i4 = R.id.content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
                if (textView != null) {
                    i4 = R.id.cover;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.cover);
                    if (simpleDraweeView != null) {
                        i4 = R.id.coverText;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.coverText);
                        if (textView2 != null) {
                            i4 = R.id.coverback;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.coverback);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.gameInfoLayout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gameInfoLayout);
                                if (linearLayout != null) {
                                    i4 = R.id.gameName;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                                    if (textView3 != null) {
                                        i4 = R.id.icon;
                                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                                        if (simpleDraweeView3 != null) {
                                            i4 = R.id.instalButtomButn;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.instalButtomButn);
                                            if (textView4 != null) {
                                                i4 = R.id.instalbutnLayout;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.instalbutnLayout);
                                                if (relativeLayout != null) {
                                                    i4 = R.id.iv_back;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                                                    if (imageView2 != null) {
                                                        i4 = R.id.layout;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout);
                                                        if (linearLayout2 != null) {
                                                            i4 = R.id.moneyText;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                            if (textView5 != null) {
                                                                i4 = R.id.percent;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.playIcon;
                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.playIcon);
                                                                    if (imageView3 != null) {
                                                                        i4 = R.id.progress_layout;
                                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.progress_layout);
                                                                        if (linearLayout3 != null) {
                                                                            i4 = R.id.progressbarLayout;
                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.progressbarLayout);
                                                                            if (relativeLayout2 != null) {
                                                                                i4 = R.id.sound;
                                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.sound);
                                                                                if (imageView4 != null) {
                                                                                    i4 = R.id.statuHVIew;
                                                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.statuHVIew);
                                                                                    if (findChildViewById != null) {
                                                                                        i4 = R.id.tag;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tag);
                                                                                        if (textView7 != null) {
                                                                                            i4 = R.id.titleTransfer;
                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.titleTransfer);
                                                                                            if (relativeLayout3 != null) {
                                                                                                i4 = R.id.videoView;
                                                                                                FulllScreenVideoView fulllScreenVideoView = (FulllScreenVideoView) ViewBindings.findChildViewById(view, R.id.videoView);
                                                                                                if (fulllScreenVideoView != null) {
                                                                                                    return new GamedetailVideoFragmentBinding((RelativeLayout) view, progressBar, imageView, textView, simpleDraweeView, textView2, simpleDraweeView2, linearLayout, textView3, simpleDraweeView3, textView4, relativeLayout, imageView2, linearLayout2, textView5, textView6, imageView3, linearLayout3, relativeLayout2, imageView4, findChildViewById, textView7, relativeLayout3, fulllScreenVideoView);
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
    public static GamedetailVideoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20815b;
    }

    @NonNull
    public static GamedetailVideoFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_video_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
