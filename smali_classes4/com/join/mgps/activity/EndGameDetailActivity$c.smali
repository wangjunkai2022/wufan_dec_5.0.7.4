.class Lcom/join/mgps/activity/EndGameDetailActivity$c;
.super Ljava/lang/Object;
.source "EndGameDetailActivity.java"

# interfaces
.implements Lcom/join/mgps/dialog/m0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameDetailActivity;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/EndGameDetailActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameDetailActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity$c;->a:Lcom/join/mgps/activity/EndGameDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public report()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity$c;->a:Lcom/join/mgps/activity/EndGameDetailActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameReportActivity_;->q0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameReportActivity_$h;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity$c;->a:Lcom/join/mgps/activity/EndGameDetailActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/EndGameDetailActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameReportActivity_$h;->a(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameReportActivity_$h;

    move-result-object v0

    const/high16 v1, 0x30000000

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/builder/e;->flags(I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/EndGameReportActivity_$h;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method
