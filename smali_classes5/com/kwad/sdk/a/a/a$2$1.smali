.class final Lcom/kwad/sdk/a/a/a$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/utils/al$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/a/a/a$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ams:Lcom/kwad/sdk/a/a/a$2;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/a/a/a$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/a/a/a$2$1;->ams:Lcom/kwad/sdk/a/a/a$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/a/a/a$2$1;->ams:Lcom/kwad/sdk/a/a/a$2;

    iget-object v0, v0, Lcom/kwad/sdk/a/a/a$2;->amr:Lcom/kwad/sdk/a/a/a;

    invoke-static {v0}, Lcom/kwad/sdk/a/a/a;->b(Lcom/kwad/sdk/a/a/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 2
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const v1, 0x186a3

    .line 3
    invoke-static {v0, v1, p1}, Lcom/kwad/sdk/commercial/a/a;->i(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    return-void
.end method

.method public final oK()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/a/a/a$2$1;->ams:Lcom/kwad/sdk/a/a/a$2;

    iget-object v0, v0, Lcom/kwad/sdk/a/a/a$2;->amr:Lcom/kwad/sdk/a/a/a;

    invoke-static {v0}, Lcom/kwad/sdk/a/a/a;->b(Lcom/kwad/sdk/a/a/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->h(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/a/a/a$2$1;->ams:Lcom/kwad/sdk/a/a/a$2;

    iget-object v0, v0, Lcom/kwad/sdk/a/a/a$2;->amr:Lcom/kwad/sdk/a/a/a;

    invoke-static {v0}, Lcom/kwad/sdk/a/a/a;->b(Lcom/kwad/sdk/a/a/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/commercial/a/a;->aZ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method
