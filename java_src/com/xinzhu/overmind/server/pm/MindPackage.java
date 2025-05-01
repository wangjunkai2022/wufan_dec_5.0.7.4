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
/* loaded from: classes.dex */
public class MindPackage implements Parcelable {
    private static final int A = 1;
    static final String B = "android.test.base";
    static final String C = "android.test.mock";
    static final String D = "android.test.runner";
    static final String E = "org.apache.http.legacy";

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<b> f68034b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<b> f68035c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<g> f68036d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<h> f68037e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<d> f68038f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<e> f68039g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<f> f68040h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<String> f68041i;

    /* renamed from: j  reason: collision with root package name */
    public Signature[] f68042j;

    /* renamed from: k  reason: collision with root package name */
    public PackageParser.SigningDetails f68043k;

    /* renamed from: l  reason: collision with root package name */
    public Bundle f68044l;

    /* renamed from: m  reason: collision with root package name */
    public String f68045m;

    /* renamed from: n  reason: collision with root package name */
    public int f68046n;

    /* renamed from: o  reason: collision with root package name */
    public String f68047o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<String> f68048p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<String> f68049q;

    /* renamed from: r  reason: collision with root package name */
    public int f68050r;

    /* renamed from: s  reason: collision with root package name */
    public ApplicationInfo f68051s;

    /* renamed from: t  reason: collision with root package name */
    public String f68052t;

    /* renamed from: u  reason: collision with root package name */
    public String[] f68053u;

    /* renamed from: v  reason: collision with root package name */
    public String f68054v;

    /* renamed from: w  reason: collision with root package name */
    public int f68055w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<ConfigurationInfo> f68056x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<FeatureInfo> f68057y;

    /* renamed from: z  reason: collision with root package name */
    private static final String f68033z = MindPackage.class.getSimpleName();
    public static final Parcelable.Creator<MindPackage> CREATOR = new a();

    /* loaded from: classes.dex */
    public static class ActivityIntentInfo extends IntentInfo {

        /* renamed from: i  reason: collision with root package name */
        public b f68058i;

        public ActivityIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public ActivityIntentInfo(IntentInfo intentInfo) {
            super(intentInfo);
        }
    }

    /* loaded from: classes.dex */
    public static class ProviderIntentInfo extends IntentInfo {

        /* renamed from: i  reason: collision with root package name */
        public g f68066i;

        public ProviderIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public ProviderIntentInfo(IntentInfo intentInfo) {
            super(intentInfo);
        }
    }

    /* loaded from: classes.dex */
    public static class ServiceIntentInfo extends IntentInfo {

        /* renamed from: i  reason: collision with root package name */
        public h f68067i;

        public ServiceIntentInfo(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public ServiceIntentInfo(IntentInfo intentInfo) {
            super(intentInfo);
        }
    }

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindPackage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindPackage createFromParcel(Parcel parcel) {
            return new MindPackage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindPackage[] newArray(int i4) {
            return new MindPackage[i4];
        }
    }

