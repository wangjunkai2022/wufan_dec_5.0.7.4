.class Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$q;
.super Ljava/lang/Object;
.source "GamedetialModleFiveFragemnt_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;->n0(Lcom/join/mgps/dto/GameFromPopoWinBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/GameFromPopoWinBean;

.field final synthetic c:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;Lcom/join/mgps/dto/GameFromPopoWinBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$q;->c:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;

    iput-object p2, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$q;->b:Lcom/join/mgps/dto/GameFromPopoWinBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$q;->c:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$q;->b:Lcom/join/mgps/dto/GameFromPopoWinBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;->g2(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;Lcom/join/mgps/dto/GameFromPopoWinBean;)V

    return-void
.end method
