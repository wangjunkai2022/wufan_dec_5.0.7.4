.class final Lcom/kwad/sdk/a/a/c$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/a/a/c;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic amH:Lcom/kwad/sdk/a/a/c;

.field final synthetic amI:Z

.field final synthetic gE:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/a/a/c;ZLcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/a/a/c$3;->amH:Lcom/kwad/sdk/a/a/c;

    iput-boolean p2, p0, Lcom/kwad/sdk/a/a/c$3;->amI:Z

    iput-object p3, p0, Lcom/kwad/sdk/a/a/c$3;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cx()I

    move-result v0

    .line 2
    iget-boolean v1, p0, Lcom/kwad/sdk/a/a/c$3;->amI:Z

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/sdk/a/a/c$3;->amH:Lcom/kwad/sdk/a/a/c;

    iget-object v1, p0, Lcom/kwad/sdk/a/a/c$3;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v2, 0x0

    new-instance v3, Lcom/kwad/sdk/a/a/c$3$1;

    invoke-direct {v3, p0}, Lcom/kwad/sdk/a/a/c$3$1;-><init>(Lcom/kwad/sdk/a/a/c$3;)V

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/a/a/c;->a(Lcom/kwad/sdk/a/a/c;Lcom/kwad/sdk/core/response/model/AdTemplate;Landroid/content/DialogInterface$OnDismissListener;Landroid/content/DialogInterface$OnClickListener;)V

    return-void

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/kwad/sdk/a/a/c$3;->amH:Lcom/kwad/sdk/a/a/c;

    iget-object v3, p0, Lcom/kwad/sdk/a/a/c$3;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v4, 0x0

    invoke-static {v2, v3, v1, v0, v4}, Lcom/kwad/sdk/a/a/c;->a(Lcom/kwad/sdk/a/a/c;Lcom/kwad/sdk/core/response/model/AdTemplate;ZIZ)V

    return-void
.end method
