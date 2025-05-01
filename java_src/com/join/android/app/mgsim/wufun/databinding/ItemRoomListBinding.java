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
import com.join.mgps.customview.CountDownerTextView;
/* loaded from: classes3.dex */
public final class ItemRoomListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22634b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22635c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22636d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22637e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22638f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f22639g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f22640h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f22641i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f22642j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f22643k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f22644l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f22645m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f22646n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f22647o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f22648p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f22649q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f22650r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final CountDownerTextView f22651s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f22652t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f22653u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f22654v;

    private ItemRoomListBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull CountDownerTextView countDownerTextView, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f22634b = relativeLayout;
        this.f22635c = simpleDraweeView;
        this.f22636d = imageView;
        this.f22637e = imageView2;
        this.f22638f = imageView3;
        this.f22639g = view;
        this.f22640h = linearLayout;
        this.f22641i = linearLayout2;
        this.f22642j = relativeLayout2;
        this.f22643k = linearLayout3;
        this.f22644l = linearLayout4;
        this.f22645m = relativeLayout3;
        this.f22646n = textView;
        this.f22647o = textView2;
        this.f22648p = textView3;
        this.f22649q = textView4;
        this.f22650r = textView5;
        this.f22651s = countDownerTextView;
        this.f22652t = textView6;
        this.f22653u = textView7;
        this.f22654v = textView8;
    }

    @NonNull
    public static ItemRoomListBinding bind(@NonNull View view) {
        int i4 = R.id.avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.avatar);
        if (simpleDraweeView != null) {
            i4 = R.id.iv_lock;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_lock);
            if (imageView != null) {
                i4 = R.id.iv_time;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_time);
                if (imageView2 != null) {
                    i4 = R.id.iv_vip;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_vip);
                    if (imageView3 != null) {
                        i4 = R.id.line_1;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_1);
                        if (findChildViewById != null) {
                            i4 = R.id.ll_challenge_gold;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_challenge_gold);
                            if (linearLayout != null) {
                                i4 = R.id.ll_id;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_id);
                                if (linearLayout2 != null) {
                                    i4 = R.id.ll_room;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_room);
                                    if (relativeLayout != null) {
                                        i4 = R.id.ll_time;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_time);
                                        if (linearLayout3 != null) {
                                            i4 = R.id.ll_view;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_view);
                                            if (linearLayout4 != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                i4 = R.id.tv_challenge;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_challenge);
                                                if (textView != null) {
                                                    i4 = R.id.tv_chenghao;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chenghao);
                                                    if (textView2 != null) {
                                                        i4 = R.id.tv_forbidden;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_forbidden);
                                                        if (textView3 != null) {
                                                            i4 = R.id.tv_game_count;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_game_count);
                                                            if (textView4 != null) {
                                                                i4 = R.id.tv_gameName;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gameName);
                                                                if (textView5 != null) {
                                                                    i4 = R.id.tv_game_state;
                                                                    CountDownerTextView countDownerTextView = (CountDownerTextView) ViewBindings.findChildViewById(view, R.id.tv_game_state);
                                                                    if (countDownerTextView != null) {
                                                                        i4 = R.id.tv_id;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_id);
                                                                        if (textView6 != null) {
                                                                            i4 = R.id.tv_name;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                                                                            if (textView7 != null) {
                                                                                i4 = R.id.tv_view;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_view);
                                                                                if (textView8 != null) {
                                                                                    return new ItemRoomListBinding(relativeLayout2, simpleDraweeView, imageView, imageView2, imageView3, findChildViewById, linearLayout, linearLayout2, relativeLayout, linearLayout3, linearLayout4, relativeLayout2, textView, textView2, textView3, textView4, textView5, countDownerTextView, textView6, textView7, textView8);
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
    public static ItemRoomListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22634b;
    }

    @NonNull
    public static ItemRoomListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_room_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
