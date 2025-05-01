.class public Lcom/kwad/sdk/core/report/q;
.super Lcom/kwad/sdk/core/report/d;
.source "SourceFile"


# static fields
.field private static volatile aAh:Lcom/kwad/sdk/core/report/q;


# instance fields
.field private aAi:Lcom/kwad/sdk/core/report/o;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/report/p;

    sget v1, Lcom/kwad/sdk/core/report/p;->Jr:I

    invoke-direct {v0, p1, v1}, Lcom/kwad/sdk/core/report/p;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/report/d;-><init>(Lcom/kwad/sdk/core/report/c;)V

    .line 2
    new-instance p1, Lcom/kwad/sdk/core/report/i;

    invoke-direct {p1}, Lcom/kwad/sdk/core/report/i;-><init>()V

    iput-object p1, p0, Lcom/kwad/sdk/core/report/q;->aAi:Lcom/kwad/sdk/core/report/o;

    return-void
.end method

.method public static bs(Landroid/content/Context;)Lcom/kwad/sdk/core/report/q;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/report/q;->aAh:Lcom/kwad/sdk/core/report/q;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/sdk/core/report/q;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/sdk/core/report/q;->aAh:Lcom/kwad/sdk/core/report/q;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/sdk/core/report/q;

    invoke-direct {v1, p0}, Lcom/kwad/sdk/core/report/q;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/kwad/sdk/core/report/q;->aAh:Lcom/kwad/sdk/core/report/q;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 6
    :cond_1
    :goto_0
    sget-object p0, Lcom/kwad/sdk/core/report/q;->aAh:Lcom/kwad/sdk/core/report/q;

    return-object p0
.end method

.method private declared-synchronized h(Landroid/database/Cursor;)Lcom/kwad/sdk/core/report/n;
    .locals 2
    .param p1    # Landroid/database/Cursor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 3
    const-class v1, Lcom/kwad/sdk/service/a/h;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v1}, Lcom/kwad/sdk/service/a/h;->zy()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/core/report/q;->aAi:Lcom/kwad/sdk/core/report/o;

    invoke-interface {v1, p1, v0}, Lcom/kwad/sdk/core/report/o;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    .line 5
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/kwad/sdk/core/report/q;->aAi:Lcom/kwad/sdk/core/report/o;

    invoke-interface {v1, p1, v0}, Lcom/kwad/sdk/core/report/o;->Z(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method protected final Fq()Ljava/lang/String;
    .locals 1

    const-string v0, "ksad_actions"

    return-object v0
.end method

.method protected final Fr()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "select aLog, actionId from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/kwad/sdk/core/report/q;->Fq()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic g(Landroid/database/Cursor;)Lcom/kwad/sdk/core/report/e;
    .locals 0
    .param p1    # Landroid/database/Cursor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/core/report/q;->h(Landroid/database/Cursor;)Lcom/kwad/sdk/core/report/n;

    move-result-object p1

    return-object p1
.end method

.method protected final getTag()Ljava/lang/String;
    .locals 1

    const-string v0, "ReportActionDBManager"

    return-object v0
.end method
