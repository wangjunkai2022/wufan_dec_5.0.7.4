package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class ItemArchiveBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21673b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f21674c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f21675d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f21676e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f21677f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21678g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f21679h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f21680i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f21681j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f21682k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f21683l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f21684m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f21685n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f21686o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f21687p;

    private ItemArchiveBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f21673b = linearLayout;
        this.f21674c = button;
        this.f21675d = button2;
        this.f21676e = imageView;
        this.f21677f = imageView2;
        this.f21678g = linearLayout2;
        this.f21679h = linearLayout3;
        this.f21680i = linearLayout4;
        this.f21681j = linearLayout5;
        this.f21682k = recyclerView;
        this.f21683l = relativeLayout;
        this.f21684m = relativeLayout2;
        this.f21685n = textView;
        this.f21686o = textView2;
        this.f21687p = textView3;
    }

    @NonNull
    public static ItemArchiveBinding bind(@NonNull View view) {
        int i4 = R.id.btn_archive_down;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_archive_down);
        if (button != null) {
            i4 = R.id.btn_cancel;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_cancel);
            if (button2 != null) {
                i4 = R.id.iv_all_select;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_all_select);
                if (imageView != null) {
                    i4 = R.id.iv_redbroadcast;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_redbroadcast);
                    if (imageView2 != null) {
                        i4 = R.id.ll_all_select;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_all_select);
                        if (linearLayout != null) {
                            i4 = R.id.ll_lookdetail;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_lookdetail);
                            if (linearLayout2 != null) {
                                i4 = R.id.ll_nodata;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_nodata);
                                if (linearLayout3 != null) {
                                    i4 = R.id.ll_right;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_right);
                                    if (linearLayout4 != null) {
                                        i4 = R.id.rcy;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcy);
                                        if (recyclerView != null) {
                                            i4 = R.id.rl_showtitle_bc;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_showtitle_bc);
                                            if (relativeLayout != null) {
                                                i4 = R.id.rl_titlebar;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_titlebar);
                                                if (relativeLayout2 != null) {
                                                    i4 = R.id.tv_selectarchive_size;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_selectarchive_size);
                                                    if (textView != null) {
                                                        i4 = R.id.tv_show_nodata;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_nodata);
                                                        if (textView2 != null) {
                                                            i4 = R.id.tv_showtitle_bc;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_showtitle_bc);
                                                            if (textView3 != null) {
                                                                return new ItemArchiveBinding((LinearLayout) view, button, button2, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, recyclerView, relativeLayout, relativeLayout2, textView, textView2, textView3);
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
    public static ItemArchiveBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21673b;
    }

    @NonNull
    public static ItemArchiveBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_archive, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
