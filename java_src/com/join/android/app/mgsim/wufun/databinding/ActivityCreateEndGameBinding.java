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
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityCreateEndGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f15834b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f15835c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CardView f15836d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CardView f15837e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CardView f15838f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f15839g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f15840h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f15841i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f15842j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f15843k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f15844l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f15845m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f15846n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f15847o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final SimpleDraweeView f15848p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f15849q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f15850r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f15851s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f15852t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f15853u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f15854v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f15855w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f15856x;

    private ActivityCreateEndGameBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull CardView cardView, @NonNull CardView cardView2, @NonNull CardView cardView3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f15834b = linearLayout;
        this.f15835c = button;
        this.f15836d = cardView;
        this.f15837e = cardView2;
        this.f15838f = cardView3;
        this.f15839g = imageView;
        this.f15840h = imageView2;
        this.f15841i = imageView3;
        this.f15842j = imageView4;
        this.f15843k = imageView5;
        this.f15844l = imageView6;
        this.f15845m = linearLayout2;
        this.f15846n = linearLayout3;
        this.f15847o = relativeLayout;
        this.f15848p = simpleDraweeView;
        this.f15849q = textView;
        this.f15850r = textView2;
        this.f15851s = textView3;
        this.f15852t = textView4;
        this.f15853u = textView5;
        this.f15854v = textView6;
        this.f15855w = textView7;
        this.f15856x = textView8;
    }

    @NonNull
    public static ActivityCreateEndGameBinding bind(@NonNull View view) {
        int i4 = R.id.btn_next;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_next);
        if (button != null) {
            i4 = R.id.cv_boss;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cv_boss);
            if (cardView != null) {
                i4 = R.id.cv_game;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cv_game);
                if (cardView2 != null) {
                    i4 = R.id.cv_time;
                    CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.cv_time);
                    if (cardView3 != null) {
                        i4 = R.id.iv_archive_image;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_archive_image);
                        if (imageView != null) {
                            i4 = R.id.iv_arrow;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_arrow);
                            if (imageView2 != null) {
                                i4 = R.id.iv_arrow_game;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_arrow_game);
                                if (imageView3 != null) {
                                    i4 = R.id.iv_back;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                                    if (imageView4 != null) {
                                        i4 = R.id.iv_delete_slot;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_delete_slot);
                                        if (imageView5 != null) {
                                            i4 = R.id.iv_question;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_question);
                                            if (imageView6 != null) {
                                                i4 = R.id.ll_boss_info;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_boss_info);
                                                if (linearLayout != null) {
                                                    i4 = R.id.ll_choose_slot;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_choose_slot);
                                                    if (linearLayout2 != null) {
                                                        i4 = R.id.rl_slot;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_slot);
                                                        if (relativeLayout != null) {
                                                            i4 = R.id.sdv_image_game;
                                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image_game);
                                                            if (simpleDraweeView != null) {
                                                                i4 = R.id.tv_boss_sub_title;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_boss_sub_title);
                                                                if (textView != null) {
                                                                    i4 = R.id.tv_boss_title;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_boss_title);
                                                                    if (textView2 != null) {
                                                                        i4 = R.id.tv_choose_boos;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_choose_boos);
                                                                        if (textView3 != null) {
                                                                            i4 = R.id.tv_choose_game;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_choose_game);
                                                                            if (textView4 != null) {
                                                                                i4 = R.id.tv_customer;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_customer);
                                                                                if (textView5 != null) {
                                                                                    i4 = R.id.tv_time;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
                                                                                    if (textView6 != null) {
                                                                                        i4 = R.id.tv_time_label;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_label);
                                                                                        if (textView7 != null) {
                                                                                            i4 = R.id.tv_title;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                                            if (textView8 != null) {
                                                                                                return new ActivityCreateEndGameBinding((LinearLayout) view, button, cardView, cardView2, cardView3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, relativeLayout, simpleDraweeView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static ActivityCreateEndGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f15834b;
    }

    @NonNull
    public static ActivityCreateEndGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_create_end_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
