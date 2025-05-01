package com.xinzhu.overmind.server.os;

import android.app.NotificationManager;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.os.c;
import com.xinzhu.overmind.utils.wrappers.ObjectsWrapper;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: MindNotificationManagerService.java */
/* loaded from: classes.dex */
public class g extends c.b implements com.xinzhu.overmind.server.d {
    public static final String TAG = g.class.getSimpleName();
    private static g sService = new g();
    HashSet<a> cached_notifications = new HashSet<>();
    private NotificationManager mNotificationManager = (NotificationManager) Overmind.getContext().getSystemService("notification");

    /* compiled from: MindNotificationManagerService.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f68028a;

        /* renamed from: b  reason: collision with root package name */
        public int f68029b;

        /* renamed from: c  reason: collision with root package name */
        public int f68030c;

        /* renamed from: d  reason: collision with root package name */
        public String f68031d;

        /* renamed from: e  reason: collision with root package name */
        public String f68032e;

        public a(String str, int i4, int i5, String str2) {
            this.f68028a = str;
            this.f68029b = i4;
            this.f68030c = i5;
            this.f68031d = str2;
            String str3 = "stub_noti_" + this.f68028a + "_" + this.f68029b + "_";
            if (this.f68031d == null) {
                this.f68032e = str3;
                return;
            }
            this.f68032e = str3 + this.f68031d;
        }
    }

    public static g get() {
        return sService;
    }

    @Override // com.xinzhu.overmind.server.os.c
    public String solveAddNotification(String str, int i4, int i5, String str2) throws RemoteException {
        Iterator<a> it2 = this.cached_notifications.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (ObjectsWrapper.equals(next.f68031d, str2) && next.f68030c == i5 && next.f68028a.equals(str) && next.f68029b == i4) {
                return next.f68032e;
            }
        }
        String str3 = TAG;
        com.xinzhu.overmind.b.c(str3, "CachedNotificationInfo " + str + " " + str2);
        a aVar = new a(str, i4, i5, str2);
        this.cached_notifications.add(aVar);
        return aVar.f68032e;
    }

    @Override // com.xinzhu.overmind.server.os.c
    public void solveCancelAllNotifications(String str, int i4) throws RemoteException {
        Iterator<a> it2 = this.cached_notifications.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (next.f68028a.equals(str) && next.f68029b == i4) {
                this.mNotificationManager.cancel(next.f68032e, next.f68030c);
                this.cached_notifications.remove(next);
            }
        }
    }

    @Override // com.xinzhu.overmind.server.os.c
    public String solveCancelNotification(String str, int i4, int i5, String str2) throws RemoteException {
        Iterator<a> it2 = this.cached_notifications.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (ObjectsWrapper.equals(next.f68031d, str2) && next.f68030c == i5 && next.f68028a.equals(str) && next.f68029b == i4) {
                this.cached_notifications.remove(next);
                return next.f68032e;
            }
        }
        return null;
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
    }
}
