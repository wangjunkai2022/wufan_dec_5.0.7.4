package org.cocos2dx.lib;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.view.WindowManager;
import com.umeng.analytics.pro.bm;
/* loaded from: classes7.dex */
public class Cocos2dxAccelerometer implements SensorEventListener {
    private static final String TAG = Cocos2dxAccelerometer.class.getSimpleName();
    private final Sensor mAccelerometer;
    private final Context mContext;
    private final int mNaturalOrientation;
    private final SensorManager mSensorManager;

    public Cocos2dxAccelerometer(Context context) {
        this.mContext = context;
        SensorManager sensorManager = (SensorManager) context.getSystemService(bm.ac);
        this.mSensorManager = sensorManager;
        this.mAccelerometer = sensorManager.getDefaultSensor(1);
        this.mNaturalOrientation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    public static native void onSensorChanged(float f5, float f6, float f7, long j4);

    public void disable() {
        this.mSensorManager.unregisterListener(this);
    }

    public void enable() {
        this.mSensorManager.registerListener(this, this.mAccelerometer, 1);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = fArr[2];
        int i4 = this.mContext.getResources().getConfiguration().orientation;
        if (i4 == 2 && this.mNaturalOrientation != 0) {
            float f8 = -f6;
            f6 = f5;
            f5 = f8;
        } else if (i4 == 1 && this.mNaturalOrientation != 0) {
            f6 = -f5;
            f5 = f6;
        }
        Cocos2dxGLSurfaceView.queueAccelerometer(f5, f6, f7, sensorEvent.timestamp);
    }

    public void setInterval(float f5) {
        if (Build.VERSION.SDK_INT < 11) {
            this.mSensorManager.registerListener(this, this.mAccelerometer, 1);
        } else {
            this.mSensorManager.registerListener(this, this.mAccelerometer, (int) (f5 * 100000.0f));
        }
    }
}
