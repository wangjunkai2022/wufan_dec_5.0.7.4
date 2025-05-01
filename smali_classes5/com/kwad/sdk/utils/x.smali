.class public final Lcom/kwad/sdk/utils/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aQj:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static volatile aQk:Z

.field private static volatile aQl:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/kwad/sdk/utils/x;->aQj:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    sput-boolean v1, Lcom/kwad/sdk/utils/x;->aQk:Z

    return-void
.end method

.method private static Ma()I
    .locals 4

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-string v1, "Ks_UnionHelper"

    if-nez v0, :cond_0

    const-string v0, "sdkConfigProvider == null"

    .line 2
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    .line 3
    :cond_0
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zt()I

    move-result v0

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "config mode:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method private static Mb()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/utils/x;->aQk:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lcom/kwad/sdk/utils/x;->aQj:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {}, Lcom/kwad/sdk/utils/x;->Me()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const/4 v0, 0x0

    const-string v1, "kssdk_kv_mode"

    const-string v2, "downgrade"

    .line 3
    invoke-static {v1, v2, v0}, Lcom/kwad/sdk/utils/bg;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/kwad/sdk/utils/x;->aQl:Z

    const/4 v0, 0x1

    .line 4
    sput-boolean v0, Lcom/kwad/sdk/utils/x;->aQk:Z

    return-void
.end method

