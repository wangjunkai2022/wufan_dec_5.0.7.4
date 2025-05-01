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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityHavenDownBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16491b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f16492c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16493d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f16494e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f16495f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16496g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f16497h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16498i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16499j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f16500k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f16501l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f16502m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f16503n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RecyclerView f16504o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f16505p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f16506q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f16507r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final View f16508s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final View f16509t;

    private ActivityHavenDownBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout3, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout4, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull View view, @NonNull View view2) {
        this.f16491b = relativeLayout;
        this.f16492c = textView;
        this.f16493d = textView2;
        this.f16494e = imageView;
        this.f16495f = linearLayout;
        this.f16496g = textView3;
        this.f16497h = linearLayout2;
        this.f16498i = textView4;
        this.f16499j = textView5;
        this.f16500k = imageView2;
        this.f16501l = relativeLayout2;
        this.f16502m = linearLayout3;
        this.f16503n = relativeLayout3;
        this.f16504o = recyclerView;
        this.f16505p = linearLayout4;
        this.f16506q = textView6;
        this.f16507r = textView7;
        this.f16508s = view;
        this.f16509t = view2;
    }

    @NonNull
    public static ActivityHavenDownBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.back1;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.back1);
            if (textView2 != null) {
                i4 = R.id.closeImage1;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closeImage1);
                if (imageView != null) {
                    i4 = R.id.downFrom;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downFrom);
                    if (linearLayout != null) {
                        i4 = R.id.downFromText;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.downFromText);
                        if (textView3 != null) {
                            i4 = R.id.forumData;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forumData);
                            if (linearLayout2 != null) {
                                i4 = R.id.goVow;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.goVow);
                                if (textView4 != null) {
                                    i4 = R.id.goforumTagList;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.goforumTagList);
                                    if (textView5 != null) {
                                        i4 = R.id.imageView54;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView54);
                                        if (imageView2 != null) {
                                            i4 = R.id.layoutq;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layoutq);
                                            if (relativeLayout != null) {
                                                i4 = R.id.linearLayoutx;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayoutx);
                                                if (linearLayout3 != null) {
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                    i4 = R.id.recycleView;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recycleView);
                                                    if (recyclerView != null) {
                                                        i4 = R.id.showView;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.showView);
                                                        if (linearLayout4 != null) {
                                                            i4 = R.id.textView62;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView62);
                                                            if (textView6 != null) {
                                                                i4 = R.id.title1;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.title1);
                                                                if (textView7 != null) {
                                                                    i4 = R.id.topLayout;
                                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.topLayout);
                                                                    if (findChildViewById != null) {
                                                                        i4 = R.id.view6;
                                                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view6);
                                                                        if (findChildViewById2 != null) {
                                                                            return new ActivityHavenDownBinding(relativeLayout2, textView, textView2, imageView, linearLayout, textView3, linearLayout2, textView4, textView5, imageView2, relativeLayout, linearLayout3, relativeLayout2, recyclerView, linearLayout4, textView6, textView7, findChildViewById, findChildViewById2);
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
    public static ActivityHavenDownBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16491b;
    }

    @NonNull
    public static ActivityHavenDownBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_haven_down, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
