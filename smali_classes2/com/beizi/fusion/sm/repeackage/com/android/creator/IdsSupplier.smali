.class public interface abstract Lcom/beizi/fusion/sm/repeackage/com/android/creator/IdsSupplier;
.super Ljava/lang/Object;
.source "IdsSupplier.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/sm/repeackage/com/android/creator/IdsSupplier$Stub;,
        Lcom/beizi/fusion/sm/repeackage/com/android/creator/IdsSupplier$Default;
    }
.end annotation


# virtual methods
.method public abstract getOAID()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract isSupported()Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
