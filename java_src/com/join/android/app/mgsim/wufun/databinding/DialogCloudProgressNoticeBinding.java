package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogCloudProgressNoticeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18637b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18638c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18639d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18640e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18641f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f18642g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18643h;

    private DialogCloudProgressNoticeBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ProgressBar progressBar, @NonNull TextView textView5) {
        this.f18637b = linearLayout;
        this.f18638c = textView;
        this.f18639d = textView2;
        this.f18640e = textView3;
        this.f18641f = textView4;
        this.f18642g = progressBar;
        this.f18643h = textView5;
    }

    @NonNull
    public static DialogCloudProgressNoticeBinding bind(@NonNull View view) {
        int i4 = R.id.cancle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancle);
        if (textView != null) {
            i4 = R.id.downSpeed;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.downSpeed);
            if (textView2 != null) {
                i4 = R.id.downsize;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.downsize);
                if (textView3 != null) {
                    i4 = R.id.ok;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                    if (textView4 != null) {
                        i4 = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progress);
                        if (progressBar != null) {
                            i4 = R.id.title;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                            if (textView5 != null) {
                                return new DialogCloudProgressNoticeBinding((LinearLayout) view, textView, textView2, textView3, textView4, progressBar, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogCloudProgressNoticeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18637b;
    }

    @NonNull
    public static DialogCloudProgressNoticeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_cloud_progress_notice, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