    public MindPackage(PackageParser.Package r6) {
        this.f68034b = new ArrayList<>(0);
        this.f68035c = new ArrayList<>(0);
        this.f68036d = new ArrayList<>(0);
        this.f68037e = new ArrayList<>(0);
        this.f68038f = new ArrayList<>(0);
        this.f68039g = new ArrayList<>(0);
        this.f68040h = new ArrayList<>(0);
        this.f68041i = new ArrayList<>();
        this.f68056x = null;
        this.f68057y = null;
        this.f68034b = new ArrayList<>(r6.activities.size());
        Iterator<PackageParser.Activity> it2 = r6.activities.iterator();
        while (it2.hasNext()) {
            b bVar = new b(it2.next());
            Iterator it3 = bVar.f68072b.iterator();
            while (it3.hasNext()) {
                ((ActivityIntentInfo) it3.next()).f68058i = bVar;
            }
            bVar.f68071a = this;
            this.f68034b.add(bVar);
        }
        this.f68035c = new ArrayList<>(r6.receivers.size());
        Iterator<PackageParser.Activity> it4 = r6.receivers.iterator();
        while (it4.hasNext()) {
            b bVar2 = new b(it4.next());
            Iterator it5 = bVar2.f68072b.iterator();
            while (it5.hasNext()) {
                ((ActivityIntentInfo) it5.next()).f68058i = bVar2;
            }
            bVar2.f68071a = this;
            this.f68035c.add(bVar2);
        }
        this.f68036d = new ArrayList<>(r6.providers.size());
        Iterator<PackageParser.Provider> it6 = r6.providers.iterator();
        while (it6.hasNext()) {
            PackageParser.Provider next = it6.next();
            String[] split = next.info.authority.split(";");
            next.info.authority = split[0];
            g gVar = new g(next);
            Iterator it7 = gVar.f68072b.iterator();
            while (it7.hasNext()) {
                ((ProviderIntentInfo) it7.next()).f68066i = gVar;
            }
            gVar.f68071a = this;
            this.f68036d.add(gVar);
        }
        this.f68037e = new ArrayList<>(r6.services.size());
        Iterator<PackageParser.Service> it8 = r6.services.iterator();
        while (it8.hasNext()) {
            h hVar = new h(it8.next());
            Iterator it9 = hVar.f68072b.iterator();
            while (it9.hasNext()) {
                ((ServiceIntentInfo) it9.next()).f68067i = hVar;
            }
            hVar.f68071a = this;
            this.f68037e.add(hVar);
        }
        this.f68038f = new ArrayList<>(r6.instrumentation.size());
        Iterator<PackageParser.Instrumentation> it10 = r6.instrumentation.iterator();
        while (it10.hasNext()) {
            d dVar = new d(it10.next());
            dVar.f68071a = this;
            this.f68038f.add(dVar);
        }
        this.f68039g = new ArrayList<>(r6.permissions.size());
        Iterator<PackageParser.Permission> it11 = r6.permissions.iterator();
        while (it11.hasNext()) {
            e eVar = new e(it11.next());
            eVar.f68071a = this;
            this.f68039g.add(eVar);
        }
        this.f68040h = new ArrayList<>(r6.permissionGroups.size());
        Iterator<PackageParser.PermissionGroup> it12 = r6.permissionGroups.iterator();
        while (it12.hasNext()) {
            f fVar = new f(it12.next());
            fVar.f68071a = this;
            this.f68040h.add(fVar);
        }
        this.f68041i = r6.requestedPermissions;
        if (com.xinzhu.overmind.utils.e.u()) {
            PackageParser.SigningDetails signingDetails = r6.mSigningDetails;
            this.f68043k = signingDetails;
            this.f68042j = signingDetails.signatures;
        } else {
            this.f68042j = r6.mSignatures;
        }
        this.f68044l = r6.mAppMetaData;
        this.f68045m = r6.packageName;
        this.f68046n = r6.mPreferredOrder;
        this.f68047o = r6.mSharedUserId;
        this.f68048p = r6.usesLibraries;
        this.f68049q = r6.usesOptionalLibraries;
        this.f68050r = r6.mVersionCode;
        ApplicationInfo applicationInfo = r6.applicationInfo;
        this.f68051s = applicationInfo;
        this.f68052t = r6.mVersionName;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f68053u = applicationInfo.splitNames;
        }
        this.f68054v = r6.baseCodePath;
        this.f68055w = r6.mSharedUserLabel;
        this.f68056x = r6.configPreferences;
        this.f68057y = r6.reqFeatures;
    }

