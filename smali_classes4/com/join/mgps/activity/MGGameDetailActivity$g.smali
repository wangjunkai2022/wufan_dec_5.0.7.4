.class Lcom/join/mgps/activity/MGGameDetailActivity$g;
.super Ljava/lang/Object;
.source "MGGameDetailActivity.java"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGGameDetailActivity;->R0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MGGameDetailActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGGameDetailActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGGameDetailActivity$g;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$g;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    const/4 v1, 0x1

    iput v1, v0, Lcom/join/mgps/activity/MGGameDetailActivity;->d2:I

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->y0()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$g;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    const/4 v2, 0x0

    iput v2, v0, Lcom/join/mgps/activity/MGGameDetailActivity;->N1:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 4
    invoke-virtual {v0, v2}, Lcom/join/mgps/activity/MGGameDetailActivity;->E1(F)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$g;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/MGGameDetailActivity;->T1:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/join/mgps/activity/MGGameDetailActivity;->j2:Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/MGGameDetailActivity$g;->b:Lcom/join/mgps/activity/MGGameDetailActivity;

    iget-boolean v2, v0, Lcom/join/mgps/activity/MGGameDetailActivity;->f2:Z

    if-nez v2, :cond_0

    .line 7
    iput-boolean v1, v0, Lcom/join/mgps/activity/MGGameDetailActivity;->f2:Z

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/activity/MGGameDetailActivity;->g0()V

    :cond_0
    return-void
.end method
