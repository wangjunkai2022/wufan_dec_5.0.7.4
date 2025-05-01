package de.robv.android.xposed;

import de.robv.android.xposed.callbacks.XC_LoadPackage;
/* loaded from: classes.dex */
public interface IXposedHookLoadPackage extends IXposedMod {

    /* loaded from: classes.dex */
    public static final class Wrapper extends XC_LoadPackage {
        private final IXposedHookLoadPackage instance;

        public Wrapper(IXposedHookLoadPackage iXposedHookLoadPackage) {
            this.instance = iXposedHookLoadPackage;
        }

        @Override // de.robv.android.xposed.IXposedHookLoadPackage
        public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
            this.instance.handleLoadPackage(loadPackageParam);
        }
    }

    void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable;
}
