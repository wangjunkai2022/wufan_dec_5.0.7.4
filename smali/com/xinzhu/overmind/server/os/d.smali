.class public interface abstract Lcom/xinzhu/overmind/server/os/d;
.super Ljava/lang/Object;
.source "IMindStorageManagerService.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/server/os/d$b;,
        Lcom/xinzhu/overmind/server/os/d$a;
    }
.end annotation


# virtual methods
.method public abstract getUriForFile(Ljava/lang/String;)Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract getVolumeList(ILjava/lang/String;II)[Landroid/os/storage/StorageVolume;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
