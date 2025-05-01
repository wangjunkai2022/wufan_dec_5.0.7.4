.class final Lcom/kwad/components/ad/i/c$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/b/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/i/c;->eO()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nU:Lcom/kwad/components/ad/i/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/i/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/i/c$3;->nU:Lcom/kwad/components/ad/i/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final T()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/y;->aM(J)V

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/i/e;->eW()Lcom/kwad/components/ad/i/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/i/e;->eS()V

    return-void
.end method

.method public final U()V
    .locals 2

    const-string v0, "PushAdManager"

    const-string v1, "onAdClose: "

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/i/e;->eW()Lcom/kwad/components/ad/i/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/i/e;->eU()V

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/i/b;->eJ()Lcom/kwad/components/ad/i/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/i/c$3;->nU:Lcom/kwad/components/ad/i/c;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/i/b;->a(Lcom/kwad/components/ad/i/c;)V

    return-void
.end method
