package org.ppsspp.ppsspp;

import android.annotation.TargetApi;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bda.controller.Controller;
import com.bda.controller.KeyEvent;
import com.bda.controller.StateEvent;
import com.umeng.analytics.pro.bm;
/* loaded from: classes7.dex */
public class NativeGLView extends GLSurfaceView implements SensorEventListener, com.bda.controller.b {

    /* renamed from: n  reason: collision with root package name */
    private static String f72865n = "NativeGLView";

    /* renamed from: o  reason: collision with root package name */
    public static final int f72866o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f72867p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f72868q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f72869r = 3;

    /* renamed from: s  reason: collision with root package name */
    public static final int f72870s = 4;

    /* renamed from: t  reason: collision with root package name */
    public static final int f72871t = 5;

    /* renamed from: u  reason: collision with root package name */
    public static final int f72872u = 6;

    /* renamed from: v  reason: collision with root package name */
    public static final int f72873v = 7;

    /* renamed from: w  reason: collision with root package name */
    public static final int f72874w = 8;

    /* renamed from: x  reason: collision with root package name */
    private static final float f72875x = 15.0f;

    /* renamed from: b  reason: collision with root package name */
    private SensorManager f72876b;

    /* renamed from: c  reason: collision with root package name */
    private Sensor f72877c;

    /* renamed from: d  reason: collision with root package name */
    private Controller f72878d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f72879e;

    /* renamed from: f  reason: collision with root package name */
    NativeActivity f72880f;

    /* renamed from: g  reason: collision with root package name */
    private int f72881g;

    /* renamed from: h  reason: collision with root package name */
    private float f72882h;

    /* renamed from: i  reason: collision with root package name */
    private float f72883i;

    /* renamed from: j  reason: collision with root package name */
    private long f72884j;

    /* renamed from: k  reason: collision with root package name */
    private float f72885k;

    /* renamed from: l  reason: collision with root package name */
    private GestureDetector f72886l;

    /* renamed from: m  reason: collision with root package name */
    a f72887m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public interface a {
        void getMode(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (NativeGLView.this.f72881g == 7 || NativeGLView.this.f72881g == 8) {
                return;
            }
            NativeGLView.this.f72881g = 6;
            NativeGLView nativeGLView = NativeGLView.this;
            a aVar = nativeGLView.f72887m;
            if (aVar != null) {
                aVar.getMode(nativeGLView.f72881g);
            }
        }
    }

    public NativeGLView(NativeActivity nativeActivity) {
        super(nativeActivity);
        this.f72878d = null;
        this.f72879e = false;
        this.f72880f = nativeActivity;
        SensorManager sensorManager = (SensorManager) nativeActivity.getSystemService(bm.ac);
        this.f72876b = sensorManager;
        this.f72877c = sensorManager.getDefaultSensor(1);
        Controller controller = Controller.getInstance(nativeActivity);
        this.f72878d = controller;
        try {
            f.a(controller, nativeActivity);
            this.f72878d.setListener(this, new Handler());
        } catch (Exception unused) {
        }
        e();
    }

