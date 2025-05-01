.class Lcom/join/mgps/fragment/CardViewPagerFragment$a;
.super Ljava/lang/Object;
.source "CardViewPagerFragment.java"

# interfaces
.implements Lcom/join/mgps/control/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/CardViewPagerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/CardViewPagerFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CardViewPagerFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$a;->a:Lcom/join/mgps/fragment/CardViewPagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public onSelected(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$a;->a:Lcom/join/mgps/fragment/CardViewPagerFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/AbsBaseFragment;->b:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/fragment/CardViewPagerFragment$a$a;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/fragment/CardViewPagerFragment$a$a;-><init>(Lcom/join/mgps/fragment/CardViewPagerFragment$a;I)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
