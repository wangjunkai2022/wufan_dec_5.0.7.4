.class public final Lcom/kwad/components/ad/reward/d;
.super Lcom/kwad/components/ad/l/b;
.source "SourceFile"


# instance fields
.field private oB:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;"
        }
    .end annotation
.end field

.field private oC:Z

.field private oD:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/e/d/c;",
            ">;"
        }
    .end annotation
.end field

.field private oE:Lcom/kwad/components/core/webview/jshandler/w$b;


# direct methods
.method public constructor <init>(Ljava/util/List;Lorg/json/JSONObject;Lcom/kwad/components/core/webview/jshandler/w$b;)V
    .locals 1
    .param p2    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;",
            "Lorg/json/JSONObject;",
            "Lcom/kwad/components/core/webview/jshandler/w$b;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p2, v0}, Lcom/kwad/components/ad/l/b;-><init>(Lorg/json/JSONObject;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/d;->oC:Z

    .line 3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/kwad/components/ad/reward/d;->oD:Ljava/util/List;

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/reward/d;->oB:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/kwad/components/ad/reward/d;->oE:Lcom/kwad/components/core/webview/jshandler/w$b;

    if-eqz p1, :cond_0

    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/d;->oB:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    new-instance p3, Lcom/kwad/components/core/e/d/c;

    invoke-direct {p3, p2}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 9
    iget-object p2, p0, Lcom/kwad/components/ad/reward/d;->oD:Ljava/util/List;

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/d;->oB:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/d;->oB:Ljava/util/List;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->cq(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/kwad/components/ad/l/b;->B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;I)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/kwad/components/ad/reward/d;->oB:Ljava/util/List;

    iget-object p4, p0, Lcom/kwad/components/ad/reward/d;->oD:Ljava/util/List;

    invoke-super {p0, p1, p2, p3, p4}, Lcom/kwad/components/ad/l/b;->a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/a;)V
    .locals 4

    .line 2
    invoke-super {p0, p1}, Lcom/kwad/components/ad/l/b;->a(Lcom/kwad/components/core/webview/a;)V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/d;->oB:Ljava/util/List;

    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v1, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 5
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/w;

    invoke-direct {v1, v0}, Lcom/kwad/components/core/webview/jshandler/w;-><init>(Ljava/util/List;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/d;->oE:Lcom/kwad/components/core/webview/jshandler/w$b;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/webview/jshandler/w;->a(Lcom/kwad/components/core/webview/jshandler/w$b;)V

    .line 7
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/webview/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/d;->oB:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/webview/b;->setAdTemplateList(Ljava/util/List;)V

    return-void
.end method

.method public final bx()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/d;->oC:Z

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/ad/l/b;->In:Z

    return v0

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/kwad/components/ad/l/b;->bx()Z

    move-result v0

    return v0
.end method

.method public final fk()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/l/b;->fk()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cL:Lcom/kwad/sdk/core/webview/KsAdWebView;

    new-instance v1, Lcom/kwad/components/ad/reward/d$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/d$1;-><init>(Lcom/kwad/components/ad/reward/d;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final fl()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final fm()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->cQ:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    :cond_0
    return-void
.end method

.method public final fn()V
    .locals 2

    const/4 v0, 0x1

    const-string v1, "middle_play_end_card"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLjava/lang/String;)V

    return-void
.end method

.method public final fo()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p0, v0}, Lcom/kwad/components/ad/reward/d;->B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const-string v3, "middle_play_end_card"

    invoke-static {v0, v2, v3, v1}, Lcom/kwad/components/ad/reward/monitor/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final fp()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p0, v0}, Lcom/kwad/components/ad/reward/d;->B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/kwad/components/ad/l/b;->getLoadTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const/4 v3, 0x1

    const-string v4, "middle_play_end_card"

    .line 3
    invoke-static {v3, v4, v0, v1, v2}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLjava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MiddlePlayEndCard"

    return-object v0
.end method

.method public final setShowLandingPage(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/d;->oC:Z

    return-void
.end method
