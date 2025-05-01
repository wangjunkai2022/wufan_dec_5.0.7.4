.class public Lcom/beizi/ad/internal/view/d;
.super Ljava/lang/Object;
.source "DisplayableInterstitialAdQueueEntry.java"

# interfaces
.implements Lcom/beizi/ad/internal/view/e;


# instance fields
.field private a:J

.field private b:Lcom/beizi/ad/internal/view/c;

.field private c:Z

.field private d:Lcom/beizi/ad/internal/a/b;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/c;Ljava/lang/Long;ZLcom/beizi/ad/internal/a/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/ad/internal/view/d;->a:J

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/internal/view/d;->b:Lcom/beizi/ad/internal/view/c;

    .line 4
    iput-boolean p3, p0, Lcom/beizi/ad/internal/view/d;->c:Z

    .line 5
    iput-object p4, p0, Lcom/beizi/ad/internal/view/d;->d:Lcom/beizi/ad/internal/a/b;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/ad/internal/view/d;->a:J

    return-wide v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/d;->c:Z

    return v0
.end method

.method public c()Lcom/beizi/ad/internal/a/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/d;->d:Lcom/beizi/ad/internal/a/b;

    return-object v0
.end method

.method public d()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/d;->b:Lcom/beizi/ad/internal/view/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
