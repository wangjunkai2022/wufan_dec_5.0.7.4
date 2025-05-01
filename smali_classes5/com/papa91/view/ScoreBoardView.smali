.class public Lcom/papa91/view/ScoreBoardView;
.super Landroid/widget/FrameLayout;
.source "ScoreBoardView.java"


# instance fields
.field name1:Ljava/lang/String;

.field name2:Ljava/lang/String;

.field private p1Name:Landroid/widget/TextView;

.field private p1Score:Landroid/widget/TextView;

.field private p1Signal:Landroid/widget/ImageView;

.field private p2Name:Landroid/widget/TextView;

.field private p2Score:Landroid/widget/TextView;

.field private p2Signal:Landroid/widget/ImageView;

.field score1:I

.field score2:I

.field signal1:I

.field signal2:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lcom/papa91/view/ScoreBoardView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0}, Lcom/papa91/view/ScoreBoardView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0}, Lcom/papa91/view/ScoreBoardView;->init()V

    return-void
.end method

.method private signalResId(I)I
    .locals 1

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_0

    .line 1
    sget p1, Lcom/papa91/mix/R$drawable;->wifi_high:I

    return p1

    :cond_0
    const/16 v0, 0x190

    if-ge p1, v0, :cond_1

    .line 2
    sget p1, Lcom/papa91/mix/R$drawable;->wifi_mid:I

    return p1

    .line 3
    :cond_1
    sget p1, Lcom/papa91/mix/R$drawable;->wifi_low:I

    return p1
.end method


# virtual methods
.method public getName1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/view/ScoreBoardView;->name1:Ljava/lang/String;

    return-object v0
.end method

.method public getName2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/view/ScoreBoardView;->name2:Ljava/lang/String;

    return-object v0
.end method

.method public getScore1()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/view/ScoreBoardView;->score1:I

    return v0
.end method

.method public getScore2()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/view/ScoreBoardView;->score2:I

    return v0
.end method

.method public getSignal1()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/view/ScoreBoardView;->signal1:I

    return v0
.end method

.method public getSignal2()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/view/ScoreBoardView;->signal2:I

    return v0
.end method

.method init()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/papa91/mix/R$layout;->score_board_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    sget v1, Lcom/papa91/mix/R$id;->name1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/papa91/view/ScoreBoardView;->p1Name:Landroid/widget/TextView;

    .line 3
    sget v1, Lcom/papa91/mix/R$id;->score1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/papa91/view/ScoreBoardView;->p1Score:Landroid/widget/TextView;

    .line 4
    sget v1, Lcom/papa91/mix/R$id;->signal1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/papa91/view/ScoreBoardView;->p1Signal:Landroid/widget/ImageView;

    .line 5
    sget v1, Lcom/papa91/mix/R$id;->name2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/papa91/view/ScoreBoardView;->p2Name:Landroid/widget/TextView;

    .line 6
    sget v1, Lcom/papa91/mix/R$id;->score2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/papa91/view/ScoreBoardView;->p2Score:Landroid/widget/TextView;

    .line 7
    sget v1, Lcom/papa91/mix/R$id;->signal2:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/papa91/view/ScoreBoardView;->p2Signal:Landroid/widget/ImageView;

    return-void
.end method

.method public setName1(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/papa91/view/ScoreBoardView;->name1:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/papa91/view/ScoreBoardView;->p1Name:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setName2(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/papa91/view/ScoreBoardView;->name2:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/papa91/view/ScoreBoardView;->p2Name:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setScore1(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/papa91/view/ScoreBoardView;->score1:I

    .line 2
    iget-object v0, p0, Lcom/papa91/view/ScoreBoardView;->p1Score:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setScore2(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/papa91/view/ScoreBoardView;->score2:I

    .line 2
    iget-object v0, p0, Lcom/papa91/view/ScoreBoardView;->p2Score:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSignal1(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/view/ScoreBoardView;->signal1:I

    return-void
.end method

.method public setSignal2(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/view/ScoreBoardView;->signal2:I

    return-void
.end method
