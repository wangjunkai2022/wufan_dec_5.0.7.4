.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3;
.super Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;
.source "GameDetialModleFourAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c3"
.end annotation


# instance fields
.field public a:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public b:Landroid/widget/LinearLayout;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;-><init>(Landroid/view/View;)V

    const p1, 0x7f09120b

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f090d28

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3;->b:Landroid/widget/LinearLayout;

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3$a;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3$a;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$c3;Lcom/join/mgps/dto/DomainInfoBean;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method