    private boolean a(String str) {
        return this.f68048p.contains(str) || this.f68049q.contains(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f68034b.size());
        Iterator<b> it2 = this.f68034b.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            parcel.writeString(next.f68073c);
            parcel.writeBundle(next.f68074d);
            parcel.writeParcelable(next.f68070f, i4);
            ArrayList<II> arrayList = next.f68072b;
            if (arrayList != 0) {
                int size = arrayList.size();
                parcel.writeInt(size);
                while (true) {
                    int i5 = size - 1;
                    if (size > 0) {
                        parcel.writeParcelable((Parcelable) next.f68072b.get(i5), i4);
                        size = i5;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68035c.size());
        Iterator<b> it3 = this.f68035c.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            parcel.writeString(next2.f68073c);
            parcel.writeBundle(next2.f68074d);
            parcel.writeParcelable(next2.f68070f, i4);
            ArrayList<II> arrayList2 = next2.f68072b;
            if (arrayList2 != 0) {
                int size2 = arrayList2.size();
                parcel.writeInt(size2);
                while (true) {
                    int i6 = size2 - 1;
                    if (size2 > 0) {
                        parcel.writeParcelable((Parcelable) next2.f68072b.get(i6), i4);
                        size2 = i6;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68036d.size());
        Iterator<g> it4 = this.f68036d.iterator();
        while (it4.hasNext()) {
            g next3 = it4.next();
            parcel.writeString(next3.f68073c);
            parcel.writeBundle(next3.f68074d);
            parcel.writeParcelable(next3.f68079f, i4);
            ArrayList<II> arrayList3 = next3.f68072b;
            if (arrayList3 != 0) {
                int size3 = arrayList3.size();
                parcel.writeInt(size3);
                while (true) {
                    int i7 = size3 - 1;
                    if (size3 > 0) {
                        parcel.writeParcelable((Parcelable) next3.f68072b.get(i7), i4);
                        size3 = i7;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68037e.size());
        Iterator<h> it5 = this.f68037e.iterator();
        while (it5.hasNext()) {
            h next4 = it5.next();
            parcel.writeString(next4.f68073c);
            parcel.writeBundle(next4.f68074d);
            parcel.writeParcelable(next4.f68080f, i4);
            ArrayList<II> arrayList4 = next4.f68072b;
            if (arrayList4 != 0) {
                int size4 = arrayList4.size();
                parcel.writeInt(size4);
                while (true) {
                    int i8 = size4 - 1;
                    if (size4 > 0) {
                        parcel.writeParcelable((Parcelable) next4.f68072b.get(i8), i4);
                        size4 = i8;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68038f.size());
        Iterator<d> it6 = this.f68038f.iterator();
        while (it6.hasNext()) {
            d next5 = it6.next();
            parcel.writeString(next5.f68073c);
            parcel.writeBundle(next5.f68074d);
            parcel.writeParcelable(next5.f68076f, i4);
            ArrayList<II> arrayList5 = next5.f68072b;
            if (arrayList5 != 0) {
                int size5 = arrayList5.size();
                parcel.writeInt(size5);
                while (true) {
                    int i9 = size5 - 1;
                    if (size5 > 0) {
                        parcel.writeParcelable((Parcelable) next5.f68072b.get(i9), i4);
                        size5 = i9;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68039g.size());
        Iterator<e> it7 = this.f68039g.iterator();
        while (it7.hasNext()) {
            e next6 = it7.next();
            parcel.writeString(next6.f68073c);
            parcel.writeBundle(next6.f68074d);
            parcel.writeParcelable(next6.f68077f, i4);
            ArrayList<II> arrayList6 = next6.f68072b;
            if (arrayList6 != 0) {
                int size6 = arrayList6.size();
                parcel.writeInt(size6);
                while (true) {
                    int i10 = size6 - 1;
                    if (size6 > 0) {
                        parcel.writeParcelable((Parcelable) next6.f68072b.get(i10), i4);
                        size6 = i10;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.f68040h.size());
        Iterator<f> it8 = this.f68040h.iterator();
        while (it8.hasNext()) {
            f next7 = it8.next();
            parcel.writeString(next7.f68073c);
            parcel.writeBundle(next7.f68074d);
            parcel.writeParcelable(next7.f68078f, i4);
            ArrayList<II> arrayList7 = next7.f68072b;
            if (arrayList7 != 0) {
                int size7 = arrayList7.size();
                parcel.writeInt(size7);
                while (true) {
                    int i11 = size7 - 1;
                    if (size7 > 0) {
                        parcel.writeParcelable((Parcelable) next7.f68072b.get(i11), i4);
                        size7 = i11;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeStringList(this.f68041i);
        if (com.xinzhu.overmind.utils.e.u()) {
            parcel.writeParcelable(this.f68043k, i4);
        }
        parcel.writeTypedArray(this.f68042j, i4);
        parcel.writeBundle(this.f68044l);
        parcel.writeString(this.f68045m);
        parcel.writeInt(this.f68046n);
        parcel.writeString(this.f68047o);
        parcel.writeStringList(this.f68048p);
        parcel.writeStringList(this.f68049q);
        parcel.writeInt(this.f68050r);
        parcel.writeParcelable(this.f68051s, i4);
        parcel.writeString(this.f68052t);
        parcel.writeString(this.f68054v);
        parcel.writeInt(this.f68055w);
        parcel.writeTypedList(this.f68056x);
        parcel.writeTypedList(this.f68057y);
        parcel.writeString("appendVersion");
        parcel.writeInt(1);
        parcel.writeStringArray(this.f68053u);
    }

    /* loaded from: classes6.dex */
    public static final class SigningDetails implements Parcelable {
        public static final Parcelable.Creator<SigningDetails> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final PackageParser.SigningDetails f68068c = null;

        /* renamed from: b  reason: collision with root package name */
        public Signature[] f68069b;

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
            this.f68069b = signingDetails.signatures;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeTypedArray(this.f68069b, i4);
        }

        protected SigningDetails(Parcel parcel) {
            this.f68069b = (Signature[]) parcel.createTypedArray(Signature.CREATOR);
        }
    }

    /* loaded from: classes.dex */
    public static class c<II extends IntentInfo> {

        /* renamed from: a  reason: collision with root package name */
        public MindPackage f68071a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<II> f68072b;

        /* renamed from: c  reason: collision with root package name */
        public String f68073c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f68074d;

        /* renamed from: e  reason: collision with root package name */
        public ComponentName f68075e;

        public c(Parcel parcel) {
            this.f68073c = parcel.readString();
            this.f68074d = parcel.readBundle(Bundle.class.getClassLoader());
        }

        public ComponentName a() {
            ComponentName componentName = this.f68075e;
            if (componentName != null) {
                return componentName;
            }
            if (this.f68073c != null) {
                this.f68075e = new ComponentName(this.f68071a.f68045m, this.f68073c);
            }
            return this.f68075e;
        }

        public c(PackageParser.Component<?> component) {
            this.f68073c = component.className;
            this.f68074d = component.metaData;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c<ActivityIntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public ActivityInfo f68070f;

        public b(PackageParser.Activity activity) {
            super(activity);
            this.f68070f = activity.info;
            ArrayList<II> arrayList = activity.intents;
            if (arrayList != 0) {
                this.f68072b = new ArrayList<>(arrayList.size());
                Iterator it2 = activity.intents.iterator();
                while (it2.hasNext()) {
                    this.f68072b.add(new ActivityIntentInfo((PackageParser.ActivityIntentInfo) it2.next()));
                }
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f68070f = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68072b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.f68072b.add(new ActivityIntentInfo((IntentInfo) parcel.readParcelable(MindPackage.class.getClassLoader())));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends c<IntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public InstrumentationInfo f68076f;

        public d(PackageParser.Instrumentation instrumentation) {
            super(instrumentation);
            this.f68076f = instrumentation.info;
            ArrayList<II> arrayList = instrumentation.intents;
            if (arrayList != 0) {
                this.f68072b = new ArrayList<>(arrayList.size());
                Iterator it2 = instrumentation.intents.iterator();
                while (it2.hasNext()) {
                    this.f68072b.add(new IntentInfo((PackageParser.IntentInfo) it2.next()));
                }
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f68076f = (InstrumentationInfo) parcel.readParcelable(InstrumentationInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68072b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.f68072b.add((IntentInfo) parcel.readParcelable(MindPackage.class.getClassLoader()));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends c<IntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public PermissionInfo f68077f;

        public e(PackageParser.Permission permission) {
            super(permission);
            this.f68077f = permission.info;
            ArrayList<II> arrayList = permission.intents;
            if (arrayList != 0) {
                this.f68072b = new ArrayList<>(arrayList.size());
                Iterator it2 = permission.intents.iterator();
                while (it2.hasNext()) {
                    this.f68072b.add(new IntentInfo((PackageParser.IntentInfo) it2.next()));
                }
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f68077f = (PermissionInfo) parcel.readParcelable(e.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68072b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.f68072b.add((IntentInfo) parcel.readParcelable(MindPackage.class.getClassLoader()));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends c<IntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public PermissionGroupInfo f68078f;

        public f(PackageParser.PermissionGroup permissionGroup) {
            super(permissionGroup);
            this.f68078f = permissionGroup.info;
            ArrayList<II> arrayList = permissionGroup.intents;
            if (arrayList != 0) {
                this.f68072b = new ArrayList<>(arrayList.size());
                Iterator it2 = permissionGroup.intents.iterator();
                while (it2.hasNext()) {
                    this.f68072b.add(new IntentInfo((PackageParser.IntentInfo) it2.next()));
                }
            }
        }

        public f(Parcel parcel) {
            super(parcel);
            this.f68078f = (PermissionGroupInfo) parcel.readParcelable(f.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68072b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.f68072b.add((IntentInfo) parcel.readParcelable(MindPackage.class.getClassLoader()));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends c<ProviderIntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public ProviderInfo f68079f;

        public g(PackageParser.Provider provider) {
            super(provider);
            this.f68079f = provider.info;
            ArrayList<II> arrayList = provider.intents;
            if (arrayList != 0) {
                this.f68072b = new ArrayList<>(arrayList.size());
                Iterator it2 = provider.intents.iterator();
                while (it2.hasNext()) {
                    this.f68072b.add(new ProviderIntentInfo((PackageParser.ProviderIntentInfo) it2.next()));
                }
            }
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f68079f = (ProviderInfo) parcel.readParcelable(ProviderInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68072b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.f68072b.add(new ProviderIntentInfo((IntentInfo) parcel.readParcelable(MindPackage.class.getClassLoader())));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends c<ServiceIntentInfo> {

        /* renamed from: f  reason: collision with root package name */
        public ServiceInfo f68080f;

        public h(PackageParser.Service service) {
            super(service);
            this.f68080f = service.info;
            ArrayList<II> arrayList = service.intents;
            if (arrayList != 0) {
                this.f68072b = new ArrayList<>(arrayList.size());
                Iterator it2 = service.intents.iterator();
                while (it2.hasNext()) {
                    this.f68072b.add(new ServiceIntentInfo((PackageParser.ServiceIntentInfo) it2.next()));
                }
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f68080f = (ServiceInfo) parcel.readParcelable(ServiceInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f68072b = new ArrayList<>(readInt);
            while (true) {
                int i4 = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.f68072b.add(new ServiceIntentInfo((IntentInfo) parcel.readParcelable(MindPackage.class.getClassLoader())));
                readInt = i4;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class IntentInfo implements Parcelable {
        public static final Parcelable.Creator<IntentInfo> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public IntentFilter f68059b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f68060c;

        /* renamed from: d  reason: collision with root package name */
        public int f68061d;

        /* renamed from: e  reason: collision with root package name */
        public String f68062e;

        /* renamed from: f  reason: collision with root package name */
        public int f68063f;

        /* renamed from: g  reason: collision with root package name */
        public int f68064g;

        /* renamed from: h  reason: collision with root package name */
        public int f68065h;

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
            this.f68059b = intentInfo;
            this.f68060c = intentInfo.hasDefault;
            this.f68061d = intentInfo.labelRes;
            CharSequence charSequence = intentInfo.nonLocalizedLabel;
            this.f68062e = charSequence == null ? null : charSequence.toString();
            this.f68063f = intentInfo.icon;
            this.f68064g = intentInfo.logo;
            this.f68065h = intentInfo.banner;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeParcelable(this.f68059b, i4);
            parcel.writeByte(this.f68060c ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f68061d);
            parcel.writeString(this.f68062e);
            parcel.writeInt(this.f68063f);
            parcel.writeInt(this.f68064g);
            parcel.writeInt(this.f68065h);
        }

        public IntentInfo(IntentInfo intentInfo) {
            this.f68059b = intentInfo.f68059b;
            this.f68060c = intentInfo.f68060c;
            this.f68061d = intentInfo.f68061d;
            String str = intentInfo.f68062e;
            this.f68062e = str == null ? null : str.toString();
            this.f68063f = intentInfo.f68063f;
            this.f68064g = intentInfo.f68064g;
            this.f68065h = intentInfo.f68065h;
        }

        protected IntentInfo(Parcel parcel) {
            this.f68059b = (IntentFilter) parcel.readParcelable(MindPackage.class.getClassLoader());
            this.f68060c = parcel.readByte() != 0;
            this.f68061d = parcel.readInt();
            this.f68062e = parcel.readString();
            this.f68063f = parcel.readInt();
            this.f68064g = parcel.readInt();
            this.f68065h = parcel.readInt();
        }
    }

    protected MindPackage(Parcel parcel) {
        this.f68034b = new ArrayList<>(0);
        this.f68035c = new ArrayList<>(0);
        this.f68036d = new ArrayList<>(0);
        this.f68037e = new ArrayList<>(0);
        this.f68038f = new ArrayList<>(0);
        this.f68039g = new ArrayList<>(0);
        this.f68040h = new ArrayList<>(0);
        this.f68041i = new ArrayList<>();
        this.f68056x = null;
        this.f68057y = null;
        int readInt = parcel.readInt();
        this.f68034b = new ArrayList<>(readInt);
        while (true) {
            int i4 = readInt - 1;
            if (readInt <= 0) {
                break;
            }
            b bVar = new b(parcel);
            Iterator it2 = bVar.f68072b.iterator();
            while (it2.hasNext()) {
                ((ActivityIntentInfo) it2.next()).f68058i = bVar;
            }
            bVar.f68071a = this;
            this.f68034b.add(bVar);
            readInt = i4;
        }
        int readInt2 = parcel.readInt();
        this.f68035c = new ArrayList<>(readInt2);
        while (true) {
            int i5 = readInt2 - 1;
            if (readInt2 <= 0) {
                break;
            }
            b bVar2 = new b(parcel);
            Iterator it3 = bVar2.f68072b.iterator();
            while (it3.hasNext()) {
                ((ActivityIntentInfo) it3.next()).f68058i = bVar2;
            }
            bVar2.f68071a = this;
            this.f68035c.add(bVar2);
            readInt2 = i5;
        }
        int readInt3 = parcel.readInt();
        this.f68036d = new ArrayList<>(readInt3);
        while (true) {
            int i6 = readInt3 - 1;
            if (readInt3 <= 0) {
                break;
            }
            g gVar = new g(parcel);
            gVar.f68079f.authority = gVar.f68079f.authority.split(";")[0];
            Iterator it4 = gVar.f68072b.iterator();
            while (it4.hasNext()) {
                ((ProviderIntentInfo) it4.next()).f68066i = gVar;
            }
            gVar.f68071a = this;
            this.f68036d.add(gVar);
            readInt3 = i6;
        }
        int readInt4 = parcel.readInt();
        this.f68037e = new ArrayList<>(readInt4);
        while (true) {
            int i7 = readInt4 - 1;
            if (readInt4 <= 0) {
                break;
            }
            h hVar = new h(parcel);
            Iterator it5 = hVar.f68072b.iterator();
            while (it5.hasNext()) {
                ((ServiceIntentInfo) it5.next()).f68067i = hVar;
            }
            hVar.f68071a = this;
            this.f68037e.add(hVar);
            readInt4 = i7;
        }
        int readInt5 = parcel.readInt();
        this.f68038f = new ArrayList<>(readInt5);
        while (true) {
            int i8 = readInt5 - 1;
            if (readInt5 <= 0) {
                break;
            }
            d dVar = new d(parcel);
            dVar.f68071a = this;
            this.f68038f.add(dVar);
            readInt5 = i8;
        }
        int readInt6 = parcel.readInt();
        this.f68039g = new ArrayList<>(readInt6);
        while (true) {
            int i9 = readInt6 - 1;
            if (readInt6 <= 0) {
                break;
            }
            e eVar = new e(parcel);
            eVar.f68071a = this;
            this.f68039g.add(eVar);
            readInt6 = i9;
        }
        int readInt7 = parcel.readInt();
        this.f68040h = new ArrayList<>(readInt7);
        while (true) {
            int i10 = readInt7 - 1;
            if (readInt7 <= 0) {
                break;
            }
            f fVar = new f(parcel);
            fVar.f68071a = this;
            this.f68040h.add(fVar);
            readInt7 = i10;
        }
        parcel.readStringList(this.f68041i);
        if (com.xinzhu.overmind.utils.e.u()) {
            try {
                int dataPosition = parcel.dataPosition();
                String readString = parcel.readString();
                parcel.setDataPosition(dataPosition);
                if (readString.contains("MindPackage$SigningDetails")) {
                    com.xinzhu.overmind.b.c(f68033z, "Legacy signing details found, solve it");
                    j.a n4 = j.a.n(((SigningDetails) parcel.readParcelable(SigningDetails.class.getClassLoader())).f68069b, 0);
                    Objects.requireNonNull(n4);
                    this.f68043k = (PackageParser.SigningDetails) n4.f66534a;
                } else {
                    this.f68043k = (PackageParser.SigningDetails) parcel.readParcelable(PackageParser.SigningDetails.class.getClassLoader());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.f68042j = (Signature[]) parcel.createTypedArray(Signature.CREATOR);
        this.f68044l = parcel.readBundle(Bundle.class.getClassLoader());
        this.f68045m = parcel.readString();
        this.f68046n = parcel.readInt();
        this.f68047o = parcel.readString();
        this.f68048p = parcel.createStringArrayList();
        this.f68049q = parcel.createStringArrayList();
        this.f68050r = parcel.readInt();
        this.f68051s = (ApplicationInfo) parcel.readParcelable(ApplicationInfo.class.getClassLoader());
        this.f68052t = parcel.readString();
        this.f68054v = parcel.readString();
        this.f68055w = parcel.readInt();
        this.f68056x = parcel.createTypedArrayList(ConfigurationInfo.CREATOR);
        this.f68057y = parcel.createTypedArrayList(FeatureInfo.CREATOR);
        int dataPosition2 = parcel.dataPosition();
        try {
            if (parcel.readString().equals("appendVersion")) {
                if (parcel.readInt() == 1) {
                    this.f68053u = parcel.createStringArray();
                    return;
                }
                return;
            }
        } catch (Throwable unused) {
        }
        parcel.setDataPosition(dataPosition2);
    }
}
