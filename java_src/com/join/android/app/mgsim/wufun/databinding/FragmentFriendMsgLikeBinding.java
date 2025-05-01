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
import com.join.mgps.customview.XListView;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FragmentFriendMsgLikeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19809b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19810c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XListView f19811d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final PtrClassicFrameLayout f19812e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Group f19813f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19814g;

    private FragmentFriendMsgLikeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull XListView xListView, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull Group group, @NonNull TextView textView) {
        this.f19809b = constraintLayout;
        this.f19810c = imageView;
        this.f19811d = xListView;
        this.f19812e = ptrClassicFrameLayout;
        this.f19813f = group;
        this.f19814g = textView;
    }

    @NonNull
    public static FragmentFriendMsgLikeBinding bind(@NonNull View view) {
        int i4 = R.id.imageView62;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView62);
        if (imageView != null) {
            i4 = R.id.listView;
            XListView xListView = (XListView) ViewBindings.findChildViewById(view, R.id.listView);
            if (xListView != null) {
                i4 = R.id.mPtrFrame;
                PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                if (ptrClassicFrameLayout != null) {
                    i4 = R.id.noRecord;
                    Group group = (Group) ViewBindings.findChildViewById(view, R.id.noRecord);
                    if (group != null) {
                        i4 = R.id.textView49;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView49);
                        if (textView != null) {
                            return new FragmentFriendMsgLikeBinding((ConstraintLayout) view, imageView, xListView, ptrClassicFrameLayout, group, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentFriendMsgLikeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19809b;
    }

    @NonNull
    public static FragmentFriendMsgLikeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_friend_msg_like, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
