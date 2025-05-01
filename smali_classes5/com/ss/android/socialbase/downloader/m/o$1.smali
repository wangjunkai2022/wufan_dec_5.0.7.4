.class Lcom/ss/android/socialbase/downloader/m/o$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/downloader/m/o;->vv(Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/m/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic i:Lcom/ss/android/socialbase/downloader/m/o;

.field final synthetic m:Landroid/util/SparseArray;

.field final synthetic p:Lcom/ss/android/socialbase/downloader/m/i;

.field final synthetic vv:Landroid/util/SparseArray;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/m/o;Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/ss/android/socialbase/downloader/m/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iput-object p2, p0, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iput-object p3, p0, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    iput-object p4, p0, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    move-object/from16 v1, p0

    .line 1
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;)V

    .line 2
    invoke-static {}, Lcom/ss/android/socialbase/downloader/m/o;->n()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/p;->pd()Lcom/ss/android/socialbase/downloader/downloader/b;

    move-result-object v0

    .line 4
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 5
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/16 v8, 0x2000

    const/4 v9, -0x3

    const/4 v10, 0x0

    const/4 v11, 0x1

    .line 7
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/downloader/m/o;->n()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v7, "SELECT * FROM downloader"

    invoke-virtual {v6, v7, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 8
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_d

    .line 9
    new-instance v6, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    invoke-direct {v6, v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;-><init>(Landroid/database/Cursor;)V

    .line 10
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getRealStatus()I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatusAtDbInit(I)V

    .line 11
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isCanResumeFromBreakPointStatus()Z

    move-result v7

    const/4 v12, -0x5

    if-eqz v7, :cond_1

    .line 12
    invoke-virtual {v6, v12}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 13
    invoke-static {}, Lcom/ss/android/socialbase/downloader/n/vv;->p()Lcom/ss/android/socialbase/downloader/n/vv;

    move-result-object v7

    const-string v13, "status_not_update_to_db"

    invoke-virtual {v7, v13, v11}, Lcom/ss/android/socialbase/downloader/n/vv;->m(Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 14
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v7

    invoke-virtual {v5, v7, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 15
    :cond_1
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_7

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    .line 16
    :cond_2
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v7

    const/16 v13, 0xb

    if-ne v7, v11, :cond_3

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getCurBytes()J

    move-result-wide v14

    const-wide/16 v16, 0x0

    cmp-long v7, v14, v16

    if-gtz v7, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    .line 17
    :cond_3
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v7

    if-eq v7, v9, :cond_4

    .line 18
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v7

    if-eq v7, v13, :cond_4

    .line 19
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isFileDataValid()Z

    move-result v7

    if-nez v7, :cond_4

    .line 20
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->reset()V

    :cond_4
    const/4 v7, 0x0

    .line 21
    :goto_1
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v14

    if-ne v14, v13, :cond_5

    .line 22
    invoke-virtual {v6, v12}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setStatus(I)V

    .line 23
    :cond_5
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v12

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v13, v14}, Lcom/ss/android/socialbase/downloader/wv/u;->vv(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/high16 v12, 0x2000000

    .line 24
    invoke-static {v12}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v12

    if-eqz v12, :cond_6

    goto :goto_2

    .line 25
    :cond_6
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->erase()V

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v7, 0x1

    :cond_8
    :goto_3
    if-eqz v7, :cond_9

    .line 26
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 28
    :cond_9
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v7

    if-eqz v0, :cond_b

    .line 29
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getTaskKey()Ljava/lang/String;

    move-result-object v12

    .line 30
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getUrl()Ljava/lang/String;

    move-result-object v12

    :cond_a
    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getSavePath()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v12, v13}, Lcom/ss/android/socialbase/downloader/downloader/b;->vv(Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    goto :goto_4

    :cond_b
    const/4 v12, 0x0

    :goto_4
    if-eq v12, v7, :cond_c

    .line 31
    invoke-virtual {v6, v12}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->setId(I)V

    .line 32
    invoke-virtual {v5, v7, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 33
    :cond_c
    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v6}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v12

    invoke-virtual {v7, v12, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    goto/16 :goto_0

    :cond_d
    new-array v0, v11, [Landroid/database/Cursor;

    aput-object v2, v0, v10

    .line 34
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Landroid/database/Cursor;)V

    .line 35
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0, v3}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Ljava/util/List;)V

    .line 36
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-static/range {v2 .. v7}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 37
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    if-eqz v2, :cond_11

    .line 39
    :goto_5
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v10, v2, :cond_11

    .line 40
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v2, v10}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    if-eqz v2, :cond_f

    .line 41
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 42
    invoke-static {v8}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v3

    if-eqz v3, :cond_e

    if-eqz v2, :cond_f

    .line 43
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkBreakpointAvailable()Z

    move-result v3

    if-nez v3, :cond_f

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v3

    if-eq v3, v9, :cond_f

    .line 44
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_6

    :cond_e
    if-eqz v2, :cond_f

    .line 46
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkBreakpointAvailable()Z

    move-result v3

    if-nez v3, :cond_f

    .line 47
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 49
    :cond_f
    :goto_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 50
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->remove(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :cond_10
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 51
    :cond_11
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_12

    .line 52
    :goto_8
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/i;->vv()V

    .line 53
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0, v11}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Z)Z

    .line 54
    :cond_12
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, v2, v3}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    return-void

    :catchall_0
    move-exception v0

    .line 55
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_12

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v2, v0

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_13

    .line 57
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/i;->vv()V

    .line 58
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0, v11}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Z)Z

    .line 59
    :cond_13
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, v3, v4}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    throw v2

    :catchall_2
    move-exception v0

    .line 60
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    new-array v0, v11, [Landroid/database/Cursor;

    aput-object v2, v0, v10

    .line 61
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Landroid/database/Cursor;)V

    .line 62
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0, v3}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Ljava/util/List;)V

    .line 63
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-static/range {v2 .. v7}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 64
    :try_start_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    if-eqz v2, :cond_17

    .line 66
    :goto_9
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v10, v2, :cond_17

    .line 67
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v2, v10}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    if-eqz v2, :cond_15

    .line 68
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 69
    invoke-static {v8}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v3

    if-eqz v3, :cond_14

    if-eqz v2, :cond_15

    .line 70
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkBreakpointAvailable()Z

    move-result v3

    if-nez v3, :cond_15

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v3

    if-eq v3, v9, :cond_15

    .line 71
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_a

    :cond_14
    if-eqz v2, :cond_15

    .line 73
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkBreakpointAvailable()Z

    move-result v3

    if-nez v3, :cond_15

    .line 74
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 76
    :cond_15
    :goto_a
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 77
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->remove(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_b

    :cond_16
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    .line 78
    :cond_17
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_12

    goto/16 :goto_8

    :catchall_3
    move-exception v0

    .line 79
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 80
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_12

    goto/16 :goto_8

    :catchall_4
    move-exception v0

    move-object v2, v0

    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_18

    .line 81
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/i;->vv()V

    .line 82
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0, v11}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Z)Z

    .line 83
    :cond_18
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, v3, v4}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    throw v2

    :catchall_5
    move-exception v0

    move-object v12, v0

    new-array v0, v11, [Landroid/database/Cursor;

    aput-object v2, v0, v10

    .line 84
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/wv/u;->vv([Landroid/database/Cursor;)V

    .line 85
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0, v3}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Ljava/util/List;)V

    .line 86
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v6, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iget-object v7, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-static/range {v2 .. v7}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Ljava/util/List;Ljava/util/List;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 87
    :try_start_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 88
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    if-eqz v2, :cond_1c

    .line 89
    :goto_c
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v10, v2, :cond_1c

    .line 90
    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v2, v10}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    if-eqz v2, :cond_1a

    .line 91
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;

    .line 92
    invoke-static {v8}, Lcom/ss/android/socialbase/downloader/wv/vv;->vv(I)Z

    move-result v3

    if-eqz v3, :cond_19

    if-eqz v2, :cond_1a

    .line 93
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkBreakpointAvailable()Z

    move-result v3

    if-nez v3, :cond_1a

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getStatus()I

    move-result v3

    if-eq v3, v9, :cond_1a

    .line 94
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_d

    :cond_19
    if-eqz v2, :cond_1a

    .line 96
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->isChunkBreakpointAvailable()Z

    move-result v3

    if-nez v3, :cond_1a

    .line 97
    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v2}, Lcom/ss/android/socialbase/downloader/model/DownloadInfo;->getId()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 99
    :cond_1a
    :goto_d
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 100
    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->remove(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_e

    :cond_1b
    add-int/lit8 v10, v10, 0x1

    goto :goto_c

    .line 101
    :cond_1c
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_1d

    goto :goto_f

    :catchall_6
    move-exception v0

    .line 102
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 103
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_1d

    .line 104
    :goto_f
    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/i;->vv()V

    .line 105
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0, v11}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Z)Z

    .line 106
    :cond_1d
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v2, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, v2, v3}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    throw v12

    :catchall_7
    move-exception v0

    move-object v2, v0

    .line 107
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    if-eqz v0, :cond_1e

    .line 108
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->p:Lcom/ss/android/socialbase/downloader/m/i;

    invoke-interface {v0}, Lcom/ss/android/socialbase/downloader/m/i;->vv()V

    .line 109
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    invoke-static {v0, v11}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Lcom/ss/android/socialbase/downloader/m/o;Z)Z

    .line 110
    :cond_1e
    iget-object v0, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->i:Lcom/ss/android/socialbase/downloader/m/o;

    iget-object v3, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->vv:Landroid/util/SparseArray;

    iget-object v4, v1, Lcom/ss/android/socialbase/downloader/m/o$1;->m:Landroid/util/SparseArray;

    invoke-virtual {v0, v3, v4}, Lcom/ss/android/socialbase/downloader/m/o;->vv(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    goto :goto_11

    :goto_10
    throw v2

    :goto_11
    goto :goto_10
.end method
