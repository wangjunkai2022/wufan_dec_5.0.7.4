package com.join.android.app.mgsim.wufun.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.bindingadapter.ViewBindingDownloadViewKt;
import com.join.kotlin.bindingadapter.ViewBindingFresscoImageKt;
import com.join.kotlin.bindingadapter.ViewBindingTextviewKt;
import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.kotlin.ui.userrecom.UserRecomTagView;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.DownloadViewStroke;
import com.join.mgps.dto.TipBean;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class UserRecomendListitemBindingImpl extends UserRecomendListitemBinding {
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f26890r = null;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private static final SparseIntArray f26891s;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final ConstraintLayout f26892n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final TextView f26893o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private final UserRecomTagView f26894p;

    /* renamed from: q  reason: collision with root package name */
    private long f26895q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26891s = sparseIntArray;
        sparseIntArray.put(R.id.gameName, 12);
    }

    public UserRecomendListitemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f26890r, f26891s));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        ArrayList<TipBean> arrayList;
        String str2;
        String str3;
        CollectionBeanSubBusiness collectionBeanSubBusiness;
        String str4;
        ArrayList<TipBean> arrayList2;
        String str5;
        String str6;
        int i4;
        int i5;
        String str7;
        int i6;
        int i7;
        int i8;
        String str8;
        int i9;
        int i10;
        int i11;
        String str9;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String str10;
        int i12;
        boolean z9;
        synchronized (this) {
            j4 = this.f26895q;
            this.f26895q = 0L;
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness2 = this.f26888l;
        AppListItemShowBean appListItemShowBean = this.f26889m;
        if ((j4 & 5) == 0 || collectionBeanSubBusiness2 == null) {
            str = null;
            arrayList = null;
            str2 = null;
            str3 = null;
        } else {
            str = collectionBeanSubBusiness2.getGame_name();
            arrayList = collectionBeanSubBusiness2.getTag_info();
            str2 = collectionBeanSubBusiness2.getIco_remote();
            str3 = collectionBeanSubBusiness2.getInfo();
        }
        long j5 = j4 & 6;
        if (j5 != 0) {
            if (appListItemShowBean != null) {
                boolean giftShow = appListItemShowBean.getGiftShow();
                String lodingInfo = appListItemShowBean.getLodingInfo();
                z5 = appListItemShowBean.getProgressZipShow();
                z6 = appListItemShowBean.getDescribeShow();
                z7 = appListItemShowBean.getDownMessageShow();
                z8 = appListItemShowBean.getTagshow();
                str10 = appListItemShowBean.getAppSizeText();
                i12 = appListItemShowBean.getDownloadProgress();
                z9 = appListItemShowBean.getProgresShow();
                i5 = appListItemShowBean.getZipProgress();
                z4 = giftShow;
                str9 = lodingInfo;
            } else {
                i5 = 0;
                str9 = null;
                z4 = false;
                z5 = false;
                z6 = false;
                z7 = false;
                z8 = false;
                str10 = null;
                i12 = 0;
                z9 = false;
            }
            if (j5 != 0) {
                j4 |= z4 ? 64L : 32L;
            }
            if ((j4 & 6) != 0) {
                j4 |= z5 ? 16L : 8L;
            }
            if ((j4 & 6) != 0) {
                j4 |= z6 ? 1024L : 512L;
            }
            if ((j4 & 6) != 0) {
                j4 |= z7 ? 16384L : 8192L;
            }
            if ((j4 & 6) != 0) {
                j4 |= z8 ? 256L : 128L;
            }
            if ((j4 & 6) != 0) {
                j4 |= z9 ? 4096L : 2048L;
            }
            int i13 = z4 ? 0 : 8;
            int i14 = z5 ? 0 : 8;
            int i15 = z6 ? 0 : 8;
            int i16 = z7 ? 0 : 8;
            int i17 = z8 ? 0 : 8;
            collectionBeanSubBusiness = collectionBeanSubBusiness2;
            i6 = z9 ? 0 : 8;
            str7 = str9;
            i4 = i17;
            str8 = str10;
            str5 = str2;
            i11 = i14;
            i9 = i16;
            arrayList2 = arrayList;
            str6 = str3;
            i8 = i13;
            i10 = i15;
            str4 = str;
            i7 = i12;
        } else {
            collectionBeanSubBusiness = collectionBeanSubBusiness2;
            str4 = str;
            arrayList2 = arrayList;
            str5 = str2;
            str6 = str3;
            i4 = 0;
            i5 = 0;
            str7 = null;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            str8 = null;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if ((6 & j4) != 0) {
            TextViewBindingAdapter.setText(this.f26878b, str8);
            this.f26881e.setVisibility(i10);
            this.f26883g.setVisibility(i8);
            this.f26884h.setVisibility(i9);
            TextViewBindingAdapter.setText(this.f26885i, str7);
            this.f26894p.setVisibility(i4);
            this.f26886j.setProgress(i7);
            this.f26886j.setVisibility(i6);
            this.f26887k.setProgress(i5);
            this.f26887k.setVisibility(i11);
        }
        if ((j4 & 5) != 0) {
            ViewBindingDownloadViewKt.downloadVIewBinding(this.f26879c, collectionBeanSubBusiness, 0);
            ViewBindingFresscoImageKt.simpleDraweeViewBinding(this.f26880d, str5);
            ViewBindingTextviewKt.textViewBinding(this.f26881e, str6);
            TextViewBindingAdapter.setText(this.f26893o, str4);
            this.f26894p.setDatas(arrayList2);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.UserRecomendListitemBinding
    public void g(@Nullable CollectionBeanSubBusiness collectionBeanSubBusiness) {
        this.f26888l = collectionBeanSubBusiness;
        synchronized (this) {
            this.f26895q |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.UserRecomendListitemBinding
    public void h(@Nullable AppListItemShowBean appListItemShowBean) {
        this.f26889m = appListItemShowBean;
        synchronized (this) {
            this.f26895q |= 2;
        }
        notifyPropertyChanged(19);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f26895q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f26895q = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (3 == i4) {
            g((CollectionBeanSubBusiness) obj);
        } else if (19 != i4) {
            return false;
        } else {
            h((AppListItemShowBean) obj);
        }
        return true;
    }

    private UserRecomendListitemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[7], (DownloadViewStroke) objArr[11], (SimpleDraweeView) objArr[1], (TextView) objArr[5], (LinearLayout) objArr[12], (ImageView) objArr[2], (LinearLayout) objArr[6], (TextView) objArr[8], (ProgressBar) objArr[10], (ProgressBar) objArr[9]);
        this.f26895q = -1L;
        this.f26878b.setTag(null);
        this.f26879c.setTag(null);
        this.f26880d.setTag(null);
        this.f26881e.setTag(null);
        this.f26883g.setTag(null);
        this.f26884h.setTag(null);
        this.f26885i.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f26892n = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f26893o = textView;
        textView.setTag(null);
        UserRecomTagView userRecomTagView = (UserRecomTagView) objArr[4];
        this.f26894p = userRecomTagView;
        userRecomTagView.setTag(null);
        this.f26886j.setTag(null);
        this.f26887k.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
