.class Lcom/papa/sim/statistic/p$g2;
.super Ljava/lang/Object;
.source "StatFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa/sim/statistic/p;->H0(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:I

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:I

.field final synthetic i:I

.field final synthetic j:I

.field final synthetic k:Ljava/lang/String;

.field final synthetic l:Lcom/papa/sim/statistic/p;


# direct methods
.method constructor <init>(Lcom/papa/sim/statistic/p;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa/sim/statistic/p$g2;->l:Lcom/papa/sim/statistic/p;

    iput-object p2, p0, Lcom/papa/sim/statistic/p$g2;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/papa/sim/statistic/p$g2;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/papa/sim/statistic/p$g2;->d:J

    iput p6, p0, Lcom/papa/sim/statistic/p$g2;->e:I

    iput-object p7, p0, Lcom/papa/sim/statistic/p$g2;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/papa/sim/statistic/p$g2;->g:Ljava/lang/String;

    iput p9, p0, Lcom/papa/sim/statistic/p$g2;->h:I

    iput p10, p0, Lcom/papa/sim/statistic/p$g2;->i:I

    iput p11, p0, Lcom/papa/sim/statistic/p$g2;->j:I

    iput-object p12, p0, Lcom/papa/sim/statistic/p$g2;->k:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/papa/sim/statistic/p$g2;->l:Lcom/papa/sim/statistic/p;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->a(Lcom/papa/sim/statistic/p;)Lcom/papa/sim/statistic/o;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->gameDownloadCompleted:Lcom/papa/sim/statistic/Event;

    iget-object v4, v0, Lcom/papa/sim/statistic/p$g2;->b:Ljava/lang/String;

    iget-object v5, v0, Lcom/papa/sim/statistic/p$g2;->c:Ljava/lang/String;

    iget-wide v6, v0, Lcom/papa/sim/statistic/p$g2;->d:J

    iget v8, v0, Lcom/papa/sim/statistic/p$g2;->e:I

    iget-object v9, v0, Lcom/papa/sim/statistic/p$g2;->f:Ljava/lang/String;

    iget-object v10, v0, Lcom/papa/sim/statistic/p$g2;->g:Ljava/lang/String;

    iget v13, v0, Lcom/papa/sim/statistic/p$g2;->h:I

    iget v14, v0, Lcom/papa/sim/statistic/p$g2;->i:I

    iget v15, v0, Lcom/papa/sim/statistic/p$g2;->j:I

    iget-object v1, v0, Lcom/papa/sim/statistic/p$g2;->k:Ljava/lang/String;

    const-wide/16 v11, -0x1

    move-object/from16 v16, v1

    invoke-virtual/range {v2 .. v16}, Lcom/papa/sim/statistic/o;->N(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;JIIILjava/lang/String;)V

    return-void
.end method
