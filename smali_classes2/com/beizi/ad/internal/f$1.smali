.class Lcom/beizi/ad/internal/f$1;
.super Ljava/lang/Object;
.source "AdViewRequestManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/f;->a(Lcom/beizi/ad/internal/network/ServerResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/network/ServerResponse;

.field final synthetic b:Lcom/beizi/ad/internal/view/AdViewImpl;

.field final synthetic c:Lcom/beizi/ad/internal/f;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/network/ServerResponse;Lcom/beizi/ad/internal/view/AdViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iput-object p2, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    iput-object p3, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->containsAds()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v3, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/l;->b()Ljava/util/LinkedList;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    invoke-virtual {v3}, Lcom/beizi/ad/internal/l;->b()Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v1, 0x1

    .line 3
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, "====="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    .line 4
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->response_no_ads:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/beizi/ad/internal/b;->a(I)V

    return-void

    .line 6
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMediaType:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v3}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v1}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v1

    sget-object v3, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 8
    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    check-cast v1, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    .line 9
    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->resetContainerIfNeeded()V

    :cond_3
    if-eqz v0, :cond_4

    .line 10
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/network/ServerResponse;->getMediationAds()Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/l;->a(Ljava/util/LinkedList;)V

    .line 11
    :cond_4
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/l;->b()Ljava/util/LinkedList;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/l;->b()Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/l;->i()Lcom/beizi/ad/internal/a/a;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    if-eqz v0, :cond_5

    .line 14
    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getExtras()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/beizi/ad/internal/a/a;->a(Ljava/util/HashMap;)V

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v0}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 16
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 17
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/app/Activity;

    iget-object v5, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 18
    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v7

    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 19
    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getSplashParent()Landroid/view/ViewGroup;

    move-result-object v8

    iget-object v9, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    .line 20
    invoke-static/range {v4 .. v9}, Lcom/beizi/ad/internal/a/h;->a(Landroid/app/Activity;Lcom/beizi/ad/internal/e;Lcom/beizi/ad/internal/a/a;Lcom/beizi/ad/internal/b;Landroid/view/ViewGroup;Lcom/beizi/ad/internal/network/ServerResponse;)Lcom/beizi/ad/internal/a/h;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/f;->a(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/a/b;)Lcom/beizi/ad/internal/a/b;

    goto :goto_1

    .line 21
    :cond_6
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v0}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 22
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 23
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    iget-object v2, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iget-object v3, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 24
    invoke-virtual {v3}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v3

    iget-object v4, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    .line 25
    invoke-static {v1, v2, v6, v3, v4}, Lcom/beizi/ad/internal/a/c;->a(Landroid/app/Activity;Lcom/beizi/ad/internal/e;Lcom/beizi/ad/internal/a/a;Lcom/beizi/ad/internal/b;Lcom/beizi/ad/internal/network/ServerResponse;)Lcom/beizi/ad/internal/a/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/f;->a(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/a/b;)Lcom/beizi/ad/internal/a/b;

    goto :goto_1

    .line 26
    :cond_7
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v0}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->c:Lcom/beizi/ad/internal/j;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 27
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 28
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    iget-object v2, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iget-object v3, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    .line 29
    invoke-virtual {v3}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v3

    iget-object v4, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    .line 30
    invoke-static {v1, v2, v6, v3, v4}, Lcom/beizi/ad/internal/a/f;->a(Landroid/app/Activity;Lcom/beizi/ad/internal/e;Lcom/beizi/ad/internal/a/a;Lcom/beizi/ad/internal/b;Lcom/beizi/ad/internal/network/ServerResponse;)Lcom/beizi/ad/internal/a/f;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/f;->a(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/a/b;)Lcom/beizi/ad/internal/a/b;

    goto :goto_1

    .line 31
    :cond_8
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v1, "Request type can not be identified."

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/beizi/ad/internal/b;->a(I)V

    goto :goto_1

    .line 33
    :cond_9
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    if-eqz v0, :cond_a

    .line 34
    iget-object v0, p0, Lcom/beizi/ad/internal/f$1;->c:Lcom/beizi/ad/internal/f;

    iget-object v1, p0, Lcom/beizi/ad/internal/f$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v2, p0, Lcom/beizi/ad/internal/f$1;->a:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-static {v0, v1, v2}, Lcom/beizi/ad/internal/f;->a(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/network/ServerResponse;)V

    :cond_a
    :goto_1
    return-void
.end method
