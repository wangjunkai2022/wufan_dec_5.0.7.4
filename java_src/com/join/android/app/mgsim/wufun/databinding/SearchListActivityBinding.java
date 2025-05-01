package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.zhy.view.flowlayout.TagFlowLayout2;
/* loaded from: classes3.dex */
public final class SearchListActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26387b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26388c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ListView f26389d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26390e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26391f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f26392g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TagFlowLayout2 f26393h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TagFlowLayout2 f26394i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f26395j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f26396k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26397l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f26398m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final EditText f26399n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f26400o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final XListView2 f26401p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26402q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ScrollView f26403r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f26404s;

    private SearchListActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ListView listView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull TagFlowLayout2 tagFlowLayout2, @NonNull TagFlowLayout2 tagFlowLayout22, @NonNull View view, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull EditText editText, @NonNull LinearLayout linearLayout, @NonNull XListView2 xListView2, @NonNull TextView textView3, @NonNull ScrollView scrollView, @NonNull TextView textView4) {
        this.f26387b = relativeLayout;
        this.f26388c = textView;
        this.f26389d = listView;
        this.f26390e = imageView;
        this.f26391f = imageView2;
        this.f26392g = relativeLayout2;
        this.f26393h = tagFlowLayout2;
        this.f26394i = tagFlowLayout22;
        this.f26395j = view;
        this.f26396k = relativeLayout3;
        this.f26397l = textView2;
        this.f26398m = imageView3;
        this.f26399n = editText;
        this.f26400o = linearLayout;
        this.f26401p = xListView2;
        this.f26402q = textView3;
        this.f26403r = scrollView;
        this.f26404s = textView4;
    }

    @NonNull
    public static SearchListActivityBinding bind(@NonNull View view) {
        int i4 = R.id.empty;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.empty);
        if (textView != null) {
            i4 = R.id.historyListView;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.historyListView);
            if (listView != null) {
                i4 = R.id.img_iconback;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_iconback);
                if (imageView != null) {
                    i4 = R.id.img_search;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_search);
                    if (imageView2 != null) {
                        i4 = R.id.lLayout_search;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.lLayout_search);
                        if (relativeLayout != null) {
                            i4 = R.id.language;
                            TagFlowLayout2 tagFlowLayout2 = (TagFlowLayout2) ViewBindings.findChildViewById(view, R.id.language);
                            if (tagFlowLayout2 != null) {
                                i4 = R.id.pingtai;
                                TagFlowLayout2 tagFlowLayout22 = (TagFlowLayout2) ViewBindings.findChildViewById(view, R.id.pingtai);
                                if (tagFlowLayout22 != null) {
                                    i4 = R.id.requestLayout;
                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.requestLayout);
                                    if (findChildViewById != null) {
                                        i4 = R.id.search_bar_layout;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.search_bar_layout);
                                        if (relativeLayout2 != null) {
                                            i4 = R.id.searchBySelector;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.searchBySelector);
                                            if (textView2 != null) {
                                                i4 = R.id.searchClear;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.searchClear);
                                                if (imageView3 != null) {
                                                    i4 = R.id.searchEditText;
                                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.searchEditText);
                                                    if (editText != null) {
                                                        i4 = R.id.search_list_fragment;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.search_list_fragment);
                                                        if (linearLayout != null) {
                                                            i4 = R.id.searchListView;
                                                            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.searchListView);
                                                            if (xListView2 != null) {
                                                                i4 = R.id.select;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.select);
                                                                if (textView3 != null) {
                                                                    i4 = R.id.select_view;
                                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.select_view);
                                                                    if (scrollView != null) {
                                                                        i4 = R.id.topNull;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.topNull);
                                                                        if (textView4 != null) {
                                                                            return new SearchListActivityBinding((RelativeLayout) view, textView, listView, imageView, imageView2, relativeLayout, tagFlowLayout2, tagFlowLayout22, findChildViewById, relativeLayout2, textView2, imageView3, editText, linearLayout, xListView2, textView3, scrollView, textView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SearchListActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26387b;
    }

    @NonNull
    public static SearchListActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_list_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
