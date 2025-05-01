.class public interface abstract Lcom/beizi/fusion/sm/repeackage/com/zui/deviceidservice/IDeviceidInterface;
.super Ljava/lang/Object;
.source "IDeviceidInterface.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/sm/repeackage/com/zui/deviceidservice/IDeviceidInterface$Stub;,
        Lcom/beizi/fusion/sm/repeackage/com/zui/deviceidservice/IDeviceidInterface$Default;
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

.method public abstract isSupport()Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
