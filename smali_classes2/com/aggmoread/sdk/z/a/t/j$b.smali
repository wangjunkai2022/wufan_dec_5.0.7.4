.class Lcom/aggmoread/sdk/z/a/t/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/t/j;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/t/j;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/t/j;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/j$b;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/t/j$b;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/t/j;->a(Lcom/aggmoread/sdk/z/a/t/j;)Lcom/aggmoread/sdk/z/a/t/h;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/t/j$b;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/t/j;->a(Lcom/aggmoread/sdk/z/a/t/j;)Lcom/aggmoread/sdk/z/a/t/h;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/t/j$b;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/t/j;->b(Lcom/aggmoread/sdk/z/a/t/j;)Lcom/aggmoread/sdk/z/a/t/j$f;

    move-result-object p1

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/t/j$f;->onClose()V

    :goto_0
    return-void
.end method
