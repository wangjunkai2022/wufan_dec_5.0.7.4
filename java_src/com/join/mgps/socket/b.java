package com.join.mgps.socket;

import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.socket.entity.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SocketCommendManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f54609b = "b";

    /* renamed from: c  reason: collision with root package name */
    private static final int f54610c = 5;

    /* renamed from: a  reason: collision with root package name */
    com.join.mgps.socket.a f54611a = com.join.mgps.socket.a.b();

    /* compiled from: SocketCommendManager.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54612a = new b();

        private a() {
        }
    }

    public static List<List<DownloadTask>> c(List<DownloadTask> list, int i4) {
        int i5;
        ArrayList arrayList = new ArrayList();
        int size = list.size() % i4 == 0 ? list.size() / i4 : (list.size() / i4) + 1;
        int i6 = 0;
        while (i6 < size) {
            ArrayList arrayList2 = new ArrayList();
            int i7 = i6 * i4;
            while (true) {
                i5 = i6 + 1;
                if (i7 <= (i4 * i5) - 1) {
                    if (i7 <= list.size() - 1) {
                        arrayList2.add(list.get(i7));
                    }
                    i7++;
                }
            }
            arrayList.add(arrayList2);
            i6 = i5;
        }
        return arrayList;
    }

    public static b d() {
        return a.f54612a;
    }

    public void a() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54668n));
    }

    public void b() {
        this.f54611a.a();
    }

    public void e(String str) {
        if (str != null) {
            this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54672r + str));
        }
    }

    public void f() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54661g + com.join.mgps.Util.h.a()));
    }

    public void g() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54669o));
    }

    public void h() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54665k));
    }

    public void i() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54664j));
    }

    public void j(com.join.mgps.socket.entity.d dVar) {
        if (dVar != null) {
            this.f54611a.d(dVar);
        }
    }

    public void k() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54660f));
    }

    public void l(String str) {
        if (str != null) {
            this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54671q + str));
        }
    }

    public void m(String str) {
        if (str != null) {
            this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54663i + str));
        }
    }

    public void n(List<DownloadTask> list) {
        if (list != null) {
            List<List<DownloadTask>> c5 = c(list, 5);
            int size = list.size();
            for (List<DownloadTask> list2 : c5) {
                String json = JsonMapper.getInstance().toJson(list2);
                StringBuilder sb = new StringBuilder();
                sb.append("Task列表: ");
                sb.append(json);
                this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54667m + size + ":" + json));
            }
        }
    }

    public void o() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54670p));
    }

    public void p() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54662h));
    }

    public void q() {
        if (this.f54611a == null) {
            return;
        }
        this.f54611a.d(new h(com.join.mgps.socket.entity.a.f54666l));
    }
}
