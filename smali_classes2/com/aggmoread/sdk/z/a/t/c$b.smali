.class Lcom/aggmoread/sdk/z/a/t/c$b;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/t/c;->a(Landroid/content/Context;)Landroid/view/GestureDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/t/c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/t/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/c$b;->a:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSingleTapUp enter , viewStatusLis = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/t/c$b;->a:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c;)Lcom/aggmoread/sdk/z/a/t/c$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ApiViewStatusLayout"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c$b;->a:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c;)Lcom/aggmoread/sdk/z/a/t/c$c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c$b;->a:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c;)Lcom/aggmoread/sdk/z/a/t/c$c;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/t/c$b;->a:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/t/c$c;->onClick(Landroid/view/View;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c$b;->a:Lcom/aggmoread/sdk/z/a/t/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c;Lcom/aggmoread/sdk/z/a/t/c$c;)Lcom/aggmoread/sdk/z/a/t/c$c;

    :cond_0
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
