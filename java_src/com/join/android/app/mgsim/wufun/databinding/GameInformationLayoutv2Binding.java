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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
/* loaded from: classes3.dex */
public final class GameInformationLayoutv2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20423b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f20424c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20425d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f20426e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20427f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20428g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f20429h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f20430i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f20431j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f20432k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f20433l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f20434m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f20435n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f20436o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f20437p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f20438q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f20439r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f20440s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final CustomerDownloadView f20441t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f20442u;

    private GameInformationLayoutv2Binding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView3, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ImageView imageView4, @NonNull TextView textView6, @NonNull CustomerDownloadView customerDownloadView, @NonNull TextView textView7) {
        this.f20423b = relativeLayout;
        this.f20424c = simpleDraweeView;
        this.f20425d = imageView;
        this.f20426e = relativeLayout2;
        this.f20427f = textView;
        this.f20428g = textView2;
        this.f20429h = imageView2;
        this.f20430i = linearLayout;
        this.f20431j = imageView3;
        this.f20432k = button;
        this.f20433l = linearLayout2;
        this.f20434m = textView3;
        this.f20435n = recyclerView;
        this.f20436o = relativeLayout3;
        this.f20437p = textView4;
        this.f20438q = textView5;
        this.f20439r = imageView4;
        this.f20440s = textView6;
        this.f20441t = customerDownloadView;
        this.f20442u = textView7;
    }

    @NonNull
    public static GameInformationLayoutv2Binding bind(@NonNull View view) {
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
                                    i4 = R.id.comment;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment);
                                    if (imageView3 != null) {
                                        i4 = R.id.downloadImage;
                                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.downloadImage);
                                        if (button != null) {
                                            i4 = R.id.layout_share;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_share);
                                            if (linearLayout2 != null) {
                                                i4 = R.id.moneyText2;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText2);
                                                if (textView3 != null) {
                                                    i4 = R.id.recyclerView;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                                                    if (recyclerView != null) {
                                                        i4 = R.id.relativeLayout;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout);
                                                        if (relativeLayout2 != null) {
                                                            i4 = R.id.rightTextButn;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.rightTextButn);
                                                            if (textView4 != null) {
                                                                i4 = R.id.roundMessage;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.roundMessage);
                                                                if (textView5 != null) {
                                                                    i4 = R.id.shareImg;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.shareImg);
                                                                    if (imageView4 != null) {
                                                                        i4 = R.id.share_textview;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.share_textview);
                                                                        if (textView6 != null) {
                                                                            i4 = R.id.title_normal_download_cdv;
                                                                            CustomerDownloadView customerDownloadView = (CustomerDownloadView) ViewBindings.findChildViewById(view, R.id.title_normal_download_cdv);
                                                                            if (customerDownloadView != null) {
                                                                                i4 = R.id.titleText;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                                                                if (textView7 != null) {
                                                                                    return new GameInformationLayoutv2Binding((RelativeLayout) view, simpleDraweeView, imageView, relativeLayout, textView, textView2, imageView2, linearLayout, imageView3, button, linearLayout2, textView3, recyclerView, relativeLayout2, textView4, textView5, imageView4, textView6, customerDownloadView, textView7);
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
    public static GameInformationLayoutv2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20423b;
    }

    @NonNull
    public static GameInformationLayoutv2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_information_layoutv2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
