package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumPopupwindowLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23999b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f24000c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f24001d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f24002e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f24003f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f24004g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f24005h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f24006i;

    private MgForumPopupwindowLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f23999b = relativeLayout;
        this.f24000c = button;
        this.f24001d = button2;
        this.f24002e = button3;
        this.f24003f = button4;
        this.f24004g = view;
        this.f24005h = view2;
        this.f24006i = view3;
    }

    @NonNull
    public static MgForumPopupwindowLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.btn_forum_comment;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_forum_comment);
        if (button != null) {
            i4 = R.id.btn_forum_comment_copy;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_forum_comment_copy);
            if (button2 != null) {
                i4 = R.id.btn_forum_comment_delete;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_forum_comment_delete);
                if (button3 != null) {
                    i4 = R.id.btn_forum_report;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.btn_forum_report);
                    if (button4 != null) {
                        i4 = R.id.divider_2;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider_2);
                        if (findChildViewById != null) {
                            i4 = R.id.divider_forum_comment_1;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.divider_forum_comment_1);
                            if (findChildViewById2 != null) {
                                i4 = R.id.divider_forum_comment_2;
                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.divider_forum_comment_2);
                                if (findChildViewById3 != null) {
                                    return new MgForumPopupwindowLayoutBinding((RelativeLayout) view, button, button2, button3, button4, findChildViewById, findChildViewById2, findChildViewById3);
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
    public static MgForumPopupwindowLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23999b;
    }

    @NonNull
    public static MgForumPopupwindowLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_popupwindow_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
