.class final Lcom/kwad/sdk/kgeo/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/request/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/kgeo/a;->dC(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final qP()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/request/b;->qN()Lcom/kwad/components/core/request/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/request/b;->b(Lcom/kwad/components/core/request/b$a;)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/kgeo/a;->qT()V

    return-void
.end method
