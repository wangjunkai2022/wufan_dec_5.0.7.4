package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class AlbumItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17344b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17345c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17346d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17347e;

    private AlbumItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f17344b = relativeLayout;
        this.f17345c = textView;
        this.f17346d = imageView;
        this.f17347e = textView2;
    }

    @NonNull
    public static AlbumItemBinding bind(@NonNull View view) {
        int i4 = R.id.album_count;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.album_count);
        if (textView != null) {
            i4 = R.id.album_cover;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.album_cover);
            if (imageView != null) {
                i4 = R.id.album_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.album_name);
                if (textView2 != null) {
                    return new AlbumItemBinding((RelativeLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AlbumItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17344b;
    }

    @NonNull
    public static AlbumItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.album_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
