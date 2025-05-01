package com.kwad.components.ad.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.kwad.sdk.R;
/* loaded from: classes5.dex */
public class AppScoreView extends LinearLayout {
    private ImageView Iu;
    private ImageView Iv;

    public AppScoreView(Context context) {
        this(context, null);
    }

    private void initView() {
        LinearLayout.inflate(getContext(), R.layout.ksad_app_score, this);
        this.Iu = (ImageView) findViewById(R.id.ksad_score_fourth);
        this.Iv = (ImageView) findViewById(R.id.ksad_score_fifth);
    }

    public void setScore(float f5) {
        double d5 = f5;
        if (d5 > 4.5d) {
            ImageView imageView = this.Iu;
            int i4 = R.drawable.ksad_star_checked;
            imageView.setImageResource(i4);
            this.Iv.setImageResource(i4);
        } else if (d5 > 4.0d) {
            this.Iu.setImageResource(R.drawable.ksad_star_checked);
            this.Iv.setImageResource(R.drawable.ksad_star_half);
        } else if (d5 > 3.5d) {
            this.Iu.setImageResource(R.drawable.ksad_star_checked);
            this.Iv.setImageResource(R.drawable.ksad_star_unchecked);
        } else if (d5 > 3.0d) {
            this.Iu.setImageResource(R.drawable.ksad_star_half);
            this.Iv.setImageResource(R.drawable.ksad_star_unchecked);
        } else if (d5 == 3.0d) {
            ImageView imageView2 = this.Iu;
            int i5 = R.drawable.ksad_star_unchecked;
            imageView2.setImageResource(i5);
            this.Iv.setImageResource(i5);
        }
    }

    public AppScoreView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppScoreView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initView();
    }
}
