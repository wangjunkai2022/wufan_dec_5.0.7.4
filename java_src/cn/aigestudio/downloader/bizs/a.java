package cn.aigestudio.downloader.bizs;
/* compiled from: DLCons.java */
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f357a = true;

    /* compiled from: DLCons.java */
    /* renamed from: cn.aigestudio.downloader.bizs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0014a {

        /* renamed from: a  reason: collision with root package name */
        static final int f358a = 10000;

        /* renamed from: b  reason: collision with root package name */
        static final int f359b = 30000;

        /* renamed from: c  reason: collision with root package name */
        static final int f360c = 5;

        /* renamed from: d  reason: collision with root package name */
        static final long f361d = 31457280;

        C0014a() {
        }
    }

    /* compiled from: DLCons.java */
    /* loaded from: classes2.dex */
    static final class b {
        static final int A = 408;
        static final int B = 409;
        static final int C = 410;
        static final int D = 411;
        static final int E = 412;
        static final int F = 413;
        static final int G = 414;
        static final int H = 415;
        static final int I = 416;
        static final int J = 417;
        static final int K = 422;
        static final int L = 423;
        static final int M = 424;
        static final int N = 500;
        static final int O = 501;
        static final int P = 502;
        static final int Q = 503;
        static final int R = 504;
        static final int S = 505;
        static final int T = 507;

        /* renamed from: a  reason: collision with root package name */
        static final int f362a = 100;

        /* renamed from: b  reason: collision with root package name */
        static final int f363b = 101;

        /* renamed from: c  reason: collision with root package name */
        static final int f364c = 102;

        /* renamed from: d  reason: collision with root package name */
        static final int f365d = 200;

        /* renamed from: e  reason: collision with root package name */
        static final int f366e = 201;

        /* renamed from: f  reason: collision with root package name */
        static final int f367f = 202;

        /* renamed from: g  reason: collision with root package name */
        static final int f368g = 203;

        /* renamed from: h  reason: collision with root package name */
        static final int f369h = 204;

        /* renamed from: i  reason: collision with root package name */
        static final int f370i = 205;

        /* renamed from: j  reason: collision with root package name */
        static final int f371j = 206;

        /* renamed from: k  reason: collision with root package name */
        static final int f372k = 207;

        /* renamed from: l  reason: collision with root package name */
        static final int f373l = 300;

        /* renamed from: m  reason: collision with root package name */
        static final int f374m = 301;

        /* renamed from: n  reason: collision with root package name */
        static final int f375n = 302;

        /* renamed from: o  reason: collision with root package name */
        static final int f376o = 303;

        /* renamed from: p  reason: collision with root package name */
        static final int f377p = 304;

        /* renamed from: q  reason: collision with root package name */
        static final int f378q = 305;

        /* renamed from: r  reason: collision with root package name */
        static final int f379r = 307;

        /* renamed from: s  reason: collision with root package name */
        static final int f380s = 400;

        /* renamed from: t  reason: collision with root package name */
        static final int f381t = 401;

        /* renamed from: u  reason: collision with root package name */
        static final int f382u = 402;

        /* renamed from: v  reason: collision with root package name */
        static final int f383v = 403;

        /* renamed from: w  reason: collision with root package name */
        static final int f384w = 404;

        /* renamed from: x  reason: collision with root package name */
        static final int f385x = 405;

        /* renamed from: y  reason: collision with root package name */
        static final int f386y = 406;

        /* renamed from: z  reason: collision with root package name */
        static final int f387z = 407;

        b() {
        }
    }

    /* compiled from: DLCons.java */
    /* loaded from: classes2.dex */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final String f388a = "task_info";

        /* renamed from: b  reason: collision with root package name */
        static final String f389b = "base_url";

        /* renamed from: c  reason: collision with root package name */
        static final String f390c = "real_url";

        /* renamed from: d  reason: collision with root package name */
        static final String f391d = "file_path";

        /* renamed from: e  reason: collision with root package name */
        static final String f392e = "currentBytes";

        /* renamed from: f  reason: collision with root package name */
        static final String f393f = "totalBytes";

        /* renamed from: g  reason: collision with root package name */
        static final String f394g = "file_name";

        /* renamed from: h  reason: collision with root package name */
        static final String f395h = "mime_type";

        /* renamed from: i  reason: collision with root package name */
        static final String f396i = "e_tag";

        /* renamed from: j  reason: collision with root package name */
        static final String f397j = "disposition";

        /* renamed from: k  reason: collision with root package name */
        static final String f398k = "location";

        /* renamed from: l  reason: collision with root package name */
        static final String f399l = "thread_info";

        /* renamed from: m  reason: collision with root package name */
        static final String f400m = "base_url";

        /* renamed from: n  reason: collision with root package name */
        static final String f401n = "start";

        /* renamed from: o  reason: collision with root package name */
        static final String f402o = "end";

        /* renamed from: p  reason: collision with root package name */
        static final String f403p = "id";

        /* renamed from: q  reason: collision with root package name */
        static final String f404q = "CREATE TABLE task_info(_id INTEGER PRIMARY KEY AUTOINCREMENT, base_url CHAR, real_url CHAR, file_path CHAR, file_name CHAR, mime_type CHAR, e_tag CHAR, disposition CHAR, location CHAR, currentBytes INTEGER, totalBytes INTEGER)";

        /* renamed from: r  reason: collision with root package name */
        static final String f405r = "CREATE TABLE thread_info(_id INTEGER PRIMARY KEY AUTOINCREMENT, base_url CHAR, start BIGINT, end BIGINT, id CHAR)";

        /* renamed from: s  reason: collision with root package name */
        static final String f406s = "DROP TABLE IF EXISTS task_info";

        /* renamed from: t  reason: collision with root package name */
        static final String f407t = "DROP TABLE IF EXISTS thread_info";

        c() {
        }
    }

    private a() {
    }
}
