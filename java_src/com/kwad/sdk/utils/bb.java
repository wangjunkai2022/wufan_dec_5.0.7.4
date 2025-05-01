package com.kwad.sdk.utils;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.service.ServiceProvider;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes5.dex */
public class bb {
    private static volatile bb aQT;
    private SensorManager aQU;
    private final Map<String, a> aQV = new ConcurrentHashMap();
    private final Map<String, CopyOnWriteArraySet<SensorEventListener>> aQW = new ConcurrentHashMap();

    /* loaded from: classes5.dex */
    public static class a implements SensorEventListener {
        private final WeakReference<bb> YG;
        private final String key;

        public a(String str, bb bbVar) {
            this.key = str;
            this.YG = new WeakReference<>(bbVar);
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            bb bbVar = this.YG.get();
            if (bbVar != null) {
                bbVar.a(this.key, sensorEvent);
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void onFailed();
    }

    private bb() {
    }

    private static String A(int i4, int i5) {
        return i4 + "_" + i5;
    }

    @NonNull
    public static bb Nn() {
        if (aQT == null) {
            synchronized (bb.class) {
                if (aQT == null) {
                    aQT = new bb();
                }
            }
        }
        return aQT;
    }

    @Nullable
    private Sensor ef(int i4) {
        if (getSensorManager() == null) {
            return null;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return null;
                    }
                    return getSensorManager().getDefaultSensor(9);
                }
                return getSensorManager().getDefaultSensor(1);
            }
            return getSensorManager().getDefaultSensor(4);
        }
        return getSensorManager().getDefaultSensor(10);
    }

    private static int eg(int i4) {
        if (i4 != -3) {
            if (i4 != -2) {
                return i4 != -1 ? 3 : 0;
            }
            return 1;
        }
        return 2;
    }

    private void gW(String str) {
        a aVar = this.aQV.get(str);
        if (aVar != null) {
            this.aQV.remove(str);
            getSensorManager().unregisterListener(aVar);
        }
    }

    private a gX(String str) {
        a aVar = this.aQV.get(str);
        if (aVar == null) {
            a aVar2 = new a(str, this);
            this.aQV.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private SensorManager getSensorManager() {
        if (this.aQU == null) {
            this.aQU = (SensorManager) ServiceProvider.getContext().getSystemService(com.umeng.analytics.pro.bm.ac);
        }
        return this.aQU;
    }

    public final synchronized void a(int i4, int i5, SensorEventListener sensorEventListener, b bVar) {
        Sensor ef = ef(i4);
        if (ef == null) {
            if (bVar != null) {
                bVar.onFailed();
            }
            return;
        }
        String A = A(i4, i5);
        CopyOnWriteArraySet<SensorEventListener> copyOnWriteArraySet = this.aQW.get(A);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        }
        copyOnWriteArraySet.add(sensorEventListener);
        if (copyOnWriteArraySet.size() == 1) {
            this.aQW.put(A, copyOnWriteArraySet);
            a(A, i5, ef);
        }
    }

    public final synchronized void a(SensorEventListener sensorEventListener) {
        for (Map.Entry<String, CopyOnWriteArraySet<SensorEventListener>> entry : this.aQW.entrySet()) {
            CopyOnWriteArraySet<SensorEventListener> value = entry.getValue();
            Iterator<SensorEventListener> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SensorEventListener next = it2.next();
                if (next.equals(sensorEventListener)) {
                    value.remove(next);
                    break;
                }
            }
            if (value.size() == 0) {
                gW(entry.getKey());
            }
        }
    }

    private void a(String str, int i4, Sensor sensor) {
        getSensorManager().registerListener(gX(str), sensor, eg(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, SensorEvent sensorEvent) {
        CopyOnWriteArraySet<SensorEventListener> copyOnWriteArraySet = this.aQW.get(str);
        if (copyOnWriteArraySet != null) {
            Iterator<SensorEventListener> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().onSensorChanged(sensorEvent);
            }
        }
    }
}
