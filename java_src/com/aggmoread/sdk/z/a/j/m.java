package com.aggmoread.sdk.z.a.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes2.dex */
public class m extends i {

    /* renamed from: b  reason: collision with root package name */
    private i f2220b;

    /* renamed from: c  reason: collision with root package name */
    private k f2221c;

    /* renamed from: d  reason: collision with root package name */
    private int f2222d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f2223e = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes2.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                int i5 = message.arg1;
                int i6 = message.arg2;
                Object obj = message.obj;
                if (m.this.f2221c != null) {
                    m.this.f2221c.a(i5);
                }
                m.this.f2220b.a(i5, i6, obj != null ? Long.valueOf(obj.toString()).longValue() : 0L);
                return false;
            } else if (i4 == 2) {
                if (m.this.f2221c != null) {
                    m.this.f2221c.a(o.f2253b);
                }
                m.this.f2220b.b();
                return false;
            } else if (i4 == 3) {
                Object obj2 = message.obj;
                if (m.this.f2221c != null) {
                    m.this.f2221c.a(o.f2255d);
                }
                m.this.f2220b.a((File) obj2);
                return false;
            } else if (i4 == 4) {
                int i7 = message.arg1;
                Object obj3 = message.obj;
                if (m.this.f2221c != null) {
                    m.this.f2221c.a(o.f2256e);
                }
                m.this.f2220b.a(i7, obj3 != null ? obj3.toString() : "null msg");
                return false;
            } else if (i4 == 7) {
                String str = (String) message.obj;
                if (m.this.f2221c == null || TextUtils.isEmpty(str)) {
                    return false;
                }
                m.this.f2221c.a(str);
                return false;
            } else if (i4 == 5) {
                m.this.f2220b.a();
                return false;
            } else if (i4 == 6) {
                m.this.f2220b.c();
                return false;
            } else {
                return false;
            }
        }
    }

    public m(i iVar, k kVar) {
        this.f2220b = iVar == null ? i.f2206a : iVar;
        this.f2221c = kVar;
    }

    @Override // com.aggmoread.sdk.z.a.j.i
    public void a() {
        this.f2223e.sendMessage(Message.obtain(this.f2223e, 5));
    }

    @Override // com.aggmoread.sdk.z.a.j.i
    public void a(int i4, long j4, long j5) {
        if (i4 != this.f2222d) {
            Message obtain = Message.obtain(this.f2223e, 1, i4, (int) j4);
            obtain.obj = Long.valueOf(j5);
            this.f2223e.sendMessage(obtain);
            this.f2222d = i4;
        }
    }

    @Override // com.aggmoread.sdk.z.a.j.i
    public void a(int i4, String str) {
        this.f2223e.sendMessage(Message.obtain(this.f2223e, 4));
    }

    @Override // com.aggmoread.sdk.z.a.j.i
    public void a(File file) {
        this.f2223e.sendMessage(Message.obtain(this.f2223e, 3, file));
    }

    @Override // com.aggmoread.sdk.z.a.j.i
    public void b() {
        this.f2223e.sendMessage(Message.obtain(this.f2223e, 2));
    }

    @Override // com.aggmoread.sdk.z.a.j.i
    public void c() {
        this.f2223e.sendMessage(Message.obtain(this.f2223e, 6));
    }
}
