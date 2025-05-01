package com.join.android.app.mgsim.wufun.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.discount.model.bean.CommentDetailBean;
import com.join.kotlin.discount.proxy.ItemGameDetailCommentListClickProxy;
import com.join.mgps.customview.CollapsedTextView;
/* loaded from: classes3.dex */
public class ItemGameDetailCommentLayoutBindingImpl extends ItemGameDetailCommentLayoutBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f22224s = null;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private static final SparseIntArray f22225t;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    private final ConstraintLayout f22226m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final TextView f22227n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final LinearLayout f22228o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private final View.OnClickListener f22229p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private final View.OnClickListener f22230q;

    /* renamed from: r  reason: collision with root package name */
    private long f22231r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22225t = sparseIntArray;
        sparseIntArray.put(R.id.divider, 8);
        sparseIntArray.put(R.id.tagMonthCardUser, 9);
        sparseIntArray.put(R.id.tagChargedUser, 10);
        sparseIntArray.put(R.id.tagPlayTime, 11);
    }

    public ItemGameDetailCommentLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, f22224s, f22225t));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            CommentDetailBean commentDetailBean = this.f22222k;
            ItemGameDetailCommentListClickProxy itemGameDetailCommentListClickProxy = this.f22223l;
            if (itemGameDetailCommentListClickProxy != null) {
                itemGameDetailCommentListClickProxy.like(commentDetailBean);
            }
        } else if (i4 != 2) {
        } else {
            CommentDetailBean commentDetailBean2 = this.f22222k;
            ItemGameDetailCommentListClickProxy itemGameDetailCommentListClickProxy2 = this.f22223l;
            if (itemGameDetailCommentListClickProxy2 != null) {
                itemGameDetailCommentListClickProxy2.like(commentDetailBean2);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        Drawable drawable;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        Boolean bool;
        synchronized (this) {
            j4 = this.f22231r;
            this.f22231r = 0L;
        }
        CommentDetailBean commentDetailBean = this.f22222k;
        long j5 = j4 & 5;
        if (j5 != 0) {
            if (commentDetailBean != null) {
                str2 = commentDetailBean.getShow_time();
                str3 = commentDetailBean.getNickname();
                num = commentDetailBean.getLike();
                bool = commentDetailBean.getMy_like();
                str5 = commentDetailBean.getContent();
                str = commentDetailBean.getAvatar();
            } else {
                str = null;
                str2 = null;
                str3 = null;
                num = null;
                bool = null;
                str5 = null;
            }
            str4 = num != null ? num.toString() : null;
            boolean safeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j5 != 0) {
                j4 |= safeUnbox ? 16L : 8L;
            }
            drawable = AppCompatResources.getDrawable(this.f22217f.getContext(), safeUnbox ? R.drawable.ic_comment_like : R.drawable.ic_comment_unlike);
        } else {
            str = null;
            drawable = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        if ((5 & j4) != 0) {
            SimpleDrawableViewKt.loadUrl(this.f22213b, str, null, 0);
            TextViewBindingAdapter.setText(this.f22214c, str5);
            TextViewBindingAdapter.setText(this.f22216e, str4);
            ImageViewBindingAdapter.setImageDrawable(this.f22217f, drawable);
            TextViewBindingAdapter.setText(this.f22227n, str3);
            TextViewBindingAdapter.setText(this.f22221j, str2);
        }
        if ((j4 & 4) != 0) {
            this.f22217f.setOnClickListener(this.f22229p);
            this.f22228o.setOnClickListener(this.f22230q);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemGameDetailCommentLayoutBinding
    public void g(@Nullable ItemGameDetailCommentListClickProxy itemGameDetailCommentListClickProxy) {
        this.f22223l = itemGameDetailCommentListClickProxy;
        synchronized (this) {
            this.f22231r |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemGameDetailCommentLayoutBinding
    public void h(@Nullable CommentDetailBean commentDetailBean) {
        this.f22222k = commentDetailBean;
        synchronized (this) {
            this.f22231r |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f22231r != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f22231r = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (18 == i4) {
            h((CommentDetailBean) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((ItemGameDetailCommentListClickProxy) obj);
        }
        return true;
    }

    private ItemGameDetailCommentLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleDraweeView) objArr[1], (CollapsedTextView) objArr[3], (View) objArr[8], (TextView) objArr[7], (ImageView) objArr[6], (ImageView) objArr[10], (ImageView) objArr[9], (TextView) objArr[11], (TextView) objArr[4]);
        this.f22231r = -1L;
        this.f22213b.setTag(null);
        this.f22214c.setTag(null);
        this.f22216e.setTag(null);
        this.f22217f.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22226m = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f22227n = textView;
        textView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[5];
        this.f22228o = linearLayout;
        linearLayout.setTag(null);
        this.f22221j.setTag(null);
        setRootTag(view);
        this.f22229p = new a(this, 2);
        this.f22230q = new a(this, 1);
        invalidateAll();
    }
}
