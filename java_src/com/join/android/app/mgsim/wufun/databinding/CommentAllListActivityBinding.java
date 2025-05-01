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
public final class CommentAllListActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18084b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18085c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView2 f18086d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18087e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f18088f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final PtrClassicFrameLayout f18089g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f18090h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18091i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18092j;

    private CommentAllListActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull XListView2 xListView2, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18084b = linearLayout;
        this.f18085c = imageView;
        this.f18086d = xListView2;
        this.f18087e = textView;
        this.f18088f = imageView2;
        this.f18089g = ptrClassicFrameLayout;
        this.f18090h = linearLayout2;
        this.f18091i = textView2;
        this.f18092j = textView3;
    }

    @NonNull
    public static CommentAllListActivityBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.comment_all_list;
            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.comment_all_list);
            if (xListView2 != null) {
                i4 = R.id.editText5;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editText5);
                if (textView != null) {
                    i4 = R.id.imageView44;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView44);
                    if (imageView2 != null) {
                        i4 = R.id.mPtrFrame;
                        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                        if (ptrClassicFrameLayout != null) {
                            i4 = R.id.noCommentLl;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.noCommentLl);
                            if (linearLayout != null) {
                                i4 = R.id.textTopRight;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textTopRight);
                                if (textView2 != null) {
                                    i4 = R.id.title_textview;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                    if (textView3 != null) {
                                        return new CommentAllListActivityBinding((LinearLayout) view, imageView, xListView2, textView, imageView2, ptrClassicFrameLayout, linearLayout, textView2, textView3);
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
    public static CommentAllListActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18084b;
    }

    @NonNull
    public static CommentAllListActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_all_list_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
