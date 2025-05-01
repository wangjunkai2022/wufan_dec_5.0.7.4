package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivitySearchLabelBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16928b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16929c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f16930d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f16931e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ListView f16932f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16933g;

    private ActivitySearchLabelBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull ImageView imageView2, @NonNull ListView listView, @NonNull TextView textView) {
        this.f16928b = linearLayout;
        this.f16929c = imageView;
        this.f16930d = editText;
        this.f16931e = imageView2;
        this.f16932f = listView;
        this.f16933g = textView;
    }

    @NonNull
    public static ActivitySearchLabelBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.et_search;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_search);
            if (editText != null) {
                i4 = R.id.ic_clear;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ic_clear);
                if (imageView2 != null) {
                    i4 = R.id.mListView;
                    ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.mListView);
                    if (listView != null) {
                        i4 = R.id.tv_nodata;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nodata);
                        if (textView != null) {
                            return new ActivitySearchLabelBinding((LinearLayout) view, imageView, editText, imageView2, listView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivitySearchLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16928b;
    }

    @NonNull
    public static ActivitySearchLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_search_label, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
