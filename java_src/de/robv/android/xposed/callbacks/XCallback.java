package de.robv.android.xposed.callbacks;

import android.os.Bundle;
import de.robv.android.xposed.XposedBridge;
import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class XCallback implements Comparable<XCallback> {
    public static final int PRIORITY_DEFAULT = 50;
    public static final int PRIORITY_HIGHEST = 10000;
    public static final int PRIORITY_LOWEST = -10000;
    public final int priority;

    @Deprecated
    public XCallback() {
        this.priority = 50;
    }

    public static void callAll(Param param) {
        if (param.callbacks == null) {
            throw new IllegalStateException("This object was not created for use with callAll");
        }
        int i4 = 0;
        while (true) {
            Object[] objArr = param.callbacks;
            if (i4 >= objArr.length) {
                return;
            }
            try {
                ((XCallback) objArr[i4]).call(param);
            } catch (Throwable th) {
                XposedBridge.log(th);
            }
            i4++;
        }
    }

    protected void call(Param param) throws Throwable {
    }

    /* loaded from: classes.dex */
    public static abstract class Param {
        public final Object[] callbacks;
        private Bundle extra;

        /* loaded from: classes.dex */
        private static class SerializeWrapper implements Serializable {
            private static final long serialVersionUID = 1;
            private final Object object;

            public SerializeWrapper(Object obj) {
                this.object = obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Param() {
            this.callbacks = null;
        }

        public synchronized Bundle getExtra() {
            if (this.extra == null) {
                this.extra = new Bundle();
            }
            return this.extra;
        }

        public Object getObjectExtra(String str) {
            Serializable serializable = getExtra().getSerializable(str);
            if (serializable instanceof SerializeWrapper) {
                return ((SerializeWrapper) serializable).object;
            }
            return null;
        }

        public void setObjectExtra(String str, Object obj) {
            getExtra().putSerializable(str, new SerializeWrapper(obj));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Param(XposedBridge.CopyOnWriteSortedSet<? extends XCallback> copyOnWriteSortedSet) {
            this.callbacks = copyOnWriteSortedSet.getSnapshot();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(XCallback xCallback) {
        if (this == xCallback) {
            return 0;
        }
        int i4 = xCallback.priority;
        int i5 = this.priority;
        return i4 != i5 ? i4 - i5 : System.identityHashCode(this) < System.identityHashCode(xCallback) ? -1 : 1;
    }

    public XCallback(int i4) {
        this.priority = i4;
    }
}
