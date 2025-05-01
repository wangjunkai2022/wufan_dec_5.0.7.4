.class Lcom/beizi/ad/internal/view/AdWebView$4;
.super Ljava/lang/Object;
.source "AdWebView.java"

# interfaces
.implements Lcom/beizi/ad/internal/view/AdWebView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdWebView;->a(IIZLcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/AdActivity$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/f;

.field final synthetic b:Z

.field final synthetic c:Lcom/beizi/ad/AdActivity$b;

.field final synthetic d:Lcom/beizi/ad/internal/view/AdWebView;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdWebView;Lcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/AdActivity$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->d:Lcom/beizi/ad/internal/view/AdWebView;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->a:Lcom/beizi/ad/internal/view/f;

    iput-boolean p3, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->b:Z

    iput-object p4, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->c:Lcom/beizi/ad/AdActivity$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->a:Lcom/beizi/ad/internal/view/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/f;->c()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->d:Lcom/beizi/ad/internal/view/AdWebView;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->a:Lcom/beizi/ad/internal/view/f;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/f;->c()Landroid/app/Activity;

    move-result-object v1

    iget-boolean v2, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->b:Z

    iget-object v3, p0, Lcom/beizi/ad/internal/view/AdWebView$4;->c:Lcom/beizi/ad/AdActivity$b;

    invoke-virtual {v0, v1, v2, v3}, Lcom/beizi/ad/internal/view/AdWebView;->a(Landroid/app/Activity;ZLcom/beizi/ad/AdActivity$b;)V

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->setMRAIDFullscreenListener(Lcom/beizi/ad/internal/view/AdWebView$b;)V

    :cond_0
    return-void
.end method
