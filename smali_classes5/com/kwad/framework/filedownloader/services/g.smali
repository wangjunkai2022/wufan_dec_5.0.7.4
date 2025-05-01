.class final Lcom/kwad/framework/filedownloader/services/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/framework/filedownloader/y;


# instance fields
.field private final aiQ:Lcom/kwad/framework/filedownloader/services/h;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/framework/filedownloader/services/h;

    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b;->vS()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/download/b;->vV()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/kwad/framework/filedownloader/services/h;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/services/g;->aiQ:Lcom/kwad/framework/filedownloader/services/h;

    return-void
.end method

.method private bI(I)Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/g;->xh()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/b/a;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kwad/framework/filedownloader/services/g;->a(Lcom/kwad/framework/filedownloader/d/c;)Z

    move-result p1

    return p1
.end method

.method private static xh()Lcom/kwad/framework/filedownloader/b/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b;->vS()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/download/b;->vU()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kwad/framework/filedownloader/d/c;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    iget-object v1, p0, Lcom/kwad/framework/filedownloader/services/g;->aiQ:Lcom/kwad/framework/filedownloader/services/h;

    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kwad/framework/filedownloader/services/h;->bK(I)Z

    move-result v1

    .line 2
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v2

    invoke-static {v2}, Lcom/kwad/framework/filedownloader/d/d;->bF(I)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 3
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    aput-object p1, v1, v3

    const-string p1, "%d status is[%s](not finish) & but not in the pool"

    .line 4
    invoke-static {p0, p1, v1}, Lcom/kwad/framework/filedownloader/f/d;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;Ljava/lang/String;ZIIIZLcom/kwad/framework/filedownloader/d/b;Z)V
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    move/from16 v9, p3

    monitor-enter p0

    .line 1
    :try_start_0
    sget-boolean v1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v1, :cond_0

    const-string v1, "request start the task with url(%s) path(%s) isDirectory(%B)"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v11

    aput-object v8, v2, v12

    .line 2
    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v10

    .line 3
    invoke-static {v7, v1, v2}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :cond_0
    invoke-static/range {p1 .. p3}, Lcom/kwad/framework/filedownloader/f/f;->g(Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v13

    .line 5
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/g;->xh()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v14

    .line 6
    invoke-interface {v14, v13}, Lcom/kwad/framework/filedownloader/b/a;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v9, :cond_3

    if-nez v1, :cond_3

    .line 7
    invoke-static/range {p2 .. p2}, Lcom/kwad/framework/filedownloader/f/f;->bz(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v12}, Lcom/kwad/framework/filedownloader/f/f;->g(Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v1

    .line 8
    invoke-interface {v14, v1}, Lcom/kwad/framework/filedownloader/b/a;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 9
    invoke-virtual {v3}, Lcom/kwad/framework/filedownloader/d/c;->getTargetFilePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 10
    sget-boolean v4, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v4, :cond_1

    const-string v4, "task[%d] find model by dirCaseId[%d]"

    new-array v5, v10, [Ljava/lang/Object;

    .line 11
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v12

    invoke-static {v7, v4, v5}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    :cond_1
    invoke-interface {v14, v1}, Lcom/kwad/framework/filedownloader/b/a;->bl(I)Ljava/util/List;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_0

    :cond_2
    move-object/from16 v16, v2

    :goto_0
    move-object v15, v3

    goto :goto_1

    :cond_3
    move-object v15, v1

    move-object/from16 v16, v2

    .line 13
    :goto_1
    invoke-static {v13, v15, v7, v12}, Lcom/kwad/framework/filedownloader/f/c;->a(ILcom/kwad/framework/filedownloader/d/c;Lcom/kwad/framework/filedownloader/y;Z)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 14
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_4

    const-string v0, "has already started download %d"

    new-array v1, v12, [Ljava/lang/Object;

    .line 15
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v7, v0, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :cond_4
    monitor-exit p0

    return-void

    :cond_5
    if-eqz v15, :cond_6

    .line 17
    :try_start_1
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->getTargetFilePath()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 18
    :cond_6
    invoke-static {v8, v9, v2}, Lcom/kwad/framework/filedownloader/f/f;->a(Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_2
    move/from16 v5, p7

    move-object v6, v1

    .line 19
    invoke-static {v13, v6, v5, v12}, Lcom/kwad/framework/filedownloader/f/c;->a(ILjava/lang/String;ZZ)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 20
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_7

    const-string v0, "has already completed downloading %d"

    new-array v1, v12, [Ljava/lang/Object;

    .line 21
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v7, v0, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :cond_7
    monitor-exit p0

    return-void

    :cond_8
    const-wide/16 v2, 0x0

    if-eqz v15, :cond_9

    .line 23
    :try_start_2
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v17

    goto :goto_3

    :cond_9
    move-wide/from16 v17, v2

    :goto_3
    if-eqz v15, :cond_a

    .line 24
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 25
    :cond_a
    invoke-static {v6}, Lcom/kwad/framework/filedownloader/f/f;->bw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_4
    move-object v4, v1

    move v1, v13

    move-wide/from16 v2, v17

    move-object v5, v6

    move-object/from16 v17, v6

    move-object/from16 v6, p0

    .line 26
    invoke-static/range {v1 .. v6}, Lcom/kwad/framework/filedownloader/f/c;->a(IJLjava/lang/String;Ljava/lang/String;Lcom/kwad/framework/filedownloader/y;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 27
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_b

    const-string v0, "there is an another task with the same target-file-path %d %s"

    new-array v1, v10, [Ljava/lang/Object;

    .line 28
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v11

    aput-object v17, v1, v12

    .line 29
    invoke-static {v7, v0, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v15, :cond_b

    .line 30
    invoke-interface {v14, v13}, Lcom/kwad/framework/filedownloader/b/a;->bn(I)Z

    .line 31
    invoke-interface {v14, v13}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    :cond_b
    monitor-exit p0

    return-void

    :cond_c
    if-eqz v15, :cond_f

    .line 33
    :try_start_3
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v1

    const/4 v2, -0x2

    if-eq v1, v2, :cond_d

    .line 34
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_d

    .line 35
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v1

    if-eq v1, v12, :cond_d

    .line 36
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_d

    .line 37
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v1

    if-ne v1, v10, :cond_f

    .line 38
    :cond_d
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v1

    if-eq v1, v13, :cond_e

    .line 39
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v0

    invoke-interface {v14, v0}, Lcom/kwad/framework/filedownloader/b/a;->bn(I)Z

    .line 40
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v0

    invoke-interface {v14, v0}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    .line 41
    invoke-virtual {v15, v13}, Lcom/kwad/framework/filedownloader/d/c;->setId(I)V

    .line 42
    invoke-virtual {v15, v8, v9}, Lcom/kwad/framework/filedownloader/d/c;->d(Ljava/lang/String;Z)V

    if-eqz v16, :cond_11

    .line 43
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/framework/filedownloader/d/a;

    .line 44
    invoke-virtual {v1, v13}, Lcom/kwad/framework/filedownloader/d/a;->setId(I)V

    .line 45
    invoke-interface {v14, v1}, Lcom/kwad/framework/filedownloader/b/a;->a(Lcom/kwad/framework/filedownloader/d/a;)V

    goto :goto_5

    .line 46
    :cond_e
    invoke-virtual {v15}, Lcom/kwad/framework/filedownloader/d/c;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_12

    .line 47
    invoke-virtual {v15, v0}, Lcom/kwad/framework/filedownloader/d/c;->setUrl(Ljava/lang/String;)V

    goto :goto_6

    :cond_f
    if-nez v15, :cond_10

    .line 48
    new-instance v1, Lcom/kwad/framework/filedownloader/d/c;

    invoke-direct {v1}, Lcom/kwad/framework/filedownloader/d/c;-><init>()V

    move-object v15, v1

    .line 49
    :cond_10
    invoke-virtual {v15, v0}, Lcom/kwad/framework/filedownloader/d/c;->setUrl(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v15, v8, v9}, Lcom/kwad/framework/filedownloader/d/c;->d(Ljava/lang/String;Z)V

    .line 51
    invoke-virtual {v15, v13}, Lcom/kwad/framework/filedownloader/d/c;->setId(I)V

    const-wide/16 v0, 0x0

    .line 52
    invoke-virtual {v15, v0, v1}, Lcom/kwad/framework/filedownloader/d/c;->S(J)V

    .line 53
    invoke-virtual {v15, v0, v1}, Lcom/kwad/framework/filedownloader/d/c;->U(J)V

    .line 54
    invoke-virtual {v15, v12}, Lcom/kwad/framework/filedownloader/d/c;->d(B)V

    .line 55
    invoke-virtual {v15, v12}, Lcom/kwad/framework/filedownloader/d/c;->bD(I)V

    :cond_11
    :goto_6
    const/4 v11, 0x1

    :cond_12
    if-eqz v11, :cond_13

    .line 56
    invoke-interface {v14, v15}, Lcom/kwad/framework/filedownloader/b/a;->b(Lcom/kwad/framework/filedownloader/d/c;)V

    .line 57
    :cond_13
    new-instance v0, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;-><init>()V

    .line 58
    invoke-virtual {v0, v15}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->e(Lcom/kwad/framework/filedownloader/d/c;)Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    move-result-object v0

    move-object/from16 v1, p8

    .line 59
    invoke-virtual {v0, v1}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->b(Lcom/kwad/framework/filedownloader/d/b;)Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    move-result-object v0

    .line 60
    invoke-virtual {v0, v7}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->a(Lcom/kwad/framework/filedownloader/y;)Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    move-result-object v0

    .line 61
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->a(Ljava/lang/Integer;)Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    move-result-object v0

    .line 62
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->b(Ljava/lang/Integer;)Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    move-result-object v0

    .line 63
    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->a(Ljava/lang/Boolean;)Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    move-result-object v0

    .line 64
    invoke-static/range {p9 .. p9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->b(Ljava/lang/Boolean;)Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    move-result-object v0

    .line 65
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->c(Ljava/lang/Integer;)Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable$a;->wi()Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;

    move-result-object v0

    .line 67
    iget-object v1, v7, Lcom/kwad/framework/filedownloader/services/g;->aiQ:Lcom/kwad/framework/filedownloader/services/h;

    invoke-virtual {v1, v0}, Lcom/kwad/framework/filedownloader/services/h;->a(Lcom/kwad/framework/filedownloader/download/DownloadLaunchRunnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_8

    :goto_7
    throw v0

    :goto_8
    goto :goto_7
.end method

.method public final bJ(I)J
    .locals 6

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/g;->xh()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/b/a;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object v1

    const-wide/16 v2, 0x0

    if-nez v1, :cond_0

    return-wide v2

    .line 3
    :cond_0
    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wS()I

    move-result v4

    const/4 v5, 0x1

    if-gt v4, v5, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v0

    return-wide v0

    .line 5
    :cond_1
    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/b/a;->bl(I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v4, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {p1}, Lcom/kwad/framework/filedownloader/d/a;->r(Ljava/util/List;)J

    move-result-wide v0

    return-wide v0

    :cond_3
    :goto_0
    return-wide v2
.end method

.method public final bd(I)Z
    .locals 4

    .line 1
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    new-array v0, v2, [Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const-string v3, "request pause the task %d"

    invoke-static {p0, v3, v0}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/g;->xh()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/b/a;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v1, -0x2

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/framework/filedownloader/d/c;->d(B)V

    .line 5
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/g;->aiQ:Lcom/kwad/framework/filedownloader/services/h;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/services/h;->cancel(I)V

    return v2
.end method

.method public final be(I)B
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/g;->xh()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/b/a;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result p1

    return p1
.end method

.method public final bf(I)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "The task[%d] id is invalid, can\'t clear it."

    invoke-static {p0, p1, v0}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/services/g;->bI(I)Z

    move-result v2

    if-eqz v2, :cond_1

    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const-string p1, "The task[%d] is downloading, can\'t clear it."

    invoke-static {p0, p1, v0}, Lcom/kwad/framework/filedownloader/f/d;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 4
    :cond_1
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/g;->xh()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v1

    .line 5
    invoke-interface {v1, p1}, Lcom/kwad/framework/filedownloader/b/a;->bn(I)Z

    .line 6
    invoke-interface {v1, p1}, Lcom/kwad/framework/filedownloader/b/a;->bm(I)V

    return v0
.end method

.method public final declared-synchronized bx(I)Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/g;->aiQ:Lcom/kwad/framework/filedownloader/services/h;

    invoke-virtual {v0, p1}, Lcom/kwad/framework/filedownloader/services/h;->bx(I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final bz(I)J
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/g;->xh()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/b/a;->bk(I)Lcom/kwad/framework/filedownloader/d/c;

    move-result-object p1

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/framework/filedownloader/d/c;->getTotal()J

    move-result-wide v0

    return-wide v0
.end method

.method public final isIdle()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/g;->aiQ:Lcom/kwad/framework/filedownloader/services/h;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/services/h;->xk()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final o(Ljava/lang/String;I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/g;->aiQ:Lcom/kwad/framework/filedownloader/services/h;

    invoke-virtual {v0, p1, p2}, Lcom/kwad/framework/filedownloader/services/h;->o(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public final wz()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/services/g;->xh()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/b/a;->clear()V

    return-void
.end method

.method public final xi()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/services/g;->aiQ:Lcom/kwad/framework/filedownloader/services/h;

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/services/h;->xl()Ljava/util/List;

    move-result-object v0

    .line 2
    sget-boolean v1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "pause all tasks %d"

    invoke-static {p0, v2, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/kwad/framework/filedownloader/services/g;->bd(I)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/framework/filedownloader/f/f;->A(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/kwad/framework/filedownloader/services/g;->bI(I)Z

    move-result p1

    return p1
.end method
