package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class AlbumLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17348b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f17349c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f17350d;

    private AlbumLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ListView listView, @NonNull RelativeLayout relativeLayout2) {
        this.f17348b = relativeLayout;
        this.f17349c = listView;
        this.f17350d = relativeLayout2;
    }

    @NonNull
    public static AlbumLayoutBinding bind(@NonNull View view) {
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.list);
        if (listView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new AlbumLayoutBinding(relativeLayout, listView, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.list)));
    }

    @NonNull
    public static AlbumLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17348b;
    }

    @NonNull
    public static AlbumLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.album_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
