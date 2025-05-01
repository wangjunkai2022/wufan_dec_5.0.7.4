.class final Lcom/kwad/components/core/n/b/a/i$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/NetworkMonitor$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/n/b/a/i;->ao(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Nq:Lcom/kwad/components/core/n/b/a/i;

.field final synthetic gq:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/n/b/a/i;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/b/a/i$1;->Nq:Lcom/kwad/components/core/n/b/a/i;

    iput-object p2, p0, Lcom/kwad/components/core/n/b/a/i$1;->gq:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/NetworkMonitor$NetworkState;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/kwad/components/core/n/b/a/i$1$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/n/b/a/i$1$1;-><init>(Lcom/kwad/components/core/n/b/a/i$1;)V

    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
