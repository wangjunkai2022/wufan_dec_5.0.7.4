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
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public final class ClassifyMainadLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17896b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17897c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final DownloadViewStroke f17898d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f17899e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17900f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17901g;

    private ClassifyMainadLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull DownloadViewStroke downloadViewStroke, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f17896b = relativeLayout;
        this.f17897c = simpleDraweeView;
        this.f17898d = downloadViewStroke;
        this.f17899e = simpleDraweeView2;
        this.f17900f = textView;
        this.f17901g = textView2;
    }

    @NonNull
    public static ClassifyMainadLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.adImageView;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.adImageView);
        if (simpleDraweeView != null) {
            i4 = R.id.downView;
            DownloadViewStroke downloadViewStroke = (DownloadViewStroke) ViewBindings.findChildViewById(view, R.id.downView);
            if (downloadViewStroke != null) {
                i4 = R.id.gameIcon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon);
                if (simpleDraweeView2 != null) {
                    i4 = R.id.gameInfo;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameInfo);
                    if (textView != null) {
                        i4 = R.id.gameName;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                        if (textView2 != null) {
                            return new ClassifyMainadLayoutBinding((RelativeLayout) view, simpleDraweeView, downloadViewStroke, simpleDraweeView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ClassifyMainadLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17896b;
    }

    @NonNull
    public static ClassifyMainadLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.classify_mainad_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
