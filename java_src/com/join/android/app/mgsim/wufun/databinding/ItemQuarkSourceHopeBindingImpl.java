package com.join.android.app.mgsim.wufun.databinding;

import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.generated.callback.a;
import com.join.kotlin.bindingadapter.SimpleDrawableViewKt;
import com.join.kotlin.bindingadapter.ViewBindingTextviewKt;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.SourceHopeItemClickProxy;
/* loaded from: classes3.dex */
public class ItemQuarkSourceHopeBindingImpl extends ItemQuarkSourceHopeBinding implements a.InterfaceC0321a {
    @Nullable

    /* renamed from: w  reason: collision with root package name */
    private static final ViewDataBinding.IncludedLayouts f22579w = null;
    @Nullable

    /* renamed from: x  reason: collision with root package name */
    private static final SparseIntArray f22580x = null;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    private final CardView f22581m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    private final ImageView f22582n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    private final ImageView f22583o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    private final View f22584p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    private final View.OnClickListener f22585q;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    private final View.OnClickListener f22586r;
    @Nullable

    /* renamed from: s  reason: collision with root package name */
    private final View.OnClickListener f22587s;
    @Nullable

    /* renamed from: t  reason: collision with root package name */
    private final View.OnClickListener f22588t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    private final View.OnClickListener f22589u;

    /* renamed from: v  reason: collision with root package name */
    private long f22590v;

    public ItemQuarkSourceHopeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, f22579w, f22580x));
    }

    @Override // com.join.android.app.mgsim.wufun.generated.callback.a.InterfaceC0321a
    public final void a(int i4, View view) {
        if (i4 == 1) {
            SourceListItemBean sourceListItemBean = this.f22577k;
            SourceHopeItemClickProxy sourceHopeItemClickProxy = this.f22578l;
            if (sourceHopeItemClickProxy != null) {
                sourceHopeItemClickProxy.onViewSourceClick(sourceListItemBean);
            }
        } else if (i4 == 2) {
            SourceListItemBean sourceListItemBean2 = this.f22577k;
            SourceHopeItemClickProxy sourceHopeItemClickProxy2 = this.f22578l;
            if (sourceHopeItemClickProxy2 != null) {
                sourceHopeItemClickProxy2.onWantClick(sourceListItemBean2);
            }
        } else if (i4 == 3) {
            SourceListItemBean sourceListItemBean3 = this.f22577k;
            SourceHopeItemClickProxy sourceHopeItemClickProxy3 = this.f22578l;
            if (sourceHopeItemClickProxy3 != null) {
                sourceHopeItemClickProxy3.onWantClick(sourceListItemBean3);
            }
        } else if (i4 == 4) {
            SourceListItemBean sourceListItemBean4 = this.f22577k;
            SourceHopeItemClickProxy sourceHopeItemClickProxy4 = this.f22578l;
            if (sourceHopeItemClickProxy4 != null) {
                sourceHopeItemClickProxy4.onWantClick(sourceListItemBean4);
            }
        } else if (i4 != 5) {
        } else {
            SourceListItemBean sourceListItemBean5 = this.f22577k;
            SourceHopeItemClickProxy sourceHopeItemClickProxy5 = this.f22578l;
            if (sourceHopeItemClickProxy5 != null) {
                sourceHopeItemClickProxy5.onUploadSourceClick(sourceListItemBean5);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j4;
        String str;
        String str2;
        Drawable drawable;
        int i4;
        String str3;
        boolean z4;
        int i5;
        String str4;
        String str5;
        String str6;
        int i6;
        String str7;
        int i7;
        int i8;
        boolean z5;
        Integer num;
        boolean z6;
        Integer num2;
        String str8;
        Integer num3;
        String str9;
        boolean z7;
        String str10;
        boolean z8;
        long j5;
        long j6;
        long j7;
        long j8;
        synchronized (this) {
            j4 = this.f22590v;
            this.f22590v = 0L;
        }
        SourceListItemBean sourceListItemBean = this.f22577k;
        float f5 = 0.0f;
        long j9 = j4 & 5;
        if (j9 != 0) {
            if (sourceListItemBean != null) {
                num = sourceListItemBean.getWanters();
                z6 = sourceListItemBean.wantVisible();
                num2 = sourceListItemBean.getStatus();
                str6 = sourceListItemBean.getTypeColor();
                str8 = sourceListItemBean.getTitle();
                num3 = sourceListItemBean.getWanted();
                str9 = sourceListItemBean.getAvatar();
                z7 = sourceListItemBean.hideUploadView();
                str10 = sourceListItemBean.getAuthorName();
                z8 = sourceListItemBean.withWant();
                str = sourceListItemBean.getTypeName();
            } else {
                str = null;
                num = null;
                z6 = false;
                num2 = null;
                str6 = null;
                str8 = null;
                num3 = null;
                str9 = null;
                z7 = false;
                str10 = null;
                z8 = false;
            }
            if (j9 != 0) {
                if (z6) {
                    j7 = j4 | 256;
                    j8 = 16384;
                } else {
                    j7 = j4 | 128;
                    j8 = 8192;
                }
                j4 = j7 | j8;
            }
            if ((j4 & 5) != 0) {
                j4 |= z7 ? 64L : 32L;
            }
            if ((j4 & 5) != 0) {
                j4 |= z8 ? 16L : 8L;
            }
            int safeUnbox = ViewDataBinding.safeUnbox(num);
            String str11 = num + "人想要";
            int i9 = z6 ? 0 : 8;
            float dimension = z6 ? this.f22572f.getResources().getDimension(R.dimen.wdp62) : this.f22572f.getResources().getDimension(R.dimen.wdp16);
            int safeUnbox2 = ViewDataBinding.safeUnbox(num2);
            int safeUnbox3 = ViewDataBinding.safeUnbox(num3);
            int i10 = z7 ? 8 : 0;
            int i11 = z8 ? 0 : 8;
            boolean z9 = safeUnbox > 0;
            boolean z10 = safeUnbox2 != 0;
            boolean z11 = safeUnbox2 == 0;
            boolean z12 = safeUnbox2 == 1;
            z4 = safeUnbox3 == 0;
            if ((j4 & 5) != 0) {
                j4 |= z9 ? 1024L : 512L;
            }
            if ((j4 & 5) != 0) {
                if (z11) {
                    j5 = j4 | 4096;
                    j6 = 65536;
                } else {
                    j5 = j4 | 2048;
                    j6 = 32768;
                }
                j4 = j5 | j6;
            }
            if ((j4 & 5) != 0) {
                j4 |= z12 ? PlaybackStateCompat.ACTION_SET_REPEAT_MODE : 131072L;
            }
            i4 = z9 ? 0 : 8;
            str5 = z11 ? "收集中" : "已实现";
            Drawable drawable2 = z11 ? AppCompatResources.getDrawable(this.f22576j.getContext(), R.drawable.shape_a8cf7c_83bf57_r_6) : AppCompatResources.getDrawable(this.f22576j.getContext(), R.drawable.shape_8fd2ff_77beff_58a5ff_r_6);
            int i12 = z12 ? 0 : 8;
            drawable = drawable2;
            i5 = i10;
            str4 = str9;
            i6 = i11;
            str7 = str10;
            i7 = i9;
            i8 = i12;
            z5 = z10;
            str2 = str11;
            f5 = dimension;
            str3 = str8;
        } else {
            str = null;
            str2 = null;
            drawable = null;
            i4 = 0;
            str3 = null;
            z4 = false;
            i5 = 0;
            str4 = null;
            str5 = null;
            str6 = null;
            i6 = 0;
            str7 = null;
            i7 = 0;
            i8 = 0;
            z5 = false;
        }
        if ((j4 & 4) != 0) {
            this.f22582n.setOnClickListener(this.f22588t);
            this.f22571e.setOnClickListener(this.f22589u);
            this.f22572f.setOnClickListener(this.f22587s);
            this.f22575i.setOnClickListener(this.f22585q);
        }
        if ((j4 & 5) != 0) {
            int i13 = i7;
            this.f22582n.setVisibility(i13);
            this.f22583o.setVisibility(i8);
            this.f22584p.setVisibility(i13);
            SimpleDrawableViewKt.loadUrl(this.f22568b, str4, null, 0);
            TextViewBindingAdapter.setText(this.f22569c, str7);
            TextViewBindingAdapter.setText(this.f22570d, str3);
            this.f22571e.setVisibility(i6);
            this.f22572f.setEnabled(z4);
            ViewBindingAdapter.setPaddingRight(this.f22572f, f5);
            TextViewBindingAdapter.setText(this.f22572f, str2);
            this.f22572f.setVisibility(i4);
            ViewBindingTextviewKt.textViewColorBinding(this.f22573g, str6);
            TextViewBindingAdapter.setText(this.f22573g, str);
            TextViewBindingAdapter.setText(this.f22574h, str5);
            this.f22575i.setVisibility(i5);
            ViewBindingAdapter.setBackground(this.f22576j, drawable);
            ViewBindingAdapter.setOnClick(this.f22576j, this.f22586r, z5);
        }
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemQuarkSourceHopeBinding
    public void g(@Nullable SourceHopeItemClickProxy sourceHopeItemClickProxy) {
        this.f22578l = sourceHopeItemClickProxy;
        synchronized (this) {
            this.f22590v |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.join.android.app.mgsim.wufun.databinding.ItemQuarkSourceHopeBinding
    public void h(@Nullable SourceListItemBean sourceListItemBean) {
        this.f22577k = sourceListItemBean;
        synchronized (this) {
            this.f22590v |= 1;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.f22590v != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f22590v = 4L;
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
            h((SourceListItemBean) obj);
        } else if (7 != i4) {
            return false;
        } else {
            g((SourceHopeItemClickProxy) obj);
        }
        return true;
    }

    private ItemQuarkSourceHopeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleDraweeView) objArr[6], (TextView) objArr[7], (TextView) objArr[2], (ImageView) objArr[11], (TextView) objArr[8], (TextView) objArr[1], (TextView) objArr[4], (TextView) objArr[12], (View) objArr[3]);
        this.f22590v = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f22581m = cardView;
        cardView.setTag(null);
        ImageView imageView = (ImageView) objArr[10];
        this.f22582n = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[5];
        this.f22583o = imageView2;
        imageView2.setTag(null);
        View view2 = (View) objArr[9];
        this.f22584p = view2;
        view2.setTag(null);
        this.f22568b.setTag(null);
        this.f22569c.setTag(null);
        this.f22570d.setTag(null);
        this.f22571e.setTag(null);
        this.f22572f.setTag(null);
        this.f22573g.setTag(null);
        this.f22574h.setTag(null);
        this.f22575i.setTag(null);
        this.f22576j.setTag(null);
        setRootTag(view);
        this.f22585q = new a(this, 5);
        this.f22586r = new a(this, 1);
        this.f22587s = new a(this, 2);
        this.f22588t = new a(this, 3);
        this.f22589u = new a(this, 4);
        invalidateAll();
    }
}
