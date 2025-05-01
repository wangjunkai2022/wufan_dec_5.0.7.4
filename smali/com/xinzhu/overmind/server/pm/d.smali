.class public interface abstract Lcom/xinzhu/overmind/server/pm/d;
.super Ljava/lang/Object;
.source "IMindPackageInstallerService.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/server/pm/d$b;,
        Lcom/xinzhu/overmind/server/pm/d$a;
    }
.end annotation


# virtual methods
.method public abstract installPackageAsExist(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;I)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract installPackageAsUser(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;I)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract uninstallPackageAsUser(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;ZI)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract updatePackage(Lcom/xinzhu/overmind/server/pm/MindPackageSettings;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
