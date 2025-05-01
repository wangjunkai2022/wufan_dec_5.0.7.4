.class public Lcom/join/mgps/dialog/a1;
.super Landroid/app/Dialog;
.source "HideAppConfirmPwdDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dialog/a1$a;
    }
.end annotation


# instance fields
.field b:Ljava/lang/String;

.field c:Z

.field private d:Lcom/join/mgps/dialog/a1$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/dialog/a1;->b:Ljava/lang/String;

    .line 3
    iput-boolean p3, p0, Lcom/join/mgps/dialog/a1;->c:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/dialog/a1$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/a1;->d:Lcom/join/mgps/dialog/a1$a;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f091559

    if-ne v0, v1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/dialog/a1;->d:Lcom/join/mgps/dialog/a1$a;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/join/mgps/dialog/a1$a;->reset()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f091505

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/join/mgps/dialog/a1;->d:Lcom/join/mgps/dialog/a1$a;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/join/mgps/dialog/a1;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/join/mgps/dialog/a1$a;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const v0, 0x106000d

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const/16 v0, 0x11

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/Window;->setGravity(I)V

    const p1, 0x7f0c01c0

    .line 7
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    const p1, 0x7f091573

    .line 8
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 9
    iget-boolean v0, p0, Lcom/join/mgps/dialog/a1;->c:Z

    if-eqz v0, :cond_0

    const-string v0, "\u6e29\u99a8\u63d0\u793a"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p1, 0x7f09154c

    .line 10
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 11
    iget-boolean v0, p0, Lcom/join/mgps/dialog/a1;->c:Z

    if-eqz v0, :cond_1

    const-string v0, "\u786e\u5b9a\u89e3\u9664\u4f2a\u88c5\u72b6\u6001\u5417\uff1f"

    .line 12
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    const v0, 0x3dcccccd    # 0.1f

    .line 14
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLetterSpacing(F)V

    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/dialog/a1;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    const p1, 0x7f091559

    .line 16
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 17
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-boolean v0, p0, Lcom/join/mgps/dialog/a1;->c:Z

    if-eqz v0, :cond_3

    const-string v0, "\u518d\u60f3\u60f3"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    const p1, 0x7f091505

    .line 19
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 20
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-boolean v0, p0, Lcom/join/mgps/dialog/a1;->c:Z

    if-eqz v0, :cond_4

    const-string v0, "\u786e\u5b9a"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method
