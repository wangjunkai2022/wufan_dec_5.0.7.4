.class Lcom/join/mgps/customview/y$c;
.super Ljava/lang/Object;
.source "PopBattleArea.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/y;-><init>(Landroid/content/Context;Lcom/join/mgps/customview/y$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/y$e;

.field final synthetic c:Lcom/join/mgps/customview/y;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/y;Lcom/join/mgps/customview/y$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/y$c;->c:Lcom/join/mgps/customview/y;

    iput-object p2, p0, Lcom/join/mgps/customview/y$c;->b:Lcom/join/mgps/customview/y$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/y$c;->c:Lcom/join/mgps/customview/y;

    iget-object p1, p1, Lcom/join/mgps/customview/y;->r:Lcom/join/mgps/customview/y$f;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/customview/y$f;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, p3, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/y$c;->c:Lcom/join/mgps/customview/y;

    iget-object p1, p1, Lcom/join/mgps/customview/y;->r:Lcom/join/mgps/customview/y$f;

    invoke-virtual {p1}, Lcom/join/mgps/customview/y$f;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lcom/join/mgps/dto/GameConfig;

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/customview/y$c;->b:Lcom/join/mgps/customview/y$e;

    if-eqz p1, :cond_2

    .line 5
    invoke-interface {p1, p2}, Lcom/join/mgps/customview/y$e;->b(Lcom/join/mgps/dto/GameConfig;)V

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/customview/y$c;->c:Lcom/join/mgps/customview/y;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method
