package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: AnimatorSet.java */
/* loaded from: classes5.dex */
public final class d extends com.nineoldandroids.animation.a {

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<com.nineoldandroids.animation.a> f57675c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private HashMap<com.nineoldandroids.animation.a, f> f57676d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<f> f57677e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<f> f57678f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private boolean f57679g = true;

    /* renamed from: h  reason: collision with root package name */
    private b f57680h = null;

    /* renamed from: i  reason: collision with root package name */
    boolean f57681i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57682j = false;

    /* renamed from: k  reason: collision with root package name */
    private long f57683k = 0;

    /* renamed from: l  reason: collision with root package name */
    private q f57684l = null;

    /* renamed from: m  reason: collision with root package name */
    private long f57685m = -1;

    /* compiled from: AnimatorSet.java */
    /* loaded from: classes5.dex */
    class a extends com.nineoldandroids.animation.c {

        /* renamed from: a  reason: collision with root package name */
        boolean f57686a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f57687b;

        a(ArrayList arrayList) {
            this.f57687b = arrayList;
        }

        @Override // com.nineoldandroids.animation.c, com.nineoldandroids.animation.a.InterfaceC0575a
        public void a(com.nineoldandroids.animation.a aVar) {
            this.f57686a = true;
        }

        @Override // com.nineoldandroids.animation.c, com.nineoldandroids.animation.a.InterfaceC0575a
        public void d(com.nineoldandroids.animation.a aVar) {
            if (this.f57686a) {
                return;
            }
            int size = this.f57687b.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = (f) this.f57687b.get(i4);
                fVar.f57700b.q();
                d.this.f57675c.add(fVar.f57700b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatorSet.java */
    /* loaded from: classes5.dex */
    public class b implements a.InterfaceC0575a {

        /* renamed from: a  reason: collision with root package name */
        private d f57689a;

        b(d dVar) {
            this.f57689a = dVar;
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void a(com.nineoldandroids.animation.a aVar) {
            ArrayList<a.InterfaceC0575a> arrayList;
            d dVar = d.this;
            if (dVar.f57681i || dVar.f57675c.size() != 0 || (arrayList = d.this.f57659b) == null) {
                return;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                d.this.f57659b.get(i4).a(this.f57689a);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void b(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void c(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void d(com.nineoldandroids.animation.a aVar) {
            aVar.j(this);
            d.this.f57675c.remove(aVar);
            boolean z4 = true;
            ((f) this.f57689a.f57676d.get(aVar)).f57705g = true;
            if (d.this.f57681i) {
                return;
            }
            ArrayList arrayList = this.f57689a.f57678f;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                } else if (!((f) arrayList.get(i4)).f57705g) {
                    z4 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z4) {
                ArrayList<a.InterfaceC0575a> arrayList2 = d.this.f57659b;
                if (arrayList2 != null) {
                    ArrayList arrayList3 = (ArrayList) arrayList2.clone();
                    int size2 = arrayList3.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((a.InterfaceC0575a) arrayList3.get(i5)).d(this.f57689a);
                    }
                }
                this.f57689a.f57682j = false;
            }
        }
    }

    /* compiled from: AnimatorSet.java */
    /* loaded from: classes5.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private f f57691a;

        c(com.nineoldandroids.animation.a aVar) {
            f fVar = (f) d.this.f57676d.get(aVar);
            this.f57691a = fVar;
            if (fVar == null) {
                this.f57691a = new f(aVar);
                d.this.f57676d.put(aVar, this.f57691a);
                d.this.f57677e.add(this.f57691a);
            }
        }

        public c a(long j4) {
            q U = q.U(0.0f, 1.0f);
            U.k(j4);
            b(U);
            return this;
        }

        public c b(com.nineoldandroids.animation.a aVar) {
            f fVar = (f) d.this.f57676d.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f57676d.put(aVar, fVar);
                d.this.f57677e.add(fVar);
            }
            this.f57691a.a(new C0576d(fVar, 1));
            return this;
        }

        public c c(com.nineoldandroids.animation.a aVar) {
            f fVar = (f) d.this.f57676d.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f57676d.put(aVar, fVar);
                d.this.f57677e.add(fVar);
            }
            fVar.a(new C0576d(this.f57691a, 1));
            return this;
        }

        public c d(com.nineoldandroids.animation.a aVar) {
            f fVar = (f) d.this.f57676d.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f57676d.put(aVar, fVar);
                d.this.f57677e.add(fVar);
            }
            fVar.a(new C0576d(this.f57691a, 0));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatorSet.java */
    /* renamed from: com.nineoldandroids.animation.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0576d {

        /* renamed from: c  reason: collision with root package name */
        static final int f57693c = 0;

        /* renamed from: d  reason: collision with root package name */
        static final int f57694d = 1;

        /* renamed from: a  reason: collision with root package name */
        public f f57695a;

        /* renamed from: b  reason: collision with root package name */
        public int f57696b;

        public C0576d(f fVar, int i4) {
            this.f57695a = fVar;
            this.f57696b = i4;
        }
    }

    /* compiled from: AnimatorSet.java */
    /* loaded from: classes5.dex */
    private static class e implements a.InterfaceC0575a {

        /* renamed from: a  reason: collision with root package name */
        private d f57697a;

        /* renamed from: b  reason: collision with root package name */
        private f f57698b;

        /* renamed from: c  reason: collision with root package name */
        private int f57699c;

        public e(d dVar, f fVar, int i4) {
            this.f57697a = dVar;
            this.f57698b = fVar;
            this.f57699c = i4;
        }

        private void e(com.nineoldandroids.animation.a aVar) {
            if (this.f57697a.f57681i) {
                return;
            }
            C0576d c0576d = null;
            int size = this.f57698b.f57702d.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                C0576d c0576d2 = this.f57698b.f57702d.get(i4);
                if (c0576d2.f57696b == this.f57699c && c0576d2.f57695a.f57700b == aVar) {
                    aVar.j(this);
                    c0576d = c0576d2;
                    break;
                }
                i4++;
            }
            this.f57698b.f57702d.remove(c0576d);
            if (this.f57698b.f57702d.size() == 0) {
                this.f57698b.f57700b.q();
                this.f57697a.f57675c.add(this.f57698b.f57700b);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void a(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void b(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void c(com.nineoldandroids.animation.a aVar) {
            if (this.f57699c == 0) {
                e(aVar);
            }
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void d(com.nineoldandroids.animation.a aVar) {
            if (this.f57699c == 1) {
                e(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatorSet.java */
    /* loaded from: classes5.dex */
    public static class f implements Cloneable {

        /* renamed from: b  reason: collision with root package name */
        public com.nineoldandroids.animation.a f57700b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<C0576d> f57701c = null;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<C0576d> f57702d = null;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<f> f57703e = null;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<f> f57704f = null;

        /* renamed from: g  reason: collision with root package name */
        public boolean f57705g = false;

        public f(com.nineoldandroids.animation.a aVar) {
            this.f57700b = aVar;
        }

        public void a(C0576d c0576d) {
            if (this.f57701c == null) {
                this.f57701c = new ArrayList<>();
                this.f57703e = new ArrayList<>();
            }
            this.f57701c.add(c0576d);
            if (!this.f57703e.contains(c0576d.f57695a)) {
                this.f57703e.add(c0576d.f57695a);
            }
            f fVar = c0576d.f57695a;
            if (fVar.f57704f == null) {
                fVar.f57704f = new ArrayList<>();
            }
            fVar.f57704f.add(this);
        }

        /* renamed from: b */
        public f clone() {
            try {
                f fVar = (f) super.clone();
                fVar.f57700b = this.f57700b.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }
    }

    private void E() {
        if (this.f57679g) {
            this.f57678f.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.f57677e.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = this.f57677e.get(i4);
                ArrayList<C0576d> arrayList2 = fVar.f57701c;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    arrayList.add(fVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    f fVar2 = (f) arrayList.get(i5);
                    this.f57678f.add(fVar2);
                    ArrayList<f> arrayList4 = fVar2.f57704f;
                    if (arrayList4 != null) {
                        int size3 = arrayList4.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            f fVar3 = fVar2.f57704f.get(i6);
                            fVar3.f57703e.remove(fVar2);
                            if (fVar3.f57703e.size() == 0) {
                                arrayList3.add(fVar3);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
                arrayList3.clear();
            }
            this.f57679g = false;
            if (this.f57678f.size() != this.f57677e.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int size4 = this.f57677e.size();
        for (int i7 = 0; i7 < size4; i7++) {
            f fVar4 = this.f57677e.get(i7);
            ArrayList<C0576d> arrayList5 = fVar4.f57701c;
            if (arrayList5 != null && arrayList5.size() > 0) {
                int size5 = fVar4.f57701c.size();
                for (int i8 = 0; i8 < size5; i8++) {
                    C0576d c0576d = fVar4.f57701c.get(i8);
                    if (fVar4.f57703e == null) {
                        fVar4.f57703e = new ArrayList<>();
                    }
                    if (!fVar4.f57703e.contains(c0576d.f57695a)) {
                        fVar4.f57703e.add(c0576d.f57695a);
                    }
                }
            }
            fVar4.f57705g = false;
        }
    }

    public void A(com.nineoldandroids.animation.a... aVarArr) {
        if (aVarArr != null) {
            this.f57679g = true;
            int i4 = 0;
            if (aVarArr.length == 1) {
                y(aVarArr[0]);
                return;
            }
            while (i4 < aVarArr.length - 1) {
                i4++;
                y(aVarArr[i4]).c(aVarArr[i4]);
            }
        }
    }

    public void B(Collection<com.nineoldandroids.animation.a> collection) {
        if (collection == null || collection.size() <= 0) {
            return;
        }
        this.f57679g = true;
        c cVar = null;
        for (com.nineoldandroids.animation.a aVar : collection) {
            if (cVar == null) {
                cVar = y(aVar);
            } else {
                cVar.d(aVar);
            }
        }
    }

    public void C(com.nineoldandroids.animation.a... aVarArr) {
        if (aVarArr != null) {
            this.f57679g = true;
            c y2 = y(aVarArr[0]);
            for (int i4 = 1; i4 < aVarArr.length; i4++) {
                y2.d(aVarArr[i4]);
            }
        }
    }

    @Override // com.nineoldandroids.animation.a
    /* renamed from: D */
    public d k(long j4) {
        if (j4 >= 0) {
            Iterator<f> it2 = this.f57677e.iterator();
            while (it2.hasNext()) {
                it2.next().f57700b.k(j4);
            }
            this.f57685m = j4;
            return this;
        }
        throw new IllegalArgumentException("duration must be a value of zero or greater");
    }

    @Override // com.nineoldandroids.animation.a
    public void c() {
        this.f57681i = true;
        if (h()) {
            if (this.f57678f.size() != this.f57677e.size()) {
                E();
                Iterator<f> it2 = this.f57678f.iterator();
                while (it2.hasNext()) {
                    f next = it2.next();
                    if (this.f57680h == null) {
                        this.f57680h = new b(this);
                    }
                    next.f57700b.a(this.f57680h);
                }
            }
            q qVar = this.f57684l;
            if (qVar != null) {
                qVar.cancel();
            }
            if (this.f57678f.size() > 0) {
                Iterator<f> it3 = this.f57678f.iterator();
                while (it3.hasNext()) {
                    it3.next().f57700b.c();
                }
            }
            ArrayList<a.InterfaceC0575a> arrayList = this.f57659b;
            if (arrayList != null) {
                Iterator it4 = ((ArrayList) arrayList.clone()).iterator();
                while (it4.hasNext()) {
                    ((a.InterfaceC0575a) it4.next()).d(this);
                }
            }
            this.f57682j = false;
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void cancel() {
        this.f57681i = true;
        if (h()) {
            ArrayList arrayList = null;
            ArrayList<a.InterfaceC0575a> arrayList2 = this.f57659b;
            if (arrayList2 != null) {
                arrayList = (ArrayList) arrayList2.clone();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((a.InterfaceC0575a) it2.next()).a(this);
                }
            }
            q qVar = this.f57684l;
            if (qVar != null && qVar.g()) {
                this.f57684l.cancel();
            } else if (this.f57678f.size() > 0) {
                Iterator<f> it3 = this.f57678f.iterator();
                while (it3.hasNext()) {
                    it3.next().f57700b.cancel();
                }
            }
            if (arrayList != null) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((a.InterfaceC0575a) it4.next()).d(this);
                }
            }
            this.f57682j = false;
        }
    }

    @Override // com.nineoldandroids.animation.a
    public long d() {
        return this.f57685m;
    }

    @Override // com.nineoldandroids.animation.a
    public long f() {
        return this.f57683k;
    }

    @Override // com.nineoldandroids.animation.a
    public boolean g() {
        Iterator<f> it2 = this.f57677e.iterator();
        while (it2.hasNext()) {
            if (it2.next().f57700b.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.nineoldandroids.animation.a
    public boolean h() {
        return this.f57682j;
    }

    @Override // com.nineoldandroids.animation.a
    public void l(Interpolator interpolator) {
        Iterator<f> it2 = this.f57677e.iterator();
        while (it2.hasNext()) {
            it2.next().f57700b.l(interpolator);
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void m(long j4) {
        this.f57683k = j4;
    }

    @Override // com.nineoldandroids.animation.a
    public void n(Object obj) {
        Iterator<f> it2 = this.f57677e.iterator();
        while (it2.hasNext()) {
            com.nineoldandroids.animation.a aVar = it2.next().f57700b;
            if (aVar instanceof d) {
                ((d) aVar).n(obj);
            } else if (aVar instanceof l) {
                ((l) aVar).n(obj);
            }
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void o() {
        Iterator<f> it2 = this.f57677e.iterator();
        while (it2.hasNext()) {
            it2.next().f57700b.o();
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void p() {
        Iterator<f> it2 = this.f57677e.iterator();
        while (it2.hasNext()) {
            it2.next().f57700b.p();
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void q() {
        this.f57681i = false;
        this.f57682j = true;
        E();
        int size = this.f57678f.size();
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = this.f57678f.get(i4);
            ArrayList<a.InterfaceC0575a> e5 = fVar.f57700b.e();
            if (e5 != null && e5.size() > 0) {
                Iterator it2 = new ArrayList(e5).iterator();
                while (it2.hasNext()) {
                    a.InterfaceC0575a interfaceC0575a = (a.InterfaceC0575a) it2.next();
                    if ((interfaceC0575a instanceof e) || (interfaceC0575a instanceof b)) {
                        fVar.f57700b.j(interfaceC0575a);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < size; i5++) {
            f fVar2 = this.f57678f.get(i5);
            if (this.f57680h == null) {
                this.f57680h = new b(this);
            }
            ArrayList<C0576d> arrayList2 = fVar2.f57701c;
            if (arrayList2 != null && arrayList2.size() != 0) {
                int size2 = fVar2.f57701c.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    C0576d c0576d = fVar2.f57701c.get(i6);
                    c0576d.f57695a.f57700b.a(new e(this, fVar2, c0576d.f57696b));
                }
                fVar2.f57702d = (ArrayList) fVar2.f57701c.clone();
            } else {
                arrayList.add(fVar2);
            }
            fVar2.f57700b.a(this.f57680h);
        }
        if (this.f57683k <= 0) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                f fVar3 = (f) it3.next();
                fVar3.f57700b.q();
                this.f57675c.add(fVar3.f57700b);
            }
        } else {
            q U = q.U(0.0f, 1.0f);
            this.f57684l = U;
            U.k(this.f57683k);
            this.f57684l.a(new a(arrayList));
            this.f57684l.q();
        }
        ArrayList<a.InterfaceC0575a> arrayList3 = this.f57659b;
        if (arrayList3 != null) {
            ArrayList arrayList4 = (ArrayList) arrayList3.clone();
            int size3 = arrayList4.size();
            for (int i7 = 0; i7 < size3; i7++) {
                ((a.InterfaceC0575a) arrayList4.get(i7)).c(this);
            }
        }
        if (this.f57677e.size() == 0 && this.f57683k == 0) {
            this.f57682j = false;
            ArrayList<a.InterfaceC0575a> arrayList5 = this.f57659b;
            if (arrayList5 != null) {
                ArrayList arrayList6 = (ArrayList) arrayList5.clone();
                int size4 = arrayList6.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    ((a.InterfaceC0575a) arrayList6.get(i8)).d(this);
                }
            }
        }
    }

    @Override // com.nineoldandroids.animation.a
    /* renamed from: w */
    public d clone() {
        d dVar = (d) super.clone();
        dVar.f57679g = true;
        dVar.f57681i = false;
        dVar.f57682j = false;
        dVar.f57675c = new ArrayList<>();
        dVar.f57676d = new HashMap<>();
        dVar.f57677e = new ArrayList<>();
        dVar.f57678f = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<f> it2 = this.f57677e.iterator();
        while (it2.hasNext()) {
            f next = it2.next();
            f clone = next.clone();
            hashMap.put(next, clone);
            dVar.f57677e.add(clone);
            dVar.f57676d.put(clone.f57700b, clone);
            ArrayList arrayList = null;
            clone.f57701c = null;
            clone.f57702d = null;
            clone.f57704f = null;
            clone.f57703e = null;
            ArrayList<a.InterfaceC0575a> e5 = clone.f57700b.e();
            if (e5 != null) {
                Iterator<a.InterfaceC0575a> it3 = e5.iterator();
                while (it3.hasNext()) {
                    a.InterfaceC0575a next2 = it3.next();
                    if (next2 instanceof b) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        e5.remove((a.InterfaceC0575a) it4.next());
                    }
                }
            }
        }
        Iterator<f> it5 = this.f57677e.iterator();
        while (it5.hasNext()) {
            f next3 = it5.next();
            f fVar = (f) hashMap.get(next3);
            ArrayList<C0576d> arrayList2 = next3.f57701c;
            if (arrayList2 != null) {
                Iterator<C0576d> it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    C0576d next4 = it6.next();
                    fVar.a(new C0576d((f) hashMap.get(next4.f57695a), next4.f57696b));
                }
            }
        }
        return dVar;
    }

    public ArrayList<com.nineoldandroids.animation.a> x() {
        ArrayList<com.nineoldandroids.animation.a> arrayList = new ArrayList<>();
        Iterator<f> it2 = this.f57677e.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().f57700b);
        }
        return arrayList;
    }

    public c y(com.nineoldandroids.animation.a aVar) {
        if (aVar != null) {
            this.f57679g = true;
            return new c(aVar);
        }
        return null;
    }

    public void z(List<com.nineoldandroids.animation.a> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f57679g = true;
        int i4 = 0;
        if (list.size() == 1) {
            y(list.get(0));
            return;
        }
        while (i4 < list.size() - 1) {
            i4++;
            y(list.get(i4)).c(list.get(i4));
        }
    }
}
