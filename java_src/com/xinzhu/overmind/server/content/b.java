package com.xinzhu.overmind.server.content;

import android.database.IContentObserver;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.xinzhu.overmind.server.content.a;
import com.xinzhu.overmind.server.d;
import java.util.ArrayList;
/* compiled from: MindContentService.java */
/* loaded from: classes.dex */
public class b extends a.b implements d {
    public static final String TAG = b.class.getSimpleName();
    private static final b sService = new b();
    private final C0754b mRootNode = new C0754b("");
    private final Object mSyncManagerLock = new Object();

    /* compiled from: MindContentService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final C0754b f67951a;

        /* renamed from: b  reason: collision with root package name */
        final IContentObserver f67952b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f67953c;

        a(C0754b c0754b, IContentObserver iContentObserver, boolean z4) {
            this.f67951a = c0754b;
            this.f67952b = iContentObserver;
            this.f67953c = z4;
        }
    }

    /* compiled from: MindContentService.java */
    /* renamed from: com.xinzhu.overmind.server.content.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0754b {

        /* renamed from: d  reason: collision with root package name */
        public static final int f67954d = 0;

        /* renamed from: e  reason: collision with root package name */
        public static final int f67955e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f67956f = 2;

        /* renamed from: a  reason: collision with root package name */
        private String f67957a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<C0754b> f67958b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<a> f67959c = new ArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MindContentService.java */
        /* renamed from: com.xinzhu.overmind.server.content.b$b$a */
        /* loaded from: classes.dex */
        public class a implements IBinder.DeathRecipient {

            /* renamed from: b  reason: collision with root package name */
            public final IContentObserver f67960b;

            /* renamed from: c  reason: collision with root package name */
            public final int f67961c;

            /* renamed from: d  reason: collision with root package name */
            public final int f67962d;

            /* renamed from: e  reason: collision with root package name */
            public final boolean f67963e;

            /* renamed from: f  reason: collision with root package name */
            private final int f67964f;

            /* renamed from: g  reason: collision with root package name */
            private final Object f67965g;

            public a(IContentObserver iContentObserver, boolean z4, Object obj, int i4, int i5, int i6) {
                this.f67965g = obj;
                this.f67960b = iContentObserver;
                this.f67961c = i4;
                this.f67962d = i5;
                this.f67964f = i6;
                this.f67963e = z4;
                try {
                    iContentObserver.asBinder().linkToDeath(this, 0);
                } catch (RemoteException unused) {
                    binderDied();
                }
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                synchronized (this.f67965g) {
                    C0754b.this.h(this.f67960b);
                }
            }
        }

        public C0754b(String str) {
            this.f67957a = str;
        }

        private void b(Uri uri, int i4, IContentObserver iContentObserver, boolean z4, Object obj, int i5, int i6, int i7) {
            if (i4 == f(uri)) {
                this.f67959c.add(new a(iContentObserver, z4, obj, i5, i6, i7));
                return;
            }
            String g4 = g(uri, i4);
            if (g4 != null) {
                int size = this.f67958b.size();
                for (int i8 = 0; i8 < size; i8++) {
                    C0754b c0754b = this.f67958b.get(i8);
                    if (c0754b.f67957a.equals(g4)) {
                        c0754b.b(uri, i4 + 1, iContentObserver, z4, obj, i5, i6, i7);
                        return;
                    }
                }
                C0754b c0754b2 = new C0754b(g4);
                this.f67958b.add(c0754b2);
                c0754b2.b(uri, i4 + 1, iContentObserver, z4, obj, i5, i6, i7);
                return;
            }
            throw new IllegalArgumentException("Invalid Uri (" + uri + ") used for observer");
        }

        private void d(boolean z4, IContentObserver iContentObserver, boolean z5, int i4, ArrayList<a> arrayList) {
            int size = this.f67959c.size();
            IBinder asBinder = iContentObserver == null ? null : iContentObserver.asBinder();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = this.f67959c.get(i5);
                boolean z6 = aVar.f67960b.asBinder() == asBinder;
                if ((!z6 || z5) && ((i4 == -1 || aVar.f67964f == -1 || i4 == aVar.f67964f) && (z4 || aVar.f67963e))) {
                    arrayList.add(new a(this, aVar.f67960b, z6));
                }
            }
        }

        private int f(Uri uri) {
            if (uri == null) {
                return 0;
            }
            return uri.getPathSegments().size() + 1;
        }

        private String g(Uri uri, int i4) {
            if (uri != null) {
                if (i4 == 0) {
                    return uri.getAuthority();
                }
                return uri.getPathSegments().get(i4 - 1);
            }
            return null;
        }

        public void c(Uri uri, IContentObserver iContentObserver, boolean z4, Object obj, int i4, int i5, int i6) {
            b(uri, 0, iContentObserver, z4, obj, i4, i5, i6);
        }

        public void e(Uri uri, int i4, IContentObserver iContentObserver, boolean z4, int i5, ArrayList<a> arrayList) {
            String str;
            if (i4 >= f(uri)) {
                d(true, iContentObserver, z4, i5, arrayList);
                str = null;
            } else {
                String g4 = g(uri, i4);
                d(false, iContentObserver, z4, i5, arrayList);
                str = g4;
            }
            int size = this.f67958b.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0754b c0754b = this.f67958b.get(i6);
                if (str == null || c0754b.f67957a.equals(str)) {
                    c0754b.e(uri, i4 + 1, iContentObserver, z4, i5, arrayList);
                    if (str != null) {
                        return;
                    }
                }
            }
        }

        public boolean h(IContentObserver iContentObserver) {
            int size = this.f67958b.size();
            int i4 = 0;
            while (i4 < size) {
                if (this.f67958b.get(i4).h(iContentObserver)) {
                    this.f67958b.remove(i4);
                    i4--;
                    size--;
                }
                i4++;
            }
            IBinder asBinder = iContentObserver.asBinder();
            int size2 = this.f67959c.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    break;
                }
                a aVar = this.f67959c.get(i5);
                if (aVar.f67960b.asBinder() == asBinder) {
                    this.f67959c.remove(i5);
                    asBinder.unlinkToDeath(aVar, 0);
                    break;
                }
                i5++;
            }
            return this.f67958b.size() == 0 && this.f67959c.size() == 0;
        }
    }

    public static b get() {
        return sService;
    }

    @Override // com.xinzhu.overmind.server.content.a
    public void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i4, int i5) {
        if (Log.isLoggable(TAG, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Notifying update of ");
            sb.append(uri);
            sb.append(" for user ");
            sb.append(i4);
            sb.append(" from observer ");
            sb.append(iContentObserver);
            sb.append(", syncToNetwork ");
            sb.append(z5);
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList<a> arrayList = new ArrayList<>();
            synchronized (this.mRootNode) {
                this.mRootNode.e(uri, 0, iContentObserver, z4, i4, arrayList);
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar = arrayList.get(i6);
                try {
                    aVar.f67952b.onChange(aVar.f67953c, uri, i4);
                    if (Log.isLoggable(TAG, 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Notified ");
                        sb2.append(aVar.f67952b);
                        sb2.append(" of update at ");
                        sb2.append(uri);
                    }
                } catch (RemoteException unused) {
                    synchronized (this.mRootNode) {
                        IBinder asBinder = aVar.f67952b.asBinder();
                        ArrayList arrayList2 = aVar.f67951a.f67959c;
                        int size2 = arrayList2.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            if (((C0754b.a) arrayList2.get(i7)).f67960b.asBinder() == asBinder) {
                                arrayList2.remove(i7);
                                i7--;
                                size2--;
                            }
                            i7++;
                        }
                    }
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.content.a.b, android.os.Binder
    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        try {
            return super.onTransact(i4, parcel, parcel2, i5);
        } catch (RuntimeException e5) {
            if (!(e5 instanceof SecurityException)) {
                e5.printStackTrace();
            }
            throw e5;
        }
    }

    @Override // com.xinzhu.overmind.server.content.a
    public void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i4, int i5) {
        if (iContentObserver != null && uri != null) {
            synchronized (this.mRootNode) {
                C0754b c0754b = this.mRootNode;
                c0754b.c(uri, iContentObserver, z4, c0754b, i5, Binder.getCallingPid(), i4);
            }
            return;
        }
        throw new IllegalArgumentException("You must pass a valid uri and observer");
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
    }

    @Override // com.xinzhu.overmind.server.content.a
    public void unregisterContentObserver(IContentObserver iContentObserver) {
        if (iContentObserver != null) {
            synchronized (this.mRootNode) {
                this.mRootNode.h(iContentObserver);
            }
            return;
        }
        throw new IllegalArgumentException("You must pass a valid observer");
    }
}
