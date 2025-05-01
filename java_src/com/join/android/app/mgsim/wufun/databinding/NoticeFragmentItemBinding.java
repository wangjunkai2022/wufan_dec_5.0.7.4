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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NoticeFragmentItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25520b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f25521c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25522d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25523e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25524f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25525g;

    private NoticeFragmentItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f25520b = relativeLayout;
        this.f25521c = relativeLayout2;
        this.f25522d = textView;
        this.f25523e = textView2;
        this.f25524f = textView3;
        this.f25525g = textView4;
    }

    @NonNull
    public static NoticeFragmentItemBinding bind(@NonNull View view) {
        int i4 = R.id.relativeLayout3;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout3);
        if (relativeLayout != null) {
            i4 = R.id.showDetail;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.showDetail);
            if (textView != null) {
                i4 = R.id.textView31;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView31);
                if (textView2 != null) {
                    i4 = R.id.tv_time;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
                    if (textView3 != null) {
                        i4 = R.id.tv_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView4 != null) {
                            return new NoticeFragmentItemBinding((RelativeLayout) view, relativeLayout, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NoticeFragmentItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25520b;
    }

    @NonNull
    public static NoticeFragmentItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.notice_fragment_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
