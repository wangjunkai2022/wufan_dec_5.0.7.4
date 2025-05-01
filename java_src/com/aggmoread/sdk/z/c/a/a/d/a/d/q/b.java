package com.aggmoread.sdk.z.c.a.a.d.a.d.q;

import android.os.CountDownTimer;
import androidx.core.app.NotificationCompat;
import com.aggmoread.sdk.client.AMConst;
import com.aggmoread.sdk.z.c.a.a.d.a.d.q.e;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.googlecode.mp4parser.boxes.apple.x0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    protected LinkedHashMap<String, com.aggmoread.sdk.z.c.a.a.d.a.d.q.e<T>> f3011a = new LinkedHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3013c;

        a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
            this.f3012b = dVar;
            this.f3013c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b(this.f3012b, this.f3013c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.q.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class CountDownTimerC0119b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3016b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.a.d.q.e f3017c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f3018d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.c.f f3019e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CountDownTimerC0119b(long j4, long j5, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, com.aggmoread.sdk.z.c.a.a.d.a.d.q.e eVar2, f fVar, com.aggmoread.sdk.z.c.a.a.c.f fVar2) {
            super(j4, j5);
            this.f3015a = dVar;
            this.f3016b = eVar;
            this.f3017c = eVar2;
            this.f3018d = fVar;
            this.f3019e = fVar2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            b.this.a(this.f3015a, this.f3016b, this.f3017c, this.f3018d, this.f3019e, false, "onFinish");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3021b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3022c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f3023d;

        c(b bVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, f fVar) {
            this.f3021b = dVar;
            this.f3022c = eVar;
            this.f3023d = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.b(this.f3021b, this.f3022c, this.f3023d, null, "timeOut");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements g<T> {

        /* renamed from: a  reason: collision with root package name */
        int f3024a = 0;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f3025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CountDownTimer f3026c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3027d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.e f3028e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.a.d.q.e f3029f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f3030g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.c.f f3031h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f f3032i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Runnable f3033j;

        d(List list, CountDownTimer countDownTimer, com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, com.aggmoread.sdk.z.c.a.a.d.a.d.q.e eVar2, f fVar, com.aggmoread.sdk.z.c.a.a.c.f fVar2, f fVar3, Runnable runnable) {
            this.f3025b = list;
            this.f3026c = countDownTimer;
            this.f3027d = dVar;
            this.f3028e = eVar;
            this.f3029f = eVar2;
            this.f3030g = fVar;
            this.f3031h = fVar2;
            this.f3032i = fVar3;
            this.f3033j = runnable;
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b.g
        public void a() {
            this.f3024a++;
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "err c " + this.f3024a + ",total " + this.f3025b.size());
            if (this.f3024a >= this.f3025b.size()) {
                this.f3026c.cancel();
                b.this.a(this.f3027d, this.f3028e, this.f3029f, this.f3030g, this.f3031h, false, "err end");
                b.b(this.f3027d, this.f3028e, this.f3032i, this.f3033j, NotificationCompat.CATEGORY_ERROR);
            }
        }

        @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.q.b.g
        public void onAdLoaded(List<T> list) {
            if (list != null) {
                for (T t4 : list) {
                    if (t4 != null) {
                        this.f3029f.a(new e.a<>(t4, b.a(t4)));
                    }
                }
            }
            this.f3024a++;
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "load c " + this.f3024a + ",total " + this.f3025b.size());
            b.this.a(this.f3027d, this.f3028e, this.f3029f, this.f3030g, this.f3031h, false, "loaded end ");
            if (this.f3024a >= this.f3025b.size()) {
                this.f3026c.cancel();
                b.b(this.f3027d, this.f3028e, this.f3032i, this.f3033j, x0.f13710s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.c.a.a.d.b.d f3035b;

        e(b bVar, com.aggmoread.sdk.z.c.a.a.d.b.d dVar) {
            this.f3035b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3035b.f3263g.a(new com.aggmoread.sdk.z.c.a.a.d.b.i(1001004001, "广告无填充"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3036a;

        private f() {
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public interface g<K> {
        void a();

        void onAdLoaded(List<K> list);
    }

    protected static int a(Object obj) {
        int i4;
        Map<String, Object> h4;
        if ((obj instanceof com.aggmoread.sdk.z.c.a.a.c.a) && (h4 = ((com.aggmoread.sdk.z.c.a.a.c.a) obj).h()) != null && h4.containsKey(AMConst.ExtrasKey.AD_PRICE)) {
            Object obj2 = h4.get(AMConst.ExtrasKey.AD_PRICE);
            if (obj2 instanceof String) {
                try {
                    i4 = Integer.parseInt((String) obj2);
                } catch (Exception e5) {
                    com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "gap error : " + e5.getMessage());
                }
                com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "gap p : " + i4);
                return i4;
            }
        }
        i4 = -1;
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "gap p : " + i4);
        return i4;
    }

    protected static String a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Object obj) {
        String a5 = obj instanceof com.aggmoread.sdk.z.c.a.a.c.a ? com.aggmoread.sdk.z.c.a.a.e.m.a(dVar, eVar, ((com.aggmoread.sdk.z.c.a.a.c.a) obj).h()) : "-1";
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "grap p : " + a5);
        return a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.aggmoread.sdk.z.c.a.a.c.f r6, com.aggmoread.sdk.z.c.a.a.d.b.d r7, com.aggmoread.sdk.z.c.a.a.d.b.e r8, com.aggmoread.sdk.z.c.a.a.d.a.d.q.e.a<T> r9) {
        /*
            r5 = this;
            java.lang.String r0 = "ACBHTAG"
            java.lang.String r1 = "notify "
            com.aggmoread.sdk.z.c.a.a.e.e.b(r0, r1)
            if (r9 == 0) goto L93
            T r9 = r9.f3049b
            r1 = 0
            boolean r2 = r9 instanceof com.aggmoread.sdk.z.c.a.a.d.b.a
            if (r2 == 0) goto L19
            r1 = r9
            com.aggmoread.sdk.z.c.a.a.d.b.a r1 = (com.aggmoread.sdk.z.c.a.a.d.b.a) r1
            com.aggmoread.sdk.z.c.a.a.d.b.d r2 = r1.f3244c
            r1.f3244c = r7
        L17:
            r1 = r2
            goto L25
        L19:
            boolean r2 = r9 instanceof com.aggmoread.sdk.z.c.a.a.d.a.a
            if (r2 == 0) goto L25
            r1 = r9
            com.aggmoread.sdk.z.c.a.a.d.a.a r1 = (com.aggmoread.sdk.z.c.a.a.d.a.a) r1
            com.aggmoread.sdk.z.c.a.a.d.b.d r2 = r1.f2798d
            r1.f2798d = r7
            goto L17
        L25:
            java.lang.String r2 = ""
            if (r1 == 0) goto L2c
            java.lang.String r1 = r1.f3259c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            if (r7 == 0) goto L31
            java.lang.String r2 = r7.f3259c
        L31:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "rca "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", cc "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.aggmoread.sdk.z.c.a.a.e.e.b(r0, r1)
            boolean r0 = r9 instanceof com.aggmoread.sdk.z.c.a.a.c.a
            if (r0 == 0) goto L61
            r0 = r9
            com.aggmoread.sdk.z.c.a.a.c.a r0 = (com.aggmoread.sdk.z.c.a.a.c.a) r0
            java.util.Map r0 = r0.h()
            if (r0 == 0) goto L61
            java.lang.String r1 = r7.f3259c
            java.lang.String r2 = "EXTRA_network_ad_ID"
            r0.put(r2, r1)
        L61:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            com.aggmoread.sdk.z.c.a.a.d.b.k r1 = new com.aggmoread.sdk.z.c.a.a.d.b.k
            r1.<init>(r7, r8)
            r2 = 9
            com.aggmoread.sdk.z.c.a.a.d.b.k r1 = r1.a(r2)
            java.lang.Object r2 = com.aggmoread.sdk.z.c.a.a.d.b.k.b.f3451q
            java.lang.String r7 = a(r7, r8, r9)
            com.aggmoread.sdk.z.c.a.a.d.b.k r7 = r1.a(r2, r7)
            java.lang.Object r8 = com.aggmoread.sdk.z.c.a.a.d.b.k.b.B
            int r9 = r0.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            com.aggmoread.sdk.z.c.a.a.d.b.k r7 = r7.a(r8, r9)
            r7.b()
            r5.a(r6, r0)
            goto La7
        L93:
            java.lang.String r7 = "notify err"
            com.aggmoread.sdk.z.c.a.a.e.e.b(r0, r7)
            if (r6 == 0) goto La7
            com.aggmoread.sdk.z.c.a.a.d.b.i r7 = new com.aggmoread.sdk.z.c.a.a.d.b.i
            r8 = 1001005006(0x3baa1fce, float:0.0051917797)
            java.lang.String r9 = "全部广告请求失败，无合适广告返回!"
            r7.<init>(r8, r9)
            r6.a(r7)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.a.d.q.b.a(com.aggmoread.sdk.z.c.a.a.c.f, com.aggmoread.sdk.z.c.a.a.d.b.d, com.aggmoread.sdk.z.c.a.a.d.b.e, com.aggmoread.sdk.z.c.a.a.d.a.d.q.e$a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, com.aggmoread.sdk.z.c.a.a.d.a.d.q.e<T> eVar2, f fVar, com.aggmoread.sdk.z.c.a.a.c.f fVar2, boolean z4, String str) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "try rca ,  : " + fVar.f3036a + ", info : " + str + ", preLoad " + dVar.f3282z);
        if (fVar.f3036a || dVar.f3282z) {
            return;
        }
        e.a<T> b5 = eVar2.b();
        if (z4 && b5 == null) {
            return;
        }
        fVar.f3036a = true;
        a(fVar2, dVar, eVar, b5);
    }

    private com.aggmoread.sdk.z.c.a.a.c.f b(com.aggmoread.sdk.z.c.a.a.c.f fVar, g<T> gVar) {
        try {
            return a(fVar, gVar);
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "Exception err " + e5.getMessage());
            e5.printStackTrace();
            return fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        com.aggmoread.sdk.z.c.a.a.e.f fVar;
        Map<Object, Object> map;
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "loadAdInner enter ");
        if (eVar == null || (fVar = eVar.f3308b) == null || (map = fVar.f3494a) == null) {
            return;
        }
        List list = (List) map.get(e.c.f3320a);
        ArrayList<com.aggmoread.sdk.z.c.a.a.d.a.d.q.c> arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                com.aggmoread.sdk.z.c.a.a.e.f fVar2 = new com.aggmoread.sdk.z.c.a.a.e.f((Map) list.get(i4));
                if (fVar2.b(e.c.V) > dVar.f3278v) {
                    com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "loadAdInner list " + i4);
                    if (fVar2.b(e.c.f3325c0) == 0) {
                        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "loadAdInner bidAd");
                        arrayList.add(new j(eVar, fVar2, i4));
                    } else {
                        n nVar = new n(i4, (Map) list.get(i4));
                        int b5 = fVar2.b(e.c.Y);
                        if (b5 == 1) {
                            arrayList4.add(nVar);
                        } else if (b5 == 100) {
                            arrayList2.add(nVar);
                        } else if (b5 == 101) {
                            arrayList3.add(nVar);
                        } else if (b5 == 107) {
                            arrayList5.add(nVar);
                        } else {
                            arrayList6.add(nVar);
                        }
                    }
                }
            }
            if (!arrayList6.isEmpty()) {
                arrayList.add(new o(dVar, eVar, arrayList6, -1));
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new o(dVar, eVar, arrayList2, 100));
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(new o(dVar, eVar, arrayList3, 101));
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(new o(dVar, eVar, arrayList4, 1));
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(new o(dVar, eVar, arrayList5, 107));
            }
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "adConcurrentResponseList size : " + arrayList.size());
        }
        if (arrayList.isEmpty()) {
            com.aggmoread.sdk.z.c.a.a.e.n.a(new e(this, dVar));
            return;
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "loadAdInner placementId : " + dVar.f3265i);
        com.aggmoread.sdk.z.c.a.a.c.f fVar3 = dVar.f3263g;
        f fVar4 = new f(null);
        f fVar5 = new f(null);
        com.aggmoread.sdk.z.c.a.a.d.a.d.q.e<T> eVar2 = this.f3011a.get(dVar.f3265i);
        if (eVar2 == null) {
            eVar2 = new com.aggmoread.sdk.z.c.a.a.d.a.d.q.e<>(dVar.f3265i);
            this.f3011a.put(dVar.f3265i, eVar2);
        } else {
            eVar2.a();
        }
        com.aggmoread.sdk.z.c.a.a.d.a.d.q.e<T> eVar3 = eVar2;
        long j4 = dVar.A;
        if (j4 <= 0) {
            j4 = a();
        }
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "loadAdInner placementId : " + dVar.f3265i + ", requestTimeOut = " + j4);
        CountDownTimerC0119b countDownTimerC0119b = new CountDownTimerC0119b(j4, 500L, dVar, eVar, eVar3, fVar4, fVar3);
        c cVar = new c(this, dVar, eVar, fVar5);
        dVar.f3263g = b(fVar3, new d(arrayList, countDownTimerC0119b, dVar, eVar, eVar3, fVar4, fVar3, fVar5, cVar));
        a(dVar, eVar, eVar3, fVar4, fVar3, true, "bef load");
        for (com.aggmoread.sdk.z.c.a.a.d.a.d.q.c cVar2 : arrayList) {
            com.aggmoread.sdk.z.c.a.a.d.b.g.a(dVar, cVar2);
        }
        com.aggmoread.sdk.z.c.a.a.e.n.a().postDelayed(cVar, 20000L);
        if (fVar4.f3036a) {
            return;
        }
        countDownTimerC0119b.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, f fVar, Runnable runnable, String str) {
        String str2 = dVar != null ? dVar.f3259c : "";
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "try rle , " + fVar.f3036a + ", info : " + str + ", rid : " + str2);
        if (fVar.f3036a) {
            return;
        }
        fVar.f3036a = true;
        if (runnable != null) {
            com.aggmoread.sdk.z.c.a.a.e.n.a().removeCallbacks(runnable);
        }
        if (eVar != null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "tryEnd");
            eVar.k();
        }
    }

    protected long a() {
        return 3000L;
    }

    protected abstract com.aggmoread.sdk.z.c.a.a.c.f a(com.aggmoread.sdk.z.c.a.a.c.f fVar, g<T> gVar);

    protected abstract void a(com.aggmoread.sdk.z.c.a.a.c.f fVar, List<T> list);

    public void a(com.aggmoread.sdk.z.c.a.a.d.b.d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar) {
        com.aggmoread.sdk.z.c.a.a.e.e.b("ACBHTAG", "loadAd enter ");
        com.aggmoread.sdk.z.c.a.a.e.n.a(new a(dVar, eVar));
    }
}
