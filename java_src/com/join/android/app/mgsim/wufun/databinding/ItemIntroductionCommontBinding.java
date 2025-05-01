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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CornersLinearLayout;
import com.join.mgps.customview.textview.MovementTextView;
/* loaded from: classes3.dex */
public final class ItemIntroductionCommontBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22404b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CornersLinearLayout f22405c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22406d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final MovementTextView f22407e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22408f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f22409g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f22410h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f22411i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f22412j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22413k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f22414l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f22415m;

    private ItemIntroductionCommontBinding(@NonNull LinearLayout linearLayout, @NonNull CornersLinearLayout cornersLinearLayout, @NonNull LinearLayout linearLayout2, @NonNull MovementTextView movementTextView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22404b = linearLayout;
        this.f22405c = cornersLinearLayout;
        this.f22406d = linearLayout2;
        this.f22407e = movementTextView;
        this.f22408f = imageView;
        this.f22409g = imageView2;
        this.f22410h = view;
        this.f22411i = linearLayout3;
        this.f22412j = simpleDraweeView;
        this.f22413k = textView;
        this.f22414l = textView2;
        this.f22415m = textView3;
    }

    @NonNull
    public static ItemIntroductionCommontBinding bind(@NonNull View view) {
        int i4 = R.id.cll_view;
        CornersLinearLayout cornersLinearLayout = (CornersLinearLayout) ViewBindings.findChildViewById(view, R.id.cll_view);
        if (cornersLinearLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i4 = R.id.content;
            MovementTextView movementTextView = (MovementTextView) ViewBindings.findChildViewById(view, R.id.content);
            if (movementTextView != null) {
                i4 = R.id.iv_more;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_more);
                if (imageView != null) {
                    i4 = R.id.iv_praise;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_praise);
                    if (imageView2 != null) {
                        i4 = R.id.layoutTop;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
                        if (findChildViewById != null) {
                            i4 = R.id.ll_replay;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_replay);
                            if (linearLayout2 != null) {
                                i4 = R.id.siv_head;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.siv_head);
                                if (simpleDraweeView != null) {
                                    i4 = R.id.tv_replay_num;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_replay_num);
                                    if (textView != null) {
                                        i4 = R.id.tv_star_num;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_star_num);
                                        if (textView2 != null) {
                                            i4 = R.id.userName;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                                            if (textView3 != null) {
                                                return new ItemIntroductionCommontBinding(linearLayout, cornersLinearLayout, linearLayout, movementTextView, imageView, imageView2, findChildViewById, linearLayout2, simpleDraweeView, textView, textView2, textView3);
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
    public static ItemIntroductionCommontBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22404b;
    }

    @NonNull
    public static ItemIntroductionCommontBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_introduction_commont, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
