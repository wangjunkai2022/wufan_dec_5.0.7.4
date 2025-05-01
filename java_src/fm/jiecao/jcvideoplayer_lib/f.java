package fm.jiecao.jcvideoplayer_lib;
/* compiled from: JCVideoPlayerManager.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static JCVideoPlayer f69109a;

    /* renamed from: b  reason: collision with root package name */
    public static JCVideoPlayer f69110b;

    public static void a() {
        JCVideoPlayer jCVideoPlayer = f69110b;
        if (jCVideoPlayer != null) {
            jCVideoPlayer.q();
            f69110b = null;
        }
        JCVideoPlayer jCVideoPlayer2 = f69109a;
        if (jCVideoPlayer2 != null) {
            jCVideoPlayer2.q();
            f69109a = null;
        }
    }

    public static JCVideoPlayer b() {
        if (d() != null) {
            return d();
        }
        return c();
    }

    public static JCVideoPlayer c() {
        return f69109a;
    }

    public static JCVideoPlayer d() {
        return f69110b;
    }

    public static void e(JCVideoPlayer jCVideoPlayer) {
        f69109a = jCVideoPlayer;
    }

    public static void f(JCVideoPlayer jCVideoPlayer) {
        f69110b = jCVideoPlayer;
    }
}
