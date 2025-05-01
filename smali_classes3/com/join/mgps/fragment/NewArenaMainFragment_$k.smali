.class Lcom/join/mgps/fragment/NewArenaMainFragment_$k;
.super Ljava/lang/Object;
.source "NewArenaMainFragment_.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/NewArenaMainFragment_;->onViewChanged(La4/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/NewArenaMainFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/NewArenaMainFragment_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_$k;->b:Lcom/join/mgps/fragment/NewArenaMainFragment_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment_$k;->b:Lcom/join/mgps/fragment/NewArenaMainFragment_;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->setNetwork()V

    return-void
.end method
