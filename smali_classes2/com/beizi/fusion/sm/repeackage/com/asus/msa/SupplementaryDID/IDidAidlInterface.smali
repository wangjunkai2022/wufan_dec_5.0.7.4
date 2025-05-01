.class public interface abstract Lcom/beizi/fusion/sm/repeackage/com/asus/msa/SupplementaryDID/IDidAidlInterface;
.super Ljava/lang/Object;
.source "IDidAidlInterface.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/sm/repeackage/com/asus/msa/SupplementaryDID/IDidAidlInterface$Stub;,
        Lcom/beizi/fusion/sm/repeackage/com/asus/msa/SupplementaryDID/IDidAidlInterface$Default;
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
