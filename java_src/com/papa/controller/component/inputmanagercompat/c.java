package com.papa.controller.component.inputmanagercompat;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.InputDevice;
import android.view.MotionEvent;
import com.papa.controller.component.inputmanagercompat.a;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
/* compiled from: InputManagerV9.java */
/* loaded from: classes5.dex */
public class c implements com.papa.controller.component.inputmanagercompat.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f57975d = "InputManagerV9";

    /* renamed from: e  reason: collision with root package name */
    private static final int f57976e = 101;

    /* renamed from: f  reason: collision with root package name */
    private static final long f57977f = 3000;

    /* renamed from: g  reason: collision with root package name */
    private static final int f57978g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static final int f57979h = 1;

    /* renamed from: i  reason: collision with root package name */
    private static final int f57980i = 2;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<long[]> f57981a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<a.b, Handler> f57982b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f57983c = new b(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InputManagerV9.java */
    /* loaded from: classes5.dex */
    public static class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private static Queue<a> f57984e = new ArrayDeque();

        /* renamed from: b  reason: collision with root package name */
        private int f57985b;

        /* renamed from: c  reason: collision with root package name */
        private int f57986c;

        /* renamed from: d  reason: collision with root package name */
        private a.b f57987d;

        private a() {
        }

        static a a(int i4, int i5, a.b bVar) {
            a poll = f57984e.poll();
            if (poll == null) {
                poll = new a();
            }
            poll.f57985b = i4;
            poll.f57986c = i5;
            poll.f57987d = bVar;
            return poll;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = this.f57985b;
            if (i4 == 0) {
                this.f57987d.onInputDeviceAdded(this.f57986c);
            } else if (i4 == 1) {
                this.f57987d.onInputDeviceChanged(this.f57986c);
            } else if (i4 == 2) {
                this.f57987d.onInputDeviceRemoved(this.f57986c);
            }
            f57984e.offer(this);
        }
    }

    /* compiled from: InputManagerV9.java */
    /* loaded from: classes5.dex */
    private static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f57988a;

        b(c cVar) {
            this.f57988a = new WeakReference<>(cVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c cVar;
            super.handleMessage(message);
            if (message.what == 101 && (cVar = this.f57988a.get()) != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int size = cVar.f57981a.size();
                for (int i4 = 0; i4 < size; i4++) {
                    long[] jArr = (long[]) cVar.f57981a.valueAt(i4);
                    if (jArr != null && elapsedRealtime - jArr[0] > c.f57977f) {
                        int keyAt = cVar.f57981a.keyAt(i4);
                        if (InputDevice.getDevice(keyAt) == null) {
                            cVar.h(2, keyAt);
                            cVar.f57981a.remove(keyAt);
                        } else {
                            jArr[0] = elapsedRealtime;
                        }
                    }
                }
                sendEmptyMessageDelayed(101, c.f57977f);
            }
        }
    }

    public c() {
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i4, int i5) {
        if (this.f57982b.isEmpty()) {
            return;
        }
        for (a.b bVar : this.f57982b.keySet()) {
            this.f57982b.get(bVar).post(a.a(i4, i5, bVar));
        }
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void a(MotionEvent motionEvent) {
        int deviceId = motionEvent.getDeviceId();
        long[] jArr = this.f57981a.get(deviceId);
        if (jArr == null) {
            h(0, deviceId);
            jArr = new long[1];
            this.f57981a.put(deviceId, jArr);
        }
        jArr[0] = SystemClock.elapsedRealtime();
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void b(a.b bVar) {
        this.f57982b.remove(bVar);
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void c(a.b bVar, Handler handler) {
        this.f57982b.remove(bVar);
        if (handler == null) {
            handler = this.f57983c;
        }
        this.f57982b.put(bVar, handler);
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public InputDevice d(int i4) {
        return InputDevice.getDevice(i4);
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public int[] e() {
        int[] deviceIds = InputDevice.getDeviceIds();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i4 : deviceIds) {
            if (this.f57981a.get(i4) == null) {
                this.f57981a.put(i4, new long[]{elapsedRealtime});
            }
        }
        return deviceIds;
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void onPause() {
        this.f57983c.removeMessages(101);
    }

    @Override // com.papa.controller.component.inputmanagercompat.a
    public void onResume() {
        this.f57983c.sendEmptyMessage(101);
    }
}
