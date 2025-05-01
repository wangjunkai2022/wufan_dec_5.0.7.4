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
import com.join.mgps.customview.ClouldItemView2;
/* loaded from: classes3.dex */
public final class ArchiveshopfragmetItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17470b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ClouldItemView2 f17471c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f17472d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17473e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17474f;

    private ArchiveshopfragmetItemBinding(@NonNull LinearLayout linearLayout, @NonNull ClouldItemView2 clouldItemView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f17470b = linearLayout;
        this.f17471c = clouldItemView2;
        this.f17472d = linearLayout2;
        this.f17473e = textView;
        this.f17474f = textView2;
    }

    @NonNull
    public static ArchiveshopfragmetItemBinding bind(@NonNull View view) {
        int i4 = R.id.coulditem;
        ClouldItemView2 clouldItemView2 = (ClouldItemView2) ViewBindings.findChildViewById(view, R.id.coulditem);
        if (clouldItemView2 != null) {
            i4 = R.id.ll_show;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_show);
            if (linearLayout != null) {
                i4 = R.id.tv_today_id;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_today_id);
                if (textView != null) {
                    i4 = R.id.tv_zong_id;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_zong_id);
                    if (textView2 != null) {
                        return new ArchiveshopfragmetItemBinding((LinearLayout) view, clouldItemView2, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ArchiveshopfragmetItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17470b;
    }

    @NonNull
    public static ArchiveshopfragmetItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.archiveshopfragmet_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
