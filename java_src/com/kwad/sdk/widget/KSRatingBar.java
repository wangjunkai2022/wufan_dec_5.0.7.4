package com.kwad.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kwad.sdk.R;
import java.math.BigDecimal;
/* loaded from: classes5.dex */
public class KSRatingBar extends LinearLayout {
    private boolean aTJ;
    private boolean aTK;
    private int aTL;
    private int aTM;
    private a aTN;
    private float aTO;
    private float aTP;
    private float aTQ;
    private Drawable aTR;
    private Drawable aTS;
    private Drawable aTT;
    private boolean aTU;

    /* renamed from: y  reason: collision with root package name */
    private int f55907y;

    /* loaded from: classes5.dex */
    public interface a {
    }

    public KSRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55907y = 1;
        this.aTU = false;
        setOrientation(0);
        setDividerDrawable(getResources().getDrawable(R.drawable.ksad_reward_apk_stars_divider));
        setShowDividers(2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_KSRatingBar);
        this.aTT = obtainStyledAttributes.getDrawable(R.styleable.ksad_KSRatingBar_ksad_starHalf);
        this.aTR = obtainStyledAttributes.getDrawable(R.styleable.ksad_KSRatingBar_ksad_starEmpty);
        this.aTS = obtainStyledAttributes.getDrawable(R.styleable.ksad_KSRatingBar_ksad_starFill);
        this.aTO = obtainStyledAttributes.getDimension(R.styleable.ksad_KSRatingBar_ksad_starImageWidth, 60.0f);
        this.aTP = obtainStyledAttributes.getDimension(R.styleable.ksad_KSRatingBar_ksad_starImageHeight, 120.0f);
        this.aTQ = obtainStyledAttributes.getDimension(R.styleable.ksad_KSRatingBar_ksad_starImagePadding, 15.0f);
        this.aTL = obtainStyledAttributes.getInteger(R.styleable.ksad_KSRatingBar_ksad_totalStarCount, 5);
        this.aTM = obtainStyledAttributes.getInteger(R.styleable.ksad_KSRatingBar_ksad_starCount, 5);
        this.aTJ = obtainStyledAttributes.getBoolean(R.styleable.ksad_KSRatingBar_ksad_clickable, true);
        this.aTK = obtainStyledAttributes.getBoolean(R.styleable.ksad_KSRatingBar_ksad_halfstart, false);
        for (int i4 = 0; i4 < this.aTL; i4++) {
            ImageView w4 = w(context, this.aTU);
            w4.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.sdk.widget.KSRatingBar.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (KSRatingBar.this.aTJ) {
                        if (KSRatingBar.this.aTK) {
                            if (KSRatingBar.this.f55907y % 2 == 0) {
                                KSRatingBar kSRatingBar = KSRatingBar.this;
                                kSRatingBar.setStar(kSRatingBar.indexOfChild(view) + 1.0f);
                            } else {
                                KSRatingBar kSRatingBar2 = KSRatingBar.this;
                                kSRatingBar2.setStar(kSRatingBar2.indexOfChild(view) + 0.5f);
                            }
                            if (KSRatingBar.this.aTN != null) {
                                if (KSRatingBar.this.f55907y % 2 == 0) {
                                    a unused = KSRatingBar.this.aTN;
                                    KSRatingBar.this.indexOfChild(view);
                                    KSRatingBar.e(KSRatingBar.this);
                                    return;
                                }
                                a unused2 = KSRatingBar.this.aTN;
                                KSRatingBar.this.indexOfChild(view);
                                KSRatingBar.e(KSRatingBar.this);
                                return;
                            }
                            return;
                        }
                        KSRatingBar kSRatingBar3 = KSRatingBar.this;
                        kSRatingBar3.setStar(kSRatingBar3.indexOfChild(view) + 1.0f);
                        if (KSRatingBar.this.aTN != null) {
                            a unused3 = KSRatingBar.this.aTN;
                            KSRatingBar.this.indexOfChild(view);
                        }
                    }
                }
            });
            addView(w4);
        }
        setStar(this.aTM);
    }

    static /* synthetic */ int e(KSRatingBar kSRatingBar) {
        int i4 = kSRatingBar.f55907y;
        kSRatingBar.f55907y = i4 + 1;
        return i4;
    }

    private ImageView w(Context context, boolean z4) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(Math.round(this.aTO), Math.round(this.aTP)));
        imageView.setPadding(0, 0, Math.round(this.aTQ), 0);
        if (z4) {
            imageView.setImageDrawable(this.aTR);
        } else {
            imageView.setImageDrawable(this.aTS);
        }
        return imageView;
    }

    public void setImagePadding(float f5) {
        this.aTQ = f5;
    }

    public void setOnRatingChangeListener(a aVar) {
        this.aTN = aVar;
    }

    public void setStar(float f5) {
        int i4 = (int) f5;
        float floatValue = new BigDecimal(Float.toString(f5)).subtract(new BigDecimal(Integer.toString(i4))).floatValue();
        int i5 = this.aTL;
        float f6 = i4 > i5 ? i5 : i4;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        for (int i6 = 0; i6 < f6; i6++) {
            ((ImageView) getChildAt(i6)).setImageDrawable(this.aTS);
        }
        if (floatValue > 0.0f) {
            ((ImageView) getChildAt(i4)).setImageDrawable(this.aTT);
            int i7 = this.aTL;
            while (true) {
                i7--;
                if (i7 < 1.0f + f6) {
                    return;
                }
                ((ImageView) getChildAt(i7)).setImageDrawable(this.aTR);
            }
        } else {
            int i8 = this.aTL;
            while (true) {
                i8--;
                if (i8 < f6) {
                    return;
                }
                ((ImageView) getChildAt(i8)).setImageDrawable(this.aTR);
            }
        }
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.aTR = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.aTS = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.aTT = drawable;
    }

    public void setStarImageHeight(float f5) {
        this.aTP = f5;
    }

    public void setStarImageWidth(float f5) {
        this.aTO = f5;
    }

    public void setTotalStarCount(int i4) {
        this.aTL = i4;
    }

    public void setmClickable(boolean z4) {
        this.aTJ = z4;
    }
}
