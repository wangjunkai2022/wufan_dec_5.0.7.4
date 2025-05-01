package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: KeyPath.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public static final d f4042c = new d("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f4043a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private e f4044b;

    public d(String... strArr) {
        this.f4043a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f4043a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d a(String str) {
        d dVar = new d(this);
        dVar.f4043a.add(str);
        return dVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(String str, int i4) {
        if (i4 >= this.f4043a.size()) {
            return false;
        }
        boolean z4 = i4 == this.f4043a.size() - 1;
        String str2 = this.f4043a.get(i4);
        if (!str2.equals("**")) {
            return (z4 || (i4 == this.f4043a.size() + (-2) && b())) && (str2.equals(str) || str2.equals(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD));
        }
        if (!z4 && this.f4043a.get(i4 + 1).equals(str)) {
            return i4 == this.f4043a.size() + (-2) || (i4 == this.f4043a.size() + (-3) && b());
        } else if (z4) {
            return true;
        } else {
            int i5 = i4 + 1;
            if (i5 < this.f4043a.size() - 1) {
                return false;
            }
            return this.f4043a.get(i5).equals(str);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public e d() {
        return this.f4044b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e(String str, int i4) {
        if (f(str)) {
            return 0;
        }
        if (this.f4043a.get(i4).equals("**")) {
            return (i4 != this.f4043a.size() - 1 && this.f4043a.get(i4 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f4043a.equals(dVar.f4043a)) {
            e eVar = this.f4044b;
            e eVar2 = dVar.f4044b;
            return eVar != null ? eVar.equals(eVar2) : eVar2 == null;
        }
        return false;
    }

    public String g() {
        return this.f4043a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h(String str, int i4) {
        if (f(str)) {
            return true;
        }
        if (i4 >= this.f4043a.size()) {
            return false;
        }
        return this.f4043a.get(i4).equals(str) || this.f4043a.get(i4).equals("**") || this.f4043a.get(i4).equals(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD);
    }

    public int hashCode() {
        int hashCode = this.f4043a.hashCode() * 31;
        e eVar = this.f4044b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean i(String str, int i4) {
        return "__container".equals(str) || i4 < this.f4043a.size() - 1 || this.f4043a.get(i4).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d j(e eVar) {
        d dVar = new d(this);
        dVar.f4044b = eVar;
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f4043a);
        sb.append(",resolved=");
        sb.append(this.f4044b != null);
        sb.append('}');
        return sb.toString();
    }

    private d(d dVar) {
        this.f4043a = new ArrayList(dVar.f4043a);
        this.f4044b = dVar.f4044b;
    }
}
