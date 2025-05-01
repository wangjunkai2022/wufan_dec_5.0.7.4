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
import com.join.mgps.customview.MyGridView;
/* loaded from: classes3.dex */
public final class CollectionModuleOneBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18039b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MyGridView f18040c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18041d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18042e;

    private CollectionModuleOneBinding(@NonNull RelativeLayout relativeLayout, @NonNull MyGridView myGridView, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f18039b = relativeLayout;
        this.f18040c = myGridView;
        this.f18041d = imageView;
        this.f18042e = textView;
    }

    @NonNull
    public static CollectionModuleOneBinding bind(@NonNull View view) {
        int i4 = R.id.gridViewAlbum;
        MyGridView myGridView = (MyGridView) ViewBindings.findChildViewById(view, R.id.gridViewAlbum);
        if (myGridView != null) {
            i4 = R.id.imgBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
            if (imageView != null) {
                i4 = R.id.top_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.top_title);
                if (textView != null) {
                    return new CollectionModuleOneBinding((RelativeLayout) view, myGridView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CollectionModuleOneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18039b;
    }

    @NonNull
    public static CollectionModuleOneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.collection_module_one, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
