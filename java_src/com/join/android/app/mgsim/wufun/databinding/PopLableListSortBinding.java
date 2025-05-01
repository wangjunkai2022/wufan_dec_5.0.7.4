package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopLableListSortBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26026b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RadioButton f26027c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RadioButton f26028d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RadioButton f26029e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RadioGroup f26030f;

    private PopLableListSortBinding(@NonNull RelativeLayout relativeLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioGroup radioGroup) {
        this.f26026b = relativeLayout;
        this.f26027c = radioButton;
        this.f26028d = radioButton2;
        this.f26029e = radioButton3;
        this.f26030f = radioGroup;
    }

    @NonNull
    public static PopLableListSortBinding bind(@NonNull View view) {
        int i4 = R.id.radioButton_hot;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton_hot);
        if (radioButton != null) {
            i4 = R.id.radioButton_mostReply;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton_mostReply);
            if (radioButton2 != null) {
                i4 = R.id.radioButton_new;
                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.radioButton_new);
                if (radioButton3 != null) {
                    i4 = R.id.rgSort;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgSort);
                    if (radioGroup != null) {
                        return new PopLableListSortBinding((RelativeLayout) view, radioButton, radioButton2, radioButton3, radioGroup);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopLableListSortBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26026b;
    }

    @NonNull
    public static PopLableListSortBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_lable_list_sort, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
