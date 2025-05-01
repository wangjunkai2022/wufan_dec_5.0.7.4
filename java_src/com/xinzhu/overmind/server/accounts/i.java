package com.xinzhu.overmind.server.accounts;

import android.accounts.Account;
import android.util.LruCache;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TokenCache.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static final int f67901b = 64000;

    /* renamed from: a  reason: collision with root package name */
    private b f67902a = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TokenCache.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Account f67903a;

        /* renamed from: b  reason: collision with root package name */
        public final String f67904b;

        /* renamed from: c  reason: collision with root package name */
        public final String f67905c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f67906d;

        public a(Account account, String str, String str2, byte[] bArr) {
            this.f67903a = account;
            this.f67905c = str;
            this.f67904b = str2;
            this.f67906d = bArr;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f67903a, aVar.f67903a) && Objects.equals(this.f67904b, aVar.f67904b) && Objects.equals(this.f67905c, aVar.f67905c) && Arrays.equals(this.f67906d, aVar.f67906d);
        }

        public int hashCode() {
            return ((this.f67903a.hashCode() ^ this.f67904b.hashCode()) ^ this.f67905c.hashCode()) ^ Arrays.hashCode(this.f67906d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TokenCache.java */
    /* loaded from: classes6.dex */
    public static class b extends LruCache<a, c> {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<Pair<String, String>, a> f67907a;

        /* renamed from: b  reason: collision with root package name */
        private HashMap<Account, a> f67908b;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: TokenCache.java */
        /* loaded from: classes6.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            private final List<a> f67909a = new ArrayList();

            public a() {
            }

            public void a(a aVar) {
                this.f67909a.add(aVar);
            }

            public void b() {
                for (a aVar : this.f67909a) {
                    b.this.remove(aVar);
                }
            }
        }

        public b() {
            super(i.f67901b);
            this.f67907a = new HashMap<>();
            this.f67908b = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a */
        public void entryRemoved(boolean z4, a aVar, c cVar, c cVar2) {
            a remove;
            if (cVar == null || cVar2 != null || (remove = this.f67907a.remove(new Pair(aVar.f67903a.type, cVar.f67911a))) == null) {
                return;
            }
            remove.b();
        }

        public void b(Account account) {
            a aVar = this.f67908b.get(account);
            if (aVar != null) {
                aVar.b();
            }
        }

        public void c(String str, String str2) {
            a aVar = this.f67907a.get(new Pair(str, str2));
            if (aVar != null) {
                aVar.b();
            }
        }

        public void d(a aVar, c cVar) {
            Pair<String, String> pair = new Pair<>(aVar.f67903a.type, cVar.f67911a);
            a aVar2 = this.f67907a.get(pair);
            if (aVar2 == null) {
                aVar2 = new a();
            }
            aVar2.a(aVar);
            this.f67907a.put(pair, aVar2);
            a aVar3 = this.f67908b.get(aVar.f67903a);
            if (aVar3 == null) {
                aVar3 = new a();
            }
            aVar3.a(aVar);
            this.f67908b.put(aVar.f67903a, aVar3);
            put(aVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: e */
        public int sizeOf(a aVar, c cVar) {
            return cVar.f67911a.length();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TokenCache.java */
    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f67911a;

        /* renamed from: b  reason: collision with root package name */
        public final long f67912b;

        public c(String str, long j4) {
            this.f67911a = str;
            this.f67912b = j4;
        }
    }

    public String a(Account account, String str, String str2, byte[] bArr) {
        c cVar = this.f67902a.get(new a(account, str, str2, bArr));
        long currentTimeMillis = System.currentTimeMillis();
        if (cVar == null || currentTimeMillis >= cVar.f67912b) {
            if (cVar != null) {
                d(account.type, cVar.f67911a);
                return null;
            }
            return null;
        }
        return cVar.f67911a;
    }

    public void b(Account account, String str, String str2, String str3, byte[] bArr, long j4) {
        Objects.requireNonNull(account);
        if (str == null || System.currentTimeMillis() > j4) {
            return;
        }
        this.f67902a.d(new a(account, str2, str3, bArr), new c(str, j4));
    }

    public void c(Account account) {
        this.f67902a.b(account);
    }

    public void d(String str, String str2) {
        this.f67902a.c(str, str2);
    }
}
