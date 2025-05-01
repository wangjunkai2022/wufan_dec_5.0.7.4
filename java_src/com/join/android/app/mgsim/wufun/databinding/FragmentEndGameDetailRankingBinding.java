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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentEndGameDetailRankingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19739b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f19740c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19741d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19742e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f19743f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f19744g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19745h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19746i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19747j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19748k;

    private FragmentEndGameDetailRankingBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f19739b = linearLayout;
        this.f19740c = simpleDraweeView;
        this.f19741d = imageView;
        this.f19742e = imageView2;
        this.f19743f = relativeLayout;
        this.f19744g = recyclerView;
        this.f19745h = textView;
        this.f19746i = textView2;
        this.f19747j = textView3;
        this.f19748k = textView4;
    }

    @NonNull
    public static FragmentEndGameDetailRankingBinding bind(@NonNull View view) {
        int i4 = R.id.ivAvatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAvatar);
        if (simpleDraweeView != null) {
            i4 = R.id.ivPlayVideo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivPlayVideo);
            if (imageView != null) {
                i4 = R.id.ivRankChange;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivRankChange);
                if (imageView2 != null) {
                    i4 = R.id.rankRoot;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rankRoot);
                    if (relativeLayout != null) {
                        i4 = R.id.rvRank;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvRank);
                        if (recyclerView != null) {
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
                                            return new FragmentEndGameDetailRankingBinding((LinearLayout) view, simpleDraweeView, imageView, imageView2, relativeLayout, recyclerView, textView, textView2, textView3, textView4);
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
    public static FragmentEndGameDetailRankingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19739b;
    }

    @NonNull
    public static FragmentEndGameDetailRankingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_end_game_detail_ranking, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
