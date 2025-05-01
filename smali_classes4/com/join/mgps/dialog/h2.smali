.class public Lcom/join/mgps/dialog/h2;
.super Landroid/app/AlertDialog;
.source "SystemTipDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Lcom/papa91/arc/interfaces/DialogListenerWrap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f110148

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public a(Lcom/papa91/arc/interfaces/DialogListenerWrap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/h2;->e:Lcom/papa91/arc/interfaces/DialogListenerWrap;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->show()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/dialog/h2;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f09091d

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/dialog/h2;->e:Lcom/papa91/arc/interfaces/DialogListenerWrap;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/papa91/arc/interfaces/DialogListenerWrap;->onClose()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_0

    :cond_1
    const v0, 0x7f091606

    if-ne p1, v0, :cond_3

    .line 5
    iget-object p1, p0, Lcom/join/mgps/dialog/h2;->e:Lcom/papa91/arc/interfaces/DialogListenerWrap;

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/papa91/arc/interfaces/DialogListenerWrap;->onConfirm()V

    .line 7
    :cond_2
    invoke-virtual {p0}, Landroid/app/AlertDialog;->dismiss()V

    :cond_3
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c01fc

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setContentView(I)V

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setCancelable(Z)V

    const p1, 0x7f09091d

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/dialog/h2;->b:Landroid/widget/ImageView;

    const p1, 0x7f0915b0

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/dialog/h2;->c:Landroid/widget/TextView;

    const p1, 0x7f091606

    .line 7
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/dialog/h2;->d:Landroid/widget/TextView;

    .line 8
    iget-object p1, p0, Lcom/join/mgps/dialog/h2;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/dialog/h2;->d:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
