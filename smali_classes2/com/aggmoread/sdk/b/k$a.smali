.class Lcom/aggmoread/sdk/b/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/o/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/k;->bindAdToView(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/k;Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/b/k$a;->a:Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$a;->a:Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;

    new-instance v1, Lcom/aggmoread/sdk/client/AMError;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->a()I

    move-result v2

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/client/IAMAdInteractionListener;->onAdError(Lcom/aggmoread/sdk/client/AMError;)V

    return-void
.end method

.method public onADStatusChanged(I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$a;->a:Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;->onADStatusChanged(I)V

    return-void
.end method

.method public onAdClicked()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$a;->a:Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;->onAdClicked()V

    return-void
.end method

.method public onAdExposed()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$a;->a:Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;->onAdExposed()V

    return-void
.end method

.method public onLoadApkProgress(I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/k$a;->a:Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/client/feedlist/AMNativeInteractionListener;->onLoadApkProgress(I)V

    return-void
.end method
