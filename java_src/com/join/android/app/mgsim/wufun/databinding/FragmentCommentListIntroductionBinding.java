package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CornersLinearLayout;
/* loaded from: classes3.dex */
public final class FragmentCommentListIntroductionBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CornersLinearLayout f19666b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19667c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19668d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19669e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19670f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f19671g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f19672h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f19673i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final XRecyclerView f19674j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f19675k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19676l;

    private FragmentCommentListIntroductionBinding(@NonNull CornersLinearLayout cornersLinearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull XRecyclerView xRecyclerView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2) {
        this.f19666b = cornersLinearLayout;
        this.f19667c = textView;
        this.f19668d = imageView;
        this.f19669e = imageView2;
        this.f19670f = imageView3;
        this.f19671g = linearLayout;
        this.f19672h = relativeLayout;
        this.f19673i = relativeLayout2;
        this.f19674j = xRecyclerView;
        this.f19675k = recyclerView;
        this.f19676l = textView2;
    }

    @NonNull
    public static FragmentCommentListIntroductionBinding bind(@NonNull View view) {
        int i4 = R.id.editText5;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editText5);
        if (textView != null) {
            i4 = R.id.imageView44;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView44);
            if (imageView != null) {
                i4 = R.id.iv_back;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                if (imageView2 != null) {
                    i4 = R.id.iv_close;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
                    if (imageView3 != null) {
                        i4 = R.id.ll_empty;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_empty);
                        if (linearLayout != null) {
                            i4 = R.id.rl_comment_detail;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_comment_detail);
                            if (relativeLayout != null) {
                                i4 = R.id.rl_comment_list;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_comment_list);
                                if (relativeLayout2 != null) {
                                    i4 = R.id.rv_comment_detail_list;
                                    XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.rv_comment_detail_list);
                                    if (xRecyclerView != null) {
                                        i4 = R.id.rv_list_data;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_list_data);
                                        if (recyclerView != null) {
                                            i4 = R.id.tv_title;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                            if (textView2 != null) {
                                                return new FragmentCommentListIntroductionBinding((CornersLinearLayout) view, textView, imageView, imageView2, imageView3, linearLayout, relativeLayout, relativeLayout2, xRecyclerView, recyclerView, textView2);
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
    public static FragmentCommentListIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CornersLinearLayout getRoot() {
        return this.f19666b;
    }

    @NonNull
    public static FragmentCommentListIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_comment_list_introduction, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
