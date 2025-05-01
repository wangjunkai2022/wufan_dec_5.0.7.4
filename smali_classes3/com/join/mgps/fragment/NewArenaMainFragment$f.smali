.class Lcom/join/mgps/fragment/NewArenaMainFragment$f;
.super Lcom/facebook/drawee/controller/b;
.source "NewArenaMainFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/NewArenaMainFragment;->t0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/fragment/NewArenaMainFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/NewArenaMainFragment;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$f;->c:Lcom/join/mgps/fragment/NewArenaMainFragment;

    iput p2, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$f;->b:I

    invoke-direct {p0}, Lcom/facebook/drawee/controller/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/drawee/controller/b;->onFailure(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$f;->c:Lcom/join/mgps/fragment/NewArenaMainFragment;

    iget p2, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$f;->b:I

    add-int/lit8 p2, p2, -0x1

    invoke-static {p1, p2}, Lcom/join/mgps/fragment/NewArenaMainFragment;->Z(Lcom/join/mgps/fragment/NewArenaMainFragment;I)V

    return-void
.end method

.method public onFinalImageSet(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/drawee/controller/b;->onFinalImageSet(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$f;->c:Lcom/join/mgps/fragment/NewArenaMainFragment;

    iget p2, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$f;->b:I

    invoke-static {p1, p2}, Lcom/join/mgps/fragment/NewArenaMainFragment;->X(Lcom/join/mgps/fragment/NewArenaMainFragment;I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$f;->c:Lcom/join/mgps/fragment/NewArenaMainFragment;

    iget p2, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$f;->b:I

    add-int/lit8 p2, p2, -0x1

    invoke-static {p1, p2}, Lcom/join/mgps/fragment/NewArenaMainFragment;->Z(Lcom/join/mgps/fragment/NewArenaMainFragment;I)V

    return-void
.end method
