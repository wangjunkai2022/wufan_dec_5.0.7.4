package com.join.android.app.mgsim.wufun.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
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
public class ModarchiveListItemBindingImpl extends ModarchiveListItemBinding implements a.InterfaceC0321a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts A = null;
    @Nullable
    private static final SparseIntArray B;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    private final LinearLayout f25083r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    private final SimpleDraweeView f25084s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    private final View f25085t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private final View.OnClickListener f25086u;
    @Nullable

    /* renamed from: v  reason: collision with root package name */
    private final View.OnClickListener f25087v;
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private final View.OnClickListener f25088w;
    @Nullable

    /* renamed from: x  reason: collision with root package name */
    private final View.OnClickListener f25089x;
    @Nullable

    /* renamed from: y  reason: collision with root package name */
    private final View.OnClickListener f25090y;

    /* renamed from: z  reason: collision with root package name */
    private long f25091z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.messageLayout, 13);
        sparseIntArray.put(R.id.more, 14);
    }

    public ModarchiveListItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, A, B));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            ArchiveData archiveData = this.f25079n;
            OnClickArchiveListener onClickArchiveListener = this.f25080o;
            if (onClickArchiveListener != null) {
                if (archiveData != null) {
                    onClickArchiveListener.onClickImage(archiveData.getCoverLocation());
                }
            }
        } else if (i4 == 2) {
            ArchiveData archiveData2 = this.f25079n;
            OnClickArchiveListener onClickArchiveListener2 = this.f25080o;
            if (onClickArchiveListener2 != null) {
                onClickArchiveListener2.onPraise(archiveData2);
            }
        } else if (i4 == 3) {
            ArchiveData archiveData3 = this.f25079n;
            OnClickArchiveListener onClickArchiveListener3 = this.f25080o;
            if (onClickArchiveListener3 != null) {
                onClickArchiveListener3.onClickDislike(archiveData3);
            }
        } else if (i4 == 4) {
            ArchiveData archiveData4 = this.f25079n;
            OnClickArchiveListener onClickArchiveListener4 = this.f25080o;
            if (onClickArchiveListener4 != null) {
                onClickArchiveListener4.onClickRun(archiveData4);
            }
        } else if (i4 != 5) {
        } else {
            ArchiveData archiveData5 = this.f25079n;
            OnClickArchiveListener onClickArchiveListener5 = this.f25080o;
            if (onClickArchiveListener5 != null) {
                onClickArchiveListener5.onClickMore(view, archiveData5);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        long j5;
        long j6;
        String str;
        String str2;
        int i4;
        Drawable drawable;
        String str3;
        int i5;
        Drawable drawable2;
        String str4;
        Drawable drawable3;
        Drawable drawable4;
        boolean z4;
        int i6;
        String str5;
        String str6;
        String str7;
        int i7;
        Drawable drawable5;
        int i8;
        Drawable drawable6;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i9;
        int i10;
        int i11;
        int i12;
        String str14;
        int i13;
        int i14;
        int i15;
        int i16;
        Context context;
        int i17;
        Context context2;
        int i18;
        Context context3;
        int i19;
        synchronized (this) {
            j4 = this.f25091z;
            this.f25091z = 0L;
        }
        ArchiveData archiveData = this.f25079n;
        Boolean bool = this.f25081p;
        if ((j4 & 26) != 0) {
            long j7 = j4 & 18;
            if (j7 != 0) {
                if (archiveData != null) {
                    int status = archiveData.getStatus();
                    String id = archiveData.getId();
                    int likeCount = archiveData.getLikeCount();
                    int isFirstRun = archiveData.getIsFirstRun();
                    str9 = archiveData.getCoverLocation();
                    str10 = archiveData.getAvatar();
                    int isLike = archiveData.getIsLike();
                    int negativeCount = archiveData.getNegativeCount();
                    str11 = archiveData.getNickname();
                    str12 = archiveData.getArchiveDesc();
                    int isUnLike = archiveData.getIsUnLike();
                    str13 = archiveData.getShowText();
                    i11 = status;
                    str14 = id;
                    i12 = likeCount;
                    i13 = isFirstRun;
                    i14 = isLike;
                    i15 = negativeCount;
                    i9 = isUnLike;
                    i10 = archiveData.getShowType();
                    i16 = archiveData.getUserId();
                } else {
                    i9 = 0;
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    str14 = null;
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    str9 = null;
                    str10 = null;
                    str11 = null;
                    str12 = null;
                    i16 = 0;
                    str13 = null;
                }
                boolean z5 = i11 == 8;
                str3 = String.valueOf(i12);
                boolean z6 = i13 == 1;
                boolean z7 = str9 == null;
                boolean z8 = i14 == 1;
                str8 = String.valueOf(i15);
                boolean z9 = i9 == 1;
                boolean z10 = i10 == 1;
                String valueOf = String.valueOf(i16);
                if (j7 != 0) {
                    j4 |= z5 ? 16384L : 8192L;
                }
                if ((j4 & 18) != 0) {
                    j4 |= z6 ? 256L : 128L;
                }
                if ((j4 & 18) != 0) {
                    j4 |= z7 ? 4096L : 2048L;
                }
                if ((j4 & 18) != 0) {
                    j4 |= z8 ? PlaybackStateCompat.ACTION_SET_REPEAT_MODE : 131072L;
                }
                if ((j4 & 18) != 0) {
                    j4 |= z9 ? 4194304L : PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                }
                if ((j4 & 18) != 0) {
                    j4 |= z10 ? 65536L : 32768L;
                }
                if (z5) {
                    context = this.f25075j.getContext();
                    i17 = R.drawable.mod_start_normal_back;
                } else {
                    context = this.f25075j.getContext();
                    i17 = R.drawable.mod_download_normal_back;
                }
                drawable = AppCompatResources.getDrawable(context, i17);
                i5 = z6 ? 0 : 8;
                i8 = z7 ? 8 : 0;
                drawable4 = AppCompatResources.getDrawable(this.f25073h.getContext(), z8 ? R.drawable.cloud_parised_icon : R.drawable.cloud_parise_icon);
                if (z9) {
                    context2 = this.f25068c.getContext();
                    i18 = R.drawable.dislike_pressed;
                } else {
                    context2 = this.f25068c.getContext();
                    i18 = R.drawable.dislike_normal;
                }
                drawable5 = AppCompatResources.getDrawable(context2, i18);
                i4 = z10 ? 8 : 0;
                boolean equals = str14 != null ? str14.equals(valueOf) : false;
                if ((j4 & 18) != 0) {
                    j4 |= equals ? 1024L : 512L;
                }
                if (equals) {
                    context3 = this.f25083r.getContext();
                    i19 = R.drawable.mod_archive_local_back;
                } else {
                    context3 = this.f25083r.getContext();
                    i19 = R.drawable.mod_archive_item_back;
                }
                drawable6 = AppCompatResources.getDrawable(context3, i19);
            } else {
                drawable5 = null;
                i4 = 0;
                drawable = null;
                str3 = null;
                i5 = 0;
                i8 = 0;
                drawable6 = null;
                drawable4 = null;
                str8 = null;
                str9 = null;
                str10 = null;
                str11 = null;
                str12 = null;
                str13 = null;
            }
            boolean z11 = (archiveData != null ? archiveData.getIsChoice() : 0) == 1;
            j5 = 0;
            if ((j4 & 26) == 0) {
                j6 = 64;
            } else if (z11) {
                j6 = 64;
                j4 |= 64;
            } else {
                j6 = 64;
                j4 |= 32;
            }
            z4 = z11;
            i6 = i8;
            drawable3 = drawable6;
            str4 = str9;
            str5 = str10;
            str6 = str11;
            str = str12;
            str7 = str13;
            drawable2 = drawable5;
            str2 = str8;
        } else {
            j5 = 0;
            j6 = 64;
            str = null;
            str2 = null;
            i4 = 0;
            drawable = null;
            str3 = null;
            i5 = 0;
            drawable2 = null;
            str4 = null;
            drawable3 = null;
            drawable4 = null;
            z4 = false;
            i6 = 0;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        boolean z12 = (j6 & j4) != j5 ? !ViewDataBinding.safeUnbox(bool) : false;
        long j8 = j4 & 26;
        if (j8 != j5) {
            if (!z4) {
                z12 = false;
            }
            if (j8 != j5) {
                j4 |= z12 ? 1048576L : PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            i7 = z12 ? 0 : 8;
        } else {
            i7 = 0;
        }
        if ((18 & j4) != 0) {
            TextViewBindingAdapter.setText(this.f25067b, str);
            ImageViewBindingAdapter.setImageDrawable(this.f25068c, drawable2);
            TextViewBindingAdapter.setText(this.f25069d, str2);
            ViewBindingAdapter.setBackground(this.f25083r, drawable3);
            this.f25084s.setVisibility(i6);
            SimpleDrawableViewKt.loadUrl(this.f25084s, str4, null, 0);
            this.f25085t.setVisibility(i5);
            this.f25072g.setVisibility(i4);
            ImageViewBindingAdapter.setImageDrawable(this.f25073h, drawable4);
            TextViewBindingAdapter.setText(this.f25074i, str3);
            ViewBindingAdapter.setBackground(this.f25075j, drawable);
            TextViewBindingAdapter.setText(this.f25075j, str7);
            SimpleDrawableViewKt.loadUrl(this.f25077l, str5, null, 0);
            TextViewBindingAdapter.setText(this.f25078m, str6);
        }
        if ((16 & j4) != 0) {
            this.f25068c.setOnClickListener(this.f25086u);
            this.f25084s.setOnClickListener(this.f25090y);
            this.f25072g.setOnClickListener(this.f25089x);
            this.f25073h.setOnClickListener(this.f25087v);
            this.f25075j.setOnClickListener(this.f25088w);
        }
        if ((j4 & 26) != 0) {
            this.f25076k.setVisibility(i7);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f25091z != 0;
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListItemBinding
    public void i(@Nullable OnClickArchiveListener onClickArchiveListener) {
        this.f25080o = onClickArchiveListener;
        synchronized (this) {
            this.f25091z |= 4;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f25091z = 16L;
        }
        requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListItemBinding
    public void j(@Nullable Boolean bool) {
        this.f25081p = bool;
        synchronized (this) {
            this.f25091z |= 8;
        }
        notifyPropertyChanged(13);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListItemBinding
    public void k(@Nullable Boolean bool) {
        this.f25082q = bool;
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListItemBinding
    public void l(@Nullable ArchiveData archiveData) {
        this.f25079n = archiveData;
        synchronized (this) {
            this.f25091z |= 2;
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
        if (15 == i4) {
            k((Boolean) obj);
        } else if (18 == i4) {
            l((ArchiveData) obj);
        } else if (8 == i4) {
            i((OnClickArchiveListener) obj);
        } else if (13 != i4) {
            return false;
        } else {
            j((Boolean) obj);
        }
        return true;
    }

    private ModarchiveListItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (ImageView) objArr[8], (TextView) objArr[9], (RelativeLayout) objArr[13], (TextView) objArr[14], (ImageView) objArr[12], (ImageView) objArr[6], (TextView) objArr[7], (TextView) objArr[10], (TextView) objArr[2], (SimpleDraweeView) objArr[4], (TextView) objArr[5]);
        this.f25091z = -1L;
        this.f25067b.setTag(null);
        this.f25068c.setTag(null);
        this.f25069d.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f25083r = linearLayout;
        linearLayout.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[1];
        this.f25084s = simpleDraweeView;
        simpleDraweeView.setTag(null);
        View view2 = (View) objArr[11];
        this.f25085t = view2;
        view2.setTag(null);
        this.f25072g.setTag(null);
        this.f25073h.setTag(null);
        this.f25074i.setTag(null);
        this.f25075j.setTag(null);
        this.f25076k.setTag(null);
        this.f25077l.setTag(null);
        this.f25078m.setTag(null);
        setRootTag(view);
        this.f25086u = new a(this, 3);
        this.f25087v = new a(this, 2);
        this.f25088w = new a(this, 4);
        this.f25089x = new a(this, 5);
        this.f25090y = new a(this, 1);
        invalidateAll();
    }
}
