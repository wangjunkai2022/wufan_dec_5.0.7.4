package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class CommentDetailActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18115b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18116c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f18117d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18118e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f18119f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f18120g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final PtrClassicFrameLayout f18121h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18122i;

    private CommentDetailActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull XListView2 xListView2, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull TextView textView2) {
        this.f18115b = linearLayout;
        this.f18116c = imageView;
        this.f18117d = xListView2;
        this.f18118e = textView;
        this.f18119f = imageView2;
        this.f18120g = linearLayout2;
        this.f18121h = ptrClassicFrameLayout;
        this.f18122i = textView2;
    }

    @NonNull
    public static CommentDetailActivityBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.comment_detail_list;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.comment_detail_list);
            if (xListView2 != null) {
                i4 = R.id.deletedTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.deletedTv);
                if (textView != null) {
                    i4 = R.id.imTopRight;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imTopRight);
                    if (imageView2 != null) {
                        i4 = R.id.inputLl;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.inputLl);
                        if (linearLayout != null) {
                            i4 = R.id.mPtrFrame;
                            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                            if (ptrClassicFrameLayout != null) {
                                i4 = R.id.title_textview;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                if (textView2 != null) {
                                    return new CommentDetailActivityBinding((LinearLayout) view, imageView, xListView2, textView, imageView2, linearLayout, ptrClassicFrameLayout, textView2);
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
    public static CommentDetailActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18115b;
    }

    @NonNull
    public static CommentDetailActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_detail_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