.method public static Mc()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Ma()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    new-instance v0, Lcom/kwad/sdk/utils/x$3;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/x$3;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static Md()Lcom/kwad/sdk/utils/b/a;
    .locals 7
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/b/a;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/b/a;-><init>()V

    const-string v1, "ksadsdk_kv_perf"

    .line 2
    invoke-static {v1}, Lcom/kwad/sdk/utils/bg;->gY(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 3
    :cond_0
    :try_start_0
    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_1

    return-object v2

    .line 4
    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 5
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/2addr v5, v6

    goto :goto_0

    .line 6
    :cond_2
    iput v5, v0, Lcom/kwad/sdk/utils/b/a;->aTq:I

    .line 7
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 8
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 9
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    .line 10
    :cond_3
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 11
    invoke-static {v0}, Lcom/kwad/sdk/utils/x;->d(Lcom/kwad/sdk/utils/b/a;)V

    .line 12
    invoke-static {v0}, Lcom/kwad/sdk/utils/x;->e(Lcom/kwad/sdk/utils/b/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object v0
.end method

.method private static Me()I
    .locals 3

    const-string v0, "kssdk_kv_mode"

    const-string v1, "mode"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bg;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "local mode:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Ks_UnionHelper"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public static Mf()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mb()V

    .line 2
    sget-object v0, Lcom/kwad/sdk/utils/x;->aQj:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static Mg()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static Mh()I
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mb()V

    .line 2
    sget-boolean v0, Lcom/kwad/sdk/utils/x;->aQl:Z

    if-nez v0, :cond_1

    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mg()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Ma()I

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 4
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "targetMode:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Ks_UnionHelper"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public static Mi()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mb()V

    .line 2
    sget-object v0, Lcom/kwad/sdk/utils/x;->aQj:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mh()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "needTransfer:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Ks_UnionHelper"

    invoke-static {v3, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 5
    invoke-static {v1}, Lcom/kwad/sdk/utils/x;->transfer(I)V

    :cond_1
    return-void
.end method

.method private static Mj()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/x$4;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/x$4;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static Mk()V
    .locals 2

    const-string v0, "Ks_UnionHelper"

    const-string v1, "transferToKv"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/kwad/sdk/utils/x$5;

    invoke-direct {v0}, Lcom/kwad/sdk/utils/x$5;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic Ml()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/x;->aQj:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method private static Q(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    const-string v0, "ksadsdk_splash_preload_id_list"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "kv_to_sp_transfer_flag"

    const-string v2, "sp_to_kv_transfer_flag"

    if-eqz v0, :cond_1

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/utils/bg;->gY(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 5
    invoke-interface {p0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void

    .line 6
    :cond_1
    invoke-virtual {p0, v2}, Lcom/kwad/sdk/utils/a/c;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/utils/bg;->gY(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    .line 8
    invoke-virtual {p0, v2, v3}, Lcom/kwad/sdk/utils/a/c;->putBoolean(Ljava/lang/String;Z)V

    return-void

    .line 9
    :cond_2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/utils/a/c;->putAll(Ljava/util/Map;)V

    .line 11
    invoke-virtual {p0, v2, v3}, Lcom/kwad/sdk/utils/a/c;->putBoolean(Ljava/lang/String;Z)V

    .line 12
    invoke-static {p1, v1}, Lcom/kwad/sdk/utils/bg;->aw(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-static {p1, p0}, Lcom/kwad/sdk/utils/x;->a(Ljava/lang/String;Lcom/kwad/sdk/utils/a/c;)V

    :cond_3
    return-void
.end method

.method private static R(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/utils/bg;->gY(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "ksadsdk_splash_preload_id_list"

    .line 2
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "sp_to_kv_transfer_flag"

    const-string v3, "kv_to_sp_transfer_flag"

    if-eqz v1, :cond_2

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 4
    invoke-interface {p0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    return-void

    .line 5
    :cond_2
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 6
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/kwad/sdk/utils/a/c;->getAll()Ljava/util/Map;

    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    .line 9
    invoke-static {p1, v3, v4}, Lcom/kwad/sdk/utils/bg;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    .line 10
    :cond_3
    invoke-static {p1, v0}, Lcom/kwad/sdk/utils/bg;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 11
    invoke-static {p1, v3, v4}, Lcom/kwad/sdk/utils/bg;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 12
    invoke-virtual {p0, v2}, Lcom/kwad/sdk/utils/a/c;->remove(Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Lcom/kwad/sdk/utils/a/c;->release()V

    :cond_4
    return-void
.end method

.method static synthetic S(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/x;->R(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic T(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/x;->Q(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private static a(Ljava/lang/String;Lcom/kwad/sdk/utils/a/c;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/i$a;->alD:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/kwad/sdk/utils/a/c;->release()V

    :cond_0
    return-void
.end method

.method public static ar(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/x$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/utils/x$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static as(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/utils/x$2;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/utils/x$2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static c(Lcom/kwad/sdk/utils/b/a;)V
    .locals 5
    .param p0    # Lcom/kwad/sdk/utils/b/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/kwad/sdk/utils/b/a;->aTr:I

    int-to-double v1, v0

    iget p0, p0, Lcom/kwad/sdk/utils/b/a;->aTs:I

    add-int/2addr v0, p0

    int-to-double v3, v0

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v1, v3

    const-wide v3, 0x3fb99999a0000000L    # 0.10000000149011612

    cmpl-double p0, v1, v3

    if-lez p0, :cond_0

    const/4 p0, 0x1

    .line 2
    sput-boolean p0, Lcom/kwad/sdk/utils/x;->aQl:Z

    const-string v0, "Ks_UnionHelper"

    const-string v1, "need downgrade"

    .line 3
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "kssdk_kv_mode"

    const-string v1, "downgrade"

    .line 4
    invoke-static {v0, v1, p0}, Lcom/kwad/sdk/utils/bg;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 5
    :cond_0
    sget-boolean p0, Lcom/kwad/sdk/utils/x;->aQl:Z

    if-eqz p0, :cond_1

    .line 6
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mi()V

    :cond_1
    return-void
.end method

.method private static d(Lcom/kwad/sdk/utils/b/a;)V
    .locals 4

    const-string v0, "ksadsdk_kv_perf_failed"

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/bg;->gY(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_0

    .line 5
    :cond_0
    iput v1, p0, Lcom/kwad/sdk/utils/b/a;->aTr:I

    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    .line 7
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    .line 9
    :cond_1
    iput v1, p0, Lcom/kwad/sdk/utils/b/a;->aTr:I

    return-void
.end method

.method static dZ(I)V
    .locals 2

    const-string v0, "kssdk_kv_mode"

    const-string v1, "mode"

    .line 1
    invoke-static {v0, v1, p0}, Lcom/kwad/sdk/utils/bg;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private static e(Lcom/kwad/sdk/utils/b/a;)V
    .locals 4

    const-string v0, "ksadsdk_kv_perf_success"

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/bg;->gY(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_0

    .line 5
    :cond_0
    iput v1, p0, Lcom/kwad/sdk/utils/b/a;->aTs:I

    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    .line 7
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    .line 9
    :cond_1
    iput v1, p0, Lcom/kwad/sdk/utils/b/a;->aTs:I

    return-void
.end method

.method static synthetic f(Lcom/kwad/sdk/utils/b/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/x;->c(Lcom/kwad/sdk/utils/b/a;)V

    return-void
.end method

.method private static transfer(I)V
    .locals 1

    if-nez p0, :cond_0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mj()V

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mk()V

    :cond_1
    return-void
.end method
