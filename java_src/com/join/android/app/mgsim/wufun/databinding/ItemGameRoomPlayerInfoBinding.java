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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.VipView;
/* loaded from: classes3.dex */
public final class ItemGameRoomPlayerInfoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22332b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22333c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22334d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22335e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22336f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22337g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f22338h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f22339i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f22340j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f22341k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f22342l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f22343m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f22344n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f22345o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f22346p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f22347q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f22348r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final VipView f22349s;

    private ItemGameRoomPlayerInfoBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull View view2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull VipView vipView) {
        this.f22332b = linearLayout;
        this.f22333c = view;
        this.f22334d = simpleDraweeView;
        this.f22335e = imageView;
        this.f22336f = textView;
        this.f22337g = textView2;
        this.f22338h = imageView2;
        this.f22339i = imageView3;
        this.f22340j = linearLayout2;
        this.f22341k = linearLayout3;
        this.f22342l = view2;
        this.f22343m = relativeLayout;
        this.f22344n = textView3;
        this.f22345o = textView4;
        this.f22346p = textView5;
        this.f22347q = textView6;
        this.f22348r = textView7;
        this.f22349s = vipView;
    }

    @NonNull
    public static ItemGameRoomPlayerInfoBinding bind(@NonNull View view) {
        int i4 = R.id.borderView;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.borderView);
        if (findChildViewById != null) {
            i4 = R.id.iv_bg;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_bg);
            if (simpleDraweeView != null) {
                i4 = R.id.iv_haveReady;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_haveReady);
                if (imageView != null) {
                    i4 = R.id.iv_out_device;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.iv_out_device);
                    if (textView != null) {
                        i4 = R.id.iv_pc_device;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.iv_pc_device);
                        if (textView2 != null) {
                            i4 = R.id.ivProficiencyLevel;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivProficiencyLevel);
                            if (imageView2 != null) {
                                i4 = R.id.iv_state;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_state);
                                if (imageView3 != null) {
                                    i4 = R.id.ll_out_device;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_out_device);
                                    if (linearLayout != null) {
                                        i4 = R.id.ll_state;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_state);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.mDefaultBg;
                                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.mDefaultBg);
                                            if (findChildViewById2 != null) {
                                                i4 = R.id.rl_top;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_top);
                                                if (relativeLayout != null) {
                                                    i4 = R.id.tv_delay_time;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_delay_time);
                                                    if (textView3 != null) {
                                                        i4 = R.id.tv_name;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                                                        if (textView4 != null) {
                                                            i4 = R.id.tv_nick_name;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nick_name);
                                                            if (textView5 != null) {
                                                                i4 = R.id.tv_p;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_p);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.tv_state;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_state);
                                                                    if (textView7 != null) {
                                                                        i4 = R.id.vipView;
                                                                        VipView vipView = (VipView) ViewBindings.findChildViewById(view, R.id.vipView);
                                                                        if (vipView != null) {
                                                                            return new ItemGameRoomPlayerInfoBinding((LinearLayout) view, findChildViewById, simpleDraweeView, imageView, textView, textView2, imageView2, imageView3, linearLayout, linearLayout2, findChildViewById2, relativeLayout, textView3, textView4, textView5, textView6, textView7, vipView);
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
    public static ItemGameRoomPlayerInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22332b;
    }

    @NonNull
    public static ItemGameRoomPlayerInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_room_player_info, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
