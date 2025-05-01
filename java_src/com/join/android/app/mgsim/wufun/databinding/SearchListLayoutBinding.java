package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.NoScrollListView;
/* loaded from: classes3.dex */
public final class SearchListLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26408b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26409c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final NoScrollListView f26410d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f26411e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26412f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26413g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26414h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26415i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26416j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26417k;

    private SearchListLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull NoScrollListView noScrollListView, @NonNull View view, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull LinearLayout linearLayout5, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26408b = linearLayout;
        this.f26409c = linearLayout2;
        this.f26410d = noScrollListView;
        this.f26411e = view;
        this.f26412f = linearLayout3;
        this.f26413g = linearLayout4;
        this.f26414h = textView;
        this.f26415i = linearLayout5;
        this.f26416j = textView2;
        this.f26417k = textView3;
    }

    @NonNull
    public static SearchListLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.clearLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.clearLayout);
        if (linearLayout != null) {
            i4 = R.id.historyListView;
            NoScrollListView noScrollListView = (NoScrollListView) ViewBindings.findChildViewById(view, R.id.historyListView);
            if (noScrollListView != null) {
                i4 = R.id.line;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                if (findChildViewById != null) {
                    i4 = R.id.linearLayout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                    if (linearLayout2 != null) {
                        i4 = R.id.llHotSearch1;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llHotSearch1);
                        if (linearLayout3 != null) {
                            i4 = R.id.noHistory;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noHistory);
                            if (textView != null) {
                                LinearLayout linearLayout4 = (LinearLayout) view;
                                i4 = R.id.textView;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                if (textView2 != null) {
                                    i4 = R.id.textView2;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                    if (textView3 != null) {
                                        return new SearchListLayoutBinding(linearLayout4, linearLayout, noScrollListView, findChildViewById, linearLayout2, linearLayout3, textView, linearLayout4, textView2, textView3);
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
    public static SearchListLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26408b;
    }

    @NonNull
    public static SearchListLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_list_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
