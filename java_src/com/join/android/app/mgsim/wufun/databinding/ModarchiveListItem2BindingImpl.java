package com.join.android.app.mgsim.wufun.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
/* loaded from: classes3.dex */
public class ModarchiveListItem2BindingImpl extends ModarchiveListItem2Binding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: y  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f25056y = null;
    @Nullable

    /* renamed from: z  reason: collision with root package name */
    private static final SparseIntArray f25057z;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private final LinearLayout f25058p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    private final SimpleDraweeView f25059q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    private final View f25060r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private final View.OnClickListener f25061s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private final View.OnClickListener f25062t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private final View.OnClickListener f25063u;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private final View.OnClickListener f25064v;
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private final View.OnClickListener f25065w;

    /* renamed from: x  reason: collision with root package name */
    private long f25066x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25057z = sparseIntArray;
        sparseIntArray.put(R.id.messageLayout, 12);
        sparseIntArray.put(R.id.more, 13);
    }

    public ModarchiveListItem2BindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f25056y, f25057z));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            ArchiveData archiveData = this.f25053m;
            OnClickArchiveListener onClickArchiveListener = this.f25054n;
            if (onClickArchiveListener != null) {
                if (archiveData != null) {
                    onClickArchiveListener.onClickImage(archiveData.getCoverLocation());
                }
            }
        } else if (i4 == 2) {
            ArchiveData archiveData2 = this.f25053m;
            OnClickArchiveListener onClickArchiveListener2 = this.f25054n;
            if (onClickArchiveListener2 != null) {
                onClickArchiveListener2.onPraise(archiveData2);
            }
        } else if (i4 == 3) {
            ArchiveData archiveData3 = this.f25053m;
            OnClickArchiveListener onClickArchiveListener3 = this.f25054n;
            if (onClickArchiveListener3 != null) {
                onClickArchiveListener3.onClickDislike(archiveData3);
            }
        } else if (i4 == 4) {
            ArchiveData archiveData4 = this.f25053m;
            OnClickArchiveListener onClickArchiveListener4 = this.f25054n;
            if (onClickArchiveListener4 != null) {
                onClickArchiveListener4.onClickRun(archiveData4);
            }
        } else if (i4 != 5) {
        } else {
            ArchiveData archiveData5 = this.f25053m;
            OnClickArchiveListener onClickArchiveListener5 = this.f25054n;
            if (onClickArchiveListener5 != null) {
                onClickArchiveListener5.onClickMore(view, archiveData5);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        long j5;
        String str;
        String str2;
        Drawable drawable;
        int i4;
        int i5;
        String str3;
        Drawable drawable2;
        Drawable drawable3;
        String str4;
        String str5;
        Drawable drawable4;
        String str6;
        int i6;
        String str7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str8;
        int i12;
        int i13;
        String str9;
        String str10;
        int i14;
        String str11;
        String str12;
        String str13;
        Context context;
        int i15;
        Context context2;
        int i16;
        synchronized (this) {
            j4 = this.f25066x;
            this.f25066x = 0L;
        }
        ArchiveData archiveData = this.f25053m;
        long j6 = j4 & 9;
        if (j6 != 0) {
            if (archiveData != null) {
                i11 = archiveData.getStatus();
                str8 = archiveData.getId();
                i12 = archiveData.getLikeCount();
                i13 = archiveData.getIsFirstRun();
                str9 = archiveData.getCoverLocation();
                str10 = archiveData.getAvatar();
                int isLike = archiveData.getIsLike();
                i14 = archiveData.getNegativeCount();
                str11 = archiveData.getNickname();
                str12 = archiveData.getArchiveDesc();
                int isUnLike = archiveData.getIsUnLike();
                str13 = archiveData.getShowText();
                int showType = archiveData.getShowType();
                i7 = archiveData.getUserId();
                i9 = isLike;
                i10 = isUnLike;
                i8 = showType;
            } else {
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                str8 = null;
                i12 = 0;
                i13 = 0;
                str9 = null;
                str10 = null;
                i14 = 0;
                str11 = null;
                str12 = null;
                str13 = null;
            }
            boolean z4 = i11 == 8;
            str5 = String.valueOf(i12);
            boolean z5 = i13 == 1;
            boolean z6 = str9 == null;
            boolean z7 = i9 == 1;
            String valueOf = String.valueOf(i14);
            boolean z8 = i10 == 1;
            boolean z9 = i8 == 1;
            String valueOf2 = String.valueOf(i7);
            if (j6 != 0) {
                j4 |= z4 ? 2048L : 1024L;
            }
            if ((j4 & 9) != 0) {
                j4 |= z5 ? 32L : 16L;
            }
            if ((j4 & 9) != 0) {
                j4 |= z6 ? 512L : 256L;
            }
            if ((j4 & 9) != 0) {
                j4 |= z7 ? 32768L : 16384L;
            }
            if ((j4 & 9) != 0) {
                j4 |= z8 ? 131072L : 65536L;
            }
            if ((j4 & 9) != 0) {
                j4 |= z9 ? 8192L : 4096L;
            }
            if (z4) {
                context = this.f25050j.getContext();
                i15 = R.drawable.mod_start_normal_back;
            } else {
                context = this.f25050j.getContext();
                i15 = R.drawable.mod_download_normal_back;
            }
            drawable = AppCompatResources.getDrawable(context, i15);
            i4 = z5 ? 0 : 8;
            int i17 = z6 ? 8 : 0;
            drawable2 = AppCompatResources.getDrawable(this.f25048h.getContext(), z7 ? R.drawable.cloud_parised_icon : R.drawable.cloud_parise_icon);
            drawable3 = AppCompatResources.getDrawable(this.f25043c.getContext(), z8 ? R.drawable.dislike_pressed : R.drawable.dislike_normal);
            i5 = z9 ? 8 : 0;
            boolean equals = str8 != null ? str8.equals(valueOf2) : false;
            if ((j4 & 9) != 0) {
                j4 |= equals ? 128L : 64L;
            }
            if (equals) {
                context2 = this.f25058p.getContext();
                i16 = R.drawable.mod_archive_local_back;
            } else {
                context2 = this.f25058p.getContext();
                i16 = R.drawable.mod_archive_item_back;
            }
            drawable4 = AppCompatResources.getDrawable(context2, i16);
            i6 = i17;
            str = str9;
            str2 = str10;
            str4 = valueOf;
            str7 = str11;
            str3 = str12;
            str6 = str13;
            j5 = 9;
        } else {
            j5 = 9;
            str = null;
            str2 = null;
            drawable = null;
            i4 = 0;
            i5 = 0;
            str3 = null;
            drawable2 = null;
            drawable3 = null;
            str4 = null;
            str5 = null;
            drawable4 = null;
            str6 = null;
            i6 = 0;
            str7 = null;
        }
        int i18 = ((j4 & j5) > 0L ? 1 : ((j4 & j5) == 0L ? 0 : -1));
        long j7 = j4;
        if (i18 != 0) {
            TextViewBindingAdapter.setText(this.f25042b, str3);
            ImageViewBindingAdapter.setImageDrawable(this.f25043c, drawable3);
            TextViewBindingAdapter.setText(this.f25044d, str4);
            ViewBindingAdapter.setBackground(this.f25058p, drawable4);
            this.f25059q.setVisibility(i6);
            SimpleDrawableViewKt.loadUrl(this.f25059q, str, null, 0);
            this.f25060r.setVisibility(i4);
            this.f25047g.setVisibility(i5);
            ImageViewBindingAdapter.setImageDrawable(this.f25048h, drawable2);
            TextViewBindingAdapter.setText(this.f25049i, str5);
            ViewBindingAdapter.setBackground(this.f25050j, drawable);
            TextViewBindingAdapter.setText(this.f25050j, str6);
            SimpleDrawableViewKt.loadUrl(this.f25051k, str2, null, 0);
            TextViewBindingAdapter.setText(this.f25052l, str7);
        }
        if ((j7 & 8) != 0) {
            this.f25043c.setOnClickListener(this.f25061s);
            this.f25059q.setOnClickListener(this.f25064v);
            this.f25047g.setOnClickListener(this.f25063u);
            this.f25048h.setOnClickListener(this.f25065w);
            this.f25050j.setOnClickListener(this.f25062t);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListItem2Binding
    public void h(@Nullable OnClickArchiveListener onClickArchiveListener) {
        this.f25054n = onClickArchiveListener;
        synchronized (this) {
            this.f25066x |= 2;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f25066x != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListItem2Binding
    public void i(@Nullable Boolean bool) {
        this.f25055o = bool;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25066x = 8L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListItem2Binding
    public void j(@Nullable ArchiveData archiveData) {
        this.f25053m = archiveData;
        synchronized (this) {
            this.f25066x |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i4, Object obj, int i5) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i4, @Nullable Object obj) {
        if (18 == i4) {
            j((ArchiveData) obj);
        } else if (8 == i4) {
            h((OnClickArchiveListener) obj);
        } else if (13 != i4) {
            return false;
        } else {
            i((Boolean) obj);
        }
        return true;
    }

    private ModarchiveListItem2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (ImageView) objArr[7], (TextView) objArr[8], (RelativeLayout) objArr[12], (TextView) objArr[13], (ImageView) objArr[11], (ImageView) objArr[5], (TextView) objArr[6], (TextView) objArr[9], (SimpleDraweeView) objArr[3], (TextView) objArr[4]);
        this.f25066x = -1L;
        this.f25042b.setTag(null);
        this.f25043c.setTag(null);
        this.f25044d.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f25058p = linearLayout;
        linearLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f25059q = simpleDraweeView;
        simpleDraweeView.setTag(null);
        View view2 = (View) objArr[10];
        this.f25060r = view2;
        view2.setTag(null);
        this.f25047g.setTag(null);
        this.f25048h.setTag(null);
        this.f25049i.setTag(null);
        this.f25050j.setTag(null);
        this.f25051k.setTag(null);
        this.f25052l.setTag(null);
        setRootTag(view);
        this.f25061s = new a(this, 3);
        this.f25062t = new a(this, 4);
        this.f25063u = new a(this, 5);
        this.f25064v = new a(this, 1);
        this.f25065w = new a(this, 2);
        invalidateAll();
    }
}
