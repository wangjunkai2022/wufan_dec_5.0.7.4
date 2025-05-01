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
public final class SwitchLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26723b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26724c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26725d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26726e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26727f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26728g;

    private SwitchLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f26723b = linearLayout;
        this.f26724c = linearLayout2;
        this.f26725d = linearLayout3;
        this.f26726e = linearLayout4;
        this.f26727f = textView;
        this.f26728g = textView2;
    }

    @NonNull
    public static SwitchLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.ll_elite_room;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_elite_room);
        if (linearLayout != null) {
            i4 = R.id.ll_standard_room;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_standard_room);
            if (linearLayout2 != null) {
                i4 = R.id.ll_tab;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tab);
                if (linearLayout3 != null) {
                    i4 = R.id.tv_elite_room_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_elite_room_name);
                    if (textView != null) {
                        i4 = R.id.tv_standard_room_name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_standard_room_name);
                        if (textView2 != null) {
                            return new SwitchLayoutBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SwitchLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26723b;
    }

    @NonNull
    public static SwitchLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.switch_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
