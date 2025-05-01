.class final Lcom/kwad/components/core/c/m$1$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/c/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/c/m$1$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ka:Lcom/kwad/components/core/c/m$1$2;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/c/m$1$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/c/m$1$2$1;->Ka:Lcom/kwad/components/core/c/m$1$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final nn()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/c/m$1$2$1;->Ka:Lcom/kwad/components/core/c/m$1$2;

    iget-object v1, v0, Lcom/kwad/components/core/c/m$1$2;->JV:Lcom/kwad/components/core/c/m$1;

    iget-object v1, v1, Lcom/kwad/components/core/c/m$1;->bB:Lcom/kwad/components/core/request/model/a;

    iget v2, v0, Lcom/kwad/components/core/c/m$1$2;->JY:I

    iget-object v0, v0, Lcom/kwad/components/core/c/m$1$2;->JZ:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;ILjava/lang/String;Z)V

    return-void
.end method
