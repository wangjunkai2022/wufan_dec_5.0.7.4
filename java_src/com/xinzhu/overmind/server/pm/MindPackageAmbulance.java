package com.xinzhu.overmind.server.pm;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.xinzhu.haunted.android.content.pm.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes6.dex */
public class MindPackageAmbulance implements Parcelable {
    private static final int B = 1;
    static final String C = "android.test.base";
    static final String D = "android.test.mock";
    static final String E = "android.test.runner";
    static final String F = "org.apache.http.legacy";

    /* renamed from: b  reason: collision with root package name */
    private boolean f68081b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<b> f68082c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<b> f68083d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<g> f68084e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<h> f68085f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<d> f68086g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<e> f68087h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<f> f68088i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<String> f68089j;

    /* renamed from: k  reason: collision with root package name */
    public Signature[] f68090k;

    /* renamed from: l  reason: collision with root package name */
    public PackageParser.SigningDetails f68091l;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f68092m;

    /* renamed from: n  reason: collision with root package name */
    public String f68093n;

    /* renamed from: o  reason: collision with root package name */
    public int f68094o;

    /* renamed from: p  reason: collision with root package name */
    public String f68095p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<String> f68096q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<String> f68097r;

    /* renamed from: s  reason: collision with root package name */
    public int f68098s;

    /* renamed from: t  reason: collision with root package name */
    public ApplicationInfo f68099t;

    /* renamed from: u  reason: collision with root package name */
    public String f68100u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f68101v;

    /* renamed from: w  reason: collision with root package name */
    public String f68102w;

    /* renamed from: x  reason: collision with root package name */
    public int f68103x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<ConfigurationInfo> f68104y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<FeatureInfo> f68105z;
    private static final String A = MindPackageAmbulance.class.getSimpleName();
    public static final Parcelable.Creator<MindPackageAmbulance> CREATOR = new a();

    /* loaded from: classes6.dex */
    public static class ActivityIntentInfo extends IntentInfo {

        /* renamed from: i  reason: collision with root package name */
        public b f68106i;

        public ActivityIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public ActivityIntentInfo(IntentInfo intentInfo) {
            super(intentInfo);
        }
    }

    /* loaded from: classes6.dex */
    public static class ProviderIntentInfo extends IntentInfo {

        /* renamed from: i  reason: collision with root package name */
        public g f68114i;

        public ProviderIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public ProviderIntentInfo(IntentInfo intentInfo) {
            super(intentInfo);
        }
    }

    /* loaded from: classes6.dex */
    public static class ServiceIntentInfo extends IntentInfo {

        /* renamed from: i  reason: collision with root package name */
        public h f68115i;

        public ServiceIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public ServiceIntentInfo(IntentInfo intentInfo) {
            super(intentInfo);
        }
    }

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindPackageAmbulance> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindPackageAmbulance createFromParcel(Parcel parcel) {
            return new MindPackageAmbulance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindPackageAmbulance[] newArray(int i4) {
            return new MindPackageAmbulance[i4];
        }
    }

