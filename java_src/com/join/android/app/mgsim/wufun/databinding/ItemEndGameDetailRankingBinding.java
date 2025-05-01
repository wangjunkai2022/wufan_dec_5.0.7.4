package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemEndGameDetailRankingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f22027b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22028c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22029d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f22030e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f22031f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22032g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22033h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22034i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22035j;

    private ItemEndGameDetailRankingBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f22027b = relativeLayout;
        this.f22028c = simpleDraweeView;
        this.f22029d = imageView;
        this.f22030e = imageView2;
        this.f22031f = relativeLayout2;
        this.f22032g = textView;
        this.f22033h = textView2;
        this.f22034i = textView3;
        this.f22035j = textView4;
    }

    @NonNull
    public static ItemEndGameDetailRankingBinding bind(@NonNull View view) {
        int i4 = R.id.ivAvatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAvatar);
        if (simpleDraweeView != null) {
            i4 = R.id.ivPlayVideo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivPlayVideo);
            if (imageView != null) {
                i4 = R.id.ivRankChange;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivRankChange);
                if (imageView2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i4 = R.id.tvRank;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvRank);
                    if (textView != null) {
                        i4 = R.id.tvRankChange;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRankChange);
                        if (textView2 != null) {
                            i4 = R.id.tvScoreTime;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScoreTime);
                            if (textView3 != null) {
                                i4 = R.id.tvUsername;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUsername);
                                if (textView4 != null) {
                                    return new ItemEndGameDetailRankingBinding(relativeLayout, simpleDraweeView, imageView, imageView2, relativeLayout, textView, textView2, textView3, textView4);
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
    public static ItemEndGameDetailRankingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f22027b;
    }

    @NonNull
    public static ItemEndGameDetailRankingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_end_game_detail_ranking, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
