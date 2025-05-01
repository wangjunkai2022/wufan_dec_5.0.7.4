package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomEdittext;
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class ActivityPostingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f16768b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f16769c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f16770d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f16771e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f16772f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f16773g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f16774h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f16775i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f16776j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f16777k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final EditText f16778l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final HListView f16779m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final View f16780n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final CustomEdittext f16781o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final CustomEdittext f16782p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final RelativeLayout f16783q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TopbarPostingLayoutBinding f16784r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f16785s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f16786t;

    private ActivityPostingBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout2, @NonNull EditText editText, @NonNull HListView hListView, @NonNull View view, @NonNull CustomEdittext customEdittext, @NonNull CustomEdittext customEdittext2, @NonNull RelativeLayout relativeLayout3, @NonNull TopbarPostingLayoutBinding topbarPostingLayoutBinding, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f16768b = relativeLayout;
        this.f16769c = button;
        this.f16770d = button2;
        this.f16771e = linearLayout;
        this.f16772f = frameLayout;
        this.f16773g = frameLayout2;
        this.f16774h = frameLayout3;
        this.f16775i = linearLayout2;
        this.f16776j = linearLayout3;
        this.f16777k = relativeLayout2;
        this.f16778l = editText;
        this.f16779m = hListView;
        this.f16780n = view;
        this.f16781o = customEdittext;
        this.f16782p = customEdittext2;
        this.f16783q = relativeLayout3;
        this.f16784r = topbarPostingLayoutBinding;
        this.f16785s = textView;
        this.f16786t = textView2;
    }

    @NonNull
    public static ActivityPostingBinding bind(@NonNull View view) {
        int i4 = R.id.btn_selectedCoins;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_selectedCoins);
        if (button != null) {
            i4 = R.id.btn_selectedGames;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_selectedGames);
            if (button2 != null) {
                i4 = R.id.editMainContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.editMainContainer);
                if (linearLayout != null) {
                    i4 = R.id.fl_insert_label;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_insert_label);
                    if (frameLayout != null) {
                        i4 = R.id.fl_insert_pic;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_insert_pic);
                        if (frameLayout2 != null) {
                            i4 = R.id.fl_posting_type_container;
                            FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_posting_type_container);
                            if (frameLayout3 != null) {
                                i4 = R.id.ll_bottom;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_bottom);
                                if (linearLayout2 != null) {
                                    i4 = R.id.ll_help_posting;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_help_posting);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.ll_posting_rec_game;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_posting_rec_game);
                                        if (relativeLayout != null) {
                                            i4 = R.id.posts_content;
                                            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.posts_content);
                                            if (editText != null) {
                                                i4 = R.id.posts_pic_hlist;
                                                HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.posts_pic_hlist);
                                                if (hListView != null) {
                                                    i4 = R.id.posts_res_line;
                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.posts_res_line);
                                                    if (findChildViewById != null) {
                                                        i4 = R.id.posts_res_link;
                                                        CustomEdittext customEdittext = (CustomEdittext) ViewBindings.findChildViewById(view, R.id.posts_res_link);
                                                        if (customEdittext != null) {
                                                            i4 = R.id.posts_title;
                                                            CustomEdittext customEdittext2 = (CustomEdittext) ViewBindings.findChildViewById(view, R.id.posts_title);
                                                            if (customEdittext2 != null) {
                                                                i4 = R.id.rl_main;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_main);
                                                                if (relativeLayout2 != null) {
                                                                    i4 = R.id.title;
                                                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.title);
                                                                    if (findChildViewById2 != null) {
                                                                        TopbarPostingLayoutBinding bind = TopbarPostingLayoutBinding.bind(findChildViewById2);
                                                                        i4 = R.id.tv_coins;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_coins);
                                                                        if (textView != null) {
                                                                            i4 = R.id.tv_rec_game;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_rec_game);
                                                                            if (textView2 != null) {
                                                                                return new ActivityPostingBinding((RelativeLayout) view, button, button2, linearLayout, frameLayout, frameLayout2, frameLayout3, linearLayout2, linearLayout3, relativeLayout, editText, hListView, findChildViewById, customEdittext, customEdittext2, relativeLayout2, bind, textView, textView2);
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
    public static ActivityPostingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f16768b;
    }

    @NonNull
    public static ActivityPostingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_posting, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
