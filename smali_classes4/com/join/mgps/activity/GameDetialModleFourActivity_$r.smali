.class Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;
.super Ljava/lang/Object;
.source "GameDetialModleFourActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameDetialModleFourActivity_;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/GamedetialModleFourBean;

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/activity/GameDetialModleFourActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;->d:Lcom/join/mgps/activity/GameDetialModleFourActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;->b:Lcom/join/mgps/dto/GamedetialModleFourBean;

    iput-boolean p3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;->d:Lcom/join/mgps/activity/GameDetialModleFourActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;->b:Lcom/join/mgps/dto/GamedetialModleFourBean;

    iget-boolean v2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity_$r;->c:Z

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/GameDetialModleFourActivity_;->X1(Lcom/join/mgps/activity/GameDetialModleFourActivity_;Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V

    return-void
.end method
