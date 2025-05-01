.class public Lcom/beizi/ad/internal/nativead/a/a;
.super Ljava/lang/Object;
.source "MediationNativeAdController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/nativead/a/a$b;,
        Lcom/beizi/ad/internal/nativead/a/a$a;
    }
.end annotation


# instance fields
.field public a:Lcom/beizi/ad/internal/network/ServerResponse;

.field b:Lcom/beizi/ad/internal/e;

.field c:Lcom/beizi/ad/internal/a/a;

.field d:Z

.field e:Z

.field f:I

.field private g:Z

.field private final h:Landroid/os/Handler;

.field private i:J

.field private j:J


# direct methods
.method private constructor <init>(Lcom/beizi/ad/internal/a/a;Lcom/beizi/ad/internal/e;Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->d:Z

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->e:Z

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->g:Z

    .line 5
    new-instance v0, Lcom/beizi/ad/internal/nativead/a/a$b;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/nativead/a/a$b;-><init>(Lcom/beizi/ad/internal/nativead/a/a;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->h:Landroid/os/Handler;

    const-wide/16 v0, -0x1

    .line 6
    iput-wide v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->i:J

    iput-wide v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->j:J

    if-nez p1, :cond_0

    .line 7
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget p2, Lcom/beizi/ad/R$string;->mediated_no_ads:I

    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x3

    .line 8
    iput p1, p0, Lcom/beizi/ad/internal/nativead/a/a;->f:I

    goto/16 :goto_0

    .line 9
    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->instantiating_class:I

    .line 10
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iput-object p2, p0, Lcom/beizi/ad/internal/nativead/a/a;->b:Lcom/beizi/ad/internal/e;

    .line 13
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/a/a;->c:Lcom/beizi/ad/internal/a/a;

    .line 14
    iput-object p3, p0, Lcom/beizi/ad/internal/nativead/a/a;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    .line 15
    invoke-virtual {p0}, Lcom/beizi/ad/internal/nativead/a/a;->b()V

    .line 16
    invoke-virtual {p0}, Lcom/beizi/ad/internal/nativead/a/a;->d()V

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p3

    .line 18
    invoke-virtual {p3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lcom/beizi/ad/internal/nativead/a/b;

    .line 19
    invoke-interface {p2}, Lcom/beizi/ad/internal/e;->c()Lcom/beizi/ad/internal/d;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 20
    invoke-interface {p2}, Lcom/beizi/ad/internal/e;->c()Lcom/beizi/ad/internal/d;

    move-result-object p3

    invoke-virtual {p3}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v1

    .line 21
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->b()Ljava/lang/String;

    move-result-object v3

    .line 22
    invoke-interface {p2}, Lcom/beizi/ad/internal/e;->d()Lcom/beizi/ad/b/a;

    move-result-object v5

    move-object v4, p0

    .line 23
    invoke-interface/range {v0 .. v5}, Lcom/beizi/ad/internal/nativead/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/beizi/ad/internal/nativead/a/a;Lcom/beizi/ad/b/a;)V

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    .line 24
    iput p2, p0, Lcom/beizi/ad/internal/nativead/a/a;->f:I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 25
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/beizi/ad/internal/nativead/a/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception p2

    .line 26
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/beizi/ad/internal/nativead/a/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception p2

    .line 27
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/beizi/ad/internal/nativead/a/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :catch_3
    move-exception p2

    .line 28
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/beizi/ad/internal/nativead/a/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :catch_4
    move-exception p2

    .line 29
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/beizi/ad/internal/nativead/a/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 30
    :goto_0
    iget p1, p0, Lcom/beizi/ad/internal/nativead/a/a;->f:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_2

    .line 31
    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/nativead/a/a;->a(I)V

    :cond_2
    return-void
.end method

.method private a(Lcom/beizi/ad/internal/e;)J
    .locals 5

    if-eqz p1, :cond_0

    .line 18
    iget-wide v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->j:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 19
    invoke-interface {p1, v0, v1}, Lcom/beizi/ad/internal/e;->a(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public static a(Lcom/beizi/ad/internal/a/a;Lcom/beizi/ad/internal/e;Lcom/beizi/ad/internal/network/ServerResponse;)Lcom/beizi/ad/internal/nativead/a/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/beizi/ad/internal/nativead/a/a;

    invoke-direct {v0, p0, p1, p2}, Lcom/beizi/ad/internal/nativead/a/a;-><init>(Lcom/beizi/ad/internal/a/a;Lcom/beizi/ad/internal/e;Lcom/beizi/ad/internal/network/ServerResponse;)V

    return-object v0
.end method

.method private a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->mediation_instantiation_failure:I

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 7
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string v1, "Adding %s to invalid networks list"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p1

    sget-object v0, Lcom/beizi/ad/internal/j;->e:Lcom/beizi/ad/internal/j;

    invoke-virtual {p1, v0, p2}, Lcom/beizi/ad/internal/g;->a(Lcom/beizi/ad/internal/j;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x3

    .line 9
    iput p1, p0, Lcom/beizi/ad/internal/nativead/a/a;->f:I

    return-void
.end method

.method private b(I)V
    .locals 20
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi",
            "NewApi"
        }
    .end annotation

    move-object/from16 v13, p0

    move/from16 v14, p1

    .line 1
    iget-boolean v0, v13, Lcom/beizi/ad/internal/nativead/a/a;->e:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v15, v13, Lcom/beizi/ad/internal/nativead/a/a;->b:Lcom/beizi/ad/internal/e;

    .line 3
    iget-object v0, v13, Lcom/beizi/ad/internal/nativead/a/a;->c:Lcom/beizi/ad/internal/a/a;

    const/4 v12, 0x0

    const/4 v10, -0x1

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/beizi/ad/internal/a/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_3

    :cond_1
    const/4 v0, 0x1

    const/4 v11, 0x0

    if-eqz v15, :cond_2

    .line 4
    invoke-interface {v15}, Lcom/beizi/ad/internal/e;->b()Ljava/util/LinkedList;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 5
    invoke-interface {v15}, Lcom/beizi/ad/internal/e;->b()Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-ne v14, v10, :cond_3

    const/16 v16, 0x1

    goto :goto_1

    :cond_3
    move/from16 v16, v1

    .line 6
    :goto_1
    new-instance v0, Lcom/beizi/ad/internal/nativead/a/a$a;

    iget-object v1, v13, Lcom/beizi/ad/internal/nativead/a/a;->c:Lcom/beizi/ad/internal/a/a;

    .line 7
    invoke-virtual {v1}, Lcom/beizi/ad/internal/a/a;->f()Ljava/lang/String;

    move-result-object v4

    iget-object v1, v13, Lcom/beizi/ad/internal/nativead/a/a;->c:Lcom/beizi/ad/internal/a/a;

    .line 8
    invoke-virtual {v1}, Lcom/beizi/ad/internal/a/a;->g()Ljava/util/HashMap;

    move-result-object v6

    .line 9
    invoke-direct/range {p0 .. p0}, Lcom/beizi/ad/internal/nativead/a/a;->f()J

    move-result-wide v8

    invoke-direct {v13, v15}, Lcom/beizi/ad/internal/nativead/a/a;->a(Lcom/beizi/ad/internal/e;)J

    move-result-wide v17

    const/16 v19, 0x0

    move-object v1, v0

    move-object/from16 v2, p0

    move-object v3, v15

    move/from16 v5, p1

    move/from16 v7, v16

    const/4 v13, 0x0

    move-wide/from16 v10, v17

    move-object/from16 v12, v19

    invoke-direct/range {v1 .. v12}, Lcom/beizi/ad/internal/nativead/a/a$a;-><init>(Lcom/beizi/ad/internal/nativead/a/a;Lcom/beizi/ad/internal/e;Ljava/lang/String;ILjava/util/HashMap;ZJJLcom/beizi/ad/internal/nativead/a/a$1;)V

    .line 10
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_4

    .line 11
    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-array v2, v13, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_2

    :cond_4
    new-array v1, v13, [Ljava/lang/Void;

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 13
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception while firing ResultCB: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    move-exception v0

    .line 14
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Concurrent Thread Exception while firing ResultCB: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    if-eqz v16, :cond_5

    const/4 v1, -0x1

    if-eq v14, v1, :cond_5

    if-eqz v15, :cond_5

    const/4 v2, 0x0

    .line 17
    invoke-interface {v15, v2}, Lcom/beizi/ad/internal/e;->a(Lcom/beizi/ad/internal/network/ServerResponse;)V

    :cond_5
    return-void

    :cond_6
    :goto_3
    move-object v2, v12

    const/4 v1, -0x1

    if-ne v14, v1, :cond_7

    return-void

    .line 18
    :cond_7
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->fire_cb_result_null:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v15, :cond_8

    .line 19
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->fire_cb_requester_null:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 20
    :cond_8
    invoke-interface {v15, v2}, Lcom/beizi/ad/internal/e;->a(Lcom/beizi/ad/internal/network/ServerResponse;)V

    return-void
.end method

.method private f()J
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->i:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-wide v4, p0, Lcom/beizi/ad/internal/nativead/a/a;->j:J

    cmp-long v6, v4, v2

    if-lez v6, :cond_0

    sub-long/2addr v4, v0

    return-wide v4

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method


# virtual methods
.method protected a()V
    .locals 2

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->c:Lcom/beizi/ad/internal/a/a;

    .line 11
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->mediation_finish:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(I)V
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->d:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/ad/internal/nativead/a/a;->e()V

    .line 14
    invoke-virtual {p0}, Lcom/beizi/ad/internal/nativead/a/a;->c()V

    .line 15
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/nativead/a/a;->b(I)V

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/beizi/ad/internal/nativead/a/a;->e:Z

    .line 17
    invoke-virtual {p0}, Lcom/beizi/ad/internal/nativead/a/a;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 20
    iput-boolean p1, p0, Lcom/beizi/ad/internal/nativead/a/a;->g:Z

    if-eqz p1, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/beizi/ad/internal/nativead/a/a;->a()V

    :cond_0
    return-void
.end method

.method b()V
    .locals 4

    .line 21
    iget-boolean v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->d:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    :goto_0
    return-void
.end method

.method c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method protected d()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->i:J

    return-void
.end method

.method protected e()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/ad/internal/nativead/a/a;->j:J

    return-void
.end method
