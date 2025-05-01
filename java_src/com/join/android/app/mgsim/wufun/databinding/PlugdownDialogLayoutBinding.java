package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PlugdownDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25947b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25948c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25949d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25950e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25951f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25952g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25953h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ProgressBar f25954i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f25955j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25956k;

    private PlugdownDialogLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull TextView textView6) {
        this.f25947b = relativeLayout;
        this.f25948c = textView;
        this.f25949d = textView2;
        this.f25950e = textView3;
        this.f25951f = linearLayout;
        this.f25952g = textView4;
        this.f25953h = textView5;
        this.f25954i = progressBar;
        this.f25955j = progressBar2;
        this.f25956k = textView6;
    }

    @NonNull
    public static PlugdownDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.cancle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.cancle);
            if (textView2 != null) {
                i4 = R.id.info;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.info);
                if (textView3 != null) {
                    i4 = R.id.linearLayout2;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                    if (linearLayout != null) {
                        i4 = R.id.lodingInfo;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.lodingInfo);
                        if (textView4 != null) {
                            i4 = R.id.ok;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                            if (textView5 != null) {
                                i4 = R.id.progressBar;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                if (progressBar != null) {
                                    i4 = R.id.progressBarZip;
                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                    if (progressBar2 != null) {
                                        i4 = R.id.title;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                        if (textView6 != null) {
                                            return new PlugdownDialogLayoutBinding((RelativeLayout) view, textView, textView2, textView3, linearLayout, textView4, textView5, progressBar, progressBar2, textView6);
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
    public static PlugdownDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25947b;
    }

    @NonNull
    public static PlugdownDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.plugdown_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
