.class Lcom/join/mgps/activity/GameMainActivity3$d;
.super Lcom/join/mgps/ad/v;
.source "GameMainActivity3.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameMainActivity3;->R1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic l:Lcom/join/mgps/activity/GameMainActivity3;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity3;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3$d;->l:Lcom/join/mgps/activity/GameMainActivity3;

    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/v;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onInitSuccess()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/o;->onInitSuccess()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity3$d;->l:Lcom/join/mgps/activity/GameMainActivity3;

    iget v0, v0, Lcom/join/mgps/activity/GameMainActivity3;->t2:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x3fec000000000000L    # 0.875

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lcom/join/mgps/ad/v;->b(III)V

    return-void
.end method
