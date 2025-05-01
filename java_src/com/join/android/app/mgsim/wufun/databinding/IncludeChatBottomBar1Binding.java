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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.common.view.ClearEditText;
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class IncludeChatBottomBar1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21518b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f21519c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f21520d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f21521e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f21522f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21523g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final IncludeChatAddBinding f21524h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f21525i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f21526j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21527k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ClearEditText f21528l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f21529m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final HListView f21530n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ViewPager f21531o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f21532p;

    private IncludeChatBottomBar1Binding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull LinearLayout linearLayout2, @NonNull IncludeChatAddBinding includeChatAddBinding, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull ClearEditText clearEditText, @NonNull ImageView imageView, @NonNull HListView hListView, @NonNull ViewPager viewPager, @NonNull RelativeLayout relativeLayout) {
        this.f21518b = linearLayout;
        this.f21519c = button;
        this.f21520d = button2;
        this.f21521e = button3;
        this.f21522f = button4;
        this.f21523g = linearLayout2;
        this.f21524h = includeChatAddBinding;
        this.f21525i = linearLayout3;
        this.f21526j = linearLayout4;
        this.f21527k = textView;
        this.f21528l = clearEditText;
        this.f21529m = imageView;
        this.f21530n = hListView;
        this.f21531o = viewPager;
        this.f21532p = relativeLayout;
    }

    @NonNull
    public static IncludeChatBottomBar1Binding bind(@NonNull View view) {
        int i4 = R.id.btn_chat_extension;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_chat_extension);
        if (button != null) {
            i4 = R.id.btn_chat_praise;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_chat_praise);
            if (button2 != null) {
                i4 = R.id.btn_chat_send;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_chat_send);
                if (button3 != null) {
                    i4 = R.id.btn_chat_star;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.btn_chat_star);
                    if (button4 != null) {
                        i4 = R.id.chat_layout_emo;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.chat_layout_emo);
                        if (linearLayout != null) {
                            i4 = R.id.chat_layout_extension;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.chat_layout_extension);
                            if (findChildViewById != null) {
                                IncludeChatAddBinding bind = IncludeChatAddBinding.bind(findChildViewById);
                                i4 = R.id.chat_layout_extension_container;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.chat_layout_extension_container);
                                if (linearLayout2 != null) {
                                    i4 = R.id.chat_layout_more;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.chat_layout_more);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.edit_comment_count;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.edit_comment_count);
                                        if (textView != null) {
                                            i4 = R.id.edit_user_comment;
                                            ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, R.id.edit_user_comment);
                                            if (clearEditText != null) {
                                                i4 = R.id.iv_comment_count;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_comment_count);
                                                if (imageView != null) {
                                                    i4 = R.id.matchListView;
                                                    HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.matchListView);
                                                    if (hListView != null) {
                                                        i4 = R.id.pager_emo;
                                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.pager_emo);
                                                        if (viewPager != null) {
                                                            i4 = R.id.rl_comment_count;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_comment_count);
                                                            if (relativeLayout != null) {
                                                                return new IncludeChatBottomBar1Binding((LinearLayout) view, button, button2, button3, button4, linearLayout, bind, linearLayout2, linearLayout3, textView, clearEditText, imageView, hListView, viewPager, relativeLayout);
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
    public static IncludeChatBottomBar1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21518b;
    }

    @NonNull
    public static IncludeChatBottomBar1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.include_chat_bottom_bar1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
