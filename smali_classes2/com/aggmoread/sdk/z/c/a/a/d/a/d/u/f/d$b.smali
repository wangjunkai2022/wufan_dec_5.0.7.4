.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;->a(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/kwad/sdk/api/KsNativeAd;)V
    .locals 8

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;->q:Ljava/lang/String;

    const-string p2, "onADClicked"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iget p2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->f:I

    const/4 v0, 0x1

    add-int/2addr p2, v0

    iput p2, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->f:I

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {p2, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->n:Ljava/lang/Object;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iget-object v3, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->a:Ljava/lang/ref/WeakReference;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    :goto_0
    move-object v4, p1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iget-wide v5, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    iget-object v7, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-virtual/range {v2 .. v7}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;J[Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;->onAdClicked()V

    :cond_1
    return-void
.end method

.method public a(Lcom/kwad/sdk/api/KsNativeAd;)V
    .locals 4

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;->q:Ljava/lang/String;

    const-string v0, "onADExposed "

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/k;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->f:Ljava/lang/Object;

    const-string v3, "-1"

    invoke-virtual {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-static {p1, v0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    return-void
.end method

.method public a(Landroid/content/DialogInterface$OnClickListener;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onDownloadTipsDialogDismiss()V
    .locals 0

    return-void
.end method

.method public onDownloadTipsDialogShow()V
    .locals 0

    return-void
.end method
