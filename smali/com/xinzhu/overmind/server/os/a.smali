.class public interface abstract Lcom/xinzhu/overmind/server/os/a;
.super Ljava/lang/Object;
.source "IMindDeviceInfoService.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/server/os/a$b;,
        Lcom/xinzhu/overmind/server/os/a$a;
    }
.end annotation


# virtual methods
.method public abstract getDeviceInfo(I)Lcom/xinzhu/overmind/server/os/MindDeviceInfo;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract setVirtualDeviceStatus(Z)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract updateMindDeviceInfo(ILcom/xinzhu/overmind/server/os/MindDeviceInfo;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
