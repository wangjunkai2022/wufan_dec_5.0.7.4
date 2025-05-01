package com.join.mgps.ptr;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.c0;
import com.join.mgps.ptr.PtrFrameLayout;
import com.join.mgps.ptr.header.DropBounceHeaderView;
import com.join.mgps.ptr.header.MaterialHeader;
import com.join.mgps.ptr.header.RentalsSunHeaderView;
import com.join.mgps.ptr.header.StoreHouseHeader;
/* loaded from: classes4.dex */
public class PtrClassicFrameLayout extends PtrFrameLayout {
    private Style R;
    private PtrUIHeader S;
    private PtrClassicDefaultHeader T;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum Style {
        Classical,
        DropBounce,
        Material,
        RentalsSun,
        StoreHouse
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53671a;

        static {
            int[] iArr = new int[Style.values().length];
            f53671a = iArr;
            try {
                iArr[Style.Classical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53671a[Style.DropBounce.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53671a[Style.Material.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53671a[Style.RentalsSun.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53671a[Style.StoreHouse.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PtrClassicFrameLayout(Context context) {
        super(context);
        this.R = Style.DropBounce;
        T();
    }

    private void N() {
        PtrClassicDefaultHeader ptrClassicDefaultHeader = new PtrClassicDefaultHeader(getContext());
        this.T = ptrClassicDefaultHeader;
        setHeaderView(ptrClassicDefaultHeader);
        e(this.T);
    }

    private void O() {
        Context context = getContext();
        DropBounceHeaderView dropBounceHeaderView = new DropBounceHeaderView(context);
        dropBounceHeaderView.setUp(this);
        dropBounceHeaderView.setColor(Color.parseColor("#4EA9E9"));
        dropBounceHeaderView.setLayoutParams(new PtrFrameLayout.LayoutParams(-1, 50));
        dropBounceHeaderView.setPadding(0, c0.a(context, 8.0f), 0, c0.a(context, 9.0f));
        setLoadingMinTime(1000);
        setDurationToCloseHeader(500);
        this.S = dropBounceHeaderView;
    }

    private void P() {
        MaterialHeader materialHeader = new MaterialHeader(getContext());
        materialHeader.setColorSchemeColors(getResources().getIntArray(R.array.materia_colors));
        materialHeader.setLayoutParams(new PtrFrameLayout.LayoutParams(-1, -2));
        materialHeader.setPadding(0, com.join.mgps.ptr.util.b.b(15.0f), 0, com.join.mgps.ptr.util.b.b(10.0f));
        materialHeader.setPtrFrameLayout(this);
        this.S = materialHeader;
    }

    private void Q() {
        RentalsSunHeaderView rentalsSunHeaderView = new RentalsSunHeaderView(getContext());
        rentalsSunHeaderView.setLayoutParams(new PtrFrameLayout.LayoutParams(-1, -2));
        rentalsSunHeaderView.setPadding(0, com.join.mgps.ptr.util.b.b(15.0f), 0, com.join.mgps.ptr.util.b.b(10.0f));
        rentalsSunHeaderView.setUp(this);
        this.S = rentalsSunHeaderView;
    }

    private void R() {
        StoreHouseHeader storeHouseHeader = new StoreHouseHeader(getContext());
        storeHouseHeader.setPadding(0, com.join.mgps.ptr.util.b.b(15.0f), 0, 0);
        storeHouseHeader.n(new String[]{"PAPA LOADING..."}[0]);
        setBackgroundColor(getResources().getColor(R.color.merchant_listing_name_color));
        this.S = storeHouseHeader;
    }

    private void S() {
        int i4 = this.A;
        if (i4 == 1) {
            this.R = Style.Classical;
        } else if (i4 == 2) {
            this.R = Style.DropBounce;
        } else if (i4 == 3) {
            this.R = Style.Material;
        } else if (i4 == 4) {
            this.R = Style.RentalsSun;
        } else if (i4 == 5) {
            this.R = Style.StoreHouse;
        } else {
            this.R = Style.DropBounce;
        }
    }

    private void T() {
        S();
        int i4 = a.f53671a[this.R.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                O();
            } else if (i4 == 3) {
                P();
            } else if (i4 == 4) {
                Q();
            } else if (i4 == 5) {
                R();
            }
            setHeaderView(this.S);
            e(this.S);
            return;
        }
        N();
    }

    public PtrClassicDefaultHeader getClassicHeader() {
        return this.T;
    }

    public PtrUIHeader getHeader() {
        return this.S;
    }

    public void setLastUpdateTimeKey(String str) {
        PtrClassicDefaultHeader ptrClassicDefaultHeader = this.T;
        if (ptrClassicDefaultHeader != null) {
            ptrClassicDefaultHeader.setLastUpdateTimeKey(str);
        }
    }

    public void setLastUpdateTimeRelateObject(Object obj) {
        PtrClassicDefaultHeader ptrClassicDefaultHeader = this.T;
        if (ptrClassicDefaultHeader != null) {
            ptrClassicDefaultHeader.setLastUpdateTimeRelateObject(obj);
        }
    }

    public PtrClassicFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = Style.DropBounce;
        T();
    }

    public PtrClassicFrameLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.R = Style.DropBounce;
        T();
    }
}
