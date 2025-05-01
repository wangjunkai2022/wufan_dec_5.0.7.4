.class Lcom/beizi/ad/internal/view/f$1;
.super Ljava/lang/Object;
.source "MRAIDImplementation.java"

# interfaces
.implements Lcom/beizi/ad/internal/view/AdWebView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/f;->b(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/beizi/ad/AdActivity$b;

.field final synthetic c:Lcom/beizi/ad/internal/view/f;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/f;ZLcom/beizi/ad/AdActivity$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/f$1;->c:Lcom/beizi/ad/internal/view/f;

    iput-boolean p2, p0, Lcom/beizi/ad/internal/view/f$1;->a:Z

    iput-object p3, p0, Lcom/beizi/ad/internal/view/f$1;->b:Lcom/beizi/ad/AdActivity$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f$1;->c:Lcom/beizi/ad/internal/view/f;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/f;->c()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/f$1;->c:Lcom/beizi/ad/internal/view/f;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/f;->a(Lcom/beizi/ad/internal/view/f;)Lcom/beizi/ad/internal/view/g;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/ad/internal/view/f$1;->c:Lcom/beizi/ad/internal/view/f;

    invoke-virtual {v1}, Lcom/beizi/ad/internal/view/f;->c()Landroid/app/Activity;

    move-result-object v1

    iget-boolean v2, p0, Lcom/beizi/ad/internal/view/f$1;->a:Z

    iget-object v3, p0, Lcom/beizi/ad/internal/view/f$1;->b:Lcom/beizi/ad/AdActivity$b;

    invoke-virtual {v0, v1, v2, v3}, Lcom/beizi/ad/internal/view/AdWebView;->a(Landroid/app/Activity;ZLcom/beizi/ad/AdActivity$b;)V

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->setMRAIDFullscreenListener(Lcom/beizi/ad/internal/view/AdWebView$b;)V

    :cond_0
    return-void
.end method
