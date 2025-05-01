package com.kwad.sdk.core.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.annotation.Nullable;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.utils.bb;
import java.util.Arrays;
/* loaded from: classes5.dex */
public final class c {
    @Nullable
    private com.kwad.sdk.core.g.a aBu;
    @Nullable
    private a aBv;
    private AdMatrixInfo.RotateInfo rotateInfo;
    private volatile boolean aBp = true;
    private long aBq = 0;
    private double aBr = 9.999999717180685E-10d;
    private double[] aBs = {0.0d, 0.0d, 0.0d};
    private double[] aBt = {0.0d, 0.0d, 0.0d};
    private final bb.b aBw = new bb.b() { // from class: com.kwad.sdk.core.g.c.1
        @Override // com.kwad.sdk.utils.bb.b
        public final void onFailed() {
            if (c.this.aBu != null) {
                c.this.aBu.ls();
            }
        }
    };

    /* loaded from: classes5.dex */
    class a implements SensorEventListener {
        private a() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            if (c.this.aBq != 0) {
                double d5 = sensorEvent.timestamp - c.this.aBq;
                double d6 = c.this.aBr;
                Double.isNaN(d5);
                double d7 = d5 * d6;
                double[] dArr = c.this.aBt;
                double d8 = dArr[0];
                double d9 = f5;
                Double.isNaN(d9);
                dArr[0] = d8 + Math.toDegrees(d9 * d7);
                double[] dArr2 = c.this.aBt;
                double d10 = dArr2[1];
                double d11 = f6;
                Double.isNaN(d11);
                dArr2[1] = d10 + Math.toDegrees(d11 * d7);
                double[] dArr3 = c.this.aBt;
                double d12 = dArr3[2];
                double d13 = f7;
                Double.isNaN(d13);
                dArr3[2] = d12 + Math.toDegrees(d13 * d7);
                c.this.Gb();
                c.this.Gc();
            }
            c.this.aBq = sensorEvent.timestamp;
        }

        /* synthetic */ a(c cVar, byte b5) {
            this();
        }
    }

    public c(AdMatrixInfo.RotateInfo rotateInfo) {
        this.rotateInfo = rotateInfo;
    }

    private void Ga() {
        Arrays.fill(this.aBs, 0.0d);
        Arrays.fill(this.aBt, 0.0d);
        this.aBq = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gb() {
        if (this.aBp) {
            if (Math.abs(this.aBt[0]) > Math.abs(this.aBs[0])) {
                this.aBs[0] = this.aBt[0];
            }
            if (Math.abs(this.aBt[1]) > Math.abs(this.aBs[1])) {
                this.aBs[1] = this.aBt[1];
            }
            if (Math.abs(this.aBt[2]) > Math.abs(this.aBs[2])) {
                this.aBs[2] = this.aBt[2];
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gc() {
        AdMatrixInfo.RotateInfo rotateInfo;
        if (!this.aBp || (rotateInfo = this.rotateInfo) == null || this.aBu == null) {
            return;
        }
        AdMatrixInfo.RotateDegreeInfo rotateDegreeInfo = rotateInfo.f55900x;
        if (!a(0, rotateDegreeInfo.rotateDegree, rotateDegreeInfo.direction)) {
            AdMatrixInfo.RotateDegreeInfo rotateDegreeInfo2 = this.rotateInfo.f55901y;
            if (!a(1, rotateDegreeInfo2.rotateDegree, rotateDegreeInfo2.direction)) {
                AdMatrixInfo.RotateDegreeInfo rotateDegreeInfo3 = this.rotateInfo.f55902z;
                if (!a(2, rotateDegreeInfo3.rotateDegree, rotateDegreeInfo3.direction)) {
                    return;
                }
            }
        }
        this.aBp = false;
        this.aBu.V(Gd());
    }

    private String Gd() {
        return "{\"x\": " + this.aBs[0] + ",\"y\":" + this.aBs[1] + ",\"z\":" + this.aBs[2] + "}";
    }

    public final void bv(Context context) {
        if (context == null) {
            return;
        }
        Ga();
        this.aBp = true;
        if (this.aBv == null) {
            this.aBv = new a(this, (byte) 0);
        }
        bb.Nn().a(2, 2, this.aBv, this.aBw);
    }

    public final synchronized void bw(Context context) {
        if (context != null) {
            if (this.aBv != null) {
                bb.Nn().a(this.aBv);
                this.aBv = null;
            }
        }
    }

    public final void a(AdMatrixInfo.RotateInfo rotateInfo) {
        this.rotateInfo = rotateInfo;
    }

    public final void a(@Nullable com.kwad.sdk.core.g.a aVar) {
        this.aBu = aVar;
    }

    private boolean a(int i4, double d5, int i5) {
        if (d5 <= 0.0d || Math.abs(this.aBt[i4]) < d5) {
            return false;
        }
        double[] dArr = this.aBt;
        return (dArr[i4] <= 0.0d || i5 != 1) && (dArr[i4] >= 0.0d || i5 != 2);
    }
}
