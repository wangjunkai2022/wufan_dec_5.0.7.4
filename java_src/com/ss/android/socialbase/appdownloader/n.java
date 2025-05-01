package com.ss.android.socialbase.appdownloader;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
/* loaded from: classes5.dex */
public final class n {

    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: i  reason: collision with root package name */
        private String f60817i;

        /* renamed from: m  reason: collision with root package name */
        private String f60818m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f60819n;

        /* renamed from: o  reason: collision with root package name */
        private String f60820o;

        /* renamed from: p  reason: collision with root package name */
        private Drawable f60821p;

        /* renamed from: u  reason: collision with root package name */
        private int f60822u;
        private String vv;

        public vv(String str, String str2, Drawable drawable, String str3, String str4, int i4, boolean z4) {
            m(str2);
            vv(drawable);
            vv(str);
            p(str3);
            i(str4);
            vv(i4);
            vv(z4);
        }

        public String i() {
            return this.f60818m;
        }

        public boolean m() {
            return this.f60819n;
        }

        public String n() {
            return this.f60820o;
        }

        public String o() {
            return this.f60817i;
        }

        public String p() {
            return this.vv;
        }

        public String toString() {
            return "{\n  pkg name: " + p() + "\n  app icon: " + vv() + "\n  app name: " + i() + "\n  app path: " + o() + "\n  app v name: " + n() + "\n  app v code: " + u() + "\n  is system: " + m() + "}";
        }

        public int u() {
            return this.f60822u;
        }

        public Drawable vv() {
            return this.f60821p;
        }

        public void i(String str) {
            this.f60820o = str;
        }

        public void m(String str) {
            this.f60818m = str;
        }

        public void p(String str) {
            this.f60817i = str;
        }

        public void vv(Drawable drawable) {
            this.f60821p = drawable;
        }

        public void vv(boolean z4) {
            this.f60819n = z4;
        }

        public void vv(String str) {
            this.vv = str;
        }

        public void vv(int i4) {
            this.f60822u = i4;
        }
    }

    public static vv m(String str) {
        try {
            PackageManager packageManager = com.ss.android.socialbase.downloader.downloader.p.ky().getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return vv(packageManager, packageManager.getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static boolean p(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isWhitespace(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static int vv(String str) {
        if (p(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = com.ss.android.socialbase.downloader.downloader.p.ky().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    private static vv vv(PackageManager packageManager, PackageInfo packageInfo) {
        Drawable drawable = null;
        if (packageInfo == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String str = packageInfo.packageName;
        String charSequence = (applicationInfo == null || applicationInfo.loadLabel(packageManager) == null) ? "" : applicationInfo.loadLabel(packageManager).toString();
        try {
            drawable = applicationInfo.loadIcon(packageManager);
        } catch (Exception unused) {
        }
        return new vv(str, charSequence, drawable, applicationInfo.sourceDir, packageInfo.versionName, packageInfo.versionCode, (applicationInfo.flags & 1) != 0);
    }
}
