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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityGameTransferBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16422b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16423c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16424d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f16425e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16426f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16427g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f16428h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f16429i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16430j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f16431k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16432l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f16433m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f16434n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RecyclerView f16435o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final Button f16436p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f16437q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f16438r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f16439s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final RelativeLayout f16440t;

    private ActivityGameTransferBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView3, @NonNull RecyclerView recyclerView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ImageView imageView3, @NonNull RecyclerView recyclerView2, @NonNull Button button, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull RelativeLayout relativeLayout4) {
        this.f16422b = relativeLayout;
        this.f16423c = imageView;
        this.f16424d = imageView2;
        this.f16425e = linearLayout;
        this.f16426f = textView;
        this.f16427g = textView2;
        this.f16428h = relativeLayout2;
        this.f16429i = relativeLayout3;
        this.f16430j = textView3;
        this.f16431k = recyclerView;
        this.f16432l = textView4;
        this.f16433m = textView5;
        this.f16434n = imageView3;
        this.f16435o = recyclerView2;
        this.f16436p = button;
        this.f16437q = textView6;
        this.f16438r = textView7;
        this.f16439s = textView8;
        this.f16440t = relativeLayout4;
    }

    @NonNull
    public static ActivityGameTransferBinding bind(@NonNull View view) {
        int i4 = R.id.game_transfer_back_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.game_transfer_back_img);
        if (imageView != null) {
            i4 = R.id.game_transfer_bar_img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.game_transfer_bar_img);
            if (imageView2 != null) {
                i4 = R.id.game_transfer_bottom_navigation_bar_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.game_transfer_bottom_navigation_bar_ll);
                if (linearLayout != null) {
                    i4 = R.id.game_transfer_bottom_navigation_left_txt;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_bottom_navigation_left_txt);
                    if (textView != null) {
                        i4 = R.id.game_transfer_bottom_navigation_right_txt;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_bottom_navigation_right_txt);
                        if (textView2 != null) {
                            i4 = R.id.game_transfer_bottom_rl;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.game_transfer_bottom_rl);
                            if (relativeLayout != null) {
                                i4 = R.id.game_transfer_history_hint_rl;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.game_transfer_history_hint_rl);
                                if (relativeLayout2 != null) {
                                    i4 = R.id.game_transfer_history_list_hint_txt;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_history_list_hint_txt);
                                    if (textView3 != null) {
                                        i4 = R.id.game_transfer_historyList_rv;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.game_transfer_historyList_rv);
                                        if (recyclerView != null) {
                                            i4 = R.id.game_transfer_left_phone_txt;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_left_phone_txt);
                                            if (textView4 != null) {
                                                i4 = R.id.game_transfer_list_choose_all_txt;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_list_choose_all_txt);
                                                if (textView5 != null) {
                                                    i4 = R.id.game_transfer_list_hint_close_img;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.game_transfer_list_hint_close_img);
                                                    if (imageView3 != null) {
                                                        i4 = R.id.game_transfer_list_rv;
                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.game_transfer_list_rv);
                                                        if (recyclerView2 != null) {
                                                            i4 = R.id.game_transfer_ok_btn;
                                                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.game_transfer_ok_btn);
                                                            if (button != null) {
                                                                i4 = R.id.game_transfer_right_phone_txt;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_right_phone_txt);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.game_transfer_selected_num_txt;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_selected_num_txt);
                                                                    if (textView7 != null) {
                                                                        i4 = R.id.game_transfer_title_txt;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.game_transfer_title_txt);
                                                                        if (textView8 != null) {
                                                                            i4 = R.id.game_transfer_top_rl;
                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.game_transfer_top_rl);
                                                                            if (relativeLayout3 != null) {
                                                                                return new ActivityGameTransferBinding((RelativeLayout) view, imageView, imageView2, linearLayout, textView, textView2, relativeLayout, relativeLayout2, textView3, recyclerView, textView4, textView5, imageView3, recyclerView2, button, textView6, textView7, textView8, relativeLayout3);
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
    public static ActivityGameTransferBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16422b;
    }

    @NonNull
    public static ActivityGameTransferBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_transfer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
