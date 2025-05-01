.class public Lcom/join/mgps/customview/wheel/picker/a;
.super Lcom/join/mgps/customview/wheel/picker/c;
.source "EndGameTimePicker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/wheel/picker/a$d;,
        Lcom/join/mgps/customview/wheel/picker/a$e;
    }
.end annotation


# instance fields
.field private A1:I

.field private B1:I

.field private C1:I

.field private D1:I

.field private E1:I

.field private F1:Z

.field private V:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private W:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private X:Ljava/lang/String;

.field private Y:Ljava/lang/String;

.field private Z:Ljava/lang/String;

.field private p0:Ljava/lang/String;

.field private p1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

.field private v1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/wheel/picker/c;-><init>(Landroid/app/Activity;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->V:Ljava/util/ArrayList;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->W:Ljava/util/ArrayList;

    const-string p1, "\u5206"

    .line 4
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->X:Ljava/lang/String;

    const-string p1, "\u79d2"

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->Y:Ljava/lang/String;

    const-string p1, ""

    .line 5
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->Z:Ljava/lang/String;

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->p0:Ljava/lang/String;

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->B1:I

    const/16 p1, 0x3b

    .line 7
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->C1:I

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->D1:I

    const/16 p1, 0x10

    .line 8
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->E1:I

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->F1:Z

    return-void
.end method

.method static synthetic H0(Lcom/join/mgps/customview/wheel/picker/a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/a;->Z:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic I0(Lcom/join/mgps/customview/wheel/picker/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->Z:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic J0(Lcom/join/mgps/customview/wheel/picker/a;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/a;->V:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic K0(Lcom/join/mgps/customview/wheel/picker/a;)Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/a;->p1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    return-object p0
.end method

.method static synthetic L0(Lcom/join/mgps/customview/wheel/picker/a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/a;->p0:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic M0(Lcom/join/mgps/customview/wheel/picker/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->p0:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic N0(Lcom/join/mgps/customview/wheel/picker/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/wheel/picker/a;->Q0(II)V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/customview/wheel/picker/a;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/wheel/picker/a;->W:Ljava/util/ArrayList;

    return-object p0
.end method

.method private P0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x5

    if-gt v1, v2, :cond_0

    .line 2
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/a;->V:Ljava/util/ArrayList;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/a;->V:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/a;->Z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 4
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/a;->V:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->Z:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private Q0(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x5

    if-ge p2, v2, :cond_0

    const/16 v2, 0x3b

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-gt v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/a;->W:Ljava/util/ArrayList;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/customview/wheel/picker/a;->W:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    .line 4
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->W:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->p0:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method private R0(Ljava/util/ArrayList;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;I)I"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/customview/wheel/picker/a$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/wheel/picker/a$c;-><init>(Lcom/join/mgps/customview/wheel/picker/a;)V

    invoke-static {p1, v0, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Item["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] out of range"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected G()Landroid/view/View;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/wheel/picker/a;->P0()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->W:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->p0:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/a;->Z:Ljava/lang/String;

    invoke-static {v1}, Lcom/join/mgps/customview/wheel/picker/util/DateUtils;->u(Ljava/lang/String;)I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/join/mgps/customview/wheel/picker/a;->Q0(II)V

    .line 5
    :cond_1
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x11

    .line 7
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->l0()Lcom/join/mgps/customview/wheel/picker/WheelView;

    move-result-object v2

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->l0()Lcom/join/mgps/customview/wheel/picker/WheelView;

    move-result-object v3

    .line 10
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x2

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v4, v1, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    iget-object v4, p0, Lcom/join/mgps/customview/wheel/picker/a;->V:Ljava/util/ArrayList;

    iget-object v7, p0, Lcom/join/mgps/customview/wheel/picker/a;->Z:Ljava/lang/String;

    invoke-virtual {v2, v4, v7}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;Ljava/lang/String;)V

    .line 12
    new-instance v4, Lcom/join/mgps/customview/wheel/picker/a$a;

    invoke-direct {v4, p0, v3}, Lcom/join/mgps/customview/wheel/picker/a$a;-><init>(Lcom/join/mgps/customview/wheel/picker/a;Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    invoke-virtual {v2, v4}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V

    const/4 v4, 0x1

    .line 13
    invoke-virtual {v2, v4}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setCycleDisable(Z)V

    .line 14
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 15
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/a;->X:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->k0()Landroid/widget/TextView;

    move-result-object v2

    .line 17
    iget v7, p0, Lcom/join/mgps/customview/wheel/picker/a;->E1:I

    int-to-float v7, v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 18
    iget-object v7, p0, Lcom/join/mgps/customview/wheel/picker/a;->X:Ljava/lang/String;

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 20
    :cond_2
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v1, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 21
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/a;->W:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/a;->p0:Ljava/lang/String;

    invoke-virtual {v3, v1, v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setItems(Ljava/util/List;Ljava/lang/String;)V

    .line 22
    new-instance v1, Lcom/join/mgps/customview/wheel/picker/a$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/wheel/picker/a$b;-><init>(Lcom/join/mgps/customview/wheel/picker/a;)V

    invoke-virtual {v3, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOnItemSelectListener(Lcom/join/mgps/customview/wheel/picker/WheelView$g;)V

    .line 23
    invoke-virtual {v3, v4}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setCycleDisable(Z)V

    .line 24
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 25
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/a;->Y:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 26
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/c;->k0()Landroid/widget/TextView;

    move-result-object v1

    .line 27
    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/a;->E1:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 28
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/a;->Y:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_3
    return-object v0
.end method

.method protected K()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->v1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/a;->S0()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/customview/wheel/picker/a;->T0()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/a;->v1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    check-cast v2, Lcom/join/mgps/customview/wheel/picker/a$d;

    invoke-interface {v2, v0, v1}, Lcom/join/mgps/customview/wheel/picker/a$d;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public S0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->Z:Ljava/lang/String;

    return-object v0
.end method

.method public T0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/a;->p0:Ljava/lang/String;

    return-object v0
.end method

.method public U0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->X:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lcom/join/mgps/customview/wheel/picker/a;->Y:Ljava/lang/String;

    return-void
.end method

.method public V0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->v1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$h;

    return-void
.end method

.method public W0(Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->p1:Lcom/join/mgps/customview/wheel/picker/DateTimePicker$l;

    return-void
.end method

.method public X0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->F1:Z

    return-void
.end method

.method public Y0(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->C1:I

    .line 2
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/a;->D1:I

    return-void
.end method

.method public Z0(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/a;->A1:I

    .line 2
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/a;->B1:I

    return-void
.end method
