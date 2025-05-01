.class Lcom/join/mgps/activity/GameDetialModleFourActivity$c;
.super Ljava/lang/Object;
.source "GameDetialModleFourActivity.java"

# interfaces
.implements Lw1/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameDetialModleFourActivity;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/GameDetialModleFourActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$c;->a:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$c;->a:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V:Lw1/i;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lw1/i;->U()V

    :cond_0
    return-void
.end method
