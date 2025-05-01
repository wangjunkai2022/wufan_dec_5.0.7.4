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
public final class DialogUploadBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19060b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f19061c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19062d;

    private DialogUploadBinding(@NonNull LinearLayout linearLayout, @NonNull ListView listView, @NonNull TextView textView) {
        this.f19060b = linearLayout;
        this.f19061c = listView;
        this.f19062d = textView;
    }

    @NonNull
    public static DialogUploadBinding bind(@NonNull View view) {
        int i4 = R.id.listView;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listView);
        if (listView != null) {
            i4 = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.name);
            if (textView != null) {
                return new DialogUploadBinding((LinearLayout) view, listView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogUploadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19060b;
    }

    @NonNull
    public static DialogUploadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_upload, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
