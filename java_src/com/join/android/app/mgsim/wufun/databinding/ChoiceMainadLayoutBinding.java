package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.DownloadNormalView;
/* loaded from: classes3.dex */
public final class ChoiceMainadLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17823b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17824c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final DownloadNormalView f17825d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17826e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17827f;

    private ChoiceMainadLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull DownloadNormalView downloadNormalView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f17823b = relativeLayout;
        this.f17824c = simpleDraweeView;
        this.f17825d = downloadNormalView;
        this.f17826e = textView;
        this.f17827f = textView2;
    }

    @NonNull
    public static ChoiceMainadLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.adImageView;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.adImageView);
        if (simpleDraweeView != null) {
            i4 = R.id.downloadView;
            DownloadNormalView downloadNormalView = (DownloadNormalView) ViewBindings.findChildViewById(view, R.id.downloadView);
            if (downloadNormalView != null) {
                i4 = R.id.gameInfo;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameInfo);
                if (textView != null) {
                    i4 = R.id.gameName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                    if (textView2 != null) {
                        return new ChoiceMainadLayoutBinding((RelativeLayout) view, simpleDraweeView, downloadNormalView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChoiceMainadLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17823b;
    }

    @NonNull
    public static ChoiceMainadLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.choice_mainad_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
