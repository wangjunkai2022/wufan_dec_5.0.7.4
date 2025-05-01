package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MyIconActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25314b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25315c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final GridView f25316d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25317e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f25318f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25319g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25320h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25321i;

    private MyIconActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull GridView gridView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f25314b = relativeLayout;
        this.f25315c = imageView;
        this.f25316d = gridView;
        this.f25317e = relativeLayout2;
        this.f25318f = relativeLayout3;
        this.f25319g = imageView2;
        this.f25320h = linearLayout;
        this.f25321i = textView;
    }

    @NonNull
    public static MyIconActivityBinding bind(@NonNull View view) {
        int i4 = R.id.album_collapse_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.album_collapse_image);
        if (imageView != null) {
            i4 = R.id.album_grid;
            GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.album_grid);
            if (gridView != null) {
                i4 = R.id.album_main;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.album_main);
                if (relativeLayout != null) {
                    i4 = R.id.album_title;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.album_title);
                    if (relativeLayout2 != null) {
                        i4 = R.id.back_image;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
                        if (imageView2 != null) {
                            i4 = R.id.layout_show_album;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_show_album);
                            if (linearLayout != null) {
                                i4 = R.id.layout_title;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.layout_title);
                                if (textView != null) {
                                    return new MyIconActivityBinding((RelativeLayout) view, imageView, gridView, relativeLayout, relativeLayout2, imageView2, linearLayout, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MyIconActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25314b;
    }

    @NonNull
    public static MyIconActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_icon_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