    public MindPackageAmbulance(PackageParser.Package r6) {
        this.f68081b = false;
        this.f68082c = new ArrayList<>(0);
        this.f68083d = new ArrayList<>(0);
        this.f68084e = new ArrayList<>(0);
        this.f68085f = new ArrayList<>(0);
        this.f68086g = new ArrayList<>(0);
        this.f68087h = new ArrayList<>(0);
        this.f68088i = new ArrayList<>(0);
        this.f68089j = new ArrayList<>();
        this.f68104y = null;
        this.f68105z = null;
        this.f68082c = new ArrayList<>(r6.activities.size());
        Iterator<PackageParser.Activity> it2 = r6.activities.iterator();
        while (it2.hasNext()) {
            b bVar = new b(it2.next());
            Iterator it3 = bVar.f68120b.iterator();
            while (it3.hasNext()) {
                ((ActivityIntentInfo) it3.next()).f68106i = bVar;
            }
            bVar.f68119a = this;
            this.f68082c.add(bVar);
        }
        this.f68083d = new ArrayList<>(r6.receivers.size());
        Iterator<PackageParser.Activity> it4 = r6.receivers.iterator();
        while (it4.hasNext()) {
            b bVar2 = new b(it4.next());
            Iterator it5 = bVar2.f68120b.iterator();
            while (it5.hasNext()) {
                ((ActivityIntentInfo) it5.next()).f68106i = bVar2;
            }
            bVar2.f68119a = this;
            this.f68083d.add(bVar2);
        }
        this.f68084e = new ArrayList<>(r6.providers.size());
        Iterator<PackageParser.Provider> it6 = r6.providers.iterator();
        while (it6.hasNext()) {
            PackageParser.Provider next = it6.next();
            String[] split = next.info.authority.split(";");
            next.info.authority = split[0];
            g gVar = new g(next);
            Iterator it7 = gVar.f68120b.iterator();
            while (it7.hasNext()) {
                ((ProviderIntentInfo) it7.next()).f68114i = gVar;
            }
            gVar.f68119a = this;
            this.f68084e.add(gVar);
        }
        this.f68085f = new ArrayList<>(r6.services.size());
        Iterator<PackageParser.Service> it8 = r6.services.iterator();
        while (it8.hasNext()) {
            h hVar = new h(it8.next());
            Iterator it9 = hVar.f68120b.iterator();
            while (it9.hasNext()) {
                ((ServiceIntentInfo) it9.next()).f68115i = hVar;
            }
            hVar.f68119a = this;
            this.f68085f.add(hVar);
        }
        this.f68086g = new ArrayList<>(r6.instrumentation.size());
        Iterator<PackageParser.Instrumentation> it10 = r6.instrumentation.iterator();
        while (it10.hasNext()) {
            d dVar = new d(it10.next());
            dVar.f68119a = this;
            this.f68086g.add(dVar);
        }
        this.f68087h = new ArrayList<>(r6.permissions.size());
        Iterator<PackageParser.Permission> it11 = r6.permissions.iterator();
        while (it11.hasNext()) {
            e eVar = new e(it11.next());
            eVar.f68119a = this;
            this.f68087h.add(eVar);
        }
        this.f68088i = new ArrayList<>(r6.permissionGroups.size());
        Iterator<PackageParser.PermissionGroup> it12 = r6.permissionGroups.iterator();
        while (it12.hasNext()) {
            f fVar = new f(it12.next());
            fVar.f68119a = this;
            this.f68088i.add(fVar);
        }
        this.f68089j = r6.requestedPermissions;
        if (com.xinzhu.overmind.utils.e.u()) {
            PackageParser.SigningDetails signingDetails = r6.mSigningDetails;
            this.f68091l = signingDetails;
            this.f68090k = signingDetails.signatures;
        } else {
            this.f68090k = r6.mSignatures;
        }
        this.f68092m = r6.mAppMetaData;
        this.f68093n = r6.packageName;
        this.f68094o = r6.mPreferredOrder;
        this.f68095p = r6.mSharedUserId;
        this.f68096q = r6.usesLibraries;
        this.f68097r = r6.usesOptionalLibraries;
        this.f68098s = r6.mVersionCode;
        ApplicationInfo applicationInfo = r6.applicationInfo;
        this.f68099t = applicationInfo;
        this.f68100u = r6.mVersionName;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f68101v = applicationInfo.splitNames;
        }
        this.f68102w = r6.baseCodePath;
        this.f68103x = r6.mSharedUserLabel;
        this.f68104y = r6.configPreferences;
        this.f68105z = r6.reqFeatures;
    }

    private boolean c(String str) {
        return this.f68096q.contains(str) || this.f68097r.contains(str);
    }

    protected void a(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f68082c = new ArrayList<>(readInt);
        com.xinzhu.overmind.b.c(A, "how much act " + readInt);
        while (true) {
            int i4 = readInt - 1;
            if (readInt <= 0) {
                break;
            }
            b bVar = new b(parcel);
            Iterator it2 = bVar.f68120b.iterator();
            while (it2.hasNext()) {
                ((ActivityIntentInfo) it2.next()).f68106i = bVar;
            }
            bVar.f68119a = this;
            this.f68082c.add(bVar);
            readInt = i4;
        }
        int readInt2 = parcel.readInt();
        this.f68083d = new ArrayList<>(readInt2);
        while (true) {
            int i5 = readInt2 - 1;
            if (readInt2 <= 0) {
                break;
            }
            b bVar2 = new b(parcel);
            Iterator it3 = bVar2.f68120b.iterator();
            while (it3.hasNext()) {
                ((ActivityIntentInfo) it3.next()).f68106i = bVar2;
            }
            bVar2.f68119a = this;
            this.f68083d.add(bVar2);
            readInt2 = i5;
        }
        int readInt3 = parcel.readInt();
        this.f68084e = new ArrayList<>(readInt3);
        while (true) {
            int i6 = readInt3 - 1;
            if (readInt3 <= 0) {
                break;
            }
            g gVar = new g(parcel);
            gVar.f68127f.authority = gVar.f68127f.authority.split(";")[0];
            Iterator it4 = gVar.f68120b.iterator();
            while (it4.hasNext()) {
                ((ProviderIntentInfo) it4.next()).f68114i = gVar;
            }
            gVar.f68119a = this;
            this.f68084e.add(gVar);
            readInt3 = i6;
        }
        int readInt4 = parcel.readInt();
        this.f68085f = new ArrayList<>(readInt4);
        while (true) {
            int i7 = readInt4 - 1;
            if (readInt4 <= 0) {
                break;
            }
            h hVar = new h(parcel);
            Iterator it5 = hVar.f68120b.iterator();
            while (it5.hasNext()) {
                ((ServiceIntentInfo) it5.next()).f68115i = hVar;
            }
            hVar.f68119a = this;
            this.f68085f.add(hVar);
            readInt4 = i7;
        }
        int readInt5 = parcel.readInt();
        this.f68086g = new ArrayList<>(readInt5);
        while (true) {
            int i8 = readInt5 - 1;
            if (readInt5 <= 0) {
                break;
            }
            d dVar = new d(parcel);
            dVar.f68119a = this;
            this.f68086g.add(dVar);
            readInt5 = i8;
        }
        int readInt6 = parcel.readInt();
        this.f68087h = new ArrayList<>(readInt6);
        while (true) {
            int i9 = readInt6 - 1;
            if (readInt6 <= 0) {
                break;
            }
            e eVar = new e(parcel);
            eVar.f68119a = this;
            this.f68087h.add(eVar);
            readInt6 = i9;
        }
        int readInt7 = parcel.readInt();
        this.f68088i = new ArrayList<>(readInt7);
        while (true) {
            int i10 = readInt7 - 1;
            if (readInt7 <= 0) {
                break;
            }
            f fVar = new f(parcel);
            fVar.f68119a = this;
            this.f68088i.add(fVar);
            readInt7 = i10;
        }
        parcel.readStringList(this.f68089j);
        String str = A;
        com.xinzhu.overmind.b.c(str, "permissions " + this.f68089j);
        if (com.xinzhu.overmind.utils.e.u()) {
            try {
                int dataPosition = parcel.dataPosition();
                String readString = parcel.readString();
                com.xinzhu.overmind.b.c(str, "what class " + readString);
                parcel.setDataPosition(dataPosition);
                if (readString.contains("MindPackage$SigningDetails")) {
                    com.xinzhu.overmind.b.c(str, "Legacy signing details found, solve it");
                    j.a n4 = j.a.n(((SigningDetails) parcel.readParcelable(SigningDetails.class.getClassLoader())).f68117b, 0);
                    Objects.requireNonNull(n4);
                    this.f68091l = (PackageParser.SigningDetails) n4.f66534a;
                } else {
                    this.f68091l = com.xinzhu.overmind.utils.helpers.k.a(parcel);
                    com.xinzhu.overmind.b.c(str, "trying to restore signing details corrupt " + this.f68091l);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.f68090k = (Signature[]) parcel.createTypedArray(Signature.CREATOR);
        this.f68092m = parcel.readBundle(Bundle.class.getClassLoader());
        this.f68093n = parcel.readString();
        this.f68094o = parcel.readInt();
        this.f68095p = parcel.readString();
        this.f68096q = parcel.createStringArrayList();
        this.f68097r = parcel.createStringArrayList();
        this.f68098s = parcel.readInt();
        try {
            this.f68099t = com.xinzhu.overmind.utils.helpers.b.a(parcel);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f68100u = parcel.readString();
        this.f68102w = parcel.readString();
        this.f68103x = parcel.readInt();
        this.f68104y = parcel.createTypedArrayList(ConfigurationInfo.CREATOR);
        this.f68105z = parcel.createTypedArrayList(FeatureInfo.CREATOR);
        com.xinzhu.overmind.b.c(A, "check san " + this.f68099t.packageName);
        int dataPosition2 = parcel.dataPosition();
        try {
            if (parcel.readString().equals("appendVersion")) {
                if (parcel.readInt() == 1) {
                    this.f68101v = parcel.createStringArray();
                    return;
                }
                return;
            }
        } catch (Throwable unused) {
        }
        parcel.setDataPosition(dataPosition2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f68082c.size());
        Iterator<b> it2 = this.f68082c.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            parcel.writeString(next.f68121c);
            parcel.writeBundle(next.f68122d);
            parcel.writeParcelable(next.f68118f, i4);
            ArrayList<II> arrayList = next.f68120b;
            if (arrayList != 0) {
                int size = arrayList.size();
                parcel.writeInt(size);
                while (true) {
                    int i5 = size - 1;
                    if (size > 0) {
                        parcel.writeParcelable((Parcelable) next.f68120b.get(i5), i4);
                        size = i5;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68083d.size());
        Iterator<b> it3 = this.f68083d.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            parcel.writeString(next2.f68121c);
            parcel.writeBundle(next2.f68122d);
            parcel.writeParcelable(next2.f68118f, i4);
            ArrayList<II> arrayList2 = next2.f68120b;
            if (arrayList2 != 0) {
                int size2 = arrayList2.size();
                parcel.writeInt(size2);
                while (true) {
                    int i6 = size2 - 1;
                    if (size2 > 0) {
                        parcel.writeParcelable((Parcelable) next2.f68120b.get(i6), i4);
                        size2 = i6;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68084e.size());
        Iterator<g> it4 = this.f68084e.iterator();
        while (it4.hasNext()) {
            g next3 = it4.next();
            parcel.writeString(next3.f68121c);
            parcel.writeBundle(next3.f68122d);
            parcel.writeParcelable(next3.f68127f, i4);
            ArrayList<II> arrayList3 = next3.f68120b;
            if (arrayList3 != 0) {
                int size3 = arrayList3.size();
                parcel.writeInt(size3);
                while (true) {
                    int i7 = size3 - 1;
                    if (size3 > 0) {
                        parcel.writeParcelable((Parcelable) next3.f68120b.get(i7), i4);
                        size3 = i7;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68085f.size());
        Iterator<h> it5 = this.f68085f.iterator();
        while (it5.hasNext()) {
            h next4 = it5.next();
            parcel.writeString(next4.f68121c);
            parcel.writeBundle(next4.f68122d);
            parcel.writeParcelable(next4.f68128f, i4);
            ArrayList<II> arrayList4 = next4.f68120b;
            if (arrayList4 != 0) {
                int size4 = arrayList4.size();
                parcel.writeInt(size4);
                while (true) {
                    int i8 = size4 - 1;
                    if (size4 > 0) {
                        parcel.writeParcelable((Parcelable) next4.f68120b.get(i8), i4);
                        size4 = i8;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68086g.size());
        Iterator<d> it6 = this.f68086g.iterator();
        while (it6.hasNext()) {
            d next5 = it6.next();
            parcel.writeString(next5.f68121c);
            parcel.writeBundle(next5.f68122d);
            parcel.writeParcelable(next5.f68124f, i4);
            ArrayList<II> arrayList5 = next5.f68120b;
            if (arrayList5 != 0) {
                int size5 = arrayList5.size();
                parcel.writeInt(size5);
                while (true) {
                    int i9 = size5 - 1;
                    if (size5 > 0) {
                        parcel.writeParcelable((Parcelable) next5.f68120b.get(i9), i4);
                        size5 = i9;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68087h.size());
        Iterator<e> it7 = this.f68087h.iterator();
        while (it7.hasNext()) {
            e next6 = it7.next();
            parcel.writeString(next6.f68121c);
            parcel.writeBundle(next6.f68122d);
            parcel.writeParcelable(next6.f68125f, i4);
            ArrayList<II> arrayList6 = next6.f68120b;
            if (arrayList6 != 0) {
                int size6 = arrayList6.size();
                parcel.writeInt(size6);
                while (true) {
                    int i10 = size6 - 1;
                    if (size6 > 0) {
                        parcel.writeParcelable((Parcelable) next6.f68120b.get(i10), i4);
                        size6 = i10;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68088i.size());
        Iterator<f> it8 = this.f68088i.iterator();
        while (it8.hasNext()) {
            f next7 = it8.next();
            parcel.writeString(next7.f68121c);
            parcel.writeBundle(next7.f68122d);
            parcel.writeParcelable(next7.f68126f, i4);
            ArrayList<II> arrayList7 = next7.f68120b;
            if (arrayList7 != 0) {
                int size7 = arrayList7.size();
                parcel.writeInt(size7);
                while (true) {
                    int i11 = size7 - 1;
                    if (size7 > 0) {
                        parcel.writeParcelable((Parcelable) next7.f68120b.get(i11), i4);
                        size7 = i11;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeStringList(this.f68089j);
        if (com.xinzhu.overmind.utils.e.u()) {
            parcel.writeParcelable(this.f68091l, i4);
        }
        parcel.writeTypedArray(this.f68090k, i4);
        parcel.writeBundle(this.f68092m);
        parcel.writeString(this.f68093n);
        parcel.writeInt(this.f68094o);
        parcel.writeString(this.f68095p);
        parcel.writeStringList(this.f68096q);
        parcel.writeStringList(this.f68097r);
        parcel.writeInt(this.f68098s);
        parcel.writeParcelable(this.f68099t, i4);
        parcel.writeString(this.f68100u);
        parcel.writeString(this.f68102w);
        parcel.writeInt(this.f68103x);
        parcel.writeTypedList(this.f68104y);
        parcel.writeTypedList(this.f68105z);
        parcel.writeString("appendVersion");
        parcel.writeInt(1);
        parcel.writeStringArray(this.f68101v);
    }

    /* loaded from: classes6.dex */
    public static final class SigningDetails implements Parcelable {
        public static final Parcelable.Creator<SigningDetails> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final PackageParser.SigningDetails f68116c = null;

        /* renamed from: b  reason: collision with root package name */
        public Signature[] f68117b;

        /* loaded from: classes6.dex */
        class a implements Parcelable.Creator<SigningDetails> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SigningDetails createFromParcel(Parcel parcel) {
                return new SigningDetails(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SigningDetails[] newArray(int i4) {
                return new SigningDetails[i4];
            }
        }

        public SigningDetails(PackageParser.SigningDetails signingDetails) {
            this.f68117b = signingDetails.signatures;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeTypedArray(this.f68117b, i4);
        }

        protected SigningDetails(Parcel parcel) {
            this.f68117b = (Signature[]) parcel.createTypedArray(Signature.CREATOR);
        }
    }

    /* loaded from: classes6.dex */
    public static class c<II extends IntentInfo> {

        /* renamed from: a  reason: collision with root package name */
        public MindPackageAmbulance f68119a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<II> f68120b;

        /* renamed from: c  reason: collision with root package name */
        public String f68121c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f68122d;

        /* renamed from: e  reason: collision with root package name */
        public ComponentName f68123e;

        public c(Parcel parcel) {
            this.f68121c = parcel.readString();
            this.f68122d = parcel.readBundle(Bundle.class.getClassLoader());
        }

        public ComponentName a() {
            ComponentName componentName = this.f68123e;
            if (componentName != null) {
                return componentName;
            }
            if (this.f68121c != null) {
                this.f68123e = new ComponentName(this.f68119a.f68093n, this.f68121c);
            }
            return this.f68123e;
        }

        public c(PackageParser.Component<?> component) {
            this.f68121c = component.className;
            this.f68122d = component.metaData;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends c<ActivityIntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public ActivityInfo f68118f;

        public b(PackageParser.Activity activity) {
            super(activity);
            this.f68118f = activity.info;
            ArrayList<II> arrayList = activity.intents;
            if (arrayList != 0) {
                this.f68120b = new ArrayList<>(arrayList.size());
                Iterator it2 = activity.intents.iterator();
                while (it2.hasNext()) {
                    this.f68120b.add(new ActivityIntentInfo((PackageParser.ActivityIntentInfo) it2.next()));
                }
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            int dataPosition = parcel.dataPosition();
            try {
                this.f68118f = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            } catch (Throwable unused) {
                parcel.setDataPosition(dataPosition);
                this.f68118f = com.xinzhu.overmind.utils.helpers.a.a(parcel);
                com.xinzhu.overmind.b.c(MindPackageAmbulance.A, "trying to restore activityinfo corrupt " + this.f68118f);
            }
            int readInt = parcel.readInt();
            this.f68120b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                parcel.readString();
                this.f68120b.add(new ActivityIntentInfo(new IntentInfo(parcel)));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends c<IntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public InstrumentationInfo f68124f;

        public d(PackageParser.Instrumentation instrumentation) {
            super(instrumentation);
            this.f68124f = instrumentation.info;
            ArrayList<II> arrayList = instrumentation.intents;
            if (arrayList != 0) {
                this.f68120b = new ArrayList<>(arrayList.size());
                Iterator it2 = instrumentation.intents.iterator();
                while (it2.hasNext()) {
                    this.f68120b.add(new IntentInfo((PackageParser.IntentInfo) it2.next()));
                }
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f68124f = (InstrumentationInfo) parcel.readParcelable(InstrumentationInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68120b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                parcel.readString();
                this.f68120b.add(new IntentInfo(parcel));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends c<IntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public PermissionInfo f68125f;

        public e(PackageParser.Permission permission) {
            super(permission);
            this.f68125f = permission.info;
            ArrayList<II> arrayList = permission.intents;
            if (arrayList != 0) {
                this.f68120b = new ArrayList<>(arrayList.size());
                Iterator it2 = permission.intents.iterator();
                while (it2.hasNext()) {
                    this.f68120b.add(new IntentInfo((PackageParser.IntentInfo) it2.next()));
                }
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f68125f = (PermissionInfo) parcel.readParcelable(e.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68120b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                parcel.readString();
                this.f68120b.add(new IntentInfo(parcel));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends c<IntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public PermissionGroupInfo f68126f;

        public f(PackageParser.PermissionGroup permissionGroup) {
            super(permissionGroup);
            this.f68126f = permissionGroup.info;
            ArrayList<II> arrayList = permissionGroup.intents;
            if (arrayList != 0) {
                this.f68120b = new ArrayList<>(arrayList.size());
                Iterator it2 = permissionGroup.intents.iterator();
                while (it2.hasNext()) {
                    this.f68120b.add(new IntentInfo((PackageParser.IntentInfo) it2.next()));
                }
            }
        }

        public f(Parcel parcel) {
            super(parcel);
            this.f68126f = (PermissionGroupInfo) parcel.readParcelable(f.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68120b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                parcel.readString();
                this.f68120b.add(new IntentInfo(parcel));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends c<ProviderIntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public ProviderInfo f68127f;

        public g(PackageParser.Provider provider) {
            super(provider);
            this.f68127f = provider.info;
            ArrayList<II> arrayList = provider.intents;
            if (arrayList != 0) {
                this.f68120b = new ArrayList<>(arrayList.size());
                Iterator it2 = provider.intents.iterator();
                while (it2.hasNext()) {
                    this.f68120b.add(new ProviderIntentInfo((PackageParser.ProviderIntentInfo) it2.next()));
                }
            }
        }

        public g(Parcel parcel) {
            super(parcel);
            int dataPosition = parcel.dataPosition();
            try {
                this.f68127f = (ProviderInfo) parcel.readParcelable(ProviderInfo.class.getClassLoader());
            } catch (Throwable unused) {
                parcel.setDataPosition(dataPosition);
                this.f68127f = com.xinzhu.overmind.utils.helpers.i.a(parcel);
                com.xinzhu.overmind.b.c(MindPackageAmbulance.A, "trying to restore providerinfo corrupt " + this.f68127f);
            }
            int readInt = parcel.readInt();
            this.f68120b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                parcel.readString();
                this.f68120b.add(new ProviderIntentInfo(new IntentInfo(parcel)));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends c<ServiceIntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public ServiceInfo f68128f;

        public h(PackageParser.Service service) {
            super(service);
            this.f68128f = service.info;
            ArrayList<II> arrayList = service.intents;
            if (arrayList != 0) {
                this.f68120b = new ArrayList<>(arrayList.size());
                Iterator it2 = service.intents.iterator();
                while (it2.hasNext()) {
                    this.f68120b.add(new ServiceIntentInfo((PackageParser.ServiceIntentInfo) it2.next()));
                }
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            int dataPosition = parcel.dataPosition();
            try {
                this.f68128f = (ServiceInfo) parcel.readParcelable(ServiceInfo.class.getClassLoader());
            } catch (Throwable unused) {
                parcel.setDataPosition(dataPosition);
                this.f68128f = com.xinzhu.overmind.utils.helpers.j.a(parcel);
                com.xinzhu.overmind.b.c(MindPackageAmbulance.A, "trying to restore serviceInfo corrupt " + this.f68128f);
            }
            int readInt = parcel.readInt();
            this.f68120b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                parcel.readString();
                this.f68120b.add(new ServiceIntentInfo(new IntentInfo(parcel)));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class IntentInfo implements Parcelable {
        public static final Parcelable.Creator<IntentInfo> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public IntentFilter f68107b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f68108c;

        /* renamed from: d  reason: collision with root package name */
        public int f68109d;

        /* renamed from: e  reason: collision with root package name */
        public String f68110e;

        /* renamed from: f  reason: collision with root package name */
        public int f68111f;

        /* renamed from: g  reason: collision with root package name */
        public int f68112g;

        /* renamed from: h  reason: collision with root package name */
        public int f68113h;

        /* loaded from: classes6.dex */
        class a implements Parcelable.Creator<IntentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public IntentInfo createFromParcel(Parcel parcel) {
                return new IntentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public IntentInfo[] newArray(int i4) {
                return new IntentInfo[i4];
            }
        }

        public IntentInfo(PackageParser.IntentInfo intentInfo) {
            this.f68107b = intentInfo;
            this.f68108c = intentInfo.hasDefault;
            this.f68109d = intentInfo.labelRes;
            CharSequence charSequence = intentInfo.nonLocalizedLabel;
            this.f68110e = charSequence == null ? null : charSequence.toString();
            this.f68111f = intentInfo.icon;
            this.f68112g = intentInfo.logo;
            this.f68113h = intentInfo.banner;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeParcelable(this.f68107b, i4);
            parcel.writeByte(this.f68108c ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f68109d);
            parcel.writeString(this.f68110e);
            parcel.writeInt(this.f68111f);
            parcel.writeInt(this.f68112g);
            parcel.writeInt(this.f68113h);
        }

        public IntentInfo(IntentInfo intentInfo) {
            this.f68107b = intentInfo.f68107b;
            this.f68108c = intentInfo.f68108c;
            this.f68109d = intentInfo.f68109d;
            String str = intentInfo.f68110e;
            this.f68110e = str == null ? null : str.toString();
            this.f68111f = intentInfo.f68111f;
            this.f68112g = intentInfo.f68112g;
            this.f68113h = intentInfo.f68113h;
        }

        protected IntentInfo(Parcel parcel) {
            this.f68107b = (IntentFilter) parcel.readParcelable(MindPackageAmbulance.class.getClassLoader());
            this.f68108c = parcel.readByte() != 0;
            this.f68109d = parcel.readInt();
            this.f68110e = parcel.readString();
            this.f68111f = parcel.readInt();
            this.f68112g = parcel.readInt();
            this.f68113h = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MindPackageAmbulance(Parcel parcel) {
        this.f68081b = false;
        this.f68082c = new ArrayList<>(0);
        this.f68083d = new ArrayList<>(0);
        this.f68084e = new ArrayList<>(0);
        this.f68085f = new ArrayList<>(0);
        this.f68086g = new ArrayList<>(0);
        this.f68087h = new ArrayList<>(0);
        this.f68088i = new ArrayList<>(0);
        this.f68089j = new ArrayList<>();
        this.f68104y = null;
        this.f68105z = null;
        int dataPosition = parcel.dataPosition();
        int readInt = parcel.readInt();
        try {
            this.f68082c = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    break;
                }
                b bVar = new b(parcel);
                Iterator it2 = bVar.f68120b.iterator();
                while (it2.hasNext()) {
                    ((ActivityIntentInfo) it2.next()).f68106i = bVar;
                }
                bVar.f68119a = this;
                this.f68082c.add(bVar);
                readInt = i4;
            }
            int readInt2 = parcel.readInt();
            this.f68083d = new ArrayList<>(readInt2);
            while (true) {
                int i5 = readInt2 - 1;
                if (readInt2 <= 0) {
                    break;
                }
                b bVar2 = new b(parcel);
                Iterator it3 = bVar2.f68120b.iterator();
                while (it3.hasNext()) {
                    ((ActivityIntentInfo) it3.next()).f68106i = bVar2;
                }
                bVar2.f68119a = this;
                this.f68083d.add(bVar2);
                readInt2 = i5;
            }
            int readInt3 = parcel.readInt();
            this.f68084e = new ArrayList<>(readInt3);
            while (true) {
                int i6 = readInt3 - 1;
                if (readInt3 <= 0) {
                    break;
                }
                g gVar = new g(parcel);
                gVar.f68127f.authority = gVar.f68127f.authority.split(";")[0];
                Iterator it4 = gVar.f68120b.iterator();
                while (it4.hasNext()) {
                    ((ProviderIntentInfo) it4.next()).f68114i = gVar;
                }
                gVar.f68119a = this;
                this.f68084e.add(gVar);
                readInt3 = i6;
            }
            int readInt4 = parcel.readInt();
            this.f68085f = new ArrayList<>(readInt4);
            while (true) {
                int i7 = readInt4 - 1;
                if (readInt4 <= 0) {
                    break;
                }
                h hVar = new h(parcel);
                Iterator it5 = hVar.f68120b.iterator();
                while (it5.hasNext()) {
                    ((ServiceIntentInfo) it5.next()).f68115i = hVar;
                }
                hVar.f68119a = this;
                this.f68085f.add(hVar);
                readInt4 = i7;
            }
            int readInt5 = parcel.readInt();
            this.f68086g = new ArrayList<>(readInt5);
            while (true) {
                int i8 = readInt5 - 1;
                if (readInt5 <= 0) {
                    break;
                }
                d dVar = new d(parcel);
                dVar.f68119a = this;
                this.f68086g.add(dVar);
                readInt5 = i8;
            }
            int readInt6 = parcel.readInt();
            this.f68087h = new ArrayList<>(readInt6);
            while (true) {
                int i9 = readInt6 - 1;
                if (readInt6 <= 0) {
                    break;
                }
                e eVar = new e(parcel);
                eVar.f68119a = this;
                this.f68087h.add(eVar);
                readInt6 = i9;
            }
            int readInt7 = parcel.readInt();
            this.f68088i = new ArrayList<>(readInt7);
            while (true) {
                int i10 = readInt7 - 1;
                if (readInt7 <= 0) {
                    break;
                }
                f fVar = new f(parcel);
                fVar.f68119a = this;
                this.f68088i.add(fVar);
                readInt7 = i10;
            }
            parcel.readStringList(this.f68089j);
            String str = A;
            com.xinzhu.overmind.b.c(str, "permissions " + this.f68089j);
            if (com.xinzhu.overmind.utils.e.u()) {
                try {
                    int dataPosition2 = parcel.dataPosition();
                    String readString = parcel.readString();
                    com.xinzhu.overmind.b.c(str, "what class " + readString);
                    parcel.setDataPosition(dataPosition2);
                    if (readString.contains("MindPackage$SigningDetails")) {
                        com.xinzhu.overmind.b.c(str, "Legacy signing details found, solve it");
                        j.a n4 = j.a.n(((SigningDetails) parcel.readParcelable(SigningDetails.class.getClassLoader())).f68117b, 0);
                        Objects.requireNonNull(n4);
                        this.f68091l = (PackageParser.SigningDetails) n4.f66534a;
                    } else {
                        this.f68091l = com.xinzhu.overmind.utils.helpers.k.a(parcel);
                        com.xinzhu.overmind.b.c(str, "trying to restore signing details corrupt " + this.f68091l);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.f68090k = (Signature[]) parcel.createTypedArray(Signature.CREATOR);
            this.f68092m = parcel.readBundle(Bundle.class.getClassLoader());
            this.f68093n = parcel.readString();
            this.f68094o = parcel.readInt();
            this.f68095p = parcel.readString();
            this.f68096q = parcel.createStringArrayList();
            this.f68097r = parcel.createStringArrayList();
            this.f68098s = parcel.readInt();
            try {
                this.f68099t = com.xinzhu.overmind.utils.helpers.b.a(parcel);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            this.f68100u = parcel.readString();
            this.f68102w = parcel.readString();
            this.f68103x = parcel.readInt();
            this.f68104y = parcel.createTypedArrayList(ConfigurationInfo.CREATOR);
            this.f68105z = parcel.createTypedArrayList(FeatureInfo.CREATOR);
            com.xinzhu.overmind.b.c(A, "check san " + this.f68099t.packageName);
            int dataPosition3 = parcel.dataPosition();
            try {
                if (parcel.readString().equals("appendVersion")) {
                    if (parcel.readInt() == 1) {
                        this.f68101v = parcel.createStringArray();
                        return;
                    }
                    return;
                }
            } catch (Throwable unused) {
            }
            parcel.setDataPosition(dataPosition3);
        } catch (Throwable unused2) {
            com.xinzhu.overmind.b.c(A, "MindPackage run into ambulance routine");
            parcel.setDataPosition(dataPosition);
            a(parcel);
        }
    }
}
