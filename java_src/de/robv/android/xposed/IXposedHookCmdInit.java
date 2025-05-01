package de.robv.android.xposed;
/* loaded from: classes6.dex */
public interface IXposedHookCmdInit extends IXposedMod {

    /* loaded from: classes6.dex */
    public static final class StartupParam {
        public String modulePath;
        public String startClassName;

        StartupParam() {
        }
    }

    void initCmdApp(StartupParam startupParam) throws Throwable;
}
