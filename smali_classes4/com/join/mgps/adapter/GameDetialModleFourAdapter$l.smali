.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l;
.super Ljava/lang/Object;
.source "GameDetialModleFourAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$n1;->d:Lw1/j;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lw1/j;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
