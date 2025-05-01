.class Lcom/aggmoread/sdk/b/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/e;->a(Landroid/content/Context;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lcom/aggmoread/sdk/b/e;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/e;Ljava/util/List;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/e$b;->d:Lcom/aggmoread/sdk/b/e;

    iput-object p2, p0, Lcom/aggmoread/sdk/b/e$b;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/aggmoread/sdk/b/e$b;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/aggmoread/sdk/b/e$b;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/b/e$b;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/client/AMChannelIdInfo;

    iget-object v2, v1, Lcom/aggmoread/sdk/client/AMChannelIdInfo;->channelId:Ljava/lang/String;

    iget-object v3, v1, Lcom/aggmoread/sdk/client/AMChannelIdInfo;->adType:Lcom/aggmoread/sdk/client/AMAdType;

    iget-object v1, v1, Lcom/aggmoread/sdk/client/AMChannelIdInfo;->amAdLoadSlot:Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    if-nez v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    invoke-direct {v1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;-><init>()V

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setSlotId(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->build()Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    move-result-object v1

    :cond_0
    iget-object v2, p0, Lcom/aggmoread/sdk/b/e$b;->d:Lcom/aggmoread/sdk/b/e;

    iget-object v4, p0, Lcom/aggmoread/sdk/b/e$b;->c:Landroid/content/Context;

    invoke-static {v2, v4, v3, v1}, Lcom/aggmoread/sdk/b/e;->a(Lcom/aggmoread/sdk/b/e;Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    move-result-object v1

    new-instance v2, Lcom/aggmoread/sdk/b/d;

    invoke-direct {v2, v3}, Lcom/aggmoread/sdk/b/d;-><init>(Lcom/aggmoread/sdk/client/AMAdType;)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    invoke-virtual {v2}, Lcom/aggmoread/sdk/b/d;->a()Lcom/aggmoread/sdk/z/c/a/a/c/f;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/f;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Z)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    iget-object v2, p0, Lcom/aggmoread/sdk/b/e$b;->d:Lcom/aggmoread/sdk/b/e;

    invoke-static {v2}, Lcom/aggmoread/sdk/b/e;->a(Lcom/aggmoread/sdk/b/e;)Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    move-result-object v2

    invoke-interface {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a()Lcom/aggmoread/sdk/z/c/a/a/c/g;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Lcom/aggmoread/sdk/z/c/a/a/c/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
