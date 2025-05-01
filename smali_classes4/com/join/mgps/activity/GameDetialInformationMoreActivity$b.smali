.class Lcom/join/mgps/activity/GameDetialInformationMoreActivity$b;
.super Ljava/lang/Object;
.source "GameDetialInformationMoreActivity.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameDetialInformationMoreActivity;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameDetialInformationMoreActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameDetialInformationMoreActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialInformationMoreActivity$b;->b:Lcom/join/mgps/activity/GameDetialInformationMoreActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialInformationMoreActivity$b;->b:Lcom/join/mgps/activity/GameDetialInformationMoreActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/GameDetialInformationMoreActivity;->f0(Lcom/join/mgps/activity/GameDetialInformationMoreActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialInformationMoreActivity$b;->b:Lcom/join/mgps/activity/GameDetialInformationMoreActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/activity/GameDetialInformationMoreActivity;->g0(Lcom/join/mgps/activity/GameDetialInformationMoreActivity;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialInformationMoreActivity$b;->b:Lcom/join/mgps/activity/GameDetialInformationMoreActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameDetialInformationMoreActivity;->l0()V

    return-void
.end method
