package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GbaplugChoiceDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21286b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f21287c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f21288d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f21289e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21290f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21291g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f21292h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final CheckBox f21293i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21294j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21295k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21296l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f21297m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21298n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f21299o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f21300p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f21301q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f21302r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f21303s;

    private GbaplugChoiceDialogLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull CheckBox checkBox3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull LinearLayout linearLayout4) {
        this.f21286b = relativeLayout;
        this.f21287c = checkBox;
        this.f21288d = checkBox2;
        this.f21289e = imageView;
        this.f21290f = linearLayout;
        this.f21291g = linearLayout2;
        this.f21292h = linearLayout3;
        this.f21293i = checkBox3;
        this.f21294j = textView;
        this.f21295k = textView2;
        this.f21296l = textView3;
        this.f21297m = textView4;
        this.f21298n = textView5;
        this.f21299o = textView6;
        this.f21300p = textView7;
        this.f21301q = textView8;
        this.f21302r = textView9;
        this.f21303s = linearLayout4;
    }

    @NonNull
    public static GbaplugChoiceDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.gbaNewPlug;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.gbaNewPlug);
        if (checkBox != null) {
            i4 = R.id.gbaOld;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, R.id.gbaOld);
            if (checkBox2 != null) {
                i4 = R.id.imageView3;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView3);
                if (imageView != null) {
                    i4 = R.id.newGBAOlug;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.newGBAOlug);
                    if (linearLayout != null) {
                        i4 = R.id.oldGBAPlug;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.oldGBAPlug);
                        if (linearLayout2 != null) {
                            i4 = R.id.showdialog;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.showdialog);
                            if (linearLayout3 != null) {
                                i4 = R.id.showdialogPlug;
                                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, R.id.showdialogPlug);
                                if (checkBox3 != null) {
                                    i4 = R.id.textView;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                    if (textView != null) {
                                        i4 = R.id.textView2;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                        if (textView2 != null) {
                                            i4 = R.id.textView3;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                                            if (textView3 != null) {
                                                i4 = R.id.textView4;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView4);
                                                if (textView4 != null) {
                                                    i4 = R.id.textView5;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView5);
                                                    if (textView5 != null) {
                                                        i4 = R.id.textView6;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView6);
                                                        if (textView6 != null) {
                                                            i4 = R.id.textView7;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.textView7);
                                                            if (textView7 != null) {
                                                                i4 = R.id.textView9;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.textView9);
                                                                if (textView8 != null) {
                                                                    i4 = R.id.titleText;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                                                    if (textView9 != null) {
                                                                        i4 = R.id.why;
                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.why);
                                                                        if (linearLayout4 != null) {
                                                                            return new GbaplugChoiceDialogLayoutBinding((RelativeLayout) view, checkBox, checkBox2, imageView, linearLayout, linearLayout2, linearLayout3, checkBox3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, linearLayout4);
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
    public static GbaplugChoiceDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21286b;
    }

    @NonNull
    public static GbaplugChoiceDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gbaplug_choice_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
