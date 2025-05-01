package com.kwad.components.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.kwad.sdk.R;
import com.kwad.sdk.n.l;
import com.kwad.sdk.utils.az;
/* loaded from: classes5.dex */
public class KsAutoCloseView extends LinearLayout implements View.OnClickListener {
    private static String Bf = "%s秒后自动关闭";
    private TextView acR;
    private ImageView acS;
    private a acT;
    private boolean acU;
    private boolean acV;
    private int countDown;

    /* loaded from: classes5.dex */
    public interface a {
        void df();

        void dg();
    }

    public KsAutoCloseView(Context context) {
        super(context);
        this.countDown = 10;
        this.acU = true;
        this.acV = false;
        P(context);
    }

    private void P(Context context) {
        l.inflate(context, R.layout.ksad_auto_close, this);
        this.acR = (TextView) findViewById(R.id.ksad_auto_close_text);
        ImageView imageView = (ImageView) findViewById(R.id.ksad_auto_close_btn);
        this.acS = imageView;
        imageView.setOnClickListener(this);
    }

    static /* synthetic */ int e(KsAutoCloseView ksAutoCloseView) {
        int i4 = ksAutoCloseView.countDown;
        ksAutoCloseView.countDown = i4 - 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i4) {
        this.acR.setText(String.format(Bf, Integer.valueOf(i4)));
    }

    public final void U(int i4) {
        if (i4 <= 0) {
            return;
        }
        this.countDown = i4;
        post(new az() { // from class: com.kwad.components.core.widget.KsAutoCloseView.1
            @Override // com.kwad.sdk.utils.az
            public final void doTask() {
                if (KsAutoCloseView.this.acU) {
                    if (!KsAutoCloseView.this.acV) {
                        if (KsAutoCloseView.this.countDown == 0) {
                            if (KsAutoCloseView.this.acT != null) {
                                KsAutoCloseView.this.acT.df();
                                return;
                            }
                            return;
                        }
                        KsAutoCloseView ksAutoCloseView = KsAutoCloseView.this;
                        ksAutoCloseView.x(ksAutoCloseView.countDown);
                        KsAutoCloseView.e(KsAutoCloseView.this);
                        KsAutoCloseView.this.postDelayed(this, 1000L);
                        return;
                    }
                    KsAutoCloseView.this.postDelayed(this, 1000L);
                }
            }
        });
    }

    public final void aY(boolean z4) {
        this.acU = z4;
        int i4 = z4 ? 0 : 8;
        TextView textView = this.acR;
        if (textView != null) {
            textView.setVisibility(i4);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.acT != null && view.equals(this.acS)) {
            this.acT.dg();
        }
    }

    public void setCountDownPaused(boolean z4) {
        this.acV = z4;
    }

    public void setViewListener(a aVar) {
        this.acT = aVar;
    }

    public KsAutoCloseView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.countDown = 10;
        this.acU = true;
        this.acV = false;
        P(context);
    }

    public KsAutoCloseView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.countDown = 10;
        this.acU = true;
        this.acV = false;
        P(context);
    }

    @RequiresApi(api = 21)
    public KsAutoCloseView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.countDown = 10;
        this.acU = true;
        this.acV = false;
        P(context);
    }
}
