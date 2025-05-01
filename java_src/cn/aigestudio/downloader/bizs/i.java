package cn.aigestudio.downloader.bizs;

import java.net.HttpURLConnection;
/* compiled from: DLThread.java */
/* loaded from: classes2.dex */
class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f466e = i.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private j f467b;

    /* renamed from: c  reason: collision with root package name */
    private f f468c;

    /* renamed from: d  reason: collision with root package name */
    private l f469d;

    public i(j jVar, f fVar, l lVar) {
        this.f467b = jVar;
        this.f469d = lVar;
        this.f468c = fVar;
    }

    private void a(HttpURLConnection httpURLConnection) {
        for (e eVar : this.f468c.f436o) {
            httpURLConnection.addRequestProperty(eVar.f420a, eVar.f421b);
        }
        httpURLConnection.setRequestProperty("Range", "bytes=" + this.f467b.f472c + "-" + this.f467b.f473d);
    }

    public f b() {
        return this.f468c;
    }

    public j c() {
        return this.f467b;
    }

    public void d(f fVar) {
        this.f468c = fVar;
    }

    public void e(j jVar) {
        this.f467b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.aigestudio.downloader.bizs.i.run():void");
    }
}
