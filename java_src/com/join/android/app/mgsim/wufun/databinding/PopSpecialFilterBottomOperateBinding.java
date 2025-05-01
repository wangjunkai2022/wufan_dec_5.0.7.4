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
import com.zhy.view.flowlayout.TagFlowSpecialLayout;
/* loaded from: classes3.dex */
public final class PopSpecialFilterBottomOperateBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26102b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TagFlowSpecialLayout f26103c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TagFlowSpecialLayout f26104d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TagFlowSpecialLayout f26105e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26106f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26107g;

    private PopSpecialFilterBottomOperateBinding(@NonNull LinearLayout linearLayout, @NonNull TagFlowSpecialLayout tagFlowSpecialLayout, @NonNull TagFlowSpecialLayout tagFlowSpecialLayout2, @NonNull TagFlowSpecialLayout tagFlowSpecialLayout3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26102b = linearLayout;
        this.f26103c = tagFlowSpecialLayout;
        this.f26104d = tagFlowSpecialLayout2;
        this.f26105e = tagFlowSpecialLayout3;
        this.f26106f = textView;
        this.f26107g = textView2;
    }

    @NonNull
    public static PopSpecialFilterBottomOperateBinding bind(@NonNull View view) {
        int i4 = R.id.filter1;
        TagFlowSpecialLayout tagFlowSpecialLayout = (TagFlowSpecialLayout) ViewBindings.findChildViewById(view, R.id.filter1);
        if (tagFlowSpecialLayout != null) {
            i4 = R.id.filter2;
            TagFlowSpecialLayout tagFlowSpecialLayout2 = (TagFlowSpecialLayout) ViewBindings.findChildViewById(view, R.id.filter2);
            if (tagFlowSpecialLayout2 != null) {
                i4 = R.id.filter3;
                TagFlowSpecialLayout tagFlowSpecialLayout3 = (TagFlowSpecialLayout) ViewBindings.findChildViewById(view, R.id.filter3);
                if (tagFlowSpecialLayout3 != null) {
                    i4 = R.id.resetButn;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.resetButn);
                    if (textView != null) {
                        i4 = R.id.setting;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.setting);
                        if (textView2 != null) {
                            return new PopSpecialFilterBottomOperateBinding((LinearLayout) view, tagFlowSpecialLayout, tagFlowSpecialLayout2, tagFlowSpecialLayout3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopSpecialFilterBottomOperateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26102b;
    }

    @NonNull
    public static PopSpecialFilterBottomOperateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_special_filter_bottom_operate, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
