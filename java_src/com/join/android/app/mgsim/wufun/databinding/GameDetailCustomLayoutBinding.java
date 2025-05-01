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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameDetailCustomLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f20235b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f20236c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20237d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f20238e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f20239f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f20240g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20241h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f20242i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final DetialSearchLayoutBinding f20243j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f20244k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f20245l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f20246m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f20247n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f20248o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f20249p;

    private GameDetailCustomLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull DetialSearchLayoutBinding detialSearchLayoutBinding, @NonNull Button button, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout6, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding) {
        this.f20235b = relativeLayout;
        this.f20236c = progressBar;
        this.f20237d = imageView;
        this.f20238e = relativeLayout2;
        this.f20239f = relativeLayout3;
        this.f20240g = relativeLayout4;
        this.f20241h = textView;
        this.f20242i = recyclerView;
        this.f20243j = detialSearchLayoutBinding;
        this.f20244k = button;
        this.f20245l = relativeLayout5;
        this.f20246m = textView2;
        this.f20247n = linearLayout;
        this.f20248o = relativeLayout6;
        this.f20249p = topbarLeftTitleLayoutBinding;
    }

    @NonNull
    public static GameDetailCustomLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.butnProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.butnProgressBar);
        if (progressBar != null) {
            i4 = R.id.butn_showdownload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.butn_showdownload);
            if (imageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.detialDownBottom;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.detialDownBottom);
                if (relativeLayout2 != null) {
                    i4 = R.id.downloadRLayout;
                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.downloadRLayout);
                    if (relativeLayout3 != null) {
                        i4 = R.id.gameDescribeInit;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameDescribeInit);
                        if (textView != null) {
                            i4 = R.id.gameListView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.gameListView);
                            if (recyclerView != null) {
                                i4 = R.id.include2;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.include2);
                                if (findChildViewById != null) {
                                    DetialSearchLayoutBinding bind = DetialSearchLayoutBinding.bind(findChildViewById);
                                    i4 = R.id.instalButtomButn;
                                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.instalButtomButn);
                                    if (button != null) {
                                        i4 = R.id.instalbutnLayout;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.instalbutnLayout);
                                        if (relativeLayout4 != null) {
                                            i4 = R.id.percent;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                                            if (textView2 != null) {
                                                i4 = R.id.progress_layout;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.progress_layout);
                                                if (linearLayout != null) {
                                                    i4 = R.id.progressbarLayout;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.progressbarLayout);
                                                    if (relativeLayout5 != null) {
                                                        i4 = R.id.top_banner;
                                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.top_banner);
                                                        if (findChildViewById2 != null) {
                                                            return new GameDetailCustomLayoutBinding(relativeLayout, progressBar, imageView, relativeLayout, relativeLayout2, relativeLayout3, textView, recyclerView, bind, button, relativeLayout4, textView2, linearLayout, relativeLayout5, TopbarLeftTitleLayoutBinding.bind(findChildViewById2));
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
    public static GameDetailCustomLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f20235b;
    }

    @NonNull
    public static GameDetailCustomLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_detail_custom_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
