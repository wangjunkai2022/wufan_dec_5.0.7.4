package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class MyAlbumActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25287b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25288c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final GridView f25289d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25290e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f25291f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25292g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f25293h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25294i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25295j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f25296k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25297l;

    private MyAlbumActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull GridView gridView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2) {
        this.f25287b = relativeLayout;
        this.f25288c = imageView;
        this.f25289d = gridView;
        this.f25290e = relativeLayout2;
        this.f25291f = relativeLayout3;
        this.f25292g = imageView2;
        this.f25293h = view;
        this.f25294i = linearLayout;
        this.f25295j = textView;
        this.f25296k = button;
        this.f25297l = textView2;
    }

    @NonNull
    public static MyAlbumActivityBinding bind(@NonNull View view) {
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
                            i4 = R.id.cover;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.cover);
                            if (findChildViewById != null) {
                                i4 = R.id.layout_show_album;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_show_album);
                                if (linearLayout != null) {
                                    i4 = R.id.layout_title;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.layout_title);
                                    if (textView != null) {
                                        i4 = R.id.ok_image;
                                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.ok_image);
                                        if (button != null) {
                                            i4 = R.id.select_num;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.select_num);
                                            if (textView2 != null) {
                                                return new MyAlbumActivityBinding((RelativeLayout) view, imageView, gridView, relativeLayout, relativeLayout2, imageView2, findChildViewById, linearLayout, textView, button, textView2);
                                            }
                                        }
                                    }
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
    public static MyAlbumActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25287b;
    }

    @NonNull
    public static MyAlbumActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_album_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
