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
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.bindingadapter.ViewBindingDownloadViewKt;
import com.join.kotlin.bindingadapter.ViewBindingTextviewKt;
import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.kotlin.ui.modleregin.modle.BtGameListItem;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public class BtListitemBindingImpl extends BtListitemBinding {
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f17604r = null;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private static final SparseIntArray f17605s;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final ConstraintLayout f17606n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final TextView f17607o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private final TextView f17608p;

    /* renamed from: q  reason: collision with root package name */
    private long f17609q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17605s = sparseIntArray;
        sparseIntArray.put(R.id.gameName, 12);
    }

    public BtListitemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f17604r, f17605s));
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        int i4;
        int i5;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        int i10;
        String str3;
        CollectionBeanSubBusiness collectionBeanSubBusiness;
        int i11;
        int i12;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String str14;
        int i13;
        boolean z9;
        synchronized (this) {
            j4 = this.f17609q;
            this.f17609q = 0L;
        }
        BtGameListItem btGameListItem = this.f17602l;
        AppListItemShowBean appListItemShowBean = this.f17603m;
        if ((j4 & 7) != 0) {
            if ((j4 & 5) == 0 || btGameListItem == null) {
                str8 = null;
                str9 = null;
                str10 = null;
                str11 = null;
                str12 = null;
            } else {
                str8 = btGameListItem.getIcon();
                str9 = btGameListItem.getTags();
                str10 = btGameListItem.getInfo();
                str11 = btGameListItem.getGameName();
                str12 = btGameListItem.getIconGif();
            }
            CollectionBeanSubBusiness gameInfo = btGameListItem != null ? btGameListItem.getGameInfo() : null;
            int downloadStatus = appListItemShowBean != null ? appListItemShowBean.getDownloadStatus() : 0;
            long j5 = j4 & 6;
            if (j5 != 0) {
                if (appListItemShowBean != null) {
                    boolean giftShow = appListItemShowBean.getGiftShow();
                    String lodingInfo = appListItemShowBean.getLodingInfo();
                    z5 = appListItemShowBean.getProgressZipShow();
                    z6 = appListItemShowBean.getDescribeShow();
                    z7 = appListItemShowBean.getDownMessageShow();
                    z8 = appListItemShowBean.getTagshow();
                    str14 = appListItemShowBean.getAppSizeText();
                    i13 = appListItemShowBean.getDownloadProgress();
                    z9 = appListItemShowBean.getProgresShow();
                    i4 = appListItemShowBean.getZipProgress();
                    z4 = giftShow;
                    str13 = lodingInfo;
                } else {
                    i4 = 0;
                    str13 = null;
                    z4 = false;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    str14 = null;
                    i13 = 0;
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
                int i14 = z4 ? 0 : 8;
                int i15 = z5 ? 0 : 8;
                int i16 = z6 ? 0 : 8;
                int i17 = z7 ? 0 : 8;
                int i18 = z8 ? 0 : 8;
                str7 = str9;
                str5 = str10;
                str6 = str11;
                str4 = str12;
                i9 = z9 ? 0 : 8;
                i5 = i14;
                i10 = i16;
                i7 = i17;
                i8 = i18;
                i6 = i13;
                collectionBeanSubBusiness = gameInfo;
                str3 = str8;
                str2 = str13;
                i12 = i15;
                str = str14;
                i11 = downloadStatus;
            } else {
                collectionBeanSubBusiness = gameInfo;
                str3 = str8;
                str7 = str9;
                str5 = str10;
                str6 = str11;
                str4 = str12;
                i11 = downloadStatus;
                str = null;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                str2 = null;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i12 = 0;
            }
        } else {
            str = null;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            str2 = null;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            str3 = null;
            collectionBeanSubBusiness = null;
            i11 = 0;
            i12 = 0;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        if ((6 & j4) != 0) {
            TextViewBindingAdapter.setText(this.f17592b, str);
            this.f17595e.setVisibility(i10);
            this.f17597g.setVisibility(i5);
            this.f17598h.setVisibility(i7);
            TextViewBindingAdapter.setText(this.f17599i, str2);
            this.f17608p.setVisibility(i8);
            this.f17600j.setProgress(i6);
            this.f17600j.setVisibility(i9);
            this.f17601k.setProgress(i4);
            this.f17601k.setVisibility(i12);
        }
        if ((7 & j4) != 0) {
            ViewBindingDownloadViewKt.downloadVIewBinding(this.f17593c, collectionBeanSubBusiness, i11);
        }
        if ((j4 & 5) != 0) {
            SimpleDrawableViewKt.loadUrl(this.f17594d, str3, str4, 0);
            ViewBindingTextviewKt.textViewBinding(this.f17595e, str5);
            TextViewBindingAdapter.setText(this.f17607o, str6);
            TextViewBindingAdapter.setText(this.f17608p, str7);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtListitemBinding
    public void g(@Nullable BtGameListItem btGameListItem) {
        this.f17602l = btGameListItem;
        synchronized (this) {
            this.f17609q |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.BtListitemBinding
    public void h(@Nullable AppListItemShowBean appListItemShowBean) {
        this.f17603m = appListItemShowBean;
        synchronized (this) {
            this.f17609q |= 2;
        }
        notifyPropertyChanged(19);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f17609q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f17609q = 4L;
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
            g((BtGameListItem) obj);
        } else if (19 != i4) {
            return false;
        } else {
            h((AppListItemShowBean) obj);
        }
        return true;
    }

    private BtListitemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[7], (DownloadViewStroke) objArr[11], (SimpleDraweeView) objArr[1], (TextView) objArr[5], (LinearLayout) objArr[12], (ImageView) objArr[2], (LinearLayout) objArr[6], (TextView) objArr[8], (ProgressBar) objArr[10], (ProgressBar) objArr[9]);
        this.f17609q = -1L;
        this.f17592b.setTag(null);
        this.f17593c.setTag(null);
        this.f17594d.setTag(null);
        this.f17595e.setTag(null);
        this.f17597g.setTag(null);
        this.f17598h.setTag(null);
        this.f17599i.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f17606n = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f17607o = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[4];
        this.f17608p = textView2;
        textView2.setTag(null);
        this.f17600j.setTag(null);
        this.f17601k.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
