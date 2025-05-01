package com.xinzhu.overmind.client.hook.proxies.am;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.frameworks.accounts.ChooseTypeAndAccountActivity;
import com.xinzhu.overmind.client.stub.StubTrampolineActivity;
import com.xinzhu.overmind.client.stub.StubTrampolineReceiver;
import com.xinzhu.overmind.client.stub.StubTrampolineService;
import com.xinzhu.overmind.client.stub.record.StubTrampolineRecord;
import com.xinzhu.overmind.entity.PendingIntentRecord;
import com.xinzhu.overmind.server.am.MindTaskInfo;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ListIterator;
/* compiled from: CommonStub.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f67647a = "CommonStub";

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class a extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "activityDestroyed";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Overmind.getMindActivityManager().m((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class b extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "activityResumed";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Overmind.getMindActivityManager().n((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class c extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "finishActivity";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Overmind.getMindActivityManager().o((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.am.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0727d extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "finishActivityAffinity";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Overmind.getMindActivityManager().p((IBinder) objArr[0]);
            return Boolean.FALSE;
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class e extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAppTasks";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.d(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class f extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getCallingActivity";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Overmind.getMindActivityManager().e((IBinder) objArr[0]);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class g extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getCallingPackage";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Overmind.getMindActivityManager().f((IBinder) objArr[0]);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class h extends com.xinzhu.overmind.client.hook.e {
        private int f() {
            return com.xinzhu.overmind.utils.e.g() ? 6 : 5;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getIntentSender";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Intent intent;
            String str = (String) objArr[1];
            com.xinzhu.overmind.utils.helpers.c.d(objArr);
            int a5 = com.xinzhu.overmind.utils.helpers.c.a(objArr, Intent[].class);
            if (a5 < 0) {
                a5 = f();
            }
            Intent[] intentArr = (Intent[]) objArr[a5];
            int i4 = a5 + 2;
            int intValue = ((Integer) objArr[i4]).intValue();
            objArr[i4] = Integer.valueOf((Build.VERSION.SDK_INT >= 23 ? (-67108865) & intValue : intValue) & (-9) & (-129));
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            int intValue2 = ((Integer) objArr[0]).intValue();
            if (intentArr.length <= 0) {
                intent = null;
            } else if (intentArr.length == 1) {
                intent = intentArr[0];
            } else {
                throw new RuntimeException("getIntentSender failed, more than 1 intent in array.");
            }
            Intent intent2 = new Intent(intent);
            intent2.replaceExtras(new Intent());
            intent2.setComponent(null);
            if (intValue2 == 1) {
                intent2.setComponent(new ComponentName(Overmind.get().getMainPackageName(), StubTrampolineReceiver.class.getName()));
            } else if (intValue2 != 2 && intValue2 != 3) {
                if (intValue2 == 5) {
                    objArr[0] = 4;
                }
                intent2.setComponent(new ComponentName(Overmind.get().getMainPackageName(), StubTrampolineService.class.getName()));
            } else {
                intent2.setComponent(new ComponentName(Overmind.get().getMainPackageName(), StubTrampolineActivity.class.getName()));
            }
            StubTrampolineRecord.saveStub(intent2, intent, com.xinzhu.overmind.client.e.getUserId());
            Intent[] intentArr2 = new Intent[1];
            intentArr2[0] = intent2;
            objArr[a5] = intentArr2;
            IInterface iInterface = (IInterface) method.invoke(obj, objArr);
            if (iInterface != null) {
                com.xinzhu.overmind.client.frameworks.a.d().u(new PendingIntentRecord(str, com.xinzhu.overmind.client.e.getVUid(), com.xinzhu.overmind.client.e.getUserId(), iInterface.asBinder(), intent, intValue, intValue2));
            }
            return iInterface;
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class i extends h {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.h, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getIntentSenderWithFeature";
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class j extends h {
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.h, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getIntentSenderWithSourceToken";
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class k extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getRecentTasks";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            List<?> list;
            try {
                com.xinzhu.overmind.utils.helpers.c.f(objArr);
                Object invoke = method.invoke(obj, objArr);
                boolean b5 = com.xinzhu.overmind.utils.helpers.h.b(invoke);
                if (b5) {
                    list = new com.xinzhu.haunted.android.content.pm.k(invoke).f();
                } else {
                    list = (List) invoke;
                }
                if (list != null && list.size() != 0) {
                    ListIterator<?> listIterator = list.listIterator();
                    while (listIterator.hasNext()) {
                        ActivityManager.RecentTaskInfo recentTaskInfo = (ActivityManager.RecentTaskInfo) listIterator.next();
                        MindTaskInfo j4 = com.xinzhu.overmind.client.frameworks.a.d().j(recentTaskInfo.id);
                        if (j4 != null) {
                            ComponentName componentName = j4.f67915d;
                            recentTaskInfo.origActivity = componentName;
                            recentTaskInfo.baseIntent = j4.f67914c;
                            if (Build.VERSION.SDK_INT >= 23) {
                                recentTaskInfo.topActivity = j4.f67916e;
                                recentTaskInfo.baseActivity = componentName;
                            }
                        } else {
                            listIterator.remove();
                        }
                    }
                }
                return b5 ? com.xinzhu.overmind.utils.helpers.h.a(list) : list;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class l extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getTasks";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            List list = (List) method.invoke(obj, objArr);
            if (list != null && list.size() != 0) {
                ListIterator listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) listIterator.next();
                    MindTaskInfo j4 = com.xinzhu.overmind.client.frameworks.a.d().j(runningTaskInfo.id);
                    if (j4 != null) {
                        try {
                            if (Build.VERSION.SDK_INT >= 29) {
                                runningTaskInfo.origActivity = j4.f67915d;
                                runningTaskInfo.baseIntent = j4.f67914c;
                            }
                            runningTaskInfo.topActivity = j4.f67916e;
                            runningTaskInfo.baseActivity = j4.f67915d;
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        listIterator.remove();
                    }
                }
            }
            return list;
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class m extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "overridePendingTransition";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            if (com.xinzhu.overmind.client.frameworks.g.d().k(com.xinzhu.overmind.client.e.getVPackageName()).f68131d.c(1)) {
                return method.invoke(obj, objArr);
            }
            return 0;
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class n extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startActivities";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Intent[] intentArr = (Intent[]) objArr[2];
            String[] strArr = (String[]) objArr[3];
            IBinder iBinder = (IBinder) objArr[4];
            Bundle bundle = (Bundle) objArr[5];
            if (!com.xinzhu.overmind.utils.helpers.e.d(intentArr)) {
                return method.invoke(obj, objArr);
            }
            for (Intent intent : intentArr) {
                intent.setExtrasClassLoader(obj.getClass().getClassLoader());
            }
            return Integer.valueOf(Overmind.getMindActivityManager().x(com.xinzhu.overmind.client.e.getUserId(), com.xinzhu.overmind.client.e.getVPackageName(), intentArr, strArr, iBinder, bundle));
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class o extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startActivity";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2 = objArr[com.xinzhu.overmind.utils.helpers.c.a(objArr, Intent.class)];
            com.xinzhu.overmind.utils.helpers.c.d(objArr);
            if (obj2 instanceof Intent) {
                Intent intent = (Intent) obj2;
                if (intent.getParcelableExtra("_VM_|_target_") != null) {
                    return method.invoke(obj, objArr);
                }
                if (com.xinzhu.overmind.utils.helpers.e.b(intent)) {
                    intent.setData(com.xinzhu.overmind.client.hook.provider.a.a(com.xinzhu.overmind.client.e.getApplication(), intent.getData()));
                    return method.invoke(obj, objArr);
                }
                String dataString = intent.getDataString();
                if (dataString != null) {
                    if (dataString.equals("package:" + com.xinzhu.overmind.client.e.getVPackageName())) {
                        intent.setData(Uri.parse("package:" + Overmind.getHostPkg()));
                    }
                }
                if (ChooseTypeAndAccountActivity.h(intent)) {
                    Intent intent2 = new Intent();
                    intent2.setComponent(new ComponentName(Overmind.getMainPkg(), ChooseTypeAndAccountActivity.class.getName()));
                    intent2.putExtras(intent);
                    objArr[f()] = intent2;
                    return method.invoke(obj, objArr);
                }
                if (intent.getPackage() != null) {
                    String str = intent.getPackage();
                    if (str.equals(Overmind.getMainPkg()) || str.equals(Overmind.getPluginPkg())) {
                        return method.invoke(obj, objArr);
                    }
                }
                ResolveInfo z4 = Overmind.getMindPackageManager().z(intent, 128, com.xinzhu.overmind.utils.helpers.l.o(objArr), com.xinzhu.overmind.client.e.getUserId());
                if (z4 == null) {
                    if (intent.getPackage() != null && Overmind.get().isInstalled(intent.getPackage())) {
                        return 0;
                    }
                    return method.invoke(obj, objArr);
                }
                intent.setExtrasClassLoader(obj.getClass().getClassLoader());
                Intent intent3 = new Intent(intent);
                if (intent3.getComponent() == null) {
                    ActivityInfo activityInfo = z4.activityInfo;
                    intent3.setClassName(activityInfo.packageName, activityInfo.name);
                }
                Overmind.getMindActivityManager().y(com.xinzhu.overmind.client.e.getUserId(), com.xinzhu.overmind.client.e.getVPackageName(), intent3, com.xinzhu.overmind.utils.helpers.l.o(objArr), com.xinzhu.overmind.utils.helpers.l.q(objArr), com.xinzhu.overmind.utils.helpers.l.s(objArr), com.xinzhu.overmind.utils.helpers.l.m(objArr), com.xinzhu.overmind.utils.helpers.l.d(objArr), com.xinzhu.overmind.utils.helpers.l.i(objArr));
                return 0;
            }
            return method.invoke(obj, objArr);
        }

        protected int f() {
            return com.xinzhu.overmind.utils.e.g() ? 3 : 2;
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class p extends o {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.o, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startActivityAndWait";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.o, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            return super.d(obj, method, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class q extends o {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.o, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startActivityAsCaller";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.o, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            return super.d(obj, method, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class r extends o {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.o, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startActivityAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.o, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            return super.d(obj, method, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class s extends com.xinzhu.overmind.client.hook.e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startActivityIntentSender";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int i4 = com.xinzhu.overmind.utils.e.w() ? 3 : 2;
            int i5 = i4 + 2;
            int i6 = i4 + 3;
            int i7 = i4 + 4;
            Intent intent = (Intent) objArr[i4];
            IBinder iBinder = (IBinder) objArr[i5];
            String str = (String) objArr[i6];
            int intValue = ((Integer) objArr[i7]).intValue();
            int intValue2 = ((Integer) objArr[i4 + 5]).intValue();
            int intValue3 = ((Integer) objArr[i4 + 6]).intValue();
            Bundle bundle = (Bundle) objArr[i4 + 7];
            if (intent == null) {
                intent = new Intent();
                objArr[i4] = intent;
            }
            new com.xinzhu.haunted.android.content.m(intent).d("_VM_|_trampoline_result_to_", iBinder);
            intent.putExtra("_VM_|_trampoline_result_who_", str);
            intent.putExtra("_VM_|_trampoline_request_code_", intValue);
            intent.putExtra("_VM_|_trampoline_options_", bundle);
            intent.putExtra("_VM_|_trampoline_calling_package_", com.xinzhu.overmind.client.e.getVPackageName());
            intent.putExtra("_VM_|_trampoline_flagsMask_", intValue2);
            intent.putExtra("_VM_|_trampoline_flagsValues_", intValue3);
            objArr[i5] = null;
            objArr[i6] = null;
            objArr[i7] = -1;
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: CommonStub.java */
    /* loaded from: classes.dex */
    static class t extends o {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.o, com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startActivityWithConfig";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.proxies.am.d.o, com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            com.xinzhu.overmind.utils.helpers.c.f(objArr);
            return super.d(obj, method, objArr);
        }
    }
}
