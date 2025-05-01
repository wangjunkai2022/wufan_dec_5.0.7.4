.class public Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
.super Ljava/lang/Object;
.source "PopWindowView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/popwindow/view/PopWindowView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

.field private b:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->b:Landroid/app/Activity;

    .line 3
    new-instance v0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-direct {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    return-void
.end method


# virtual methods
.method public a()Lcom/join/mgps/customview/popwindow/view/PopWindowView;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->k(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/customview/popwindow/shape/b;

    iget-object v1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    .line 4
    invoke-static {v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->o(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Ly1/a;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    .line 5
    invoke-static {v2}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->c(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)I

    move-result v2

    iget-object v3, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    .line 6
    invoke-static {v3}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->d(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)I

    move-result v3

    iget-object v4, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    .line 7
    invoke-static {v4}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->e(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/join/mgps/customview/popwindow/shape/b;-><init>(Ly1/a;III)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v1, v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->m(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Lcom/join/mgps/customview/popwindow/shape/a;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    return-object v0
.end method

.method public b(Z)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->j(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Z)V

    return-object p0
.end method

.method public c(Z)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->n(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Z)V

    return-object p0
.end method

.method public d(Lcom/join/mgps/customview/popwindow/shape/a;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->l(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Z)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->m(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Lcom/join/mgps/customview/popwindow/shape/a;)V

    return-object p0
.end method

.method public e(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setDropDownHeight(I)V

    return-object p0
.end method

.method public f(Landroid/view/View;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setDropDownView(Landroid/view/View;)V

    return-object p0
.end method

.method public g(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->g(Lcom/join/mgps/customview/popwindow/view/PopWindowView;I)V

    return-object p0
.end method

.method public h(Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setOnDismissListener(Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;)V

    return-object p0
.end method

.method public i(Landroid/view/View;)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    new-instance v1, Ly1/b;

    invoke-direct {v1, p1}, Ly1/b;-><init>(Landroid/view/View;)V

    invoke-static {v0, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->h(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Ly1/a;)V

    return-object p0
.end method

.method public j(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->i(Lcom/join/mgps/customview/popwindow/view/PopWindowView;I)V

    return-object p0
.end method

.method public k(I)Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setRadius(I)V

    return-object p0
.end method

.method public l()Lcom/join/mgps/customview/popwindow/view/PopWindowView;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a()Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->b:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;->a:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    return-object v0
.end method
