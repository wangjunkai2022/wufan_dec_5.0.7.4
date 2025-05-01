package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class AlbumGridviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17340b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f17341c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17342d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17343e;

    private AlbumGridviewItemBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f17340b = linearLayout;
        this.f17341c = button;
        this.f17342d = imageView;
        this.f17343e = textView;
    }

    @NonNull
    public static AlbumGridviewItemBinding bind(@NonNull View view) {
        int i4 = R.id.buttonAlbum;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.buttonAlbum);
        if (button != null) {
            i4 = R.id.imgIconAlbum;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIconAlbum);
            if (imageView != null) {
                i4 = R.id.textViewAlbum;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textViewAlbum);
                if (textView != null) {
                    return new AlbumGridviewItemBinding((LinearLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AlbumGridviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17340b;
    }

    @NonNull
    public static AlbumGridviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.album_gridview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
