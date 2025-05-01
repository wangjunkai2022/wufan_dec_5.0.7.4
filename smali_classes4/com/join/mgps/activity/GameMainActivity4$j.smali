.class Lcom/join/mgps/activity/GameMainActivity4$j;
.super Ljava/lang/Object;
.source "GameMainActivity4.java"

# interfaces
.implements Lcom/join/mgps/dialog/c2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameMainActivity4;->R1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/Fragment;

.field final synthetic b:Lcom/join/mgps/activity/GameMainActivity4;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity4;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4$j;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iput-object p2, p0, Lcom/join/mgps/activity/GameMainActivity4$j;->a:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$j;->a:Landroidx/fragment/app/Fragment;

    check-cast v0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment_;

    invoke-virtual {v0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->f0(I)V

    return-void
.end method
