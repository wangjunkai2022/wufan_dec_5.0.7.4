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
import com.join.mgps.Util.y;
/* loaded from: classes3.dex */
public class ModarchiveListLocalItemBindingImpl extends ModarchiveListLocalItemBinding implements a.InterfaceC0321a {
    @Nullable
    private static final ViewDataBinding.IncludedLayouts D = null;
    @Nullable
    private static final SparseIntArray E;
    @Nullable
    private final View.OnClickListener A;
    @Nullable
    private final View.OnClickListener B;
    private long C;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    private final LinearLayout f25132q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    private final LinearLayout f25133r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    private final RelativeLayout f25134s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    private final View f25135t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    private final SimpleDraweeView f25136u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    private final LinearLayout f25137v;
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private final View.OnClickListener f25138w;
    @Nullable

    /* renamed from: x  reason: collision with root package name */
    private final View.OnClickListener f25139x;
    @Nullable

    /* renamed from: y  reason: collision with root package name */
    private final View.OnClickListener f25140y;
    @Nullable

    /* renamed from: z  reason: collision with root package name */
    private final View.OnClickListener f25141z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.messageLayout, 16);
        sparseIntArray.put(R.id.more, 17);
        sparseIntArray.put(R.id.downImg, 18);
    }

    public ModarchiveListLocalItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, D, E));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        switch (i4) {
            case 1:
                ArchiveData archiveData = this.f25130o;
                OnClickArchiveListener onClickArchiveListener = this.f25131p;
                if (onClickArchiveListener != null) {
                    if (archiveData != null) {
                        onClickArchiveListener.onClickImage(archiveData.getCoverLocation());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ArchiveData archiveData2 = this.f25130o;
                OnClickArchiveListener onClickArchiveListener2 = this.f25131p;
                if (onClickArchiveListener2 != null) {
                    onClickArchiveListener2.onPraise(archiveData2);
                    return;
                }
                return;
            case 3:
                ArchiveData archiveData3 = this.f25130o;
                OnClickArchiveListener onClickArchiveListener3 = this.f25131p;
                if (onClickArchiveListener3 != null) {
                    onClickArchiveListener3.onClickDislike(archiveData3);
                    return;
                }
                return;
            case 4:
                OnClickArchiveListener onClickArchiveListener4 = this.f25131p;
                if (onClickArchiveListener4 != null) {
                    onClickArchiveListener4.uploadCloud();
                    return;
                }
                return;
            case 5:
                ArchiveData archiveData4 = this.f25130o;
                OnClickArchiveListener onClickArchiveListener5 = this.f25131p;
                if (onClickArchiveListener5 != null) {
                    onClickArchiveListener5.onClickRun(archiveData4);
                    return;
                }
                return;
            case 6:
                ArchiveData archiveData5 = this.f25130o;
                OnClickArchiveListener onClickArchiveListener6 = this.f25131p;
                if (onClickArchiveListener6 != null) {
                    onClickArchiveListener6.onClickMore(view, archiveData5);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        Drawable drawable;
        boolean z4;
        boolean z5;
        Drawable drawable2;
        String str;
        int i4;
        int i5;
        String str2;
        Drawable drawable3;
        String str3;
        String str4;
        int i6;
        int i7;
        int i8;
        String str5;
        Drawable drawable4;
        String str6;
        long j5;
        long j6;
        int i9;
        String str7;
        long j7;
        int i10;
        int i11;
        int i12;
        String str8;
        int i13;
        int i14;
        String str9;
        int i15;
        int i16;
        int i17;
        String str10;
        String str11;
        int i18;
        Context context;
        int i19;
        Context context2;
        int i20;
        long j8;
        Context context3;
        int i21;
        long j9;
        long j10;
        synchronized (this) {
            j4 = this.C;
            this.C = 0L;
        }
        ArchiveData archiveData = this.f25130o;
        long j11 = j4 & 5;
        if (j11 != 0) {
            if (archiveData != null) {
                i16 = archiveData.getStatus();
                String id = archiveData.getId();
                i17 = archiveData.getLikeCount();
                int isFirstRun = archiveData.getIsFirstRun();
                str10 = archiveData.getCoverLocation();
                int isLike = archiveData.getIsLike();
                int negativeCount = archiveData.getNegativeCount();
                str11 = archiveData.getArchiveDesc();
                int isUnLike = archiveData.getIsUnLike();
                String showText = archiveData.getShowText();
                i18 = archiveData.getDownloadCount();
                int showType = archiveData.getShowType();
                long addTime = archiveData.getAddTime();
                i10 = archiveData.getUserId();
                str9 = id;
                i15 = isFirstRun;
                i13 = isLike;
                i14 = negativeCount;
                i12 = isUnLike;
                str8 = showText;
                i11 = showType;
                j5 = addTime;
            } else {
                j5 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                str8 = null;
                i13 = 0;
                i14 = 0;
                str9 = null;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                str10 = null;
                str11 = null;
                i18 = 0;
            }
            boolean z6 = i16 == 8;
            String valueOf = String.valueOf(i17);
            boolean z7 = i15 == 1;
            boolean z8 = str10 == null;
            boolean z9 = i13 == 1;
            String valueOf2 = String.valueOf(i14);
            boolean z10 = i12 == 1;
            String valueOf3 = String.valueOf(i18);
            z4 = i11 == 1;
            z5 = j5 != 0;
            String valueOf4 = String.valueOf(i10);
            if (j11 != 0) {
                j4 |= z6 ? 4096L : 2048L;
            }
            if ((j4 & 5) != 0) {
                j4 |= z7 ? 256L : 128L;
            }
            if ((j4 & 5) != 0) {
                j4 |= z8 ? 1024L : 512L;
            }
            if ((j4 & 5) != 0) {
                j4 |= z9 ? 65536L : 32768L;
            }
            if ((j4 & 5) != 0) {
                j4 |= z10 ? 4194304L : PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
            }
            if ((j4 & 5) != 0) {
                j4 |= z4 ? 1048576L : PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
            }
            if ((j4 & 5) != 0) {
                j4 |= z5 ? PlaybackStateCompat.ACTION_SET_REPEAT_MODE : 131072L;
            }
            boolean equals = str9 != null ? str9.equals(String.valueOf(0)) : false;
            if ((j4 & 5) != 0) {
                j4 |= equals ? 16777216L : 8388608L;
            }
            Drawable drawable5 = AppCompatResources.getDrawable(this.f25127l.getContext(), z6 ? R.drawable.mod_start_normal_back : R.drawable.mod_download_normal_back);
            i6 = z7 ? 0 : 8;
            i7 = z8 ? 8 : 0;
            if (z9) {
                context = this.f25125j.getContext();
                i19 = R.drawable.cloud_parised_icon;
            } else {
                context = this.f25125j.getContext();
                i19 = R.drawable.cloud_parise_icon;
            }
            Drawable drawable6 = AppCompatResources.getDrawable(context, i19);
            if (z10) {
                context2 = this.f25118c.getContext();
                i20 = R.drawable.dislike_pressed;
            } else {
                context2 = this.f25118c.getContext();
                i20 = R.drawable.dislike_normal;
            }
            drawable2 = AppCompatResources.getDrawable(context2, i20);
            int i22 = equals ? 8 : 0;
            boolean equals2 = str9 != null ? str9.equals(valueOf4) : false;
            if ((524293 & j4) != 0) {
                j4 |= equals2 ? 16L : 8L;
            }
            if ((j4 & 5) != 0) {
                if (equals2) {
                    j9 = j4 | 64;
                    j10 = 16384;
                } else {
                    j9 = j4 | 32;
                    j10 = 8192;
                }
                j4 = j9 | j10;
            }
            int i23 = equals2 ? 8 : 0;
            int i24 = equals2 ? 0 : 8;
            if (equals2) {
                context3 = this.f25133r.getContext();
                j8 = j4;
                i21 = R.drawable.mod_archive_local_back;
            } else {
                j8 = j4;
                context3 = this.f25133r.getContext();
                i21 = R.drawable.mod_archive_item_back;
            }
            drawable = AppCompatResources.getDrawable(context3, i21);
            drawable4 = drawable5;
            str6 = valueOf;
            j4 = j8;
            j6 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            i5 = i22;
            i4 = i23;
            i8 = i24;
            str4 = valueOf3;
            str3 = valueOf2;
            drawable3 = drawable6;
            str2 = str11;
            String str12 = str10;
            str5 = str8;
            str = str12;
        } else {
            drawable = null;
            z4 = false;
            z5 = false;
            drawable2 = null;
            str = null;
            i4 = 0;
            i5 = 0;
            str2 = null;
            drawable3 = null;
            str3 = null;
            str4 = null;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            str5 = null;
            drawable4 = null;
            str6 = null;
            j5 = 0;
            j6 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        }
        String p4 = (j4 & j6) != 0 ? y.p(j5 * 1000) : null;
        long j12 = j4 & 5;
        if (j12 != 0) {
            i9 = z4 ? 8 : i4;
        } else {
            i9 = 0;
        }
        if (j12 != 0) {
            if (!z5) {
                p4 = "";
            }
            str7 = p4;
        } else {
            str7 = null;
        }
        if (j12 != 0) {
            j7 = j4;
            TextViewBindingAdapter.setText(this.f25117b, str2);
            ImageViewBindingAdapter.setImageDrawable(this.f25118c, drawable2);
            TextViewBindingAdapter.setText(this.f25119d, str3);
            TextViewBindingAdapter.setText(this.f25121f, str4);
            ViewBindingAdapter.setBackground(this.f25133r, drawable);
            this.f25134s.setVisibility(i4);
            this.f25135t.setVisibility(i6);
            this.f25136u.setVisibility(i7);
            SimpleDrawableViewKt.loadUrl(this.f25136u, str, null, 0);
            this.f25137v.setVisibility(i5);
            this.f25124i.setVisibility(i9);
            ImageViewBindingAdapter.setImageDrawable(this.f25125j, drawable3);
            TextViewBindingAdapter.setText(this.f25126k, str6);
            ViewBindingAdapter.setBackground(this.f25127l, drawable4);
            TextViewBindingAdapter.setText(this.f25127l, str5);
            this.f25128m.setVisibility(i8);
            TextViewBindingAdapter.setText(this.f25129n, str7);
        } else {
            j7 = j4;
        }
        if ((j7 & 4) != 0) {
            this.f25118c.setOnClickListener(this.A);
            this.f25136u.setOnClickListener(this.f25141z);
            this.f25124i.setOnClickListener(this.f25139x);
            this.f25125j.setOnClickListener(this.f25140y);
            this.f25127l.setOnClickListener(this.f25138w);
            this.f25128m.setOnClickListener(this.B);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListLocalItemBinding
    public void g(@Nullable OnClickArchiveListener onClickArchiveListener) {
        this.f25131p = onClickArchiveListener;
        synchronized (this) {
            this.C |= 2;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ModarchiveListLocalItemBinding
    public void h(@Nullable ArchiveData archiveData) {
        this.f25130o = archiveData;
        synchronized (this) {
            this.C |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.C = 4L;
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
            h((ArchiveData) obj);
        } else if (8 != i4) {
            return false;
        } else {
            g((OnClickArchiveListener) obj);
        }
        return true;
    }

    private ModarchiveListLocalItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (ImageView) objArr[9], (TextView) objArr[10], (ImageView) objArr[18], (TextView) objArr[6], (RelativeLayout) objArr[16], (TextView) objArr[17], (ImageView) objArr[15], (ImageView) objArr[7], (TextView) objArr[8], (TextView) objArr[13], (TextView) objArr[11], (TextView) objArr[4]);
        this.C = -1L;
        this.f25117b.setTag(null);
        this.f25118c.setTag(null);
        this.f25119d.setTag(null);
        this.f25121f.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f25132q = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f25133r = linearLayout2;
        linearLayout2.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[12];
        this.f25134s = relativeLayout;
        relativeLayout.setTag(null);
        View view2 = (View) objArr[14];
        this.f25135t = view2;
        view2.setTag(null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) objArr[2];
        this.f25136u = simpleDraweeView;
        simpleDraweeView.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[5];
        this.f25137v = linearLayout3;
        linearLayout3.setTag(null);
        this.f25124i.setTag(null);
        this.f25125j.setTag(null);
        this.f25126k.setTag(null);
        this.f25127l.setTag(null);
        this.f25128m.setTag(null);
        this.f25129n.setTag(null);
        setRootTag(view);
        this.f25138w = new a(this, 5);
        this.f25139x = new a(this, 6);
        this.f25140y = new a(this, 2);
        this.f25141z = new a(this, 1);
        this.A = new a(this, 3);
        this.B = new a(this, 4);
        invalidateAll();
    }
}
