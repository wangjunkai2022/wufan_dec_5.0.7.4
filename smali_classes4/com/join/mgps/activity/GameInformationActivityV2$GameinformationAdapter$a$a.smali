.class Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a$a;
.super Ljava/lang/Object;
.source "GameInformationActivityV2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;->intentCommentList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a$a;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a$a;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;->a:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->P0(Landroid/content/Context;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a$a;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;

    iget-object v1, v1, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter$a;->a:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    iget-object v1, v1, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;->a:Lcom/join/mgps/activity/GameInformationActivityV2;

    iget-object v1, v1, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;->b(Ljava/lang/String;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method
