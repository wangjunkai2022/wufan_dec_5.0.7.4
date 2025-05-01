package android.os;

import android.os.IRemoteCallback;
import android.os.Parcelable;
import java.util.Objects;
/* loaded from: classes.dex */
public final class RemoteCallback implements Parcelable {
    public static final Parcelable.Creator<RemoteCallback> CREATOR = new Parcelable.Creator<RemoteCallback>() { // from class: android.os.RemoteCallback.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteCallback createFromParcel(Parcel parcel) {
            return new RemoteCallback(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteCallback[] newArray(int i4) {
            return new RemoteCallback[i4];
        }
    };
    private final IRemoteCallback mCallback;
    private final Handler mHandler;
    private final OnResultListener mListener;

    /* loaded from: classes.dex */
    public interface OnResultListener {
        void onResult(Bundle bundle);
    }

    public RemoteCallback(OnResultListener onResultListener) {
        this(onResultListener, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void sendResult(final Bundle bundle) {
        OnResultListener onResultListener = this.mListener;
        if (onResultListener != null) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: android.os.RemoteCallback.2
                    @Override // java.lang.Runnable
                    public void run() {
                        RemoteCallback.this.mListener.onResult(bundle);
                    }
                });
                return;
            } else {
                onResultListener.onResult(bundle);
                return;
            }
        }
        try {
            this.mCallback.sendResult(bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStrongBinder(this.mCallback.asBinder());
    }

    public RemoteCallback(OnResultListener onResultListener, Handler handler) {
        Objects.requireNonNull(onResultListener, "listener cannot be null");
        this.mListener = onResultListener;
        this.mHandler = handler;
        this.mCallback = new IRemoteCallback.Stub() { // from class: android.os.RemoteCallback.1
            @Override // android.os.IRemoteCallback
            public void sendResult(Bundle bundle) {
                RemoteCallback.this.sendResult(bundle);
            }
        };
    }

    RemoteCallback(Parcel parcel) {
        this.mListener = null;
        this.mHandler = null;
        this.mCallback = IRemoteCallback.Stub.asInterface(parcel.readStrongBinder());
    }
}
