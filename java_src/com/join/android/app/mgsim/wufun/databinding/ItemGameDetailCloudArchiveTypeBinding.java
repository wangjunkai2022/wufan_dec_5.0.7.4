package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemGameDetailCloudArchiveTypeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f22210b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22211c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22212d;

    private ItemGameDetailCloudArchiveTypeBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22210b = frameLayout;
        this.f22211c = textView;
        this.f22212d = textView2;
    }

    @NonNull
    public static ItemGameDetailCloudArchiveTypeBinding bind(@NonNull View view) {
        int i4 = R.id.tvCountNew;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCountNew);
        if (textView != null) {
            i4 = R.id.tvType;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvType);
            if (textView2 != null) {
                return new ItemGameDetailCloudArchiveTypeBinding((FrameLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameDetailCloudArchiveTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f22210b;
    }

    @NonNull
    public static ItemGameDetailCloudArchiveTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_detail_cloud_archive_type, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
