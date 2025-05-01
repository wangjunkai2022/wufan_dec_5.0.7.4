package com.xinzhu.overmind.server.pm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.ArrayMap;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.xinzhu.overmind.server.pm.MindPackage;
import com.xinzhu.overmind.utils.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ComponentResolver.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    public static final String f68157g = "ComponentResolver";

    /* renamed from: h  reason: collision with root package name */
    static final Comparator<ResolveInfo> f68158h = new Comparator() { // from class: com.xinzhu.overmind.server.pm.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int j4;
            j4 = b.j((ResolveInfo) obj, (ResolveInfo) obj2);
            return j4;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Object f68159a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final C0758b f68160b = new C0758b();

    /* renamed from: c  reason: collision with root package name */
    private final c f68161c = new c();

    /* renamed from: d  reason: collision with root package name */
    private final C0758b f68162d = new C0758b();

    /* renamed from: e  reason: collision with root package name */
    private final d f68163e = new d();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayMap<String, MindPackage.g> f68164f = new ArrayMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ComponentResolver.java */
    /* renamed from: com.xinzhu.overmind.server.pm.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0758b extends g<MindPackage.ActivityIntentInfo, ResolveInfo> {

        /* renamed from: m  reason: collision with root package name */
        private final ArrayMap<ComponentName, MindPackage.b> f68165m;

        /* renamed from: n  reason: collision with root package name */
        private int f68166n;

        private C0758b() {
            this.f68165m = new ArrayMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(MindPackage.b bVar, String str, List<MindPackage.ActivityIntentInfo> list) {
            this.f68165m.put(bVar.a(), bVar);
            int size = bVar.f68072b.size();
            for (int i4 = 0; i4 < size; i4++) {
                MindPackage.ActivityIntentInfo activityIntentInfo = (MindPackage.ActivityIntentInfo) bVar.f68072b.get(i4);
                if (list != null && TTDownloadField.TT_ACTIVITY.equals(str)) {
                    list.add(activityIntentInfo);
                    b(activityIntentInfo);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M(MindPackage.b bVar, String str) {
            this.f68165m.remove(bVar.a());
            int size = bVar.f68072b.size();
            for (int i4 = 0; i4 < size; i4++) {
                x((MindPackage.ActivityIntentInfo) bVar.f68072b.get(i4));
            }
        }

        private MindPackageSettings N(MindPackageSettings mindPackageSettings) {
            return mindPackageSettings.f68129b != null ? i.get().getMindPackageSettingsInternal(mindPackageSettings.f68129b.f68045m) : mindPackageSettings;
        }

        @Override // com.xinzhu.overmind.server.pm.g
        protected void A(List<ResolveInfo> list) {
            Collections.sort(list, b.f68158h);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: H */
        public boolean q(String str, MindPackage.ActivityIntentInfo activityIntentInfo) {
            return str.equals(activityIntentInfo.f68058i.f68071a.f68045m);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: I */
        public MindPackage.ActivityIntentInfo[] r(int i4) {
            return new MindPackage.ActivityIntentInfo[i4];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: J */
        public ResolveInfo s(MindPackage.ActivityIntentInfo activityIntentInfo, int i4, int i5) {
            MindPackageSettings mindPackageSettingsInternal;
            MindPackage.b bVar = activityIntentInfo.f68058i;
            if (i.get().isComponentEnabled(bVar.f68070f, i5) && (mindPackageSettingsInternal = i.get().getMindPackageSettingsInternal(bVar.f68070f.packageName)) != null) {
                ActivityInfo e5 = j.e(bVar, this.f68166n, mindPackageSettingsInternal.i(i5), i5);
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = e5;
                if ((this.f68166n & 64) != 0) {
                    resolveInfo.filter = activityIntentInfo.f68059b;
                }
                resolveInfo.priority = activityIntentInfo.f68059b.getPriority();
                resolveInfo.preferredOrder = bVar.f68071a.f68046n;
                resolveInfo.match = i4;
                resolveInfo.isDefault = activityIntentInfo.f68060c;
                resolveInfo.labelRes = activityIntentInfo.f68061d;
                resolveInfo.nonLocalizedLabel = activityIntentInfo.f68062e;
                resolveInfo.icon = activityIntentInfo.f68063f;
                return resolveInfo;
            }
            return null;
        }

        List<ResolveInfo> K(Intent intent, String str, int i4, int i5) {
            this.f68166n = i4;
            return super.t(intent, str, (i4 & 65536) != 0, i5);
        }

        List<ResolveInfo> L(Intent intent, String str, int i4, List<MindPackage.b> list, int i5) {
            if (list == null) {
                return null;
            }
            this.f68166n = i4;
            boolean z4 = (i4 & 65536) != 0;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                ArrayList<II> arrayList2 = list.get(i6).f68072b;
                if (arrayList2 != 0 && arrayList2.size() > 0) {
                    MindPackage.ActivityIntentInfo[] activityIntentInfoArr = new MindPackage.ActivityIntentInfo[arrayList2.size()];
                    arrayList2.toArray(activityIntentInfoArr);
                    arrayList.add(activityIntentInfoArr);
                }
            }
            return super.u(intent, str, z4, arrayList, i5);
        }

        @Override // com.xinzhu.overmind.server.pm.g
        public List<ResolveInfo> t(Intent intent, String str, boolean z4, int i4) {
            this.f68166n = z4 ? 65536 : 0;
            return super.t(intent, str, z4, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ComponentResolver.java */
    /* loaded from: classes.dex */
    public static final class c extends g<MindPackage.ProviderIntentInfo, ResolveInfo> {

        /* renamed from: m  reason: collision with root package name */
        private final ArrayMap<ComponentName, MindPackage.g> f68167m;

        /* renamed from: n  reason: collision with root package name */
        private int f68168n;

        private c() {
            this.f68167m = new ArrayMap<>();
        }

        @Override // com.xinzhu.overmind.server.pm.g
        protected void A(List<ResolveInfo> list) {
            Collections.sort(list, b.f68158h);
        }

        void E(MindPackage.g gVar) {
            this.f68167m.put(gVar.a(), gVar);
            int size = gVar.f68072b.size();
            for (int i4 = 0; i4 < size; i4++) {
                b((MindPackage.ProviderIntentInfo) gVar.f68072b.get(i4));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: F */
        public boolean c(MindPackage.ProviderIntentInfo providerIntentInfo, List<ResolveInfo> list) {
            ProviderInfo providerInfo = providerIntentInfo.f68066i.f68079f;
            for (int size = list.size() - 1; size >= 0; size--) {
                ProviderInfo providerInfo2 = list.get(size).providerInfo;
                if (providerInfo2.name.equals(providerInfo.name) && providerInfo2.packageName.equals(providerInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: G */
        public boolean q(String str, MindPackage.ProviderIntentInfo providerIntentInfo) {
            return str.equals(providerIntentInfo.f68066i.f68071a.f68045m);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: H */
        public MindPackage.ProviderIntentInfo[] r(int i4) {
            return new MindPackage.ProviderIntentInfo[i4];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: I */
        public ResolveInfo s(MindPackage.ProviderIntentInfo providerIntentInfo, int i4, int i5) {
            MindPackageSettings mindPackageSettingsInternal;
            MindPackage.g gVar = providerIntentInfo.f68066i;
            if (i.get().isComponentEnabled(gVar.f68079f, i5) && (mindPackageSettingsInternal = i.get().getMindPackageSettingsInternal(gVar.f68079f.packageName)) != null) {
                ProviderInfo k4 = j.k(gVar, this.f68168n, mindPackageSettingsInternal.i(i5), i5);
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.providerInfo = k4;
                if ((this.f68168n & 64) != 0) {
                    resolveInfo.filter = providerIntentInfo.f68059b;
                }
                resolveInfo.priority = providerIntentInfo.f68059b.getPriority();
                resolveInfo.preferredOrder = gVar.f68071a.f68046n;
                resolveInfo.match = i4;
                resolveInfo.isDefault = providerIntentInfo.f68060c;
                resolveInfo.labelRes = providerIntentInfo.f68061d;
                resolveInfo.nonLocalizedLabel = providerIntentInfo.f68062e;
                resolveInfo.icon = providerIntentInfo.f68063f;
                return resolveInfo;
            }
            return null;
        }

        List<ResolveInfo> J(Intent intent, String str, int i4, int i5) {
            this.f68168n = i4;
            return super.t(intent, str, (i4 & 65536) != 0, i5);
        }

        List<ResolveInfo> K(Intent intent, String str, int i4, List<MindPackage.g> list, int i5) {
            if (list == null) {
                return null;
            }
            this.f68168n = i4;
            boolean z4 = (i4 & 65536) != 0;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                ArrayList<II> arrayList2 = list.get(i6).f68072b;
                if (arrayList2 != 0 && arrayList2.size() > 0) {
                    MindPackage.ProviderIntentInfo[] providerIntentInfoArr = new MindPackage.ProviderIntentInfo[arrayList2.size()];
                    arrayList2.toArray(providerIntentInfoArr);
                    arrayList.add(providerIntentInfoArr);
                }
            }
            return super.u(intent, str, z4, arrayList, i5);
        }

        void L(MindPackage.g gVar) {
            this.f68167m.remove(gVar.a());
            int size = gVar.f68072b.size();
            for (int i4 = 0; i4 < size; i4++) {
                x((MindPackage.ProviderIntentInfo) gVar.f68072b.get(i4));
            }
        }

        @Override // com.xinzhu.overmind.server.pm.g
        public List<ResolveInfo> t(Intent intent, String str, boolean z4, int i4) {
            this.f68168n = z4 ? 65536 : 0;
            return super.t(intent, str, z4, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ComponentResolver.java */
    /* loaded from: classes.dex */
    public static final class d extends g<MindPackage.ServiceIntentInfo, ResolveInfo> {

        /* renamed from: m  reason: collision with root package name */
        private final ArrayMap<ComponentName, MindPackage.h> f68169m;

        /* renamed from: n  reason: collision with root package name */
        private int f68170n;

        private d() {
            this.f68169m = new ArrayMap<>();
        }

        @Override // com.xinzhu.overmind.server.pm.g
        protected void A(List<ResolveInfo> list) {
            Collections.sort(list, b.f68158h);
        }

        void E(MindPackage.h hVar) {
            this.f68169m.put(hVar.a(), hVar);
            int size = hVar.f68072b.size();
            for (int i4 = 0; i4 < size; i4++) {
                b((MindPackage.ServiceIntentInfo) hVar.f68072b.get(i4));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: F */
        public boolean q(String str, MindPackage.ServiceIntentInfo serviceIntentInfo) {
            return str.equals(serviceIntentInfo.f68067i.f68071a.f68045m);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: G */
        public MindPackage.ServiceIntentInfo[] r(int i4) {
            return new MindPackage.ServiceIntentInfo[i4];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.server.pm.g
        /* renamed from: H */
        public ResolveInfo s(MindPackage.ServiceIntentInfo serviceIntentInfo, int i4, int i5) {
            MindPackageSettings mindPackageSettingsInternal;
            MindPackage.h hVar = serviceIntentInfo.f68067i;
            if (i.get().isComponentEnabled(hVar.f68080f, i5) && (mindPackageSettingsInternal = i.get().getMindPackageSettingsInternal(hVar.f68080f.packageName)) != null) {
                ServiceInfo l4 = j.l(hVar, this.f68170n, mindPackageSettingsInternal.i(i5), i5);
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.serviceInfo = l4;
                if ((this.f68170n & 64) != 0) {
                    resolveInfo.filter = serviceIntentInfo.f68059b;
                }
                resolveInfo.priority = serviceIntentInfo.f68059b.getPriority();
                resolveInfo.preferredOrder = hVar.f68071a.f68046n;
                resolveInfo.match = i4;
                resolveInfo.isDefault = serviceIntentInfo.f68060c;
                resolveInfo.labelRes = serviceIntentInfo.f68061d;
                resolveInfo.nonLocalizedLabel = serviceIntentInfo.f68062e;
                resolveInfo.icon = serviceIntentInfo.f68063f;
                return resolveInfo;
            }
            return null;
        }

        List<ResolveInfo> I(Intent intent, String str, int i4, int i5) {
            this.f68170n = i4;
            return super.t(intent, str, (i4 & 65536) != 0, i5);
        }

        List<ResolveInfo> J(Intent intent, String str, int i4, List<MindPackage.h> list, int i5) {
            if (list == null) {
                return null;
            }
            this.f68170n = i4;
            boolean z4 = (i4 & 65536) != 0;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                ArrayList<II> arrayList2 = list.get(i6).f68072b;
                if (arrayList2 != 0 && arrayList2.size() > 0) {
                    MindPackage.ServiceIntentInfo[] serviceIntentInfoArr = new MindPackage.ServiceIntentInfo[arrayList2.size()];
                    arrayList2.toArray(serviceIntentInfoArr);
                    arrayList.add(serviceIntentInfoArr);
                }
            }
            return super.u(intent, str, z4, arrayList, i5);
        }

        void K(MindPackage.h hVar) {
            this.f68169m.remove(hVar.a());
            int size = hVar.f68072b.size();
            for (int i4 = 0; i4 < size; i4++) {
                x((MindPackage.ServiceIntentInfo) hVar.f68072b.get(i4));
            }
        }

        @Override // com.xinzhu.overmind.server.pm.g
        public List<ResolveInfo> t(Intent intent, String str, boolean z4, int i4) {
            this.f68170n = z4 ? 65536 : 0;
            return super.t(intent, str, z4, i4);
        }
    }

    private void b(MindPackage mindPackage, List<MindPackage.ActivityIntentInfo> list) {
        int size = mindPackage.f68034b.size();
        for (int i4 = 0; i4 < size; i4++) {
            MindPackage.b bVar = mindPackage.f68034b.get(i4);
            ActivityInfo activityInfo = bVar.f68070f;
            activityInfo.processName = i.fixProcessName(mindPackage.f68051s.processName, activityInfo.processName);
            this.f68160b.G(bVar, TTDownloadField.TT_ACTIVITY, list);
        }
    }

    private void d(MindPackage mindPackage) {
        String[] split;
        int size = mindPackage.f68036d.size();
        for (int i4 = 0; i4 < size; i4++) {
            MindPackage.g gVar = mindPackage.f68036d.get(i4);
            ProviderInfo providerInfo = gVar.f68079f;
            providerInfo.processName = i.fixProcessName(mindPackage.f68051s.processName, providerInfo.processName);
            this.f68161c.E(gVar);
            String str = gVar.f68079f.authority;
            if (str != null) {
                for (String str2 : str.split(";")) {
                    if (!this.f68164f.containsKey(str2)) {
                        this.f68164f.put(str2, gVar);
                        ProviderInfo providerInfo2 = gVar.f68079f;
                        String str3 = providerInfo2.authority;
                        if (str3 == null) {
                            providerInfo2.authority = str2;
                        } else {
                            providerInfo2.authority = str3;
                        }
                    } else {
                        MindPackage.g gVar2 = this.f68164f.get(str2);
                        ComponentName a5 = (gVar2 == null || gVar2.a() == null) ? null : gVar2.a();
                        v.j(f68157g, "Skipping provider name " + str2 + " (in package " + mindPackage.f68051s.packageName + "): name already used by " + (a5 != null ? a5.getPackageName() : "?"));
                    }
                }
            }
        }
    }

    private void e(MindPackage mindPackage) {
        int size = mindPackage.f68035c.size();
        for (int i4 = 0; i4 < size; i4++) {
            MindPackage.b bVar = mindPackage.f68035c.get(i4);
            ActivityInfo activityInfo = bVar.f68070f;
            activityInfo.processName = i.fixProcessName(mindPackage.f68051s.processName, activityInfo.processName);
            this.f68162d.G(bVar, "receiver", null);
        }
    }

    private void f(MindPackage mindPackage) {
        int size = mindPackage.f68037e.size();
        for (int i4 = 0; i4 < size; i4++) {
            MindPackage.h hVar = mindPackage.f68037e.get(i4);
            ServiceInfo serviceInfo = hVar.f68080f;
            serviceInfo.processName = i.fixProcessName(mindPackage.f68051s.processName, serviceInfo.processName);
            this.f68163e.E(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int j(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
        int i4 = resolveInfo.priority;
        int i5 = resolveInfo2.priority;
        if (i4 != i5) {
            return i4 > i5 ? -1 : 1;
        }
        int i6 = resolveInfo.preferredOrder;
        int i7 = resolveInfo2.preferredOrder;
        if (i6 != i7) {
            return i6 > i7 ? -1 : 1;
        }
        boolean z4 = resolveInfo.isDefault;
        if (z4 != resolveInfo2.isDefault) {
            return z4 ? -1 : 1;
        }
        int i8 = resolveInfo.match;
        int i9 = resolveInfo2.match;
        if (i8 != i9) {
            return i8 > i9 ? -1 : 1;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo != null) {
            return activityInfo.packageName.compareTo(resolveInfo2.activityInfo.packageName);
        }
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            return serviceInfo.packageName.compareTo(resolveInfo2.serviceInfo.packageName);
        }
        ProviderInfo providerInfo = resolveInfo.providerInfo;
        if (providerInfo != null) {
            return providerInfo.packageName.compareTo(resolveInfo2.providerInfo.packageName);
        }
        return 0;
    }

    private void w(MindPackage mindPackage) {
        int size = mindPackage.f68034b.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f68160b.M(mindPackage.f68034b.get(i4), TTDownloadField.TT_ACTIVITY);
        }
        int size2 = mindPackage.f68036d.size();
        for (int i5 = 0; i5 < size2; i5++) {
            MindPackage.g gVar = mindPackage.f68036d.get(i5);
            this.f68161c.L(gVar);
            String str = gVar.f68079f.authority;
            if (str != null) {
                String[] split = str.split(";");
                for (int i6 = 0; i6 < split.length; i6++) {
                    if (this.f68164f.get(split[i6]) != null) {
                        this.f68164f.remove(split[i6]);
                    }
                }
            }
        }
        int size3 = mindPackage.f68035c.size();
        for (int i7 = 0; i7 < size3; i7++) {
            this.f68162d.M(mindPackage.f68035c.get(i7), "receiver");
        }
        int size4 = mindPackage.f68037e.size();
        for (int i8 = 0; i8 < size4; i8++) {
            this.f68163e.K(mindPackage.f68037e.get(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(MindPackage mindPackage) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f68159a) {
            b(mindPackage, arrayList);
            f(mindPackage);
            d(mindPackage);
            e(mindPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MindPackage.g g(ComponentName componentName) {
        MindPackage.g gVar;
        synchronized (this.f68159a) {
            gVar = (MindPackage.g) this.f68161c.f68167m.get(componentName);
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MindPackage.b getActivity(ComponentName componentName) {
        MindPackage.b bVar;
        synchronized (this.f68159a) {
            bVar = (MindPackage.b) this.f68160b.f68165m.get(componentName);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MindPackage.b h(ComponentName componentName) {
        MindPackage.b bVar;
        synchronized (this.f68159a) {
            bVar = (MindPackage.b) this.f68162d.f68165m.get(componentName);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MindPackage.h i(ComponentName componentName) {
        MindPackage.h hVar;
        synchronized (this.f68159a) {
            hVar = (MindPackage.h) this.f68163e.f68169m.get(componentName);
        }
        return hVar;
    }

    List<ResolveInfo> k(Intent intent, String str, int i4, int i5) {
        List<ResolveInfo> K;
        synchronized (this.f68159a) {
            K = this.f68160b.K(intent, str, i4, i5);
        }
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResolveInfo> l(Intent intent, String str, int i4, List<MindPackage.b> list, int i5) {
        List<ResolveInfo> L;
        synchronized (this.f68159a) {
            L = this.f68160b.L(intent, str, i4, list, i5);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResolveInfo> m(Intent intent, String str, int i4, int i5) {
        List<ResolveInfo> K;
        synchronized (this.f68159a) {
            K = this.f68160b.K(intent, str, i4, i5);
        }
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProviderInfo n(String str, int i4, int i5) {
        synchronized (this.f68159a) {
            MindPackage.g gVar = this.f68164f.get(str.split(";")[0]);
            if (gVar == null) {
                return null;
            }
            return j.k(gVar, i4, i.get().getMindPackageSettingsInternal(gVar.f68079f.packageName).i(i5), i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResolveInfo> o(Intent intent, String str, int i4, int i5) {
        List<ResolveInfo> J;
        synchronized (this.f68159a) {
            J = this.f68161c.J(intent, str, i4, i5);
        }
        return J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResolveInfo> p(Intent intent, String str, int i4, List<MindPackage.g> list, int i5) {
        List<ResolveInfo> K;
        synchronized (this.f68159a) {
            K = this.f68161c.K(intent, str, i4, list, i5);
        }
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ProviderInfo> q(String str, String str2, int i4, int i5) {
        ProviderInfo k4;
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f68159a) {
            for (int size = this.f68161c.f68167m.size() - 1; size >= 0; size--) {
                MindPackage.g gVar = (MindPackage.g) this.f68161c.f68167m.valueAt(size);
                MindPackageSettings mindPackageSettingsInternal = i.get().getMindPackageSettingsInternal(gVar.f68079f.packageName);
                if (mindPackageSettingsInternal != null) {
                    ProviderInfo providerInfo = gVar.f68079f;
                    if (providerInfo.authority != null && ((str == null || providerInfo.processName.equals(str)) && ((str2 == null || ((bundle = gVar.f68074d) != null && bundle.containsKey(str2))) && i.get().isEnabledAndMatchLPr(gVar.f68079f, i4, i5) && (k4 = j.k(gVar, i4, mindPackageSettingsInternal.i(i5), i5)) != null))) {
                        arrayList.add(k4);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResolveInfo> r(Intent intent, String str, int i4, int i5) {
        List<ResolveInfo> K;
        synchronized (this.f68159a) {
            K = this.f68162d.K(intent, str, i4, i5);
        }
        return K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResolveInfo> s(Intent intent, String str, int i4, List<MindPackage.b> list, int i5) {
        List<ResolveInfo> L;
        synchronized (this.f68159a) {
            L = this.f68162d.L(intent, str, i4, list, i5);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResolveInfo> t(Intent intent, String str, int i4, int i5) {
        List<ResolveInfo> I;
        synchronized (this.f68159a) {
            I = this.f68163e.I(intent, str, i4, i5);
        }
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResolveInfo> u(Intent intent, String str, int i4, List<MindPackage.h> list, int i5) {
        List<ResolveInfo> J;
        synchronized (this.f68159a) {
            J = this.f68163e.J(intent, str, i4, list, i5);
        }
        return J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(MindPackage mindPackage) {
        synchronized (this.f68159a) {
            w(mindPackage);
        }
    }
}
