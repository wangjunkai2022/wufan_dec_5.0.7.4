.class public Lcom/xinzhu/overmind/server/content/b;
.super Lcom/xinzhu/overmind/server/content/a$b;
.source "MindContentService.java"

# interfaces
.implements Lcom/xinzhu/overmind/server/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xinzhu/overmind/server/content/b$b;,
        Lcom/xinzhu/overmind/server/content/b$a;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String;

.field private static final sService:Lcom/xinzhu/overmind/server/content/b;


# instance fields
.field private final mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

.field private final mSyncManagerLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/xinzhu/overmind/server/content/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xinzhu/overmind/server/content/b;->TAG:Ljava/lang/String;

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/server/content/b;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/content/b;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/server/content/b;->sService:Lcom/xinzhu/overmind/server/content/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/server/content/a$b;-><init>()V

    .line 2
    new-instance v0, Lcom/xinzhu/overmind/server/content/b$b;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/xinzhu/overmind/server/content/b$b;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/content/b;->mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/content/b;->mSyncManagerLock:Ljava/lang/Object;

    return-void
.end method

.method public static get()Lcom/xinzhu/overmind/server/content/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/server/content/b;->sService:Lcom/xinzhu/overmind/server/content/b;

    return-object v0
.end method


# virtual methods
.method public notifyChange(Landroid/net/Uri;Landroid/database/IContentObserver;ZZII)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v9, p5

    .line 1
    sget-object v2, Lcom/xinzhu/overmind/server/content/b;->TAG:Ljava/lang/String;

    const/4 v10, 0x2

    invoke-static {v2, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Notifying update of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for user "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " from observer "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, p2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", syncToNetwork "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v3, p4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    .line 3
    :goto_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v11

    .line 4
    :try_start_0
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v14, v1, Lcom/xinzhu/overmind/server/content/b;->mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

    monitor-enter v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    :try_start_1
    iget-object v2, v1, Lcom/xinzhu/overmind/server/content/b;->mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

    const/4 v4, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p5

    move-object v8, v13

    invoke-virtual/range {v2 .. v8}, Lcom/xinzhu/overmind/server/content/b$b;->e(Landroid/net/Uri;ILandroid/database/IContentObserver;ZILjava/util/ArrayList;)V

    .line 7
    monitor-exit v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 8
    :try_start_2
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_4

    .line 9
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/xinzhu/overmind/server/content/b$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 10
    :try_start_3
    iget-object v6, v5, Lcom/xinzhu/overmind/server/content/b$a;->b:Landroid/database/IContentObserver;

    iget-boolean v7, v5, Lcom/xinzhu/overmind/server/content/b$a;->c:Z

    invoke-interface {v6, v7, v0, v9}, Landroid/database/IContentObserver;->onChange(ZLandroid/net/Uri;I)V

    .line 11
    sget-object v6, Lcom/xinzhu/overmind/server/content/b;->TAG:Ljava/lang/String;

    invoke-static {v6, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 12
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Notified "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v5, Lcom/xinzhu/overmind/server/content/b$a;->b:Landroid/database/IContentObserver;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " of update at "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    .line 13
    :catch_0
    :try_start_4
    iget-object v6, v1, Lcom/xinzhu/overmind/server/content/b;->mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

    monitor-enter v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 14
    :try_start_5
    iget-object v7, v5, Lcom/xinzhu/overmind/server/content/b$a;->b:Landroid/database/IContentObserver;

    invoke-interface {v7}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v7

    .line 15
    iget-object v5, v5, Lcom/xinzhu/overmind/server/content/b$a;->a:Lcom/xinzhu/overmind/server/content/b$b;

    .line 16
    invoke-static {v5}, Lcom/xinzhu/overmind/server/content/b$b;->a(Lcom/xinzhu/overmind/server/content/b$b;)Ljava/util/ArrayList;

    move-result-object v5

    .line 17
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v8, :cond_2

    .line 18
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/xinzhu/overmind/server/content/b$b$a;

    .line 19
    iget-object v15, v15, Lcom/xinzhu/overmind/server/content/b$b$a;->b:Landroid/database/IContentObserver;

    invoke-interface {v15}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v15

    if-ne v15, v7, :cond_1

    .line 20
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v14, v14, -0x1

    add-int/lit8 v8, v8, -0x1

    :cond_1
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 21
    :cond_2
    monitor-exit v6

    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :goto_4
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_0
    move-exception v0

    goto :goto_4

    .line 22
    :cond_4
    invoke-static {v11, v12}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-void

    :catchall_1
    move-exception v0

    .line 23
    :try_start_7
    monitor-exit v14
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    .line 24
    invoke-static {v11, v12}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 25
    goto :goto_6

    :goto_5
    throw v0

    :goto_6
    goto :goto_5
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/xinzhu/overmind/server/content/a$b;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 2
    instance-of p2, p1, Ljava/lang/SecurityException;

    if-nez p2, :cond_0

    .line 3
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->printStackTrace()V

    .line 4
    :cond_0
    throw p1
.end method

.method public registerContentObserver(Landroid/net/Uri;ZLandroid/database/IContentObserver;II)V
    .locals 9

    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/content/b;->mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v5, p0, Lcom/xinzhu/overmind/server/content/b;->mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

    .line 3
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v7

    move-object v1, v5

    move-object v2, p1

    move-object v3, p3

    move v4, p2

    move v6, p5

    move v8, p4

    .line 4
    invoke-virtual/range {v1 .. v8}, Lcom/xinzhu/overmind/server/content/b$b;->c(Landroid/net/Uri;Landroid/database/IContentObserver;ZLjava/lang/Object;III)V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must pass a valid uri and observer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public systemReady()V
    .locals 0

    return-void
.end method

.method public unregisterContentObserver(Landroid/database/IContentObserver;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/content/b;->mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/xinzhu/overmind/server/content/b;->mRootNode:Lcom/xinzhu/overmind/server/content/b$b;

    invoke-virtual {v1, p1}, Lcom/xinzhu/overmind/server/content/b$b;->h(Landroid/database/IContentObserver;)Z

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You must pass a valid observer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
