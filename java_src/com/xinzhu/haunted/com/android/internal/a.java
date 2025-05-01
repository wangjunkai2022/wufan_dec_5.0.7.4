package com.xinzhu.haunted.com.android.internal;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtR.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67148a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67149b = com.xinzhu.haunted.d.b("com.android.internal.R");

    /* compiled from: HtR.java */
    /* renamed from: com.xinzhu.haunted.com.android.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0709a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67150a = com.xinzhu.haunted.d.b("com.android.internal.R$id");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f67151b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67152c = false;

        /* renamed from: d  reason: collision with root package name */
        private static AtomicReference<Field> f67153d = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        private static boolean f67154e = false;

        /* renamed from: f  reason: collision with root package name */
        private static AtomicReference<Field> f67155f = new AtomicReference<>();

        /* renamed from: g  reason: collision with root package name */
        private static boolean f67156g = false;

        /* renamed from: h  reason: collision with root package name */
        private static AtomicReference<Field> f67157h = new AtomicReference<>();

        /* renamed from: i  reason: collision with root package name */
        private static boolean f67158i = false;

        /* renamed from: j  reason: collision with root package name */
        private static AtomicReference<Field> f67159j = new AtomicReference<>();

        /* renamed from: k  reason: collision with root package name */
        private static boolean f67160k = false;

        /* renamed from: l  reason: collision with root package name */
        private static AtomicReference<Field> f67161l = new AtomicReference<>();

        /* renamed from: m  reason: collision with root package name */
        private static boolean f67162m = false;

        /* renamed from: n  reason: collision with root package name */
        private static AtomicReference<Field> f67163n = new AtomicReference<>();

        /* renamed from: o  reason: collision with root package name */
        private static boolean f67164o = false;

        /* renamed from: p  reason: collision with root package name */
        private static AtomicReference<Field> f67165p = new AtomicReference<>();

        /* renamed from: q  reason: collision with root package name */
        private static boolean f67166q = false;

        /* renamed from: r  reason: collision with root package name */
        private static AtomicReference<Field> f67167r = new AtomicReference<>();

        /* renamed from: s  reason: collision with root package name */
        private static boolean f67168s = false;

        /* renamed from: t  reason: collision with root package name */
        private static AtomicReference<Field> f67169t = new AtomicReference<>();

        /* renamed from: u  reason: collision with root package name */
        private static boolean f67170u = false;

        public static boolean A(int i4) {
            if (g()) {
                try {
                    f67159j.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean B(int i4) {
            if (h()) {
                try {
                    f67169t.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean C(int i4) {
            if (i()) {
                try {
                    f67163n.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean D(int i4) {
            if (j()) {
                try {
                    f67161l.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean a() {
            if (f67165p.get() == null) {
                if (f67166q) {
                    return false;
                }
                f67165p.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "account_name"));
                f67166q = true;
                return f67165p.get() != null;
            }
            return true;
        }

        public static boolean b() {
            if (f67153d.get() == null) {
                if (f67154e) {
                    return false;
                }
                f67153d.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "account_row_icon"));
                f67154e = true;
                return f67153d.get() != null;
            }
            return true;
        }

        public static boolean c() {
            if (f67151b.get() == null) {
                if (f67152c) {
                    return false;
                }
                f67151b.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "account_row_text"));
                f67152c = true;
                return f67151b.get() != null;
            }
            return true;
        }

        public static boolean d() {
            if (f67167r.get() == null) {
                if (f67168s) {
                    return false;
                }
                f67167r.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "account_type"));
                f67168s = true;
                return f67167r.get() != null;
            }
            return true;
        }

        public static boolean e() {
            if (f67157h.get() == null) {
                if (f67158i) {
                    return false;
                }
                f67157h.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "allow_button"));
                f67158i = true;
                return f67157h.get() != null;
            }
            return true;
        }

        public static boolean f() {
            if (f67155f.get() == null) {
                if (f67156g) {
                    return false;
                }
                f67155f.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "authtoken_type"));
                f67156g = true;
                return f67155f.get() != null;
            }
            return true;
        }

        public static boolean g() {
            if (f67159j.get() == null) {
                if (f67160k) {
                    return false;
                }
                f67159j.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "deny_button"));
                f67160k = true;
                return f67159j.get() != null;
            }
            return true;
        }

        public static boolean h() {
            if (f67169t.get() == null) {
                if (f67170u) {
                    return false;
                }
                f67169t.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, com.xinzhu.overmind.client.hook.proxies.context.providers.b.f67677k));
                f67170u = true;
                return f67169t.get() != null;
            }
            return true;
        }

        public static boolean i() {
            if (f67163n.get() == null) {
                if (f67164o) {
                    return false;
                }
                f67163n.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "package_label"));
                f67164o = true;
                return f67163n.get() != null;
            }
            return true;
        }

        public static boolean j() {
            if (f67161l.get() == null) {
                if (f67162m) {
                    return false;
                }
                f67161l.compareAndSet(null, com.xinzhu.haunted.d.f(f67150a, "packages_list"));
                f67162m = true;
                return f67161l.get() != null;
            }
            return true;
        }

        public static int k() {
            if (a()) {
                try {
                    return ((Integer) f67165p.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int l() {
            if (b()) {
                try {
                    return ((Integer) f67153d.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int m() {
            if (c()) {
                try {
                    return ((Integer) f67151b.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int n() {
            if (d()) {
                try {
                    return ((Integer) f67167r.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int o() {
            if (e()) {
                try {
                    return ((Integer) f67157h.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int p() {
            if (f()) {
                try {
                    return ((Integer) f67155f.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int q() {
            if (g()) {
                try {
                    return ((Integer) f67159j.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int r() {
            if (h()) {
                try {
                    return ((Integer) f67169t.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int s() {
            if (i()) {
                try {
                    return ((Integer) f67163n.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int t() {
            if (j()) {
                try {
                    return ((Integer) f67161l.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static boolean u(int i4) {
            if (a()) {
                try {
                    f67165p.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean v(int i4) {
            if (b()) {
                try {
                    f67153d.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean w(int i4) {
            if (c()) {
                try {
                    f67151b.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean x(int i4) {
            if (d()) {
                try {
                    f67167r.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean y(int i4) {
            if (e()) {
                try {
                    f67157h.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean z(int i4) {
            if (f()) {
                try {
                    f67155f.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: HtR.java */
    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67171a = com.xinzhu.haunted.d.b("com.android.internal.R$layout");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f67172b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67173c = false;

        /* renamed from: d  reason: collision with root package name */
        private static AtomicReference<Field> f67174d = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        private static boolean f67175e = false;

        /* renamed from: f  reason: collision with root package name */
        private static AtomicReference<Field> f67176f = new AtomicReference<>();

        /* renamed from: g  reason: collision with root package name */
        private static boolean f67177g = false;

        /* renamed from: h  reason: collision with root package name */
        private static AtomicReference<Field> f67178h = new AtomicReference<>();

        /* renamed from: i  reason: collision with root package name */
        private static boolean f67179i = false;

        /* renamed from: j  reason: collision with root package name */
        private static AtomicReference<Field> f67180j = new AtomicReference<>();

        /* renamed from: k  reason: collision with root package name */
        private static boolean f67181k = false;

        /* renamed from: l  reason: collision with root package name */
        private static AtomicReference<Field> f67182l = new AtomicReference<>();

        /* renamed from: m  reason: collision with root package name */
        private static boolean f67183m = false;

        /* renamed from: n  reason: collision with root package name */
        private static AtomicReference<Field> f67184n = new AtomicReference<>();

        /* renamed from: o  reason: collision with root package name */
        private static boolean f67185o = false;

        public static boolean a() {
            if (f67182l.get() == null) {
                if (f67183m) {
                    return false;
                }
                f67182l.compareAndSet(null, com.xinzhu.haunted.d.f(f67171a, "app_not_authorized"));
                f67183m = true;
                return f67182l.get() != null;
            }
            return true;
        }

        public static boolean b() {
            if (f67172b.get() == null) {
                if (f67173c) {
                    return false;
                }
                f67172b.compareAndSet(null, com.xinzhu.haunted.d.f(f67171a, "choose_account"));
                f67173c = true;
                return f67172b.get() != null;
            }
            return true;
        }

        public static boolean c() {
            if (f67174d.get() == null) {
                if (f67175e) {
                    return false;
                }
                f67174d.compareAndSet(null, com.xinzhu.haunted.d.f(f67171a, "choose_account_row"));
                f67175e = true;
                return f67174d.get() != null;
            }
            return true;
        }

        public static boolean d() {
            if (f67176f.get() == null) {
                if (f67177g) {
                    return false;
                }
                f67176f.compareAndSet(null, com.xinzhu.haunted.d.f(f67171a, "choose_account_type"));
                f67177g = true;
                return f67176f.get() != null;
            }
            return true;
        }

        public static boolean e() {
            if (f67184n.get() == null) {
                if (f67185o) {
                    return false;
                }
                f67184n.compareAndSet(null, com.xinzhu.haunted.d.f(f67171a, "choose_type_and_account"));
                f67185o = true;
                return f67184n.get() != null;
            }
            return true;
        }

        public static boolean f() {
            if (f67178h.get() == null) {
                if (f67179i) {
                    return false;
                }
                f67178h.compareAndSet(null, com.xinzhu.haunted.d.f(f67171a, "grant_credentials_permission"));
                f67179i = true;
                return f67178h.get() != null;
            }
            return true;
        }

        public static boolean g() {
            if (f67180j.get() == null) {
                if (f67181k) {
                    return false;
                }
                f67180j.compareAndSet(null, com.xinzhu.haunted.d.f(f67171a, "permissions_package_list_item"));
                f67181k = true;
                return f67180j.get() != null;
            }
            return true;
        }

        public static int h() {
            if (a()) {
                try {
                    return ((Integer) f67182l.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int i() {
            if (b()) {
                try {
                    return ((Integer) f67172b.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int j() {
            if (c()) {
                try {
                    return ((Integer) f67174d.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int k() {
            if (d()) {
                try {
                    return ((Integer) f67176f.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int l() {
            if (e()) {
                try {
                    return ((Integer) f67184n.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int m() {
            if (f()) {
                try {
                    return ((Integer) f67178h.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int n() {
            if (g()) {
                try {
                    return ((Integer) f67180j.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static boolean o(int i4) {
            if (a()) {
                try {
                    f67182l.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean p(int i4) {
            if (b()) {
                try {
                    f67172b.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean q(int i4) {
            if (c()) {
                try {
                    f67174d.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean r(int i4) {
            if (d()) {
                try {
                    f67176f.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean s(int i4) {
            if (e()) {
                try {
                    f67184n.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean t(int i4) {
            if (f()) {
                try {
                    f67178h.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean u(int i4) {
            if (g()) {
                try {
                    f67180j.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: HtR.java */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67186a = com.xinzhu.haunted.d.b("com.android.internal.R$string");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f67187b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67188c = false;

        /* renamed from: d  reason: collision with root package name */
        private static AtomicReference<Field> f67189d = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        private static boolean f67190e = false;

        /* renamed from: f  reason: collision with root package name */
        private static AtomicReference<Field> f67191f = new AtomicReference<>();

        /* renamed from: g  reason: collision with root package name */
        private static boolean f67192g = false;

        public static boolean a() {
            if (f67191f.get() == null) {
                if (f67192g) {
                    return false;
                }
                f67191f.compareAndSet(null, com.xinzhu.haunted.d.f(f67186a, "add_account_button_label"));
                f67192g = true;
                return f67191f.get() != null;
            }
            return true;
        }

        public static boolean b() {
            if (f67189d.get() == null) {
                if (f67190e) {
                    return false;
                }
                f67189d.compareAndSet(null, com.xinzhu.haunted.d.f(f67186a, "config_chooseTypeAndAccountActivity"));
                f67190e = true;
                return f67189d.get() != null;
            }
            return true;
        }

        public static boolean c() {
            if (f67187b.get() == null) {
                if (f67188c) {
                    return false;
                }
                f67187b.compareAndSet(null, com.xinzhu.haunted.d.f(f67186a, "grant_permissions_header_text"));
                f67188c = true;
                return f67187b.get() != null;
            }
            return true;
        }

        public static int d() {
            if (a()) {
                try {
                    return ((Integer) f67191f.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int e() {
            if (b()) {
                try {
                    return ((Integer) f67189d.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static String f() {
            if (c()) {
                try {
                    return (String) f67187b.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static boolean g(int i4) {
            if (a()) {
                try {
                    f67191f.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean h(int i4) {
            if (b()) {
                try {
                    f67189d.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean i(String str) {
            if (c()) {
                try {
                    f67187b.get().set(null, str);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: HtR.java */
    /* loaded from: classes6.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67193a = com.xinzhu.haunted.d.b("com.android.internal.R$style");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f67194b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67195c = false;

        public static boolean a() {
            if (f67194b.get() == null) {
                if (f67195c) {
                    return false;
                }
                f67194b.compareAndSet(null, com.xinzhu.haunted.d.f(f67193a, "Theme_DeviceDefault_Light_Dialog_NoActionBar"));
                f67195c = true;
                return f67194b.get() != null;
            }
            return true;
        }

        public static int b() {
            if (a()) {
                try {
                    return ((Integer) f67194b.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static boolean c(int i4) {
            if (a()) {
                try {
                    f67194b.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: HtR.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67196a = com.xinzhu.haunted.d.b("com.android.internal.R$styleable");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f67198b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67199c = false;

        /* renamed from: d  reason: collision with root package name */
        private static AtomicReference<Field> f67200d = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        private static boolean f67201e = false;

        /* renamed from: f  reason: collision with root package name */
        private static AtomicReference<Field> f67202f = new AtomicReference<>();

        /* renamed from: g  reason: collision with root package name */
        private static boolean f67203g = false;

        /* renamed from: h  reason: collision with root package name */
        private static AtomicReference<Field> f67204h = new AtomicReference<>();

        /* renamed from: i  reason: collision with root package name */
        private static boolean f67205i = false;

        /* renamed from: j  reason: collision with root package name */
        private static AtomicReference<Field> f67206j = new AtomicReference<>();

        /* renamed from: k  reason: collision with root package name */
        private static boolean f67207k = false;

        /* renamed from: l  reason: collision with root package name */
        private static AtomicReference<Field> f67208l = new AtomicReference<>();

        /* renamed from: m  reason: collision with root package name */
        private static boolean f67209m = false;

        /* renamed from: n  reason: collision with root package name */
        private static AtomicReference<Field> f67210n = new AtomicReference<>();

        /* renamed from: o  reason: collision with root package name */
        private static boolean f67211o = false;

        /* renamed from: p  reason: collision with root package name */
        private static AtomicReference<Field> f67212p = new AtomicReference<>();

        /* renamed from: q  reason: collision with root package name */
        private static boolean f67213q = false;

        /* renamed from: r  reason: collision with root package name */
        private static AtomicReference<Field> f67214r = new AtomicReference<>();

        /* renamed from: s  reason: collision with root package name */
        private static boolean f67215s = false;

        /* renamed from: t  reason: collision with root package name */
        private static AtomicReference<Field> f67216t = new AtomicReference<>();

        /* renamed from: u  reason: collision with root package name */
        private static boolean f67217u = false;

        /* renamed from: v  reason: collision with root package name */
        private static AtomicReference<Field> f67218v = new AtomicReference<>();

        /* renamed from: w  reason: collision with root package name */
        private static boolean f67219w = false;

        /* renamed from: x  reason: collision with root package name */
        private static AtomicReference<Field> f67220x = new AtomicReference<>();

        /* renamed from: y  reason: collision with root package name */
        private static boolean f67221y = false;

        /* renamed from: z  reason: collision with root package name */
        private static AtomicReference<Field> f67222z = new AtomicReference<>();
        private static boolean A = false;
        private static AtomicReference<Field> B = new AtomicReference<>();
        private static boolean C = false;
        private static AtomicReference<Field> D = new AtomicReference<>();
        private static boolean E = false;
        private static AtomicReference<Field> F = new AtomicReference<>();
        private static boolean G = false;
        private static AtomicReference<Field> H = new AtomicReference<>();
        private static boolean I = false;
        private static AtomicReference<Field> J = new AtomicReference<>();
        private static boolean K = false;
        private static AtomicReference<Field> L = new AtomicReference<>();
        private static boolean M = false;
        private static AtomicReference<Field> N = new AtomicReference<>();
        private static boolean O = false;
        private static AtomicReference<Field> P = new AtomicReference<>();
        private static boolean Q = false;
        private static AtomicReference<Field> R = new AtomicReference<>();
        private static boolean S = false;
        private static AtomicReference<Field> T = new AtomicReference<>();
        private static boolean U = false;
        private static AtomicReference<Field> V = new AtomicReference<>();
        private static boolean W = false;
        private static AtomicReference<Field> X = new AtomicReference<>();
        private static boolean Y = false;
        private static AtomicReference<Field> Z = new AtomicReference<>();

        /* renamed from: a0  reason: collision with root package name */
        private static boolean f67197a0 = false;

        public static int[] A() {
            if (a()) {
                try {
                    return (int[]) f67198b.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static int B() {
            if (b()) {
                try {
                    return ((Integer) f67200d.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int C() {
            if (c()) {
                try {
                    return ((Integer) f67202f.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int D() {
            if (d()) {
                try {
                    return ((Integer) f67204h.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int E() {
            if (e()) {
                try {
                    return ((Integer) f67206j.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int F() {
            if (f()) {
                try {
                    return ((Integer) f67208l.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int G() {
            if (g()) {
                try {
                    return ((Integer) f67210n.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int[] H() {
            if (h()) {
                try {
                    return (int[]) f67212p.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static int I() {
            if (i()) {
                try {
                    return ((Integer) f67214r.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int J() {
            if (j()) {
                try {
                    return ((Integer) f67216t.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int K() {
            if (k()) {
                try {
                    return ((Integer) f67218v.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int L() {
            if (l()) {
                try {
                    return ((Integer) f67220x.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int M() {
            if (m()) {
                try {
                    return ((Integer) f67222z.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int N() {
            if (n()) {
                try {
                    return ((Integer) B.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int O() {
            if (o()) {
                try {
                    return ((Integer) D.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int[] P() {
            if (p()) {
                try {
                    return (int[]) H.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static int Q() {
            if (q()) {
                try {
                    return ((Integer) L.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int[] R() {
            if (r()) {
                try {
                    return (int[]) F.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static int S() {
            if (s()) {
                try {
                    return ((Integer) J.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int T() {
            if (t()) {
                try {
                    return ((Integer) P.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int U() {
            if (u()) {
                try {
                    return ((Integer) N.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int V() {
            if (v()) {
                try {
                    return ((Integer) R.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int W() {
            if (w()) {
                try {
                    return ((Integer) T.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int X() {
            if (x()) {
                try {
                    return ((Integer) V.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int Y() {
            if (y()) {
                try {
                    return ((Integer) X.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int Z() {
            if (z()) {
                try {
                    return ((Integer) Z.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static boolean a() {
            if (f67198b.get() == null) {
                if (f67199c) {
                    return false;
                }
                f67198b.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "AccountAuthenticator"));
                f67199c = true;
                return f67198b.get() != null;
            }
            return true;
        }

        public static boolean a0(int[] iArr) {
            if (a()) {
                try {
                    f67198b.get().set(null, iArr);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean b() {
            if (f67200d.get() == null) {
                if (f67201e) {
                    return false;
                }
                f67200d.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "AccountAuthenticator_accountPreferences"));
                f67201e = true;
                return f67200d.get() != null;
            }
            return true;
        }

        public static boolean b0(int i4) {
            if (b()) {
                try {
                    f67200d.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean c() {
            if (f67202f.get() == null) {
                if (f67203g) {
                    return false;
                }
                f67202f.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "AccountAuthenticator_accountType"));
                f67203g = true;
                return f67202f.get() != null;
            }
            return true;
        }

        public static boolean c0(int i4) {
            if (c()) {
                try {
                    f67202f.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean d() {
            if (f67204h.get() == null) {
                if (f67205i) {
                    return false;
                }
                f67204h.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "AccountAuthenticator_customTokens"));
                f67205i = true;
                return f67204h.get() != null;
            }
            return true;
        }

        public static boolean d0(int i4) {
            if (d()) {
                try {
                    f67204h.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean e() {
            if (f67206j.get() == null) {
                if (f67207k) {
                    return false;
                }
                f67206j.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "AccountAuthenticator_icon"));
                f67207k = true;
                return f67206j.get() != null;
            }
            return true;
        }

        public static boolean e0(int i4) {
            if (e()) {
                try {
                    f67206j.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean f() {
            if (f67208l.get() == null) {
                if (f67209m) {
                    return false;
                }
                f67208l.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "AccountAuthenticator_label"));
                f67209m = true;
                return f67208l.get() != null;
            }
            return true;
        }

        public static boolean f0(int i4) {
            if (f()) {
                try {
                    f67208l.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean g() {
            if (f67210n.get() == null) {
                if (f67211o) {
                    return false;
                }
                f67210n.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "AccountAuthenticator_smallIcon"));
                f67211o = true;
                return f67210n.get() != null;
            }
            return true;
        }

        public static boolean g0(int i4) {
            if (g()) {
                try {
                    f67210n.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean h() {
            if (f67212p.get() == null) {
                if (f67213q) {
                    return false;
                }
                f67212p.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "SyncAdapter"));
                f67213q = true;
                return f67212p.get() != null;
            }
            return true;
        }

        public static boolean h0(int[] iArr) {
            if (h()) {
                try {
                    f67212p.get().set(null, iArr);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean i() {
            if (f67214r.get() == null) {
                if (f67215s) {
                    return false;
                }
                f67214r.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "SyncAdapter_accountType"));
                f67215s = true;
                return f67214r.get() != null;
            }
            return true;
        }

        public static boolean i0(int i4) {
            if (i()) {
                try {
                    f67214r.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean j() {
            if (f67216t.get() == null) {
                if (f67217u) {
                    return false;
                }
                f67216t.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "SyncAdapter_allowParallelSyncs"));
                f67217u = true;
                return f67216t.get() != null;
            }
            return true;
        }

        public static boolean j0(int i4) {
            if (j()) {
                try {
                    f67216t.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean k() {
            if (f67218v.get() == null) {
                if (f67219w) {
                    return false;
                }
                f67218v.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "SyncAdapter_contentAuthority"));
                f67219w = true;
                return f67218v.get() != null;
            }
            return true;
        }

        public static boolean k0(int i4) {
            if (k()) {
                try {
                    f67218v.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean l() {
            if (f67220x.get() == null) {
                if (f67221y) {
                    return false;
                }
                f67220x.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "SyncAdapter_isAlwaysSyncable"));
                f67221y = true;
                return f67220x.get() != null;
            }
            return true;
        }

        public static boolean l0(int i4) {
            if (l()) {
                try {
                    f67220x.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean m() {
            if (f67222z.get() == null) {
                if (A) {
                    return false;
                }
                f67222z.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "SyncAdapter_settingsActivity"));
                A = true;
                return f67222z.get() != null;
            }
            return true;
        }

        public static boolean m0(int i4) {
            if (m()) {
                try {
                    f67222z.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean n() {
            if (B.get() == null) {
                if (C) {
                    return false;
                }
                B.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "SyncAdapter_supportsUploading"));
                C = true;
                return B.get() != null;
            }
            return true;
        }

        public static boolean n0(int i4) {
            if (n()) {
                try {
                    B.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean o() {
            if (D.get() == null) {
                if (E) {
                    return false;
                }
                D.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "SyncAdapter_userVisible"));
                E = true;
                return D.get() != null;
            }
            return true;
        }

        public static boolean o0(int i4) {
            if (o()) {
                try {
                    D.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean p() {
            if (H.get() == null) {
                if (I) {
                    return false;
                }
                H.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "View"));
                I = true;
                return H.get() != null;
            }
            return true;
        }

        public static boolean p0(int[] iArr) {
            if (p()) {
                try {
                    H.get().set(null, iArr);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean q() {
            if (L.get() == null) {
                if (M) {
                    return false;
                }
                L.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "View_background"));
                M = true;
                return L.get() != null;
            }
            return true;
        }

        public static boolean q0(int i4) {
            if (q()) {
                try {
                    L.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean r() {
            if (F.get() == null) {
                if (G) {
                    return false;
                }
                F.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window"));
                G = true;
                return F.get() != null;
            }
            return true;
        }

        public static boolean r0(int[] iArr) {
            if (r()) {
                try {
                    F.get().set(null, iArr);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean s() {
            if (J.get() == null) {
                if (K) {
                    return false;
                }
                J.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window_background"));
                K = true;
                return J.get() != null;
            }
            return true;
        }

        public static boolean s0(int i4) {
            if (s()) {
                try {
                    J.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean t() {
            if (P.get() == null) {
                if (Q) {
                    return false;
                }
                P.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window_windowBackground"));
                Q = true;
                return P.get() != null;
            }
            return true;
        }

        public static boolean t0(int i4) {
            if (t()) {
                try {
                    P.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean u() {
            if (N.get() == null) {
                if (O) {
                    return false;
                }
                N.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window_windowDisablePreview"));
                O = true;
                return N.get() != null;
            }
            return true;
        }

        public static boolean u0(int i4) {
            if (u()) {
                try {
                    N.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean v() {
            if (R.get() == null) {
                if (S) {
                    return false;
                }
                R.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window_windowFullscreen"));
                S = true;
                return R.get() != null;
            }
            return true;
        }

        public static boolean v0(int i4) {
            if (v()) {
                try {
                    R.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean w() {
            if (T.get() == null) {
                if (U) {
                    return false;
                }
                T.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window_windowIsFloating"));
                U = true;
                return T.get() != null;
            }
            return true;
        }

        public static boolean w0(int i4) {
            if (w()) {
                try {
                    T.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean x() {
            if (V.get() == null) {
                if (W) {
                    return false;
                }
                V.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window_windowIsTranslucent"));
                W = true;
                return V.get() != null;
            }
            return true;
        }

        public static boolean x0(int i4) {
            if (x()) {
                try {
                    V.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean y() {
            if (X.get() == null) {
                if (Y) {
                    return false;
                }
                X.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window_windowShowWallpaper"));
                Y = true;
                return X.get() != null;
            }
            return true;
        }

        public static boolean y0(int i4) {
            if (y()) {
                try {
                    X.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean z() {
            if (Z.get() == null) {
                if (f67197a0) {
                    return false;
                }
                Z.compareAndSet(null, com.xinzhu.haunted.d.f(f67196a, "Window_windowSwipeToDismiss"));
                f67197a0 = true;
                return Z.get() != null;
            }
            return true;
        }

        public static boolean z0(int i4) {
            if (z()) {
                try {
                    Z.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }
}
