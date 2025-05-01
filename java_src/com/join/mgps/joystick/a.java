package com.join.mgps.joystick;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Toast;
import com.join.mgps.joystick.map.KeyCodes;
import com.join.mgps.joystick.map.KeyMap;
import com.papa.controller.core.ControllerManager;
import com.papa.controller.core.PadKeyEvent;
import com.papa.controller.core.PadMotionEvent;
import com.papa.controller.core.PadStateEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: KeyMapController.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: j  reason: collision with root package name */
    public static a f53432j;

    /* renamed from: a  reason: collision with root package name */
    private Context f53433a;

    /* renamed from: b  reason: collision with root package name */
    List<ControllerManager.c> f53434b;

    /* renamed from: c  reason: collision with root package name */
    protected KeyMap.EmuMap f53435c;

    /* renamed from: d  reason: collision with root package name */
    protected List<String> f53436d;

    /* renamed from: e  reason: collision with root package name */
    protected int[] f53437e = {0, 0, 0, 0};

    /* renamed from: f  reason: collision with root package name */
    private d f53438f = null;

    /* renamed from: g  reason: collision with root package name */
    com.papa.controller.core.d f53439g;

    /* renamed from: h  reason: collision with root package name */
    float f53440h;

    /* renamed from: i  reason: collision with root package name */
    float f53441i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeyMapController.java */
    /* renamed from: com.join.mgps.joystick.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0372a implements ControllerManager.d {
        C0372a() {
        }

        @Override // com.papa.controller.core.ControllerManager.d
        public void a(ControllerManager.c cVar) {
            if (a.this.f53439g.p() == 1) {
                a aVar = a.this;
                aVar.l(1, aVar.f53439g.q());
            }
        }

        @Override // com.papa.controller.core.ControllerManager.d
        public void b(ControllerManager.c cVar) {
            if (a.this.f53439g.p() == 0) {
                a aVar = a.this;
                aVar.l(0, aVar.f53439g.q());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeyMapController.java */
    /* loaded from: classes3.dex */
    public class b implements com.papa.controller.core.c {
        b() {
        }

        @Override // com.papa.controller.core.c
        public void D(int i4, PadKeyEvent padKeyEvent) {
            a.this.q(i4, padKeyEvent);
        }

        @Override // com.papa.controller.core.c
        public void I(PadStateEvent padStateEvent) {
        }

        @Override // com.papa.controller.core.c
        public void M(int i4, float f5, PadKeyEvent padKeyEvent) {
            a.this.q(i4, padKeyEvent);
        }

        @Override // com.papa.controller.core.c
        public void j(int i4, PadKeyEvent padKeyEvent) {
            a.this.q(i4, padKeyEvent);
        }

        @Override // com.papa.controller.core.c
        public void w(float f5, float f6, PadMotionEvent padMotionEvent) {
            a.this.r(padMotionEvent);
        }

        @Override // com.papa.controller.core.c
        public void x(float f5, float f6, PadMotionEvent padMotionEvent) {
            a.this.r(padMotionEvent);
        }
    }

    /* compiled from: KeyMapController.java */
    /* loaded from: classes3.dex */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Integer num = (Integer) valueAnimator.getAnimatedValue();
            a.this.z(num.intValue(), num.intValue());
        }
    }

    /* compiled from: KeyMapController.java */
    /* loaded from: classes3.dex */
    public interface d {
        void onGenericMotionEvent(int i4, float f5, float f6);

        void onKeyMap(int[] iArr, com.join.mgps.joystick.map.c cVar, KeyEvent keyEvent);

        void onVirtualKeyboard(boolean z4);
    }

    protected a() {
        if (this.f53435c == null) {
            return;
        }
        n();
    }

    private boolean A() {
        KeyMap.EmuMap emuMap = this.f53435c;
        return emuMap != null && emuMap == KeyMap.EmuMap.WSC;
    }

    private void E(boolean z4) {
        Context context = this.f53433a;
        if (context == null) {
            return;
        }
        if (z4) {
            Toast.makeText(context, "手柄已连接", 0).show();
        } else {
            Toast.makeText(context, "手柄已断开", 0).show();
        }
    }

    private boolean G(List<ControllerManager.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (this.f53434b == null) {
            if (arrayList.size() != 0 && k(arrayList) > 0) {
                return true;
            }
        } else {
            if (this.f53434b.size() < arrayList.size()) {
                arrayList.removeAll(this.f53434b);
                if (k(arrayList) > 0) {
                    return true;
                }
            } else {
                this.f53434b.removeAll(arrayList);
                if (k(this.f53434b) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private com.papa.controller.core.c b() {
        return new b();
    }

    public static a g() {
        if (f53432j == null) {
            f53432j = new a();
        }
        return f53432j;
    }

    private List<ControllerManager.c> j(List<ControllerManager.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (!m(list.get(i4).d())) {
                    arrayList.add(list.get(i4));
                }
            }
        }
        return arrayList;
    }

    private int k(List<ControllerManager.c> list) {
        return j(j(list)).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i4, List<ControllerManager.c> list) {
        if (i4 == 1 || i4 == 0) {
            try {
                if (G(list)) {
                    E(i4 == 1);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        if (this.f53434b == null) {
            this.f53434b = new ArrayList();
        }
        this.f53434b.clear();
        this.f53434b.addAll(list);
        boolean l4 = com.join.mgps.joystick.map.d.l(0, new Boolean[0]);
        boolean z4 = k(list) < 1 ? l4 & false : l4 & true;
        d dVar = this.f53438f;
        if (dVar != null) {
            dVar.onVirtualKeyboard(z4);
        }
    }

    private void n() {
        try {
            com.join.mgps.joystick.map.d.f(this.f53435c);
            String[] strArr = (String[]) Arrays.asList(com.join.mgps.joystick.map.d.c(this.f53435c.section).keySet().toArray()).toArray(new String[0]);
            if (strArr == null || strArr.length == 0) {
                strArr = this.f53435c.keysKey;
            }
            this.f53436d = Arrays.asList(strArr);
            B();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean o() {
        KeyMap.EmuMap emuMap = this.f53435c;
        return emuMap != null && emuMap == KeyMap.EmuMap.PSP;
    }

    private void t(KeyEvent keyEvent, com.join.mgps.joystick.map.c cVar) {
        int value;
        if (A()) {
            return;
        }
        if (o()) {
            if (keyEvent.getKeyCode() == 21) {
                value = KeyCodes.KEY_LEFT1.value();
            } else if (keyEvent.getKeyCode() == 19) {
                value = KeyCodes.KEY_UP1.value();
            } else if (keyEvent.getKeyCode() == 22) {
                value = KeyCodes.KEY_RIGHT1.value();
            } else {
                if (keyEvent.getKeyCode() == 20) {
                    value = KeyCodes.KEY_DOWN1.value();
                }
                value = 0;
            }
        } else if (keyEvent.getKeyCode() == 21) {
            value = KeyCodes.KEY_LEFT.value();
        } else if (keyEvent.getKeyCode() == 19) {
            value = KeyCodes.KEY_UP.value();
        } else if (keyEvent.getKeyCode() == 22) {
            value = KeyCodes.KEY_RIGHT.value();
        } else {
            if (keyEvent.getKeyCode() == 20) {
                value = KeyCodes.KEY_DOWN.value();
            }
            value = 0;
        }
        if (keyEvent.getAction() == 0) {
            int[] iArr = this.f53437e;
            iArr[0] = value | iArr[0];
            return;
        }
        int[] iArr2 = this.f53437e;
        iArr2[0] = (value ^ (-1)) & iArr2[0];
    }

    private void u(KeyEvent keyEvent, com.join.mgps.joystick.map.c cVar) {
        List<String> list;
        if (cVar == null) {
            return;
        }
        int parseInt = (TextUtils.isEmpty(cVar.b()) || (list = this.f53436d) == null || !list.contains(cVar.b())) ? 0 : Integer.parseInt(cVar.b());
        if (keyEvent.getAction() == 0) {
            int[] iArr = this.f53437e;
            iArr[0] = parseInt | iArr[0];
            return;
        }
        int[] iArr2 = this.f53437e;
        iArr2[0] = (parseInt ^ (-1)) & iArr2[0];
    }

    void B() {
        try {
            if (this.f53439g == null) {
                com.papa.controller.core.d dVar = new com.papa.controller.core.d(this.f53433a);
                this.f53439g = dVar;
                dVar.w(b(), new Handler());
                x();
            }
            com.papa.controller.core.d dVar2 = this.f53439g;
            if (dVar2 != null) {
                dVar2.B();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void C() {
        EaseBreathInterpolator easeBreathInterpolator = new EaseBreathInterpolator();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(1200L);
        ofInt.setInterpolator(easeBreathInterpolator);
        ofInt.addUpdateListener(new c());
        ofInt.start();
    }

    void D() {
        com.papa.controller.core.d dVar = this.f53439g;
        if (dVar != null) {
            dVar.F();
        }
    }

    public void F() {
        D();
    }

    public boolean c(MotionEvent motionEvent) {
        com.papa.controller.core.d dVar = this.f53439g;
        if (dVar != null) {
            return false | dVar.n(motionEvent);
        }
        return false;
    }

    public boolean d(KeyEvent keyEvent) {
        com.papa.controller.core.d dVar = this.f53439g;
        if (dVar != null) {
            return false | dVar.o(keyEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean e(com.papa.controller.core.PadMotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.e()
            float r8 = r8.f()
            float r1 = r7.f53440h
            float r2 = r0 * r1
            r3 = 0
            r4 = 1
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L23
            android.view.KeyEvent r1 = r7.h(r1, r4)
            r7.p(r1)
            android.view.KeyEvent r1 = r7.h(r0, r3)
            r7.p(r1)
        L21:
            r1 = 1
            goto L4a
        L23:
            float r2 = r0 * r1
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L49
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L39
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 != 0) goto L39
            android.view.KeyEvent r1 = r7.h(r0, r3)
            r7.p(r1)
            goto L21
        L39:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L49
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 == 0) goto L49
            android.view.KeyEvent r1 = r7.h(r1, r4)
            r7.p(r1)
            goto L21
        L49:
            r1 = 0
        L4a:
            float r2 = r7.f53441i
            float r6 = r8 * r2
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L63
            android.view.KeyEvent r2 = r7.i(r2, r4)
            r7.p(r2)
            android.view.KeyEvent r2 = r7.i(r8, r3)
            r7.p(r2)
        L60:
            r1 = r1 | 1
            goto L89
        L63:
            float r6 = r8 * r2
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L89
            int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r6 == 0) goto L79
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 != 0) goto L79
            android.view.KeyEvent r2 = r7.i(r8, r3)
            r7.p(r2)
            goto L60
        L79:
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L89
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 == 0) goto L89
            android.view.KeyEvent r2 = r7.i(r2, r4)
            r7.p(r2)
            goto L60
        L89:
            r7.f53440h = r0
            r7.f53441i = r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.joystick.a.e(com.papa.controller.core.PadMotionEvent):boolean");
    }

    boolean f(PadMotionEvent padMotionEvent) {
        int d5 = padMotionEvent.d();
        float e5 = padMotionEvent.e();
        float f5 = padMotionEvent.f();
        try {
            d dVar = this.f53438f;
            if (dVar != null) {
                dVar.onGenericMotionEvent(d5, e5, f5);
                return false;
            }
            return false;
        } catch (Exception e6) {
            e6.printStackTrace();
            return false;
        }
    }

    KeyEvent h(float f5, int i4) {
        return new KeyEvent(i4, f5 < 0.0f ? 21 : f5 > 0.0f ? 22 : 0);
    }

    KeyEvent i(float f5, int i4) {
        return new KeyEvent(i4, f5 < 0.0f ? 19 : f5 > 0.0f ? 20 : 0);
    }

    public boolean m(String str) {
        return com.join.mgps.joystick.map.a.b().f(str);
    }

    @Deprecated
    public boolean p(KeyEvent keyEvent) {
        try {
            if (keyEvent.getDevice() == null || !m(keyEvent.getDevice().getName())) {
                com.join.mgps.joystick.map.c b5 = com.join.mgps.joystick.map.d.b(0, keyEvent);
                t(keyEvent, b5);
                u(keyEvent, b5);
                d dVar = this.f53438f;
                if (dVar != null) {
                    dVar.onKeyMap(this.f53437e, b5, keyEvent);
                    return true;
                }
                return true;
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return true;
        }
    }

    boolean q(int i4, PadKeyEvent padKeyEvent) {
        if (m(padKeyEvent.c())) {
            return false;
        }
        p(s(padKeyEvent));
        return false;
    }

    boolean r(PadMotionEvent padMotionEvent) {
        if (m(padMotionEvent.c())) {
            return false;
        }
        padMotionEvent.e();
        padMotionEvent.f();
        if (padMotionEvent.d() == 200) {
            if (o()) {
                return f(padMotionEvent);
            }
            return e(padMotionEvent);
        } else if (padMotionEvent.d() == 201) {
            return f(padMotionEvent);
        } else {
            return false;
        }
    }

    KeyEvent s(PadKeyEvent padKeyEvent) {
        int e5 = padKeyEvent.e();
        int d5 = padKeyEvent.d();
        padKeyEvent.f();
        padKeyEvent.a();
        padKeyEvent.b();
        return new KeyEvent(d5, e5);
    }

    @Deprecated
    public void v() {
        com.papa.controller.core.d dVar = this.f53439g;
        if (dVar != null) {
            l(dVar.p() != 1 ? 0 : 1, this.f53439g.q());
        } else {
            B();
        }
    }

    public void w(Context context, KeyMap.EmuMap emuMap) {
        this.f53433a = context;
        this.f53435c = emuMap;
        n();
    }

    void x() {
        com.papa.controller.core.d dVar = this.f53439g;
        if (dVar != null) {
            dVar.v(new C0372a());
        }
    }

    public void y(d dVar) {
        this.f53438f = dVar;
    }

    public void z(int i4, int i5) {
        com.papa.controller.core.d dVar = this.f53439g;
        if (dVar != null) {
            dVar.y(i4, i5);
        }
    }
}
