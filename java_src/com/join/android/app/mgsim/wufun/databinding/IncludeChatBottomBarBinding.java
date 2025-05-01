package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
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
public final class IncludeChatBottomBarBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21533b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f21534c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f21535d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f21536e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21537f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final IncludeChatAddBinding f21538g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f21539h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f21540i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21541j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ClearEditText f21542k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final HListView f21543l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ViewPager f21544m;

    private IncludeChatBottomBarBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull LinearLayout linearLayout2, @NonNull IncludeChatAddBinding includeChatAddBinding, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull ClearEditText clearEditText, @NonNull HListView hListView, @NonNull ViewPager viewPager) {
        this.f21533b = linearLayout;
        this.f21534c = button;
        this.f21535d = button2;
        this.f21536e = button3;
        this.f21537f = linearLayout2;
        this.f21538g = includeChatAddBinding;
        this.f21539h = linearLayout3;
        this.f21540i = linearLayout4;
        this.f21541j = textView;
        this.f21542k = clearEditText;
        this.f21543l = hListView;
        this.f21544m = viewPager;
    }

    @NonNull
    public static IncludeChatBottomBarBinding bind(@NonNull View view) {
        int i4 = R.id.btn_chat_extension;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_chat_extension);
        if (button != null) {
            i4 = R.id.btn_chat_praise;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_chat_praise);
            if (button2 != null) {
                i4 = R.id.btn_chat_send;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_chat_send);
                if (button3 != null) {
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
                                            i4 = R.id.matchListView;
                                            HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.matchListView);
                                            if (hListView != null) {
                                                i4 = R.id.pager_emo;
                                                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.pager_emo);
                                                if (viewPager != null) {
                                                    return new IncludeChatBottomBarBinding((LinearLayout) view, button, button2, button3, linearLayout, bind, linearLayout2, linearLayout3, textView, clearEditText, hListView, viewPager);
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
    public static IncludeChatBottomBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21533b;
    }

    @NonNull
    public static IncludeChatBottomBarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.include_chat_bottom_bar, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
