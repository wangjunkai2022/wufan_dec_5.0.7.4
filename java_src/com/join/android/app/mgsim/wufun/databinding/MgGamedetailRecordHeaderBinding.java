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
public final class MgGamedetailRecordHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24520b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f24521c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24522d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24523e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24524f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24525g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f24526h;

    private MgGamedetailRecordHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull View view) {
        this.f24520b = linearLayout;
        this.f24521c = relativeLayout;
        this.f24522d = textView;
        this.f24523e = textView2;
        this.f24524f = textView3;
        this.f24525g = linearLayout2;
        this.f24526h = view;
    }

    @NonNull
    public static MgGamedetailRecordHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.commentHeaderLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.commentHeaderLayout);
        if (relativeLayout != null) {
            i4 = R.id.commitCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.commitCount);
            if (textView != null) {
                i4 = R.id.commitImage;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.commitImage);
                if (textView2 != null) {
                    i4 = R.id.commitTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.commitTv);
                    if (textView3 != null) {
                        i4 = R.id.layoutBottom;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutBottom);
                        if (linearLayout != null) {
                            i4 = R.id.line;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                            if (findChildViewById != null) {
                                return new MgGamedetailRecordHeaderBinding((LinearLayout) view, relativeLayout, textView, textView2, textView3, linearLayout, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGamedetailRecordHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24520b;
    }

    @NonNull
    public static MgGamedetailRecordHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_record_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
