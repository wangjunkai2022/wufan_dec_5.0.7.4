package com.xinzhu.overmind.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xinzhu.overmind.entity.ClientConfig;
import com.xinzhu.overmind.entity.PendingIntentRecord;
import com.xinzhu.overmind.entity.UnbindRecord;
import com.xinzhu.overmind.server.ProcessRecord;
/* compiled from: IMindActivityManagerService.java */
/* loaded from: classes.dex */
public interface d extends IInterface {

    /* compiled from: IMindActivityManagerService.java */
    /* loaded from: classes6.dex */
    public static class a implements d {
        @Override // com.xinzhu.overmind.server.am.d
        public IBinder acquireContentProviderClient(ProviderInfo providerInfo) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public Intent bindService(Intent intent, IBinder iBinder, String str, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public PendingIntentRecord findPendingIntent(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public ProcessRecord findProcessRecordByPid(int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public ComponentName getCallingActivity(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public String getCallingPackage(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public String getLaunchedFromPackage(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public int getLaunchedFromUid(IBinder iBinder) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public MindTaskInfo getTaskInfo(int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public ClientConfig initProcess(String str, String str2, int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void onActivityCreated(int i4, IBinder iBinder, IBinder iBinder2) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void onActivityDestroyed(IBinder iBinder) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void onActivityResumed(IBinder iBinder) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void onFinishActivity(IBinder iBinder) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void onFinishActivityAffinity(IBinder iBinder) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void onServiceDestroy(Intent intent, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public UnbindRecord onServiceUnbind(Intent intent, int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void onStartCommand(Intent intent, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public IBinder peekService(Intent intent, String str, int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void registerPendingIntent(PendingIntentRecord pendingIntentRecord) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void restartProcess(String str, String str2, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public Intent sendBroadcast(Intent intent, String str, int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public int startActivities(int i4, String str, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void startActivity(Intent intent, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public int startActivityAms(int i4, String str, Intent intent, String str2, IBinder iBinder, String str3, int i5, int i6, Bundle bundle) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public int startActivityFromExistTask(Intent intent, int i4) throws RemoteException {
            return 0;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public Intent startService(Intent intent, String str, int i4, int i5) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void stopPackage(String str, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public Intent stopService(Intent intent, String str, int i4) throws RemoteException {
            return null;
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void unbindService(IBinder iBinder, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.server.am.d
        public void unregisterPendingIntent(IBinder iBinder) throws RemoteException {
        }
    }

    /* compiled from: IMindActivityManagerService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements d {
        private static final String DESCRIPTOR = "com.xinzhu.overmind.server.am.IMindActivityManagerService";
        static final int TRANSACTION_acquireContentProviderClient = 15;
        static final int TRANSACTION_bindService = 10;
        static final int TRANSACTION_findPendingIntent = 27;
        static final int TRANSACTION_findProcessRecordByPid = 28;
        static final int TRANSACTION_getCallingActivity = 23;
        static final int TRANSACTION_getCallingPackage = 24;
        static final int TRANSACTION_getLaunchedFromPackage = 30;
        static final int TRANSACTION_getLaunchedFromUid = 29;
        static final int TRANSACTION_getTaskInfo = 31;
        static final int TRANSACTION_initProcess = 1;
        static final int TRANSACTION_onActivityCreated = 18;
        static final int TRANSACTION_onActivityDestroyed = 20;
        static final int TRANSACTION_onActivityResumed = 19;
        static final int TRANSACTION_onFinishActivity = 21;
        static final int TRANSACTION_onFinishActivityAffinity = 22;
        static final int TRANSACTION_onServiceDestroy = 14;
        static final int TRANSACTION_onServiceUnbind = 13;
        static final int TRANSACTION_onStartCommand = 12;
        static final int TRANSACTION_peekService = 17;
        static final int TRANSACTION_registerPendingIntent = 25;
        static final int TRANSACTION_restartProcess = 2;
        static final int TRANSACTION_sendBroadcast = 16;
        static final int TRANSACTION_startActivities = 6;
        static final int TRANSACTION_startActivity = 3;
        static final int TRANSACTION_startActivityAms = 5;
        static final int TRANSACTION_startActivityFromExistTask = 4;
        static final int TRANSACTION_startService = 8;
        static final int TRANSACTION_stopPackage = 7;
        static final int TRANSACTION_stopService = 9;
        static final int TRANSACTION_unbindService = 11;
        static final int TRANSACTION_unregisterPendingIntent = 26;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMindActivityManagerService.java */
        /* loaded from: classes.dex */
        public static class a implements d {

            /* renamed from: c  reason: collision with root package name */
            public static d f67932c;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f67933b;

            a(IBinder iBinder) {
                this.f67933b = iBinder;
            }

            @Override // com.xinzhu.overmind.server.am.d
            public IBinder acquireContentProviderClient(ProviderInfo providerInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (providerInfo != null) {
                        obtain.writeInt(1);
                        providerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f67933b.transact(15, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().acquireContentProviderClient(providerInfo);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f67933b;
            }

            @Override // com.xinzhu.overmind.server.am.d
            public Intent bindService(Intent intent, IBinder iBinder, String str, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f67933b.transact(10, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().bindService(intent, iBinder, str, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public PendingIntentRecord findPendingIntent(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(27, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().findPendingIntent(iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PendingIntentRecord.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public ProcessRecord findProcessRecordByPid(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(28, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().findProcessRecordByPid(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? ProcessRecord.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public ComponentName getCallingActivity(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(23, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getCallingActivity(iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public String getCallingPackage(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(24, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getCallingPackage(iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public String getLaunchedFromPackage(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(30, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getLaunchedFromPackage(iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public int getLaunchedFromUid(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(29, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getLaunchedFromUid(iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public MindTaskInfo getTaskInfo(int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(31, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().getTaskInfo(i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MindTaskInfo.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public ClientConfig initProcess(String str, String str2, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(1, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().initProcess(str, str2, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? ClientConfig.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void onActivityCreated(int i4, IBinder iBinder, IBinder iBinder2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeStrongBinder(iBinder2);
                    if (!this.f67933b.transact(18, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().onActivityCreated(i4, iBinder, iBinder2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void onActivityDestroyed(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(20, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().onActivityDestroyed(iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void onActivityResumed(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(19, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().onActivityResumed(iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void onFinishActivity(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(21, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().onFinishActivity(iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void onFinishActivityAffinity(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(22, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().onFinishActivityAffinity(iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void onServiceDestroy(Intent intent, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(14, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().onServiceDestroy(intent, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public UnbindRecord onServiceUnbind(Intent intent, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(13, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().onServiceUnbind(intent, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? UnbindRecord.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void onStartCommand(Intent intent, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(12, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().onStartCommand(intent, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public IBinder peekService(Intent intent, String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(17, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().peekService(intent, str, i4);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void registerPendingIntent(PendingIntentRecord pendingIntentRecord) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (pendingIntentRecord != null) {
                        obtain.writeInt(1);
                        pendingIntentRecord.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f67933b.transact(25, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().registerPendingIntent(pendingIntentRecord);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void restartProcess(String str, String str2, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(2, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().restartProcess(str, str2, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public Intent sendBroadcast(Intent intent, String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(16, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().sendBroadcast(intent, str, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public int startActivities(int i4, String str, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    obtain.writeTypedArray(intentArr, 0);
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    try {
                        if (!this.f67933b.transact(6, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                            int startActivities = b.getDefaultImpl().startActivities(i4, str, intentArr, strArr, iBinder, bundle);
                            obtain2.recycle();
                            obtain.recycle();
                            return startActivities;
                        }
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void startActivity(Intent intent, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(3, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().startActivity(intent, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public int startActivityAms(int i4, String str, Intent intent, String str2, IBinder iBinder, String str3, int i5, int i6, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str3);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    try {
                        if (!this.f67933b.transact(5, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                            int startActivityAms = b.getDefaultImpl().startActivityAms(i4, str, intent, str2, iBinder, str3, i5, i6, bundle);
                            obtain2.recycle();
                            obtain.recycle();
                            return startActivityAms;
                        }
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public int startActivityFromExistTask(Intent intent, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(4, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().startActivityFromExistTask(intent, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public Intent startService(Intent intent, String str, int i4, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    if (!this.f67933b.transact(8, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().startService(intent, str, i4, i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void stopPackage(String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(7, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().stopPackage(str, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public Intent stopService(Intent intent, String str, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(9, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        return b.getDefaultImpl().stopService(intent, str, i4);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void unbindService(IBinder iBinder, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i4);
                    if (!this.f67933b.transact(11, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().unbindService(iBinder, i4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xinzhu.overmind.server.am.d
            public void unregisterPendingIntent(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f67933b.transact(26, obtain, obtain2, 0) && b.getDefaultImpl() != null) {
                        b.getDefaultImpl().unregisterPendingIntent(iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x() {
                return b.DESCRIPTOR;
            }
        }

        public b() {
            attachInterface(this, DESCRIPTOR);
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
                return (d) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static d getDefaultImpl() {
            return a.f67932c;
        }

        public static boolean setDefaultImpl(d dVar) {
            if (a.f67932c == null) {
                if (dVar != null) {
                    a.f67932c = dVar;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 != 1598968902) {
                switch (i4) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        ClientConfig initProcess = initProcess(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (initProcess != null) {
                            parcel2.writeInt(1);
                            initProcess.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        restartProcess(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        startActivity(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        int startActivityFromExistTask = startActivityFromExistTask(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(startActivityFromExistTask);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        int startActivityAms = startActivityAms(parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(startActivityAms);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        int startActivities = startActivities(parcel.readInt(), parcel.readString(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.createStringArray(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(startActivities);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        stopPackage(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        Intent startService = startService(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (startService != null) {
                            parcel2.writeInt(1);
                            startService.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        Intent stopService = stopService(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (stopService != null) {
                            parcel2.writeInt(1);
                            stopService.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        Intent bindService = bindService(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (bindService != null) {
                            parcel2.writeInt(1);
                            bindService.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        unbindService(parcel.readStrongBinder(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        onStartCommand(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        UnbindRecord onServiceUnbind = onServiceUnbind(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                        parcel2.writeNoException();
                        if (onServiceUnbind != null) {
                            parcel2.writeInt(1);
                            onServiceUnbind.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        onServiceDestroy(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        IBinder acquireContentProviderClient = acquireContentProviderClient(parcel.readInt() != 0 ? (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(acquireContentProviderClient);
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        Intent sendBroadcast = sendBroadcast(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (sendBroadcast != null) {
                            parcel2.writeInt(1);
                            sendBroadcast.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        IBinder peekService = peekService(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(peekService);
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        onActivityCreated(parcel.readInt(), parcel.readStrongBinder(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        onActivityResumed(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        onActivityDestroyed(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface(DESCRIPTOR);
                        onFinishActivity(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface(DESCRIPTOR);
                        onFinishActivityAffinity(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface(DESCRIPTOR);
                        ComponentName callingActivity = getCallingActivity(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        if (callingActivity != null) {
                            parcel2.writeInt(1);
                            callingActivity.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 24:
                        parcel.enforceInterface(DESCRIPTOR);
                        String callingPackage = getCallingPackage(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeString(callingPackage);
                        return true;
                    case 25:
                        parcel.enforceInterface(DESCRIPTOR);
                        registerPendingIntent(parcel.readInt() != 0 ? PendingIntentRecord.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface(DESCRIPTOR);
                        unregisterPendingIntent(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface(DESCRIPTOR);
                        PendingIntentRecord findPendingIntent = findPendingIntent(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        if (findPendingIntent != null) {
                            parcel2.writeInt(1);
                            findPendingIntent.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface(DESCRIPTOR);
                        ProcessRecord findProcessRecordByPid = findProcessRecordByPid(parcel.readInt());
                        parcel2.writeNoException();
                        if (findProcessRecordByPid != null) {
                            parcel2.writeInt(1);
                            findProcessRecordByPid.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface(DESCRIPTOR);
                        int launchedFromUid = getLaunchedFromUid(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeInt(launchedFromUid);
                        return true;
                    case 30:
                        parcel.enforceInterface(DESCRIPTOR);
                        String launchedFromPackage = getLaunchedFromPackage(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeString(launchedFromPackage);
                        return true;
                    case 31:
                        parcel.enforceInterface(DESCRIPTOR);
                        MindTaskInfo taskInfo = getTaskInfo(parcel.readInt());
                        parcel2.writeNoException();
                        if (taskInfo != null) {
                            parcel2.writeInt(1);
                            taskInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i4, parcel, parcel2, i5);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    IBinder acquireContentProviderClient(ProviderInfo providerInfo) throws RemoteException;

    Intent bindService(Intent intent, IBinder iBinder, String str, int i4, int i5) throws RemoteException;

    PendingIntentRecord findPendingIntent(IBinder iBinder) throws RemoteException;

    ProcessRecord findProcessRecordByPid(int i4) throws RemoteException;

    ComponentName getCallingActivity(IBinder iBinder) throws RemoteException;

    String getCallingPackage(IBinder iBinder) throws RemoteException;

    String getLaunchedFromPackage(IBinder iBinder) throws RemoteException;

    int getLaunchedFromUid(IBinder iBinder) throws RemoteException;

    MindTaskInfo getTaskInfo(int i4) throws RemoteException;

    ClientConfig initProcess(String str, String str2, int i4) throws RemoteException;

    void onActivityCreated(int i4, IBinder iBinder, IBinder iBinder2) throws RemoteException;

    void onActivityDestroyed(IBinder iBinder) throws RemoteException;

    void onActivityResumed(IBinder iBinder) throws RemoteException;

    void onFinishActivity(IBinder iBinder) throws RemoteException;

    void onFinishActivityAffinity(IBinder iBinder) throws RemoteException;

    void onServiceDestroy(Intent intent, int i4) throws RemoteException;

    UnbindRecord onServiceUnbind(Intent intent, int i4) throws RemoteException;

    void onStartCommand(Intent intent, int i4) throws RemoteException;

    IBinder peekService(Intent intent, String str, int i4) throws RemoteException;

    void registerPendingIntent(PendingIntentRecord pendingIntentRecord) throws RemoteException;

    void restartProcess(String str, String str2, int i4) throws RemoteException;

    Intent sendBroadcast(Intent intent, String str, int i4) throws RemoteException;

    int startActivities(int i4, String str, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) throws RemoteException;

    void startActivity(Intent intent, int i4) throws RemoteException;

    int startActivityAms(int i4, String str, Intent intent, String str2, IBinder iBinder, String str3, int i5, int i6, Bundle bundle) throws RemoteException;

    int startActivityFromExistTask(Intent intent, int i4) throws RemoteException;

    Intent startService(Intent intent, String str, int i4, int i5) throws RemoteException;

    void stopPackage(String str, int i4) throws RemoteException;

    Intent stopService(Intent intent, String str, int i4) throws RemoteException;

    void unbindService(IBinder iBinder, int i4) throws RemoteException;

    void unregisterPendingIntent(IBinder iBinder) throws RemoteException;
}
