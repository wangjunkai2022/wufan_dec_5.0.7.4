.class public Lcom/join/mgps/customview/w;
.super Lcom/join/mgps/customview/p;
.source "MyGamePlugPopupWindow.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/w$a;
    }
.end annotation


# instance fields
.field b:Landroid/view/View;

.field c:Landroid/view/View;

.field d:Landroid/view/View;

.field private e:Ljava/lang/String;

.field f:Lcom/join/mgps/customview/w$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/p;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/customview/w;->init()V

    return-void
.end method


# virtual methods
.method public a()Lcom/join/mgps/customview/w$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/w;->f:Lcom/join/mgps/customview/w$a;

    return-object v0
.end method

.method public b(Lcom/join/mgps/customview/w$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/w;->f:Lcom/join/mgps/customview/w$a;

    return-void
.end method

.method public c(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/join/mgps/customview/w;->d(Landroid/view/View;Ljava/lang/String;Z)V

    return-void
.end method

.method public d(Landroid/view/View;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iput-object p2, p0, Lcom/join/mgps/customview/w;->e:Ljava/lang/String;

    const/16 p2, 0x50

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/join/mgps/customview/p;->showAtLocation(Landroid/view/View;III)V

    if-eqz p3, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/w;->b:Landroid/view/View;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/customview/w;->d:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/customview/w;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/customview/w;->d:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method init()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/p;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0700

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    const/4 v0, -0x1

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    const/4 v0, -0x2

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f090403

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/w;->b:Landroid/view/View;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f0903ee

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/w;->c:Landroid/view/View;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f090c6b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/w;->d:Landroid/view/View;

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/w;->b:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/w;->c:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f090403

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/w;->f:Lcom/join/mgps/customview/w$a;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/join/mgps/customview/w;->e:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/w$a;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const v0, 0x7f0903ee

    if-ne p1, v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/customview/w;->f:Lcom/join/mgps/customview/w$a;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/join/mgps/customview/w;->e:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/w$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const v0, 0x7f090290

    if-ne p1, v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    :cond_2
    :goto_0
    return-void
.end method
