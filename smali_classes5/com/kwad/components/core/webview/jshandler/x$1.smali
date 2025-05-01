.class final Lcom/kwad/components/core/webview/jshandler/x$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/x;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Xi:Lcom/kwad/sdk/core/webview/d/b/a;

.field final synthetic Xj:Lcom/kwad/components/core/webview/jshandler/x;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/x;Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v0, v0, Lcom/kwad/components/core/webview/jshandler/x;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-boolean v1, v0, Lcom/kwad/sdk/core/webview/b;->aEZ:Z

    if-nez v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-object v2, v1, Lcom/kwad/sdk/core/webview/d/b/a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v2, :cond_1

    .line 3
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    invoke-direct {v0, v2}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/x;->a(Lcom/kwad/components/core/webview/jshandler/x;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5
    :cond_1
    iget-wide v1, v1, Lcom/kwad/sdk/core/webview/d/b/a;->creativeId:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/b;->Hw()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-wide v2, v1, Lcom/kwad/sdk/core/webview/d/b/a;->creativeId:J

    iget v1, v1, Lcom/kwad/sdk/core/webview/d/b/a;->adStyle:I

    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/core/response/b/e;->a(Ljava/util/List;JI)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->ec(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v3

    iput-wide v3, v0, Lcom/kwad/sdk/core/webview/d/b/a;->creativeId:J

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->dN(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/core/webview/d/b/a;->adStyle:I

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-wide v3, v1, Lcom/kwad/sdk/core/webview/d/b/a;->creativeId:J

    invoke-virtual {v0, v3, v4}, Lcom/kwad/components/core/webview/jshandler/x;->J(J)Lcom/kwad/components/core/e/d/c;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/x;->b(Lcom/kwad/components/core/webview/jshandler/x;)Landroid/content/DialogInterface$OnDismissListener;

    move-result-object v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    .line 12
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/x;->b(Lcom/kwad/components/core/webview/jshandler/x;)Landroid/content/DialogInterface$OnDismissListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/c;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_3
    const/4 v1, 0x0

    .line 13
    iget-object v3, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-object v3, v3, Lcom/kwad/sdk/core/webview/d/b/a;->Lt:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 14
    :try_start_0
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-object v1, v1, Lcom/kwad/sdk/core/webview/d/b/a;->Lt:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 15
    invoke-static {v3, v4}, Lcom/kwad/components/core/e/b/a;->t(J)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 16
    :catch_0
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-object v1, v1, Lcom/kwad/sdk/core/webview/d/b/a;->Lt:Ljava/lang/String;

    goto :goto_1

    :cond_4
    if-eqz v2, :cond_5

    .line 17
    iget-object v3, v2, Lcom/kwad/sdk/core/response/model/AdTemplate;->tkLiveShopItemInfo:Lcom/kwad/sdk/core/response/model/TKAdLiveShopItemInfo;

    if-eqz v3, :cond_5

    .line 18
    iget-object v1, v3, Lcom/kwad/sdk/core/response/model/TKAdLiveShopItemInfo;->itemId:Ljava/lang/String;

    .line 19
    :cond_5
    :goto_1
    new-instance v3, Lcom/kwad/components/core/e/d/a$a;

    iget-object v4, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v4, v4, Lcom/kwad/components/core/webview/jshandler/x;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v4, v4, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    .line 20
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-virtual {v3, v2}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v3

    .line 22
    invoke-virtual {v3, v0}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 23
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ag(Ljava/lang/String;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v3, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    .line 24
    invoke-static {v1, v3}, Lcom/kwad/components/core/webview/jshandler/x;->a(Lcom/kwad/components/core/webview/jshandler/x;Lcom/kwad/sdk/core/webview/d/b/a;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    .line 25
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/x;->h(Lcom/kwad/components/core/webview/jshandler/x;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ap(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, v1, Lcom/kwad/components/core/webview/jshandler/x;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v1, v1, Lcom/kwad/sdk/core/webview/b;->mReportExtData:Lorg/json/JSONObject;

    .line 26
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->c(Lorg/json/JSONObject;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget v1, v1, Lcom/kwad/sdk/core/webview/d/b/a;->Yn:I

    .line 27
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget v1, v1, Lcom/kwad/sdk/core/webview/d/b/a;->aGa:I

    .line 28
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->al(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget v1, v1, Lcom/kwad/sdk/core/webview/d/b/a;->kl:I

    .line 29
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    .line 30
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/x;->g(Lcom/kwad/components/core/webview/jshandler/x;)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    iget-boolean v1, v1, Lcom/kwad/sdk/core/webview/d/b/a;->Lf:Z

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v1, 0x0

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v1, 0x1

    :goto_3
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->aq(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    .line 31
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/x;->f(Lcom/kwad/components/core/webview/jshandler/x;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ar(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    .line 32
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/x;->e(Lcom/kwad/components/core/webview/jshandler/x;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->al(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    .line 33
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/x;->d(Lcom/kwad/components/core/webview/jshandler/x;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->as(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 34
    invoke-virtual {v0, v3}, Lcom/kwad/components/core/e/d/a$a;->aw(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/webview/jshandler/x$1$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/jshandler/x$1$1;-><init>(Lcom/kwad/components/core/webview/jshandler/x$1;)V

    .line 35
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v3, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xi:Lcom/kwad/sdk/core/webview/d/b/a;

    invoke-virtual {v1, v0, v3, v2}, Lcom/kwad/components/core/webview/jshandler/x;->a(Lcom/kwad/components/core/e/d/a$a;Lcom/kwad/sdk/core/webview/d/b/a;Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    move-result v0

    .line 38
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/x$1;->Xj:Lcom/kwad/components/core/webview/jshandler/x;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/webview/jshandler/x;->K(I)V

    return-void
.end method
