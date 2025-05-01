package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentMyGameItemGameV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f19937b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19938c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f19939d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19940e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f19941f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f19942g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f19943h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19944i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f19945j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f19946k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f19947l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final View f19948m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f19949n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f19950o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ProgressBar f19951p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f19952q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f19953r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f19954s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final View f19955t;

    private FragmentMyGameItemGameV1Binding(@NonNull CardView cardView, @NonNull TextView textView, @NonNull View view, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull View view2, @NonNull LinearLayout linearLayout, @NonNull View view3, @NonNull TextView textView3, @NonNull ImageView imageView4, @NonNull ProgressBar progressBar, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view4) {
        this.f19937b = cardView;
        this.f19938c = textView;
        this.f19939d = view;
        this.f19940e = imageView;
        this.f19941f = simpleDraweeView;
        this.f19942g = simpleDraweeView2;
        this.f19943h = imageView2;
        this.f19944i = textView2;
        this.f19945j = imageView3;
        this.f19946k = view2;
        this.f19947l = linearLayout;
        this.f19948m = view3;
        this.f19949n = textView3;
        this.f19950o = imageView4;
        this.f19951p = progressBar;
        this.f19952q = textView4;
        this.f19953r = textView5;
        this.f19954s = textView6;
        this.f19955t = view4;
    }

    @NonNull
    public static FragmentMyGameItemGameV1Binding bind(@NonNull View view) {
        int i4 = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
        if (textView != null) {
            i4 = R.id.focus;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.focus);
            if (findChildViewById != null) {
                i4 = R.id.icCloseAd;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.icCloseAd);
                if (imageView != null) {
                    i4 = R.id.icCornerAd;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icCornerAd);
                    if (simpleDraweeView != null) {
                        i4 = R.id.icon;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.imageView61;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView61);
                            if (imageView2 != null) {
                                i4 = R.id.install;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.install);
                                if (textView2 != null) {
                                    i4 = R.id.iv_gift_more;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gift_more);
                                    if (imageView3 != null) {
                                        i4 = R.id.line;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line);
                                        if (findChildViewById2 != null) {
                                            i4 = R.id.ll_gift;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_gift);
                                            if (linearLayout != null) {
                                                i4 = R.id.more;
                                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.more);
                                                if (findChildViewById3 != null) {
                                                    i4 = R.id.name;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                                    if (textView3 != null) {
                                                        i4 = R.id.notOpen;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.notOpen);
                                                        if (imageView4 != null) {
                                                            i4 = R.id.progressBar;
                                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                            if (progressBar != null) {
                                                                i4 = R.id.speedUp;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.speedUp);
                                                                if (textView4 != null) {
                                                                    i4 = R.id.tv_down_speed;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_down_speed);
                                                                    if (textView5 != null) {
                                                                        i4 = R.id.tv_gift_desc;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gift_desc);
                                                                        if (textView6 != null) {
                                                                            i4 = R.id.v_bottom;
                                                                            View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.v_bottom);
                                                                            if (findChildViewById4 != null) {
                                                                                return new FragmentMyGameItemGameV1Binding((CardView) view, textView, findChildViewById, imageView, simpleDraweeView, simpleDraweeView2, imageView2, textView2, imageView3, findChildViewById2, linearLayout, findChildViewById3, textView3, imageView4, progressBar, textView4, textView5, textView6, findChildViewById4);
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
    public static FragmentMyGameItemGameV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f19937b;
    }

    @NonNull
    public static FragmentMyGameItemGameV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_item_game_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
