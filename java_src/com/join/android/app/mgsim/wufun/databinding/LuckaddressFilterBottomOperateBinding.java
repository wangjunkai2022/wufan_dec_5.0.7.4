package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LuckaddressFilterBottomOperateBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23614b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final NumberPicker f23615c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final NumberPicker f23616d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final NumberPicker f23617e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23618f;

    private LuckaddressFilterBottomOperateBinding(@NonNull LinearLayout linearLayout, @NonNull NumberPicker numberPicker, @NonNull NumberPicker numberPicker2, @NonNull NumberPicker numberPicker3, @NonNull TextView textView) {
        this.f23614b = linearLayout;
        this.f23615c = numberPicker;
        this.f23616d = numberPicker2;
        this.f23617e = numberPicker3;
        this.f23618f = textView;
    }

    @NonNull
    public static LuckaddressFilterBottomOperateBinding bind(@NonNull View view) {
        int i4 = R.id.city_wheel;
        NumberPicker numberPicker = (NumberPicker) ViewBindings.findChildViewById(view, R.id.city_wheel);
        if (numberPicker != null) {
            i4 = R.id.district_wheel;
            NumberPicker numberPicker2 = (NumberPicker) ViewBindings.findChildViewById(view, R.id.district_wheel);
            if (numberPicker2 != null) {
                i4 = R.id.province_wheel;
                NumberPicker numberPicker3 = (NumberPicker) ViewBindings.findChildViewById(view, R.id.province_wheel);
                if (numberPicker3 != null) {
                    i4 = R.id.setting;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.setting);
                    if (textView != null) {
                        return new LuckaddressFilterBottomOperateBinding((LinearLayout) view, numberPicker, numberPicker2, numberPicker3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LuckaddressFilterBottomOperateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23614b;
    }

    @NonNull
    public static LuckaddressFilterBottomOperateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.luckaddress_filter_bottom_operate, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