    private void c(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            float x4 = motionEvent.getX(0) - motionEvent.getX(1);
            float y2 = motionEvent.getY(0) - motionEvent.getY(1);
            float sqrt = (float) Math.sqrt((x4 * x4) + (y2 * y2));
            if (this.f72885k == 0.0f) {
                this.f72885k = sqrt;
            } else if (System.currentTimeMillis() - this.f72884j <= 50 || Math.abs(sqrt - this.f72885k) <= 15.0f) {
                return;
            } else {
                if (sqrt / this.f72885k > 1.0f) {
                    this.f72881g = 7;
                } else {
                    this.f72881g = 8;
                }
                this.f72884j = System.currentTimeMillis();
                this.f72882h = motionEvent.getX();
                this.f72883i = motionEvent.getY();
                this.f72885k = sqrt;
                return;
            }
        }
        float abs = Math.abs(motionEvent.getX() - this.f72882h);
        float abs2 = Math.abs(motionEvent.getY() - motionEvent.getY());
        if (System.currentTimeMillis() - this.f72884j > 1500 && Math.abs(abs) < 15.0f && Math.abs(abs2) < 15.0f) {
            this.f72881g = 6;
        } else if (System.currentTimeMillis() - this.f72884j > 50) {
            float x5 = motionEvent.getX() - this.f72882h;
            float y4 = motionEvent.getY() - this.f72883i;
            if (Math.abs(x5) > Math.abs(y4)) {
                if (x5 > 0.0f) {
                    this.f72881g = 3;
                } else {
                    this.f72881g = 2;
                }
            } else if (y4 > 0.0f) {
                this.f72881g = 5;
            } else {
                this.f72881g = 4;
            }
            this.f72884j = System.currentTimeMillis();
            this.f72882h = motionEvent.getX();
            this.f72883i = motionEvent.getY();
        }
    }

    @TargetApi(14)
    private int d(MotionEvent motionEvent, int i4) {
        return motionEvent.getToolType(i4);
    }

    private void e() {
        this.f72886l = new GestureDetector(getContext(), new b());
    }

    public void f() {
        Controller controller = this.f72878d;
        if (controller != null) {
            controller.exit();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 6) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == 0) goto L37
            r2 = 0
            if (r0 == r1) goto L2d
            r3 = 2
            if (r0 == r3) goto L20
            r5 = 3
            if (r0 == r5) goto L16
            r5 = 6
            if (r0 == r5) goto L2d
            goto L5c
        L16:
            r4.f72881g = r2
            org.ppsspp.ppsspp.NativeGLView$a r5 = r4.f72887m
            if (r5 == 0) goto L5c
            r5.getMode(r2)
            goto L5c
        L20:
            r4.c(r5)
            org.ppsspp.ppsspp.NativeGLView$a r5 = r4.f72887m
            if (r5 == 0) goto L5c
            int r0 = r4.f72881g
            r5.getMode(r0)
            goto L5c
        L2d:
            r4.f72881g = r2
            org.ppsspp.ppsspp.NativeGLView$a r5 = r4.f72887m
            if (r5 == 0) goto L5c
            r5.getMode(r2)
            goto L5c
        L37:
            android.view.GestureDetector r0 = r4.f72886l
            r0.onTouchEvent(r5)
            r4.f72881g = r1
            float r0 = r5.getRawX()
            r4.f72882h = r0
            float r5 = r5.getRawY()
            r4.f72883i = r5
            long r2 = java.lang.System.currentTimeMillis()
            r4.f72884j = r2
            r5 = 0
            r4.f72885k = r5
            org.ppsspp.ppsspp.NativeGLView$a r5 = r4.f72887m
            if (r5 == 0) goto L5c
            int r0 = r4.f72881g
            r5.getMode(r0)
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ppsspp.ppsspp.NativeGLView.g(android.view.MotionEvent):boolean");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // com.bda.controller.b
    public void onKeyEvent(KeyEvent keyEvent) {
        if (!this.f72879e) {
            switch (keyEvent.d()) {
                case 19:
                case 20:
                case 21:
                case 22:
                    return;
            }
        }
        int c5 = keyEvent.c();
        if (c5 == 0) {
            NativeApp.keyDown(10, keyEvent.d(), false);
        } else if (c5 != 1) {
        } else {
            NativeApp.keyUp(10, keyEvent.d());
        }
    }

    @Override // com.bda.controller.b
    public void onMotionEvent(com.bda.controller.MotionEvent motionEvent) {
        NativeApp.joystickAxis(10, 0, motionEvent.d(0));
        NativeApp.joystickAxis(10, 1, motionEvent.d(1));
        NativeApp.joystickAxis(10, 11, motionEvent.d(11));
        NativeApp.joystickAxis(10, 14, motionEvent.d(14));
        NativeApp.joystickAxis(10, 17, motionEvent.d(17));
        NativeApp.joystickAxis(10, 18, motionEvent.d(18));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        this.f72876b.unregisterListener(this);
        Controller controller = this.f72878d;
        if (controller != null) {
            controller.onPause();
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f72876b.registerListener(this, this.f72877c, 1);
        Controller controller = this.f72878d;
        if (controller != null) {
            controller.onResume();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        NativeApp.accelerometer(fArr[0], fArr[1], fArr[2]);
    }

    @Override // com.bda.controller.b
    public void onStateEvent(StateEvent stateEvent) {
        int d5 = stateEvent.d();
        if (d5 != 1) {
            if (d5 != 2) {
                return;
            }
            stateEvent.c();
            return;
        }
        int c5 = stateEvent.c();
        if (c5 == 0) {
            NativeApp.sendMessage("moga", "");
        } else if (c5 != 1) {
        } else {
            if (this.f72878d.getState(4) == 0) {
                NativeApp.sendMessage("moga", "Moga");
                return;
            }
            this.f72879e = true;
            NativeApp.sendMessage("moga", "MogaPro");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r6 != 6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        if (r10.getActionIndex() == r3) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053 A[SYNTHETIC] */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 14
            if (r0 < r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r3 = 0
            r4 = 0
        Ld:
            int r5 = r10.getPointerCount()
            if (r3 >= r5) goto L56
            int r5 = r10.getPointerId(r3)
            int r6 = r10.getActionMasked()
            r7 = 2
            if (r6 == 0) goto L33
            if (r6 == r1) goto L2b
            if (r6 == r7) goto L29
            r8 = 5
            if (r6 == r8) goto L33
            r7 = 6
            if (r6 == r7) goto L2b
            goto L3a
        L29:
            r7 = 1
            goto L3b
        L2b:
            int r6 = r10.getActionIndex()
            if (r6 != r3) goto L3a
            r7 = 4
            goto L3b
        L33:
            int r6 = r10.getActionIndex()
            if (r6 != r3) goto L3a
            goto L3b
        L3a:
            r7 = 0
        L3b:
            if (r7 == 0) goto L53
            if (r0 == 0) goto L46
            int r6 = r9.d(r10, r3)
            int r6 = r6 << 10
            r7 = r7 | r6
        L46:
            float r6 = r10.getX(r3)
            float r8 = r10.getY(r3)
            boolean r5 = org.ppsspp.ppsspp.NativeApp.touch(r6, r8, r7, r5)
            int r4 = r4 + r5
        L53:
            int r3 = r3 + 1
            goto Ld
        L56:
            if (r4 <= 0) goto L59
            goto L5a
        L59:
            r1 = 0
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ppsspp.ppsspp.NativeGLView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(a aVar) {
        this.f72887m = aVar;
    }
}
