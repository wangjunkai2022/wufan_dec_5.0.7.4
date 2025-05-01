.class public final Lcom/kwad/framework/filedownloader/download/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/framework/filedownloader/download/b$a;
    }
.end annotation


# instance fields
.field private agH:Lcom/kwad/framework/filedownloader/services/c;

.field private agI:Lcom/kwad/framework/filedownloader/f/c$a;

.field private agJ:Lcom/kwad/framework/filedownloader/f/c$b;

.field private agK:Lcom/kwad/framework/filedownloader/f/c$e;

.field private volatile agL:Lcom/kwad/framework/filedownloader/b/a;

.field private agM:Lcom/kwad/framework/filedownloader/f/c$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/kwad/framework/filedownloader/b/a$a;)V
    .locals 26

    move-object/from16 v1, p0

    const-string v2, "refreshed data count: %d , delete data count: %d, reset id count: %d. consume %d"

    .line 10
    const-class v3, Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 11
    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b;->vS()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/kwad/framework/filedownloader/download/b;->vT()Lcom/kwad/framework/filedownloader/f/c$d;

    move-result-object v4

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    :goto_0
    const/4 v15, 0x3

    .line 13
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_c

    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v8, v19

    check-cast v8, Lcom/kwad/framework/filedownloader/d/c;

    .line 15
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-object/from16 v21, v2

    const/4 v2, -0x2

    if-eq v7, v15, :cond_0

    .line 16
    :try_start_1
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v7

    const/4 v15, 0x2

    if-eq v7, v15, :cond_0

    .line 17
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v7

    const/4 v15, -0x1

    if-eq v7, v15, :cond_0

    .line 18
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v7

    const/4 v15, 0x1

    if-ne v7, v15, :cond_1

    .line 19
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v22

    const-wide/16 v16, 0x0

    cmp-long v7, v22, v16

    if-lez v7, :cond_1

    .line 20
    :cond_0
    invoke-virtual {v8, v2}, Lcom/kwad/framework/filedownloader/d/c;->d(B)V

    .line 21
    :cond_1
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->getTargetFilePath()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    move-wide/from16 v22, v5

    move-wide/from16 v24, v9

    const/4 v2, 0x1

    const-wide/16 v9, 0x0

    goto/16 :goto_3

    .line 22
    :cond_2
    new-instance v15, Ljava/io/File;

    invoke-direct {v15, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v7

    if-ne v7, v2, :cond_3

    .line 24
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v2

    .line 25
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->getPath()Ljava/lang/String;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-wide/from16 v22, v5

    const/4 v5, 0x0

    .line 26
    :try_start_2
    invoke-static {v2, v8, v7, v5}, Lcom/kwad/framework/filedownloader/f/f;->a(ILcom/kwad/framework/filedownloader/d/c;Ljava/lang/String;Ljava/lang/Boolean;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 27
    new-instance v2, Ljava/io/File;

    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->wh()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 29
    invoke-virtual {v15, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v5

    .line 30
    sget-boolean v6, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v6, :cond_4

    const-string v6, "resume from the old no-temp-file architecture [%B], [%s]->[%s]"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-wide/from16 v24, v9

    const/4 v7, 0x3

    :try_start_3
    new-array v9, v7, [Ljava/lang/Object;

    .line 31
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v7, 0x0

    aput-object v5, v9, v7

    invoke-virtual {v15}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    aput-object v5, v9, v7

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v9, v5

    .line 32
    invoke-static {v3, v6, v9}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_3
    move-wide/from16 v22, v5

    :cond_4
    move-wide/from16 v24, v9

    .line 33
    :goto_1
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->uz()B

    move-result v2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_5

    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->wP()J

    move-result-wide v5

    const-wide/16 v9, 0x0

    cmp-long v2, v5, v9

    if-gtz v2, :cond_6

    :goto_2
    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    const-wide/16 v9, 0x0

    .line 34
    :cond_6
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v2

    invoke-static {v2, v8}, Lcom/kwad/framework/filedownloader/f/f;->b(ILcom/kwad/framework/filedownloader/d/c;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    .line 35
    :cond_7
    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_2

    :cond_8
    const/4 v2, 0x0

    :goto_3
    const-wide/16 v5, 0x1

    if-eqz v2, :cond_9

    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    add-long/2addr v11, v5

    move-object/from16 v2, v21

    move-wide/from16 v5, v22

    move-wide/from16 v9, v24

    goto/16 :goto_0

    .line 37
    :cond_9
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->getId()I

    move-result v2

    .line 38
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->getUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->getPath()Ljava/lang/String;

    move-result-object v15

    .line 39
    invoke-virtual {v8}, Lcom/kwad/framework/filedownloader/d/c;->uv()Z

    move-result v9

    .line 40
    invoke-interface {v4, v7, v15, v9}, Lcom/kwad/framework/filedownloader/f/c$d;->f(Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v7

    if-eq v7, v2, :cond_b

    .line 41
    sget-boolean v9, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v9, :cond_a

    const-string v9, "the id is changed on restoring from db: old[%d] -> new[%d]"

    const/4 v10, 0x2

    new-array v15, v10, [Ljava/lang/Object;

    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v18, 0x0

    aput-object v10, v15, v18

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v20, 0x1

    aput-object v10, v15, v20

    .line 43
    invoke-static {v3, v9, v15}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    :cond_a
    invoke-virtual {v8, v7}, Lcom/kwad/framework/filedownloader/d/c;->setId(I)V

    .line 45
    invoke-interface {v1, v2, v8}, Lcom/kwad/framework/filedownloader/b/a$a;->a(ILcom/kwad/framework/filedownloader/d/c;)V

    add-long/2addr v13, v5

    .line 46
    :cond_b
    invoke-interface {v1, v8}, Lcom/kwad/framework/filedownloader/b/a$a;->c(Lcom/kwad/framework/filedownloader/d/c;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    add-long v9, v24, v5

    move-object/from16 v2, v21

    move-wide/from16 v5, v22

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-wide/from16 v22, v5

    :goto_4
    move-wide/from16 v24, v9

    :goto_5
    move-object/from16 v2, v21

    goto :goto_6

    :cond_c
    move-object/from16 v21, v2

    move-wide/from16 v22, v5

    move-wide/from16 v24, v9

    .line 47
    invoke-static {}, Lcom/kwad/framework/filedownloader/f/c;->xp()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/f/f;->az(Landroid/content/Context;)V

    .line 48
    invoke-interface/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/b/a$a;->vK()V

    .line 49
    sget-boolean v0, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v0, :cond_d

    const/4 v1, 0x4

    new-array v0, v1, [Ljava/lang/Object;

    .line 50
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long v1, v1, v22

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    move-object/from16 v2, v21

    .line 52
    invoke-static {v3, v2, v0}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_d
    return-void

    :catchall_3
    move-exception v0

    move-wide/from16 v22, v5

    move-wide/from16 v24, v9

    .line 53
    :goto_6
    invoke-static {}, Lcom/kwad/framework/filedownloader/f/c;->xp()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/kwad/framework/filedownloader/f/f;->az(Landroid/content/Context;)V

    .line 54
    invoke-interface/range {p0 .. p0}, Lcom/kwad/framework/filedownloader/b/a$a;->vK()V

    .line 55
    sget-boolean v1, Lcom/kwad/framework/filedownloader/f/d;->ajb:Z

    if-eqz v1, :cond_e

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    .line 56
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v1, v5

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v1, v5

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v1, v5

    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v4, v4, v22

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x3

    aput-object v4, v1, v5

    .line 58
    invoke-static {v3, v2, v1}, Lcom/kwad/framework/filedownloader/f/d;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :cond_e
    goto :goto_8

    :goto_7
    throw v0

    :goto_8
    goto :goto_7
.end method

.method public static vS()Lcom/kwad/framework/filedownloader/download/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/framework/filedownloader/download/b$a;->wb()Lcom/kwad/framework/filedownloader/download/b;

    move-result-object v0

    return-object v0
.end method

.method private vX()Lcom/kwad/framework/filedownloader/f/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agI:Lcom/kwad/framework/filedownloader/f/c$a;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agI:Lcom/kwad/framework/filedownloader/f/c$a;

    if-nez v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->wa()Lcom/kwad/framework/filedownloader/services/c;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/services/c;->wY()Lcom/kwad/framework/filedownloader/f/c$a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agI:Lcom/kwad/framework/filedownloader/f/c$a;

    .line 6
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agI:Lcom/kwad/framework/filedownloader/f/c$a;

    return-object v0

    :catchall_0
    move-exception v0

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private vY()Lcom/kwad/framework/filedownloader/f/c$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agJ:Lcom/kwad/framework/filedownloader/f/c$b;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agJ:Lcom/kwad/framework/filedownloader/f/c$b;

    if-nez v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->wa()Lcom/kwad/framework/filedownloader/services/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/services/c;->wX()Lcom/kwad/framework/filedownloader/f/c$b;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agJ:Lcom/kwad/framework/filedownloader/f/c$b;

    .line 5
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agJ:Lcom/kwad/framework/filedownloader/f/c$b;

    return-object v0

    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private vZ()Lcom/kwad/framework/filedownloader/f/c$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agK:Lcom/kwad/framework/filedownloader/f/c$e;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agK:Lcom/kwad/framework/filedownloader/f/c$e;

    if-nez v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->wa()Lcom/kwad/framework/filedownloader/services/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/services/c;->wW()Lcom/kwad/framework/filedownloader/f/c$e;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agK:Lcom/kwad/framework/filedownloader/f/c$e;

    .line 5
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agK:Lcom/kwad/framework/filedownloader/f/c$e;

    return-object v0

    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private wa()Lcom/kwad/framework/filedownloader/services/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agH:Lcom/kwad/framework/filedownloader/services/c;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agH:Lcom/kwad/framework/filedownloader/services/c;

    if-nez v0, :cond_1

    new-instance v0, Lcom/kwad/framework/filedownloader/services/c;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/services/c;-><init>()V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agH:Lcom/kwad/framework/filedownloader/services/c;

    .line 4
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agH:Lcom/kwad/framework/filedownloader/services/c;

    return-object v0

    :catchall_0
    move-exception v0

    .line 6
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;J)I
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->vX()Lcom/kwad/framework/filedownloader/f/c$a;

    move-result-object p1

    .line 9
    invoke-interface {p1, p4, p5}, Lcom/kwad/framework/filedownloader/f/c$a;->O(J)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/kwad/framework/filedownloader/services/c$b;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Lcom/kwad/framework/filedownloader/services/c;

    invoke-direct {v0, p1}, Lcom/kwad/framework/filedownloader/services/c;-><init>(Lcom/kwad/framework/filedownloader/services/c$b;)V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agH:Lcom/kwad/framework/filedownloader/services/c;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/b;->agJ:Lcom/kwad/framework/filedownloader/f/c$b;

    .line 4
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/b;->agK:Lcom/kwad/framework/filedownloader/f/c$e;

    .line 5
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/b;->agL:Lcom/kwad/framework/filedownloader/b/a;

    .line 6
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/b;->agM:Lcom/kwad/framework/filedownloader/f/c$d;

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Ljava/io/File;)Lcom/kwad/framework/filedownloader/e/a;
    .locals 1

    .line 4
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->vZ()Lcom/kwad/framework/filedownloader/f/c$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/f/c$e;->c(Ljava/io/File;)Lcom/kwad/framework/filedownloader/e/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/kwad/framework/filedownloader/services/c$b;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Lcom/kwad/framework/filedownloader/services/c;

    invoke-direct {v0, p1}, Lcom/kwad/framework/filedownloader/services/c;-><init>(Lcom/kwad/framework/filedownloader/services/c$b;)V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agH:Lcom/kwad/framework/filedownloader/services/c;

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final bk(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a/b;
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->vY()Lcom/kwad/framework/filedownloader/f/c$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/f/c$b;->bh(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a/b;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 2
    :catchall_0
    new-instance v0, Lcom/kwad/framework/filedownloader/a/c$b;

    invoke-direct {v0}, Lcom/kwad/framework/filedownloader/a/c$b;-><init>()V

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agJ:Lcom/kwad/framework/filedownloader/f/c$b;

    .line 3
    invoke-interface {v0, p1}, Lcom/kwad/framework/filedownloader/f/c$b;->bh(Ljava/lang/String;)Lcom/kwad/framework/filedownloader/a/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final vT()Lcom/kwad/framework/filedownloader/f/c$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agM:Lcom/kwad/framework/filedownloader/f/c$d;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agM:Lcom/kwad/framework/filedownloader/f/c$d;

    if-nez v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->wa()Lcom/kwad/framework/filedownloader/services/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/services/c;->wZ()Lcom/kwad/framework/filedownloader/f/c$d;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agM:Lcom/kwad/framework/filedownloader/f/c$d;

    .line 5
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agM:Lcom/kwad/framework/filedownloader/f/c$d;

    return-object v0

    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized vU()Lcom/kwad/framework/filedownloader/b/a;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agL:Lcom/kwad/framework/filedownloader/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agL:Lcom/kwad/framework/filedownloader/b/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 2
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->wa()Lcom/kwad/framework/filedownloader/services/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/services/c;->wV()Lcom/kwad/framework/filedownloader/b/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agL:Lcom/kwad/framework/filedownloader/b/a;

    .line 3
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agL:Lcom/kwad/framework/filedownloader/b/a;

    invoke-interface {v0}, Lcom/kwad/framework/filedownloader/b/a;->vJ()Lcom/kwad/framework/filedownloader/b/a$a;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/framework/filedownloader/download/b;->a(Lcom/kwad/framework/filedownloader/b/a$a;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/b;->agL:Lcom/kwad/framework/filedownloader/b/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final vV()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->wa()Lcom/kwad/framework/filedownloader/services/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/framework/filedownloader/services/c;->vV()I

    move-result v0

    return v0
.end method

.method public final vW()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/framework/filedownloader/download/b;->vZ()Lcom/kwad/framework/filedownloader/f/c$e;

    const/4 v0, 0x1

    return v0
.end method
