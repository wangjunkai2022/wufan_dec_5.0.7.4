package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.DownloadViewBig;
/* loaded from: classes3.dex */
public final class NowWufunFindBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25575b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25576c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25577d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final DownloadViewBig f25578e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f25579f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25580g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25581h;

    private NowWufunFindBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull DownloadViewBig downloadViewBig, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3) {
        this.f25575b = linearLayout;
        this.f25576c = textView;
        this.f25577d = textView2;
        this.f25578e = downloadViewBig;
        this.f25579f = simpleDraweeView;
        this.f25580g = linearLayout2;
        this.f25581h = textView3;
    }

    @NonNull
    public static NowWufunFindBinding bind(@NonNull View view) {
        int i4 = R.id.appDescribe;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appDescribe);
        if (textView != null) {
            i4 = R.id.appName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
            if (textView2 != null) {
                i4 = R.id.downloadView;
                DownloadViewBig downloadViewBig = (DownloadViewBig) ViewBindings.findChildViewById(view, R.id.downloadView);
                if (downloadViewBig != null) {
                    i4 = R.id.image;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image);
                    if (simpleDraweeView != null) {
                        i4 = R.id.main;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                        if (linearLayout != null) {
                            i4 = R.id.titleText;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                            if (textView3 != null) {
                                return new NowWufunFindBinding((LinearLayout) view, textView, textView2, downloadViewBig, simpleDraweeView, linearLayout, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NowWufunFindBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25575b;
    }

    @NonNull
    public static NowWufunFindBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.now_wufun_find, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
