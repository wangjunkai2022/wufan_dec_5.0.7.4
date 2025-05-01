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
import com.join.mgps.customview.DownloadViewNormal;
/* loaded from: classes3.dex */
public final class NowWufunBroadcastBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25563b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25564c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f25565d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25566e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25567f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final DownloadViewNormal f25568g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f25569h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25570i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25571j;

    private NowWufunBroadcastBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull DownloadViewNormal downloadViewNormal, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3) {
        this.f25563b = linearLayout;
        this.f25564c = textView;
        this.f25565d = simpleDraweeView;
        this.f25566e = textView2;
        this.f25567f = linearLayout2;
        this.f25568g = downloadViewNormal;
        this.f25569h = simpleDraweeView2;
        this.f25570i = linearLayout3;
        this.f25571j = textView3;
    }

    @NonNull
    public static NowWufunBroadcastBinding bind(@NonNull View view) {
        int i4 = R.id.appDescribe;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appDescribe);
        if (textView != null) {
            i4 = R.id.appIcon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
            if (simpleDraweeView != null) {
                i4 = R.id.appName;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
                if (textView2 != null) {
                    i4 = R.id.downLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downLayout);
                    if (linearLayout != null) {
                        i4 = R.id.downloadView;
                        DownloadViewNormal downloadViewNormal = (DownloadViewNormal) ViewBindings.findChildViewById(view, R.id.downloadView);
                        if (downloadViewNormal != null) {
                            i4 = R.id.image;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.main;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                                if (linearLayout2 != null) {
                                    i4 = R.id.titleText;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                    if (textView3 != null) {
                                        return new NowWufunBroadcastBinding((LinearLayout) view, textView, simpleDraweeView, textView2, linearLayout, downloadViewNormal, simpleDraweeView2, linearLayout2, textView3);
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
    public static NowWufunBroadcastBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25563b;
    }

    @NonNull
    public static NowWufunBroadcastBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.now_wufun_broadcast, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
