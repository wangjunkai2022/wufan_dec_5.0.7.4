.class public Lcom/join/mgps/dialog/e0;
.super Landroid/app/AlertDialog;
.source "CreateEndGameGuideDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private b:Landroid/view/View;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/CheckBox;

.field private g:Lcom/papa91/arc/interfaces/DialogListenerWrap;

.field h:Lcom/join/mgps/pref/PrefDef_;


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

    .line 2
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/dialog/e0;->h:Lcom/join/mgps/pref/PrefDef_;

    return-void
.end method


# virtual methods
.method public a(Lcom/papa91/arc/interfaces/DialogListenerWrap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/e0;->g:Lcom/papa91/arc/interfaces/DialogListenerWrap;

    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/GameMainV4DataBean$CreateEndgameHintBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->show()V

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/dialog/e0;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean$CreateEndgameHintBean;

    if-eqz v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/join/mgps/dialog/e0;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$CreateEndgameHintBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 7
    iget-object v0, p0, Lcom/join/mgps/dialog/e0;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameMainV4DataBean$CreateEndgameHintBean;

    if-eqz p1, :cond_1

    .line 9
    iget-object v0, p0, Lcom/join/mgps/dialog/e0;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameMainV4DataBean$CreateEndgameHintBean;->getSubTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f091605

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/dialog/e0;->g:Lcom/papa91/arc/interfaces/DialogListenerWrap;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/papa91/arc/interfaces/DialogListenerWrap;->onConfirm()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_0

    :cond_1
    const v0, 0x7f09091d

    if-ne p1, v0, :cond_2

    .line 5
    invoke-virtual {p0}, Landroid/app/AlertDialog;->dismiss()V

    :cond_2
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c01a7

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

    iput-object p1, p0, Lcom/join/mgps/dialog/e0;->b:Landroid/view/View;

    const p1, 0x7f091605

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/dialog/e0;->c:Landroid/widget/TextView;

    const p1, 0x7f0902d8

    .line 7
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lcom/join/mgps/dialog/e0;->f:Landroid/widget/CheckBox;

    const p1, 0x7f09169b

    .line 8
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/dialog/e0;->d:Landroid/widget/TextView;

    const p1, 0x7f09168f

    .line 9
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/dialog/e0;->e:Landroid/widget/TextView;

    .line 10
    iget-object p1, p0, Lcom/join/mgps/dialog/e0;->f:Landroid/widget/CheckBox;

    new-instance v0, Lcom/join/mgps/dialog/e0$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/e0$a;-><init>(Lcom/join/mgps/dialog/e0;)V

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/dialog/e0;->b:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/dialog/e0;->c:Landroid/widget/TextView;

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
