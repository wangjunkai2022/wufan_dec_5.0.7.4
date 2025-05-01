package com.join.mgps.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.join.mgps.dto.FirstScreenAdInteractionBean;
import com.umeng.analytics.pro.bm;
/* compiled from: ShakeListener.java */
/* loaded from: classes4.dex */
public class a implements SensorEventListener {

    /* renamed from: o  reason: collision with root package name */
    private static final int f54588o = 3000;

    /* renamed from: p  reason: collision with root package name */
    private static final int f54589p = 70;

    /* renamed from: q  reason: collision with root package name */
    private static final int f54590q = 0;

    /* renamed from: r  reason: collision with root package name */
    private static final int f54591r = 1;

    /* renamed from: s  reason: collision with root package name */
    private static final int f54592s = 2;

    /* renamed from: b  reason: collision with root package name */
    private SensorManager f54593b;

    /* renamed from: c  reason: collision with root package name */
    private Sensor f54594c;

    /* renamed from: d  reason: collision with root package name */
    private Sensor f54595d;

    /* renamed from: e  reason: collision with root package name */
    private InterfaceC0380a f54596e;

    /* renamed from: f  reason: collision with root package name */
    private Context f54597f;

    /* renamed from: g  reason: collision with root package name */
    private long f54598g;

    /* renamed from: h  reason: collision with root package name */
    float[] f54599h = new float[3];

    /* renamed from: i  reason: collision with root package name */
    float[] f54600i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    float[] f54601j = new float[3];

    /* renamed from: k  reason: collision with root package name */
    float[] f54602k = new float[3];

    /* renamed from: l  reason: collision with root package name */
    private int f54603l;

    /* renamed from: m  reason: collision with root package name */
    private int f54604m;

    /* renamed from: n  reason: collision with root package name */
    FirstScreenAdInteractionBean.ShakeConfBean f54605n;

    /* compiled from: ShakeListener.java */
    /* renamed from: com.join.mgps.shake.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0380a {
        void a();
    }

    public a(Context context) {
        this.f54597f = context;
        d();
    }

    public double[] a() {
        if (SensorManager.getRotationMatrix(this.f54600i, null, this.f54599h, this.f54601j)) {
            SensorManager.getOrientation(this.f54600i, this.f54602k);
            return new double[]{Math.toDegrees(this.f54602k[1]), Math.toDegrees(this.f54602k[2]), Math.toDegrees(this.f54602k[0])};
        }
        return new double[]{0.0d, 0.0d, 0.0d};
    }

    public void b(InterfaceC0380a interfaceC0380a) {
        this.f54596e = interfaceC0380a;
    }

    public void c(FirstScreenAdInteractionBean.ShakeConfBean shakeConfBean) {
        this.f54605n = shakeConfBean;
        if (shakeConfBean != null) {
            int acceleration = shakeConfBean.getAcceleration();
            this.f54603l = acceleration;
            if (acceleration < 5) {
                this.f54603l = 15;
            }
            this.f54604m = shakeConfBean.getRotation_angle();
        }
    }

    public void d() {
        SensorManager sensorManager = (SensorManager) this.f54597f.getSystemService(bm.ac);
        this.f54593b = sensorManager;
        if (sensorManager != null) {
            this.f54594c = sensorManager.getDefaultSensor(10);
            this.f54595d = this.f54593b.getDefaultSensor(2);
        }
        Sensor sensor = this.f54594c;
        if (sensor != null) {
            this.f54593b.registerListener(this, sensor, 2);
        }
        Sensor sensor2 = this.f54595d;
        if (sensor2 != null) {
            this.f54593b.registerListener(this, sensor2, 2);
        }
    }

    public void e() {
        this.f54593b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f54598g < 70) {
            return;
        }
        this.f54598g = currentTimeMillis;
        if (sensorEvent.sensor.getType() == 2) {
            this.f54601j = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 10) {
            this.f54599h = sensorEvent.values;
            double[] a5 = a();
            double d5 = a5[0];
            double d6 = a5[1];
            double d7 = a5[2];
            float[] fArr = sensorEvent.values;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            if (Math.sqrt((f5 * f5) + (f6 * f6) + (f7 * f7)) >= this.f54603l) {
                if (Math.abs(d5) >= this.f54604m || Math.abs(d6) >= this.f54604m) {
                    this.f54596e.a();
                }
            }
        }
    }
}
