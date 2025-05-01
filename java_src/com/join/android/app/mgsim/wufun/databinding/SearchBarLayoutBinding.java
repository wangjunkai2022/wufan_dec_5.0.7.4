package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SearchBarLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26323b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f26324c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26325d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26326e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f26327f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f26328g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26329h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final EditText f26330i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26331j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ViewPager2 f26332k;

    private SearchBarLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull View view2, @NonNull ImageView imageView3, @NonNull EditText editText, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.f26323b = relativeLayout;
        this.f26324c = view;
        this.f26325d = imageView;
        this.f26326e = imageView2;
        this.f26327f = relativeLayout2;
        this.f26328g = view2;
        this.f26329h = imageView3;
        this.f26330i = editText;
        this.f26331j = textView;
        this.f26332k = viewPager2;
    }

    @NonNull
    public static SearchBarLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            i4 = R.id.img_iconback;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_iconback);
            if (imageView != null) {
                i4 = R.id.img_search;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_search);
                if (imageView2 != null) {
                    i4 = R.id.lLayout_search;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.lLayout_search);
                    if (relativeLayout != null) {
                        i4 = R.id.requestLayout;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.requestLayout);
                        if (findChildViewById2 != null) {
                            i4 = R.id.searchClear;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.searchClear);
                            if (imageView3 != null) {
                                i4 = R.id.searchEditText;
                                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.searchEditText);
                                if (editText != null) {
                                    i4 = R.id.tv_search;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_search);
                                    if (textView != null) {
                                        i4 = R.id.vf;
                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.vf);
                                        if (viewPager2 != null) {
                                            return new SearchBarLayoutBinding((RelativeLayout) view, findChildViewById, imageView, imageView2, relativeLayout, findChildViewById2, imageView3, editText, textView, viewPager2);
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
    public static SearchBarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26323b;
    }

    @NonNull
    public static SearchBarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_bar_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
