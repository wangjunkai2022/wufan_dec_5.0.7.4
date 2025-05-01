.class Lcom/beizi/ad/internal/view/AdViewImpl$b$3;
.super Ljava/lang/Object;
.source "AdViewImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdViewImpl$b;->a(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/beizi/ad/internal/view/AdViewImpl$b;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl$b;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$3;->c:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$3;->a:Ljava/lang/String;

    iput p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$3;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$3;->c:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-boolean v1, v0, Lcom/beizi/ad/internal/view/AdViewImpl;->j:Z

    if-eqz v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->i(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/RewardedVideoAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$3;->c:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->i(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/RewardedVideoAdListener;

    move-result-object v0

    new-instance v1, Lcom/beizi/ad/internal/m;

    iget-object v2, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$3;->a:Ljava/lang/String;

    iget v3, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$3;->b:I

    invoke-direct {v1, v2, v3}, Lcom/beizi/ad/internal/m;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1}, Lcom/beizi/ad/RewardedVideoAdListener;->onRewarded(Lcom/beizi/ad/RewardItem;)V

    :cond_0
    return-void
.end method
