package com.kwad.framework.filedownloader.b;

import android.util.SparseArray;
import com.kwad.framework.filedownloader.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public final class b implements com.kwad.framework.filedownloader.b.a {
    final SparseArray<com.kwad.framework.filedownloader.d.c> agd = new SparseArray<>();
    final SparseArray<List<com.kwad.framework.filedownloader.d.a>> age = new SparseArray<>();

    /* loaded from: classes5.dex */
    class a implements a.InterfaceC0493a {
        a() {
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0493a
        public final void a(int i4, com.kwad.framework.filedownloader.d.c cVar) {
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0493a
        public final void c(com.kwad.framework.filedownloader.d.c cVar) {
        }

        @Override // java.lang.Iterable
        public final Iterator<com.kwad.framework.filedownloader.d.c> iterator() {
            return new C0494b();
        }

        @Override // com.kwad.framework.filedownloader.b.a.InterfaceC0493a
        public final void vK() {
        }
    }

    /* renamed from: com.kwad.framework.filedownloader.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0494b implements Iterator<com.kwad.framework.filedownloader.d.c> {
        C0494b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ com.kwad.framework.filedownloader.d.c next() {
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
        }
    }

    private void d(com.kwad.framework.filedownloader.d.c cVar) {
        synchronized (this.agd) {
            this.agd.put(cVar.getId(), cVar);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, long j4, String str, String str2) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, String str, long j4, long j5, int i5) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, Throwable th) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, Throwable th, long j4) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(com.kwad.framework.filedownloader.d.a aVar) {
        List<com.kwad.framework.filedownloader.d.a> list;
        try {
            int id = aVar.getId();
            synchronized (this.age) {
                list = this.age.get(id);
                if (list == null) {
                    list = new ArrayList<>();
                    this.age.put(id, list);
                }
            }
            list.add(aVar);
        } catch (Exception unused) {
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(int i4, long j4) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(com.kwad.framework.filedownloader.d.c cVar) {
        if (cVar == null) {
            com.kwad.framework.filedownloader.f.d.d(this, "update but model == null!", new Object[0]);
        } else if (bk(cVar.getId()) != null) {
            synchronized (this.agd) {
                this.agd.remove(cVar.getId());
                this.agd.put(cVar.getId(), cVar);
            }
        } else {
            d(cVar);
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bj(int i4) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.d.c bk(int i4) {
        com.kwad.framework.filedownloader.d.c cVar;
        synchronized (this.agd) {
            cVar = this.agd.get(i4);
        }
        return cVar;
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final List<com.kwad.framework.filedownloader.d.a> bl(int i4) {
        List<com.kwad.framework.filedownloader.d.a> list;
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (this.age) {
                list = this.age.get(i4);
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bm(int i4) {
        try {
            synchronized (this.age) {
                this.age.remove(i4);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final boolean bn(int i4) {
        synchronized (this.agd) {
            this.agd.remove(i4);
        }
        return true;
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bo(int i4) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void c(int i4, long j4) {
        bn(i4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void clear() {
        synchronized (this.agd) {
            this.agd.clear();
        }
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void d(int i4, long j4) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void s(int i4, int i5) {
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final a.InterfaceC0493a vJ() {
        return new a();
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, int i5, long j4) {
        List<com.kwad.framework.filedownloader.d.a> list;
        synchronized (this.age) {
            list = this.age.get(i4);
        }
        if (list == null) {
            return;
        }
        for (com.kwad.framework.filedownloader.d.a aVar : list) {
            if (aVar.getIndex() == i5) {
                aVar.Q(j4);
                return;
            }
        }
    }
}
