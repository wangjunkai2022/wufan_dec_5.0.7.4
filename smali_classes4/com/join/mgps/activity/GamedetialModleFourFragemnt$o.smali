.class Lcom/join/mgps/activity/GamedetialModleFourFragemnt$o;
.super Ljava/lang/Object;
.source "GamedetialModleFourFragemnt.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$o;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$o;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->D1:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->u2:Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lcom/join/mgps/Util/o;->f(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$o;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    const-string v0, "\u4e0d\u80fd\u4e0a\u4f20\u8868\u60c5"

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->showToast(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$o;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->v1:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$o;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    iget-boolean v0, p1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->P1:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->P1:Z

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->V()V

    :cond_1
    :goto_0
    return-void
.end method
