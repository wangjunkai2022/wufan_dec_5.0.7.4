package com.mob.tools.utils;

import android.content.Context;
import android.text.TextUtils;
import com.mob.commons.l;
import com.mob.tools.MobLog;
import java.io.File;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57033a;

    public d(Context context) {
        this.f57033a = context;
    }

    private boolean b() {
        try {
            Object invokeStaticMethodNoThrow = ReflectHelper.invokeStaticMethodNoThrow(ReflectHelper.importClassNoThrow(l.a("027fg%feflfmfkfefnfmhkfngngehkJkh9fhinflfm_lhVfl4k0fk7h3hk"), null), l.a("003WglYhk"), "", "ro.build.tags");
            String valueOf = invokeStaticMethodNoThrow != null ? String.valueOf(invokeStaticMethodNoThrow) : null;
            if (!(valueOf != null && valueOf.contains(l.a("009khShk*k^jmgjGh>gehk")))) {
                if (!g()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean c() {
        return "0".equals(com.mob.tools.b.b.a(this.f57033a).a(l.a("020WflfmfnhhfmfmZk'fngh@ifUhk_j3fn@iDfmVe2gj!hVfe")));
    }

    private boolean d() {
        String a5 = com.mob.tools.b.b.a(this.f57033a).a(l.a("025$flfmfnhhfmfm)kSfnff$hWflfkghfkLh@fehhfmfm3k*hk<kfkh"));
        if (a5 != null) {
            return TextUtils.equals(a5.toLowerCase(), "orange") || TextUtils.equals(a5.toLowerCase(), "red");
        }
        return false;
    }

    private boolean e() {
        String a5 = com.mob.tools.b.b.a(this.f57033a).a(l.a("027GflfmfnhhfmfmOkAfnffhhfhHhkf5fnfe9h$fffk!ehXfjhkEkfkh"));
        return a5 != null && TextUtils.equals(l.a("008IfiAgi(fmGe_gj+hBfe"), a5.toLowerCase());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean f() {
        /*
            r11 = this;
            java.lang.String r0 = "007BfeHhQhk_kCflfmge"
            int r1 = android.os.Process.myPid()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 1
            r4 = 2
            r5 = 0
            r6 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            r7.append(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "007nTfhfmfiFgk,hk"
            java.lang.String r1 = com.mob.commons.l.a(r1)     // Catch: java.lang.Throwable -> L86
            r7.append(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r8 = "010efkXkhUnlEflfmJen"
            java.lang.String r8 = com.mob.commons.l.a(r8)     // Catch: java.lang.Throwable -> L86
            r7.append(r8)     // Catch: java.lang.Throwable -> L86
            r7.append(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = com.mob.commons.v.c(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = "0142gl^hk7gg-glIfi*k3gn*k8flQhfSfh"
            java.lang.String r7 = com.mob.commons.l.a(r7)     // Catch: java.lang.Throwable -> L83
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L83
            java.lang.Object r7 = com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r1, r7, r6, r8)     // Catch: java.lang.Throwable -> L83
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L6d
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6a
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = "utf-8"
            r9.<init>(r7, r10)     // Catch: java.lang.Throwable -> L6a
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L6a
        L59:
            java.lang.String r9 = r8.readLine()     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L6e
            r2.append(r9)     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = "\n"
            r2.append(r9)     // Catch: java.lang.Throwable -> L68
            goto L59
        L68:
            r9 = move-exception
            goto L8a
        L6a:
            r9 = move-exception
            r8 = r6
            goto L8a
        L6d:
            r8 = r6
        L6e:
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r5] = r8
            r4[r3] = r7
            com.mob.commons.v.a(r4)
            if (r1 == 0) goto La5
            java.lang.String r0 = com.mob.commons.l.a(r0)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r1, r0, r6, r3)
            goto La5
        L83:
            r9 = move-exception
            r7 = r6
            goto L89
        L86:
            r9 = move-exception
            r1 = r6
            r7 = r1
        L89:
            r8 = r7
        L8a:
            com.mob.tools.log.NLog r10 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> Lb4
            r10.d(r9)     // Catch: java.lang.Throwable -> Lb4
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r5] = r8
            r4[r3] = r7
            com.mob.commons.v.a(r4)
            if (r1 == 0) goto La5
            java.lang.String r0 = com.mob.commons.l.a(r0)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r1, r0, r6, r3)
        La5:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "006Ofh)fQglfkhkgj"
            java.lang.String r1 = com.mob.commons.l.a(r1)
            boolean r0 = r0.contains(r1)
            return r0
        Lb4:
            r2 = move-exception
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r5] = r8
            r4[r3] = r7
            com.mob.commons.v.a(r4)
            if (r1 == 0) goto Lc9
            java.lang.String r0 = com.mob.commons.l.a(r0)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.mob.tools.utils.ReflectHelper.invokeInstanceMethodNoThrow(r1, r0, r6, r3)
        Lc9:
            goto Lcb
        Lca:
            throw r2
        Lcb:
            goto Lca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.d.f():boolean");
    }

    private boolean g() {
        try {
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
        if (new File(l.a("025n_hkgehkJkhDfhVnfllnEgnfi:lh)flfihkBhFflfn@flUgj")).exists()) {
            return true;
        }
        String[] strArr = {l.a("012n>feTfkfniAfm$efin"), l.a("016nXfeDfkfni?fm=efinLhhfk9gn"), l.a("017n%feVfkfni^fm%efinVgkhhfk[gn"), l.a("006nLhkhhfk*gn"), l.a("008nJhkfi n>hhfkYgn"), l.a("012n3hkgehk=khVfh:nWhhfk!gn"), l.a("017nIhkgehk]khUfhPnBhhfk gnVfn3h]gk<kn"), l.a("021nBhkgehkTkhJfh.n_hhfkJgnSghJf?fk8iZhk'f*gh_hn"), l.a("016nUhkgehk*khLfh0n-hkfe_nPgkhhfk,gn"), l.a("025nVhkgehk?khHfh8n%fihkfl8n=hiSh8jm7ghh>fejmflfmfm8kn"), l.a("013n]hkgehk6kh%fhZn1gkhhfk<gn"), l.a("013n5hkgehk*kh+fhKn%hkhhfk3gn"), l.a("012nJff3hg(fefmfl%nBhhfk:gn"), l.a("006nefejh"), l.a("005nJfe:fkf"), l.a("004n*feRhCff")};
        for (int i4 = 0; i4 < 16; i4++) {
            if (new File(strArr[i4], l.a("002Uhkfi")).exists()) {
                return true;
            }
        }
        for (int i5 = 0; i5 < 16; i5++) {
            if (new File(strArr[i5], l.a("007'hhfihkgehhfmgk")).exists()) {
                return true;
            }
        }
        for (int i6 = 0; i6 < 16; i6++) {
            if (new File(strArr[i6], l.a("006BfhYf7glfkhkgj")).exists()) {
                return true;
            }
        }
        return false;
    }

    public String a() {
        StringBuilder sb = new StringBuilder("");
        try {
            if (d()) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            if (e()) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            if (c()) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            if (b()) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            if (f()) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
