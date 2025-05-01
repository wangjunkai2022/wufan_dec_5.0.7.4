package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.ObservableWebView;
import com.join.mgps.customview.SmartScrollView;
/* loaded from: classes3.dex */
public final class GameInformationLayoutBinding implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final RelativeLayout B;
    @NonNull
    public final TextView C;
    @NonNull
    public final TextView D;
    @NonNull
    public final SmartScrollView E;
    @NonNull
    public final ImageView F;
    @NonNull
    public final TextView G;
    @NonNull
    public final TextView H;
    @NonNull
    public final TextView I;
    @NonNull
    public final CustomerDownloadView J;
    @NonNull
    public final TextView K;
    @NonNull
    public final ObservableWebView L;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20398b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f20399c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20400d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f20401e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20402f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20403g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f20404h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f20405i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20406j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20407k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final Button f20408l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f20409m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f20410n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final SimpleDraweeView f20411o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f20412p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f20413q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f20414r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f20415s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f20416t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final Button f20417u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final RelativeLayout f20418v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final GameInformationCommentTopBinding f20419w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f20420x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f20421y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final TextView f20422z;

    private GameInformationLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull TextView textView5, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView6, @NonNull ImageView imageView3, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull Button button2, @NonNull RelativeLayout relativeLayout3, @NonNull GameInformationCommentTopBinding gameInformationCommentTopBinding, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull SmartScrollView smartScrollView, @NonNull ImageView imageView4, @NonNull TextView textView14, @NonNull TextView textView15, @NonNull TextView textView16, @NonNull CustomerDownloadView customerDownloadView, @NonNull TextView textView17, @NonNull ObservableWebView observableWebView) {
        this.f20398b = relativeLayout;
        this.f20399c = simpleDraweeView;
        this.f20400d = imageView;
        this.f20401e = relativeLayout2;
        this.f20402f = textView;
        this.f20403g = textView2;
        this.f20404h = imageView2;
        this.f20405i = linearLayout;
        this.f20406j = textView3;
        this.f20407k = textView4;
        this.f20408l = button;
        this.f20409m = linearLayout2;
        this.f20410n = textView5;
        this.f20411o = simpleDraweeView2;
        this.f20412p = textView6;
        this.f20413q = imageView3;
        this.f20414r = textView7;
        this.f20415s = textView8;
        this.f20416t = textView9;
        this.f20417u = button2;
        this.f20418v = relativeLayout3;
        this.f20419w = gameInformationCommentTopBinding;
        this.f20420x = linearLayout3;
        this.f20421y = linearLayout4;
        this.f20422z = textView10;
        this.A = textView11;
        this.B = relativeLayout4;
        this.C = textView12;
        this.D = textView13;
        this.E = smartScrollView;
        this.F = imageView4;
        this.G = textView14;
        this.H = textView15;
        this.I = textView16;
        this.J = customerDownloadView;
        this.K = textView17;
        this.L = observableWebView;
    }

    @NonNull
    public static GameInformationLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.appImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.appImage);
            if (imageView != null) {
                i4 = R.id.applayout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.applayout);
                if (relativeLayout != null) {
                    i4 = R.id.appname;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname);
                    if (textView != null) {
                        i4 = R.id.appsize;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appsize);
                        if (textView2 != null) {
                            i4 = R.id.backImage;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
                            if (imageView2 != null) {
                                i4 = R.id.bottom_lay;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bottom_lay);
                                if (linearLayout != null) {
                                    i4 = R.id.cardAppSize;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.cardAppSize);
                                    if (textView3 != null) {
                                        i4 = R.id.cardAppname;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.cardAppname);
                                        if (textView4 != null) {
                                            i4 = R.id.cardDownButn;
                                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.cardDownButn);
                                            if (button != null) {
                                                i4 = R.id.cardDownNumber;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.cardDownNumber);
                                                if (linearLayout2 != null) {
                                                    i4 = R.id.cardDownNumberText;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.cardDownNumberText);
                                                    if (textView5 != null) {
                                                        i4 = R.id.cardIcon;
                                                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.cardIcon);
                                                        if (simpleDraweeView2 != null) {
                                                            i4 = R.id.cardInfo;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.cardInfo);
                                                            if (textView6 != null) {
                                                                i4 = R.id.comment;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment);
                                                                if (imageView3 != null) {
                                                                    i4 = R.id.contentName;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.contentName);
                                                                    if (textView7 != null) {
                                                                        i4 = R.id.contentTime;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.contentTime);
                                                                        if (textView8 != null) {
                                                                            i4 = R.id.content_title;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.content_title);
                                                                            if (textView9 != null) {
                                                                                i4 = R.id.downloadImage;
                                                                                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.downloadImage);
                                                                                if (button2 != null) {
                                                                                    i4 = R.id.gameCardLayout;
                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.gameCardLayout);
                                                                                    if (relativeLayout2 != null) {
                                                                                        i4 = R.id.game_information_comment_top;
                                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.game_information_comment_top);
                                                                                        if (findChildViewById != null) {
                                                                                            GameInformationCommentTopBinding bind = GameInformationCommentTopBinding.bind(findChildViewById);
                                                                                            i4 = R.id.layout_share;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_share);
                                                                                            if (linearLayout3 != null) {
                                                                                                i4 = R.id.main;
                                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                                                                                                if (linearLayout4 != null) {
                                                                                                    i4 = R.id.moneyText;
                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                                                                    if (textView10 != null) {
                                                                                                        i4 = R.id.moneyText2;
                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText2);
                                                                                                        if (textView11 != null) {
                                                                                                            i4 = R.id.relativeLayout;
                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout);
                                                                                                            if (relativeLayout3 != null) {
                                                                                                                i4 = R.id.rightTextButn;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.rightTextButn);
                                                                                                                if (textView12 != null) {
                                                                                                                    i4 = R.id.roundMessage;
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.roundMessage);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i4 = R.id.scrollView;
                                                                                                                        SmartScrollView smartScrollView = (SmartScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                                                                        if (smartScrollView != null) {
                                                                                                                            i4 = R.id.shareImg;
                                                                                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.shareImg);
                                                                                                                            if (imageView4 != null) {
                                                                                                                                i4 = R.id.share_textview;
                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.share_textview);
                                                                                                                                if (textView14 != null) {
                                                                                                                                    i4 = R.id.textView69;
                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.textView69);
                                                                                                                                    if (textView15 != null) {
                                                                                                                                        i4 = R.id.textView70;
                                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.textView70);
                                                                                                                                        if (textView16 != null) {
                                                                                                                                            i4 = R.id.title_normal_download_cdv;
                                                                                                                                            CustomerDownloadView customerDownloadView = (CustomerDownloadView) ViewBindings.findChildViewById(view, R.id.title_normal_download_cdv);
                                                                                                                                            if (customerDownloadView != null) {
                                                                                                                                                i4 = R.id.titleText;
                                                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    i4 = R.id.webView;
                                                                                                                                                    ObservableWebView observableWebView = (ObservableWebView) ViewBindings.findChildViewById(view, R.id.webView);
                                                                                                                                                    if (observableWebView != null) {
                                                                                                                                                        return new GameInformationLayoutBinding((RelativeLayout) view, simpleDraweeView, imageView, relativeLayout, textView, textView2, imageView2, linearLayout, textView3, textView4, button, linearLayout2, textView5, simpleDraweeView2, textView6, imageView3, textView7, textView8, textView9, button2, relativeLayout2, bind, linearLayout3, linearLayout4, textView10, textView11, relativeLayout3, textView12, textView13, smartScrollView, imageView4, textView14, textView15, textView16, customerDownloadView, textView17, observableWebView);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameInformationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20398b;
    }

    @NonNull
    public static GameInformationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_information_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
