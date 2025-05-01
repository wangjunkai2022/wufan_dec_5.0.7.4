package com.papa.controller.core;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.InputDevice;
import androidx.core.view.InputDeviceCompat;
import com.papa.controller.component.bluetooth.a;
import com.papa.controller.component.inputmanagercompat.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public class ControllerManager {

    /* renamed from: i  reason: collision with root package name */
    private static ControllerManager f58014i;

    /* renamed from: a  reason: collision with root package name */
    private final String f58015a = "ControllerManager";

    /* renamed from: b  reason: collision with root package name */
    private Context f58016b;

    /* renamed from: c  reason: collision with root package name */
    private com.papa.controller.component.bluetooth.a f58017c;

    /* renamed from: d  reason: collision with root package name */
    private a.d f58018d;

    /* renamed from: e  reason: collision with root package name */
    private com.papa.controller.component.inputmanagercompat.a f58019e;

    /* renamed from: f  reason: collision with root package name */
    private a.b f58020f;

    /* renamed from: g  reason: collision with root package name */
    private List<c> f58021g;

    /* renamed from: h  reason: collision with root package name */
    private List<d> f58022h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class ControllerManagerException extends Exception {
        public ControllerManagerException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements a.d {
        a() {
        }

        @Override // com.papa.controller.component.bluetooth.a.d
        public void a(BluetoothDevice bluetoothDevice) {
            ControllerManager.this.l();
        }

        @Override // com.papa.controller.component.bluetooth.a.d
        public void b(BluetoothDevice bluetoothDevice) {
            ControllerManager.this.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements a.b {
        b() {
        }

        @Override // com.papa.controller.component.inputmanagercompat.a.b
        public void onInputDeviceAdded(int i4) {
            ControllerManager.this.l();
        }

        @Override // com.papa.controller.component.inputmanagercompat.a.b
        public void onInputDeviceChanged(int i4) {
        }

        @Override // com.papa.controller.component.inputmanagercompat.a.b
        public void onInputDeviceRemoved(int i4) {
            ControllerManager.this.p();
        }
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private int f58026a;

        /* renamed from: b  reason: collision with root package name */
        private String f58027b;

        /* renamed from: c  reason: collision with root package name */
        private String f58028c;

        /* renamed from: d  reason: collision with root package name */
        private Object f58029d;

        public String a() {
            return this.f58028c;
        }

        public Object b() {
            return this.f58029d;
        }

        public int c() {
            return this.f58026a;
        }

        public String d() {
            return this.f58027b;
        }

        public void e(String str) {
            this.f58028c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            String str = this.f58027b;
            if (str == null ? cVar.f58027b == null : str.equals(cVar.f58027b)) {
                return this.f58028c.equals(cVar.f58028c);
            }
            return false;
        }

        public void f(Object obj) {
            this.f58029d = obj;
        }

        public void g(int i4) {
            this.f58026a = i4;
        }

        public void h(String str) {
            this.f58027b = str;
        }

        public int hashCode() {
            String str = this.f58027b;
            return ((str != null ? str.hashCode() : 0) * 31) + this.f58028c.hashCode();
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(c cVar);

        void b(c cVar);
    }

    public ControllerManager(Context context) {
        this.f58016b = context;
        try {
            i();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private Collection<c> g(List<c> list, List<c> list2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (c cVar : list) {
            hashMap.put(cVar.a(), cVar);
        }
        for (c cVar2 : list2) {
            hashMap2.put(cVar2.a(), cVar2);
        }
        Collection<c> values = hashMap.values();
        values.removeAll(hashMap2.values());
        return values;
    }

    public static ControllerManager h(Context context) {
        if (f58014i == null) {
            f58014i = new ControllerManager(context);
        }
        return f58014i;
    }

    private void i() throws Exception {
        if (this.f58016b != null) {
            if (this.f58021g == null) {
                this.f58021g = new ArrayList();
                return;
            }
            return;
        }
        throw new ControllerManagerException("Context is required!");
    }

    public static Object j(Object obj, String str, Class[] clsArr, Object... objArr) {
        try {
            return obj.getClass().getDeclaredMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private boolean k(int i4) {
        return (i4 & InputDeviceCompat.SOURCE_GAMEPAD) == 1025 || (i4 & InputDeviceCompat.SOURCE_JOYSTICK) == 16777232;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        try {
            for (c cVar : g(d(), this.f58021g)) {
                this.f58021g.add(cVar);
                m(cVar);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private synchronized void m(c cVar) {
        List<d> list = this.f58022h;
        if (list != null && list.size() != 0) {
            for (d dVar : this.f58022h) {
                if (dVar != null) {
                    dVar.a(cVar);
                }
            }
        }
    }

    private synchronized void n(c cVar) {
        List<d> list = this.f58022h;
        if (list != null && list.size() != 0) {
            for (d dVar : this.f58022h) {
                if (dVar != null) {
                    dVar.b(cVar);
                }
            }
        }
    }

    private synchronized void o() {
        List<c> d5 = d();
        try {
            for (c cVar : g(this.f58021g, d5)) {
                this.f58021g.remove(cVar);
                n(cVar);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            for (c cVar2 : g(d5, this.f58021g)) {
                this.f58021g.add(cVar2);
                m(cVar2);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        try {
            for (c cVar : g(this.f58021g, d())) {
                this.f58021g.remove(cVar);
                n(cVar);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void s() {
        Context context = this.f58016b;
        if (context == null) {
            return;
        }
        com.papa.controller.component.bluetooth.a aVar = new com.papa.controller.component.bluetooth.a(context);
        this.f58017c = aVar;
        try {
            if (aVar.p()) {
                a aVar2 = new a();
                this.f58018d = aVar2;
                this.f58017c.u(aVar2);
                this.f58017c.x();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void t() {
        try {
            if (this.f58019e == null) {
                this.f58019e = a.C0586a.a(this.f58016b);
            }
            if (this.f58019e != null) {
                b bVar = new b();
                this.f58020f = bVar;
                this.f58019e.c(bVar, new Handler());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void v() {
        com.papa.controller.component.bluetooth.a aVar = this.f58017c;
        if (aVar != null) {
            aVar.y();
        }
    }

    private void w() {
        com.papa.controller.component.inputmanagercompat.a aVar = this.f58019e;
        if (aVar != null) {
            aVar.b(this.f58020f);
        }
    }

    public void c(d dVar) {
        if (this.f58022h == null) {
            this.f58022h = new ArrayList();
        }
        this.f58022h.add(dVar);
    }

    public List<c> d() {
        boolean z4;
        List<BluetoothDevice> k4;
        ArrayList arrayList = new ArrayList();
        if (this.f58021g == null) {
            this.f58021g = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList<InputDevice> arrayList3 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        com.papa.controller.component.inputmanagercompat.a aVar = this.f58019e;
        int i4 = 16;
        if (aVar != null) {
            int[] e5 = aVar.e();
            int length = e5.length;
            int i5 = 0;
            while (i5 < length) {
                InputDevice d5 = this.f58019e.d(e5[i5]);
                if (d5 != null) {
                    String name = d5.getName();
                    int sources = d5.getSources();
                    try {
                        if (Build.VERSION.SDK_INT >= i4 && !((Boolean) j(d5, "isExternal", null, new Object[0])).booleanValue()) {
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    if (k(sources)) {
                        arrayList3.add(d5);
                        hashMap2.put(name, d5);
                    }
                }
                i5++;
                i4 = 16;
            }
        }
        try {
            com.papa.controller.component.bluetooth.a aVar2 = this.f58017c;
            if (aVar2 != null && aVar2.p() && (k4 = this.f58017c.k()) != null && k4.size() != 0) {
                for (BluetoothDevice bluetoothDevice : k4) {
                    if (bluetoothDevice.getBluetoothClass().getMajorDeviceClass() == 1280 && (Build.VERSION.SDK_INT < 30 || hashMap2.containsKey(bluetoothDevice.getName()))) {
                        arrayList2.add(bluetoothDevice);
                        hashMap.put(bluetoothDevice.getName(), bluetoothDevice);
                        String name2 = bluetoothDevice.getName();
                        String address = bluetoothDevice.getAddress();
                        c cVar = new c();
                        cVar.f(bluetoothDevice);
                        cVar.h(name2);
                        cVar.e(address);
                        arrayList.add(cVar);
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 16) {
                return arrayList;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        int size = arrayList3.size();
        int size2 = arrayList2.size();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashMap2.containsKey(((BluetoothDevice) it2.next()).getName())) {
                    z4 = false;
                    break;
                }
            } else {
                z4 = true;
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (size > size2) {
            if (z4 || size2 == 0) {
                for (InputDevice inputDevice : arrayList3) {
                    if (!hashMap.containsKey(inputDevice.getName())) {
                        arrayList4.add(inputDevice);
                        int size3 = arrayList4.size();
                        String name3 = inputDevice.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("OTG");
                        sb.append(size3 == 0 ? "" : size3 + "");
                        String sb2 = sb.toString();
                        c cVar2 = new c();
                        cVar2.f(inputDevice);
                        cVar2.h(name3);
                        cVar2.e(sb2);
                        arrayList.add(cVar2);
                    }
                }
            } else {
                int i6 = size - size2;
                for (int i7 = 0; i7 < i6; i7++) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("OTG");
                    sb3.append(i7 == 0 ? "" : i7 + "");
                    String sb4 = sb3.toString();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("OTG");
                    sb5.append(i7 == 0 ? "" : i7 + "");
                    String sb6 = sb5.toString();
                    c cVar3 = new c();
                    cVar3.h(sb4);
                    cVar3.e(sb6);
                    arrayList.add(cVar3);
                }
            }
        }
        return arrayList;
    }

    public int e() {
        List<c> list = this.f58021g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<c> f() {
        return this.f58021g;
    }

    public void q() {
        List<d> list = this.f58022h;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public void r(d dVar) {
        List<d> list = this.f58022h;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    public void u() {
        if (this.f58016b == null) {
            return;
        }
        s();
        t();
    }

    public void x() {
        v();
        w();
    }
}
