package de.robv.android.xposed;

import de.robv.android.xposed.callbacks.XC_InitPackageResources;
/* loaded from: classes.dex */
public interface IXposedHookInitPackageResources extends IXposedMod {

    /* loaded from: classes6.dex */
    public static final class Wrapper extends XC_InitPackageResources {
        private final IXposedHookInitPackageResources instance;

        public Wrapper(IXposedHookInitPackageResources iXposedHookInitPackageResources) {
            this.instance = iXposedHookInitPackageResources;
        }

        @Override // de.robv.android.xposed.IXposedHookInitPackageResources
        public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam initPackageResourcesParam) throws Throwable {
            this.instance.handleInitPackageResources(initPackageResourcesParam);
        }
    }

    void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam initPackageResourcesParam) throws Throwable;
}
