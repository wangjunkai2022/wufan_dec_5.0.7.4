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
public final class MgGamedetailRecordFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24517b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f24518c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24519d;

    private MgGamedetailRecordFooterBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.f24517b = linearLayout;
        this.f24518c = relativeLayout;
        this.f24519d = textView;
    }

    @NonNull
    public static MgGamedetailRecordFooterBinding bind(@NonNull View view) {
        int i4 = R.id.commentFooterLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.commentFooterLayout);
        if (relativeLayout != null) {
            i4 = R.id.showAllCommit;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.showAllCommit);
            if (textView != null) {
                return new MgGamedetailRecordFooterBinding((LinearLayout) view, relativeLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGamedetailRecordFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24517b;
    }

    @NonNull
    public static MgGamedetailRecordFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_record_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
