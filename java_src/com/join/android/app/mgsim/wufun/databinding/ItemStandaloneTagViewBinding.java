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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemStandaloneTagViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22855b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22856c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22857d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22858e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f22859f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f22860g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f22861h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f22862i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f22863j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22864k;

    private ItemStandaloneTagViewBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView3) {
        this.f22855b = linearLayout;
        this.f22856c = simpleDraweeView;
        this.f22857d = linearLayout2;
        this.f22858e = textView;
        this.f22859f = simpleDraweeView2;
        this.f22860g = linearLayout3;
        this.f22861h = textView2;
        this.f22862i = simpleDraweeView3;
        this.f22863j = linearLayout4;
        this.f22864k = textView3;
    }

    @NonNull
    public static ItemStandaloneTagViewBinding bind(@NonNull View view) {
        int i4 = R.id.standAloneTagOneIv;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.standAloneTagOneIv);
        if (simpleDraweeView != null) {
            i4 = R.id.standAloneTagOneLl;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.standAloneTagOneLl);
            if (linearLayout != null) {
                i4 = R.id.standAloneTagOneTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.standAloneTagOneTv);
                if (textView != null) {
                    i4 = R.id.standAloneTagThreeIv;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.standAloneTagThreeIv);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.standAloneTagThreeLl;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.standAloneTagThreeLl);
                        if (linearLayout2 != null) {
                            i4 = R.id.standAloneTagThreeTv;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.standAloneTagThreeTv);
                            if (textView2 != null) {
                                i4 = R.id.standAloneTagTwoIv;
                                SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.standAloneTagTwoIv);
                                if (simpleDraweeView3 != null) {
                                    i4 = R.id.standAloneTagTwoLl;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.standAloneTagTwoLl);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.standAloneTagTwoTv;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.standAloneTagTwoTv);
                                        if (textView3 != null) {
                                            return new ItemStandaloneTagViewBinding((LinearLayout) view, simpleDraweeView, linearLayout, textView, simpleDraweeView2, linearLayout2, textView2, simpleDraweeView3, linearLayout3, textView3);
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
    public static ItemStandaloneTagViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22855b;
    }

    @NonNull
    public static ItemStandaloneTagViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_standalone_tag_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
