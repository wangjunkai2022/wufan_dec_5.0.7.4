package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutGameDetailSheetGoldenFingerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23056b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23057c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ListView f23058d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23059e;

    private LayoutGameDetailSheetGoldenFingerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ListView listView, @NonNull TextView textView) {
        this.f23056b = constraintLayout;
        this.f23057c = imageView;
        this.f23058d = listView;
        this.f23059e = textView;
    }

    @NonNull
    public static LayoutGameDetailSheetGoldenFingerBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.listView;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listView);
            if (listView != null) {
                i4 = R.id.textView93;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView93);
                if (textView != null) {
                    return new LayoutGameDetailSheetGoldenFingerBinding((ConstraintLayout) view, imageView, listView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LayoutGameDetailSheetGoldenFingerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23056b;
    }

    @NonNull
    public static LayoutGameDetailSheetGoldenFingerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_game_detail_sheet_golden_finger, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
