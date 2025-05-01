package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class ActivityGameSearchFavoriteBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16416b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16417c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f16418d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XListView2 f16419e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TopbarTitleCenterLayoutBinding f16420f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f16421g;

    private ActivityGameSearchFavoriteBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull XListView2 xListView2, @NonNull TopbarTitleCenterLayoutBinding topbarTitleCenterLayoutBinding, @NonNull RelativeLayout relativeLayout) {
        this.f16416b = linearLayout;
        this.f16417c = imageView;
        this.f16418d = editText;
        this.f16419e = xListView2;
        this.f16420f = topbarTitleCenterLayoutBinding;
        this.f16421g = relativeLayout;
    }

    @NonNull
    public static ActivityGameSearchFavoriteBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.et_search;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_search);
            if (editText != null) {
                i4 = R.id.mListView;
                XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.mListView);
                if (xListView2 != null) {
                    i4 = R.id.rl_normal;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.rl_normal);
                    if (findChildViewById != null) {
                        TopbarTitleCenterLayoutBinding bind = TopbarTitleCenterLayoutBinding.bind(findChildViewById);
                        i4 = R.id.rl_search;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_search);
                        if (relativeLayout != null) {
                            return new ActivityGameSearchFavoriteBinding((LinearLayout) view, imageView, editText, xListView2, bind, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityGameSearchFavoriteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16416b;
    }

    @NonNull
    public static ActivityGameSearchFavoriteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_search_favorite, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
