.class final Lcom/kwad/components/core/e/d/e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/e/d/e;->a(Lcom/kwad/sdk/commercial/smallApp/JumpFrom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic LL:Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

.field final synthetic LM:Ljava/lang/String;

.field final synthetic LN:Ljava/lang/String;

.field final synthetic LO:Ljava/lang/String;

.field final synthetic gE:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/smallApp/JumpFrom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/e$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object p2, p0, Lcom/kwad/components/core/e/d/e$1;->LL:Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    iput-object p3, p0, Lcom/kwad/components/core/e/d/e$1;->LM:Ljava/lang/String;

    iput-object p4, p0, Lcom/kwad/components/core/e/d/e$1;->LN:Ljava/lang/String;

    iput-object p5, p0, Lcom/kwad/components/core/e/d/e$1;->LO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/kwad/components/core/e/d/e;->aB(Z)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    invoke-static {}, Lcom/kwad/sdk/core/c/b;->isAppOnForeground()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/d/e$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/core/e/d/e$1;->LL:Lcom/kwad/sdk/commercial/smallApp/JumpFrom;

    iget-object v2, p0, Lcom/kwad/components/core/e/d/e$1;->LM:Ljava/lang/String;

    iget-object v3, p0, Lcom/kwad/components/core/e/d/e$1;->LN:Ljava/lang/String;

    iget-object v4, p0, Lcom/kwad/components/core/e/d/e$1;->LO:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/kwad/sdk/commercial/smallApp/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/commercial/smallApp/JumpFrom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/e/d/e$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x1

    const-string v2, "wxsmallapp"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/core/adlog/c;->c(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method
