package com.beizi.fusion.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes2.dex */
public final class ae {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f6825f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static ae f6826g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6827a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<b>> f6828b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f6829c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f6830d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f6831e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f6833a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<b> f6834b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.f6833a = intent;
            this.f6834b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f6835a;

        /* renamed from: b  reason: collision with root package name */
        final BroadcastReceiver f6836b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6837c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6838d;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f6835a = intentFilter;
            this.f6836b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f6836b);
            sb.append(" filter=");
            sb.append(this.f6835a);
            if (this.f6838d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private ae(Context context) {
        this.f6827a = context;
        this.f6831e = new Handler(context.getMainLooper()) { // from class: com.beizi.fusion.g.ae.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    ae.this.a();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    @NonNull
    public static ae a(@NonNull Context context) {
        ae aeVar;
        synchronized (f6825f) {
            if (f6826g == null) {
                f6826g = new ae(context.getApplicationContext());
            }
            aeVar = f6826g;
        }
        return aeVar;
    }

    public void a(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f6828b) {
            try {
                b bVar = new b(intentFilter, broadcastReceiver);
                ArrayList<b> arrayList = this.f6828b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f6828b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                    String action = intentFilter.getAction(i4);
                    ArrayList<b> arrayList2 = this.f6829c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f6829c.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void a(@NonNull BroadcastReceiver broadcastReceiver) {
        ArrayList<b> remove;
        synchronized (this.f6828b) {
            try {
                remove = this.f6828b.remove(broadcastReceiver);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                b bVar = remove.get(size);
                bVar.f6838d = true;
                for (int i4 = 0; i4 < bVar.f6835a.countActions(); i4++) {
                    String action = bVar.f6835a.getAction(i4);
                    ArrayList<b> arrayList = this.f6829c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            b bVar2 = arrayList.get(size2);
                            if (bVar2.f6836b == broadcastReceiver) {
                                bVar2.f6838d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f6829c.remove(action);
                        }
                    }
                }
            }
        }
    }

    public boolean a(@NonNull Intent intent) {
        int i4;
        String str;
        ArrayList arrayList;
        ArrayList<b> arrayList2;
        String str2;
        synchronized (this.f6828b) {
            try {
                try {
                    String action = intent.getAction();
                    String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f6827a.getContentResolver());
                    Uri data = intent.getData();
                    String scheme = intent.getScheme();
                    Set<String> categories = intent.getCategories();
                    boolean z4 = (intent.getFlags() & 8) != 0;
                    if (z4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Resolving type ");
                        sb.append(resolveTypeIfNeeded);
                        sb.append(" scheme ");
                        sb.append(scheme);
                        sb.append(" of intent ");
                        sb.append(intent);
                    }
                    ArrayList<b> arrayList3 = this.f6829c.get(intent.getAction());
                    if (arrayList3 != null) {
                        if (z4) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Action list: ");
                            sb2.append(arrayList3);
                        }
                        ArrayList arrayList4 = null;
                        int i5 = 0;
                        while (i5 < arrayList3.size()) {
                            b bVar = arrayList3.get(i5);
                            if (z4) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Matching against filter ");
                                sb3.append(bVar.f6835a);
                            }
                            if (bVar.f6837c) {
                                i4 = i5;
                                arrayList2 = arrayList3;
                                str = action;
                                str2 = resolveTypeIfNeeded;
                                arrayList = arrayList4;
                            } else {
                                i4 = i5;
                                str = action;
                                arrayList = arrayList4;
                                arrayList2 = arrayList3;
                                str2 = resolveTypeIfNeeded;
                                int match = bVar.f6835a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                if (match >= 0) {
                                    if (z4) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("  Filter matched!  match=0x");
                                        sb4.append(Integer.toHexString(match));
                                    }
                                    arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                    arrayList4.add(bVar);
                                    bVar.f6837c = true;
                                    i5 = i4 + 1;
                                    action = str;
                                    arrayList3 = arrayList2;
                                    resolveTypeIfNeeded = str2;
                                } else if (z4) {
                                    String str3 = match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category";
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("  Filter did not match: ");
                                    sb5.append(str3);
                                }
                            }
                            arrayList4 = arrayList;
                            i5 = i4 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        }
                        ArrayList arrayList5 = arrayList4;
                        if (arrayList5 != null) {
                            for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                                ((b) arrayList5.get(i6)).f6837c = false;
                            }
                            this.f6830d.add(new a(intent, arrayList5));
                            if (!this.f6831e.hasMessages(1)) {
                                this.f6831e.sendEmptyMessage(1);
                            }
                            return true;
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.f6828b) {
                size = this.f6830d.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.f6830d.toArray(aVarArr);
                this.f6830d.clear();
            }
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = aVarArr[i4];
                int size2 = aVar.f6834b.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    b bVar = aVar.f6834b.get(i5);
                    if (!bVar.f6838d) {
                        bVar.f6836b.onReceive(this.f6827a, aVar.f6833a);
                    }
                }
            }
        }
    }
}
