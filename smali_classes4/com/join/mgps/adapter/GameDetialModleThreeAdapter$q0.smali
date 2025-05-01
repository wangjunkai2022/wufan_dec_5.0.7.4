.class Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$q0;
.super Ljava/lang/Object;
.source "GameDetialModleThreeAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;->L(Landroid/view/View;Lcom/join/mgps/dto/CommentBaseBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/CommentBaseBean;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;Lcom/join/mgps/dto/CommentBaseBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$q0;->c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$q0;->b:Lcom/join/mgps/dto/CommentBaseBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$q0;->b:Lcom/join/mgps/dto/CommentBaseBean;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$q0;->c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    iget-object v0, v0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;->f:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$c1;

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {v0, p1}, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$c1;->d(Lcom/join/mgps/dto/CommentBaseBean;)V

    :cond_1
    return-void
.end method
