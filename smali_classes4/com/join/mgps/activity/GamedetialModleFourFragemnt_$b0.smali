.class Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b0;
.super Ljava/lang/Object;
.source "GamedetialModleFourFragemnt_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->L0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b0;->c:Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;

    iput p2, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b0;->c:Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;

    iget v1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_$b0;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;->e1(Lcom/join/mgps/activity/GamedetialModleFourFragemnt_;I)V

    return-void
.end method
