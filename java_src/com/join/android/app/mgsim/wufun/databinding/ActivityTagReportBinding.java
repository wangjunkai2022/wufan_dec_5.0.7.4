package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
/* loaded from: classes3.dex */
public final class ActivityTagReportBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17096b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f17097c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f17098d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FlowLayout f17099e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ListView f17100f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TopbarTitleCenterLayoutBinding f17101g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f17102h;

    private ActivityTagReportBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText, @NonNull FlowLayout flowLayout, @NonNull ListView listView, @NonNull TopbarTitleCenterLayoutBinding topbarTitleCenterLayoutBinding, @NonNull View view) {
        this.f17096b = linearLayout;
        this.f17097c = button;
        this.f17098d = editText;
        this.f17099e = flowLayout;
        this.f17100f = listView;
        this.f17101g = topbarTitleCenterLayoutBinding;
        this.f17102h = view;
    }

    @NonNull
    public static ActivityTagReportBinding bind(@NonNull View view) {
        int i4 = R.id.btn_commit;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_commit);
        if (button != null) {
            i4 = R.id.et_reason_text;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_reason_text);
            if (editText != null) {
                i4 = R.id.fl_tag_all;
                FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, R.id.fl_tag_all);
                if (flowLayout != null) {
                    i4 = R.id.lv_reasons;
                    ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.lv_reasons);
                    if (listView != null) {
                        i4 = R.id.title_bar_layout;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                        if (findChildViewById != null) {
                            TopbarTitleCenterLayoutBinding bind = TopbarTitleCenterLayoutBinding.bind(findChildViewById);
                            i4 = R.id.viewBg;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewBg);
                            if (findChildViewById2 != null) {
                                return new ActivityTagReportBinding((LinearLayout) view, button, editText, flowLayout, listView, bind, findChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityTagReportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17096b;
    }

    @NonNull
    public static ActivityTagReportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_tag_report, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
