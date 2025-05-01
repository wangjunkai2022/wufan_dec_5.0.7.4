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
public final class DownloadPathSetDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19185b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19186c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f19187d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CheckBox f19188e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19189f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f19190g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f19191h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19192i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19193j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f19194k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f19195l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f19196m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f19197n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f19198o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final View f19199p;

    private DownloadPathSetDialogLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view) {
        this.f19185b = linearLayout;
        this.f19186c = textView;
        this.f19187d = checkBox;
        this.f19188e = checkBox2;
        this.f19189f = imageView;
        this.f19190g = linearLayout2;
        this.f19191h = relativeLayout;
        this.f19192i = textView2;
        this.f19193j = textView3;
        this.f19194k = linearLayout3;
        this.f19195l = relativeLayout2;
        this.f19196m = textView4;
        this.f19197n = textView5;
        this.f19198o = textView6;
        this.f19199p = view;
    }

    @NonNull
    public static DownloadPathSetDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.changeSdkard;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.changeSdkard);
        if (textView != null) {
            i4 = R.id.checkBoxSd;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkBoxSd);
            if (checkBox != null) {
                i4 = R.id.checkBoxlocal;
                CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkBoxlocal);
                if (checkBox2 != null) {
                    i4 = R.id.imageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                    if (imageView != null) {
                        i4 = R.id.linearLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                        if (linearLayout != null) {
                            i4 = R.id.localPathLayout;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.localPathLayout);
                            if (relativeLayout != null) {
                                i4 = R.id.localpath;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.localpath);
                                if (textView2 != null) {
                                    i4 = R.id.localsize;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.localsize);
                                    if (textView3 != null) {
                                        i4 = R.id.noticelayout;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.noticelayout);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.sdPathLayout;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.sdPathLayout);
                                            if (relativeLayout2 != null) {
                                                i4 = R.id.sdSize;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.sdSize);
                                                if (textView4 != null) {
                                                    i4 = R.id.sdpath;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.sdpath);
                                                    if (textView5 != null) {
                                                        i4 = R.id.textView;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                                        if (textView6 != null) {
                                                            i4 = R.id.textView2;
                                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.textView2);
                                                            if (findChildViewById != null) {
                                                                return new DownloadPathSetDialogLayoutBinding((LinearLayout) view, textView, checkBox, checkBox2, imageView, linearLayout, relativeLayout, textView2, textView3, linearLayout2, relativeLayout2, textView4, textView5, textView6, findChildViewById);
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
    public static DownloadPathSetDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19185b;
    }

    @NonNull
    public static DownloadPathSetDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_path_set_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
