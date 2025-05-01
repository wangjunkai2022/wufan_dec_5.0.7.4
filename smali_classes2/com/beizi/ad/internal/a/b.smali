.class public abstract Lcom/beizi/ad/internal/a/b;
.super Ljava/lang/Object;
.source "MediationAdViewController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/a/b$b;,
        Lcom/beizi/ad/internal/a/b$a;
    }
.end annotation


# static fields
.field static j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected a:Lcom/beizi/ad/internal/j;

.field protected b:Lcom/beizi/ad/b/b;

.field protected c:Lcom/beizi/ad/internal/a/a;

.field protected d:Lcom/beizi/ad/internal/b;

.field protected e:Lcom/beizi/ad/internal/a/e;

.field protected f:Lcom/beizi/ad/internal/network/ServerResponse;

.field protected g:Z

.field protected h:Z

.field protected i:Z

.field protected k:Z

.field private l:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/beizi/ad/internal/e;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Landroid/os/Handler;

.field private n:J

.field private o:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/beizi/ad/internal/a/b;->j:Ljava/util/HashMap;

    return-void
.end method

.method constructor <init>(Lcom/beizi/ad/internal/e;Lcom/beizi/ad/internal/a/a;Lcom/beizi/ad/internal/b;Lcom/beizi/ad/internal/j;Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/beizi/ad/internal/a/e;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/a/e;-><init>(Lcom/beizi/ad/internal/a/b;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/a/b;->e:Lcom/beizi/ad/internal/a/e;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->g:Z

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->h:Z

    .line 5
    iput-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->i:Z

    .line 6
    new-instance v1, Lcom/beizi/ad/internal/a/b$b;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/a/b$b;-><init>(Lcom/beizi/ad/internal/a/b;)V

    iput-object v1, p0, Lcom/beizi/ad/internal/a/b;->m:Landroid/os/Handler;

    const-wide/16 v1, -0x1

    .line 7
    iput-wide v1, p0, Lcom/beizi/ad/internal/a/b;->n:J

    iput-wide v1, p0, Lcom/beizi/ad/internal/a/b;->o:J

    .line 8
    iput-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->k:Z

    .line 9
    sget-object v0, Lcom/beizi/ad/internal/a/b;->j:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "1"

    const-string v1, "Baidu"

    .line 10
    invoke-virtual {p0, v0, v1}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "4"

    const-string v1, "GDT"

    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "43"

    const-string v1, "AFP"

    .line 12
    invoke-virtual {p0, v0, v1}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    :cond_0
    iput-object p5, p0, Lcom/beizi/ad/internal/a/b;->f:Lcom/beizi/ad/internal/network/ServerResponse;

    .line 14
    new-instance p5, Ljava/lang/ref/SoftReference;

    invoke-direct {p5, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object p5, p0, Lcom/beizi/ad/internal/a/b;->l:Ljava/lang/ref/SoftReference;

    .line 15
    iput-object p2, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    .line 16
    iput-object p3, p0, Lcom/beizi/ad/internal/a/b;->d:Lcom/beizi/ad/internal/b;

    .line 17
    iput-object p4, p0, Lcom/beizi/ad/internal/a/b;->a:Lcom/beizi/ad/internal/j;

    const/4 p1, -0x1

    if-nez p2, :cond_1

    .line 18
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget p3, Lcom/beizi/ad/R$string;->mediated_no_ads:I

    invoke-static {p3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x3

    goto :goto_0

    .line 19
    :cond_1
    invoke-direct {p0}, Lcom/beizi/ad/internal/a/b;->l()Z

    move-result p2

    if-nez p2, :cond_2

    const/4 p2, 0x2

    goto :goto_0

    :cond_2
    const/4 p2, -0x1

    :goto_0
    if-eq p2, p1, :cond_3

    .line 20
    invoke-virtual {p0, p2}, Lcom/beizi/ad/internal/a/b;->a(I)V

    :cond_3
    return-void
.end method

.method private a(Lcom/beizi/ad/internal/e;)J
    .locals 5

    if-eqz p1, :cond_0

    .line 27
    iget-wide v0, p0, Lcom/beizi/ad/internal/a/b;->o:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 28
    invoke-interface {p1, v0, v1}, Lcom/beizi/ad/internal/e;->a(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .line 14
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->mediation_instantiation_failure:I

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 19
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string v1, "Adding %s to invalid networks list"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/ad/internal/a/b;->a:Lcom/beizi/ad/internal/j;

    invoke-virtual {p1, v0, p2}, Lcom/beizi/ad/internal/g;->a(Lcom/beizi/ad/internal/j;Ljava/lang/String;)V

    :cond_0
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

    .line 7
    iget-boolean v0, v13, Lcom/beizi/ad/internal/a/b;->g:Z

    if-eqz v0, :cond_0

    return-void

    .line 8
    :cond_0
    iget-object v0, v13, Lcom/beizi/ad/internal/a/b;->l:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/beizi/ad/internal/e;

    .line 9
    iget-object v0, v13, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    const/4 v12, 0x0

    const/4 v10, -0x1

    if-eqz v0, :cond_5

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

    .line 10
    invoke-interface {v15}, Lcom/beizi/ad/internal/e;->b()Ljava/util/LinkedList;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 11
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

    .line 12
    :goto_1
    new-instance v0, Lcom/beizi/ad/internal/a/b$a;

    iget-object v1, v13, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    .line 13
    invoke-virtual {v1}, Lcom/beizi/ad/internal/a/a;->f()Ljava/lang/String;

    move-result-object v4

    iget-object v1, v13, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    .line 14
    invoke-virtual {v1}, Lcom/beizi/ad/internal/a/a;->g()Ljava/util/HashMap;

    move-result-object v6

    .line 15
    invoke-direct/range {p0 .. p0}, Lcom/beizi/ad/internal/a/b;->m()J

    move-result-wide v8

    invoke-direct {v13, v15}, Lcom/beizi/ad/internal/a/b;->a(Lcom/beizi/ad/internal/e;)J

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

    invoke-direct/range {v1 .. v12}, Lcom/beizi/ad/internal/a/b$a;-><init>(Lcom/beizi/ad/internal/a/b;Lcom/beizi/ad/internal/e;Ljava/lang/String;ILjava/util/HashMap;ZJJLcom/beizi/ad/internal/a/b$1;)V

    :try_start_0
    new-array v1, v13, [Ljava/lang/Void;

    .line 16
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 17
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

    .line 18
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Concurrent Thread Exception while firing ResultCB: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    if-eqz v16, :cond_4

    const/4 v1, -0x1

    if-eq v14, v1, :cond_4

    if-eqz v15, :cond_4

    const/4 v2, 0x0

    .line 21
    invoke-interface {v15, v2}, Lcom/beizi/ad/internal/e;->a(Lcom/beizi/ad/internal/network/ServerResponse;)V

    :cond_4
    return-void

    :cond_5
    :goto_3
    move-object v2, v12

    const/4 v1, -0x1

    if-ne v14, v1, :cond_6

    return-void

    .line 22
    :cond_6
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->fire_cb_result_null:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v15, :cond_7

    .line 23
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->fire_cb_requester_null:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 24
    :cond_7
    invoke-interface {v15, v2}, Lcom/beizi/ad/internal/e;->a(Lcom/beizi/ad/internal/network/ServerResponse;)V

    return-void
.end method

.method private l()Z
    .locals 7

    const-string v0, "."

    .line 1
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v2, Lcom/beizi/ad/R$string;->instantiating_class:I

    iget-object v3, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    .line 2
    invoke-virtual {v3}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/beizi/ad/internal/a/b;->a:Lcom/beizi/ad/internal/j;

    invoke-virtual {v3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 5
    sget-object v3, Lcom/beizi/ad/internal/a/b;->j:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 6
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v4

    iget-object v4, v4, Lcom/beizi/ad/internal/g;->e:Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 7
    invoke-static {v4}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    .line 8
    invoke-static {v3}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/b/b;

    iput-object v0, p0, Lcom/beizi/ad/internal/a/b;->b:Lcom/beizi/ad/b/b;

    goto :goto_1

    .line 10
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-array v3, v6, [Ljava/lang/Class;

    .line 11
    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v1

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v2, v3, v1

    .line 12
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/b/b;

    iput-object v0, p0, Lcom/beizi/ad/internal/a/b;->b:Lcom/beizi/ad/b/b;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return v6

    :catch_0
    move-exception v0

    .line 13
    iget-object v2, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    move-exception v0

    .line 14
    iget-object v2, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :catch_2
    move-exception v0

    .line 15
    iget-object v2, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :catch_3
    move-exception v0

    .line 16
    iget-object v2, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :catch_4
    move-exception v0

    .line 17
    iget-object v2, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :catch_5
    move-exception v0

    .line 18
    iget-object v2, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :catch_6
    move-exception v0

    .line 19
    iget-object v2, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    invoke-virtual {v2}, Lcom/beizi/ad/internal/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/beizi/ad/internal/a/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_2
    return v1
.end method

.method private m()J
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/beizi/ad/internal/a/b;->n:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-wide v4, p0, Lcom/beizi/ad/internal/a/b;->o:J

    cmp-long v6, v4, v2

    if-lez v6, :cond_0

    sub-long/2addr v4, v0

    return-wide v4

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method


# virtual methods
.method protected a()Lcom/beizi/ad/b/a;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/a/b;->l:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/e;

    if-eqz v0, :cond_0

    .line 13
    invoke-interface {v0}, Lcom/beizi/ad/internal/e;->d()Lcom/beizi/ad/b/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(I)V
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->h:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->g:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->i:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/ad/internal/a/b;->h()V

    .line 23
    invoke-virtual {p0}, Lcom/beizi/ad/internal/a/b;->f()V

    .line 24
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/a/b;->b(I)V

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcom/beizi/ad/internal/a/b;->g:Z

    .line 26
    invoke-virtual {p0}, Lcom/beizi/ad/internal/a/b;->b()V

    :cond_1
    :goto_0
    return-void
.end method

.method a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/a/b;->j:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".SPLASH"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Splash"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/a/b;->j:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".BANNER"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Banner"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    sget-object v0, Lcom/beizi/ad/internal/a/b;->j:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".INTERSTITIAL"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Interstitial"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget-object v0, Lcom/beizi/ad/internal/a/b;->j:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".NATIVE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "Native"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object v0, Lcom/beizi/ad/internal/a/b;->j:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".REWARDEDVIDEO"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/beizi/ad/internal/a/b;->k:Z

    if-eqz p1, :cond_0

    .line 30
    invoke-virtual {p0}, Lcom/beizi/ad/internal/a/b;->b()V

    :cond_0
    return-void
.end method

.method a(Ljava/lang/Class;)Z
    .locals 3

    .line 6
    iget-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->g:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/a/b;->b:Lcom/beizi/ad/b/b;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    .line 8
    :cond_2
    :goto_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v2, Lcom/beizi/ad/R$string;->instance_exception:I

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string p1, "null"

    .line 10
    :goto_1
    invoke-static {v2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x3

    .line 11
    invoke-virtual {p0, p1}, Lcom/beizi/ad/internal/a/b;->a(I)V

    return v1
.end method

.method protected b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/a/b;->b:Lcom/beizi/ad/b/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/b/b;->b()V

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->i:Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/beizi/ad/internal/a/b;->b:Lcom/beizi/ad/b/b;

    .line 5
    iput-object v0, p0, Lcom/beizi/ad/internal/a/b;->c:Lcom/beizi/ad/internal/a/a;

    .line 6
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->mediationLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->mediation_finish:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public abstract c()V
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->i:Z

    return v0
.end method

.method e()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->h:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/ad/internal/a/b;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/a/b;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    :goto_0
    return-void
.end method

.method f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/a/b;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method protected g()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/ad/internal/a/b;->n:J

    return-void
.end method

.method protected h()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/ad/internal/a/b;->o:J

    return-void
.end method

.method public abstract i()V
.end method

.method public abstract j()V
.end method

.method public abstract k()V
.end method
