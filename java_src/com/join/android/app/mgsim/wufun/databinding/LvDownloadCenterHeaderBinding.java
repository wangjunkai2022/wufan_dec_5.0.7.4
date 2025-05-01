package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LvDownloadCenterHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23630b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23631c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23632d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23633e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23634f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23635g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23636h;

    private LvDownloadCenterHeaderBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23630b = relativeLayout;
        this.f23631c = linearLayout;
        this.f23632d = textView;
        this.f23633e = linearLayout2;
        this.f23634f = textView2;
        this.f23635g = textView3;
        this.f23636h = textView4;
    }

    @NonNull
    public static LvDownloadCenterHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.doSomething;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.doSomething);
        if (linearLayout != null) {
            i4 = R.id.downloadTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.downloadTitle);
            if (textView != null) {
                i4 = R.id.layout_main;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_main);
                if (linearLayout2 != null) {
                    i4 = R.id.textView;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                    if (textView2 != null) {
                        i4 = R.id.tvDoSomething;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDoSomething);
                        if (textView3 != null) {
                            i4 = R.id.tvNum;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNum);
                            if (textView4 != null) {
                                return new LvDownloadCenterHeaderBinding((RelativeLayout) view, linearLayout, textView, linearLayout2, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LvDownloadCenterHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23630b;
    }

    @NonNull
    public static LvDownloadCenterHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.lv_download_center_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
