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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CloudArchiveMorePopBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17904b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17905c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f17906d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17907e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f17908f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f17909g;

    private CloudArchiveMorePopBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull View view, @NonNull View view2) {
        this.f17904b = linearLayout;
        this.f17905c = textView;
        this.f17906d = linearLayout2;
        this.f17907e = textView2;
        this.f17908f = view;
        this.f17909g = view2;
    }

    @NonNull
    public static CloudArchiveMorePopBinding bind(@NonNull View view) {
        int i4 = R.id.deleteCloud;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.deleteCloud);
        if (textView != null) {
            i4 = R.id.main;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
            if (linearLayout != null) {
                i4 = R.id.reDownload;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.reDownload);
                if (textView2 != null) {
                    i4 = R.id.trangleBottom;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.trangleBottom);
                    if (findChildViewById != null) {
                        i4 = R.id.trangleTop;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.trangleTop);
                        if (findChildViewById2 != null) {
                            return new CloudArchiveMorePopBinding((LinearLayout) view, textView, linearLayout, textView2, findChildViewById, findChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CloudArchiveMorePopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17904b;
    }

    @NonNull
    public static CloudArchiveMorePopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cloud_archive_more_pop, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
