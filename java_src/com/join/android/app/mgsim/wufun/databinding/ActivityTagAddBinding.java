package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
/* loaded from: classes3.dex */
public final class ActivityTagAddBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17085b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final EditText f17086c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FlowLayout f17087d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FlowLayout f17088e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17089f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ListView f17090g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final NestedScrollView f17091h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TopbarTitleCenterLayoutBinding f17092i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17093j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17094k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f17095l;

    private ActivityTagAddBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull FlowLayout flowLayout, @NonNull FlowLayout flowLayout2, @NonNull LinearLayout linearLayout2, @NonNull ListView listView, @NonNull NestedScrollView nestedScrollView, @NonNull TopbarTitleCenterLayoutBinding topbarTitleCenterLayoutBinding, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view) {
        this.f17085b = linearLayout;
        this.f17086c = editText;
        this.f17087d = flowLayout;
        this.f17088e = flowLayout2;
        this.f17089f = linearLayout2;
        this.f17090g = listView;
        this.f17091h = nestedScrollView;
        this.f17092i = topbarTitleCenterLayoutBinding;
        this.f17093j = textView;
        this.f17094k = textView2;
        this.f17095l = view;
    }

    @NonNull
    public static ActivityTagAddBinding bind(@NonNull View view) {
        int i4 = R.id.et_tag;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_tag);
        if (editText != null) {
            i4 = R.id.fl_tag_all;
            FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, R.id.fl_tag_all);
            if (flowLayout != null) {
                i4 = R.id.fl_tag_my;
                FlowLayout flowLayout2 = (FlowLayout) ViewBindings.findChildViewById(view, R.id.fl_tag_my);
                if (flowLayout2 != null) {
                    i4 = R.id.ll_add_tag;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_add_tag);
                    if (linearLayout != null) {
                        i4 = R.id.lv_auto_search;
                        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.lv_auto_search);
                        if (listView != null) {
                            i4 = R.id.nsv_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nsv_view);
                            if (nestedScrollView != null) {
                                i4 = R.id.title_bar_layout;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                                if (findChildViewById != null) {
                                    TopbarTitleCenterLayoutBinding bind = TopbarTitleCenterLayoutBinding.bind(findChildViewById);
                                    i4 = R.id.tv_report;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_report);
                                    if (textView != null) {
                                        i4 = R.id.tv_tag_add;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tag_add);
                                        if (textView2 != null) {
                                            i4 = R.id.viewBg;
                                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewBg);
                                            if (findChildViewById2 != null) {
                                                return new ActivityTagAddBinding((LinearLayout) view, editText, flowLayout, flowLayout2, linearLayout, listView, nestedScrollView, bind, textView, textView2, findChildViewById2);
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
    public static ActivityTagAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17085b;
    }

    @NonNull
    public static ActivityTagAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_tag_add, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
