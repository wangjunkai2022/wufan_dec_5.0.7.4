.class Lcom/join/mgps/fragment/CardViewPagerFragment$d;
.super Ljava/lang/Object;
.source "CardViewPagerFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CardViewPagerFragment;->O(Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CardViewPagerFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CardViewPagerFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$d;->b:Lcom/join/mgps/fragment/CardViewPagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$d;->b:Lcom/join/mgps/fragment/CardViewPagerFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CardViewPagerFragment;->d0(Lcom/join/mgps/fragment/CardViewPagerFragment;)V

    return-void
.end method
