package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogDownloadMethodPromptBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18682b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f18683c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f18684d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f18685e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18686f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f18687g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f18688h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18689i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18690j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Group f18691k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f18692l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final View f18693m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ConstraintLayout f18694n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f18695o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f18696p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final View f18697q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ConstraintLayout f18698r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f18699s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f18700t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f18701u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final TextView f18702v;

    private DialogDownloadMethodPromptBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Group group, @NonNull ImageView imageView3, @NonNull View view2, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView4, @NonNull ImageView imageView4, @NonNull View view3, @NonNull ConstraintLayout constraintLayout5, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f18682b = constraintLayout;
        this.f18683c = view;
        this.f18684d = constraintLayout2;
        this.f18685e = constraintLayout3;
        this.f18686f = textView;
        this.f18687g = imageView;
        this.f18688h = imageView2;
        this.f18689i = textView2;
        this.f18690j = textView3;
        this.f18691k = group;
        this.f18692l = imageView3;
        this.f18693m = view2;
        this.f18694n = constraintLayout4;
        this.f18695o = textView4;
        this.f18696p = imageView4;
        this.f18697q = view3;
        this.f18698r = constraintLayout5;
        this.f18699s = textView5;
        this.f18700t = textView6;
        this.f18701u = textView7;
        this.f18702v = textView8;
    }

    @NonNull
    public static DialogDownloadMethodPromptBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.close);
        if (findChildViewById != null) {
            i4 = R.id.constraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout);
            if (constraintLayout != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                i4 = R.id.download;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.download);
                if (textView != null) {
                    i4 = R.id.imageView51;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView51);
                    if (imageView != null) {
                        i4 = R.id.imageView55;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView55);
                        if (imageView2 != null) {
                            i4 = R.id.link;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.link);
                            if (textView2 != null) {
                                i4 = R.id.name;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                if (textView3 != null) {
                                    i4 = R.id.noPrompt;
                                    Group group = (Group) ViewBindings.findChildViewById(view, R.id.noPrompt);
                                    if (group != null) {
                                        i4 = R.id.noPromptCheck;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.noPromptCheck);
                                        if (imageView3 != null) {
                                            i4 = R.id.noPromptCheckPlaceholder;
                                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.noPromptCheckPlaceholder);
                                            if (findChildViewById2 != null) {
                                                i4 = R.id.outside;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.outside);
                                                if (constraintLayout3 != null) {
                                                    i4 = R.id.protocol;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.protocol);
                                                    if (textView4 != null) {
                                                        i4 = R.id.protocolCheck;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.protocolCheck);
                                                        if (imageView4 != null) {
                                                            i4 = R.id.protocolCheckPlaceholder;
                                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.protocolCheckPlaceholder);
                                                            if (findChildViewById3 != null) {
                                                                i4 = R.id.res;
                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.res);
                                                                if (constraintLayout4 != null) {
                                                                    i4 = R.id.subTitle;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.subTitle);
                                                                    if (textView5 != null) {
                                                                        i4 = R.id.textView77;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView77);
                                                                        if (textView6 != null) {
                                                                            i4 = R.id.title;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                            if (textView7 != null) {
                                                                                i4 = R.id.userProtocolTxt;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.userProtocolTxt);
                                                                                if (textView8 != null) {
                                                                                    return new DialogDownloadMethodPromptBinding(constraintLayout2, findChildViewById, constraintLayout, constraintLayout2, textView, imageView, imageView2, textView2, textView3, group, imageView3, findChildViewById2, constraintLayout3, textView4, imageView4, findChildViewById3, constraintLayout4, textView5, textView6, textView7, textView8);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogDownloadMethodPromptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18682b;
    }

    @NonNull
    public static DialogDownloadMethodPromptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_download_method_prompt, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
