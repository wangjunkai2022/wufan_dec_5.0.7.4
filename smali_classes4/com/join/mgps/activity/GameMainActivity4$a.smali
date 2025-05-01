.class Lcom/join/mgps/activity/GameMainActivity4$a;
.super Ljava/lang/Object;
.source "GameMainActivity4.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameMainActivity4;->T1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameMainActivity4;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4$a;->b:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$a;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object v0, v0, Lcom/join/mgps/activity/GameMainActivity4;->p1:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$a;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object v0, v0, Lcom/join/mgps/activity/GameMainActivity4;->C1:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$a;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object v0, v0, Lcom/join/mgps/activity/GameMainActivity4;->v1:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method
