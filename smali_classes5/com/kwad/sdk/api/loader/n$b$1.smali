.class final Lcom/kwad/sdk/api/loader/n$b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/api/loader/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/api/loader/n$b;->a(Lcom/kwad/sdk/api/loader/v;Lcom/kwad/sdk/api/loader/n$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aoe:Lcom/kwad/sdk/api/loader/n$c;

.field final synthetic aof:Lcom/kwad/sdk/api/loader/v;

.field final synthetic aog:Lcom/kwad/sdk/api/loader/n$b;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/api/loader/n$b;Lcom/kwad/sdk/api/loader/n$c;Lcom/kwad/sdk/api/loader/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/n$b$1;->aog:Lcom/kwad/sdk/api/loader/n$b;

    iput-object p2, p0, Lcom/kwad/sdk/api/loader/n$b$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    iput-object p3, p0, Lcom/kwad/sdk/api/loader/n$b$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/api/loader/a$b;)V
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Lcom/kwad/sdk/api/loader/a$b;->AK()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/api/loader/n$b$1;->aoe:Lcom/kwad/sdk/api/loader/n$c;

    iget-object p1, p1, Lcom/kwad/sdk/api/loader/a$b;->anc:Lcom/kwad/sdk/api/loader/a$a;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/api/loader/n$c;->i(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "UpdateData is illegal"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 5
    :goto_0
    :try_start_0
    iget-object p1, p0, Lcom/kwad/sdk/api/loader/n$b$1;->aof:Lcom/kwad/sdk/api/loader/v;

    invoke-interface {p1}, Lcom/kwad/sdk/api/loader/v;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/api/loader/e;->aL(Landroid/content/Context;)Lcom/kwad/sdk/api/loader/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/sdk/api/loader/e;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
