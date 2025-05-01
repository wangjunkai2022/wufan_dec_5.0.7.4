package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.zhy.view.flowlayout.TagFlowLayout3;
/* loaded from: classes3.dex */
public final class SearchListActivity1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26370b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f26371c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26372d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TagFlowLayout3 f26373e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26374f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f26375g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f26376h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final EditText f26377i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f26378j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TagFlowLayout3 f26379k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f26380l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f26381m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TabLayout f26382n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final View f26383o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26384p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26385q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ViewPager f26386r;

    private SearchListActivity1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull ListView listView, @NonNull ImageView imageView, @NonNull TagFlowLayout3 tagFlowLayout3, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull EditText editText, @NonNull ImageView imageView3, @NonNull TagFlowLayout3 tagFlowLayout32, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView4, @NonNull TabLayout tabLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ViewPager viewPager) {
        this.f26370b = constraintLayout;
        this.f26371c = listView;
        this.f26372d = imageView;
        this.f26373e = tagFlowLayout3;
        this.f26374f = imageView2;
        this.f26375g = constraintLayout2;
        this.f26376h = constraintLayout3;
        this.f26377i = editText;
        this.f26378j = imageView3;
        this.f26379k = tagFlowLayout32;
        this.f26380l = linearLayout;
        this.f26381m = imageView4;
        this.f26382n = tabLayout;
        this.f26383o = view;
        this.f26384p = textView;
        this.f26385q = textView2;
        this.f26386r = viewPager;
    }

    @NonNull
    public static SearchListActivity1Binding bind(@NonNull View view) {
        int i4 = R.id.autoListView;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.autoListView);
        if (listView != null) {
            i4 = R.id.back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
            if (imageView != null) {
                i4 = R.id.classifies;
                TagFlowLayout3 tagFlowLayout3 = (TagFlowLayout3) ViewBindings.findChildViewById(view, R.id.classifies);
                if (tagFlowLayout3 != null) {
                    i4 = R.id.clear;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.clear);
                    if (imageView2 != null) {
                        i4 = R.id.constraintLayout3;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout3);
                        if (constraintLayout != null) {
                            i4 = R.id.constraintLayout6;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout6);
                            if (constraintLayout2 != null) {
                                i4 = R.id.input;
                                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.input);
                                if (editText != null) {
                                    i4 = R.id.iv_filter;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_filter);
                                    if (imageView3 != null) {
                                        i4 = R.id.languages;
                                        TagFlowLayout3 tagFlowLayout32 = (TagFlowLayout3) ViewBindings.findChildViewById(view, R.id.languages);
                                        if (tagFlowLayout32 != null) {
                                            i4 = R.id.ll_filter;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_filter);
                                            if (linearLayout != null) {
                                                i4 = R.id.search;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.search);
                                                if (imageView4 != null) {
                                                    i4 = R.id.tabLayout;
                                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabLayout);
                                                    if (tabLayout != null) {
                                                        i4 = R.id.tagBackground;
                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.tagBackground);
                                                        if (findChildViewById != null) {
                                                            i4 = R.id.tv_filter_close;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_filter_close);
                                                            if (textView != null) {
                                                                i4 = R.id.tv_filter_confirm;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_filter_confirm);
                                                                if (textView2 != null) {
                                                                    i4 = R.id.viewPager;
                                                                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                                                                    if (viewPager != null) {
                                                                        return new SearchListActivity1Binding((ConstraintLayout) view, listView, imageView, tagFlowLayout3, imageView2, constraintLayout, constraintLayout2, editText, imageView3, tagFlowLayout32, linearLayout, imageView4, tabLayout, findChildViewById, textView, textView2, viewPager);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SearchListActivity1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26370b;
    }

    @NonNull
    public static SearchListActivity1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_list_activity1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
