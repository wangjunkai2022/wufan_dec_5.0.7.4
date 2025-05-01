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
import com.join.mgps.customview.ClouldItemView3;
/* loaded from: classes3.dex */
public final class ItemCloudListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21705b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ClouldItemView3 f21706c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f21707d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21708e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21709f;

    private ItemCloudListItemBinding(@NonNull LinearLayout linearLayout, @NonNull ClouldItemView3 clouldItemView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f21705b = linearLayout;
        this.f21706c = clouldItemView3;
        this.f21707d = linearLayout2;
        this.f21708e = textView;
        this.f21709f = textView2;
    }

    @NonNull
    public static ItemCloudListItemBinding bind(@NonNull View view) {
        int i4 = R.id.coulditem;
        ClouldItemView3 clouldItemView3 = (ClouldItemView3) ViewBindings.findChildViewById(view, R.id.coulditem);
        if (clouldItemView3 != null) {
            i4 = R.id.ll_show;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_show);
            if (linearLayout != null) {
                i4 = R.id.tv_today_id;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_today_id);
                if (textView != null) {
                    i4 = R.id.tv_zong_id;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_zong_id);
                    if (textView2 != null) {
                        return new ItemCloudListItemBinding((LinearLayout) view, clouldItemView3, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemCloudListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21705b;
    }

    @NonNull
    public static ItemCloudListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_cloud_list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
