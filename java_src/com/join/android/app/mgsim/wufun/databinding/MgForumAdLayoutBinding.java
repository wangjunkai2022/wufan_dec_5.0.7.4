package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumAdLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23780b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TableLayout f23781c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23782d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f23783e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f23784f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f23785g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f23786h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f23787i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f23788j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f23789k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f23790l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f23791m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f23792n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f23793o;

    private MgForumAdLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TableLayout tableLayout, @NonNull TextView textView, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView2) {
        this.f23780b = relativeLayout;
        this.f23781c = tableLayout;
        this.f23782d = textView;
        this.f23783e = view;
        this.f23784f = simpleDraweeView;
        this.f23785g = simpleDraweeView2;
        this.f23786h = simpleDraweeView3;
        this.f23787i = simpleDraweeView4;
        this.f23788j = linearLayout;
        this.f23789k = linearLayout2;
        this.f23790l = linearLayout3;
        this.f23791m = relativeLayout2;
        this.f23792n = relativeLayout3;
        this.f23793o = textView2;
    }

    @NonNull
    public static MgForumAdLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.forum_ad_container;
        TableLayout tableLayout = (TableLayout) ViewBindings.findChildViewById(view, R.id.forum_ad_container);
        if (tableLayout != null) {
            i4 = R.id.forum_ad_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_ad_title);
            if (textView != null) {
                i4 = R.id.guide;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.guide);
                if (findChildViewById != null) {
                    i4 = R.id.layout_forum_ad_1;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.layout_forum_ad_1);
                    if (simpleDraweeView != null) {
                        i4 = R.id.layout_forum_ad_2;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.layout_forum_ad_2);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.layout_forum_ad_3;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.layout_forum_ad_3);
                            if (simpleDraweeView3 != null) {
                                i4 = R.id.layout_forum_ad_4;
                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.layout_forum_ad_4);
                                if (simpleDraweeView4 != null) {
                                    i4 = R.id.layout_forum_ad_row1;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_forum_ad_row1);
                                    if (linearLayout != null) {
                                        i4 = R.id.layout_forum_ad_row2;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_forum_ad_row2);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.layout_forum_ad_title;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_forum_ad_title);
                                            if (linearLayout3 != null) {
                                                i4 = R.id.relati_layout_forum_ad_title;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relati_layout_forum_ad_title);
                                                if (relativeLayout != null) {
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                    i4 = R.id.textView9;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView9);
                                                    if (textView2 != null) {
                                                        return new MgForumAdLayoutBinding(relativeLayout2, tableLayout, textView, findChildViewById, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, simpleDraweeView4, linearLayout, linearLayout2, linearLayout3, relativeLayout, relativeLayout2, textView2);
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
    public static MgForumAdLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23780b;
    }

    @NonNull
    public static MgForumAdLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_ad_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
