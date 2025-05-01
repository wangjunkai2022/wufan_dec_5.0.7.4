package com.xinzhu.overmind.client.hook.proxies.permission;

import android.content.pm.PackageInfo;
import android.content.pm.PermissionInfo;
import android.os.IInterface;
import com.xinzhu.haunted.android.app.g;
import com.xinzhu.haunted.android.app.j;
import com.xinzhu.haunted.android.os.s;
import com.xinzhu.haunted.android.permission.a;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import com.xinzhu.overmind.client.hook.common.d;
import com.xinzhu.overmind.client.hook.e;
import com.xinzhu.overmind.utils.helpers.c;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: PermissionManagerStub.java */
/* loaded from: classes.dex */
public class b extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67709b = b.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    static final String f67710c = "permissionmgr";

    /* compiled from: PermissionManagerStub.java */
    /* loaded from: classes.dex */
    static class a extends e {
        a() {
        }

        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "checkPermission";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            PermissionInfo[] permissionInfoArr;
            String[] strArr;
            String str = (String) objArr[0];
            PackageInfo l4 = Overmind.getMindPackageManager().l(com.xinzhu.overmind.client.e.getVPackageName(), 4096, com.xinzhu.overmind.client.e.getUserId());
            if (l4 != null && (permissionInfoArr = l4.permissions) != null) {
                for (PermissionInfo permissionInfo : permissionInfoArr) {
                    if (str.equals(permissionInfo.name) && (strArr = l4.requestedPermissions) != null && Arrays.asList(strArr).contains(str)) {
                        return 0;
                    }
                }
            }
            objArr[1] = Overmind.getHostPkg();
            objArr[2] = Integer.valueOf(Overmind.getHostUserId());
            return method.invoke(obj, objArr);
        }
    }

    /* compiled from: PermissionManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.permission.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0738b extends e {
        C0738b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPermissionInfo";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            String str = (String) objArr[0];
            PackageInfo l4 = Overmind.getMindPackageManager().l(com.xinzhu.overmind.client.e.getVPackageName(), 4096, com.xinzhu.overmind.client.e.getUserId());
            com.xinzhu.overmind.b.c(b.f67709b, "here getPermissionInfo " + str + " " + l4.permissions);
            PermissionInfo[] permissionInfoArr = l4.permissions;
            if (permissionInfoArr != null) {
                for (PermissionInfo permissionInfo : permissionInfoArr) {
                    if (str.equals(permissionInfo.name) && l4.requestedPermissions != null) {
                        return permissionInfo;
                    }
                }
            }
            objArr[1] = Overmind.getHostPkg();
            return method.invoke(obj, objArr);
        }
    }

    public b() {
        super(s.i(f67710c));
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return a.C0703a.a(s.i(f67710c));
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        replaceSystemService(f67710c);
        if (g.v()) {
            g.t0((IInterface) obj2);
        }
        try {
            j jVar = new j(Overmind.getPackageManager());
            if (jVar.b() != obj2) {
                jVar.c((IInterface) obj2);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.xinzhu.overmind.client.hook.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        c.c(objArr);
        return super.invoke(obj, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new d("getPermissionFlags", d.f67576e, d.f67578g));
        addMethodHook(new d("updatePermissionFlags", d.f67576e, d.f67578g));
        addMethodHook(new d("updatePermissionFlagsForAllApps", d.f67576e, d.f67578g));
        addMethodHook(new a());
        addMethodHook(new C0738b());
        addMethodHook(new d("getWhitelistedRestrictedPermissions", d.f67576e, d.f67578g));
        addMethodHook(new d("addWhitelistedRestrictedPermission", d.f67576e, d.f67578g));
        addMethodHook(new d("removeWhitelistedRestrictedPermission", d.f67576e, d.f67578g));
        addMethodHook(new d("grantRuntimePermission", d.f67576e, d.f67578g));
        addMethodHook(new d("revokeRuntimePermission", d.f67576e, 2));
        addMethodHook(new d("setDefaultBrowser", d.f67576e, d.f67578g));
        addMethodHook(new d("getDefaultBrowser", d.f67576e, d.f67578g));
        addMethodHook(new d("grantDefaultPermissionsToEnabledCarrierApps", d.f67576e, d.f67578g));
        addMethodHook(new d("grantDefaultPermissionsToEnabledImsServices", d.f67576e, d.f67578g));
        addMethodHook(new d("grantDefaultPermissionsToEnabledTelephonyDataServices", d.f67576e, d.f67578g));
        addMethodHook(new d("revokeDefaultPermissionsFromDisabledTelephonyDataServices", d.f67576e, d.f67578g));
        addMethodHook(new d("grantDefaultPermissionsToActiveLuiApp", d.f67576e, d.f67578g));
        addMethodHook(new d("revokeDefaultPermissionsFromLuiApps", d.f67576e, d.f67578g));
        addMethodHook(new d("shouldShowRequestPermissionRationale", d.f67576e, d.f67578g));
        addMethodHook(new d("isPermissionRevokedByPolicy", d.f67576e, d.f67578g));
        addMethodHook(new d("startOneTimePermissionSession", d.f67576e, 1));
        addMethodHook(new d("stopOneTimePermissionSession", d.f67576e, d.f67578g));
        addMethodHook(new d("getAutoRevokeExemptionRequestedPackages", d.f67576e, d.f67578g));
        addMethodHook(new d("getAutoRevokeExemptionGrantedPackages", d.f67576e, d.f67578g));
        addMethodHook(new d("setAutoRevokeWhitelisted", d.f67576e, d.f67578g));
        addMethodHook(new d("isAutoRevokeWhitelisted", d.f67576e, d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("checkUidPermission", d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.e("checkDeviceIdentifierAccess", d.f67578g));
        addMethodHook(new com.xinzhu.overmind.client.hook.common.c("addOnPermissionsChangeListener", 0));
    }
}
