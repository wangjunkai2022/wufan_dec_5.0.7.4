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
public final class LiveAnchorAdminLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23503b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f23504c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23505d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23506e;

    private LiveAnchorAdminLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ListView listView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23503b = linearLayout;
        this.f23504c = listView;
        this.f23505d = textView;
        this.f23506e = textView2;
    }

    @NonNull
    public static LiveAnchorAdminLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.adminList;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.adminList);
        if (listView != null) {
            i4 = R.id.noAdminTest;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noAdminTest);
            if (textView != null) {
                i4 = R.id.save;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.save);
                if (textView2 != null) {
                    return new LiveAnchorAdminLayoutBinding((LinearLayout) view, listView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LiveAnchorAdminLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23503b;
    }

    @NonNull
    public static LiveAnchorAdminLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.live_anchor_admin_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
