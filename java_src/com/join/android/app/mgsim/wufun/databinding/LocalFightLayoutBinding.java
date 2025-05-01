package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LocalFightLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23553b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f23554c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f23555d;

    private LocalFightLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ListView listView, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding) {
        this.f23553b = linearLayout;
        this.f23554c = listView;
        this.f23555d = topbarLeftTitleLayoutBinding;
    }

    @NonNull
    public static LocalFightLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.localFightListView;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.localFightListView);
        if (listView != null) {
            i4 = R.id.title_bar_layout;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
            if (findChildViewById != null) {
                return new LocalFightLayoutBinding((LinearLayout) view, listView, TopbarLeftTitleLayoutBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static LocalFightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23553b;
    }

    @NonNull
    public static LocalFightLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.local_fight_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
