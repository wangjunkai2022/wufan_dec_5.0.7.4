.class Lcom/aggmoread/sdk/z/a/s/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/s/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/s/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/s/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$b;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$b;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/s/a;->g(Lcom/aggmoread/sdk/z/a/s/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$b;->a:Lcom/aggmoread/sdk/z/a/s/a;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/s/a;->e()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/s/a$b;->a:Lcom/aggmoread/sdk/z/a/s/a;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/aggmoread/sdk/z/a/s/a;->x:Z

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
