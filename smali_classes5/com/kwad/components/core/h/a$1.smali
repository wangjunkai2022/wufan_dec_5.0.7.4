.class final Lcom/kwad/components/core/h/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/h/a;->aj(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Mt:J

.field final synthetic Mu:Lcom/kwad/components/core/h/a;

.field final synthetic gq:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/h/a;Landroid/content/Context;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/h/a$1;->Mu:Lcom/kwad/components/core/h/a;

    iput-object p2, p0, Lcom/kwad/components/core/h/a$1;->gq:Landroid/content/Context;

    iput-wide p3, p0, Lcom/kwad/components/core/h/a$1;->Mt:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/h/a$1;->Mu:Lcom/kwad/components/core/h/a;

    iget-object v1, p0, Lcom/kwad/components/core/h/a$1;->gq:Landroid/content/Context;

    iget-wide v2, p0, Lcom/kwad/components/core/h/a$1;->Mt:J

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/core/h/a;->a(Lcom/kwad/components/core/h/a;Landroid/content/Context;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method
