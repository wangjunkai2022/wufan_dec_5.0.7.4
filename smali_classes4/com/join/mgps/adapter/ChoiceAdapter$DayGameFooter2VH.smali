.class public Lcom/join/mgps/adapter/ChoiceAdapter$DayGameFooter2VH;
.super Lcom/join/mgps/adapter/ChoiceAdapter$VH;
.source "ChoiceAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ChoiceAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DayGameFooter2VH"
.end annotation


# instance fields
.field public b:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/TextView;

.field final synthetic h:Lcom/join/mgps/adapter/ChoiceAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/ChoiceAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$DayGameFooter2VH;->h:Lcom/join/mgps/adapter/ChoiceAdapter;

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ChoiceAdapter$VH;-><init>(Lcom/join/mgps/adapter/ChoiceAdapter;Landroid/view/View;)V

    const p1, 0x7f09078d

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$DayGameFooter2VH;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f090ea1

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$DayGameFooter2VH;->c:Landroid/widget/TextView;

    const p1, 0x7f090620

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$DayGameFooter2VH;->d:Landroid/widget/TextView;

    const p1, 0x7f090621

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$DayGameFooter2VH;->e:Landroid/widget/TextView;

    const p1, 0x7f0910a9

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$DayGameFooter2VH;->f:Landroid/widget/TextView;

    const p1, 0x7f0903f9

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$DayGameFooter2VH;->g:Landroid/widget/TextView;

    return-void
.end method
