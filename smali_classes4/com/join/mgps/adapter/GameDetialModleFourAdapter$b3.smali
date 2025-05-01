.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3;
.super Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;
.source "GameDetialModleFourAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b3"
.end annotation


# instance fields
.field public a:Landroid/widget/TextView;

.field public b:Landroid/widget/LinearLayout;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;-><init>(Landroid/view/View;)V

    const p1, 0x7f09169b

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3;->a:Landroid/widget/TextView;

    const p1, 0x7f090d28

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3;->b:Landroid/widget/LinearLayout;

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3$a;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3$a;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$b3;Lcom/join/mgps/dto/DomainInfoBean;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method
