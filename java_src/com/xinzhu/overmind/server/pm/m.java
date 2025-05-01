package com.xinzhu.overmind.server.pm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import com.join.mgps.receiver.BootReceiver_;
import com.xinzhu.overmind.server.user.MindUserHandle;
import com.xinzhu.overmind.utils.v;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: RegisteredServicesCache.java */
/* loaded from: classes.dex */
public abstract class m<V> {

    /* renamed from: l  reason: collision with root package name */
    private static final String f68205l = "PackageManager";

    /* renamed from: m  reason: collision with root package name */
    private static final boolean f68206m = false;

    /* renamed from: n  reason: collision with root package name */
    protected static final String f68207n = "registered_services";

    /* renamed from: a  reason: collision with root package name */
    public final Context f68208a;

    /* renamed from: b  reason: collision with root package name */
    private final String f68209b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68210c;

    /* renamed from: d  reason: collision with root package name */
    private final String f68211d;

    /* renamed from: e  reason: collision with root package name */
    protected final Object f68212e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<e<V>> f68213f = new SparseArray<>(2);

    /* renamed from: g  reason: collision with root package name */
    private n<V> f68214g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f68215h;

    /* renamed from: i  reason: collision with root package name */
    private final k f68216i;

    /* renamed from: j  reason: collision with root package name */
    private final com.xinzhu.overmind.server.user.b f68217j;

    /* renamed from: k  reason: collision with root package name */
    private final BroadcastReceiver f68218k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegisteredServicesCache.java */
    /* loaded from: classes.dex */
    public class a implements k {
        a() {
        }

        @Override // com.xinzhu.overmind.server.pm.k
        public void a(String str, int i4) {
            m.this.q(new Intent().setAction(BootReceiver_.f53985b), i4);
        }

        @Override // com.xinzhu.overmind.server.pm.k
        public void b(String str, int i4) {
            m.this.q(new Intent().setAction(BootReceiver_.f53984a), i4);
        }

        @Override // com.xinzhu.overmind.server.pm.k
        public void c(String str, int i4) {
            m.this.q(new Intent().setAction("android.intent.action.PACKAGE_CHANGED"), i4);
        }
    }

    /* compiled from: RegisteredServicesCache.java */
    /* loaded from: classes.dex */
    class b implements com.xinzhu.overmind.server.user.b {
        b() {
        }

        @Override // com.xinzhu.overmind.server.user.b
        public void a(int i4) {
            m.this.u(i4);
        }

        @Override // com.xinzhu.overmind.server.user.b
        public void b(int i4) {
        }

        @Override // com.xinzhu.overmind.server.user.b
        public void c(int i4) {
        }
    }

