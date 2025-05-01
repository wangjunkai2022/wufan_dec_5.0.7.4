package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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
/* loaded from: classes3.dex */
public final class ItemPaiweiViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22501b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22502c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f22503d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22504e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22505f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22506g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f22507h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f22508i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22509j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageButton f22510k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f22511l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22512m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f22513n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f22514o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f22515p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f22516q;

    private ItemPaiweiViewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull ImageButton imageButton, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4) {
        this.f22501b = linearLayout;
        this.f22502c = imageView;
        this.f22503d = simpleDraweeView;
        this.f22504e = textView;
        this.f22505f = imageView2;
        this.f22506g = textView2;
        this.f22507h = relativeLayout;
        this.f22508i = imageView3;
        this.f22509j = textView3;
        this.f22510k = imageButton;
        this.f22511l = relativeLayout2;
        this.f22512m = textView4;
        this.f22513n = textView5;
        this.f22514o = textView6;
        this.f22515p = relativeLayout3;
        this.f22516q = relativeLayout4;
    }

    @NonNull
    public static ItemPaiweiViewBinding bind(@NonNull View view) {
        int i4 = R.id.item_hander_bg_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_hander_bg_iv);
        if (imageView != null) {
            i4 = R.id.item_hander_iv;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.item_hander_iv);
            if (simpleDraweeView != null) {
                i4 = R.id.item_rank_bf_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_rank_bf_tv);
                if (textView != null) {
                    i4 = R.id.item_rank_bg_iv;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_rank_bg_iv);
                    if (imageView2 != null) {
                        i4 = R.id.item_rank_cion_tv;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_rank_cion_tv);
                        if (textView2 != null) {
                            i4 = R.id.item_rank_header_rl;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.item_rank_header_rl);
                            if (relativeLayout != null) {
                                i4 = R.id.item_rank_iv;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_rank_iv);
                                if (imageView3 != null) {
                                    i4 = R.id.item_rank_name_tv;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.item_rank_name_tv);
                                    if (textView3 != null) {
                                        i4 = R.id.item_rank_play_ib;
                                        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.item_rank_play_ib);
                                        if (imageButton != null) {
                                            i4 = R.id.item_rank_rl;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.item_rank_rl);
                                            if (relativeLayout2 != null) {
                                                i4 = R.id.item_rank_role_tv;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.item_rank_role_tv);
                                                if (textView4 != null) {
                                                    i4 = R.id.item_rank_time_tv;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.item_rank_time_tv);
                                                    if (textView5 != null) {
                                                        i4 = R.id.item_rank_tv;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.item_rank_tv);
                                                        if (textView6 != null) {
                                                            i4 = R.id.item_root_rl;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.item_root_rl);
                                                            if (relativeLayout3 != null) {
                                                                i4 = R.id.relativeLayout2;
                                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout2);
                                                                if (relativeLayout4 != null) {
                                                                    return new ItemPaiweiViewBinding((LinearLayout) view, imageView, simpleDraweeView, textView, imageView2, textView2, relativeLayout, imageView3, textView3, imageButton, relativeLayout2, textView4, textView5, textView6, relativeLayout3, relativeLayout4);
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
    public static ItemPaiweiViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22501b;
    }

    @NonNull
    public static ItemPaiweiViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_paiwei_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
