.class Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$p0;
.super Ljava/lang/Object;
.source "GameDetialModleThreeAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;->K(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBean$Sub;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/InformationCommentBean$Sub;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;Lcom/join/mgps/dto/InformationCommentBean$Sub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$p0;->c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$p0;->b:Lcom/join/mgps/dto/InformationCommentBean$Sub;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$p0;->c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;->f:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$c1;

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$p0;->b:Lcom/join/mgps/dto/InformationCommentBean$Sub;

    invoke-interface {p1, v0}, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$c1;->e(Lcom/join/mgps/dto/InformationCommentBean$Sub;)V

    :cond_0
    return-void
.end method
