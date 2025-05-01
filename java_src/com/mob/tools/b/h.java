package com.mob.tools.b;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.mob.commons.a.l;
import com.mob.commons.s;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ReflectHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
/* loaded from: classes5.dex */
public class h {

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f56687a;

        public a(Object obj) {
            this.f56687a = obj;
        }

        public float a() {
            return ((Float) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("011^ej$fi[fdNccOdgdj[dcOec"), Float.valueOf(0.0f), new Object[0])).floatValue();
        }

        public double b() {
            return ((Double) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("011<ej9fiDfeYdiAdi<iSdgdc?f"), Double.valueOf(0.0d), new Object[0])).doubleValue();
        }

        public double c() {
            return ((Double) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("012?ej!fi=fedkPeDejdiIi$dgdc^f"), Double.valueOf(0.0d), new Object[0])).doubleValue();
        }

        public long d() {
            return ((Long) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("007PejCfiQfcdidf9f"), 0L, new Object[0])).longValue();
        }

        public String e() {
            return (String) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("0110ejMfiCgldjdkdddidcLfHdj"), null, new Object[0]);
        }

        public double f() {
            return ((Double) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("011YejWfiSfd'giYdi6iSdgdc[f"), Double.valueOf(0.0d), new Object[0])).doubleValue();
        }

        public float g() {
            return ((Float) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("010Iej6fi)fjBfdHdjdi%e5ej"), Float.valueOf(0.0f), new Object[0])).floatValue();
        }

        public float h() {
            return ((Float) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("008?ejHfi;elCjffHdc"), Float.valueOf(0.0f), new Object[0])).floatValue();
        }

        public boolean i() {
            if (Build.VERSION.SDK_INT >= 26) {
                return ((Boolean) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("019hdEfigkEf5dj9iQdiMcdg[fd4cc)dgdjIdc9ec"), Boolean.FALSE, new Object[0])).booleanValue();
            }
            return false;
        }

        public float j() {
            if (Build.VERSION.SDK_INT >= 26) {
                return ((Float) ReflectHelper.invokeInstanceMethodNoThrow(this.f56687a, s.a("0254ej5fiRgk0f6djSi[di9cdg(fd6ccTdgdjWdc!echcLfif^djfi"), Float.valueOf(0.0f), new Object[0])).floatValue();
            }
            return 0.0f;
        }

        public float a(Object obj) {
            if (obj != null) {
                try {
                    return ((Float) ReflectHelper.invokeInstanceMethod(this.f56687a, s.a("010;dcdifi=idecf5fcdk"), new Object[]{obj}, new Class[]{Class.forName(s.a("025deIdcdjdkdidcdl!g_dkHcdi]didk8eOdlfedk2cdi-didk.e"))})).floatValue();
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
            return 0.0f;
        }
    }

    public static Object a(Context context, String str) throws Throwable {
        int i4;
        int i5;
        int i6;
        Object a5;
        Parcel parcel;
        Parcel parcel2;
        if (!com.mob.commons.d.f() || !com.mob.tools.utils.f.a().a(str) || (i4 = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        com.mob.tools.a.d a6 = com.mob.tools.a.d.a(context);
        if (i4 >= 31) {
            Object a7 = a6.a(s.a("036de1dcdjdkdidcdl6gKdkKcdi'didk+eIdlfeAdNfiNi:fedk<cdiXdidkVe^gjFf(dedg*f5fiLi") + "$" + s.a("007]fjdgdiVgOdcCf)dj"));
            if (a7 != null) {
                i6 = 0;
                i5 = 1;
                a5 = a6.a(s.a("036deXdcdjdkdidcdlKgFdkQcdiYdidk3e0dlfe:dDfi0iNfedkZcdiOdidkHe[gjWfGdedg1fPfiTi") + "$" + s.a("007!fjdgdiZgLdcDfOdj"), a7, s.a("005Bffdgdi>g,dc"), (Class[]) null, (Object[]) null, (Object[]) null);
            } else {
                i5 = 1;
                i6 = 0;
                a5 = null;
            }
        } else {
            i5 = 1;
            i6 = 0;
            a5 = a6.a(s.a("032deYdcdjdkdidcdl0g<dk3cdiMdidkVeUdlfedk^cdi1didkMe^gjMfUdedgQfBfi[i"), (Object) null, s.a("028c1djVfdifWgcdjdkdfflYfj$dj!fcdif0dcgldjdkdddidc[fVdj"), new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE}, new Object[]{str, 0, 0, Boolean.TRUE}, (Object[]) null);
        }
        Object obj = a5;
        int intValue = ((Integer) a6.a(s.a("033deAdcdjdkdidcdlPgUdkYcdi$didk>e:dleefedk@cdi[didk'e<hcKdedDejQf;dj") + "$" + s.a("004Jel(iSdgff"), s.a("027;fcgjfdegelfdedfceeghegdhejZfiBfeHd9fi4i2fedk%cdiOdidk e"), null, -1)).intValue();
        String a8 = s.a("025deAdcdjdkdidcdldkfidlel9fTdjdddi$cfEhc(ded ej(f_dj");
        String a9 = s.a("010AejQfi*el8fJdjdddiYcf");
        Class[] clsArr = new Class[i5];
        clsArr[i6] = String.class;
        Object[] objArr = new Object[i5];
        objArr[i6] = s.a("008gZdk$cdi7didk)e");
        IBinder iBinder = (IBinder) a6.a(a8, (Object) null, a9, clsArr, objArr, (Object[]) null);
        if (obj == null || iBinder == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(s.a("033de0dcdjdkdidcdl$gQdk1cdi>didkOe2dleefedk cdiWdidkHe$hcVdedXejOfPdj"));
            if (i4 >= 31) {
                obtain.writeString(str);
                obtain.writeTypedObject((Parcelable) obj, i6);
                parcel = obtain2;
                parcel2 = obtain;
            } else {
                obtain.writeInt(i5);
                Class<?> cls = obj.getClass();
                String a10 = s.a("013_fgdjdiMifWfcdkglCd)dj<cfg");
                Class[] clsArr2 = new Class[2];
                clsArr2[i6] = Parcel.class;
                clsArr2[i5] = Integer.TYPE;
                Object[] objArr2 = new Object[2];
                objArr2[i6] = obtain;
                objArr2[i5] = Integer.valueOf(i6);
                parcel = obtain2;
                parcel2 = obtain;
                try {
                    a6.a(cls, obj, a10, clsArr2, objArr2, (Object[]) null);
                } catch (Throwable th) {
                    th = th;
                    com.mob.tools.a.d.a(context).b(context);
                    parcel.recycle();
                    parcel2.recycle();
                    throw th;
                }
            }
            parcel2.writeString(context.getPackageName());
            if (i4 >= 30) {
                parcel2.writeString(context.getAttributionTag());
            }
            iBinder.transact(intValue, parcel2, parcel, i6);
            parcel.readException();
            Object readTypedObject = parcel.readTypedObject(a());
            com.mob.tools.a.d.a(context).b(context);
            parcel.recycle();
            parcel2.recycle();
            return readTypedObject;
        } catch (Throwable th2) {
            th = th2;
            parcel = obtain2;
            parcel2 = obtain;
        }
    }

    private static Parcelable.Creator<?> a() throws Throwable {
        return (Parcelable.Creator) ReflectHelper.getStaticField(ReflectHelper.importClass(s.a("025deBdcdjdkdidcdlPg:dk2cdi=didkRe;dlfedk_cdiRdidk$e")), s.a("007;edgjgifdfcghgj"));
    }

    public static Object a(Context context, String str, long j4) throws Throwable {
        int i4;
        String str2;
        int i5;
        Object a5;
        Parcel parcel;
        Parcel parcel2;
        Object a6;
        char c5;
        if (!com.mob.commons.d.e() || !com.mob.tools.utils.f.a().a(str) || (i4 = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        com.mob.tools.a.d a7 = com.mob.tools.a.d.a(context);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Object[] objArr = new Object[1];
        if (i4 >= 31) {
            Object a8 = a7.a(s.a("032dePdcdjdkdidcdlDgHdkScdiJdidk9e2dlfedkQcdi6didk^e8gjBfGdedg3fEfi0i") + "$" + s.a("007Tfjdgdi3gDdc8fWdj"), new Class[]{Long.TYPE}, new Object[]{0L});
            if (a8 != null) {
                i5 = 0;
                str2 = "$";
                a5 = a7.a(s.a("032de=dcdjdkdidcdl;g0dkRcdiXdidk3e6dlfedk9cdi4didk9e(gj'fIdedg$f6fi@i") + "$" + s.a("007)fjdgdiKg6dcBf^dj"), a8, s.a("005Uffdgdi7g_dc"), (Class[]) null, (Object[]) null, (Object[]) null);
            } else {
                str2 = "$";
                i5 = 0;
                a5 = null;
            }
        } else {
            str2 = "$";
            i5 = 0;
            a5 = a7.a(s.a("032deVdcdjdkdidcdlKg=dkUcdiGdidkTeIdlfedk+cdi+didk[e:gjYfCdedg7f?fiFi"), (Object) null, s.a("028c;dj'fdif,gcdjdkdffl)fj+djPfcdif*dcgldjdkdddidc@fEdj"), new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE}, new Object[]{str, 0, 0, Boolean.TRUE}, (Object[]) null);
        }
        Object obj = a5;
        String a9 = s.a("025de:dcdjdkdidcdldkfidlelNf@djdddiMcf2hc?dedOejYf3dj");
        String a10 = s.a("010<ej8fiUelHf$djdddi0cf");
        Class[] clsArr = new Class[1];
        clsArr[i5] = String.class;
        Object[] objArr2 = new Object[1];
        objArr2[i5] = s.a("008gQdkQcdiUdidkUe");
        IBinder iBinder = (IBinder) a7.a(a9, (Object) null, a10, clsArr, objArr2, (Object[]) null);
        if (obj == null || iBinder == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(s.a("033deUdcdjdkdidcdlJg5dk>cdiXdidkYe$dleefedkScdiTdidkWe:hc$ded1ej8fFdj"));
            if (i4 >= 31) {
                obtain.writeString(str);
                obtain.writeTypedObject((Parcelable) obj, i5);
                Consumer consumer = new Consumer() { // from class: com.mob.tools.b.h.1
                    @Override // java.util.function.Consumer
                    public void accept(Object obj2) {
                        try {
                            objArr[0] = obj2;
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                };
                StringBuilder sb = new StringBuilder(s.a("032deSdcdjdkdidcdl]g-dk^cdiUdidkEeVdlfedkYcdi5didk[e1hcNdedEej5f-dj"));
                String str3 = str2;
                sb.append(str3);
                sb.append(s.a("027-idMfi0eddgdjdj^fei4fedk4cdiZdidk<eDfcdj9de>fiRjSdkdjKi"));
                String sb2 = sb.toString();
                Class[] clsArr2 = new Class[3];
                clsArr2[i5] = Executor.class;
                clsArr2[1] = Consumer.class;
                clsArr2[2] = CancellationSignal.class;
                Object[] objArr3 = new Object[3];
                objArr3[i5] = Executors.newSingleThreadExecutor();
                objArr3[1] = consumer;
                objArr3[2] = null;
                Object a11 = a7.a(sb2, clsArr2, objArr3);
                String a12 = s.a("012i@dkgj$fcfWdiddOf)djeedc");
                Class[] clsArr3 = new Class[1];
                clsArr3[i5] = Object.class;
                Object[] objArr4 = new Object[1];
                objArr4[i5] = consumer;
                try {
                    String str4 = (String) a7.a(AppOpsManager.class, (Object) null, a12, clsArr3, objArr4, (Object[]) null);
                    if (TextUtils.isEmpty(str4)) {
                        parcel = obtain2;
                    } else {
                        obtain.writeStrongInterface((IInterface) a11);
                        obtain.writeString(context.getPackageName());
                        obtain.writeString(context.getAttributionTag());
                        obtain.writeString(str4);
                        parcel = obtain2;
                        try {
                            iBinder.transact(((Integer) a7.a(s.a("033de<dcdjdkdidcdl>g@dk<cdiXdidkXeJdleefedkXcdiYdidk7eUhcBded(ejXfSdj") + str3 + s.a("004(elWi(dgff"), s.a("0305fcgjfdegelfdedfceeghegdhej3fiPeddgdjdj<fei,fedk'cdi_didkBe"), null, -1)).intValue(), obtain, parcel, 0);
                        } catch (Throwable th) {
                            th = th;
                            parcel2 = obtain;
                            parcel.recycle();
                            parcel2.recycle();
                            com.mob.tools.a.d.a(context).b(context);
                            throw th;
                        }
                    }
                    parcel2 = obtain;
                    c5 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    parcel = obtain2;
                }
            } else {
                parcel = obtain2;
                String str5 = str2;
                try {
                    obtain.writeInt(1);
                    try {
                        a7.a(obj.getClass(), obj, s.a("013UfgdjdiKif4fcdkglKd6djTcfg"), new Class[]{Parcel.class, Integer.TYPE}, new Object[]{obtain, 0}, (Object[]) null);
                        HashMap hashMap = new HashMap();
                        final int identityHashCode = System.identityHashCode(hashMap);
                        hashMap.put(s.a("0177dk)eQfedk7cdi0didk%eCed-hde;ej'fKdc"), new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.b.h.2
                            @Override // com.mob.tools.utils.ReflectHelper.a
                            public Object a(Object[] objArr5) {
                                if (objArr5 != null) {
                                    try {
                                        if (objArr5.length > 0) {
                                            NLog mobLog = MobLog.getInstance();
                                            mobLog.d("[212] oncge" + objArr5[0], new Object[0]);
                                            if ((objArr5[0] instanceof List) && ((List) objArr5[0]).size() > 0) {
                                                List list = (List) objArr5[0];
                                                objArr[0] = list.get(list.size() - 1);
                                            } else {
                                                objArr[0] = objArr5[0];
                                            }
                                        }
                                    } finally {
                                        try {
                                        } catch (Throwable th3) {
                                        }
                                    }
                                }
                                countDownLatch.countDown();
                                return null;
                            }
                        });
                        hashMap.put("equals", new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.b.h.3
                            @Override // com.mob.tools.utils.ReflectHelper.a
                            public Object a(Object[] objArr5) {
                                if (objArr5 != null) {
                                    if (objArr5[0] != null) {
                                        return Boolean.valueOf(objArr5[0].hashCode() == identityHashCode);
                                    }
                                }
                                return Boolean.FALSE;
                            }
                        });
                        hashMap.put(s.a("008hd*fiShDeddkdc?f"), new ReflectHelper.a<Object[], Object>() { // from class: com.mob.tools.b.h.4
                            @Override // com.mob.tools.utils.ReflectHelper.a
                            public Object a(Object[] objArr5) {
                                return Integer.valueOf(identityHashCode);
                            }
                        });
                        Object createProxy = ReflectHelper.createProxy((Map<String, ReflectHelper.a<Object[], Object>>) hashMap, Class.forName(s.a("033deEdcdjdkdidcdlXgEdkWcdiLdidk9e(dlfedk?cdiKdidkKeTfedifi+ifef)dj")));
                        if (Build.VERSION.SDK_INT >= 30) {
                            a6 = a7.a(s.a("032deGdcdjdkdidcdl]g5dkUcdiCdidk'eIdlfedkScdiLdidk$e;hcAded<ej(f%dj") + str5 + s.a("025Nfedk3cdiHdidk6e8fedifiZifef^djfcdj%deZfiEjJdkdjOi"), new Class[]{Class.forName(s.a("032de8dcdjdkdidcdl?gIdk_cdi%didkCe dlfedkJcdi6didk2e=hcVded2ej6f)dj")), Class.forName(s.a("033de?dcdjdkdidcdl@g!dk4cdi>didk@e<dlfedk=cdi+didkTe?fedifi@ifefIdj"))}, new Object[]{DH.SyncMtd.getSystemServiceSafe(s.a("008g9dk3cdi1didkUe")), createProxy});
                            a7.a(a6.getClass(), a6, s.a("008Ydj'f<ejdifi>if!dj"), new Class[]{Executor.class}, new Object[]{Executors.newSingleThreadExecutor()}, (Object[]) null);
                        } else {
                            a6 = a7.a(s.a("032de8dcdjdkdidcdl4g6dk*cdi[didk7e1dlfedk(cdi(didk6eUhc]dedRej_f+dj") + str5 + s.a("017PfedifiOifef0djfcdj$deIfi)j>dkdjFi"), new Class[]{Class.forName(s.a("032de9dcdjdkdidcdl@gOdkUcdi0didk.eIdlfedk cdiLdidkVe=hc[dedKejEfHdj")), Class.forName(s.a("033de'dcdjdkdidcdlIg'dkYcdi*didk1eAdlfedk2cdi,didkBeVfedifi_ifef]dj")), Looper.class}, new Object[]{DH.SyncMtd.getSystemServiceSafe(s.a("008g3dk]cdi)didkLe")), createProxy, l.a().c()});
                        }
                        parcel2 = obtain;
                    } catch (Throwable th3) {
                        th = th3;
                        parcel2 = obtain;
                        parcel.recycle();
                        parcel2.recycle();
                        com.mob.tools.a.d.a(context).b(context);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    parcel2 = obtain;
                    parcel.recycle();
                    parcel2.recycle();
                    com.mob.tools.a.d.a(context).b(context);
                    throw th;
                }
                try {
                    parcel2.writeStrongBinder((IBinder) a6);
                    parcel2.writeInt(0);
                    parcel2.writeString(context.getPackageName());
                    c5 = 0;
                    iBinder.transact(((Integer) a7.a(s.a("033deYdcdjdkdidcdl*g?dk1cdi3didk(eJdleefedk>cdiEdidkKe0hc!dedSej*fSdj") + str5 + s.a("0045el]i@dgff"), s.a("034Afcgjfdegelfdedfceeghegdhdj1fNdedgVf2fiPi6fedkLcdi<didkTeAek+jCdcBdifDfi"), null, -1)).intValue(), parcel2, parcel, 0);
                } catch (Throwable th5) {
                    th = th5;
                    parcel.recycle();
                    parcel2.recycle();
                    com.mob.tools.a.d.a(context).b(context);
                    throw th;
                }
            }
            parcel.readException();
            countDownLatch.await(j4, TimeUnit.MILLISECONDS);
            Object obj2 = objArr[c5];
            parcel.recycle();
            parcel2.recycle();
            com.mob.tools.a.d.a(context).b(context);
            return obj2;
        } catch (Throwable th6) {
            th = th6;
            parcel = obtain2;
        }
    }
}
