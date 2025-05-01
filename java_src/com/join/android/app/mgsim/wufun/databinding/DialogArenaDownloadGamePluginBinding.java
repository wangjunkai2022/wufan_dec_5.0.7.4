package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
/* loaded from: classes3.dex */
public final class DialogArenaDownloadGamePluginBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18560b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18561c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18562d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f18563e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f18564f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f18565g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f18566h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f18567i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f18568j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f18569k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f18570l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f18571m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f18572n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f18573o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f18574p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f18575q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final Button f18576r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f18577s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f18578t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f18579u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f18580v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f18581w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f18582x;

    private DialogArenaDownloadGamePluginBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout6, @NonNull TextView textView2, @NonNull ProgressBar progressBar2, @NonNull ImageView imageView2, @NonNull Button button2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f18560b = relativeLayout;
        this.f18561c = button;
        this.f18562d = textView;
        this.f18563e = progressBar;
        this.f18564f = linearLayout;
        this.f18565g = simpleDraweeView;
        this.f18566h = simpleDraweeView2;
        this.f18567i = linearLayout2;
        this.f18568j = linearLayout3;
        this.f18569k = linearLayout4;
        this.f18570l = linearLayout5;
        this.f18571m = imageView;
        this.f18572n = linearLayout6;
        this.f18573o = textView2;
        this.f18574p = progressBar2;
        this.f18575q = imageView2;
        this.f18576r = button2;
        this.f18577s = textView3;
        this.f18578t = textView4;
        this.f18579u = textView5;
        this.f18580v = textView6;
        this.f18581w = textView7;
        this.f18582x = textView8;
    }

    @NonNull
    public static DialogArenaDownloadGamePluginBinding bind(@NonNull View view) {
        int i4 = R.id.btnGoGame;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnGoGame);
        if (button != null) {
            i4 = R.id.failedMessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.failedMessage);
            if (textView != null) {
                i4 = R.id.gameProgressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.gameProgressBar);
                if (progressBar != null) {
                    i4 = R.id.iv_close;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
                    if (linearLayout != null) {
                        i4 = R.id.iv_game_icon;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_game_icon);
                        if (simpleDraweeView != null) {
                            i4 = R.id.iv_plugin_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_plugin_icon);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.ll_content;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content);
                                if (linearLayout2 != null) {
                                    i4 = R.id.ll_game;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_game);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.ll_plugin;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_plugin);
                                        if (linearLayout4 != null) {
                                            i4 = R.id.loading_lay;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loading_lay);
                                            if (linearLayout5 != null) {
                                                i4 = R.id.lodingBackImage;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
                                                if (imageView != null) {
                                                    i4 = R.id.loding_faile;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_faile);
                                                    if (linearLayout6 != null) {
                                                        i4 = R.id.moneyText;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                        if (textView2 != null) {
                                                            i4 = R.id.plugProgressBar;
                                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.plugProgressBar);
                                                            if (progressBar2 != null) {
                                                                i4 = R.id.relodingimag;
                                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.relodingimag);
                                                                if (imageView2 != null) {
                                                                    i4 = R.id.setNetwork;
                                                                    Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                                                                    if (button2 != null) {
                                                                        i4 = R.id.tv_game_name;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_game_name);
                                                                        if (textView3 != null) {
                                                                            i4 = R.id.tv_game_size;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_game_size);
                                                                            if (textView4 != null) {
                                                                                i4 = R.id.tv_info;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_info);
                                                                                if (textView5 != null) {
                                                                                    i4 = R.id.tv_plugin_name;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_plugin_name);
                                                                                    if (textView6 != null) {
                                                                                        i4 = R.id.tv_plugin_size;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_plugin_size);
                                                                                        if (textView7 != null) {
                                                                                            i4 = R.id.tv_title;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                                            if (textView8 != null) {
                                                                                                return new DialogArenaDownloadGamePluginBinding((RelativeLayout) view, button, textView, progressBar, linearLayout, simpleDraweeView, simpleDraweeView2, linearLayout2, linearLayout3, linearLayout4, linearLayout5, imageView, linearLayout6, textView2, progressBar2, imageView2, button2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static DialogArenaDownloadGamePluginBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18560b;
    }

    @NonNull
    public static DialogArenaDownloadGamePluginBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_arena_download_game_plugin, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
