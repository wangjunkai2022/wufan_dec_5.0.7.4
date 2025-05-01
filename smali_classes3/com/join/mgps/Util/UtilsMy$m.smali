.class Lcom/join/mgps/Util/UtilsMy$m;
.super Ljava/lang/Object;
.source "UtilsMy.java"

# interfaces
.implements Lcom/join/mgps/activity/arena/GameRoomActivity$x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/UtilsMy;->g1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$VolcanoOther;ZZILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Ljava/lang/String;

.field final synthetic i:Z

.field final synthetic j:Ljava/lang/String;

.field final synthetic k:I

.field final synthetic l:I

.field final synthetic m:Ljava/lang/String;

.field final synthetic n:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/UtilsMy$m;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->b:Ljava/lang/String;

    iput p3, p0, Lcom/join/mgps/Util/UtilsMy$m;->c:I

    iput p4, p0, Lcom/join/mgps/Util/UtilsMy$m;->d:I

    iput-object p5, p0, Lcom/join/mgps/Util/UtilsMy$m;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/join/mgps/Util/UtilsMy$m;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/join/mgps/Util/UtilsMy$m;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/join/mgps/Util/UtilsMy$m;->h:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/join/mgps/Util/UtilsMy$m;->i:Z

    iput-object p10, p0, Lcom/join/mgps/Util/UtilsMy$m;->j:Ljava/lang/String;

    iput p11, p0, Lcom/join/mgps/Util/UtilsMy$m;->k:I

    iput p12, p0, Lcom/join/mgps/Util/UtilsMy$m;->l:I

    iput-object p13, p0, Lcom/join/mgps/Util/UtilsMy$m;->m:Ljava/lang/String;

    iput-object p14, p0, Lcom/join/mgps/Util/UtilsMy$m;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(I)V
    .locals 0

    return-void
.end method

.method public onSuccess(II)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/Util/UtilsMy$m;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->b:Ljava/lang/String;

    const-string v0, "gameDownloadDetail"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->c:I

    const-string v0, "_from"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->d:I

    const-string v0, "_from_type"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->e:Ljava/lang/String;

    const-string v0, "recPosition"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->f:Ljava/lang/String;

    const-string v0, "remarks"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->g:Ljava/lang/String;

    const-string v0, "nodeId"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->h:Ljava/lang/String;

    const-string/jumbo v0, "volcanoOther"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-boolean p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->i:Z

    const-string v0, "fromRecomDown"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->j:Ljava/lang/String;

    const-string v1, "packagePath"

    invoke-virtual {p1, v1, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->k:I

    const-string v1, "downType"

    invoke-virtual {p1, v1, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->l:I

    const-string v1, "location"

    invoke-virtual {p1, v1, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->m:Ljava/lang/String;

    const-string v1, "ext"

    invoke-virtual {p1, v1, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-boolean p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->i:Z

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Z)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    iget-object p2, p0, Lcom/join/mgps/Util/UtilsMy$m;->n:Ljava/lang/String;

    const-string/jumbo v0, "where"

    invoke-virtual {p1, v0, p2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    return-void
.end method

.method public onSuccess(IILcom/papa91/arc/bean/ButtonBean;)V
    .locals 0

    return-void
.end method
