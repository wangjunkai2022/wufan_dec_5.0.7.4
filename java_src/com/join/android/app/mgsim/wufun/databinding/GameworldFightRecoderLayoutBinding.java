package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameworldFightRecoderLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f21262b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21263c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21264d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21265e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21266f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ListView f21267g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f21268h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f21269i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21270j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f21271k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21272l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f21273m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21274n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f21275o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f21276p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f21277q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f21278r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final Button f21279s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f21280t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final SimpleDraweeView f21281u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final FrameLayout f21282v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f21283w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final FrameLayout f21284x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final Button f21285y;

    private GameworldFightRecoderLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull ListView listView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull ProgressBar progressBar, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull Button button, @NonNull TextView textView11, @NonNull SimpleDraweeView simpleDraweeView, @NonNull FrameLayout frameLayout2, @NonNull TextView textView12, @NonNull FrameLayout frameLayout3, @NonNull Button button2) {
        this.f21262b = frameLayout;
        this.f21263c = textView;
        this.f21264d = textView2;
        this.f21265e = textView3;
        this.f21266f = linearLayout;
        this.f21267g = listView;
        this.f21268h = imageView;
        this.f21269i = linearLayout2;
        this.f21270j = textView4;
        this.f21271k = progressBar;
        this.f21272l = textView5;
        this.f21273m = imageView2;
        this.f21274n = textView6;
        this.f21275o = textView7;
        this.f21276p = textView8;
        this.f21277q = textView9;
        this.f21278r = textView10;
        this.f21279s = button;
        this.f21280t = textView11;
        this.f21281u = simpleDraweeView;
        this.f21282v = frameLayout2;
        this.f21283w = textView12;
        this.f21284x = frameLayout3;
        this.f21285y = button2;
    }

    @NonNull
    public static GameworldFightRecoderLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.changci;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.changci);
        if (textView != null) {
            i4 = R.id.failedMessage;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.failedMessage);
            if (textView2 != null) {
                i4 = R.id.jibie;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.jibie);
                if (textView3 != null) {
                    i4 = R.id.layoutMain;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutMain);
                    if (linearLayout != null) {
                        i4 = R.id.listview;
                        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listview);
                        if (listView != null) {
                            i4 = R.id.lodingBackImage;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
                            if (imageView != null) {
                                i4 = R.id.loding_faile;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_faile);
                                if (linearLayout2 != null) {
                                    i4 = R.id.pabi;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.pabi);
                                    if (textView4 != null) {
                                        i4 = R.id.progressBar;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                        if (progressBar != null) {
                                            i4 = R.id.progressBarTxt;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.progressBarTxt);
                                            if (textView5 != null) {
                                                i4 = R.id.relodingimag;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.relodingimag);
                                                if (imageView2 != null) {
                                                    i4 = R.id.saishiAllChangci;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.saishiAllChangci);
                                                    if (textView6 != null) {
                                                        i4 = R.id.saishiFailed;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.saishiFailed);
                                                        if (textView7 != null) {
                                                            i4 = R.id.saishiSenglv;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.saishiSenglv);
                                                            if (textView8 != null) {
                                                                i4 = R.id.saishiType;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.saishiType);
                                                                if (textView9 != null) {
                                                                    i4 = R.id.saishiWinnumber;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.saishiWinnumber);
                                                                    if (textView10 != null) {
                                                                        i4 = R.id.setNetwork;
                                                                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                                                                        if (button != null) {
                                                                            i4 = R.id.shenglv;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.shenglv);
                                                                            if (textView11 != null) {
                                                                                i4 = R.id.userIconImage;
                                                                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.userIconImage);
                                                                                if (simpleDraweeView != null) {
                                                                                    i4 = R.id.userIconImage_lay;
                                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.userIconImage_lay);
                                                                                    if (frameLayout != null) {
                                                                                        i4 = R.id.userName;
                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                                                                                        if (textView12 != null) {
                                                                                            i4 = R.id.userNameLay;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.userNameLay);
                                                                                            if (frameLayout2 != null) {
                                                                                                i4 = R.id.world_back;
                                                                                                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.world_back);
                                                                                                if (button2 != null) {
                                                                                                    return new GameworldFightRecoderLayoutBinding((FrameLayout) view, textView, textView2, textView3, linearLayout, listView, imageView, linearLayout2, textView4, progressBar, textView5, imageView2, textView6, textView7, textView8, textView9, textView10, button, textView11, simpleDraweeView, frameLayout, textView12, frameLayout2, button2);
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
    public static GameworldFightRecoderLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f21262b;
    }

    @NonNull
    public static GameworldFightRecoderLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameworld_fight_recoder_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
