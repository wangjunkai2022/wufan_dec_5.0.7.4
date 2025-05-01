package com.tbruyelle.rxpermissions2;

import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;
/* compiled from: Permission.java */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f62139a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f62140b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f62141c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Permission.java */
    /* loaded from: classes5.dex */
    public class a implements BiConsumer<StringBuilder, String> {
        a() {
        }

        @Override // io.reactivex.functions.BiConsumer
        /* renamed from: a */
        public void accept(StringBuilder sb, String str) throws Exception {
            if (sb.length() == 0) {
                sb.append(str);
                return;
            }
            sb.append(", ");
            sb.append(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Permission.java */
    /* renamed from: com.tbruyelle.rxpermissions2.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0658b implements Function<b, String> {
        C0658b() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a */
        public String apply(b bVar) throws Exception {
            return bVar.f62139a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Permission.java */
    /* loaded from: classes5.dex */
    public class c implements Predicate<b> {
        c() {
        }

        @Override // io.reactivex.functions.Predicate
        /* renamed from: a */
        public boolean test(b bVar) throws Exception {
            return bVar.f62140b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Permission.java */
    /* loaded from: classes5.dex */
    public class d implements Predicate<b> {
        d() {
        }

        @Override // io.reactivex.functions.Predicate
        /* renamed from: a */
        public boolean test(b bVar) throws Exception {
            return bVar.f62141c;
        }
    }

    public b(String str, boolean z4) {
        this(str, z4, false);
    }

    private Boolean a(List<b> list) {
        return Observable.fromIterable(list).all(new c()).blockingGet();
    }

    private String b(List<b> list) {
        return ((StringBuilder) Observable.fromIterable(list).map(new C0658b()).collectInto(new StringBuilder(), new a()).blockingGet()).toString();
    }

    private Boolean c(List<b> list) {
        return Observable.fromIterable(list).any(new d()).blockingGet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f62140b == bVar.f62140b && this.f62141c == bVar.f62141c) {
            return this.f62139a.equals(bVar.f62139a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f62139a.hashCode() * 31) + (this.f62140b ? 1 : 0)) * 31) + (this.f62141c ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.f62139a + "', granted=" + this.f62140b + ", shouldShowRequestPermissionRationale=" + this.f62141c + '}';
    }

    public b(String str, boolean z4, boolean z5) {
        this.f62139a = str;
        this.f62140b = z4;
        this.f62141c = z5;
    }

    public b(List<b> list) {
        this.f62139a = b(list);
        this.f62140b = a(list).booleanValue();
        this.f62141c = c(list).booleanValue();
    }
}
