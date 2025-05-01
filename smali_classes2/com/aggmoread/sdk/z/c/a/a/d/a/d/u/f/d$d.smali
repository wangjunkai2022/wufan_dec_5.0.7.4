.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$d;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onAdClicked"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$d;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;

    aget-object p2, p3, v0

    check-cast p2, Landroid/view/View;

    const/4 v0, 0x1

    aget-object p3, p3, v0

    check-cast p3, Lcom/kwad/sdk/api/KsNativeAd;

    invoke-interface {p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;->a(Landroid/view/View;Lcom/kwad/sdk/api/KsNativeAd;)V

    goto :goto_0

    :cond_0
    const-string p2, "onAdShow"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$d;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;

    aget-object p2, p3, v0

    check-cast p2, Lcom/kwad/sdk/api/KsNativeAd;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;->a(Lcom/kwad/sdk/api/KsNativeAd;)V

    goto :goto_0

    :cond_1
    const-string p2, "handleDownloadDialog"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$d;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;

    aget-object p2, p3, v0

    check-cast p2, Landroid/content/DialogInterface$OnClickListener;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;->a(Landroid/content/DialogInterface$OnClickListener;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p2, "onDownloadTipsDialogShow"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$d;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;->onDownloadTipsDialogShow()V

    goto :goto_0

    :cond_3
    const-string p2, "onDownloadTipsDialogDismiss"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$d;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/f/d$e;->onDownloadTipsDialogDismiss()V

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
