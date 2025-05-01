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
public class ModarchiveGameDetailListItemBindingImpl extends ModarchiveGameDetailListItemBinding implements a.InterfaceC0321a {
    @Nullable
    private static final SparseIntArray A;
    @Nullable

    /* renamed from: z  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f25012z = null;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    private final LinearLayout f25013q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    private final SimpleDraweeView f25014r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    private final View f25015s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private final View.OnClickListener f25016t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private final View.OnClickListener f25017u;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private final View.OnClickListener f25018v;
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private final View.OnClickListener f25019w;
    @Nullable

    /* renamed from: x  reason: collision with root package name */
    private final View.OnClickListener f25020x;

    /* renamed from: y  reason: collision with root package name */
    private long f25021y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.messageLayout, 13);
        sparseIntArray.put(R.id.more, 14);
    }

    public ModarchiveGameDetailListItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f25012z, A));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            ArchiveData archiveData = this.f25009n;
            OnClickArchiveListener onClickArchiveListener = this.f25010o;
            if (onClickArchiveListener != null) {
                if (archiveData != null) {
                    onClickArchiveListener.onClickImage(archiveData.getCoverLocation());
                }
            }
        } else if (i4 == 2) {
            ArchiveData archiveData2 = this.f25009n;
            OnClickArchiveListener onClickArchiveListener2 = this.f25010o;
            if (onClickArchiveListener2 != null) {
                onClickArchiveListener2.onPraise(archiveData2);
            }
        } else if (i4 == 3) {
            ArchiveData archiveData3 = this.f25009n;
            OnClickArchiveListener onClickArchiveListener3 = this.f25010o;
            if (onClickArchiveListener3 != null) {
                onClickArchiveListener3.onClickDislike(archiveData3);
            }
        } else if (i4 == 4) {
            ArchiveData archiveData4 = this.f25009n;
            OnClickArchiveListener onClickArchiveListener4 = this.f25010o;
            if (onClickArchiveListener4 != null) {
                onClickArchiveListener4.onClickRun(archiveData4);
            }
        } else if (i4 != 5) {
        } else {
            ArchiveData archiveData5 = this.f25009n;
            OnClickArchiveListener onClickArchiveListener5 = this.f25010o;
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
        int i4;
        Drawable drawable;
        Drawable drawable2;
        String str2;
        Drawable drawable3;
        int i5;
        String str3;
        String str4;
        boolean z4;
        String str5;
        String str6;
        String str7;
        int i6;
        int i7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Context context;
        int i14;
        synchronized (this) {
            j4 = this.f25021y;
            this.f25021y = 0L;
        }
        ArchiveData archiveData = this.f25009n;
        Boolean bool = this.f25011p;
        if ((j4 & 13) != 0) {
            long j6 = j4 & 9;
            if (j6 != 0) {
                if (archiveData != null) {
                    int status = archiveData.getStatus();
                    i12 = archiveData.getLikeCount();
                    int isFirstRun = archiveData.getIsFirstRun();
                    str9 = archiveData.getCoverLocation();
                    str10 = archiveData.getAvatar();
                    int isLike = archiveData.getIsLike();
                    int negativeCount = archiveData.getNegativeCount();
                    str11 = archiveData.getNickname();
                    str12 = archiveData.getArchiveDesc();
                    int isUnLike = archiveData.getIsUnLike();
                    str13 = archiveData.getShowText();
                    i10 = status;
                    i8 = isFirstRun;
                    i9 = isLike;
                    i13 = negativeCount;
                    i11 = isUnLike;
                } else {
                    i8 = 0;
                    i9 = 0;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    str9 = null;
                    str10 = null;
                    str11 = null;
                    str12 = null;
                    str13 = null;
                }
                boolean z5 = i10 == 8;
                str4 = String.valueOf(i12);
                boolean z6 = i8 == 1;
                boolean z7 = str9 == null;
                boolean z8 = i9 == 1;
                str8 = String.valueOf(i13);
                boolean z9 = i11 == 1;
                if (j6 != 0) {
                    j4 |= z5 ? 2048L : 1024L;
                }
                if ((j4 & 9) != 0) {
                    j4 |= z6 ? 128L : 64L;
                }
                if ((j4 & 9) != 0) {
                    j4 |= z7 ? 512L : 256L;
                }
                if ((j4 & 9) != 0) {
                    j4 |= z8 ? 8192L : 4096L;
                }
                if ((j4 & 9) != 0) {
                    j4 |= z9 ? 131072L : 65536L;
                }
                drawable2 = AppCompatResources.getDrawable(this.f25005j.getContext(), z5 ? R.drawable.mod_start_normal_back : R.drawable.mod_download_normal_back);
                i4 = z6 ? 0 : 8;
                i7 = z7 ? 8 : 0;
                if (z8) {
                    context = this.f25003h.getContext();
                    i14 = R.drawable.cloud_parised_icon;
                } else {
                    context = this.f25003h.getContext();
                    i14 = R.drawable.cloud_parise_icon;
                }
                drawable = AppCompatResources.getDrawable(context, i14);
                drawable3 = AppCompatResources.getDrawable(this.f24998c.getContext(), z9 ? R.drawable.dislike_pressed : R.drawable.dislike_normal);
            } else {
                i4 = 0;
                drawable = null;
                drawable2 = null;
                i7 = 0;
                drawable3 = null;
                str4 = null;
                str8 = null;
                str9 = null;
                str10 = null;
                str11 = null;
                str12 = null;
                str13 = null;
            }
            boolean z10 = (archiveData != null ? archiveData.getIsChoice() : 0) == 1;
            if ((j4 & 13) == 0) {
                j5 = 32;
            } else if (z10) {
                j5 = 32;
                j4 |= 32;
            } else {
                j5 = 32;
                j4 |= 16;
            }
            z4 = z10;
            i5 = i7;
            str = str8;
            str2 = str9;
            str5 = str10;
            str6 = str11;
            str3 = str12;
            str7 = str13;
        } else {
            j5 = 32;
            str = null;
            i4 = 0;
            drawable = null;
            drawable2 = null;
            str2 = null;
            drawable3 = null;
            i5 = 0;
            str3 = null;
            str4 = null;
            z4 = false;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        boolean z11 = (j4 & j5) != 0 ? !ViewDataBinding.safeUnbox(bool) : false;
        long j7 = j4 & 13;
        if (j7 != 0) {
            if (!z4) {
                z11 = false;
            }
            if (j7 != 0) {
                j4 |= z11 ? 32768L : 16384L;
            }
            i6 = z11 ? 0 : 8;
        } else {
            i6 = 0;
        }
        if ((j4 & 9) != 0) {
            TextViewBindingAdapter.setText(this.f24997b, str3);
            ImageViewBindingAdapter.setImageDrawable(this.f24998c, drawable3);
            TextViewBindingAdapter.setText(this.f24999d, str);
            this.f25014r.setVisibility(i5);
            SimpleDrawableViewKt.loadUrl(this.f25014r, str2, null, 0);
            this.f25015s.setVisibility(i4);
            ImageViewBindingAdapter.setImageDrawable(this.f25003h, drawable);
            TextViewBindingAdapter.setText(this.f25004i, str4);
            ViewBindingAdapter.setBackground(this.f25005j, drawable2);
            TextViewBindingAdapter.setText(this.f25005j, str7);
            SimpleDrawableViewKt.loadUrl(this.f25007l, str5, null, 0);
            TextViewBindingAdapter.setText(this.f25008m, str6);
        }
        if ((8 & j4) != 0) {
            this.f24998c.setOnClickListener(this.f25017u);
            this.f25014r.setOnClickListener(this.f25020x);
            this.f25002g.setOnClickListener(this.f25019w);
            this.f25003h.setOnClickListener(this.f25016t);
            this.f25005j.setOnClickListener(this.f25018v);
        }
        if ((j4 & 13) != 0) {
            this.f25006k.setVisibility(i6);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveGameDetailListItemBinding
    public void h(@Nullable OnClickArchiveListener onClickArchiveListener) {
        this.f25010o = onClickArchiveListener;
        synchronized (this) {
            this.f25021y |= 2;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f25021y != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveGameDetailListItemBinding
    public void i(@Nullable Boolean bool) {
        this.f25011p = bool;
        synchronized (this) {
            this.f25021y |= 4;
        }
        notifyPropertyChanged(13);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25021y = 8L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveGameDetailListItemBinding
    public void j(@Nullable ArchiveData archiveData) {
        this.f25009n = archiveData;
        synchronized (this) {
            this.f25021y |= 1;
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

    private ModarchiveGameDetailListItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (ImageView) objArr[8], (TextView) objArr[9], (RelativeLayout) objArr[13], (TextView) objArr[14], (ImageView) objArr[12], (ImageView) objArr[6], (TextView) objArr[7], (TextView) objArr[10], (TextView) objArr[2], (SimpleDraweeView) objArr[4], (TextView) objArr[5]);
        this.f25021y = -1L;
        this.f24997b.setTag(null);
        this.f24998c.setTag(null);
        this.f24999d.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f25013q = linearLayout;
        linearLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f25014r = simpleDraweeView;
        simpleDraweeView.setTag(null);
        View view2 = (View) objArr[11];
        this.f25015s = view2;
        view2.setTag(null);
        this.f25002g.setTag(null);
        this.f25003h.setTag(null);
        this.f25004i.setTag(null);
        this.f25005j.setTag(null);
        this.f25006k.setTag(null);
        this.f25007l.setTag(null);
        this.f25008m.setTag(null);
        setRootTag(view);
        this.f25016t = new a(this, 2);
        this.f25017u = new a(this, 3);
        this.f25018v = new a(this, 4);
        this.f25019w = new a(this, 5);
        this.f25020x = new a(this, 1);
        invalidateAll();
    }
}
