.class public interface abstract Lcom/xinzhu/overmind/server/content/a;
.super Ljava/lang/Object;
.source "IMindContentService.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/server/content/a$b;,
        Lcom/xinzhu/overmind/server/content/a$a;
    }
.end annotation


# virtual methods
.method public abstract notifyChange(Landroid/net/Uri;Landroid/database/IContentObserver;ZZII)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract registerContentObserver(Landroid/net/Uri;ZLandroid/database/IContentObserver;II)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract unregisterContentObserver(Landroid/database/IContentObserver;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
