.class Lcom/join/mgps/activity/GameDetialModleFourActivity$t;
.super Ljava/lang/Object;
.source "GameDetialModleFourActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameDetialModleFourActivity;->q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameDetialModleFourActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$t;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$t;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$t;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/GameDetialModleFourActivity;->E1:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$t;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->p0()V

    return-void
.end method
