.class public interface abstract Lcom/beizi/fusion/sm/repeackage/com/coolpad/deviceidsupport/IDeviceIdManager;
.super Ljava/lang/Object;
.source "IDeviceIdManager.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/sm/repeackage/com/coolpad/deviceidsupport/IDeviceIdManager$Stub;,
        Lcom/beizi/fusion/sm/repeackage/com/coolpad/deviceidsupport/IDeviceIdManager$Default;
    }
.end annotation


# virtual methods
.method public abstract getCoolOsVersion()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract getOAID(Ljava/lang/String;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract isCoolOs()Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
