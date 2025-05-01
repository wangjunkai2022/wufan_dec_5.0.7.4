package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SimpleSheetViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26574b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26575c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ListView f26576d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26577e;

    private SimpleSheetViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ListView listView, @NonNull TextView textView) {
        this.f26574b = linearLayout;
        this.f26575c = linearLayout2;
        this.f26576d = listView;
        this.f26577e = textView;
    }

    @NonNull
    public static SimpleSheetViewBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.close);
        if (linearLayout != null) {
            i4 = R.id.list;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.list);
            if (listView != null) {
                i4 = R.id.title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                if (textView != null) {
                    return new SimpleSheetViewBinding((LinearLayout) view, linearLayout, listView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SimpleSheetViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26574b;
    }

    @NonNull
    public static SimpleSheetViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.simple_sheet_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
