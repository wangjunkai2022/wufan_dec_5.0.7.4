package androidx.databinding;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    private static final String TAG = "CallbackRegistry";
    private List<C> mCallbacks = new ArrayList();
    private long mFirst64Removed = 0;
    private int mNotificationLevel;
    private final NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    /* loaded from: classes2.dex */
    public static abstract class NotifierCallback<C, T, A> {
        public abstract void onNotifyCallback(C c5, T t4, int i4, A a5);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.mNotifier = notifierCallback;
    }

    private boolean isRemoved(int i4) {
        int i5;
        if (i4 < 64) {
            return ((1 << i4) & this.mFirst64Removed) != 0;
        }
        long[] jArr = this.mRemainderRemoved;
        if (jArr != null && (i5 = (i4 / 64) - 1) < jArr.length) {
            return ((1 << (i4 % 64)) & jArr[i5]) != 0;
        }
        return false;
    }

    private void notifyFirst64(T t4, int i4, A a5) {
        notifyCallbacks(t4, i4, a5, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
    }

    private void notifyRecurse(T t4, int i4, A a5) {
        int size = this.mCallbacks.size();
        long[] jArr = this.mRemainderRemoved;
        int length = jArr == null ? -1 : jArr.length - 1;
        notifyRemainder(t4, i4, a5, length);
        notifyCallbacks(t4, i4, a5, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T t4, int i4, A a5, int i5) {
        if (i5 < 0) {
            notifyFirst64(t4, i4, a5);
            return;
        }
        long j4 = this.mRemainderRemoved[i5];
        int i6 = (i5 + 1) * 64;
        int min = Math.min(this.mCallbacks.size(), i6 + 64);
        notifyRemainder(t4, i4, a5, i5 - 1);
        notifyCallbacks(t4, i4, a5, i6, min, j4);
    }

    private void removeRemovedCallbacks(int i4, long j4) {
        long j5 = Long.MIN_VALUE;
        for (int i5 = (i4 + 64) - 1; i5 >= i4; i5--) {
            if ((j4 & j5) != 0) {
                this.mCallbacks.remove(i5);
            }
            j5 >>>= 1;
        }
    }

    private void setRemovalBit(int i4) {
        if (i4 < 64) {
            this.mFirst64Removed = (1 << i4) | this.mFirst64Removed;
            return;
        }
        int i5 = (i4 / 64) - 1;
        long[] jArr = this.mRemainderRemoved;
        if (jArr == null) {
            this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
        } else if (jArr.length <= i5) {
            long[] jArr2 = new long[this.mCallbacks.size() / 64];
            long[] jArr3 = this.mRemainderRemoved;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.mRemainderRemoved = jArr2;
        }
        long j4 = 1 << (i4 % 64);
        long[] jArr4 = this.mRemainderRemoved;
        jArr4[i5] = j4 | jArr4[i5];
    }

    public synchronized void add(C c5) {
        if (c5 != null) {
            int lastIndexOf = this.mCallbacks.lastIndexOf(c5);
            if (lastIndexOf < 0 || isRemoved(lastIndexOf)) {
                this.mCallbacks.add(c5);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public synchronized void clear() {
        if (this.mNotificationLevel == 0) {
            this.mCallbacks.clear();
        } else if (!this.mCallbacks.isEmpty()) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                setRemovalBit(size);
            }
        }
    }

    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.mCallbacks.size());
        int size = this.mCallbacks.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!isRemoved(i4)) {
                arrayList.add(this.mCallbacks.get(i4));
            }
        }
        return arrayList;
    }

    public synchronized boolean isEmpty() {
        if (this.mCallbacks.isEmpty()) {
            return true;
        }
        if (this.mNotificationLevel == 0) {
            return false;
        }
        int size = this.mCallbacks.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!isRemoved(i4)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T t4, int i4, A a5) {
        this.mNotificationLevel++;
        notifyRecurse(t4, i4, a5);
        int i5 = this.mNotificationLevel - 1;
        this.mNotificationLevel = i5;
        if (i5 == 0) {
            long[] jArr = this.mRemainderRemoved;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j4 = this.mRemainderRemoved[length];
                    if (j4 != 0) {
                        removeRemovedCallbacks((length + 1) * 64, j4);
                        this.mRemainderRemoved[length] = 0;
                    }
                }
            }
            long j5 = this.mFirst64Removed;
            if (j5 != 0) {
                removeRemovedCallbacks(0, j5);
                this.mFirst64Removed = 0L;
            }
        }
    }

    public synchronized void remove(C c5) {
        if (this.mNotificationLevel == 0) {
            this.mCallbacks.remove(c5);
        } else {
            int lastIndexOf = this.mCallbacks.lastIndexOf(c5);
            if (lastIndexOf >= 0) {
                setRemovalBit(lastIndexOf);
            }
        }
    }

    /* renamed from: clone */
    public synchronized CallbackRegistry<C, T, A> m8clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e5;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
            try {
                callbackRegistry.mFirst64Removed = 0L;
                callbackRegistry.mRemainderRemoved = null;
                callbackRegistry.mNotificationLevel = 0;
                callbackRegistry.mCallbacks = new ArrayList();
                int size = this.mCallbacks.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (!isRemoved(i4)) {
                        callbackRegistry.mCallbacks.add(this.mCallbacks.get(i4));
                    }
                }
            } catch (CloneNotSupportedException e6) {
                e5 = e6;
                e5.printStackTrace();
                return callbackRegistry;
            }
        } catch (CloneNotSupportedException e7) {
            callbackRegistry = null;
            e5 = e7;
        }
        return callbackRegistry;
    }

    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.mCallbacks.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!isRemoved(i4)) {
                list.add(this.mCallbacks.get(i4));
            }
        }
    }

    private void notifyCallbacks(T t4, int i4, A a5, int i5, int i6, long j4) {
        long j5 = 1;
        while (i5 < i6) {
            if ((j4 & j5) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(i5), t4, i4, a5);
            }
            j5 <<= 1;
            i5++;
        }
    }
}
