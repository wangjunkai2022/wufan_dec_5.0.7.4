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
public final class NoticeFragmentItemNoBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25526b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25527c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25528d;

    private NoticeFragmentItemNoBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f25526b = relativeLayout;
        this.f25527c = textView;
        this.f25528d = textView2;
    }

    @NonNull
    public static NoticeFragmentItemNoBinding bind(@NonNull View view) {
        int i4 = R.id.tv_time;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
        if (textView != null) {
            i4 = R.id.tv_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
            if (textView2 != null) {
                return new NoticeFragmentItemNoBinding((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NoticeFragmentItemNoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25526b;
    }

    @NonNull
    public static NoticeFragmentItemNoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.notice_fragment_item_no, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
