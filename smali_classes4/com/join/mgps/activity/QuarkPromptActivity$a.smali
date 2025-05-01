.class Lcom/join/mgps/activity/QuarkPromptActivity$a;
.super Ljava/lang/Object;
.source "QuarkPromptActivity.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/QuarkPromptActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/QuarkPromptActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget v1, p1, Lcom/join/mgps/activity/QuarkPromptActivity;->v:I

    sub-int/2addr v1, v0

    iput v1, p1, Lcom/join/mgps/activity/QuarkPromptActivity;->v:I

    if-gtz v1, :cond_0

    .line 3
    iget-object p1, p1, Lcom/join/mgps/activity/QuarkPromptActivity;->d:Landroid/widget/TextView;

    const-string v0, "00:00:00"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/join/mgps/activity/QuarkPromptActivity;->f0(Lcom/join/mgps/activity/QuarkPromptActivity;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$a;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/QuarkPromptActivity;->y:Landroid/os/Handler;

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
