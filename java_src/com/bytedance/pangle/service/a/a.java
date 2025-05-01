package com.bytedance.pangle.service.a;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.e;
import com.bytedance.pangle.g;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.pangle.plugin.PluginManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class a extends e.a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f8564c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<ComponentName, IBinder> f8567d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<ComponentName, b> f8568e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final C0222a<Intent> f8569f = new C0222a<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<ComponentName, com.bytedance.pangle.service.a> f8570g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final HashSet<ComponentName> f8571h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    private final HashSet<ComponentName> f8572i = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public final List<Runnable> f8566b = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final Handler f8565a = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.pangle.service.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0222a<T> extends HashMap<g, T> {
        C0222a() {
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final boolean containsKey(@Nullable Object obj) {
            if (super.containsKey(obj)) {
                return true;
            }
            if (obj instanceof g) {
                for (g gVar : keySet()) {
                    try {
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                    if (gVar.a() == ((g) obj).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        @Nullable
        public final T remove(@Nullable Object obj) {
            g gVar;
            T t4 = (T) super.remove(obj);
            if (t4 != null) {
                return t4;
            }
            Iterator<g> it2 = keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it2.next();
                try {
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
                if (gVar.a() == ((g) obj).a()) {
                    break;
                }
            }
            return (T) super.remove(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends HashSet<g> {
        b() {
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@Nullable Object obj) {
            if (super.contains(obj)) {
                return true;
            }
            if (obj instanceof g) {
                Iterator<g> it2 = iterator();
                while (it2.hasNext()) {
                    try {
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                    if (it2.next().a() == ((g) obj).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@Nullable Object obj) {
            if (super.remove(obj)) {
                return true;
            }
            g gVar = null;
            Iterator<g> it2 = iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                g next = it2.next();
                try {
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
                if (next.a() == ((g) obj).a()) {
                    gVar = next;
                    break;
                }
            }
            return super.remove(gVar);
        }
    }

    private a() {
    }

    public static a b() {
        if (f8564c == null) {
            synchronized (a.class) {
                if (f8564c == null) {
                    f8564c = new a();
                }
            }
        }
        return f8564c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized ComponentName c(Intent intent, String str) {
        ComponentName component = intent.getComponent();
        if (!this.f8570g.containsKey(component)) {
            com.bytedance.pangle.service.a d5 = d(intent, str);
            if (d5 == null) {
                return component;
            }
            this.f8570g.put(component, d5);
            this.f8571h.add(component);
        }
        com.bytedance.pangle.service.a aVar = this.f8570g.get(component);
        if (aVar != null) {
            aVar.onStartCommand(intent, 0, 0);
        }
        return component;
    }

    private static com.bytedance.pangle.service.a d(Intent intent, String str) {
        com.bytedance.pangle.service.a e5 = e(intent, str);
        if (e5 != null) {
            e5.onCreate();
        }
        return e5;
    }

    private static com.bytedance.pangle.service.a e(Intent intent, String str) {
        boolean z4;
        ComponentName component = intent.getComponent();
        Plugin plugin = PluginManager.getInstance().getPlugin(str);
        try {
            z4 = Zeus.loadPlugin(str);
        } catch (Exception e5) {
            e = e5;
            z4 = false;
        }
        try {
            com.bytedance.pangle.service.a aVar = (com.bytedance.pangle.service.a) plugin.mClassLoader.loadClass(component.getClassName()).newInstance();
            aVar.attach(plugin);
            return aVar;
        } catch (Exception e6) {
            e = e6;
            ZeusLogger.errReport(ZeusLogger.TAG_SERVICE, "newServiceInstance failed! loadPlugin = ".concat(String.valueOf(z4)), e);
            return null;
        }
    }

    @Override // com.bytedance.pangle.e.a, android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.bytedance.pangle.e
    public final ComponentName a(final Intent intent, final String str) {
        if (Zeus.hasInit()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return c(intent, str);
            }
            this.f8565a.post(new Runnable() { // from class: com.bytedance.pangle.service.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.c(intent, str);
                }
            });
        } else {
            this.f8566b.add(new Runnable() { // from class: com.bytedance.pangle.service.a.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.c(intent, str);
                }
            });
        }
        return intent.getComponent();
    }

    @Override // com.bytedance.pangle.e
    public final boolean b(final Intent intent, String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b().a(intent.getComponent());
            return true;
        }
        this.f8565a.post(new Runnable() { // from class: com.bytedance.pangle.service.a.a.3
            @Override // java.lang.Runnable
            public final void run() {
                a.b().a(intent.getComponent());
            }
        });
        return true;
    }

    private boolean b(ComponentName componentName) {
        if (!this.f8571h.contains(componentName)) {
            if (this.f8568e.get(componentName) == null) {
                c(componentName);
                return true;
            }
            return false;
        } else if (!this.f8572i.contains(componentName) || this.f8568e.containsKey(componentName)) {
            return false;
        } else {
            c(componentName);
            return true;
        }
    }

    private void c(ComponentName componentName) {
        com.bytedance.pangle.service.a remove = this.f8570g.remove(componentName);
        this.f8572i.remove(componentName);
        this.f8567d.remove(componentName);
        this.f8571h.remove(componentName);
        if (remove != null) {
            remove.onDestroy();
        }
    }

    public final synchronized boolean a(ComponentName componentName) {
        if (this.f8570g.containsKey(componentName)) {
            this.f8572i.add(componentName);
            return b(componentName);
        }
        return false;
    }

    @Override // com.bytedance.pangle.e
    public final boolean a(final Intent intent, final g gVar, final int i4, final String str) {
        if (Zeus.hasInit()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return a(intent, gVar, str);
            }
            this.f8565a.post(new Runnable() { // from class: com.bytedance.pangle.service.a.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        a.this.a(intent, gVar, str);
                    } catch (RemoteException e5) {
                        ZeusLogger.errReport(ZeusLogger.TAG_SERVICE, "bindService failed", e5);
                    }
                }
            });
            return true;
        }
        this.f8566b.add(new Runnable() { // from class: com.bytedance.pangle.service.a.a.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.a(intent, gVar, str);
                } catch (RemoteException e5) {
                    ZeusLogger.errReport(ZeusLogger.TAG_SERVICE, "pending bindService failed", e5);
                }
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(g gVar) {
        for (ComponentName componentName : this.f8568e.keySet()) {
            b bVar = this.f8568e.get(componentName);
            if (bVar.contains(gVar)) {
                bVar.remove(gVar);
                Intent remove = this.f8569f.remove(gVar);
                if (bVar.size() == 0) {
                    this.f8568e.remove(componentName);
                    com.bytedance.pangle.service.a aVar = this.f8570g.get(componentName);
                    if (aVar != null) {
                        aVar.onUnbind(remove);
                    }
                }
                b(componentName);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(Intent intent, g gVar, String str) {
        ComponentName component = intent.getComponent();
        if (!this.f8570g.containsKey(component)) {
            com.bytedance.pangle.service.a d5 = d(intent, str);
            if (d5 == null) {
                return false;
            }
            this.f8570g.put(component, d5);
        }
        com.bytedance.pangle.service.a aVar = this.f8570g.get(component);
        if (!this.f8567d.containsKey(component)) {
            this.f8567d.put(component, aVar.onBind(intent));
        }
        IBinder iBinder = this.f8567d.get(component);
        if (iBinder != null) {
            if (this.f8568e.containsKey(component)) {
                if (!this.f8568e.get(component).contains(gVar)) {
                    this.f8568e.get(component).add(gVar);
                    this.f8569f.put(gVar, intent);
                    gVar.a(component, iBinder);
                }
            } else {
                b bVar = new b();
                bVar.add(gVar);
                this.f8568e.put(component, bVar);
                this.f8569f.put(gVar, intent);
                gVar.a(component, iBinder);
            }
        }
        return true;
    }

    @Override // com.bytedance.pangle.e
    public final void a(final g gVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(gVar);
        } else {
            this.f8565a.post(new Runnable() { // from class: com.bytedance.pangle.service.a.a.6
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b(gVar);
                }
            });
        }
    }
}
