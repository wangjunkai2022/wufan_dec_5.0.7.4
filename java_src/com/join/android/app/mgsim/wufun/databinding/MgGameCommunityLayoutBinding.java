package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyInnerScrollView;
/* loaded from: classes3.dex */
public final class MgGameCommunityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final MyInnerScrollView f24435b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24436c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MyInnerScrollView f24437d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24438e;

    private MgGameCommunityLayoutBinding(@NonNull MyInnerScrollView myInnerScrollView, @NonNull ImageView imageView, @NonNull MyInnerScrollView myInnerScrollView2, @NonNull TextView textView) {
        this.f24435b = myInnerScrollView;
        this.f24436c = imageView;
        this.f24437d = myInnerScrollView2;
        this.f24438e = textView;
    }

    @NonNull
    public static MgGameCommunityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.imageGoto;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageGoto);
        if (imageView != null) {
            MyInnerScrollView myInnerScrollView = (MyInnerScrollView) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textGoto);
            if (textView != null) {
                return new MgGameCommunityLayoutBinding(myInnerScrollView, imageView, myInnerScrollView, textView);
            }
            i4 = R.id.textGoto;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGameCommunityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public MyInnerScrollView getRoot() {
        return this.f24435b;
    }

    @NonNull
    public static MgGameCommunityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_game_community_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
