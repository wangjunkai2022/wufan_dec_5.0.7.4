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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class EmulatorListviewDownloadCenterHistoryBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19252b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19253c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19254d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19255e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19256f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f19257g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f19258h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f19259i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f19260j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19261k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f19262l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f19263m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f19264n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f19265o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f19266p;

    private EmulatorListviewDownloadCenterHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull LinearLayout linearLayout5, @NonNull TextView textView3, @NonNull ImageView imageView3, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout6) {
        this.f19252b = linearLayout;
        this.f19253c = linearLayout2;
        this.f19254d = textView;
        this.f19255e = linearLayout3;
        this.f19256f = imageView;
        this.f19257g = simpleDraweeView;
        this.f19258h = imageView2;
        this.f19259i = view;
        this.f19260j = linearLayout4;
        this.f19261k = textView2;
        this.f19262l = linearLayout5;
        this.f19263m = textView3;
        this.f19264n = imageView3;
        this.f19265o = relativeLayout;
        this.f19266p = linearLayout6;
    }

    @NonNull
    public static EmulatorListviewDownloadCenterHistoryBinding bind(@NonNull View view) {
        int i4 = R.id.addtoDesk;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.addtoDesk);
        if (linearLayout != null) {
            i4 = R.id.appInfo;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appInfo);
            if (textView != null) {
                i4 = R.id.dellGame;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.dellGame);
                if (linearLayout2 != null) {
                    i4 = R.id.giftPackageSwitch;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwitch);
                    if (imageView != null) {
                        i4 = R.id.img;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
                        if (simpleDraweeView != null) {
                            i4 = R.id.itemMoreIv;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.itemMoreIv);
                            if (imageView2 != null) {
                                i4 = R.id.line;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                                if (findChildViewById != null) {
                                    i4 = R.id.linearLayoutApp;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayoutApp);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.mgListviewItemInstall;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
                                        if (textView2 != null) {
                                            i4 = R.id.more_layout;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.more_layout);
                                            if (linearLayout4 != null) {
                                                i4 = R.id.name;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                                if (textView3 != null) {
                                                    i4 = R.id.notOpen;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.notOpen);
                                                    if (imageView3 != null) {
                                                        i4 = R.id.rLayoutRight;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                        if (relativeLayout != null) {
                                                            i4 = R.id.status;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.status);
                                                            if (linearLayout5 != null) {
                                                                return new EmulatorListviewDownloadCenterHistoryBinding((LinearLayout) view, linearLayout, textView, linearLayout2, imageView, simpleDraweeView, imageView2, findChildViewById, linearLayout3, textView2, linearLayout4, textView3, imageView3, relativeLayout, linearLayout5);
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
    public static EmulatorListviewDownloadCenterHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19252b;
    }

    @NonNull
    public static EmulatorListviewDownloadCenterHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.emulator_listview_download_center_history, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
