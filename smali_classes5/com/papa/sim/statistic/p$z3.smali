.class Lcom/papa/sim/statistic/p$z3;
.super Ljava/lang/Object;
.source "StatFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa/sim/statistic/p;->h2(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;BB)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:B

.field final synthetic h:B

.field final synthetic i:Lcom/papa/sim/statistic/p;


# direct methods
.method constructor <init>(Lcom/papa/sim/statistic/p;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZBB)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa/sim/statistic/p$z3;->i:Lcom/papa/sim/statistic/p;

    iput p2, p0, Lcom/papa/sim/statistic/p$z3;->b:I

    iput-object p3, p0, Lcom/papa/sim/statistic/p$z3;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/papa/sim/statistic/p$z3;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/papa/sim/statistic/p$z3;->e:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/papa/sim/statistic/p$z3;->f:Z

    iput-byte p7, p0, Lcom/papa/sim/statistic/p$z3;->g:B

    iput-byte p8, p0, Lcom/papa/sim/statistic/p$z3;->h:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/papa/sim/statistic/p$z3;->i:Lcom/papa/sim/statistic/p;

    sget-object v1, Lcom/papa/sim/statistic/Event;->user_filters_refresh:Lcom/papa/sim/statistic/Event;

    invoke-static {v0, v1}, Lcom/papa/sim/statistic/p;->c(Lcom/papa/sim/statistic/p;Lcom/papa/sim/statistic/Event;)Lcom/papa/sim/statistic/StatDataCenterReq;

    move-result-object v0

    .line 2
    iget v1, p0, Lcom/papa/sim/statistic/p$z3;->b:I

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/StatDataCenterReq;->setPlug_id(I)V

    .line 3
    iget-object v1, p0, Lcom/papa/sim/statistic/p$z3;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/StatDataCenterReq;->setGame_type(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/papa/sim/statistic/p$z3;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/StatDataCenterReq;->setZone(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/papa/sim/statistic/p$z3;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/StatDataCenterReq;->setUid(Ljava/lang/String;)V

    .line 6
    iget-boolean v1, p0, Lcom/papa/sim/statistic/p$z3;->f:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/StatDataCenterReq;->setIs_visitors(I)V

    .line 7
    iget-byte v1, p0, Lcom/papa/sim/statistic/p$z3;->g:B

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/StatDataCenterReq;->setPapa_allow_spectators(I)V

    .line 8
    iget-byte v1, p0, Lcom/papa/sim/statistic/p$z3;->h:B

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/StatDataCenterReq;->setPapa_has_slot(I)V

    .line 9
    iget-object v1, p0, Lcom/papa/sim/statistic/p$z3;->i:Lcom/papa/sim/statistic/p;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->a(Lcom/papa/sim/statistic/p;)Lcom/papa/sim/statistic/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/papa/sim/statistic/o;->b0(Lcom/papa/sim/statistic/StatDataCenterReq;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
