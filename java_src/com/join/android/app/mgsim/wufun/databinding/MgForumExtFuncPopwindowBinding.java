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
/* loaded from: classes3.dex */
public final class MgForumExtFuncPopwindowBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23810b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23811c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23812d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23813e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f23814f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f23815g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23816h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f23817i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f23818j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f23819k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f23820l;

    private MgForumExtFuncPopwindowBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView2, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8, @NonNull TextView textView3) {
        this.f23810b = linearLayout;
        this.f23811c = linearLayout2;
        this.f23812d = textView;
        this.f23813e = linearLayout3;
        this.f23814f = linearLayout4;
        this.f23815g = linearLayout5;
        this.f23816h = textView2;
        this.f23817i = linearLayout6;
        this.f23818j = linearLayout7;
        this.f23819k = linearLayout8;
        this.f23820l = textView3;
    }

    @NonNull
    public static MgForumExtFuncPopwindowBinding bind(@NonNull View view) {
        int i4 = R.id.extFuncBest;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.extFuncBest);
        if (linearLayout != null) {
            i4 = R.id.extFuncBestTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.extFuncBestTv);
            if (textView != null) {
                i4 = R.id.extFuncCancel;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.extFuncCancel);
                if (linearLayout2 != null) {
                    i4 = R.id.extFuncDelete;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.extFuncDelete);
                    if (linearLayout3 != null) {
                        i4 = R.id.extFuncFavorite;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.extFuncFavorite);
                        if (linearLayout4 != null) {
                            i4 = R.id.extFuncFavoriteTv;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.extFuncFavoriteTv);
                            if (textView2 != null) {
                                i4 = R.id.extFuncReply;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.extFuncReply);
                                if (linearLayout5 != null) {
                                    i4 = R.id.extFuncReport;
                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.extFuncReport);
                                    if (linearLayout6 != null) {
                                        i4 = R.id.extFuncShare;
                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.extFuncShare);
                                        if (linearLayout7 != null) {
                                            i4 = R.id.extFuncShareTv;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.extFuncShareTv);
                                            if (textView3 != null) {
                                                return new MgForumExtFuncPopwindowBinding((LinearLayout) view, linearLayout, textView, linearLayout2, linearLayout3, linearLayout4, textView2, linearLayout5, linearLayout6, linearLayout7, textView3);
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
    public static MgForumExtFuncPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23810b;
    }

    @NonNull
    public static MgForumExtFuncPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_ext_func_popwindow, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