    /* compiled from: RegisteredServicesCache.java */
    /* loaded from: classes.dex */
    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.intent.extra.UID", -1);
            if (intExtra != -1) {
                m.this.q(intent, MindUserHandle.k(intExtra));
            }
        }
    }

    /* compiled from: RegisteredServicesCache.java */
    /* loaded from: classes.dex */
    public static class d<V> {

        /* renamed from: a  reason: collision with root package name */
        public final V f68222a;

        /* renamed from: b  reason: collision with root package name */
        public final ComponentInfo f68223b;

        /* renamed from: c  reason: collision with root package name */
        public final ComponentName f68224c;

        /* renamed from: d  reason: collision with root package name */
        public final int f68225d;

        public d(V v2, ComponentInfo componentInfo, ComponentName componentName) {
            this.f68222a = v2;
            this.f68223b = componentInfo;
            this.f68224c = componentName;
            this.f68225d = componentInfo != null ? componentInfo.applicationInfo.uid : -1;
        }

        public String toString() {
            return "ServiceInfo: " + this.f68222a + ", " + this.f68224c + ", uid " + this.f68225d;
        }
    }

    public m(Context context, String str, String str2, String str3) {
        a aVar = new a();
        this.f68216i = aVar;
        b bVar = new b();
        this.f68217j = bVar;
        this.f68218k = new c();
        this.f68208a = context;
        this.f68209b = str;
        this.f68210c = str2;
        this.f68211d = str3;
        i.get().addPackageMonitor(aVar);
        com.xinzhu.overmind.server.user.c.get().registerListener(bVar);
    }

    private boolean i(ArrayList<d<V>> arrayList, V v2) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList.get(i4).f68222a.equals(v2)) {
                return true;
            }
        }
        return false;
    }

    private boolean j(ArrayList<d<V>> arrayList, V v2, int i4) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            d<V> dVar = arrayList.get(i5);
            if (dVar.f68222a.equals(v2) && dVar.f68225d == i4) {
                return true;
            }
        }
        return false;
    }

    private boolean k(Integer[] numArr, Integer num) {
        return numArr == null || com.xinzhu.overmind.utils.d.f(numArr, num);
    }

    private e<V> l(int i4) {
        e<V> eVar = this.f68213f.get(i4);
        if (eVar == null) {
            e<V> eVar2 = new e<>(null);
            this.f68213f.put(i4, eVar2);
            return eVar2;
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void m(Integer[] numArr, int i4) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : x(i4)) {
            try {
                d w4 = w(resolveInfo);
                if (w4 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to load service info ");
                    sb.append(resolveInfo.serviceInfo);
                } else {
                    arrayList.add(w4);
                }
            } catch (IOException | XmlPullParserException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to load service info ");
                sb2.append(resolveInfo.toString());
            }
        }
        synchronized (this.f68212e) {
            e l4 = l(i4);
            boolean z4 = l4.f68227b == null;
            if (z4) {
                l4.f68227b = new HashMap();
            }
            Iterator it2 = arrayList.iterator();
            boolean z5 = false;
            while (it2.hasNext()) {
                d<V> dVar = (d) it2.next();
                Integer num = l4.f68226a.get(dVar.f68222a);
                if (num == null) {
                    l4.f68227b.put(dVar.f68222a, dVar);
                    l4.f68226a.put(dVar.f68222a, Integer.valueOf(dVar.f68225d));
                    if (!l4.f68228c || !z4) {
                        s(dVar.f68222a, i4, false);
                    }
                    z5 = true;
                } else if (num.intValue() == dVar.f68225d) {
                    l4.f68227b.put(dVar.f68222a, dVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (V v2 : l4.f68226a.keySet()) {
                if (!i(arrayList, v2) && k(numArr, l4.f68226a.get(v2))) {
                    arrayList2.add(v2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                l4.f68226a.remove(next);
                l4.f68227b.remove(next);
                s(next, i4, true);
                z5 = true;
            }
            if (z5) {
                t(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Intent intent, int i4) {
        String action = intent.getAction();
        boolean z4 = BootReceiver_.f53985b.equals(action) || "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action);
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (z4 && booleanExtra) {
            return;
        }
        int intExtra = intent.getIntExtra("android.intent.extra.UID", -1);
        m(intExtra > 0 ? new Integer[]{Integer.valueOf(intExtra)} : null, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(n nVar, Object obj, int i4, boolean z4) {
        try {
            nVar.a(obj, i4, z4);
        } catch (Throwable th) {
            v.n(f68205l, "Exception from onServiceChanged", th);
        }
    }

    private void s(final V v2, final int i4, final boolean z4) {
        final n<V> nVar;
        Handler handler;
        synchronized (this) {
            nVar = this.f68214g;
            handler = this.f68215h;
        }
        if (nVar == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xinzhu.overmind.server.pm.l
            @Override // java.lang.Runnable
            public final void run() {
                m.r(n.this, v2, i4, z4);
            }
        });
    }

    public void a(int i4) {
        synchronized (this.f68212e) {
            l(i4).f68227b = null;
            t(i4);
        }
    }

    public void b(int i4) {
        ApplicationInfo applicationInfo;
        synchronized (this.f68212e) {
            e<V> l4 = l(i4);
            if (l4.f68227b == null) {
                return;
            }
            ArrayList arrayList = null;
            for (d dVar : new ArrayList(l4.f68227b.values())) {
                long C0 = new com.xinzhu.haunted.android.content.pm.b(dVar.f68223b.applicationInfo).C0();
                if (i.get().getApplicationInfo(dVar.f68223b.packageName, 0, i4) == null || new com.xinzhu.haunted.android.content.pm.b(applicationInfo).C0() != C0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(dVar.f68225d));
                }
            }
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            m((Integer[]) arrayList.toArray(), i4);
        }
    }

    public void c(n<V> nVar, Handler handler) {
        if (handler == null) {
            handler = new Handler(this.f68208a.getMainLooper());
        }
        synchronized (this) {
            this.f68215h = handler;
            this.f68214g = nVar;
        }
    }

    public Collection<d<V>> e(int i4) {
        Collection<d<V>> unmodifiableCollection;
        synchronized (this.f68212e) {
            e<V> l4 = l(i4);
            if (l4.f68227b == null) {
                m(null, i4);
            }
            unmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(l4.f68227b.values()));
        }
        return unmodifiableCollection;
    }

    public void f(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr, int i4) {
        synchronized (this.f68212e) {
            e<V> l4 = l(i4);
            if (l4.f68227b != null) {
                printWriter.println("RegisteredServicesCache: " + l4.f68227b.size() + " services");
                Iterator<d<V>> it2 = l4.f68227b.values().iterator();
                while (it2.hasNext()) {
                    printWriter.println("  " + it2.next());
                }
            } else {
                printWriter.println("RegisteredServicesCache: services not loaded");
            }
        }
    }

    public n<V> n() {
        n<V> nVar;
        synchronized (this) {
            nVar = this.f68214g;
        }
        return nVar;
    }

    protected Map<V, Integer> o(int i4) {
        return l(i4).f68226a;
    }

    public d<V> p(V v2, int i4) {
        d<V> dVar;
        synchronized (this.f68212e) {
            e<V> l4 = l(i4);
            if (l4.f68227b == null) {
                m(null, i4);
            }
            dVar = l4.f68227b.get(v2);
        }
        return dVar;
    }

    protected void t(int i4) {
    }

    protected void u(int i4) {
        synchronized (this.f68212e) {
            this.f68213f.remove(i4);
        }
    }

    public abstract V v(Resources resources, String str, AttributeSet attributeSet);

    protected d<V> w(ResolveInfo resolveInfo) throws XmlPullParserException, IOException {
        XmlResourceParser loadXmlMetaData;
        XmlResourceParser xmlResourceParser = null;
        if (resolveInfo.serviceInfo == null) {
            return null;
        }
        ServiceInfo serviceInfo = new ServiceInfo(resolveInfo.serviceInfo);
        serviceInfo.applicationInfo = j.b(serviceInfo.applicationInfo);
        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
        PackageManager packageManager = this.f68208a.getPackageManager();
        try {
            try {
                loadXmlMetaData = serviceInfo.loadXmlMetaData(packageManager, this.f68210c);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (loadXmlMetaData != null) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(loadXmlMetaData);
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1 || next == 2) {
                        break;
                    }
                }
                String name = loadXmlMetaData.getName();
                if (this.f68211d.equals(name)) {
                    V v2 = v(packageManager.getResourcesForApplication(serviceInfo.applicationInfo), serviceInfo.packageName, asAttributeSet);
                    if (v2 == null) {
                        loadXmlMetaData.close();
                        return null;
                    }
                    d<V> dVar = new d<>(v2, resolveInfo.serviceInfo, componentName);
                    loadXmlMetaData.close();
                    return dVar;
                }
                throw new XmlPullParserException("Meta-data does not start with " + this.f68211d + " tag " + name);
            }
            throw new XmlPullParserException("No " + this.f68210c + " meta-data");
        } catch (PackageManager.NameNotFoundException unused2) {
            xmlResourceParser = loadXmlMetaData;
            throw new XmlPullParserException("Unable to load resources for pacakge " + serviceInfo.packageName);
        } catch (Throwable th2) {
            th = th2;
            xmlResourceParser = loadXmlMetaData;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    protected List<ResolveInfo> x(int i4) {
        Intent intent = new Intent(this.f68209b);
        return i.get().queryIntentServices(intent, 786560, intent.resolveTypeIfNeeded(this.f68208a.getContentResolver()), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RegisteredServicesCache.java */
    /* loaded from: classes.dex */
    public static class e<V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<V, Integer> f68226a;

        /* renamed from: b  reason: collision with root package name */
        Map<V, d<V>> f68227b;

        /* renamed from: c  reason: collision with root package name */
        boolean f68228c;

        private e() {
            this.f68226a = new HashMap();
            this.f68227b = null;
            this.f68228c = true;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
