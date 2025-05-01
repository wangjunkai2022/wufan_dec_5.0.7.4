package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
public final class ActivityOnlineGameInstallCheckBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16685b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16686c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f16687d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f16688e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f16689f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f16690g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f16691h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16692i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16693j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f16694k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16695l;

    private ActivityOnlineGameInstallCheckBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull View view2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f16685b = relativeLayout;
        this.f16686c = imageView;
        this.f16687d = view;
        this.f16688e = view2;
        this.f16689f = simpleDraweeView;
        this.f16690g = progressBar;
        this.f16691h = recyclerView;
        this.f16692i = textView;
        this.f16693j = textView2;
        this.f16694k = textView3;
        this.f16695l = textView4;
    }

    @NonNull
    public static ActivityOnlineGameInstallCheckBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.divider;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
            if (findChildViewById != null) {
                i4 = R.id.header;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.header);
                if (findChildViewById2 != null) {
                    i4 = R.id.ivGameIcon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivGameIcon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progress);
                        if (progressBar != null) {
                            i4 = R.id.rvCheck;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvCheck);
                            if (recyclerView != null) {
                                i4 = R.id.tvBtnInstall;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBtnInstall);
                                if (textView != null) {
                                    i4 = R.id.tvGameName;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                                    if (textView2 != null) {
                                        i4 = R.id.tvInstallCount;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInstallCount);
                                        if (textView3 != null) {
                                            i4 = R.id.tvPassNotice;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPassNotice);
                                            if (textView4 != null) {
                                                return new ActivityOnlineGameInstallCheckBinding((RelativeLayout) view, imageView, findChildViewById, findChildViewById2, simpleDraweeView, progressBar, recyclerView, textView, textView2, textView3, textView4);
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
    public static ActivityOnlineGameInstallCheckBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16685b;
    }

    @NonNull
    public static ActivityOnlineGameInstallCheckBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_online_game_install_check, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
