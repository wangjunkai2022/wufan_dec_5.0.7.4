.class Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$j0;
.super Ljava/lang/Object;
.source "GamedetialModleFiveFragemnt_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;->updateTitleButn(Lcom/join/mgps/dto/ResultMainBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ResultMainBean;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;Lcom/join/mgps/dto/ResultMainBean;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$j0;->d:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;

    iput-object p2, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$j0;->b:Lcom/join/mgps/dto/ResultMainBean;

    iput p3, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$j0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$j0;->d:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$j0;->b:Lcom/join/mgps/dto/ResultMainBean;

    iget v2, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_$j0;->c:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;->S1(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt_;Lcom/join/mgps/dto/ResultMainBean;I)V

    return-void
.end method
